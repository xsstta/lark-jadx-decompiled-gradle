package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C21776x();

    /* renamed from: a */
    private final int f53014a;

    /* renamed from: b */
    private final Account f53015b;

    /* renamed from: c */
    private final int f53016c;

    /* renamed from: d */
    private final GoogleSignInAccount f53017d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f53014a = i;
        this.f53015b = account;
        this.f53016c = i2;
        this.f53017d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: a */
    public Account mo73643a() {
        return this.f53015b;
    }

    /* renamed from: b */
    public int mo73644b() {
        return this.f53016c;
    }

    /* renamed from: c */
    public GoogleSignInAccount mo73645c() {
        return this.f53017d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53014a);
        SafeParcelWriter.writeParcelable(parcel, 2, mo73643a(), i, false);
        SafeParcelWriter.writeInt(parcel, 3, mo73644b());
        SafeParcelWriter.writeParcelable(parcel, 4, mo73645c(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
