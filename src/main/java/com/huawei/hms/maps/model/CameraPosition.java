package com.huawei.hms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.HuaweiMapOptions;
import java.util.Objects;

public class CameraPosition implements Parcelable {
    public static final float BEARING_360 = 360.0f;
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator<CameraPosition>() {
        /* class com.huawei.hms.maps.model.CameraPosition.C237011 */

        @Override // android.os.Parcelable.Creator
        public final CameraPosition createFromParcel(Parcel parcel) {
            return new CameraPosition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    public static final int TILT_90 = 90;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static class Builder {

        /* renamed from: a */
        private LatLng f58692a;

        /* renamed from: b */
        private float f58693b;

        /* renamed from: c */
        private float f58694c;

        /* renamed from: d */
        private float f58695d;

        public Builder() {
        }

        public Builder(CameraPosition cameraPosition) {
            this.f58692a = cameraPosition.target;
            this.f58693b = cameraPosition.zoom;
            this.f58694c = cameraPosition.tilt;
            this.f58695d = cameraPosition.bearing;
        }

        public Builder bearing(float f) {
            this.f58695d = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.f58692a, this.f58693b, this.f58694c, this.f58695d);
        }

        public Builder target(LatLng latLng) {
            this.f58692a = latLng;
            return this;
        }

        public Builder tilt(float f) {
            this.f58694c = f;
            return this;
        }

        public Builder zoom(float f) {
            this.f58693b = f;
            return this;
        }
    }

    protected CameraPosition(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.target = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.zoom = parcelReader.readFloat(3, BitmapDescriptorFactory.HUE_RED);
        this.tilt = parcelReader.readFloat(4, BitmapDescriptorFactory.HUE_RED);
        this.bearing = parcelReader.readFloat(5, BitmapDescriptorFactory.HUE_RED);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        Objects.requireNonNull(latLng, "camera target is null");
        this.target = latLng;
        this.zoom = f;
        if (f2 < BitmapDescriptorFactory.HUE_RED || f2 > 90.0f) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive");
        }
        this.tilt = f2 + BitmapDescriptorFactory.HUE_RED;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        return HuaweiMapOptions.buildCameraPosition(context, attributeSet);
    }

    public static CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final int hashCode() {
        return com.huawei.hms.common.util.Objects.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public final String toString() {
        return getClass().getSimpleName() + ":" + "{bearing=" + this.bearing + ",zoom=" + this.zoom + ",tilt=" + this.tilt + ",target=" + this.target + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.target, i, false);
        parcelWrite.writeFloat(3, this.zoom);
        parcelWrite.writeFloat(4, this.tilt);
        parcelWrite.writeFloat(5, this.bearing);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
