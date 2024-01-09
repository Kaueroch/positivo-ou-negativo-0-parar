import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n1;
            do {
                System.out.println("Digite um numero e 0 se quiser parar ");
                 n1 = sc.nextInt();
                if(n1 < -1 ){
                    System.out.println("O numero é negativo!");
                }else if (n1 >= 0 ){
                    System.out.println("O numero é positivo!");
                }
        }while( n1 != 0);


    }
}

/*******************************************************************************
 * 21) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
 * indicando se este número é positivo ou negativo. Pare a execução do programa
 * quando o usuário requisitar.
 *******************************************************************************/