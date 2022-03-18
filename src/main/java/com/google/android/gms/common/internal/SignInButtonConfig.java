package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new C21778z();

    /* renamed from: a */
    private final int f53023a;

    /* renamed from: b */
    private final int f53024b;

    /* renamed from: c */
    private final int f53025c;

    /* renamed from: d */
    private final Scope[] f53026d;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f53023a = i;
        this.f53024b = i2;
        this.f53025c = i3;
        this.f53026d = scopeArr;
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }

    /* renamed from: a */
    public int mo73653a() {
        return this.f53024b;
    }

    /* renamed from: b */
    public int mo73654b() {
        return this.f53025c;
    }

    /* renamed from: c */
    public Scope[] mo73655c() {
        return this.f53026d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53023a);
        SafeParcelWriter.writeInt(parcel, 2, mo73653a());
        SafeParcelWriter.writeInt(parcel, 3, mo73654b());
        SafeParcelWriter.writeTypedArray(parcel, 4, mo73655c(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
