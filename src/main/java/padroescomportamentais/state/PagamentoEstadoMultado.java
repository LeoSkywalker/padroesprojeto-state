package padroescomportamentais.state;

public class PagamentoEstadoMultado implements PagamentoEstado {

    private PagamentoEstadoMultado() {};
    private static PagamentoEstadoMultado instance = new PagamentoEstadoMultado();
    public static PagamentoEstadoMultado getInstance() { return instance; }

    public String getEstado() { return "Multa efetuada!"; }

    public String comprar(Pagamento pagamento) {
        return "Compra não realizada!";
    }

    public String acrescerJuros(Pagamento pagamento) {
        return "Juros não acrescido!";
    }

    public String multar(Pagamento pagamento) {
        return "Multa não efetuada!";
    }

    public String notificar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoNotificado.getInstance());
        return "Notificação efetuada!";
    }
}
