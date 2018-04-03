package asset.management.system.assetmanagement.Services;

import asset.management.system.assetmanagement.FilterArgs;
import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;
import asset.management.system.assetmanagement.Repositories.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AllDataService {

    @Autowired
    private MainRepository repository;


    public List<AssetMainModel> getAssets(){
        return repository.findAll();
    }

    public List<AssetMainModel> latestInstalledAssets () {

        return repository.findAll(new Sort(new Sort.Order(Sort.Direction.DESC, FilterArgs.INSTALLATION_DATA_FIELD)));
    }

    public List<AssetMainModel> getAssetsByStatus(String status){
        return repository.getByAssetStatusIgnoreCase(status);
    }

    public Optional<AssetMainModel> getOneById(String id) {
        return repository.findById(id);
    }

    public List<AssetMainModel> getByCategory(String category){
        return repository.getByCategoryIgnoreCase(category);
    }

    public List<AssetMainModel> getOnlyByOneSubcategory(String subcategory){
        return repository.getBySubcategoryIgnoreCase(subcategory);
    }

    public List<AssetMainModel> getByAssetCondition(String condition){
        return repository.getByAssetConditionIgnoreCase(condition);
    }

    public List<AssetMainModel> getByModel(String model){
        return repository.getByModelIgnoreCase(model);
    }

    public List<AssetMainModel> getConditionAndModel(String model,String condtion){
        return repository.getByModelAndAssetConditionIgnoreCase(model,condtion);
    }

    public List<AssetMainModel> getConditionByCategory(String category ,String condition){
        return repository.getByCategoryAndAssetConditionIgnoreCase(category,condition);
    }

    public List<AssetMainModel> getStatusByCategory(String category, String status){
        return repository.getByCategoryAndAssetStatusIgnoreCase(category,status);
    }

    public List<AssetMainModel> getStatusBySubCategory(String subcategory,String status){
        return repository.getBySubcategoryAndAssetStatusIgnoreCase(subcategory,status);
    }

    public List<AssetMainModel> getByConditionAndBySubCategory(String subcategory,String condition){
        return repository.getBySubcategoryAndAssetCondition(subcategory,condition);
    }




}
