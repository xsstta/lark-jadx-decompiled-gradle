package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new C22075d();

    /* renamed from: a */
    private final int f53695a;

    /* renamed from: b */
    private final ConnectionResult f53696b;

    /* renamed from: c */
    private final ResolveAccountResponse f53697c;

    zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f53695a = i;
        this.f53696b = connectionResult;
        this.f53697c = resolveAccountResponse;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    /* renamed from: a */
    public final ConnectionResult mo74987a() {
        return this.f53696b;
    }

    /* renamed from: b */
    public final ResolveAccountResponse mo74988b() {
        return this.f53697c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53695a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f53696b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f53697c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
