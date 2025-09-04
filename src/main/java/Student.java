import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@Getter
@ToString
public class Student {
    private final int id;
    private final String nom;
    private final String prenom;
    private final Date dateEntree;
    private final Group groupe;


}
