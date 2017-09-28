//package ua.com.owu.Entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//
///**
// * Created by Roman Tymochko on 01.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//
//public class Picture {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String url;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
//    private Product product;
//}
