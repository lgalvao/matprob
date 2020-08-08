package lg.matprob;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootTest
class ProblemaTest {
    Faker fk = new Faker(new Locale("pt_BR"));

    private int gerarQuantidadeInicial() {
        return fk.number().numberBetween(100, 1000);
    }

    private int gerarQuantidade() {
        return fk.number().numberBetween(10,200);
    }
    private Acao gerarAcao() {
        Natureza nat = fk.options().option(Natureza.SUBTRACAO, Natureza.ADICAO);
        String nomeAcao = nat == Natureza.SUBTRACAO ? "perdeu" : "ganhou";
        return new Acao(nomeAcao, gerarQuantidade());
    }

    @Test
    void criarProblema() {
        Objeto objeto = new Objeto(fk.options().option("jaca", "mesa", "moeda", "maçã"));
        List<Acao> acoes = new ArrayList<>();

        acoes.add(new Acao("tinha")
                .setQuantidade(gerarQuantidadeInicial())
                .setNatureza(Natureza.INICIO)
                .setObjeto(objeto));

        for (int i = 1; i<= fk.number().numberBetween(5,10); i++) {
            acoes.add(gerarAcao().setObjeto(objeto));
        }

        Problema problema = new Problema();
        problema.setAtor(new Ator(fk.name().firstName()));
        problema.setObjeto(new Objeto("laranja"));
        problema.setAcoes(acoes);

        System.out.println(problema);
    }


}
