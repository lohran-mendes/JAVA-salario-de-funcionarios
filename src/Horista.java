public class Horista extends Funcionario {
    float valorHora;
    int horas;

    Horista(String nome, float valorHora, int horas) {
        super(nome);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public float pagamento() {
        return valorHora * horas;
    }
}
