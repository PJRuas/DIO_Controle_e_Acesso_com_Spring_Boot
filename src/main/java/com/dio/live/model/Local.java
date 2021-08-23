package com.dio.live.model;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Local {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
