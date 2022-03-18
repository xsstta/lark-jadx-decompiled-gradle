package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C21932t();

    /* renamed from: a */
    static final List<ClientIdentity> f53363a = Collections.emptyList();

    /* renamed from: b */
    static final zzj f53364b = new zzj();

    /* renamed from: c */
    private zzj f53365c;

    /* renamed from: d */
    private List<ClientIdentity> f53366d;

    /* renamed from: e */
    private String f53367e;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f53365c = zzj;
        this.f53366d = list;
        this.f53367e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return Objects.equal(this.f53365c, zzm.f53365c) && Objects.equal(this.f53366d, zzm.f53366d) && Objects.equal(this.f53367e, zzm.f53367e);
    }

    public final int hashCode() {
        return this.f53365c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f53365c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f53366d, false);
        SafeParcelWriter.writeString(parcel, 3, this.f53367e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
