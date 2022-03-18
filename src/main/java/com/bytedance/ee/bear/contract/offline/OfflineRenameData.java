package com.bytedance.ee.bear.contract.offline;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class OfflineRenameData implements Parcelable, Serializable {
    public static final Parcelable.Creator<OfflineRenameData> CREATOR = new Parcelable.Creator<OfflineRenameData>() {
        /* class com.bytedance.ee.bear.contract.offline.OfflineRenameData.C52091 */

        /* renamed from: a */
        public OfflineRenameData[] newArray(int i) {
            return new OfflineRenameData[i];
        }

        /* renamed from: a */
        public OfflineRenameData createFromParcel(Parcel parcel) {
            return new OfflineRenameData(parcel);
        }
    };
    private String editTime;
    private String newName;
    private String objToken;
    private String wikiToken;

    public int describeContents() {
        return 0;
    }

    public OfflineRenameData() {
    }

    public String getEditTime() {
        return this.editTime;
    }

    public String getNewName() {
        return this.newName;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public String getWikiToken() {
        return this.wikiToken;
    }

    public String toString() {
        return "OfflineRenameData{, editTime='" + this.editTime + '\'' + '}';
    }

    public void setEditTime(String str) {
        this.editTime = str;
    }

    public void setNewName(String str) {
        this.newName = str;
    }

    public void setObjToken(String str) {
        this.objToken = str;
    }

    public void setWikiToken(String str) {
        this.wikiToken = str;
    }

    protected OfflineRenameData(Parcel parcel) {
        this.wikiToken = parcel.readString();
        this.objToken = parcel.readString();
        this.newName = parcel.readString();
        this.editTime = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.wikiToken);
        parcel.writeString(this.objToken);
        parcel.writeString(this.newName);
        parcel.writeString(this.editTime);
    }
}
