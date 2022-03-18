package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;

public class PreloadEntity implements Parcelable {
    public static final Parcelable.Creator<PreloadEntity> CREATOR = new Parcelable.Creator<PreloadEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.PreloadEntity.C51611 */

        /* renamed from: a */
        public PreloadEntity[] newArray(int i) {
            return new PreloadEntity[i];
        }

        /* renamed from: a */
        public PreloadEntity createFromParcel(Parcel parcel) {
            return new PreloadEntity(parcel);
        }
    };

    /* renamed from: a */
    private String f14894a;

    /* renamed from: b */
    private String f14895b;

    /* renamed from: c */
    private String f14896c;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo20601a() {
        return this.f14894a;
    }

    /* renamed from: b */
    public String mo20602b() {
        return this.f14895b;
    }

    /* renamed from: c */
    public String mo20603c() {
        return this.f14896c;
    }

    protected PreloadEntity(Parcel parcel) {
        this.f14894a = parcel.readString();
        this.f14895b = parcel.readString();
        this.f14896c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14894a);
        parcel.writeString(this.f14895b);
        parcel.writeString(this.f14896c);
    }
}
