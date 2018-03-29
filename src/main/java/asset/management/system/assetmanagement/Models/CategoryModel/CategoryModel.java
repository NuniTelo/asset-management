package asset.management.system.assetmanagement.Models.CategoryModel;

//TODO DOCUMENT NAME
public class CategoryModel {
    private int categoryId;
    private String categoryName;
    private String parent;

    public CategoryModel(int categoryId, String categoryName, String parent) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.parent = parent;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
