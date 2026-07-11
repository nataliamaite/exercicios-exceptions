class SenhaFracaException extends RuntimeException {
    public SenhaFracaException(String mensagem) {
        super(mensagem);
    }
}

class Usuario{
    void cadastrarSenha(String senha){
        if(senha.length() < 8){
            throw new SenhaFracaException("A senha fornecida é muito curta. Use pelo menos 8 caracteres.");
        }
        System.out.println("Senha salva com sucesso!");
    }
}

public class SistemaDeLogin {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();//Criação do objeto

        //Operação
        try{
            usuario.cadastrarSenha("12345");//Vai dar erro
        }catch (SenhaFracaException e){
            System.out.println("Senha inválida: " + e.getMessage());
        }
    }
    
}
