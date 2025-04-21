package com.example.WholesaleSupplier.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Restaurent")
public  class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurentId;

    private String restaurentName;

    private String email;

    private String address;



}
