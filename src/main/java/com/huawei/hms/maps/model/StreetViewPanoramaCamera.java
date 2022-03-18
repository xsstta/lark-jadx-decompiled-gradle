package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.Arrays;

public class StreetViewPanoramaCamera implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new Parcelable.Creator<StreetViewPanoramaCamera>() {
        /* class com.huawei.hms.maps.model.StreetViewPanoramaCamera.C237221 */

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaCamera(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreetViewPanoramaCamera[] newArray(int i) {
            return new StreetViewPanoramaCamera[i];
        }
    };

    /* renamed from: a */
    private final StreetViewPanoramaOrientation f58797a;
    public final float bearing;
    public final float tilt;
    public final float zoom;

    public static class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
            this.zoom = streetViewPanoramaCamera.zoom;
        }

        public Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.bearing, this.tilt, this.zoom);
        }

        public Builder orientation(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
            return this;
        }

        public Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public Builder zoom(float f) {
            this.zoom = f;
            return this;
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        this.zoom = f;
        this.tilt = f2;
        this.bearing = f3;
        this.f58797a = new StreetViewPanoramaOrientation(f2, f3);
    }

    protected StreetViewPanoramaCamera(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        float readFloat = parcelReader.readFloat(2, BitmapDescriptorFactory.HUE_RED);
        this.bearing = readFloat;
        float readFloat2 = parcelReader.readFloat(3, BitmapDescriptorFactory.HUE_RED);
        this.tilt = readFloat2;
        this.zoom = parcelReader.readFloat(4, BitmapDescriptorFactory.HUE_RED);
        this.f58797a = new StreetViewPanoramaOrientation(readFloat2, readFloat);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaCamera) {
            StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
            return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
        }
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.f58797a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        Float valueOf = Float.valueOf(this.zoom);
        Float valueOf2 = Float.valueOf(this.tilt);
        Float valueOf3 = Float.valueOf(this.bearing);
        StringBuilder sb = new StringBuilder(100);
        sb.append("zoom/tilt/bearing: (");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(",");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.bearing);
        parcelWrite.writeFloat(3, this.tilt);
        parcelWrite.writeFloat(4, this.bearing);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
