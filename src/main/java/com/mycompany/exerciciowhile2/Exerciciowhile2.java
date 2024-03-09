package com.mycompany.exerciciowhile2;

import java.util.Scanner;

public class Exerciciowhile2 {

public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);

System.out.println("Digite sua senha:");
int x = teclado.nextInt();
     
while (x != 2002){
             System.out.println("Senha inválida");

x = teclado.nextInt();
    }
System.out.println("Acesso Permitido"); 


}
}