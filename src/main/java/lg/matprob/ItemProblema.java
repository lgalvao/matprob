package lg.matprob;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ItemProblema {
    @Id
    int id;

    Objeto objeto;
    Acao acao;
    int quantidade;
}
