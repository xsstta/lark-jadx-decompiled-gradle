package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new C21923k();

    /* renamed from: a */
    private final String f53354a;

    /* renamed from: b */
    private final long f53355b;

    /* renamed from: c */
    private final short f53356c;

    /* renamed from: d */
    private final double f53357d;

    /* renamed from: e */
    private final double f53358e;

    /* renamed from: f */
    private final float f53359f;

    /* renamed from: g */
    private final int f53360g;

    /* renamed from: h */
    private final int f53361h;

    /* renamed from: i */
    private final int f53362i;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f53356c = s;
                this.f53354a = str;
                this.f53357d = d;
                this.f53358e = d2;
                this.f53359f = f;
                this.f53355b = j;
                this.f53360g = i4;
                this.f53361h = i2;
                this.f53362i = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* renamed from: a */
    public final String mo74092a() {
        return this.f53354a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.f53359f == zzbh.f53359f && this.f53357d == zzbh.f53357d && this.f53358e == zzbh.f53358e && this.f53356c == zzbh.f53356c;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f53357d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f53358e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f53359f)) * 31) + this.f53356c) * 31) + this.f53360g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f53356c != 1 ? null : "CIRCLE";
        objArr[1] = this.f53354a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f53360g);
        objArr[3] = Double.valueOf(this.f53357d);
        objArr[4] = Double.valueOf(this.f53358e);
        objArr[5] = Float.valueOf(this.f53359f);
        objArr[6] = Integer.valueOf(this.f53361h / 1000);
        objArr[7] = Integer.valueOf(this.f53362i);
        objArr[8] = Long.valueOf(this.f53355b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo74092a(), false);
        SafeParcelWriter.writeLong(parcel, 2, this.f53355b);
        SafeParcelWriter.writeShort(parcel, 3, this.f53356c);
        SafeParcelWriter.writeDouble(parcel, 4, this.f53357d);
        SafeParcelWriter.writeDouble(parcel, 5, this.f53358e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f53359f);
        SafeParcelWriter.writeInt(parcel, 7, this.f53360g);
        SafeParcelWriter.writeInt(parcel, 8, this.f53361h);
        SafeParcelWriter.writeInt(parcel, 9, this.f53362i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
