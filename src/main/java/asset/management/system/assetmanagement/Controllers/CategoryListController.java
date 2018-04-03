package asset.management.system.assetmanagement.Controllers;

import asset.management.system.assetmanagement.FilterArgs;
import asset.management.system.assetmanagement.Models.CategoryModel.CategoryModel;
import asset.management.system.assetmanagement.Services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/"+ FilterArgs.API_VERSION + "/listCategories")
public class CategoryListController {

    @Autowired
    private CategoriesService service;

    @Autowired
    MongoTemplate mongoTemplate;


    //List all categories
    @GetMapping
    public List<CategoryModel> listAllCategories(){
        return service.getAllCategories();
    }

    //get all subcategories by parent.
    @GetMapping("/category={category}")
    public List<CategoryModel> getAllSubcategoriesByCategory(@PathVariable String category){
        return service.getAllSubcategoriesByCategory(category);
    }
//    @GetMapping("/insert")
//    public void insertsome(){
//        CategoryModel categoryModel1 = new CategoryModel("1","MongoDB","Databases");
//        CategoryModel categoryModel2 = new CategoryModel("2","dbm","Databases");
//        CategoryModel categoryModel3 = new CategoryModel("3","Databases","Programming");
//        CategoryModel categoryModel4 = new CategoryModel("4","Languages","Programming");
//        CategoryModel categoryModel5 = new CategoryModel("5","Programming","Books");
//        CategoryModel categoryModel6 = new CategoryModel("6","Books",null);
//        repository.save(categoryModel1);
//        repository.save(categoryModel2);
//        repository.save(categoryModel3);
//        repository.save(categoryModel4);
//        repository.save(categoryModel5);
//        repository.save(categoryModel6);
//
//    }

    @PostMapping("/newCategory")
    public String postNewCategory(@RequestBody Object newCategoryModel){
        /*
        The model for this post request must be something like :
        {
            "id":"1",
            "categoryName":"Other",
            "parent":"otherParent"
        }
         */
        try {
            mongoTemplate.save(newCategoryModel, "categorieslist");
            return "added";
        }catch (Exception e){
            return "false";
        }
    }


}
