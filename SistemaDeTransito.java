class VelocidadeExcedidaException extends RuntimeException{
    public VelocidadeExcedidaException(String mensagem){
        super(mensagem);
    }
}

class Carro {
    int velocidadeAtual = 0;

    void acelerar(int incremento){
        int novaVelocidade = this.velocidadeAtual + incremento;
        if (novaVelocidade > 120) {
            throw new VelocidadeExcedidaException("Multa Magnética! Você atingiu " 
                    + novaVelocidade + " km/h. O limite é 120 km/h.");
        }
        this.velocidadeAtual = novaVelocidade;
        System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h");
    }
}


public class SistemaDeTransito {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar(100);//1º acelerar

        try{
            carro.acelerar(30);//2º acelerou
        }catch (VelocidadeExcedidaException e){
            System.out.println("Limite ultrapassado!");
        }
    }

    
}
