package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.Arrays;

public class StreetViewPanoramaOrientation implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new Parcelable.Creator<StreetViewPanoramaOrientation>() {
        /* class com.huawei.hms.maps.model.StreetViewPanoramaOrientation.C237251 */

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaOrientation createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaOrientation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaOrientation[] newArray(int i) {
            return new StreetViewPanoramaOrientation[i];
        }
    };
    public final float bearing;
    public final float tilt;

    public static class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }

        public Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        public Builder tilt(float f) {
            this.tilt = f;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        this.tilt = f;
        this.bearing = f2;
    }

    protected StreetViewPanoramaOrientation(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.bearing = parcelReader.readFloat(2, BitmapDescriptorFactory.HUE_RED);
        this.tilt = parcelReader.readFloat(3, BitmapDescriptorFactory.HUE_RED);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaOrientation) {
            StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
            return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.bearing);
        parcelWrite.writeFloat(3, this.tilt);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
