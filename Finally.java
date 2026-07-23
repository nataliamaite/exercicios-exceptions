public class Finally {
    public static void main(String[] args) {
        try {
            int divisao = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Divisão por 0");
        }finally{//sempre será executado, dando erro ou não
            System.out.println("Sistema de cálculos finalizado.");
        }
    }
    
}
