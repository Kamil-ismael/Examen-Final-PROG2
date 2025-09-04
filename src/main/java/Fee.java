import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@AllArgsConstructor
@Getter
@ToString
public class Fee {
    private final int id;
    private final String Label;
    private final double amount;
    private final Instant deadline;
    private final Student etudiant;
    private final TypesOfPayment type_de_paiement;


    public StatutFee getStatut(double sommePaiements) {
        if (sommePaiements == 0) {
            return StatutFee.NULL;
        }
        if (sommePaiements == amount) {
            return StatutFee.PAID;
        }
        if (Instant.now().isAfter(deadline)) {
            return StatutFee.LATE;
        }
        if (sommePaiements > amount) {
            return StatutFee.OVERPAID;
        }
        return StatutFee.IN_PROGRESS;
    }

}
