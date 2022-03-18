package com.ss.android.appcenter.engine.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DataSource implements Serializable {
    @SerializedName("method")
    public String method;
    @SerializedName("params")
    public JsonObject params;
    @SerializedName("url")
    public String url;
    @SerializedName("withAuth")
    public boolean withAuth;
}
