package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C21956k();

    /* renamed from: a */
    private int f53402a;

    /* renamed from: b */
    private long f53403b;

    /* renamed from: c */
    private long f53404c;

    /* renamed from: d */
    private boolean f53405d;

    /* renamed from: e */
    private long f53406e;

    /* renamed from: f */
    private int f53407f;

    /* renamed from: g */
    private float f53408g;

    /* renamed from: h */
    private long f53409h;

    public LocationRequest() {
        this.f53402a = 102;
        this.f53403b = 3600000;
        this.f53404c = 600000;
        this.f53406e = Long.MAX_VALUE;
        this.f53407f = Integer.MAX_VALUE;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f53402a = i;
        this.f53403b = j;
        this.f53404c = j2;
        this.f53405d = z;
        this.f53406e = j3;
        this.f53407f = i2;
        this.f53408g = f;
        this.f53409h = j4;
    }

    /* renamed from: a */
    public static LocationRequest m79289a() {
        return new LocationRequest();
    }

    /* renamed from: d */
    private static void m79290d(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final LocationRequest mo74318a(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f53402a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final LocationRequest mo74319a(long j) {
        m79290d(j);
        this.f53403b = j;
        if (!this.f53405d) {
            this.f53404c = (long) (((double) j) / 6.0d);
        }
        return this;
    }

    /* renamed from: b */
    public final long mo74320b() {
        long j = this.f53409h;
        long j2 = this.f53403b;
        return j < j2 ? j2 : j;
    }

    /* renamed from: b */
    public final LocationRequest mo74321b(int i) {
        if (i > 0) {
            this.f53407f = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final LocationRequest mo74322b(long j) {
        m79290d(j);
        this.f53405d = true;
        this.f53404c = j;
        return this;
    }

    /* renamed from: c */
    public final LocationRequest mo74323c(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.f53406e = Long.MAX_VALUE;
        } else {
            this.f53406e = j + elapsedRealtime;
        }
        if (this.f53406e < 0) {
            this.f53406e = 0;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f53402a == locationRequest.f53402a && this.f53403b == locationRequest.f53403b && this.f53404c == locationRequest.f53404c && this.f53405d == locationRequest.f53405d && this.f53406e == locationRequest.f53406e && this.f53407f == locationRequest.f53407f && this.f53408g == locationRequest.f53408g && mo74320b() == locationRequest.mo74320b();
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53402a), Long.valueOf(this.f53403b), Float.valueOf(this.f53408g), Long.valueOf(this.f53409h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f53402a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f53402a != 105) {
            sb.append(" requested=");
            sb.append(this.f53403b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f53404c);
        sb.append("ms");
        if (this.f53409h > this.f53403b) {
            sb.append(" maxWait=");
            sb.append(this.f53409h);
            sb.append("ms");
        }
        if (this.f53408g > BitmapDescriptorFactory.HUE_RED) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f53408g);
            sb.append("m");
        }
        long j = this.f53406e;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f53407f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f53407f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53402a);
        SafeParcelWriter.writeLong(parcel, 2, this.f53403b);
        SafeParcelWriter.writeLong(parcel, 3, this.f53404c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f53405d);
        SafeParcelWriter.writeLong(parcel, 5, this.f53406e);
        SafeParcelWriter.writeInt(parcel, 6, this.f53407f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f53408g);
        SafeParcelWriter.writeLong(parcel, 8, this.f53409h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
