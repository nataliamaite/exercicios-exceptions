class LimiteProdutoExcedidoException extends RuntimeException{
    public LimiteProdutoExcedidoException(String mensagem){
        super(mensagem);
    }
}

class Carrinho {
    int quantidadeItens = 0;

    void adicionarItens(int quantidade){
        
        if(quantidadeItens > 5){
            throw new LimiteProdutoExcedidoException("Limite excedido! Quantidade: " + quantidadeItens);
        }
        this.quantidadeItens += quantidade;
        System.out.println("Quantidade: " + quantidadeItens);
    }

}

public class RegradeVenda {
public static void main(String[] args) {
    Carrinho carrinho = new Carrinho();

    carrinho.quantidadeItens = 3;

    try{
           carrinho.adicionarItens(4);
        }catch (LimiteProdutoExcedidoException e){
            System.out.println("Limite ultrapassado!");
        }
}
    
}
