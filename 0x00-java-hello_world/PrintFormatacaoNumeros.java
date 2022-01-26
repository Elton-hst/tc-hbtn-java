public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.printf("Valor: " + String.format("R$ %,.2f",valor) + "\nTaxa: %.2f%%\n", taxa);
    }
}
