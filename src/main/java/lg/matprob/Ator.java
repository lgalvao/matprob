package lg.matprob;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Ator {
    @Id
    @GeneratedValue
    int id;

    String nome;

    public Ator(String nome) {
        this.nome = nome;
    }
}
