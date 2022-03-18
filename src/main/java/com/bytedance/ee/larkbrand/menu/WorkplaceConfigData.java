package com.bytedance.ee.larkbrand.menu;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WorkplaceConfigData implements Serializable {
    @SerializedName("isUserCommon")
    public boolean isUserCommon;
}
