import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primerio parâmetro:");
        int parametro1 = input.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametro2 = input.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmtro deve ser maior do que o primeiro");
        }

        input.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        } else {
            for (int contador = numero1; contador <= numero2; contador++) {
                System.out.println("Imprimindo o número " + contador);
            }
        }
    }
}