package lg.matprob;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Objeto {
    @Id
    int id;

    String nome;
}
