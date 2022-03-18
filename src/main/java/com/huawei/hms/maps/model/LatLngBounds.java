package com.huawei.hms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import com.huawei.hms.maps.HuaweiMapOptions;
import java.math.BigDecimal;

public class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Parcelable.Creator<LatLngBounds>() {
        /* class com.huawei.hms.maps.model.LatLngBounds.C237141 */

        @Override // android.os.Parcelable.Creator
        public final LatLngBounds createFromParcel(Parcel parcel) {
            return new LatLngBounds(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }
    };
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {

        /* renamed from: a */
        private double f58747a = Double.MAX_VALUE;

        /* renamed from: b */
        private double f58748b = -1.7976931348623157E308d;

        /* renamed from: c */
        private double f58749c = Double.NaN;

        /* renamed from: d */
        private double f58750d = Double.NaN;

        public final LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.f58749c), "no points in the bounds");
            return new LatLngBounds(new LatLng(this.f58747a, this.f58749c), new LatLng(this.f58748b, this.f58750d));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
            if (java.lang.Math.abs(r0 - r2) >= 1.0E-6d) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
            if (java.lang.Math.abs(r0 - r2) >= 1.0E-6d) goto L_0x006f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.huawei.hms.maps.model.LatLngBounds.Builder include(com.huawei.hms.maps.model.LatLng r11) {
            /*
            // Method dump skipped, instructions count: 153
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.maps.model.LatLngBounds.Builder.include(com.huawei.hms.maps.model.LatLng):com.huawei.hms.maps.model.LatLngBounds$Builder");
        }
    }

    protected LatLngBounds(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.southwest = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.northeast = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest can not be null");
        Preconditions.checkNotNull(latLng2, "northeast can not be null");
        Preconditions.checkArgument(latLng2.latitude >= latLng.latitude, "southern latitude >= northern latitude", Double.valueOf(latLng.latitude), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    /* renamed from: a */
    private boolean m86904a(double d) {
        int i = (this.southwest.longitude > this.northeast.longitude ? 1 : (this.southwest.longitude == this.northeast.longitude ? 0 : -1));
        int i2 = (this.southwest.longitude > d ? 1 : (this.southwest.longitude == d ? 0 : -1));
        return i <= 0 ? (i2 < 0 || Math.abs(this.southwest.longitude - d) < 1.0E-6d) && (d < this.northeast.longitude || Math.abs(d - this.northeast.longitude) < 1.0E-6d) : i2 < 0 || Math.abs(this.southwest.longitude - d) < 1.0E-6d || d < this.northeast.longitude || Math.abs(d - this.northeast.longitude) < 1.0E-6d;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m86906c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return HuaweiMapOptions.buildLatLngBounds(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static double m86907d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public final boolean contains(LatLng latLng) {
        double d = latLng.latitude;
        return this.southwest.latitude <= d && d <= this.northeast.latitude && m86904a(latLng.longitude);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public final LatLng getCenter() {
        double doubleValue = new BigDecimal(String.valueOf(this.southwest.latitude)).add(new BigDecimal(String.valueOf(this.northeast.latitude))).divide(new BigDecimal("2.0")).doubleValue();
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        if (this.southwest.longitude > d) {
            d += 360.0d;
        }
        return new LatLng(doubleValue, (d + d2) / 2.0d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    public final LatLngBounds including(LatLng latLng) {
        LatLng latLng2 = new LatLng(Math.min(this.southwest.latitude, latLng.latitude), this.southwest.longitude);
        LatLng latLng3 = new LatLng(Math.max(this.northeast.latitude, latLng.latitude), this.northeast.longitude);
        if (m86904a(latLng.longitude)) {
            return new LatLngBounds(latLng2, latLng3);
        }
        latLng2.longitude = m86906c(latLng2.longitude, latLng.longitude) < m86907d(latLng3.longitude, latLng.longitude) ? latLng.longitude : latLng2.longitude;
        latLng3.longitude = m86906c(latLng2.longitude, latLng.longitude) < m86907d(latLng3.longitude, latLng.longitude) ? latLng3.longitude : latLng.longitude;
        return new LatLngBounds(latLng2, latLng3);
    }

    public final String toString() {
        return "LatLngBounds:southwest point is" + this.southwest + ",northeast point is" + this.northeast;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.southwest, i, false);
        parcelWrite.writeParcelable(3, this.northeast, i, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
