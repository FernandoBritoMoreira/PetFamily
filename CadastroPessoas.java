import java.util.Scanner;
public class CadastroPessoas {
    public static void Cadastro() {
        int n;
        String Nome, Email, Celular;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite Seu Nome");
        Nome = scan.nextLine();
        System.out.println("Digite Seu Email");
        Email = scan.nextLine();
        System.out.println("Digite Seu Celular");
        Celular = scan.nextLine();
        System.out.println("Deseja concluir o cadastro?");
        System.out.println("Digite 1 para concluir e 2 para cancelar");
        n = scan.nextInt();
        if(n==1){
            System.out.println("Cadastro concluido");
            scan.nextLine();
            System.out.println("Seu Nome: " + Nome + "\n" + "Seu Email: " + Email + "\n" + "Seu Numero: " + Celular);
        }else if(n==2){
            System.out.println("Cadastro não concluido");
            scan.nextLine();
        }else{
            System.out.println("Opção inválida");
            scan.nextLine();
        }
        
    }

} 

