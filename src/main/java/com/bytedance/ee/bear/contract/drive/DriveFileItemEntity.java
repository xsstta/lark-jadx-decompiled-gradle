package com.bytedance.ee.bear.contract.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;

public class DriveFileItemEntity implements Parcelable, NonProguard {
    public static final Parcelable.Creator<DriveFileItemEntity> CREATOR = new Parcelable.Creator<DriveFileItemEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.DriveFileItemEntity.C51331 */

        /* renamed from: a */
        public DriveFileItemEntity[] newArray(int i) {
            return new DriveFileItemEntity[i];
        }

        /* renamed from: a */
        public DriveFileItemEntity createFromParcel(Parcel parcel) {
            return new DriveFileItemEntity(parcel);
        }
    };
    private String extra = "";
    private boolean hasCache;
    private String mountNodePoint = "";
    private String mountPoint = "";
    private String name;
    private String objToken;
    private String subType;
    private String url;

    public int describeContents() {
        return 0;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getMountNodePoint() {
        return this.mountNodePoint;
    }

    public String getMountPoint() {
        return this.mountPoint;
    }

    public String getName() {
        return this.name;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isHasCache() {
        return this.hasCache;
    }

    public DriveFileItemEntity() {
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHasCache(boolean z) {
        this.hasCache = z;
    }

    public void setMountNodePoint(String str) {
        this.mountNodePoint = str;
    }

    public void setMountPoint(String str) {
        this.mountPoint = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setObjToken(String str) {
        this.objToken = str;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    protected DriveFileItemEntity(Parcel parcel) {
        boolean z;
        this.name = parcel.readString();
        this.objToken = parcel.readString();
        this.subType = parcel.readString();
        this.url = parcel.readString();
        this.mountNodePoint = parcel.readString();
        this.mountPoint = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasCache = z;
        this.extra = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.objToken);
        parcel.writeString(this.subType);
        parcel.writeString(this.url);
        parcel.writeString(this.mountNodePoint);
        parcel.writeString(this.mountPoint);
        parcel.writeByte(this.hasCache ? (byte) 1 : 0);
        parcel.writeString(this.extra);
    }
}
