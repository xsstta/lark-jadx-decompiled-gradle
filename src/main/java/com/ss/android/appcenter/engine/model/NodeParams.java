package com.ss.android.appcenter.engine.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class NodeParams implements Serializable {
    @SerializedName("children")
    public List<NodeParams> children;
    @SerializedName("componentName")
    public String componentName;
    @SerializedName("dataSource")
    public DataSource dataSource;
    @SerializedName("id")
    public String id;
    @SerializedName("md5")
    public String md5;
    @SerializedName("props")
    public JsonObject properties;
    @SerializedName("styles")
    public JsonObject styles;
    @SerializedName("templateId")
    public String templateId;

    public List<NodeParams> getChildren() {
        return this.children;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public DataSource getDataSource() {
        return this.dataSource;
    }

    public String getId() {
        return this.id;
    }

    public JsonObject getProperties() {
        return this.properties;
    }

    public JsonObject getStyles() {
        return this.styles;
    }

    public String getKey() {
        return getKey(this.componentName, this.id);
    }

    public String toString() {
        return String.format("NodeParams{id='%s', propertys=%s, styles=%s, componentName='%s', children=%s}", this.id, this.properties, this.styles, this.componentName, this.children);
    }

    public static String getComponentName(String str) {
        return str.split("_")[0];
    }

    public static String getId(String str) {
        return str.split("_")[1];
    }

    public static String getKey(String str, String str2) {
        return str + '_' + str2;
    }
}
