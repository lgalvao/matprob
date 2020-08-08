package lg.matprob;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
@Accessors(chain = true)
@NoArgsConstructor
public class Acao {
    @Id
    @GeneratedValue
    int id;

    String nome;
    Natureza natureza;

    @OneToOne
    Objeto objeto;
    int quantidade;

    public Acao(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Acao(String nome) {
        this.nome = nome;
    }

    public String toString() {
      return String.join(" ",
              nome,
              String.valueOf(quantidade),
              quantidade ==1 ? objeto.nome: objeto.nomePlural);
    }


}
