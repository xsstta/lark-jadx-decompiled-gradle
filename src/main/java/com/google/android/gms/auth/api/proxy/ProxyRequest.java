package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C21574b();

    /* renamed from: a */
    public static final int f52432a = 0;

    /* renamed from: b */
    public static final int f52433b = 1;

    /* renamed from: c */
    public static final int f52434c = 2;

    /* renamed from: d */
    public static final int f52435d = 3;

    /* renamed from: e */
    public static final int f52436e = 4;

    /* renamed from: f */
    public static final int f52437f = 5;

    /* renamed from: g */
    public static final int f52438g = 6;

    /* renamed from: h */
    public static final int f52439h = 7;

    /* renamed from: i */
    public static final int f52440i = 7;

    /* renamed from: j */
    public final String f52441j;

    /* renamed from: k */
    public final int f52442k;

    /* renamed from: l */
    public final long f52443l;

    /* renamed from: m */
    public final byte[] f52444m;

    /* renamed from: n */
    private final int f52445n;

    /* renamed from: o */
    private Bundle f52446o;

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f52445n = i;
        this.f52441j = str;
        this.f52442k = i2;
        this.f52443l = j;
        this.f52444m = bArr;
        this.f52446o = bundle;
    }

    public String toString() {
        String str = this.f52441j;
        int i = this.f52442k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f52441j, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f52442k);
        SafeParcelWriter.writeLong(parcel, 3, this.f52443l);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f52444m, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.f52446o, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f52445n);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
