//Erro unchecked: precisamos de try catch para usá-lo
class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);//repassa a mensagem de erro para a classe mãe do Java guardar.
    }
}

class ContaBancaria {
    double saldo = 500.0;

    // Não somos obrigados a colocar "throws SaldoInsuficienteException" 
    // na assinatura do método porque ela é uma RuntimeException
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Você tentou sacar R$" + valor + ", mas só tem R$" + saldo);
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo restante: R$" + saldo);
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        try {
            conta.sacar(600.0); // Vai forçar o erro
        } catch (SaldoInsuficienteException e) {
            System.out.println("Operação Negada: " + e.getMessage());
        }
    }
    
}
