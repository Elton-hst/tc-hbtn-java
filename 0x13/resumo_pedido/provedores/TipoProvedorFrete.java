package provedores;
public enum TipoProvedorFrete {

    SEDEX("sedex"),
    JADLOG("jadlog"),
    LOGGI("loggi");

  private String provedor;

    TipoProvedorFrete(String provedor) {
        this.provedor = provedor;
    }

    public TipoProvedorFrete getProvedor() {
        return TipoProvedorFrete.valueOf(provedor);
    }
}