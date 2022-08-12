package br.com.modulos.saudacao;


import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int hora;

        System.out.println("Que Horas são? ");
        hora= scan.nextInt();
        saudacao(hora);

    }
    public static void saudacao(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                bomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                boaTarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                boaNoite();
                break;
            default:
                System.out.println("Hora Inválida!");
                break;
        }
    }
    public static void bomDia(){
        System.out.println("Bom dia!");
    }
    public static void boaTarde(){
        System.out.println("Boa Tarde!");
    }
    public static void boaNoite(){
        System.out.println("Boa Noite!");
    }
}
