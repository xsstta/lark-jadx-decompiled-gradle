package com.ss.android.appcenter.business.dto;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;

public class BotInnerInfo implements Serializable {
    @SerializedName("can_edit")
    private boolean mCanEdit;
    @SerializedName("default_value")
    private String mDefaultValue;
    @SerializedName("field_key")
    private String mFieldKey;
    @SerializedName("field_value")
    private String mFieldValue;
    @SerializedName("type_name")
    private String mName;
    @SerializedName("need_submit")
    private boolean mNeedSubmit;
    @SerializedName("reg")
    private String mReg;
    @SerializedName(ShareHitPoint.f121869d)
    private String mType;

    public String getDefaultValue() {
        return this.mDefaultValue;
    }

    public String getFieldKey() {
        return this.mFieldKey;
    }

    public String getFieldValue() {
        return this.mFieldValue;
    }

    public String getName() {
        return this.mName;
    }

    public String getReg() {
        return this.mReg;
    }

    public String getmType() {
        return this.mType;
    }

    public boolean isCanEdit() {
        return this.mCanEdit;
    }

    public boolean isNeedSubmit() {
        return this.mNeedSubmit;
    }

    public String toString() {
        return "BotInnerInfo{mCanEdit=" + this.mCanEdit + ", mFieldKey='" + this.mFieldKey + '\'' + ", mFieldValue='" + this.mFieldValue + '\'' + ", mName='" + this.mName + '\'' + ", mNeedSubmit=" + this.mNeedSubmit + ", mReg='" + this.mReg + '\'' + ", mType='" + this.mType + '\'' + ", mDefaultValue='" + this.mDefaultValue + '\'' + '}';
    }

    public void setCanEdit(boolean z) {
        this.mCanEdit = z;
    }

    public void setDefaultValue(String str) {
        this.mDefaultValue = str;
    }

    public void setFieldKey(String str) {
        this.mFieldKey = str;
    }

    public void setFieldValue(String str) {
        this.mFieldValue = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setNeedSubmit(boolean z) {
        this.mNeedSubmit = z;
    }

    public void setReg(String str) {
        this.mReg = str;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
