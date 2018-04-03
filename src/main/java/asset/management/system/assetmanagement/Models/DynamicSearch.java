package asset.management.system.assetmanagement.Models;

import java.util.List;
import java.util.Map;

public class DynamicSearch
{
    private Map<String,String> values;

    public DynamicSearch(Map<String, String> values) {
        this.values = values;
    }

    public DynamicSearch(){}
    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }
}
