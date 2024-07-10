public class Gerente {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void autenticar(String cpf) {
        if (this.cpf.equals(cpf)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Falha na autenticação!");
        }
    }

    public void gerenciarConta(Conta conta) {
        conta.imprimirExtrato();
    }
}
