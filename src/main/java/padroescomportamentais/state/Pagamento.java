package padroescomportamentais.state;

public class Pagamento {

    private String nome;
    private PagamentoEstado estado;

    public Pagamento() { this.estado = PagamentoEstadoCompra.getInstance(); }

    public void setEstado(PagamentoEstado estado) { this.estado = estado; }

    public String comprar() { return estado.comprar(this); }

    public String acrescerJuros(){ return estado.acrescerJuros(this); }

    public String multar(){ return estado.multar(this); }

    public String notificar(){ return estado.notificar(this); }

    public String getNomeEstado() { return estado.getEstado(); }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public PagamentoEstado getEstado() { return estado; }
}
