
import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;
class Principal {


   
         
            
public static void main(String args[]){
    boolean confirm = false;
    int i;
    int x = 0;
ArrayList<String> Gerentes = new <String>ArrayList();
Scanner leitor = new Scanner(System.in); //Definindo teclado
    while(x!=4){
        System.out.println("\nOlá, bem vindo ao sistema! Antes de tudo precisamos te identificar. Qual seu cargo na empresa?\n");
        System.out.println("1) Cliente");
        System.out.println("2) Diretor");
        System.out.println("3) Funcionário");
        System.out.println("4) Sair");
        x = 0;
i = leitor.nextInt();
        if(i == 1){
            Cliente cliente_1 = new Cliente();
            cliente_1.Cadastrar();
       
        }else if(i == 2){ 
    int dire = 0;
    Diretor dir = new Diretor();
    
                dir.Comfirmar_Dir();
                
                System.out.println("\nBem vindo Sr.Rafael!");
                while(dire!=3){
                    System.out.println("Oque o senhor deseja?\n");
    System.out.println("1) Adicionar gerente");
    System.out.println("2) Exibir lista de gerentes");
    System.out.println("3) Sair");
    dire = leitor.nextInt();
    if(dire == 1){
        
       
        Gerente ger = new Gerente();
    System.out.println("\nQual o nome do novo gerente? ");
    leitor = new Scanner(System.in);
        ger.nome = leitor.nextLine();
        
    System.out.println("\nCrie uma senha para esse gerente: ");
        ger.senha = leitor.nextInt();
        Gerentes.add(ger.nome);
            }else if(dire==2){ 
                System.out.println("\n------------------------------");
                System.out.println(Gerentes);
                System.out.println("------------------------------\n");
        }
        }   
    }   
            
            else if(i==3){
                int fun;
                System.out.println("\nInforme seu cargo: \n");
            System.out.println("1) Gerente");
            System.out.println("2) Pião");
            fun = leitor.nextInt();
            if(fun == 1){
                Gerente ger = new Gerente();
                System.out.println("Bem vindo! Qual seu nome?"); // Comando de saída (monitor)
               while(confirm==false){ leitor = new Scanner(System.in); //Reiniciar o Scanner
              String nomedig = leitor.nextLine(); //solicitar informação (nome/String)

                for(String nome : Gerentes){  //Para buscar dado no Arraylist
                    if(nome.equals(nomedig)){ //Para comparar dados
                    confirm = true;
                    }
                }
                if(confirm!=true){System.out.println("Acesso negado! Usuário não cadastrado, socilite ao diretor para cadastralo outente novamente: ");
                 }
               }
              System.out.println("Digite sua senha de acesso: ");
              int senhadig = leitor.nextInt();
              
        while(senhadig != ger.senha){
            System.out.println("Acesso negado!");
            System.out.println("Digite sua senha novamente: "); 
            senhadig = leitor.nextInt();
        }
           System.out.println("\nBem vindo Sr."+ger.nome+", oque o senhor deseja?\n");
           System.out.println("1) Adicionar Pião");
           System.out.println("2) Sair");
            }
                
    }else if(i==4){System.out.println("\nTem certeza que deseja sair?\n");
    System.out.println("1) Sair");
    System.out.println("2) Cancelar");
    i= leitor.nextInt();
}if(i == 1){
    System.exit(0);
    }else if(x==0){

    }


}


}        
}  
        
        



