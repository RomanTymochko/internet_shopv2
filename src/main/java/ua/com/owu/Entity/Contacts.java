//package ua.com.owu.Entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//
///**
// * Created by Roman Tymochko on 16.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class Contacts {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//    private String lastName;
//    private String address;
//    private int paymentCardNumber;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private User user = null;
//}
