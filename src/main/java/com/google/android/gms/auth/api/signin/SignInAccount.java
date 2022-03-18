package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C21604j();

    /* renamed from: a */
    private String f52493a;

    /* renamed from: b */
    private GoogleSignInAccount f52494b;

    /* renamed from: c */
    private String f52495c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f52494b = googleSignInAccount;
        this.f52493a = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.f52495c = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    /* renamed from: a */
    public final GoogleSignInAccount mo73061a() {
        return this.f52494b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.f52493a, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f52494b, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f52495c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
