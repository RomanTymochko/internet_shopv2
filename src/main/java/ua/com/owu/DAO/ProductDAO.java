//package ua.com.owu.DAO;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import ua.com.owu.Entity.Product;
//
//import java.util.List;
//
///**
// * Created by Roman Tymochko on 06.09.2017.
// */
//public interface ProductDAO extends JpaRepository<Product, Integer> {
//    @Query("from Product p where p.subCategory.name=:name")
//    List<Product> findAllProductsBySubCategoryName(@Param("subCategoryName") String name);
//
//    List<Product> findAllProductsBySubCategoryId(int id);
//
//    Product findByProductName(String name);
//}
