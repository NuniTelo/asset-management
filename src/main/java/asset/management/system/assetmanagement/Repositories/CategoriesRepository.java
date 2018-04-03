package asset.management.system.assetmanagement.Repositories;

import asset.management.system.assetmanagement.Models.CategoryModel.CategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoriesRepository extends MongoRepository<CategoryModel,String>{

    List<CategoryModel> getByParentIgnoreCase(String categoryName);
}
