package asset.management.system.assetmanagement.Models.MainModel;

import java.util.List;

public class OtherData {
    private String metadata;
    private List<String> tag;

    public OtherData(String metadata, List<String> tag) {
        this.metadata = metadata;
        this.tag = tag;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }
}

