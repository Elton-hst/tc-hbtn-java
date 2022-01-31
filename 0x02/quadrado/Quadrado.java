package quadrado;

public class Quadrado {
    
    public static double area(double lado){

        if(lado > 0) {
            try {
                throw new java.lang.IllegalArgumentException ("Lado deve possuir valor positivo");
            } catch (Exception e) {
                return lado * lado;
            }
        }

    }

}
