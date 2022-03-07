import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {
        Map<String, List<Pessoa>> profissional = new HashMap<>();
                return todasPessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
    }
}