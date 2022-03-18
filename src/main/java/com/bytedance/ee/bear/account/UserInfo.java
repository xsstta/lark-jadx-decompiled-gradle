package com.bytedance.ee.bear.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.account.NetContract;
import java.io.Serializable;

public class UserInfo extends NetContract.Result implements Serializable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
        /* class com.bytedance.ee.bear.account.UserInfo.C41621 */

        /* renamed from: a */
        public UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }

        /* renamed from: a */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }
    };
    public String avatarUrl = "";
    public boolean canCreateSheet;
    public boolean canCross;
    public String cnName = "";
    public String departmentId = "";
    public String domain;
    public String email = "";
    public String enName = "";
    public String id = "";
    public boolean isManager;
    public boolean isSingleproduct;
    public String mobile = "";
    public String suid = "";
    public String tenantId = "";
    public String tenantName = "";
    public String tenantTag;

    @Override // com.bytedance.ee.bear.account.NetContract.Result
    public int describeContents() {
        return 0;
    }

    public UserInfo() {
    }

    public String toString() {
        return "UserInfo{id='" + this.id + '\'' + ", cnName='" + this.cnName + '\'' + '}';
    }

    protected UserInfo(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        boolean z3;
        this.id = parcel.readString();
        this.cnName = parcel.readString();
        this.enName = parcel.readString();
        this.email = parcel.readString();
        this.mobile = parcel.readString();
        this.avatarUrl = parcel.readString();
        this.suid = parcel.readString();
        this.tenantName = parcel.readString();
        this.tenantId = parcel.readString();
        this.departmentId = parcel.readString();
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.canCreateSheet = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.canCross = z2;
        this.domain = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSingleproduct = z3;
        this.tenantTag = parcel.readString();
        this.isManager = parcel.readByte() == 0 ? false : z4;
    }

    @Override // com.bytedance.ee.bear.account.NetContract.Result
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeString(this.cnName);
        parcel.writeString(this.enName);
        parcel.writeString(this.email);
        parcel.writeString(this.mobile);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.suid);
        parcel.writeString(this.tenantName);
        parcel.writeString(this.tenantId);
        parcel.writeString(this.departmentId);
        parcel.writeByte(this.canCreateSheet ? (byte) 1 : 0);
        parcel.writeByte(this.canCross ? (byte) 1 : 0);
        parcel.writeString(this.domain);
        parcel.writeByte(this.isSingleproduct ? (byte) 1 : 0);
        parcel.writeString(this.tenantTag);
        parcel.writeByte(this.isManager ? (byte) 1 : 0);
    }
}
