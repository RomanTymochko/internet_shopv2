//package ua.com.owu.Entity;
//
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Roman Tymochko on 01.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@ToString(exclude = "subCategories")
//public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, mappedBy = "category")
//    private List<SubCategory> subCategories = new ArrayList<SubCategory>();
//
//    public Category(String name) {
//        this.name = name;
//    }
//}
