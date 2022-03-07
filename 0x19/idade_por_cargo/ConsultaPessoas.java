import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {


    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoasPorCargo) {
        Map<String, List<Pessoa>> result = pessoasPorCargo.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
        return result;
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> idadesPorCargo) {

        Map<String, List<Integer>> resultIdadesPorCargo = idadesPorCargo.stream()
                .collect(Collectors.groupingBy((Pessoa p) -> p.getCargo(),
                        Collectors.mapping((Pessoa p) -> p.getIdade(), Collectors.toList())));
        return resultIdadesPorCargo;
    }
}