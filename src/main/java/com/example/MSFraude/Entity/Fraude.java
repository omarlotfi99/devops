package com.example.MSFraude.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Fraude {
    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private Long id;

    private Long id_compte_bancaire;
    private String description;
    private Date date;
}

