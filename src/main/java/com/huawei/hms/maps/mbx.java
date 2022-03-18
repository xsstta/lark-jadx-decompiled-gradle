package com.huawei.hms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

public final class mbx implements Parcelable {
    public static final Parcelable.Creator<mbx> CREATOR = new Parcelable.Creator<mbx>() {
        /* class com.huawei.hms.maps.mbx.C237001 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ mbx createFromParcel(Parcel parcel) {
            return new mbx(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ mbx[] newArray(int i) {
            return new mbx[i];
        }
    };

    /* renamed from: a */
    public String f58657a;

    /* renamed from: b */
    public String f58658b;

    /* renamed from: c */
    public String f58659c;

    /* renamed from: d */
    public String f58660d;

    /* renamed from: e */
    public String f58661e;

    /* renamed from: f */
    public long f58662f;

    public mbx() {
    }

    protected mbx(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58657a = parcelReader.createString(2, "");
        this.f58658b = parcelReader.createString(3, "");
        this.f58659c = parcelReader.createString(4, "");
        this.f58660d = parcelReader.createString(5, "");
        this.f58661e = parcelReader.createString(6, "");
        this.f58662f = parcelReader.readLong(7, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeString(2, this.f58657a, false);
        parcelWrite.writeString(3, this.f58658b, false);
        parcelWrite.writeString(4, this.f58659c, false);
        parcelWrite.writeString(5, this.f58660d, false);
        parcelWrite.writeString(6, this.f58661e, false);
        parcelWrite.writeLong(7, this.f58662f);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
