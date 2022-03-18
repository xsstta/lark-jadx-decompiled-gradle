package com.ss.android.lark.mail.impl.home.titlebar.accountcard;

import com.larksuite.arch.jack.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardState;", "Lcom/larksuite/arch/jack/State;", "show", "", "accountAddress", "", "hasNewMessage", "badgeState", "", "(ZLjava/lang/String;ZI)V", "getAccountAddress", "()Ljava/lang/String;", "getBadgeState", "()I", "getHasNewMessage", "()Z", "getShow", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.d.a.b */
public final class AccountCardState implements State {

    /* renamed from: a */
    private final boolean f108144a;

    /* renamed from: b */
    private final String f108145b;

    /* renamed from: c */
    private final boolean f108146c;

    /* renamed from: d */
    private final int f108147d;

    /* renamed from: a */
    public static /* synthetic */ AccountCardState m169590a(AccountCardState bVar, boolean z, String str, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bVar.f108144a;
        }
        if ((i2 & 2) != 0) {
            str = bVar.f108145b;
        }
        if ((i2 & 4) != 0) {
            z2 = bVar.f108146c;
        }
        if ((i2 & 8) != 0) {
            i = bVar.f108147d;
        }
        return bVar.mo152822a(z, str, z2, i);
    }

    /* renamed from: a */
    public final AccountCardState mo152822a(boolean z, String str, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "accountAddress");
        return new AccountCardState(z, str, z2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCardState)) {
            return false;
        }
        AccountCardState bVar = (AccountCardState) obj;
        return this.f108144a == bVar.f108144a && Intrinsics.areEqual(this.f108145b, bVar.f108145b) && this.f108146c == bVar.f108146c && this.f108147d == bVar.f108147d;
    }

    public int hashCode() {
        boolean z = this.f108144a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f108145b;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z2 = this.f108146c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((hashCode + i) * 31) + this.f108147d;
    }

    public String toString() {
        return "AccountCardState(show=" + this.f108144a + ", accountAddress=" + this.f108145b + ", hasNewMessage=" + this.f108146c + ", badgeState=" + this.f108147d + ")";
    }

    /* renamed from: a */
    public final boolean mo152823a() {
        return this.f108144a;
    }

    /* renamed from: b */
    public final String mo152824b() {
        return this.f108145b;
    }

    /* renamed from: c */
    public final boolean mo152825c() {
        return this.f108146c;
    }

    /* renamed from: d */
    public final int mo152826d() {
        return this.f108147d;
    }

    public AccountCardState(boolean z, String str, boolean z2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "accountAddress");
        this.f108144a = z;
        this.f108145b = str;
        this.f108146c = z2;
        this.f108147d = i;
    }
}
