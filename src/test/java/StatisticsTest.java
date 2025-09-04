import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
class StatisticsTest {
    private Fee fee;
    private Student student;
    private Group groupe;
    private Statistics statistics;

    @BeforeEach
    void setUp() {
        groupe = new Group(1, "K1");
        student = new Student(1, "Jean", "Maxime", new Date(), groupe);
        statistics = new Statistics();
        fee = new Fee(1, "STD24001", 2880000,
                java.time.Instant.now().plus(java.time.Duration.ofDays(1)),
                student,
                new TypesOfPayment(1, 2880000, java.time.Instant.now()));
    }


    @Test
    void getLateFees() {

    }

    @Test
    void getTotalMissingFees() {
    }

    @Test
    void getTotalPaidByStudent() {
    }
}