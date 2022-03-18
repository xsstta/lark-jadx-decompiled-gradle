package com.ss.android.lark.mm.module.list.my;

import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/module/list/my/MmListFilterPreference;", "", "()V", "homeOwnerType", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "getHomeOwnerType", "()Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "setHomeOwnerType", "(Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;)V", "myListIsAsc", "", "myListRankType", "Lcom/ss/android/lark/mm/module/list/data/MmListRankType;", "sharedListIsAsc", "sharedListRankType", "clear", "", "getLastHomeOwnerType", "getLastMyListRankType", "getLastSharedListRankType", "getMyListIsAsc", "getSharedListIsAsc", "setMyListAsc", "isAsc", "setMyListRankType", "rank", "setSharedListAsc", "setSharedListRankType", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.b.a */
public final class MmListFilterPreference {

    /* renamed from: a */
    private MmOwnerType f116724a;

    /* renamed from: b */
    private MmListRankType f116725b = MmListRankType.CREATE_TIME;

    /* renamed from: c */
    private boolean f116726c;

    /* renamed from: d */
    private MmListRankType f116727d = MmListRankType.SHARE_TIME;

    /* renamed from: e */
    private boolean f116728e;

    /* renamed from: a */
    public final MmOwnerType mo162890a() {
        return this.f116724a;
    }

    /* renamed from: c */
    public final MmListRankType mo162897c() {
        return this.f116725b;
    }

    /* renamed from: d */
    public final boolean mo162898d() {
        return this.f116726c;
    }

    /* renamed from: e */
    public final MmListRankType mo162899e() {
        return this.f116727d;
    }

    /* renamed from: f */
    public final boolean mo162900f() {
        return this.f116728e;
    }

    /* renamed from: b */
    public final MmOwnerType mo162894b() {
        MmOwnerType mmOwnerType = this.f116724a;
        if (mmOwnerType != null) {
            return mmOwnerType;
        }
        return MmOwnerType.OWNED_BY_ANYONE;
    }

    /* renamed from: g */
    public final void mo162901g() {
        this.f116725b = MmListRankType.CREATE_TIME;
        this.f116726c = false;
        this.f116727d = MmListRankType.SHARE_TIME;
        this.f116728e = false;
    }

    /* renamed from: b */
    public final void mo162896b(boolean z) {
        this.f116728e = z;
    }

    /* renamed from: a */
    public final void mo162891a(MmListRankType mmListRankType) {
        if (mmListRankType != null) {
            this.f116725b = mmListRankType;
        }
    }

    /* renamed from: a */
    public final void mo162892a(MmOwnerType mmOwnerType) {
        this.f116724a = mmOwnerType;
    }

    /* renamed from: b */
    public final void mo162895b(MmListRankType mmListRankType) {
        Intrinsics.checkParameterIsNotNull(mmListRankType, "rank");
        this.f116727d = mmListRankType;
    }

    /* renamed from: a */
    public final void mo162893a(boolean z) {
        this.f116726c = z;
    }
}
