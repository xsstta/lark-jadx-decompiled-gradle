package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C21565f();

    /* renamed from: a */
    private final int f52413a;

    /* renamed from: b */
    private final boolean f52414b;

    /* renamed from: c */
    private final String[] f52415c;

    /* renamed from: d */
    private final CredentialPickerConfig f52416d;

    /* renamed from: e */
    private final CredentialPickerConfig f52417e;

    /* renamed from: f */
    private final boolean f52418f;

    /* renamed from: g */
    private final String f52419g;

    /* renamed from: h */
    private final String f52420h;

    /* renamed from: i */
    private final boolean f52421i;

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f52413a = i;
        this.f52414b = z;
        this.f52415c = (String[]) Preconditions.checkNotNull(strArr);
        this.f52416d = credentialPickerConfig == null ? new CredentialPickerConfig.C21559a().mo72990a() : credentialPickerConfig;
        this.f52417e = credentialPickerConfig2 == null ? new CredentialPickerConfig.C21559a().mo72990a() : credentialPickerConfig2;
        if (i < 3) {
            this.f52418f = true;
            this.f52419g = null;
            this.f52420h = null;
        } else {
            this.f52418f = z2;
            this.f52419g = str;
            this.f52420h = str2;
        }
        this.f52421i = z3;
    }

    /* renamed from: a */
    public final boolean mo72991a() {
        return this.f52414b;
    }

    /* renamed from: b */
    public final String[] mo72992b() {
        return this.f52415c;
    }

    /* renamed from: c */
    public final CredentialPickerConfig mo72993c() {
        return this.f52416d;
    }

    /* renamed from: d */
    public final CredentialPickerConfig mo72994d() {
        return this.f52417e;
    }

    /* renamed from: e */
    public final boolean mo72995e() {
        return this.f52418f;
    }

    /* renamed from: f */
    public final String mo72996f() {
        return this.f52419g;
    }

    /* renamed from: g */
    public final String mo72997g() {
        return this.f52420h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, mo72991a());
        SafeParcelWriter.writeStringArray(parcel, 2, mo72992b(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, mo72993c(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, mo72994d(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, mo72995e());
        SafeParcelWriter.writeString(parcel, 6, mo72996f(), false);
        SafeParcelWriter.writeString(parcel, 7, mo72997g(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f52413a);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f52421i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
