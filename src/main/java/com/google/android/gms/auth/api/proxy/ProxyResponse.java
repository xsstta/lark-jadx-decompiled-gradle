package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C21575c();

    /* renamed from: a */
    public final int f52447a;

    /* renamed from: b */
    public final PendingIntent f52448b;

    /* renamed from: c */
    public final int f52449c;

    /* renamed from: d */
    public final byte[] f52450d;

    /* renamed from: e */
    private final int f52451e;

    /* renamed from: f */
    private final Bundle f52452f;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f52451e = i;
        this.f52447a = i2;
        this.f52449c = i3;
        this.f52452f = bundle;
        this.f52450d = bArr;
        this.f52448b = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52447a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f52448b, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f52449c);
        SafeParcelWriter.writeBundle(parcel, 4, this.f52452f, false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f52450d, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f52451e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
