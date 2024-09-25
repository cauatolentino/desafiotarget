package tecnica2;

import java.util.Scanner;

public class Tecnica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declarando o scanner para receber a entrada.
        System.out.println("Digita uma palavra: "); // Pedindo para digitar a palavra.
        String palavra = scanner.next(); // Variavel recebendo a palavra digitada.
        int count = 0;// Variavel que vai contar quantos 'A' a palavra tem.
        
        for(int i = 0; i<palavra.length(); i++){ // Loop para verificar e adicionar a contagem de 'A'
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A'){
                count++;
            }
        }
        if(count == 1){ // if para mostrar se tem ou não a letra 'a' e ver se não possui erro de portugues ex: 2 letra a ou 1 letras a
            System.out.println("Essa palavra possui " + count + " letra a");
        }else if(count>1){
            System.out.println("Essa palavra possui " + count + " letras a");
        }else{
            System.out.println("Essa palavra nao possui a letra 'A'");
        }
    }
}
