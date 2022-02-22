package provedores;


public class Sedex implements ProvedorFrete{

    private static final TipoProvedorFrete tipoFrete = TipoProvedorFrete.SEDEX;

    @Override
    public Frete calcularFrete(double peso, double valor) {

        if (peso > 1000 ){
            return new Frete(valor * 0.1, tipoFrete);
        }else{
            return new Frete(valor * 0.05, tipoFrete);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {

        return TipoProvedorFrete.SEDEX;
    }
}