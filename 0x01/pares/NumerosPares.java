public class NumerosPares {
    public static void main(String[] args) {
        int numero;
        for (numero = 0; numero <= 98; numero++){
            if (numero % 2 == 0 && numero < 98){
                System.out.print(numero + ", ");
            }else if (numero %2 == 0 && numero == 98) {
                System.out.print(numero);
            }
        }
    }
}