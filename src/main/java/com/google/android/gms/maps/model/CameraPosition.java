package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C22049j();

    /* renamed from: a */
    public final LatLng f53540a;

    /* renamed from: b */
    public final float f53541b;

    /* renamed from: c */
    public final float f53542c;

    /* renamed from: d */
    public final float f53543d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        Preconditions.checkNotNull(latLng, "null camera target");
        Preconditions.checkArgument(BitmapDescriptorFactory.HUE_RED <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f53540a = latLng;
        this.f53541b = f;
        this.f53542c = f2 + BitmapDescriptorFactory.HUE_RED;
        this.f53543d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C22033a {

        /* renamed from: a */
        private LatLng f53544a;

        /* renamed from: b */
        private float f53545b;

        /* renamed from: c */
        private float f53546c;

        /* renamed from: d */
        private float f53547d;

        /* renamed from: a */
        public final C22033a mo74781a(LatLng latLng) {
            this.f53544a = latLng;
            return this;
        }

        /* renamed from: a */
        public final C22033a mo74780a(float f) {
            this.f53545b = f;
            return this;
        }

        /* renamed from: b */
        public final C22033a mo74783b(float f) {
            this.f53546c = f;
            return this;
        }

        /* renamed from: c */
        public final C22033a mo74784c(float f) {
            this.f53547d = f;
            return this;
        }

        /* renamed from: a */
        public final CameraPosition mo74782a() {
            return new CameraPosition(this.f53544a, this.f53545b, this.f53546c, this.f53547d);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53540a, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f53541b);
        SafeParcelWriter.writeFloat(parcel, 4, this.f53542c);
        SafeParcelWriter.writeFloat(parcel, 5, this.f53543d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f53540a, Float.valueOf(this.f53541b), Float.valueOf(this.f53542c), Float.valueOf(this.f53543d));
    }

    /* renamed from: a */
    public static C22033a m79527a() {
        return new C22033a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f53540a.equals(cameraPosition.f53540a) && Float.floatToIntBits(this.f53541b) == Float.floatToIntBits(cameraPosition.f53541b) && Float.floatToIntBits(this.f53542c) == Float.floatToIntBits(cameraPosition.f53542c) && Float.floatToIntBits(this.f53543d) == Float.floatToIntBits(cameraPosition.f53543d);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("target", this.f53540a).add("zoom", Float.valueOf(this.f53541b)).add("tilt", Float.valueOf(this.f53542c)).add("bearing", Float.valueOf(this.f53543d)).toString();
    }
}
