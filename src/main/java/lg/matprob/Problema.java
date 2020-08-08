package lg.matprob;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor
@Data
public class Problema {
    @GeneratedValue
    @Id
    @Getter
    int id;

    @OneToMany
    @Getter
    List<Acao> acoes;

    @OneToOne
    Ator ator;

    @OneToOne
    Objeto objeto;

    void novaAcao(Acao acao) {
        if (acoes==null) acoes= new ArrayList<>();
        acoes.add(acao);
    }

    public String toString() {
        String fraseFinal = String.format(". Com quantas %s %s ficou?", objeto.nomePlural, ator.nome);

        return String.join(" ", ator.nome, acoes.get(0).toString()) + ". "
                + ator.nome + " "
                + acoes.subList(1, acoes.size())
                .stream()
                .map(Acao::toString)
                .collect(Collectors.joining(" e "))

                + fraseFinal;

    }

}
