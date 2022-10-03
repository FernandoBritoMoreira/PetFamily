import java.util.Scanner;
public class Ongs {
    public static void CadastroOng(){
        String nomeInstituicao, dataCriacao, cnpj, sobreOng;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da instituição:");
        nomeInstituicao = scan.nextLine();
        System.out.println("Digite o CNPJ da instituição:");
        cnpj = scan.nextLine();
        System.out.println("Digite a data de criação da instituição:");
        dataCriacao = scan.nextLine();
        System.out.println("Fale um poco sobre a instituicao:");
        sobreOng = scan.nextLine();
    }
    public static void Endereco(){
        String estado, cidade, bairro, numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Estado:");
        estado = scan.nextLine();
        System.out.println("Digite a Cidade:");
        cidade = scan.nextLine();
        System.out.println("Digite o Bairro:");
        bairro = scan.nextLine();
        System.out.println("Digite o Numero:");
        numero = scan.nextLine();

    }
}
