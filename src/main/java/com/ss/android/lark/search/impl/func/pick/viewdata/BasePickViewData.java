package com.ss.android.lark.search.impl.func.pick.viewdata;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePickViewData implements Serializable {
    private static final long serialVersionUID = 8166879145614914995L;
    protected String businessId;
    protected List<String> descHighLights = new ArrayList();
    protected String description;
    protected String id;
    protected String imageKey;
    protected boolean isCrossTenant = false;
    protected boolean isCrossWithKa = false;
    protected boolean isSelected = false;
    protected String name;
    protected List<String> nameHighLights = new ArrayList();
    protected String sourceType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewDataType {
    }

    public abstract int getType();

    public String getAvatarId() {
        return this.id;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public List<String> getDescHighLights() {
        return this.descHighLights;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getImageKey() {
        return this.imageKey;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getNameHighLights() {
        return this.nameHighLights;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isCrossWithKa() {
        return this.isCrossWithKa;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setBusinessId(String str) {
        this.businessId = str;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCrossWithKa(boolean z) {
        this.isCrossWithKa = z;
    }

    public void setDescHighLights(List<String> list) {
        this.descHighLights = list;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageKey(String str) {
        this.imageKey = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNameHighLights(List<String> list) {
        this.nameHighLights = list;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }
}
