package lg.matprob;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Objeto {
    @Id
    @GeneratedValue
    int id;

    String nome;
    String nomePlural;

    public Objeto(String nome) {
        this.nome = nome;
        this.nomePlural = nome+"s";
    }

    public Objeto(String nome, String nomePlural) {
        this.nome = nome;
        this.nomePlural = nomePlural;
    }

    @Override
    public String toString() {
        return nome;
    }
}
