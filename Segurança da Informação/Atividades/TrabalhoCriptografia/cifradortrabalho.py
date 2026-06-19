#Grupo:
#Ruimar
#Caio
#Lucas Miranda
#João Cabrera

import sys

Alfabeto_Minusculo = "abcdefghijklmnopqrstuvwxyz"
Alfabeto_Maisculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def carregar_arquivo(nome_arquivo):
    try:
        with open(nome_arquivo, 'r', encoding='utf-8') as arquivo:
            return arquivo.read()
    except FileNotFoundError:
        print("Arquivo não encontrado.")
        return None 

def salvar_arquivo(nome_arquivo, conteudo):
    with open(nome_arquivo, 'w', encoding='utf-8') as arquivo:
        arquivo.write(conteudo)

def inverter_texto(mensagem):
    return mensagem[::-1]

def deslocamento_texto(mensagem, fator):
    resultado = ""

    for caractere in mensagem:
        if caractere in Alfabeto_Minusculo:
            indice = Alfabeto_Minusculo.index(caractere)
            novo_indice = (indice + fator) % len(Alfabeto_Minusculo)
            resultado += Alfabeto_Minusculo[novo_indice]
        elif caractere in Alfabeto_Maisculo:
            indice = Alfabeto_Maisculo.index(caractere)
            novo_indice = (indice + fator) % len(Alfabeto_Maisculo)
            resultado += Alfabeto_Maisculo[novo_indice]
        else:
            resultado += caractere

    return resultado

def carregar_alfabeto(nome_arquivo):
    try:
        with open(nome_arquivo, 'r', encoding='utf-8') as arquivo:
            linhas = arquivo.readlines()
            return linhas[0].strip(), linhas[1].strip()
    except:
        print("Erro ao carregar o alfabeto de substituição.")
        return None, None

def substituicao_texto(mensagem, alfabeto_sub_min, alfabeto_sub_mai):
    resultado = ""

    for caractere in mensagem:
        if caractere in Alfabeto_Minusculo:
            indice = Alfabeto_Minusculo.index(caractere)
            resultado += alfabeto_sub_min[indice]
        elif caractere in Alfabeto_Maisculo:
            indice = Alfabeto_Maisculo.index(caractere)
            resultado += alfabeto_sub_mai[indice]
        else:
            resultado += caractere

    return resultado

def menu():
    print("\nEscolha o método de cifragem:")
    print("1) Inversão da mensagem")
    print("2) Deslocamento das letras")
    print("3) Substituição")
    print("4) Sair")
    return input("Digite a opção desejada: ")

def main():
    print("Seja bem-vindo ao cifrador criptográfico!")

    if len(sys.argv) > 1:
        nome_arquivo = sys.argv[1]
    else:
        nome_arquivo = input("Insira o nome do arquivo que contém a mensagem seguido da extensão: ")

    mensagem = carregar_arquivo(nome_arquivo)

    if mensagem is None:
        return

    print("\nMensagem original:")
    print(mensagem)

    while True:
        opcao = menu()

        if opcao == "1":
            resultado = inverter_texto(mensagem)
            novo_nome = nome_arquivo.replace(".txt", "_inversao.txt")

        elif opcao == "2":
            fator = int(input("Digite o fator de deslocamento: "))
            resultado = deslocamento_texto(mensagem, fator)
            novo_nome = nome_arquivo.replace(".txt", "_deslocamento.txt")

        elif opcao == "3":
            nome_alfabeto = input("Digite o nome do arquivo de substituição (ex: alfabeto1.txt): ")
            alfabeto_sub_min, alfabeto_sub_mai = carregar_alfabeto(nome_alfabeto)

            if alfabeto_sub_min and alfabeto_sub_mai:
                resultado = substituicao_texto(mensagem, alfabeto_sub_min, alfabeto_sub_mai)
                novo_nome = nome_arquivo.replace(".txt", "_substituicao.txt")
            else:
                continue

        elif opcao == "4":
            print("Obrigado por utilizar o cifrador criptográfico!")
            break

        else:
            print("Opção inválida.")
            continue

        print("\nMensagem criptografada:")
        print(resultado)

        salvar_arquivo(novo_nome, resultado)
        print(f"Arquivo criptografado {novo_nome} salvo com sucesso.")

if __name__ == "__main__":
    main()