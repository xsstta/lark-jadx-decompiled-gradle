package com.ss.android.lark.mail.impl.home.threadlist.loadmore_footer;

import com.larksuite.arch.jack.State;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "Lcom/larksuite/arch/jack/State;", "show", "", "noMoreData", "success", "state", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "(ZZZLcom/scwang/smart/refresh/layout/constant/RefreshState;)V", "getNoMoreData", "()Z", "getShow", "getState", "()Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "getSuccess", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.b */
public final class LoadMoreState implements State {

    /* renamed from: a */
    private final boolean f108459a;

    /* renamed from: b */
    private final boolean f108460b;

    /* renamed from: c */
    private final boolean f108461c;

    /* renamed from: d */
    private final RefreshState f108462d;

    /* renamed from: a */
    public static /* synthetic */ LoadMoreState m169983a(LoadMoreState bVar, boolean z, boolean z2, boolean z3, RefreshState refreshState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f108459a;
        }
        if ((i & 2) != 0) {
            z2 = bVar.f108460b;
        }
        if ((i & 4) != 0) {
            z3 = bVar.f108461c;
        }
        if ((i & 8) != 0) {
            refreshState = bVar.f108462d;
        }
        return bVar.mo153153a(z, z2, z3, refreshState);
    }

    /* renamed from: a */
    public final LoadMoreState mo153153a(boolean z, boolean z2, boolean z3, RefreshState refreshState) {
        Intrinsics.checkParameterIsNotNull(refreshState, "state");
        return new LoadMoreState(z, z2, z3, refreshState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreState)) {
            return false;
        }
        LoadMoreState bVar = (LoadMoreState) obj;
        return this.f108459a == bVar.f108459a && this.f108460b == bVar.f108460b && this.f108461c == bVar.f108461c && Intrinsics.areEqual(this.f108462d, bVar.f108462d);
    }

    public int hashCode() {
        boolean z = this.f108459a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f108460b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.f108461c;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        int i10 = (i9 + i) * 31;
        RefreshState refreshState = this.f108462d;
        return i10 + (refreshState != null ? refreshState.hashCode() : 0);
    }

    /* renamed from: a */
    public final boolean mo153154a() {
        return this.f108459a;
    }

    /* renamed from: b */
    public final boolean mo153155b() {
        return this.f108460b;
    }

    /* renamed from: c */
    public final boolean mo153156c() {
        return this.f108461c;
    }

    /* renamed from: d */
    public final RefreshState mo153157d() {
        return this.f108462d;
    }

    public String toString() {
        return "LoadMoreState(noMoreData=" + this.f108460b + ", success=" + this.f108461c + ", state=" + this.f108462d + ')';
    }

    public LoadMoreState(boolean z, boolean z2, boolean z3, RefreshState refreshState) {
        Intrinsics.checkParameterIsNotNull(refreshState, "state");
        this.f108459a = z;
        this.f108460b = z2;
        this.f108461c = z3;
        this.f108462d = refreshState;
    }
}
