package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mcq;
import java.util.Objects;

public class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator<LatLng>() {
        /* class com.huawei.hms.maps.model.LatLng.C237131 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    };
    public double latitude;
    public double longitude;

    public LatLng(double d, double d2) {
        if ((-180.0d >= d2 || d2 >= 180.0d) && Math.abs(d2 + 180.0d) >= 1.0E-6d) {
            this.longitude = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
            mcq.m86889e("LatLng", "longitude is out of valid range, ,using modulo operation.");
        } else {
            this.longitude = d2;
        }
        this.latitude = Math.max(-90.0d, Math.min(90.0d, d));
    }

    protected LatLng(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.latitude = parcelReader.readDouble(2, 0.0d);
        this.longitude = parcelReader.readDouble(3, 0.0d);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }

    public final String toString() {
        return "latitude: " + this.latitude + " longitude: " + this.longitude;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeDouble(2, this.latitude);
        parcelWrite.writeDouble(3, this.longitude);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
