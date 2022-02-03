public class Departamento {
    
    private double valorMeta;
    private double valorAtingidoMeta;

    public boolean alcancouMeta() {
        if(valorAtingidoMeta < valorMeta) {
            return false;
        } else {
            return true;
        }
    }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }
    public void setValorAtingidoMeta(double valorAtingidoMeta) {
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }
    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

}
