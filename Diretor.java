import java.util.Scanner;
public class Diretor extends Funcionario {
    
    int i;
    Scanner leitor = new Scanner(System.in);
    
    
    public void Comfirmar_Dir(){
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite sua senha de acesso: ");
int senha;
senha = leitor.nextInt();
while(senha!=123456){
    System.out.println("Acesso negado!");
    System.out.println("Digite sua senha novamente: ");
    senha = leitor.nextInt();
    }
    
        
    }
}

