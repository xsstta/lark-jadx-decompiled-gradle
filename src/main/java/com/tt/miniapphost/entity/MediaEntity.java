package com.tt.miniapphost.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaEntity implements Parcelable {
    public static final Parcelable.Creator<MediaEntity> CREATOR = new Parcelable.Creator<MediaEntity>() {
        /* class com.tt.miniapphost.entity.MediaEntity.C675191 */

        /* renamed from: a */
        public MediaEntity[] newArray(int i) {
            return new MediaEntity[i];
        }

        /* renamed from: a */
        public MediaEntity createFromParcel(Parcel parcel) {
            return new MediaEntity(parcel);
        }
    };

    /* renamed from: a */
    public String f170268a;

    /* renamed from: b */
    public String f170269b;

    /* renamed from: c */
    public long f170270c;

    /* renamed from: d */
    public int f170271d;

    /* renamed from: e */
    public long f170272e;

    /* renamed from: f */
    public int f170273f;

    /* renamed from: g */
    public String f170274g;

    public int describeContents() {
        return 0;
    }

    protected MediaEntity(Parcel parcel) {
        this.f170268a = parcel.readString();
        this.f170269b = parcel.readString();
        this.f170270c = parcel.readLong();
        this.f170271d = parcel.readInt();
        this.f170272e = parcel.readLong();
        this.f170273f = parcel.readInt();
        this.f170274g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170268a);
        parcel.writeString(this.f170269b);
        parcel.writeLong(this.f170270c);
        parcel.writeInt(this.f170271d);
        parcel.writeLong(this.f170272e);
        parcel.writeInt(this.f170273f);
        parcel.writeString(this.f170274g);
    }

    public MediaEntity(String str, String str2, long j, int i, long j2, int i2, String str3) {
        this.f170268a = str;
        this.f170269b = str2;
        this.f170270c = j;
        this.f170271d = i;
        this.f170272e = j2;
        this.f170273f = i2;
        this.f170274g = str3;
    }
}
