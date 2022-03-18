package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm;

import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.State;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "Lcom/larksuite/arch/jack/State;", "selectedOption", "", "submitEnable", "", "approvalOptions", "", "approvalInfo", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "applySubmitted", "Lcom/larksuite/arch/jack/Event;", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "(IZLjava/util/List;Ljava/util/List;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;)V", "getApplySubmitted", "()Lcom/larksuite/arch/jack/Event;", "getApprovalInfo", "()Ljava/util/List;", "getApprovalOptions", "getError", "getSelectedOption", "()I", "getSubmitEnable", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.b */
public final class ApplyMemberLimitPageState implements State {

    /* renamed from: a */
    private final int f89784a;

    /* renamed from: b */
    private final boolean f89785b;

    /* renamed from: c */
    private final List<Integer> f89786c;

    /* renamed from: d */
    private final List<Chatter> f89787d;

    /* renamed from: e */
    private final Event<Boolean> f89788e;

    /* renamed from: f */
    private final Event<ErrorResult> f89789f;

    public ApplyMemberLimitPageState() {
        this(0, false, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ ApplyMemberLimitPageState m135141a(ApplyMemberLimitPageState bVar, int i, boolean z, List list, List list2, Event dVar, Event dVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f89784a;
        }
        if ((i2 & 2) != 0) {
            z = bVar.f89785b;
        }
        if ((i2 & 4) != 0) {
            list = bVar.f89786c;
        }
        if ((i2 & 8) != 0) {
            list2 = bVar.f89787d;
        }
        if ((i2 & 16) != 0) {
            dVar = bVar.f89788e;
        }
        if ((i2 & 32) != 0) {
            dVar2 = bVar.f89789f;
        }
        return bVar.mo128324a(i, z, list, list2, dVar, dVar2);
    }

    /* renamed from: a */
    public final ApplyMemberLimitPageState mo128324a(int i, boolean z, List<Integer> list, List<? extends Chatter> list2, Event<Boolean> dVar, Event<? extends ErrorResult> dVar2) {
        Intrinsics.checkParameterIsNotNull(list, "approvalOptions");
        Intrinsics.checkParameterIsNotNull(list2, "approvalInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "applySubmitted");
        Intrinsics.checkParameterIsNotNull(dVar2, "error");
        return new ApplyMemberLimitPageState(i, z, list, list2, dVar, dVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyMemberLimitPageState)) {
            return false;
        }
        ApplyMemberLimitPageState bVar = (ApplyMemberLimitPageState) obj;
        return this.f89784a == bVar.f89784a && this.f89785b == bVar.f89785b && Intrinsics.areEqual(this.f89786c, bVar.f89786c) && Intrinsics.areEqual(this.f89787d, bVar.f89787d) && Intrinsics.areEqual(this.f89788e, bVar.f89788e) && Intrinsics.areEqual(this.f89789f, bVar.f89789f);
    }

    public int hashCode() {
        int i = this.f89784a * 31;
        boolean z = this.f89785b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        List<Integer> list = this.f89786c;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        List<Chatter> list2 = this.f89787d;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Event<Boolean> dVar = this.f89788e;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Event<ErrorResult> dVar2 = this.f89789f;
        if (dVar2 != null) {
            i6 = dVar2.hashCode();
        }
        return hashCode3 + i6;
    }

    public String toString() {
        return "ApplyMemberLimitPageState(selectedOption=" + this.f89784a + ", submitEnable=" + this.f89785b + ", approvalOptions=" + this.f89786c + ", approvalInfo=" + this.f89787d + ", applySubmitted=" + this.f89788e + ", error=" + this.f89789f + ")";
    }

    /* renamed from: a */
    public final int mo128323a() {
        return this.f89784a;
    }

    /* renamed from: b */
    public final boolean mo128325b() {
        return this.f89785b;
    }

    /* renamed from: c */
    public final List<Integer> mo128326c() {
        return this.f89786c;
    }

    /* renamed from: d */
    public final List<Chatter> mo128327d() {
        return this.f89787d;
    }

    /* renamed from: e */
    public final Event<Boolean> mo128328e() {
        return this.f89788e;
    }

    /* renamed from: f */
    public final Event<ErrorResult> mo128330f() {
        return this.f89789f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.Chatter> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.larksuite.arch.jack.d<? extends com.larksuite.framework.callback.Entity.ErrorResult> */
    /* JADX WARN: Multi-variable type inference failed */
    public ApplyMemberLimitPageState(int i, boolean z, List<Integer> list, List<? extends Chatter> list2, Event<Boolean> dVar, Event<? extends ErrorResult> dVar2) {
        Intrinsics.checkParameterIsNotNull(list, "approvalOptions");
        Intrinsics.checkParameterIsNotNull(list2, "approvalInfo");
        Intrinsics.checkParameterIsNotNull(dVar, "applySubmitted");
        Intrinsics.checkParameterIsNotNull(dVar2, "error");
        this.f89784a = i;
        this.f89785b = z;
        this.f89786c = list;
        this.f89787d = list2;
        this.f89788e = dVar;
        this.f89789f = dVar2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplyMemberLimitPageState(int r5, boolean r6, java.util.List r7, java.util.List r8, com.larksuite.arch.jack.Event r9, com.larksuite.arch.jack.Event r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = -1
        L_0x0005:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000c
            r12 = 0
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0015
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0015:
            r1 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001e
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001e:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002c
            com.larksuite.arch.jack.d r9 = new com.larksuite.arch.jack.d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r9.<init>(r6)
        L_0x002c:
            r0 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0037
            com.larksuite.arch.jack.d r10 = new com.larksuite.arch.jack.d
            r6 = 0
            r10.<init>(r6)
        L_0x0037:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyMemberLimitPageState.<init>(int, boolean, java.util.List, java.util.List, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
