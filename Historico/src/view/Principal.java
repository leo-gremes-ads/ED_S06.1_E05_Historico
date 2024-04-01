package view;

import lib.model.PilhaString;
import java.util.Scanner;
import controller.HistoricoController;

public class Principal
{
	public static void main(String args[])
	{
		PilhaString historico = new PilhaString();
		HistoricoController hc = new HistoricoController();
		int opt;

		while (true) {
			opt = menu();
			if (opt == 1)
				hc.inserirEndereco(historico);
			else if (opt == 2)
				hc.removerEndereco(historico);
			else if (opt == 3)
				hc.consultarEndereço(historico);
			else if (opt == 9)
				break;
			else
				System.out.println("Opção Inválida!");
		}
		System.out.println("Aplicação encerrada!");
	}

	public static int menu()
	{
		Scanner s = new Scanner(System.in);
		String num;
		int opt;

		System.out.println(
		"Digite a opção desejada:\n" +
		"1 - Inserir endereço\n" +
		"2 - Remover endereço\n" + 
		"3 - Consultar último endereço\n" +
		"9 - sair");
		num = s.nextLine();
		try {
			opt = Integer.parseInt(num);
		} catch (Exception e) {
			return 4;
		}
		return opt;
	}
}
