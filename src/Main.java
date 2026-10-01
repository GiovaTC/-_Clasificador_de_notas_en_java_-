import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;
        String continuar;

        do {

            System.out.println("=================================");
            System.out.println("     CLASIFICADOR DE NOTAS");
            System.out.println("=================================");

            System.out.print("INGRESE una NOTA de 0 A 100: ");
            nota = scanner.nextInt();

            // CONDICIONAL 1.
            if ( nota >= 90)
            {
                System.out.println("RESULTADO: EXCELENTE");

            // CONDICIONAL 2.
            } else if (nota >= 70)
            {
                System.out.println("RESULTADO: APROBADO");

            // CONDICIONAL 3.
            } else
            {
                System.out.println("RESULTADO. REPROBADO");
            }

            System.out.print("\n¿Desea ingresar otra nota? (S/N): ");
            continuar = scanner.next();

            System.out.println();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("PROGRAMA FINALIZADO!! ");

        scanner.close();
    }   
}