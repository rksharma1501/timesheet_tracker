package hackathon_timesheet.com.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long employeeId;
    private String date; // e.g., 2025-06-13
    private int hours;
    private String status; // "SUBMITTED", "APPROVED"
}
