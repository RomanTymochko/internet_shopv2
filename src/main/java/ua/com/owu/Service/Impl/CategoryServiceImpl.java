//package ua.com.owu.Service.Impl;
//
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import ua.com.owu.DAO.CategoryDAO;
//import ua.com.owu.DAO.SubCategoryDAO;
//import ua.com.owu.Entity.Category;
//import ua.com.owu.Entity.SubCategory;
//import ua.com.owu.Service.CategoryService;
//
//import java.util.List;
//
///**
// * Created by Roman Tymochko on 04.09.2017.
// */
//public class CategoryServiceImpl implements CategoryService{
//
//    @Autowired
//    CategoryDAO categoryDAO;
//
//
//    @Override
//    public void save(Category category) {
////        category.setName(category.getName());
//        categoryDAO.save(category);
//    }
//
//    @Override
//    public void save(String name) {
//        categoryDAO.save(new Category(name));
//    }
//
//    @Override
//    public void delete(int id) {
//        categoryDAO.delete(id);
//    }
//
//    @Override
//    public Category findOne(int id) {
//        return categoryDAO.findOne(id);
//    }
//
//    @Override
//    public List<Category> findAll() {
//        return categoryDAO.findAll();
//    }
//
//
//    @Override
//    public Category findByCategoryName(String name) {
//        return categoryDAO.findByCategoryName(name);
//    }
//}
