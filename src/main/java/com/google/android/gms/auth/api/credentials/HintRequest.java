package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C21566g();

    /* renamed from: a */
    private final int f52422a;

    /* renamed from: b */
    private final CredentialPickerConfig f52423b;

    /* renamed from: c */
    private final boolean f52424c;

    /* renamed from: d */
    private final boolean f52425d;

    /* renamed from: e */
    private final String[] f52426e;

    /* renamed from: f */
    private final boolean f52427f;

    /* renamed from: g */
    private final String f52428g;

    /* renamed from: h */
    private final String f52429h;

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f52422a = i;
        this.f52423b = (CredentialPickerConfig) Preconditions.checkNotNull(credentialPickerConfig);
        this.f52424c = z;
        this.f52425d = z2;
        this.f52426e = (String[]) Preconditions.checkNotNull(strArr);
        if (i < 2) {
            this.f52427f = true;
            this.f52428g = null;
            this.f52429h = null;
            return;
        }
        this.f52427f = z3;
        this.f52428g = str;
        this.f52429h = str2;
    }

    /* renamed from: a */
    public final CredentialPickerConfig mo72999a() {
        return this.f52423b;
    }

    /* renamed from: b */
    public final boolean mo73000b() {
        return this.f52424c;
    }

    /* renamed from: c */
    public final String[] mo73001c() {
        return this.f52426e;
    }

    /* renamed from: d */
    public final boolean mo73002d() {
        return this.f52427f;
    }

    /* renamed from: e */
    public final String mo73003e() {
        return this.f52428g;
    }

    /* renamed from: f */
    public final String mo73004f() {
        return this.f52429h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, mo72999a(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, mo73000b());
        SafeParcelWriter.writeBoolean(parcel, 3, this.f52425d);
        SafeParcelWriter.writeStringArray(parcel, 4, mo73001c(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, mo73002d());
        SafeParcelWriter.writeString(parcel, 6, mo73003e(), false);
        SafeParcelWriter.writeString(parcel, 7, mo73004f(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f52422a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
