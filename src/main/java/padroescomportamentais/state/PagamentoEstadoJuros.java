package padroescomportamentais.state;

public class PagamentoEstadoJuros implements PagamentoEstado {

    private PagamentoEstadoJuros() {};
    private static PagamentoEstadoJuros instance = new PagamentoEstadoJuros();
    public static PagamentoEstadoJuros getInstance() { return instance; }

    public String getEstado() {
        return "Acréscimo de juros efetuado!";
    }

    public String comprar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoCompra.getInstance());
        return "Compra efetuada!";
    }

    public String acrescerJuros(Pagamento pagamento) {
        return "Juros não acrescido!";
    }

    public String multar(Pagamento pagamento) {
        pagamento.setEstado(PagamentoEstadoMultado.getInstance());
        return "Multa efetuada!";
    }

    public String notificar(Pagamento pagamento) { return "Notificação não efetuada!"; }
}
