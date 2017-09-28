//package ua.com.owu.Entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Roman Tymochko on 31.08.2017.
// */
//@Inheritance
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(exclude = "pictures")
//@EqualsAndHashCode
//
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
//    private SubCategory subCategory = null;
//    private String name;
//    private double price;
//
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, mappedBy = "product")
//    private List<Picture> pictures = new ArrayList<Picture>();
//
//    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "product")
//    private Options options;
//    private String description;
//
//
//    public Product(SubCategory subCategory, String name, double price, Options options, String description, Category category) {
//        this.subCategory = subCategory;
//        this.name = name;
//        this.price = price;
//        this.options = options;
//        this.description = description;
//    }
//}
