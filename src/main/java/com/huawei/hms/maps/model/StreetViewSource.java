package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;

public class StreetViewSource implements Parcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new Parcelable.Creator<StreetViewSource>() {
        /* class com.huawei.hms.maps.model.StreetViewSource.C237261 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetViewSource createFromParcel(Parcel parcel) {
            return new StreetViewSource(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetViewSource[] newArray(int i) {
            return new StreetViewSource[i];
        }
    };
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_OUTDOOR = 1;

    /* renamed from: a */
    private final int f58798a;

    public StreetViewSource(int i) {
        this.f58798a = i;
    }

    protected StreetViewSource(Parcel parcel) {
        this.f58798a = new ParcelReader(parcel).readInt(2, 0);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f58798a == ((StreetViewSource) obj).f58798a;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f58798a));
    }

    public final String toString() {
        return "Type is:" + String.valueOf(this.f58798a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f58798a);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
