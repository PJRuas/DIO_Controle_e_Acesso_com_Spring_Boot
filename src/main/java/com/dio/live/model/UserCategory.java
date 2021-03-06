
package com.dio.live.model;

import jdk.jfr.Enabled;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class UserCategory {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;

}
