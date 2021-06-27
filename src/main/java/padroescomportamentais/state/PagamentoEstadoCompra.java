package padroescomportamentais.state;

public class PagamentoEstadoCompra implements PagamentoEstado {

    private PagamentoEstadoCompra() {};
    private static PagamentoEstadoCompra instance = new PagamentoEstadoCompra();
    public static PagamentoEstadoCompra getInstance() { return instance; }

    public String getEstado() { return "Compra efetuada!"; }

    public String comprar(Pagamento pagamento) { return "Compra não efetuada!"; }

    public String acrescerJuros(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoJuros.getInstance());
        return "Acréscimo de juros efetuado!";
    }

    public String multar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        return "Multa efetuada!";
    }

    public String notificar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        return "Notificação efetuada!";
    }
}
