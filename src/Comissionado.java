public class Comissionado extends Funcionario{
    int vendas;
    float comissao;

    Comissionado(String nome, int vendas, float comissao) {
        super(nome);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    @Override
    public float pagamento() {
        return vendas * comissao;
    }
}
