package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C21567h();

    /* renamed from: a */
    private final String f52430a;

    /* renamed from: b */
    private final String f52431b;

    public IdToken(String str, String str2) {
        Preconditions.checkArgument(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.checkArgument(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f52430a = str;
        this.f52431b = str2;
    }

    /* renamed from: a */
    public final String mo73006a() {
        return this.f52430a;
    }

    /* renamed from: b */
    public final String mo73007b() {
        return this.f52431b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, mo73006a(), false);
        SafeParcelWriter.writeString(parcel, 2, mo73007b(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.equal(this.f52430a, idToken.f52430a) && Objects.equal(this.f52431b, idToken.f52431b);
    }
}
