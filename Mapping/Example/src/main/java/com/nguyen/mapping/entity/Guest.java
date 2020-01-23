package com.nguyen.mapping.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Guest {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_guest")
    private Integer id;

    private String name;
}
