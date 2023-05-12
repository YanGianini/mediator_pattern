public class Servico implements Financeiro{

    private static Servico instance = new Servico();

    private Servico() {}

    public static Servico getInstance() {
        return instance;
    }

    public String pedidoEmprestimo(Integer valor) {
        return "emprestimo no valor de " + valor + " foi protocolado";
    }

    public String pedidoLimite(Integer valor) {
        return "aumento de limite no valor de " + valor + " foi protocolado";
    }

    public String pedidoSaque(Integer valor) {
        return "saque no valor de " + valor + " foi protocolado";
    }
}
