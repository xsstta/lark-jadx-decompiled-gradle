package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C21777y();

    /* renamed from: a */
    private final int f53018a;

    /* renamed from: b */
    private IBinder f53019b;

    /* renamed from: c */
    private ConnectionResult f53020c;

    /* renamed from: d */
    private boolean f53021d;

    /* renamed from: e */
    private boolean f53022e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f53018a = i;
        this.f53019b = iBinder;
        this.f53020c = connectionResult;
        this.f53021d = z;
        this.f53022e = z2;
    }

    /* renamed from: a */
    public IAccountAccessor mo73647a() {
        return IAccountAccessor.Stub.asInterface(this.f53019b);
    }

    /* renamed from: b */
    public ConnectionResult mo73648b() {
        return this.f53020c;
    }

    /* renamed from: c */
    public boolean mo73649c() {
        return this.f53021d;
    }

    /* renamed from: d */
    public boolean mo73650d() {
        return this.f53022e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53018a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f53019b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo73648b(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, mo73649c());
        SafeParcelWriter.writeBoolean(parcel, 5, mo73650d());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f53020c.equals(resolveAccountResponse.f53020c) && mo73647a().equals(resolveAccountResponse.mo73647a());
    }
}
