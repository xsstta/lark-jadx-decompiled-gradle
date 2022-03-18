package com.ss.android.appcenter.business.net.tagsandrecent;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Tag implements Serializable {
    @SerializedName("tagId")
    private String id;
    @SerializedName("tagName")
    private String name;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
