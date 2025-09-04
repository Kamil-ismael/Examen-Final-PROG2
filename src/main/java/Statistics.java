import java.time.Instant;
import java.util.List;

public class Statistics {

    public List<Fee> getLateFees(List<Fee> fees, Instant t ){
        return fees.stream().filter(f -> f.getDeadline().isBefore(t)).toList();
    }

    public double getTotalMissingFees(List<Fee> fees, Instant t) {
        return fees.stream()
                .filter(f -> f.getDeadline().isAfter(t))
                .mapToDouble(Fee::getAmount)
                .sum();
    }

    public double getTotalPaidByStudent(Student student, List<Fee> fees, Instant t) {
        return fees.stream()
                .filter(f -> f.getEtudiant().equals(student))
                .mapToDouble(Fee::getAmount)
                .sum();
    }
}
