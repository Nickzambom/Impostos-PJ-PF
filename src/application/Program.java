package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax players: ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c)? ");
			char op = ler.next().charAt(0);
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = ler.nextDouble();
			if (op == 'i' || op == 'I') {
				System.out.print("Health expenditures: ");
				Double saude = ler.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, saude));
			}
			if (op == 'c' || op == 'C') {
				System.out.print("Number of employees: ");
				double numeroFunc = ler.nextDouble();
				list.add(new PessoaJuridica(name, rendaAnual, numeroFunc));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : list) {
			double tax = pessoa.imposto();
			System.out.println(pessoa.getName() + " : $ " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.println("TOTAL TAX: " + String.format("%.2f", sum));
		ler.close();
	}

}
