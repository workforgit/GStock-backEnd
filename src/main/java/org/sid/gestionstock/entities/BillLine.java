package org.sid.gestionstock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long billLinesId;
    private int quantity;
    private double purchasingPrice;
    @ManyToOne
    private Bill bill;
    @OneToOne
    private Product product;

}
