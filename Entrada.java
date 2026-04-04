import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        try{
            int num;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número");
            num = scanner.nextInt();

        }catch (Exception e) {
        System.out.println("Entrada inválida!");
        }
    }

}
