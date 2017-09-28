//package ua.com.owu.Entity;
//
//import lombok.*;
//import ua.com.owu.Entity.Dictionaries.Color;
//import ua.com.owu.Entity.Dictionaries.Material;
//import ua.com.owu.Entity.Dictionaries.Size;
//
//import javax.persistence.*;
//
///**
// * Created by Roman Tymochko on 01.09.2017.
// */
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//
//public class Options {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private Picture picture;
//    private Color color;
//    private Size size;
//    private Material material;
//    private int width;
//    private int height;
//    private int weight;
//
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Product product = null;
//}