package com.bytedance.ee.bear.contract.offline;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ModifyDocBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<ModifyDocBean> CREATOR = new Parcelable.Creator<ModifyDocBean>() {
        /* class com.bytedance.ee.bear.contract.offline.ModifyDocBean.C52071 */

        /* renamed from: a */
        public ModifyDocBean[] newArray(int i) {
            return new ModifyDocBean[i];
        }

        /* renamed from: a */
        public ModifyDocBean createFromParcel(Parcel parcel) {
            return new ModifyDocBean(parcel);
        }
    };
    private String fakeToken;
    private boolean isModifyFakeToken;
    private boolean isModifyFolder;

    public int describeContents() {
        return 0;
    }

    public ModifyDocBean() {
    }

    public String getFakeToken() {
        return this.fakeToken;
    }

    public boolean isModifyFakeToken() {
        return this.isModifyFakeToken;
    }

    public boolean isModifyFolder() {
        return this.isModifyFolder;
    }

    public String toString() {
        return "ModifyDocBean{fakeToken='" + this.fakeToken + '\'' + ", isModifyFakeToken=" + this.isModifyFakeToken + ", isModifyFolder=" + this.isModifyFolder + '}';
    }

    public void setFakeToken(String str) {
        this.fakeToken = str;
    }

    public void setModifyFakeToken(boolean z) {
        this.isModifyFakeToken = z;
    }

    public void setModifyFolder(boolean z) {
        this.isModifyFolder = z;
    }

    protected ModifyDocBean(Parcel parcel) {
        boolean z;
        this.fakeToken = parcel.readString();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isModifyFakeToken = z;
        this.isModifyFolder = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fakeToken);
        parcel.writeByte(this.isModifyFakeToken ? (byte) 1 : 0);
        parcel.writeByte(this.isModifyFolder ? (byte) 1 : 0);
    }
}
