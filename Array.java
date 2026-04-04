import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um índice (0 a 4): ");
            int indice = sc.nextInt();

            System.out.println("Valor: " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido!");

        } catch (Exception e) {
            System.out.println("Entrada inválida!");

        } finally {
            sc.close();
        }
    }
}