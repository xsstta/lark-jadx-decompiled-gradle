package com.ss.android.lark.audit.db;

import android.os.Parcel;
import android.os.Parcelable;

public class AuditDBData implements Parcelable {
    public static final Parcelable.Creator<AuditDBData> CREATOR = new Parcelable.Creator<AuditDBData>() {
        /* class com.ss.android.lark.audit.db.AuditDBData.C293111 */

        /* renamed from: a */
        public AuditDBData[] newArray(int i) {
            return new AuditDBData[i];
        }

        /* renamed from: a */
        public AuditDBData createFromParcel(Parcel parcel) {
            return new AuditDBData(parcel);
        }
    };

    /* renamed from: a */
    long f73356a;

    /* renamed from: b */
    String f73357b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo103882a() {
        return this.f73357b;
    }

    protected AuditDBData(Parcel parcel) {
        this.f73356a = parcel.readLong();
        this.f73357b = parcel.readString();
    }

    public AuditDBData(long j, String str) {
        this.f73356a = j;
        this.f73357b = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f73356a);
        parcel.writeString(this.f73357b);
    }
}
