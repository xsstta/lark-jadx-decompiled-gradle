package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C21607d();

    /* renamed from: a */
    private final int f52335a;

    /* renamed from: b */
    private final String f52336b;

    /* renamed from: c */
    private final Long f52337c;

    /* renamed from: d */
    private final boolean f52338d;

    /* renamed from: e */
    private final boolean f52339e;

    /* renamed from: f */
    private final List<String> f52340f;

    /* renamed from: g */
    private final String f52341g;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f52335a = i;
        this.f52336b = Preconditions.checkNotEmpty(str);
        this.f52337c = l;
        this.f52338d = z;
        this.f52339e = z2;
        this.f52340f = list;
        this.f52341g = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f52336b, tokenData.f52336b) || !Objects.equal(this.f52337c, tokenData.f52337c) || this.f52338d != tokenData.f52338d || this.f52339e != tokenData.f52339e || !Objects.equal(this.f52340f, tokenData.f52340f) || !Objects.equal(this.f52341g, tokenData.f52341g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f52336b, this.f52337c, Boolean.valueOf(this.f52338d), Boolean.valueOf(this.f52339e), this.f52340f, this.f52341g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52335a);
        SafeParcelWriter.writeString(parcel, 2, this.f52336b, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.f52337c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f52338d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f52339e);
        SafeParcelWriter.writeStringList(parcel, 6, this.f52340f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f52341g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
