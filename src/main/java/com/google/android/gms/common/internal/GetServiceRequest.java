package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C21732ac();

    /* renamed from: a */
    String f53003a;

    /* renamed from: b */
    IBinder f53004b;

    /* renamed from: c */
    Scope[] f53005c;

    /* renamed from: d */
    Bundle f53006d;

    /* renamed from: e */
    Account f53007e;

    /* renamed from: f */
    Feature[] f53008f;

    /* renamed from: g */
    Feature[] f53009g;

    /* renamed from: h */
    private final int f53010h;

    /* renamed from: i */
    private final int f53011i;

    /* renamed from: j */
    private int f53012j;

    /* renamed from: k */
    private boolean f53013k;

    public GetServiceRequest(int i) {
        this.f53010h = 4;
        this.f53012j = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.f53011i = i;
        this.f53013k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f53010h = i;
        this.f53011i = i2;
        this.f53012j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f53003a = "com.google.android.gms";
        } else {
            this.f53003a = str;
        }
        if (i < 2) {
            this.f53007e = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f53004b = iBinder;
            this.f53007e = account;
        }
        this.f53005c = scopeArr;
        this.f53006d = bundle;
        this.f53008f = featureArr;
        this.f53009g = featureArr2;
        this.f53013k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53010h);
        SafeParcelWriter.writeInt(parcel, 2, this.f53011i);
        SafeParcelWriter.writeInt(parcel, 3, this.f53012j);
        SafeParcelWriter.writeString(parcel, 4, this.f53003a, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.f53004b, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f53005c, i, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f53006d, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f53007e, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 10, this.f53008f, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.f53009g, i, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f53013k);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
