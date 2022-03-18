package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzbh;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C21945af();

    /* renamed from: a */
    private final List<zzbh> f53394a;

    /* renamed from: b */
    private final int f53395b;

    /* renamed from: c */
    private final String f53396c;

    GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f53394a = list;
        this.f53395b = i;
        this.f53396c = str;
    }

    /* renamed from: a */
    public int mo74310a() {
        return this.f53395b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f53394a);
        int i = this.f53395b;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f53396c);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f53394a, false);
        SafeParcelWriter.writeInt(parcel, 2, mo74310a());
        SafeParcelWriter.writeString(parcel, 3, this.f53396c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
