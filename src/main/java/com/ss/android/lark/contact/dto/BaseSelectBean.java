package com.ss.android.lark.contact.dto;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseSelectBean implements Serializable {
    private String avatarKey;
    private int deniedReason;
    private List<String> descHighLights = new ArrayList();
    private String description;
    private String id;
    private boolean isCrossTenant;
    boolean isSelectable = true;
    boolean isSelected;
    private String name;
    private List<String> nameHighLights = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    public @interface SelectType {
    }

    public abstract int getType();

    public String getAvatarKey() {
        return this.avatarKey;
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

    public String getName() {
        return this.name;
    }

    public List<String> getNameHighLights() {
        return this.nameHighLights;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isSelectable() {
        return this.isSelectable;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isBeBlocked() {
        if (this.deniedReason == 1) {
            return true;
        }
        return false;
    }

    public boolean isBlock() {
        if (this.deniedReason == 5) {
            return true;
        }
        return false;
    }

    public boolean isNotContact() {
        if (this.deniedReason == 6) {
            return true;
        }
        return false;
    }

    public boolean isBlockOrBeBlocked() {
        if (isBeBlocked() || isBlock()) {
            return true;
        }
        return false;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setDeniedReason(int i) {
        this.deniedReason = i;
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

    public void setName(String str) {
        this.name = str;
    }

    public void setNameHighLights(List<String> list) {
        this.nameHighLights = list;
    }

    public void setSelectable(boolean z) {
        this.isSelectable = z;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }
}
