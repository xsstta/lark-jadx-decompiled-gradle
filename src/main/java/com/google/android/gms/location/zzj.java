package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C21941ab();

    /* renamed from: a */
    private boolean f53451a;

    /* renamed from: b */
    private long f53452b;

    /* renamed from: c */
    private float f53453c;

    /* renamed from: d */
    private long f53454d;

    /* renamed from: e */
    private int f53455e;

    public zzj() {
        this(true, 50, BitmapDescriptorFactory.HUE_RED, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f53451a = z;
        this.f53452b = j;
        this.f53453c = f;
        this.f53454d = j2;
        this.f53455e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f53451a == zzj.f53451a && this.f53452b == zzj.f53452b && Float.compare(this.f53453c, zzj.f53453c) == 0 && this.f53454d == zzj.f53454d && this.f53455e == zzj.f53455e;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f53451a), Long.valueOf(this.f53452b), Float.valueOf(this.f53453c), Long.valueOf(this.f53454d), Integer.valueOf(this.f53455e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f53451a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f53452b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f53453c);
        long j = this.f53454d;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f53455e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f53455e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f53451a);
        SafeParcelWriter.writeLong(parcel, 2, this.f53452b);
        SafeParcelWriter.writeFloat(parcel, 3, this.f53453c);
        SafeParcelWriter.writeLong(parcel, 4, this.f53454d);
        SafeParcelWriter.writeInt(parcel, 5, this.f53455e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
