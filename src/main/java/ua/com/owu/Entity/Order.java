//package ua.com.owu.Entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Date;
//
///**
// * Created by Roman Tymochko on 12.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "order")
//    private Cart cart = null;
//
//    @ManyToOne(cascade = CascadeType.DETACH ,fetch = FetchType.LAZY)
//    private User user;
//
//    private Date date;
//}
