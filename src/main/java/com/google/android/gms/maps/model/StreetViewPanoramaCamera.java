package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new C22061v();

    /* renamed from: a */
    public final float f53625a;

    /* renamed from: b */
    public final float f53626b;

    /* renamed from: c */
    public final float f53627c;

    /* renamed from: d */
    private final StreetViewPanoramaOrientation f53628d;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.checkArgument(z, sb.toString());
        this.f53625a = ((double) f) <= 0.0d ? BitmapDescriptorFactory.HUE_RED : f;
        this.f53626b = BitmapDescriptorFactory.HUE_RED + f2;
        this.f53627c = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.f53628d = new StreetViewPanoramaOrientation.C22034a().mo74886a(f2).mo74888b(f3).mo74887a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f53625a);
        SafeParcelWriter.writeFloat(parcel, 3, this.f53626b);
        SafeParcelWriter.writeFloat(parcel, 4, this.f53627c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f53625a), Float.valueOf(this.f53626b), Float.valueOf(this.f53627c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f53625a) == Float.floatToIntBits(streetViewPanoramaCamera.f53625a) && Float.floatToIntBits(this.f53626b) == Float.floatToIntBits(streetViewPanoramaCamera.f53626b) && Float.floatToIntBits(this.f53627c) == Float.floatToIntBits(streetViewPanoramaCamera.f53627c);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("zoom", Float.valueOf(this.f53625a)).add("tilt", Float.valueOf(this.f53626b)).add("bearing", Float.valueOf(this.f53627c)).toString();
    }
}
