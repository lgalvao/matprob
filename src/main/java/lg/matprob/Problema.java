package lg.matprob;

import lombok.Data;

import java.util.List;

@Data
public class Problema {
    List<ItemProblema> itens;
    int solucao;

    String gerar() {
        return itens.toString();
    }
}
