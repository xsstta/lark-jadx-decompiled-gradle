package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C21602n();

    /* renamed from: a */
    private final String f52510a;

    /* renamed from: b */
    private GoogleSignInOptions f52511b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f52510a = Preconditions.checkNotEmpty(str);
        this.f52511b = googleSignInOptions;
    }

    /* renamed from: a */
    public final GoogleSignInOptions mo73077a() {
        return this.f52511b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f52510a, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f52511b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f52510a.equals(signInConfiguration.f52510a)) {
            GoogleSignInOptions googleSignInOptions = this.f52511b;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f52511b == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f52511b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C21589a().mo73084a(this.f52510a).mo73084a(this.f52511b).mo73083a();
    }
}
