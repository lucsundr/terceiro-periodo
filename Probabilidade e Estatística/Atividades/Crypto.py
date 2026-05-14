import hashlib
import uuid
import sqlite3
import re
from getpass import getpass

def criar_tabela(conexao):
    conexao.execute('''
        CREATE TABLE IF NOT EXISTS USUARIOS (
            NOME TEXT PRIMARY KEY,
            SENHA TEXT NOT NULL,
            SALT TEXT NOT NULL
        )
    ''')
    conexao.commit()

def validar_email(email):
    padrao = r'^[\w\.-]+@[\w\.-]+\.\w+$'
    return re.match(padrao, email) is not None

def validar_senha(senha):
    if len(senha) < 8:
        return False
    if not re.search(r'[A-Z]', senha):
        return False
    if not re.search(r'[a-z]', senha):
        return False
    if not re.search(r'\d', senha):
        return False
    if not re.search(r'[!@#$%^&*(),.?":{}|<>-_]', senha):
        return False
    return True

def buscar_hash(conexao, usuario):
    hash_senha = return_hash_senha(conexao, usuario)

    if hash_senha:
        print(f"Hash da senha: {hash_senha}")
    else:
        print("Usuário não encontrado!")

def insere_usuario(conexao, usuario, senha):
    try:
        salt = uuid.uuid4().hex
        hash_senha = hashlib.sha512((senha + salt).encode('utf-8')).hexdigest()

        conexao.execute(
            'INSERT INTO USUARIOS (NOME, SENHA, SALT) VALUES (?, ?, ?)',
            (usuario, hash_senha, salt)
        )
        conexao.commit()
        print("Cadastro realizado com sucesso!")
    except sqlite3.IntegrityError:
        print("Esse e-mail já está cadastrado!")

def return_hash_senha(conexao, usuario):
    cursor = conexao.execute(
        'SELECT SENHA FROM USUARIOS WHERE NOME = ?', (usuario,)
    )
    dados = cursor.fetchone()
    return dados[0] if dados else None


def return_salt(conexao, usuario):
    cursor = conexao.execute(
        'SELECT SALT FROM USUARIOS WHERE NOME = ?', (usuario,)
    )
    dados = cursor.fetchone()
    return dados[0] if dados else None

def check_senha(conexao, usuario, senha):
    hash_senha = return_hash_senha(conexao, usuario)
    salt = return_salt(conexao, usuario)

    if not hash_senha or not salt:
        return False

    senha_digitada = hashlib.sha512((senha + salt).encode('utf-8')).hexdigest()
    return hash_senha == senha_digitada

def menu():
    print("\n=== SISTEMA DE LOGIN ===")
    print("[0] Cadastro")
    print("[1] Login")
    print("[2] Buscar hash da senha")
    print("[3] Sair")

if __name__ == '__main__':
    conexao = sqlite3.connect('sqlite.db')
    criar_tabela(conexao)

    while True:
        menu()
        option = input("Escolha uma opção: ")

        if option == '0':
            while True:
                usuario = input("E-mail: ")

                if not validar_email(usuario):
                    print("E-mail inválido!")
                    continue

                senha = getpass("Senha: ")

                if not validar_senha(senha):
                    print("Senha inválida!")
                    print("- Mínimo 8 caracteres")
                    print("- Letra maiúscula")
                    print("- Letra minúscula")
                    print("- Número")
                    print("- Caractere especial")
                    continue

                insere_usuario(conexao, usuario, senha)
                break

        elif option == '1':
            usuario = input("E-mail: ")
            senha = getpass("Senha: ")

            if check_senha(conexao, usuario, senha):
                print("Login realizado com sucesso!")
            else:
                print("Credenciais incorretas!")
               
        elif option == '2':
            usuario = input("Digite o e-mail: ")
            buscar_hash(conexao, usuario)

        elif option == '3':
            print("Saindo do sistema...")
            break

        else:
            print("Opção inválida!")

            conexao.close()