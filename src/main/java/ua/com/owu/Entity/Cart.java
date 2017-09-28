//package ua.com.owu.Entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Roman Tymochko on 12.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(exclude = "products")
//
//public class Cart {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Order order = null;
//
//    @ManyToOne(cascade = CascadeType.DETACH ,fetch = FetchType.LAZY)
//    private List<Product> products;
//
//    private double totalPrice;
//}
