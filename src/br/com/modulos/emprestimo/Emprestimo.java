package br.com.modulos.emprestimo;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double taxa= 0.45;

        int parcela;
        double valor;
        System.out.println("Digite o valor do Empréstimo: ");
        valor = scan.nextInt();
        System.out.println("Digite o valor de parcelas: ");
        parcela = scan.nextInt();
        valorEmprestimo(valor, parcela, taxa);

    }
    public static void valorEmprestimo(double valor, int parcela, double taxa){
        if (parcela== 2){
            double valorFinal= valor+(valor*taxa);
            System.out.println("O calor do  empréstimo é: "+ valorFinal);
        }

    }
}
