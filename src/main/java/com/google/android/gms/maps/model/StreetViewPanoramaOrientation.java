package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C22064y();

    /* renamed from: a */
    public final float f53634a;

    /* renamed from: b */
    public final float f53635b;

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        Preconditions.checkArgument(z, sb.toString());
        this.f53634a = f + BitmapDescriptorFactory.HUE_RED;
        this.f53635b = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C22034a {

        /* renamed from: a */
        public float f53636a;

        /* renamed from: b */
        public float f53637b;

        /* renamed from: a */
        public final C22034a mo74886a(float f) {
            this.f53637b = f;
            return this;
        }

        /* renamed from: b */
        public final C22034a mo74888b(float f) {
            this.f53636a = f;
            return this;
        }

        /* renamed from: a */
        public final StreetViewPanoramaOrientation mo74887a() {
            return new StreetViewPanoramaOrientation(this.f53637b, this.f53636a);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f53634a);
        SafeParcelWriter.writeFloat(parcel, 3, this.f53635b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f53634a), Float.valueOf(this.f53635b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f53634a) == Float.floatToIntBits(streetViewPanoramaOrientation.f53634a) && Float.floatToIntBits(this.f53635b) == Float.floatToIntBits(streetViewPanoramaOrientation.f53635b);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.f53634a)).add("bearing", Float.valueOf(this.f53635b)).toString();
    }
}
