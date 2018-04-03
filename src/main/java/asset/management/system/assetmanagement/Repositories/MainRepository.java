package asset.management.system.assetmanagement.Repositories;

import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MainRepository extends MongoRepository<AssetMainModel,String> {
//    List<?> findTopByAssetCondition(String condition);
//    List<AssetMainModel> getByCategory(String category);
    //kur bejme filtrimin dhe duam qe te na kthhet nje liste pasi i dergojme nje liste me parametra te ndryshem
//    List<AssetMainModel> getByCategoryAndAndBrandIn(List<String> list , List<String> list2);
//    //query per te bere serach nga tag
//    @Query("{'otherData.tag' : ?0 }")
//    public List<AssetMainModel> findByTag(String color);
//    public List<AssetMainModel> findTop100ByModel(String model);

    //get all fileds by asset status
     List<AssetMainModel> getByAssetStatusIgnoreCase(String status);

    //get by category
    List<AssetMainModel> getByCategoryIgnoreCase(String category);

    //get by subcategory
    List<AssetMainModel> getBySubcategoryIgnoreCase(String subcategory);

    //get by assetCondition
    List<AssetMainModel> getByAssetConditionIgnoreCase(String condition);

    //get assets by model
    List<AssetMainModel> getByModelIgnoreCase(String model);

    //get assets by model and condition
    List<AssetMainModel> getByModelAndAssetConditionIgnoreCase(String model,String condition);

    //get assets by category and condition
    List<AssetMainModel> getByCategoryAndAssetConditionIgnoreCase(String category, String condition);

    //get assets by category and status
    List<AssetMainModel> getByCategoryAndAssetStatusIgnoreCase(String category, String status);

    //get assets by subcategory and status
    List<AssetMainModel> getBySubcategoryAndAssetStatusIgnoreCase(String subcategory , String status);

    //get assets by subcategory and condition
    List<AssetMainModel> getBySubcategoryAndAssetCondition(String subcategory , String condition);




}
