package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new C22057r();

    /* renamed from: a */
    private static final String f53597a = "PatternItem";

    /* renamed from: b */
    private final int f53598b;

    /* renamed from: c */
    private final Float f53599c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < BitmapDescriptorFactory.HUE_RED)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        Preconditions.checkArgument(z, sb.toString());
        this.f53598b = i;
        this.f53599c = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f53598b);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.f53599c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53598b), this.f53599c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f53598b == patternItem.f53598b && Objects.equal(this.f53599c, patternItem.f53599c);
    }

    public String toString() {
        int i = this.f53598b;
        String valueOf = String.valueOf(this.f53599c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
