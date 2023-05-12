public class Gestor {

    private static Gestor instance = new Gestor();

    private Gestor() {}

    public static Gestor getInstance() {
        return instance;
    }

    public String protocolarPedidoEmprestimo(Integer valor) {
        return "Seu pedido de " + Servico.getInstance().pedidoEmprestimo(valor);
    }

    public String protocolarPedidoLimite(Integer valor) {
        return "Seu pedido de " + Servico.getInstance().pedidoLimite(valor);
    }

    public String protocolarPedidoSaque(Integer valor) {
        return "Seu pedido de " + Servico.getInstance().pedidoSaque(valor);
    }
}
