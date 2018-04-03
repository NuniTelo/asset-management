package asset.management.system.assetmanagement.Models.CategoryModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorieslist")
public class CategoryModel {
    @Id
    private String id;

    //this is going to be subcategory name
    private String categoryName;

    //this is going to be the main level for a particular category
    private String parent;

    public CategoryModel(String id, String categoryName, String parent) {
        this.id = id;
        this.categoryName = categoryName;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
