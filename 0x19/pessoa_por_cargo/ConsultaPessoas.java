import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {


    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoasPorCargo) {
        Map<String, List<Pessoa>> result = pessoasPorCargo.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
        return result;
    }
}