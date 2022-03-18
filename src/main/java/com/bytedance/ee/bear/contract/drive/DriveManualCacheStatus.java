package com.bytedance.ee.bear.contract.drive;

import android.os.Parcel;
import android.os.Parcelable;

public class DriveManualCacheStatus implements Parcelable {
    public static final Parcelable.Creator<DriveManualCacheStatus> CREATOR = new Parcelable.Creator<DriveManualCacheStatus>() {
        /* class com.bytedance.ee.bear.contract.drive.DriveManualCacheStatus.C51341 */

        /* renamed from: a */
        public DriveManualCacheStatus[] newArray(int i) {
            return new DriveManualCacheStatus[i];
        }

        /* renamed from: a */
        public DriveManualCacheStatus createFromParcel(Parcel parcel) {
            return new DriveManualCacheStatus(parcel);
        }
    };

    /* renamed from: a */
    private String f14867a = "";

    /* renamed from: b */
    private int f14868b;

    /* renamed from: c */
    private int f14869c;

    /* renamed from: d */
    private String f14870d = "";

    /* renamed from: e */
    private long f14871e;

    /* renamed from: f */
    private String f14872f = "";

    /* renamed from: g */
    private String f14873g = "";

    /* renamed from: h */
    private int f14874h;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo20377a() {
        return this.f14868b;
    }

    /* renamed from: b */
    public long mo20381b() {
        return this.f14871e;
    }

    /* renamed from: c */
    public int mo20384c() {
        return this.f14874h;
    }

    public DriveManualCacheStatus() {
    }

    public String toString() {
        return "DriveManualCacheStatus{, status=" + this.f14868b + ", progress=" + this.f14869c + ", msg='" + this.f14870d + '\'' + ", fileSize=" + this.f14871e + ", subType='" + this.f14872f + '\'' + ", url='" + this.f14873g + '\'' + ", errorCode=" + this.f14874h + '}';
    }

    /* renamed from: d */
    public void mo20387d(String str) {
        this.f14873g = str;
    }

    /* renamed from: a */
    public void mo20378a(int i) {
        this.f14868b = i;
    }

    /* renamed from: b */
    public void mo20382b(int i) {
        this.f14869c = i;
    }

    /* renamed from: c */
    public DriveManualCacheStatus mo20385c(int i) {
        this.f14874h = i;
        return this;
    }

    /* renamed from: a */
    public void mo20379a(long j) {
        this.f14871e = j;
    }

    /* renamed from: b */
    public void mo20383b(String str) {
        this.f14870d = str;
    }

    /* renamed from: c */
    public void mo20386c(String str) {
        this.f14872f = str;
    }

    /* renamed from: a */
    public void mo20380a(String str) {
        this.f14867a = str;
    }

    protected DriveManualCacheStatus(Parcel parcel) {
        this.f14867a = parcel.readString();
        this.f14868b = parcel.readInt();
        this.f14869c = parcel.readInt();
        this.f14870d = parcel.readString();
        this.f14871e = parcel.readLong();
        this.f14872f = parcel.readString();
        this.f14873g = parcel.readString();
        this.f14874h = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14867a);
        parcel.writeInt(this.f14868b);
        parcel.writeInt(this.f14869c);
        parcel.writeString(this.f14870d);
        parcel.writeLong(this.f14871e);
        parcel.writeString(this.f14872f);
        parcel.writeString(this.f14873g);
        parcel.writeInt(this.f14874h);
    }
}
