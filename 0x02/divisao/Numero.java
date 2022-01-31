package divisao;
public class Numero {
    public static void dividir(int a, int b){

        int resultado = 0;
        resultado = a / b;

        try {
            return resultado;
        } catch (Exception e) {
            System.out.println("erro na divisão");
        }
    }
}