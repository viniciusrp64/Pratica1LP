import java.util.Scanner;

public class CalculadoraDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidade = scanner.nextDouble();

        System.out.print("Digite o valor de km por litro do veículo: ");
        double kmPorLitro = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double combustivelGasto = distancia / kmPorLitro;

        System.out.printf("O consumo de combustível foi de %.2f litros.", combustivelGasto);
    }
}
