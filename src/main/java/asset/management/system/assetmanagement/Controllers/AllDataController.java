package asset.management.system.assetmanagement.Controllers;

import asset.management.system.assetmanagement.FilterArgs;
import asset.management.system.assetmanagement.Models.MainModel.AssetMainModel;
import asset.management.system.assetmanagement.Models.DynamicSearch;
import asset.management.system.assetmanagement.Repositories.MainRepository;
import asset.management.system.assetmanagement.Services.AllDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/"+FilterArgs.API_VERSION + "/all")
@Api(value = "All Assets Controller", description = "Perform request on all assets.")
public class AllDataController {

    //Our service AllDataService.class
    @Autowired
    AllDataService service;

    //Our repository
    @Autowired
    MainRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    //for holdin assets of multiple subcategories
    List<AssetMainModel> listOfSubcategories = new ArrayList<>();

    //for holding assets of multiple categorues
    List<AssetMainModel> listOfCategories = new ArrayList<>();

    //for holding assets of multiple models
    List<AssetMainModel> listOfModels = new ArrayList<>();

    //Method to fetch all assets from out database without any filtering
    @GetMapping
    @ApiOperation(value = "Lists ALL of out assets.")
    public List<AssetMainModel> getBySize(){
        return service.getAssets();
    }

    //Fetch all our assets by date that has been installed
    @GetMapping("/latestassets")
    @ApiOperation(value = "List assets by date in DESCENDING order.")
    public List<AssetMainModel> getAllOrderdByDate(){
        return service.latestInstalledAssets();
    }

    //Get all by status,ACTIVE, DELETED, DRAFT.
    @GetMapping("/status={status}")
    @ApiOperation(value = "List assets by their status, passed parameter : ACTIVE, DRAFT, DELETED")
    public List<AssetMainModel> getAllByStatus(@PathVariable String status){
        return service.getAssetsByStatus(status);
    }

    //Get only one object by passing the id
    @GetMapping("/id={id}")
    public Optional getOneById(@PathVariable String id){
        return service.getOneById(id);
    }

    //Get all assets by category
    @GetMapping("/category={category}")
    public List<AssetMainModel> getByCategory(@PathVariable String category){
        return service.getByCategory(category);
    }

    @GetMapping("/category/multiple/category={category}")
    public List<AssetMainModel> getListOfCategories(@PathVariable String category){
        listOfCategories.addAll(service.getByCategory(category));
        return listOfCategories;
    }

    @GetMapping("/category/multiple/clear")
    public String clearAllListOfCategories(){
        listOfCategories.clear();
        return "Done";
    }

    @GetMapping("/category/multiple/clearcategory={category}")
    public List<AssetMainModel> clearOneCategorieFromList(@PathVariable String category){
        for(AssetMainModel modelCategory: listOfCategories){
            if(modelCategory.getCategory().equals(category)){
                listOfSubcategories.remove(modelCategory);
            }
        }
        return listOfSubcategories;
    }

    //display one one assets of a specified subcategory
    @GetMapping("/subcategory = {subcategory}")
    public List<AssetMainModel>getByOnlyOneSubcategory(@PathVariable String subcategory){
        List<AssetMainModel> getList = service.getOnlyByOneSubcategory(subcategory);
        return getList;
    }

    //add to a global list assets of the diffrent subcategories
    @GetMapping("/subcategory/multiple/subcategory={subcategory}")
    public List<AssetMainModel> appendSubcategoryModels(@PathVariable String subcategory){
        listOfSubcategories.addAll(service.getOnlyByOneSubcategory(subcategory));
        return listOfSubcategories;
    }

    //This method lets us clear the list ex: if we want to restart the categories
    @GetMapping("/subcategory/multiple/clear")
    public String clearAllListOfSubcategories(){
        if(listOfSubcategories.size()==0 || listOfSubcategories == null){
            return "none";
        }
        else {
        listOfSubcategories.clear();
        return "Clear done";}
    }

    //delete all assets of that category that we specify form the list
    @GetMapping("/subcategory/multiple/clearSubcategory={subcategory}")
    public List<AssetMainModel> clearOneSubcategory(@PathVariable String subcategory){
        for(AssetMainModel modelCategory: listOfSubcategories){
            if(modelCategory.getSubcategory().equals(subcategory)){
                listOfSubcategories.remove(modelCategory);
            }
        }
        return listOfSubcategories;
    }


    //Get a list by it's condition that may be GOOD,POOR,BROKEN
    @GetMapping("/assetCondition={condition}")
    public List<AssetMainModel> getByAssetCondition(@PathVariable String condition){
        return service.getByAssetCondition(condition);
    }

    //Get all assets by model///ONLY BY ONE MODEL
    @GetMapping("/model={model}")
    public List<AssetMainModel> getByModel(@PathVariable String model){
        return service.getByModel(model);
    }

    //Get multiple models in a list
    @GetMapping("/model/multiple/model={model}")
    public List<AssetMainModel> getByMultipleModels(@PathVariable  String model){
        listOfModels.addAll(service.getByModel(model));
        return listOfModels;
    }

    //Delete a model type from the list
    @GetMapping("/model/multiple/clearModel={model}")
    public List<AssetMainModel> deleteOneModelFromList(@PathVariable String model){
        if(listOfModels.size()>0){
            for (AssetMainModel modelClear: listOfModels) {
                if(modelClear.getModel().toLowerCase().equals(model.toLowerCase())){
                    listOfModels.remove(modelClear);
                }
            }
        }
        return listOfModels;
    }

    //Delete all models from the list
    @GetMapping("/model/multiple/clear")
    public String clearAllModels(){
        listOfModels.clear();
        return "Done";
    }

    //Get assets by model and condition
    @GetMapping("/model={model}&condition={condition}")
    public List<AssetMainModel> getConditionAndModel(@PathVariable String model , @PathVariable String condition){
        return service.getConditionAndModel(model,condition);
    }

    //get assets by condition and categories
    @GetMapping("/category={category}&condition={condition}")
    public List<AssetMainModel> getConditionAndCategory(@PathVariable String category , @PathVariable String condition){
        return service.getConditionByCategory(category,condition);
    }

    //Get assets by category and model
    @GetMapping("/category={category}&status={status}")
    public List<AssetMainModel> getStatusByCategory(@PathVariable String category, @PathVariable String status){
        return service.getStatusByCategory(category,status);
    }

    //Get all assets by status and subcategories
    @GetMapping("/subcategory={subcategory}&status={status}")
    public List<AssetMainModel> getStatusBySubcategory(@PathVariable String subcategory , @PathVariable String status){
        return service.getStatusBySubCategory(subcategory,status);
    }

    //Get all assets by condition and category
    @GetMapping("/subcategory={subcategory}&condition={condition}")
    public List<AssetMainModel> getBysubCategoryAndCondition(@PathVariable String subcategory , @PathVariable String condition){
        return service.getByConditionAndBySubCategory(subcategory,condition);
    }



    //UPDATE STATUS BY ID
    @GetMapping("/updateStatus/{id}/status={status}")
    public Object updateStatus(@PathVariable String id, @PathVariable String status){
        Query updateStatusQuery = new Query(Criteria.where("_id").is(id));
        try {
            return "{\"status\":\"done\"}";
        }catch (Exception e){
            e.printStackTrace();
            return "{\"status\":\"fail\"}";
        }
    }



    //Method to update a field at a time
    @GetMapping("/id={id}/update={field}&value={value}")
    public void getByTags(@PathVariable String id, @PathVariable String field, @PathVariable String value) {
        //kjo eshte per te bere edit nje fushe te caktuar
//        Map<String,String> values = new HashMap<>();
//        values.put("serial_no","serial-new");
//        values.put("provider", "nuni-telo");
//
//        Query query = new Query(Criteria.where("_id").is("4"));
//        for(Map.Entry<String,String> val: values.entrySet()){
//            mongoTemplate.updateFirst(query, Update.update(val.getKey(),val.getValue()), AssetMainModel.class);
//        }
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.updateFirst(query, Update.update(field,value), AssetMainModel.class);
    }



    //To filter our data for a dynamic search we can add as many field as we want
    @PostMapping("/filterData")
    public List<AssetMainModel> getByTags(@RequestBody DynamicSearch object){
        //We make a POST requests in this form:
       //
//        {
//            "values":{
//                     "brand": "Light Pole",
//                     "model": "AX04"
//            }
//        }

        //To catch an array we would have to do a request like:
//        {
//            "values":{
//                "otherData.tag":"green"
//        }
//        }
//
        Map<String,String> val = object.getValues();
        Query query = new Query();
        for(Map.Entry<String,String> map : val.entrySet()){
            query.addCriteria(Criteria.where(map.getKey()).is(map.getValue()));
        }
        return mongoTemplate.find(query,AssetMainModel.class);
    }


    //with this methd we can new documents to our database collection
//    @PostMapping("/addData")
//    public List<AssetMainModel> insertOne(@RequestBody String jsonpayload) throws IOException {
//
//        ObjectMapper mapper = new ObjectMapper();
//        TypeReference<HashMap<String,Object>> typeRef
//                = new TypeReference<HashMap<String,Object>>() {};
//        HashMap<String,Object> map = mapper.readValue(jsonpayload, typeRef);
//
//        DBObject dbObject = new BasicDBObject(map);
//
//        mongoTemplate.save(dbObject, "assetcollection");
//
//        return repository.findAll();
//    }


    //Easier way to add data to our database
    @PostMapping("/addData")
    public String insertOne(@RequestBody Object readyObject){
        try {
            mongoTemplate.save(readyObject, "assetcollection");
            return "added";
        }catch (Exception e){
            return "false";
        }
    }







}
