import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;
@AllArgsConstructor
@Getter
@ToString

public class TypesOfPayment {
    private final int id;
    private final double amount;
    private final Instant date;



}
