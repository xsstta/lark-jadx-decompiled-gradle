package com.ss.android.appcenter.business.net.workplacehome;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;

public class TagChild implements Serializable {
    @SerializedName("itemId")
    private String itemId;
    @SerializedName("subType")
    private String subType;
    @SerializedName(ShareHitPoint.f121869d)
    private String type;

    public String getItemId() {
        return this.itemId;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    public boolean isAddApp() {
        return TextUtils.equals(this.subType, "system_add");
    }

    public boolean isBlock() {
        return TextUtils.equals(this.type, "block");
    }

    public boolean isCommonItem() {
        return TextUtils.equals(this.subType, "common");
    }

    public boolean isPlatformWidget() {
        return TextUtils.equals(this.subType, "platform_widget");
    }

    public boolean isRecommend() {
        return TextUtils.equals(this.subType, "recommend");
    }

    public boolean isWidget() {
        return TextUtils.equals(this.type, "widget");
    }

    public boolean isRecommendOrPlatformWidget() {
        if (isRecommend() || isPlatformWidget()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "TagChild{" + "type='" + this.type + '\'' + ", subType='" + this.subType + '\'' + ", itemId='" + this.itemId + '\'' + '}';
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean compareId(String str) {
        return TextUtils.equals(str, this.itemId);
    }
}
