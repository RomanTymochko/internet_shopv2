//package ua.com.owu.Entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Roman Tymochko on 04.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(exclude = "products")
//public class SubCategory {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, mappedBy = "subcategory")
//    private List<Product> products = new ArrayList<Product>();
//
//    public SubCategory(String name) {
//        this.name = name;
//    }
//
//}
