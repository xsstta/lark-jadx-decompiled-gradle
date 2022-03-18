package com.bytedance.ee.bear.contract.drive;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class DriveOfflineDoc implements Parcelable {
    public static final Parcelable.Creator<DriveOfflineDoc> CREATOR = new Parcelable.Creator<DriveOfflineDoc>() {
        /* class com.bytedance.ee.bear.contract.drive.DriveOfflineDoc.C51351 */

        /* renamed from: a */
        public DriveOfflineDoc[] newArray(int i) {
            return new DriveOfflineDoc[i];
        }

        /* renamed from: a */
        public DriveOfflineDoc createFromParcel(Parcel parcel) {
            return new DriveOfflineDoc(parcel);
        }
    };

    /* renamed from: a */
    private String f14875a = "";

    /* renamed from: b */
    private String f14876b = "";

    /* renamed from: c */
    private int f14877c;

    /* renamed from: d */
    private String f14878d = "";

    /* renamed from: e */
    private long f14879e;

    /* renamed from: f */
    private String f14880f = "";

    /* renamed from: g */
    private long f14881g;

    /* renamed from: h */
    private String f14882h = "";

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo20397b() {
        return this.f14882h;
    }

    /* renamed from: a */
    public String mo20396a() {
        return this.f14875a;
    }

    public DriveOfflineDoc() {
    }

    public int hashCode() {
        return Objects.hash(this.f14875a, this.f14876b);
    }

    public String toString() {
        return "DriveOfflineDoc{objToken='" + this.f14875a + '\'' + ", subType='" + this.f14876b + '\'' + ", permission=" + this.f14877c + ", url='" + this.f14878d + '\'' + ", fileSize=" + this.f14879e + ", dataVersion='" + this.f14880f + '\'' + ", mountPoint='" + this.f14882h + '\'' + '}';
    }

    /* renamed from: a */
    public DriveOfflineDoc mo20395a(String str) {
        this.f14882h = str;
        return this;
    }

    protected DriveOfflineDoc(Parcel parcel) {
        this.f14875a = parcel.readString();
        this.f14876b = parcel.readString();
        this.f14877c = parcel.readInt();
        this.f14878d = parcel.readString();
        this.f14879e = parcel.readLong();
        this.f14880f = parcel.readString();
        this.f14881g = parcel.readLong();
        this.f14882h = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DriveOfflineDoc driveOfflineDoc = (DriveOfflineDoc) obj;
        if (!Objects.equals(this.f14875a, driveOfflineDoc.f14875a) || !Objects.equals(this.f14876b, driveOfflineDoc.f14876b)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14875a);
        parcel.writeString(this.f14876b);
        parcel.writeInt(this.f14877c);
        parcel.writeString(this.f14878d);
        parcel.writeLong(this.f14879e);
        parcel.writeString(this.f14880f);
        parcel.writeLong(this.f14881g);
        parcel.writeString(this.f14882h);
    }

    public DriveOfflineDoc(String str, String str2, String str3) {
        this.f14875a = str;
        this.f14878d = str2;
        this.f14876b = str3;
    }
}
