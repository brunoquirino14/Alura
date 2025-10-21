package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor Celsius -> Fahrenheit");

        int Celsius=0;
        int Fahrenheit=0;

        System.out.print("Entre com o valor em graus Celsius: ");
        Celsius = sc.nextInt();
        sc.nextLine();
        Fahrenheit = (int) ((Celsius*1.8)+32);
        System.out.println("Temperatura em Fahrenheit: "+Fahrenheit);


    }
}