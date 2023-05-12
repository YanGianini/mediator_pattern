public interface Financeiro {
    String pedidoEmprestimo(Integer valor);
    String pedidoLimite(Integer valor);
    String pedidoSaque(Integer valor);
}
