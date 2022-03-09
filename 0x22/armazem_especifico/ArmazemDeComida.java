public class ArmazemDeComida extends Armazem<Comida> {

    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
        super.adicionarAoInventario(nome, valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }

}