package com.ss.android.appcenter.business.dto;

import com.google.firebase.messaging.Constants;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class BotInfo implements Serializable {
    @SerializedName("bot_name")
    private String mBotName;
    @SerializedName("bot_type")
    private String mBotType;
    @SerializedName("bot_type_id")
    private String mBotTypeId;
    @SerializedName("code")
    private int mCode;
    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private JsonObject mData;
    @SerializedName("enum_bot_type")
    private int mEnumBotType;
    @SerializedName("fields")
    private JsonArray mFields;
    @SerializedName("is_finished")
    private boolean mIsFinished;
    @SerializedName("msg")
    private String mMsg;
    @SerializedName("no_permission")
    private boolean mNoPermission;
    @SerializedName("ok")
    private boolean mOK;
    @SerializedName("show_check_mender")
    private boolean mShowCheckMender;
    @SerializedName("step")
    private int mStep;
    @SerializedName("tenant_id")
    private String mTenantId;
    @SerializedName("tips")
    private JsonArray mTips;
    @SerializedName("total_steps")
    private int mTotalSteps;
    @SerializedName("uid")
    private String mUid;
    @SerializedName("usage")
    private boolean mUsage;

    public String getBotName() {
        return this.mBotName;
    }

    public String getBotType() {
        return this.mBotType;
    }

    public String getBotTypeId() {
        return this.mBotTypeId;
    }

    public int getCode() {
        return this.mCode;
    }

    public JsonObject getData() {
        return this.mData;
    }

    public int getEnumBotType() {
        return this.mEnumBotType;
    }

    public JsonArray getFields() {
        return this.mFields;
    }

    public String getMsg() {
        return this.mMsg;
    }

    public int getStep() {
        return this.mStep;
    }

    public String getTenantId() {
        return this.mTenantId;
    }

    public JsonArray getTips() {
        return this.mTips;
    }

    public int getTotalSteps() {
        return this.mTotalSteps;
    }

    public String getUid() {
        return this.mUid;
    }

    public boolean isIsFinished() {
        return this.mIsFinished;
    }

    public boolean isNoPermission() {
        return this.mNoPermission;
    }

    public boolean isOK() {
        return this.mOK;
    }

    public boolean isShowCheckMender() {
        return this.mShowCheckMender;
    }

    public boolean isUsage() {
        return this.mUsage;
    }

    public String toString() {
        return "BotInfo{mBotName='" + this.mBotName + '\'' + ", mBotType='" + this.mBotType + '\'' + ", mBotTypeId='" + this.mBotTypeId + '\'' + ", mEnumBotType=" + this.mEnumBotType + ", mIsFinished=" + this.mIsFinished + ", mNoPermission=" + this.mNoPermission + ", mOK=" + this.mOK + ", mStep=" + this.mStep + ", mTenantId='" + this.mTenantId + '\'' + ", mTotalSteps=" + this.mTotalSteps + ", mUid='" + this.mUid + '\'' + ", mUsage=" + this.mUsage + ", mFields=" + this.mFields + ", mTips=" + this.mTips + ", mShowCheckMender=" + this.mShowCheckMender + ", mCode=" + this.mCode + ", mMsg='" + this.mMsg + '\'' + ", mData=" + this.mData + '}';
    }

    public void setBotName(String str) {
        this.mBotName = str;
    }

    public void setBotType(String str) {
        this.mBotType = str;
    }

    public void setBotTypeId(String str) {
        this.mBotTypeId = str;
    }

    public void setCode(int i) {
        this.mCode = i;
    }

    public void setData(JsonObject jsonObject) {
        this.mData = jsonObject;
    }

    public void setEnumBotType(int i) {
        this.mEnumBotType = i;
    }

    public void setFields(JsonArray jsonArray) {
        this.mFields = jsonArray;
    }

    public void setIsFinished(boolean z) {
        this.mIsFinished = z;
    }

    public void setMsg(String str) {
        this.mMsg = str;
    }

    public void setNoPermission(boolean z) {
        this.mNoPermission = z;
    }

    public void setOK(boolean z) {
        this.mOK = z;
    }

    public void setShowCheckMender(boolean z) {
        this.mShowCheckMender = z;
    }

    public void setStep(int i) {
        this.mStep = i;
    }

    public void setTenantId(String str) {
        this.mTenantId = str;
    }

    public void setTips(JsonArray jsonArray) {
        this.mTips = jsonArray;
    }

    public void setTotalSteps(int i) {
        this.mTotalSteps = i;
    }

    public void setUid(String str) {
        this.mUid = str;
    }

    public void setUsage(boolean z) {
        this.mUsage = z;
    }
}
