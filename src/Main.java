public class Main {
    public static void main(String[] args) {

        Funcionario funcionarios[] = {
                new Assalariado("Lohran Mendes", 8000),
                new Horista("Maria Eduarda", 50, 50),
                new Comissionado("Anna Beatriz", 15, 80)
        };

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("O pagamento de " + funcionarios[i].nome + " é igual a: R$" +
                    String.format("%.2f", funcionarios[i].pagamento()));
        }

    }
}