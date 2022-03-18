package com.bytedance.ee.bear.middleground.drive.export;

import android.os.Parcel;
import android.os.Parcelable;

public class ProgressingEntity implements Parcelable {
    public static final Parcelable.Creator<ProgressingEntity> CREATOR = new Parcelable.Creator<ProgressingEntity>() {
        /* class com.bytedance.ee.bear.middleground.drive.export.ProgressingEntity.C93571 */

        /* renamed from: a */
        public ProgressingEntity[] newArray(int i) {
            return new ProgressingEntity[i];
        }

        /* renamed from: a */
        public ProgressingEntity createFromParcel(Parcel parcel) {
            return new ProgressingEntity(parcel);
        }
    };

    /* renamed from: a */
    private String f25146a;

    /* renamed from: b */
    private String f25147b;

    /* renamed from: c */
    private int f25148c;

    /* renamed from: d */
    private int f25149d;

    /* renamed from: e */
    private String f25150e;

    /* renamed from: f */
    private String f25151f;

    public int describeContents() {
        return 0;
    }

    public ProgressingEntity() {
    }

    /* renamed from: a */
    public String mo35701a() {
        return this.f25146a;
    }

    /* renamed from: b */
    public String mo35704b() {
        return this.f25147b;
    }

    /* renamed from: c */
    public int mo35707c() {
        return this.f25148c;
    }

    /* renamed from: d */
    public int mo35709d() {
        return this.f25149d;
    }

    public String toString() {
        return "ProgressingEntity{name='" + this.f25146a + '\'' + ", fileId='" + this.f25147b + '\'' + ", progress=" + this.f25148c + ", status=" + this.f25149d + ", filePath='" + this.f25150e + '\'' + ", mountNodePoint='" + this.f25151f + '\'' + '}';
    }

    /* renamed from: a */
    public void mo35702a(int i) {
        this.f25148c = i;
    }

    /* renamed from: b */
    public void mo35705b(int i) {
        this.f25149d = i;
    }

    /* renamed from: c */
    public void mo35708c(String str) {
        this.f25150e = str;
    }

    /* renamed from: d */
    public void mo35710d(String str) {
        this.f25151f = str;
    }

    /* renamed from: a */
    public void mo35703a(String str) {
        this.f25146a = str;
    }

    /* renamed from: b */
    public void mo35706b(String str) {
        this.f25147b = str;
    }

    protected ProgressingEntity(Parcel parcel) {
        this.f25146a = parcel.readString();
        this.f25147b = parcel.readString();
        this.f25148c = parcel.readInt();
        this.f25149d = parcel.readInt();
        this.f25150e = parcel.readString();
        this.f25151f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25146a);
        parcel.writeString(this.f25147b);
        parcel.writeInt(this.f25148c);
        parcel.writeInt(this.f25149d);
        parcel.writeString(this.f25150e);
        parcel.writeString(this.f25151f);
    }
}
