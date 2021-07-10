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
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private int quantity;
    private String reference;
    @ManyToOne
    private ProductGroup productGroup;
    @OneToOne(mappedBy = "product")
    private CommandeLine commandeLine;
    @OneToOne(mappedBy = "product")
    private BillLine billLine;
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private Collection<Mesure>  mesures;
}
