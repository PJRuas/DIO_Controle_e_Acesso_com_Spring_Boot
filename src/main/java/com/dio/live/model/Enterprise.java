package com.dio.live.model;

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
public class Enterprise {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String cnpj;
    private String adress;
    private String district;
    private String city;
    private String province;
    private String contactNumber;


}
