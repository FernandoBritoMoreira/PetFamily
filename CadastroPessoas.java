public class CadastroPessoas {
    import java.util.Scanner;
    
    public static void Cadastro() {
        Scanner scan = new Scanner(System.in);
        int n;
        String Nome, Email, Celular;
        System.out.println("Olá! Vamos iniciar o seu cadastro!");
        System.out.println("Digite Seu Nome");
        Nome = scan.nextLine();
        System.out.println("Digite Seu Email");
        Email = scan.nextLine();
        System.out.println("Digite Seu Celular");
        Celular = scan.nextLine();
        }
        public static void EnderecoPessoa(){
        String Estado, cidade, bairro, numero;x
        System.out.println("Agora cadastre o seu endereço!");
        System.out.println("Digite o Estado:");
        estado = scan.nextLine();
        System.out.println("Digite a Cidade:");
        cidade = scan.nextLine();
        System.out.println("Digite o Bairro:");
        bairro = scan.nextLine();
        System.out.println("Digite o Numero:");
        numero = scan.nextLine();
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



