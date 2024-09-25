package tecnica1;
import java.util.Scanner;
public class Tecnica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declarando o Scanner para receber a entrada.
        System.out.println("Digite um numero para checar se pertence a sequencia de Fibonacci: "); // Pedindo para digitar o numero.
        int numero = scanner.nextInt(); // Recebendo a entrada do  numero e guardando na variavel.
        boolean teste = false; // Criando a variavel para apontar se está ou não na sequencia de Fibonacci.
        
        int num1 = 0; // Criando a primeira variavel para a sequencia de Fibonacci.
        int num2 = 1; // Criando a segunda variavel para a sequencia de Fibonacci.
        int num3 = 0; // Criando a terceira variavel para a sequencia de Fibonacci.
        do{
            num3 = num1+num2; // Somando os numeros anteriores para dar o sucessor.
            num1 = num2; // Faz com que o primeiro numero receba o anterior do sucessor.
            num2 = num3; // Faz com que o segundo numero receba a terceira variavel para preparar a próxima soma da sequencia
            if(num3==numero){
                teste = true; // Testa se o numero está na sequencia de Fibonacci.
            }
        }while(num2<=numero); // Verifica se o loop já passou pelo número.
        if(teste){
            System.out.println("O numero pertence a sequencia de Fibonacci."); //Informa se o numero está na tabela de Fibonacci
        }else{
            System.out.println("Esse numero nao pertencia a sequencia de Fibonacci"); // Informa se o numero não está na tabela de Fibonacci
        }
    }
    
}
