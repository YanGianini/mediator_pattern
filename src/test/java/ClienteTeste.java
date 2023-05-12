import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTeste {

    @Test
    void deveProtocolarPedidoEmprestimo() {
        Cliente cliente = new Cliente();
        assertEquals("Seu pedido de emprestimo no valor de 25000 foi protocolado", cliente.pedirEmprestimo(25000));
    }

    @Test
    void deveProtocolarPedidoLimite() {
        Cliente cliente = new Cliente();
        assertEquals("Seu pedido de aumento de limite no valor de 1500 foi protocolado", cliente.pedirLimite(1500));
    }

    @Test
    void deveProtocolarPedidoSaque() {
        Cliente cliente = new Cliente();
        assertEquals("Seu pedido de saque no valor de 10000 foi protocolado", cliente.solicitarSaque(10000));
    }
}
