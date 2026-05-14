package io;

import javax.swing.JOptionPane;

public class TesteIOComJOptionPane {
	public static void main(String[] args) {
		String name = "";
		name = JOptionPane.showInputDialog("Insira o seu nome:");
		String msg = "Olá "+name+"!";
		JOptionPane.showMessageDialog(null, msg);
	}

}
