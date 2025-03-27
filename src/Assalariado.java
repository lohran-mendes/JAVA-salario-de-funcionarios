public class Assalariado extends Funcionario{

    float salario;

    Assalariado(String nome, float salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public float pagamento() {
        return salario;
    }
}
