package com.bytedance.ee.bear.share.export;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;

public class OwnerInfo implements Parcelable, NonProguard {
    public static final Parcelable.Creator<OwnerInfo> CREATOR = new Parcelable.Creator<OwnerInfo>() {
        /* class com.bytedance.ee.bear.share.export.OwnerInfo.C110011 */

        /* renamed from: a */
        public OwnerInfo[] newArray(int i) {
            return new OwnerInfo[i];
        }

        /* renamed from: a */
        public OwnerInfo createFromParcel(Parcel parcel) {
            return new OwnerInfo(parcel);
        }
    };
    private boolean admin_can_cross;
    private String avatar_url;
    private boolean can_apply_perm;
    private String cn_name;
    private String email;
    private String en_name;
    private String id;
    private String mobile;
    private String name;
    private String suid;
    private String tenant_id;
    private String tenant_name;

    public int describeContents() {
        return 0;
    }

    public OwnerInfo() {
    }

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public String getCn_name() {
        return this.cn_name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEn_name() {
        return this.en_name;
    }

    public String getId() {
        return this.id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getSuid() {
        return this.suid;
    }

    public String getTenant_id() {
        return this.tenant_id;
    }

    public String getTenant_name() {
        return this.tenant_name;
    }

    public boolean isAdmin_can_cross() {
        return this.admin_can_cross;
    }

    public boolean isCan_apply_perm() {
        return this.can_apply_perm;
    }

    public String toString() {
        return "OwnerInfo{admin_can_cross=" + this.admin_can_cross + '}';
    }

    public void setAdmin_can_cross(boolean z) {
        this.admin_can_cross = z;
    }

    public void setAvatar_url(String str) {
        this.avatar_url = str;
    }

    public void setCan_apply_perm(boolean z) {
        this.can_apply_perm = z;
    }

    public void setCn_name(String str) {
        this.cn_name = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEn_name(String str) {
        this.en_name = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSuid(String str) {
        this.suid = str;
    }

    public void setTenant_id(String str) {
        this.tenant_id = str;
    }

    public void setTenant_name(String str) {
        this.tenant_name = str;
    }

    protected OwnerInfo(Parcel parcel) {
        boolean z;
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.cn_name = parcel.readString();
        this.en_name = parcel.readString();
        this.email = parcel.readString();
        this.mobile = parcel.readString();
        this.suid = parcel.readString();
        this.avatar_url = parcel.readString();
        this.tenant_name = parcel.readString();
        this.tenant_id = parcel.readString();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.can_apply_perm = z;
        this.admin_can_cross = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.cn_name);
        parcel.writeString(this.en_name);
        parcel.writeString(this.email);
        parcel.writeString(this.mobile);
        parcel.writeString(this.suid);
        parcel.writeString(this.avatar_url);
        parcel.writeString(this.tenant_name);
        parcel.writeString(this.tenant_id);
        parcel.writeByte(this.can_apply_perm ? (byte) 1 : 0);
        parcel.writeByte(this.admin_can_cross ? (byte) 1 : 0);
    }
}
