package com.ss.android.appcenter.business.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.openplatform.v1.App;
import java.io.Serializable;

public class AppInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Parcelable.Creator<AppInfo>() {
        /* class com.ss.android.appcenter.business.dto.AppInfo.C276891 */

        /* renamed from: a */
        public AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }

        /* renamed from: a */
        public AppInfo createFromParcel(Parcel parcel) {
            return new AppInfo(parcel);
        }
    };
    private String appId;
    private AppType appType;
    private String botId;
    private String category_id;
    private String description;
    private String icon_key;
    private String id;
    private String imageUrl;
    private String name;
    private Status status;
    private String url;
    private int weight;

    public int describeContents() {
        return 0;
    }

    public AppInfo() {
    }

    public String getAppId() {
        return this.appId;
    }

    public AppType getAppType() {
        return this.appType;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getCategory_id() {
        return this.category_id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIcon_key() {
        return this.icon_key;
    }

    public String getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getItemType() {
        return Integer.parseInt(this.category_id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "AppInfo{id='" + this.id + '\'' + ", icon_key='" + this.icon_key + '\'' + ", name='" + this.name + '\'' + ", url='" + this.url + '\'' + ", description='" + this.description + '\'' + ", appType=" + this.appType + ", botId='" + this.botId + '\'' + ", appId='" + this.appId + '\'' + ", status=" + this.status + '}';
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppType(AppType appType2) {
        this.appType = appType2;
    }

    public void setBotId(String str) {
        this.botId = str;
    }

    public void setCategory_id(String str) {
        this.category_id = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon_key(String str) {
        this.icon_key = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.id.equals(((AppInfo) obj).getId());
        }
        return false;
    }

    protected AppInfo(Parcel parcel) {
        this.id = parcel.readString();
        this.category_id = parcel.readString();
        this.icon_key = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.weight = parcel.readInt();
        this.description = parcel.readString();
        this.appType = AppType.fromValue(parcel.readInt());
        this.botId = parcel.readString();
        this.appId = parcel.readString();
        this.status = Status.fromValue(parcel.readInt());
    }

    public static AppInfo convertAppToAppInfo(App app) {
        if (app == null) {
            return null;
        }
        AppInfo appInfo = new AppInfo();
        appInfo.setDescription(app.description);
        appInfo.setId(app.id);
        appInfo.setAppType(AppType.fromValue(app.app_type.getValue()));
        appInfo.setCategory_id(app.category_id);
        appInfo.setIcon_key(app.icon_key);
        appInfo.setName(app.name);
        appInfo.setUrl(app.url);
        appInfo.setWeight(app.weight.intValue());
        appInfo.setBotId(app.bot_id);
        appInfo.setAppId(app.app_id);
        appInfo.setStatus(Status.fromValue(app.status.getValue()));
        appInfo.setImageUrl(app.image_url);
        return appInfo;
    }

    public boolean compareExactly(AppInfo appInfo) {
        if (appInfo == null) {
            return false;
        }
        if (this == appInfo) {
            return true;
        }
        if (TextUtils.equals(getId(), appInfo.getId()) && TextUtils.equals(getName(), appInfo.getName()) && TextUtils.equals(getCategory_id(), appInfo.getCategory_id()) && TextUtils.equals(getIcon_key(), appInfo.getIcon_key()) && TextUtils.equals(getUrl(), appInfo.getUrl())) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.category_id);
        parcel.writeString(this.icon_key);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeInt(this.weight);
        parcel.writeString(this.description);
        parcel.writeInt(this.appType.getValue());
        parcel.writeString(this.botId);
        parcel.writeString(this.appId);
        parcel.writeInt(this.status.getValue());
    }

    public AppInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, AppType appType2, String str7, String str8, int i2) {
        this.id = str;
        this.category_id = str2;
        this.icon_key = str3;
        this.name = str4;
        this.url = str5;
        this.weight = i;
        this.description = str6;
        this.appType = appType2;
        this.botId = str7;
        this.appId = str8;
        this.status = Status.fromValue(i2);
    }
}
