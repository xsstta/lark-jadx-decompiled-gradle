package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.app.IWsApp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SsWsApp implements Parcelable, IWsApp {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new Parcelable.Creator<SsWsApp>() {
        /* class com.bytedance.common.wschannel.model.SsWsApp.C36681 */

        @Override // android.os.Parcelable.Creator
        public SsWsApp[] newArray(int i) {
            return new SsWsApp[i];
        }

        @Override // android.os.Parcelable.Creator
        public SsWsApp createFromParcel(Parcel parcel) {
            return new SsWsApp(parcel);
        }
    };
    private String appKey;
    private int channelId;
    private String extra;
    private int fPid;
    private int mAppId;
    private int mAppVersion;
    private String mDeviceId;
    private String mInstallId;
    private int mPlatform;
    private List<String> urls;

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getAppId() {
        return this.mAppId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String getAppKey() {
        return this.appKey;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getAppVersion() {
        return this.mAppVersion;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getChannelId() {
        return this.channelId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public List<String> getConnectUrls() {
        return this.urls;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String getDeviceId() {
        return this.mDeviceId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String getExtra() {
        return this.extra;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getFPID() {
        return this.fPid;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public String getInstallId() {
        return this.mInstallId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public int getPlatform() {
        return this.mPlatform;
    }

    protected SsWsApp() {
        this.urls = new ArrayList();
    }

    public static class SsWsAppBuilder {
        private int channelId;
        private int mAppId;
        private String mAppKey;
        private int mAppVersion;
        private String mDeviceId;
        private String mExtra;
        private int mFpid;
        private String mInstallId;
        private int mPlatform;
        private List<String> urls;

        public SsWsApp build() {
            return new SsWsApp(this.channelId, this.mAppId, this.mDeviceId, this.mInstallId, this.urls, this.mAppVersion, this.mPlatform, this.mFpid, this.mAppKey, this.mExtra);
        }

        public SsWsAppBuilder setAppId(int i) {
            this.mAppId = i;
            return this;
        }

        public SsWsAppBuilder setAppKey(String str) {
            this.mAppKey = str;
            return this;
        }

        public SsWsAppBuilder setAppVersion(int i) {
            this.mAppVersion = i;
            return this;
        }

        public SsWsAppBuilder setChannelId(int i) {
            this.channelId = i;
            return this;
        }

        public SsWsAppBuilder setConnectUrls(List<String> list) {
            this.urls = list;
            return this;
        }

        public SsWsAppBuilder setDeviceId(String str) {
            this.mDeviceId = str;
            return this;
        }

        public SsWsAppBuilder setExtra(String str) {
            this.mExtra = str;
            return this;
        }

        public SsWsAppBuilder setFPID(int i) {
            this.mFpid = i;
            return this;
        }

        public SsWsAppBuilder setInstallId(String str) {
            this.mInstallId = str;
            return this;
        }

        public SsWsAppBuilder setPlatform(int i) {
            this.mPlatform = i;
            return this;
        }

        public SsWsApp buildFromJson(JSONObject jSONObject) {
            SsWsApp ssWsApp = new SsWsApp();
            ssWsApp.parseFromJson(jSONObject);
            return ssWsApp;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = ((this.mAppId * 31) + this.channelId) * 31;
        String str = this.mDeviceId;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.mInstallId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.extra;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + this.mAppVersion) * 31) + this.mPlatform;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.channelId);
        jSONObject.put("app_id", this.mAppId);
        jSONObject.put("device_id", this.mDeviceId);
        jSONObject.put("install_id", this.mInstallId);
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.urls;
        if (list != null) {
            for (String str : list) {
                jSONArray.put(str);
            }
        }
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.mAppVersion);
        jSONObject.put("platform", this.mPlatform);
        jSONObject.put("fpid", this.fPid);
        jSONObject.put("app_kay", this.appKey);
        jSONObject.put("extra", this.extra);
        return jSONObject;
    }

    protected SsWsApp(Parcel parcel) {
        this.urls = new ArrayList();
        this.urls = parcel.createStringArrayList();
        this.channelId = parcel.readInt();
        this.extra = parcel.readString();
        this.mAppId = parcel.readInt();
        this.mDeviceId = parcel.readString();
        this.mInstallId = parcel.readString();
        this.mAppVersion = parcel.readInt();
        this.mPlatform = parcel.readInt();
        this.fPid = parcel.readInt();
        this.appKey = parcel.readString();
    }

    public void parseFromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.channelId = jSONObject.optInt("channel_id");
            this.mAppId = jSONObject.optInt("app_id");
            this.mDeviceId = jSONObject.optString("device_id");
            this.mInstallId = jSONObject.optString("install_id");
            this.mAppVersion = jSONObject.optInt("app_version");
            this.mPlatform = jSONObject.optInt("platform");
            this.fPid = jSONObject.optInt("fpid");
            this.appKey = jSONObject.optString("app_kay");
            this.extra = jSONObject.optString("extra");
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            this.urls.clear();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.urls.add(optJSONArray.optString(i));
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (!(this.channelId == ssWsApp.channelId && this.mAppId == ssWsApp.mAppId && this.mAppVersion == ssWsApp.mAppVersion && this.mPlatform == ssWsApp.mPlatform)) {
            return false;
        }
        String str = this.mDeviceId;
        if (str == null ? ssWsApp.mDeviceId != null : !str.equals(ssWsApp.mDeviceId)) {
            return false;
        }
        String str2 = this.mInstallId;
        if (str2 == null ? ssWsApp.mInstallId != null : !str2.equals(ssWsApp.mInstallId)) {
            return false;
        }
        if (this.fPid != ssWsApp.fPid) {
            return false;
        }
        String str3 = this.appKey;
        if (str3 == null ? ssWsApp.appKey != null : !str3.equals(ssWsApp.appKey)) {
            return false;
        }
        if (this.urls.size() != ssWsApp.urls.size()) {
            return false;
        }
        for (String str4 : this.urls) {
            if (!ssWsApp.urls.contains(str4)) {
                return false;
            }
        }
        return StringUtils.equal(this.extra, ssWsApp.extra);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.urls);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.extra);
        parcel.writeInt(this.mAppId);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mInstallId);
        parcel.writeInt(this.mAppVersion);
        parcel.writeInt(this.mPlatform);
        parcel.writeInt(this.fPid);
        parcel.writeString(this.appKey);
    }

    private SsWsApp(int i, int i2, String str, String str2, List<String> list, int i3, int i4, int i5, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.urls = arrayList;
        this.mAppId = i2;
        this.channelId = i;
        this.mDeviceId = str;
        this.mInstallId = str2;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.mAppVersion = i3;
        this.mPlatform = i4;
        this.fPid = i5;
        this.appKey = str3;
        this.extra = str4;
    }
}
