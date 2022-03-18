package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new C22050k();

    /* renamed from: a */
    private static final String f53548a = "Cap";

    /* renamed from: b */
    private final int f53549b;

    /* renamed from: c */
    private final C22035a f53550c;

    /* renamed from: d */
    private final Float f53551d;

    private Cap(int i, C22035a aVar, Float f) {
        Preconditions.checkArgument(i != 3 || (aVar != null && (f != null && (f.floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (f.floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) > 0)), String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), aVar, f));
        this.f53549b = i;
        this.f53550c = aVar;
        this.f53551d = f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Cap(int r2, android.os.IBinder r3, java.lang.Float r4) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0004
            r3 = 0
            goto L_0x000e
        L_0x0004:
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            com.google.android.gms.maps.model.a r0 = new com.google.android.gms.maps.model.a
            r0.<init>(r3)
            r3 = r0
        L_0x000e:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.Cap.<init>(int, android.os.IBinder, java.lang.Float):void");
    }

    protected Cap(int i) {
        this(i, (C22035a) null, (Float) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f53549b);
        C22035a aVar = this.f53550c;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo74903a().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinder, false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.f53551d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53549b), this.f53550c, this.f53551d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f53549b == cap.f53549b && Objects.equal(this.f53550c, cap.f53550c) && Objects.equal(this.f53551d, cap.f53551d);
    }

    public String toString() {
        int i = this.f53549b;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
