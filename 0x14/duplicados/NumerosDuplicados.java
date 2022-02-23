import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] inteiros) {

        TreeSet<Integer> numeros = new TreeSet<>();
        Set<Integer> inteirosSet = new HashSet<>();

        for (int inteiro : inteiros) {
            inteirosSet.add(inteiro);
        }

        for (Integer num : inteirosSet) {
            int count = 0;
            for (Integer num2 : inteiros) {
                if (num.equals(num2)){
                    count ++;
                }
            }
            if (count >= 2){
                numeros.add(num);
            }
        }
        return numeros;
    }
}