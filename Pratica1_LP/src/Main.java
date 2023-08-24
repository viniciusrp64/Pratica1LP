import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o ano de fabricação do carro: ");
        int ano = scanner.nextInt();

        if (ano < 2010) {
            System.out.println("Carro Velho");
        } else if (ano >= 2011 && ano <= 2021) {
            System.out.println("Carro Semi novo");
        } else if (ano == 2022) {
            System.out.println("Carro Novo");
        }

        String placaCensurada = placa.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Placa censurada: " + placaCensurada);
    }
}
