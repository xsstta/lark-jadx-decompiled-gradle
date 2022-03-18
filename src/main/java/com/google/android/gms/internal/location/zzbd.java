package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new C21921i();

    /* renamed from: a */
    static final List<ClientIdentity> f53339a = Collections.emptyList();

    /* renamed from: b */
    private LocationRequest f53340b;

    /* renamed from: c */
    private List<ClientIdentity> f53341c;

    /* renamed from: d */
    private String f53342d;

    /* renamed from: e */
    private boolean f53343e;

    /* renamed from: f */
    private boolean f53344f;

    /* renamed from: g */
    private boolean f53345g;

    /* renamed from: h */
    private String f53346h;

    /* renamed from: i */
    private boolean f53347i = true;

    zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f53340b = locationRequest;
        this.f53341c = list;
        this.f53342d = str;
        this.f53343e = z;
        this.f53344f = z2;
        this.f53345g = z3;
        this.f53346h = str2;
    }

    /* renamed from: a */
    public static zzbd m79259a(LocationRequest locationRequest) {
        return new zzbd(locationRequest, f53339a, null, false, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return Objects.equal(this.f53340b, zzbd.f53340b) && Objects.equal(this.f53341c, zzbd.f53341c) && Objects.equal(this.f53342d, zzbd.f53342d) && this.f53343e == zzbd.f53343e && this.f53344f == zzbd.f53344f && this.f53345g == zzbd.f53345g && Objects.equal(this.f53346h, zzbd.f53346h);
    }

    public final int hashCode() {
        return this.f53340b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53340b);
        if (this.f53342d != null) {
            sb.append(" tag=");
            sb.append(this.f53342d);
        }
        if (this.f53346h != null) {
            sb.append(" moduleId=");
            sb.append(this.f53346h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f53343e);
        sb.append(" clients=");
        sb.append(this.f53341c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f53344f);
        if (this.f53345g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f53340b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f53341c, false);
        SafeParcelWriter.writeString(parcel, 6, this.f53342d, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f53343e);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f53344f);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f53345g);
        SafeParcelWriter.writeString(parcel, 10, this.f53346h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
