package padroescomportamentais.state;

public interface PagamentoEstado {

    String getEstado();

    String comprar(Pagamento pagamento);

    String acrescerJuros(Pagamento pagamento);

    String multar(Pagamento pagamento);

    String notificar(Pagamento pagamento);
}
