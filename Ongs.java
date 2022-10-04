
public class Ongs {
    import java.util.Scanner;
    public static void CadastroOng(){
        Scanner scan = new Scanner(System.in);
        String NomeInstituicao, DataCriacao, cnpj, sobreOng, email;    
        System.out.println("Olá! Vamos iniciar o cadadstro da OnG!");
        System.out.println("Digite o nome da instituição:");
        NomeInstituicao = scan.nextLine();
        System.out.println("Digite o CNPJ da instituição:");
        cnpj = scan.nextLine();
        System.out.println("Digite a data de criação da instituição:");
        DataCriacao = scan.nextLine();
        System.out.println("Digite o Email:");
        email = scan.nextLine();
        System.out.println("Fale um poco sobre a instituicao:");
        sobreOng = scan.nextLine();
    }
    public static void EnderecoONg(){
        String EstadoOng, cidadeOng, bairroOng, numeroOng;x
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
