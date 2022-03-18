package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C21605b();

    /* renamed from: a */
    private final int f52329a;

    /* renamed from: b */
    private int f52330b;

    /* renamed from: c */
    private String f52331c;

    /* renamed from: d */
    private Account f52332d;

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f52329a = i;
        this.f52330b = i2;
        this.f52331c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f52332d = account;
        } else {
            this.f52332d = new Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest() {
        this.f52329a = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52329a);
        SafeParcelWriter.writeInt(parcel, 2, this.f52330b);
        SafeParcelWriter.writeString(parcel, 3, this.f52331c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f52332d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
