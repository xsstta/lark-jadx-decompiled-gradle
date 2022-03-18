package com.ss.android.appcenter.business.net.dto;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import javax.annotation.Nullable;

public class BlockitInfo implements Serializable {
    @SerializedName("blockId")
    public String blockId;
    @SerializedName("blockTypeId")
    public String blockTypeId;
    @SerializedName("hasSetting")
    public boolean hasSetting;
    @Nullable
    public String previewToken;
    @SerializedName("settingUrl")
    public String settingUrl;
    public String sourceData;

    public String toString() {
        return String.format("BlockitInfo{blockId='%s', blockTypeId='%s'}", this.blockId, this.blockTypeId);
    }
}
