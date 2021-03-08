package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selec;

        System.out.println("Bienvenido a la ruleta de la suerte");
        System.out.println("Veamos cuanta suerte tiene hoy");
        System.out.println("Presione enter para averiguarlo");
        in.nextLine();
        do{
            Listadepremios();

            System.out.println("Quiere volver a intentar");
            System.out.println("1. Si");
            System.out.println("2. No.");
            selec = Integer.parseInt(in.nextLine());
        }while (selec == 1);



    }

    public static void Listadepremios() {
        String premios[];
        double numeroaleatorio;
        premios = new String[5];

        premios[0] = "Nada que mala suerte";
        premios[1] = "Una Coca cola";
        premios[2] = "10 Quetzales";
        premios[3] = "Un peluche";
        premios[4] = "Un almuerzo";

        numeroaleatorio = Math.floor(Math.random() * 5);
        if (numeroaleatorio == 0) {
            System.out.println("Su premio es: " + premios[0]);
        }else if(numeroaleatorio == 1){
            System.out.println("Su premio es: " + premios [1]);
        }else if(numeroaleatorio == 2){
            System.out.println("Su premio es: " + premios [2]);
        }else if(numeroaleatorio == 3){
            System.out.println("Su premio es: " + premios [3]);
        }else {
            System.out.println("Su premio es: " + premios [4]);
        }
    }
}
