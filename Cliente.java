import java.util.Scanner;
public class Cliente {
  String nome;
    int Idade;
    public void Cadastrar(){
    ;
    
Scanner leitor = new Scanner(System.in);
    System.out.println("Bem vindo! Qual seu nome?"); // Comando de saída (monitor)
    leitor = new Scanner(System.in); //Reiniciar o Scanner
    nome = leitor.nextLine(); //solicitar informação (nome/String)

  //Perguntar idade
  System.out.println("E quantos anos você tem?");
    leitor = new Scanner(System.in);
    Idade = leitor.nextInt(); //Solicitar informação (Idade/int)

 
}
}