package padroescomportamentais.state;

public class PagamentoEstadoNotificado implements PagamentoEstado {

    private PagamentoEstadoNotificado() {};
    private static PagamentoEstadoNotificado instance = new PagamentoEstadoNotificado();
    public static PagamentoEstadoNotificado getInstance() { return instance; }

    public String getEstado() {
        return "Notificação efetuada!";
    }

    public String comprar(Pagamento pagamento) {
        return "Compra não efetuada!";
    }

    public String acrescerJuros(Pagamento pagamento) {
        return "Juros não acrescido!";
    }

    public String multar(Pagamento pagamento) {
        return "Multa não efetuada!";
    }

    public String notificar(Pagamento pagamento) {
        return "Notificação não efetuada!";
    }
}
