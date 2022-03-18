package com.ss.android.appcenter.business.activity.appsetting;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class LittleAppPermissionData implements Serializable {
    @SerializedName("isGranted")
    private boolean isGranted;
    @SerializedName("name")
    private String name;
    @SerializedName("permission")
    private int permission;

    public String getName() {
        return this.name;
    }

    public int getPermission() {
        return this.permission;
    }

    public boolean isGranted() {
        return this.isGranted;
    }

    public void setGranted(boolean z) {
        this.isGranted = z;
    }

    public LittleAppPermissionData(int i, String str, boolean z) {
        this.permission = i;
        this.name = str;
        this.isGranted = z;
    }
}
