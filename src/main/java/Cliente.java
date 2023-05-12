public class Cliente {
    public String pedirEmprestimo(Integer valor) {
        return Gestor.getInstance().protocolarPedidoEmprestimo(valor);
    }

    public String pedirLimite(Integer valor) {
        return Gestor.getInstance().protocolarPedidoLimite(valor);
    }

    public String solicitarSaque(Integer valor) {
        return Gestor.getInstance().protocolarPedidoSaque(valor);
    }
}
