package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
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
public class HourBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class HourBankId implements Serializable{
        private long idHourBank;
        private long idMovimentation;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private HourBankId id;
    private LocalDateTime workedDate;
    private BigDecimal hoursCount;
    private BigDecimal hoursLeft;

}
