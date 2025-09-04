import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Instant;
class FeeTest {
    private static final double MONTANT_TOTAL = 2880000;
    private static final double MONTANT_PARTIEL = 1000000;
    private static final double MONTANT_SUPERIEUR = 3000000;

    private Group groupe;
    private Student student;
    private Fee fee;
    private Instant deadline;


    @BeforeEach
    void setUp() {
       groupe  = new Group(1, "K1");
       student = new Student(1, "Jean", "Maxime", new Date(), groupe);
       deadline = Instant.now().plus(Duration.ofDays(1));
        fee = new Fee(1, "STD24001", 2880000, deadline, student,
                new TypesOfPayment(1, 2880000, Instant.now()));
    }
    @Test
    void getStatut() {
        assertEquals(StatutFee.NULL, fee.getStatut(0));
        assertEquals(StatutFee.PAID, fee.getStatut(MONTANT_TOTAL));
        assertEquals(StatutFee.IN_PROGRESS, fee.getStatut(MONTANT_PARTIEL));
        assertEquals(StatutFee.OVERPAID, fee.getStatut(MONTANT_SUPERIEUR));
    }
}