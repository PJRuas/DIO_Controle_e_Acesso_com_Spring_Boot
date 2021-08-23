package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    @ManyToOne
    private UserCategory userCategory;
    @ManyToOne
    private Enterprise enterprise;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingSchedule workingSchedule;
    private BigDecimal tolerance;
    private LocalDateTime beginWorktime;
    private LocalDateTime endWorktime;

}
