package asset.management.system.assetmanagement.Services;

import asset.management.system.assetmanagement.Models.CategoryModel.CategoryModel;
import asset.management.system.assetmanagement.Repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    CategoriesRepository repository;

    public List<CategoryModel> getAllCategories(){
        return repository.findAll();
    }

    public List<CategoryModel> getAllSubcategoriesByCategory(String category){
        return repository.getByParentIgnoreCase(category);
    }

}
