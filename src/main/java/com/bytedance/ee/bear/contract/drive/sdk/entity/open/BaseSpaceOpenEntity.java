package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;

public class BaseSpaceOpenEntity extends BaseOpenEntity {
    public static final Parcelable.Creator<BaseSpaceOpenEntity> CREATOR = new Parcelable.Creator<BaseSpaceOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity.C51571 */

        /* renamed from: a */
        public BaseSpaceOpenEntity[] newArray(int i) {
            return new BaseSpaceOpenEntity[i];
        }

        /* renamed from: a */
        public BaseSpaceOpenEntity createFromParcel(Parcel parcel) {
            return new BaseSpaceOpenEntity(parcel);
        }
    };
    private String businessId = "";
    private String dataVersion = "";
    private String mountNodeToken = "";
    private String mountPoint = "";
    private String version = "";

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public int describeContents() {
        return 0;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getDataVersion() {
        return this.dataVersion;
    }

    public String getMountNodeToken() {
        return this.mountNodeToken;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public String getMountPoint() {
        return this.mountPoint;
    }

    public String getVersion() {
        return this.version;
    }

    public void setBusinessId(String str) {
        this.businessId = str;
    }

    public void setDataVersion(String str) {
        this.dataVersion = str;
    }

    public void setMountNodeToken(String str) {
        this.mountNodeToken = str;
    }

    public void setMountPoint(String str) {
        this.mountPoint = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void readFromParcel(Parcel parcel) {
        this.mountNodeToken = parcel.readString();
        this.mountPoint = parcel.readString();
        this.businessId = parcel.readString();
        this.version = parcel.readString();
        this.dataVersion = parcel.readString();
    }

    protected BaseSpaceOpenEntity(Parcel parcel) {
        super(parcel);
        this.mountNodeToken = parcel.readString();
        this.mountPoint = parcel.readString();
        this.businessId = parcel.readString();
        this.version = parcel.readString();
        this.dataVersion = parcel.readString();
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mountNodeToken);
        parcel.writeString(this.mountPoint);
        parcel.writeString(this.businessId);
        parcel.writeString(this.version);
        parcel.writeString(this.dataVersion);
    }

    BaseSpaceOpenEntity(String str, String str2, String str3) {
        super(str, str2, str3, null, null);
    }
}
