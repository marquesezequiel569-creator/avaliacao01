package atividade1;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.println("\n===== RESULTADO DA CONVERSÃO =====");
        System.out.println("Temperatura original: " + celsius + " °C");
        System.out.println("Convertida para Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Convertida para Kelvin: " + kelvin + " K");
        System.out.println("==================================");

        entrada.close();
    }
}
