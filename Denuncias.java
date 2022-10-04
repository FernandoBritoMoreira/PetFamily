public class Denuncias {
    import java.util.Scanner;
    public static void SobreDenuncias() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Existem várias condutas que podem caracterizar os crimes, tais como o abandono, ferir, mutilar, envenenar, manter em locais pequenos sem possibilidade de circulação e sem higiene, não abrigar do sol, chuva ou frio, não alimentar, não dar água, negar assistência veterinária se preciso, dentre outros.");

    }
    public void TipoDenuncias() {
        Scanner scan = new Scanner(System.in);
        string Digitar, estadoDenuncia,CidadeDenuncia;
        int n;
        System.out.println("Digite Seu Estado:");
        estadoDenuncia = scan.nextLine();
        System.out.println("Digite sua Cidade:");
        CidadeDenuncia = scan.nextLine();
        System.out.println("Deseja Denciar Por:");
        System.out.println("Digite 1 Telefone | 2 Email | 3 Denuncie Aqui?");
        n = scan.nextLine();
        if(n==1){
            System.out.println("Telefone: 0800-600-6428");
        }else(n==2){
            System.out.println("Email: linhaverde.sede@ibama.gov.br. ");
        }else(n==3){
            System.out.println("Digite a sua Denuncia:");
            Digitar = scan.nextLine();
        }else{
            System.out.println("Opção inválida");
        
        }
    }
}
