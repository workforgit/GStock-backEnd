package org.sid.gestionstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ctcId;
    private String firstName;
    private String lastName;
    private String phone;
    private String mobilePhone;
    private String adresse;
    private String codeTva;
    private String email;
    private char type;
    private String city;
    @OneToMany(mappedBy = "person")
    @JsonIgnore
    private Collection<Commande> commandes;
}
