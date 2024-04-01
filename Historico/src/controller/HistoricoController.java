package controller;

import lib.model.PilhaString;
import java.util.Scanner;
import java.net.URL;

public class HistoricoController
{
	public HistoricoController()
	{
		super();
	}

	public void inserirEndereco(PilhaString ps)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o endereço a ser inserido: ");
		String endereco = sc.nextLine();
		if (validarEndereco(endereco))	
			ps.push(endereco);
		else
			System.out.println("Endereço inválido!");
	}

	public String removerEndereco(PilhaString ps)
	{
		try {
			return ps.pop();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "";
	}

	public String consultarEndereço(PilhaString ps)
	{
		try {
			System.out.println("Último Endereço Visitado: " + ps.top());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "";
	}

	@SuppressWarnings("deprecation")
	public boolean validarEndereco(String endereco)
	{
		try {
			new URL(endereco).toURI();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}