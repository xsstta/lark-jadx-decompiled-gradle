package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new C21757n();

    /* renamed from: a */
    private final int f52978a;

    /* renamed from: b */
    private final IBinder f52979b;

    /* renamed from: c */
    private final Scope[] f52980c;

    /* renamed from: d */
    private Integer f52981d;

    /* renamed from: e */
    private Integer f52982e;

    /* renamed from: f */
    private Account f52983f;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f52978a = i;
        this.f52979b = iBinder;
        this.f52980c = scopeArr;
        this.f52981d = num;
        this.f52982e = num2;
        this.f52983f = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52978a);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f52979b, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.f52980c, i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 4, this.f52981d, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, this.f52982e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f52983f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
