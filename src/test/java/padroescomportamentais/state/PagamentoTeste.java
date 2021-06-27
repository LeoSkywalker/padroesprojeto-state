package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoTeste {

    Pagamento pagamento;

    @BeforeEach
    public void setUp() {
        pagamento = new Pagamento();
    }

    // Estado Compra
    @Test
    public void naoDeveEfetuarCompraPagamentoCompra(){
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        assertEquals("Compra não efetuada!", pagamento.comprar());
    }

    @Test
    public void deveAcrescerJurosPagamentoCompra(){
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        assertEquals("Acréscimo de juros efetuado!", pagamento.acrescerJuros());
    }

    @Test
    public void deveMultarPagamentoCompra(){
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        assertEquals("Multa efetuada!", pagamento.multar());
    }

    @Test
    public void deveNotificarPagamentoCompra(){
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        assertEquals("Notificação efetuada!", pagamento.notificar());
    }

    //Estado Juros
    @Test
    public void deveEfetuarCompraPagamentoJuros(){
        pagamento.setEstado(PagamentoEstadoJuros.getInstance());
        assertEquals("Compra efetuada!", pagamento.comprar());
    }

    @Test
    public void naoDeveAcrescerJurosPagamentoJuros(){
        pagamento.setEstado(PagamentoEstadoJuros.getInstance());
        assertEquals("Juros não acrescido!", pagamento.acrescerJuros());
    }

    @Test
    public void deveMultarPagamentoJuros(){
        pagamento.setEstado(PagamentoEstadoJuros.getInstance());
        assertEquals("Multa efetuada!", pagamento.multar());
    }

    @Test
    public void naoDeveNotificarPagamentoJuros(){
        pagamento.setEstado(PagamentoEstadoJuros.getInstance());
        assertEquals("Notificação não efetuada!", pagamento.notificar());
    }

    //Estado Multado
    @Test
    public void naoDeveEfetuarCompraPagamentoMultado(){
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        assertEquals("Compra não realizada!", pagamento.comprar());
    }

    @Test
    public void naoDeveAcrescerJurosPagamentoMultado(){
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        assertEquals("Juros não acrescido!", pagamento.acrescerJuros());
    }

    @Test
    public void naoDeveMultarPagamentoMultado(){
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        assertEquals("Multa não efetuada!", pagamento.multar());
    }

    @Test
    public void deveNotificarPagamentoMultado(){
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        assertEquals("Notificação efetuada!", pagamento.notificar());
    }

    //Estado Notificado
    @Test
    public void naoDeveEfetuarCompraPagamentoNotificado(){
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        assertEquals("Compra não efetuada!", pagamento.comprar());
    }

    @Test
    public void naoDeveAcrescerJurosPagamentoNotificado(){
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        assertEquals("Juros não acrescido!", pagamento.acrescerJuros());
    }

    @Test
    public void naoDeveMultarPagamentoNotificado(){
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        assertEquals("Multa não efetuada!", pagamento.multar());
    }

    @Test
    public void naoDeveNotificarPagamentoNotificado(){
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        assertEquals("Notificação não efetuada!", pagamento.notificar());
    }
}
