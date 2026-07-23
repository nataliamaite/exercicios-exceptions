public class MultiCalculador {
    public static void main(String[] args) {
        String texto = "0";

        try {
            int numero = Integer.parseInt(texto);

            int resultado = 100 / numero;

            System.out.println("Resultado: " + resultado);

        }catch(NumberFormatException e1){
            System.out.println("Erro de conversão");
        }catch(ArithmeticException e2){
            System.out.println("Número é igual a 0");
        }
    }
    
}
