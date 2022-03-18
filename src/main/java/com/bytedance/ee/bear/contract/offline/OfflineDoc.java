package com.bytedance.ee.bear.contract.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class OfflineDoc implements Parcelable, NonProguard, Cloneable {
    public static final Parcelable.Creator<OfflineDoc> CREATOR = new Parcelable.Creator<OfflineDoc>() {
        /* class com.bytedance.ee.bear.contract.offline.OfflineDoc.C52081 */

        /* renamed from: a */
        public OfflineDoc[] newArray(int i) {
            return new OfflineDoc[i];
        }

        /* renamed from: a */
        public OfflineDoc createFromParcel(Parcel parcel) {
            return new OfflineDoc(parcel);
        }
    };
    String TAB_OTHER;
    private String edit_time;
    private String fakeToken;
    private String filepath;
    private int force_update;
    private String from_source;
    private int id;
    private boolean isWifiOnly;
    private String name;
    private String obj_token;
    private boolean onlyPreLoadFeed;
    private int priority;
    private int syncState;
    private String token;
    private int type;
    private String url;

    public int describeContents() {
        return 0;
    }

    public String getEdit_time() {
        return this.edit_time;
    }

    public String getFakeToken() {
        return this.fakeToken;
    }

    public String getFilepath() {
        return this.filepath;
    }

    public int getForce_update() {
        return this.force_update;
    }

    public String getFrom_source() {
        return this.from_source;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getObj_token() {
        return this.obj_token;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getSyncState() {
        return this.syncState;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isOnlyPreLoadFeed() {
        return this.onlyPreLoadFeed;
    }

    public boolean isWifiOnly() {
        return this.isWifiOnly;
    }

    @Override // java.lang.Object
    public OfflineDoc clone() {
        try {
            return (OfflineDoc) super.clone();
        } catch (Throwable th) {
            C13479a.m54761a("offlinedoc", th);
            return null;
        }
    }

    public OfflineDoc() {
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
    }

    public int hashCode() {
        if (!TextUtils.isEmpty(this.token)) {
            return this.token.hashCode();
        }
        if (!TextUtils.isEmpty(this.obj_token)) {
            return this.obj_token.hashCode();
        }
        if (!TextUtils.isEmpty(this.fakeToken)) {
            return this.fakeToken.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "OfflineDoc{id=" + this.id + ", priority=" + this.priority + ", syncState=" + this.syncState + ", onlyPreLoadFeed=" + this.onlyPreLoadFeed + ", type=" + this.type + ", force_update=" + this.force_update + ", isWifiOnly=" + this.isWifiOnly + ", from_source=" + this.from_source + '}';
    }

    public void setEdit_time(String str) {
        this.edit_time = str;
    }

    public void setFakeToken(String str) {
        this.fakeToken = str;
    }

    public void setFilepath(String str) {
        this.filepath = str;
    }

    public void setForce_update(int i) {
        this.force_update = i;
    }

    public void setFrom_source(String str) {
        this.from_source = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setObj_token(String str) {
        this.obj_token = str;
    }

    public void setOnlyPreLoadFeed(boolean z) {
        this.onlyPreLoadFeed = z;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setSyncState(int i) {
        this.syncState = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWifiOnly(boolean z) {
        this.isWifiOnly = z;
    }

    protected OfflineDoc(Parcel parcel) {
        boolean z;
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        boolean z2 = false;
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
        this.id = parcel.readInt();
        this.fakeToken = parcel.readString();
        this.filepath = parcel.readString();
        this.name = parcel.readString();
        this.token = parcel.readString();
        this.edit_time = parcel.readString();
        this.obj_token = parcel.readString();
        this.url = parcel.readString();
        this.priority = parcel.readInt();
        this.syncState = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyPreLoadFeed = z;
        this.type = parcel.readInt();
        this.force_update = parcel.readInt();
        this.isWifiOnly = parcel.readByte() != 0 ? true : z2;
        this.from_source = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineDoc)) {
            return false;
        }
        OfflineDoc offlineDoc = (OfflineDoc) obj;
        if (!TextUtils.isEmpty(this.obj_token) && !TextUtils.isEmpty(offlineDoc.obj_token)) {
            return this.obj_token.equals(offlineDoc.obj_token);
        }
        if (!TextUtils.isEmpty(this.fakeToken) && !TextUtils.isEmpty(offlineDoc.fakeToken)) {
            return this.fakeToken.equals(offlineDoc.fakeToken);
        }
        if (TextUtils.isEmpty(this.token) || TextUtils.isEmpty(offlineDoc.token)) {
            return false;
        }
        return this.token.equals(offlineDoc.token);
    }

    public OfflineDoc(String str, int i) {
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
        this.token = str;
        this.type = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.fakeToken);
        parcel.writeString(this.filepath);
        parcel.writeString(this.name);
        parcel.writeString(this.token);
        parcel.writeString(this.edit_time);
        parcel.writeString(this.obj_token);
        parcel.writeString(this.url);
        parcel.writeInt(this.priority);
        parcel.writeInt(this.syncState);
        parcel.writeByte(this.onlyPreLoadFeed ? (byte) 1 : 0);
        parcel.writeInt(this.type);
        parcel.writeInt(this.force_update);
        parcel.writeByte(this.isWifiOnly ? (byte) 1 : 0);
        parcel.writeString(this.from_source);
    }

    public OfflineDoc(String str, String str2, int i, String str3) {
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
        this.obj_token = str;
        this.url = str2;
        this.type = i;
        this.from_source = str3;
    }

    public OfflineDoc(String str, String str2, int i, String str3, int i2) {
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
        this.obj_token = str;
        this.url = str2;
        this.type = i;
        this.force_update = i2;
        this.from_source = str3;
    }

    public OfflineDoc(String str, String str2, int i, String str3, boolean z) {
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
        this.obj_token = str;
        this.url = str2;
        this.type = i;
        this.isWifiOnly = z;
        this.from_source = str3;
    }

    public OfflineDoc(String str, String str2, String str3, int i, int i2) {
        this.priority = OfflineDocsPriority.Low_Priority.ordinal();
        this.force_update = 0;
        this.isWifiOnly = false;
        this.TAB_OTHER = "tab_other";
        this.from_source = "tab_other";
        this.onlyPreLoadFeed = false;
        this.obj_token = str;
        this.url = str3;
        this.priority = i;
        this.fakeToken = str2;
        this.type = i2;
    }
}
