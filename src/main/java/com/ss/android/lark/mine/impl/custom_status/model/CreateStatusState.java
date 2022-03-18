package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.Event;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B_\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\"\b\u0002\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003HÆ\u0003J#\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\u0003HÆ\u0003Jc\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\"\b\u0002\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\rHÖ\u0001J\"\u0010\u0011\u001a\u00020\u00002\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\nH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\bH\u0016J\t\u0010\"\u001a\u00020#HÖ\u0001R4\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n0\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "createStatus", "Lcom/larksuite/arch/jack/Event;", "Lcom/bytedance/lark/pb/contact/v1/CreateUserCustomStatusResponse;", "errorEvent", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "popBackEvent", "", "avatarEvent", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "", "(Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;)V", "getAvatarEvent", "()Lcom/larksuite/arch/jack/Event;", "setAvatarEvent", "(Lcom/larksuite/arch/jack/Event;)V", "getCreateStatus", "getErrorEvent", "getPopBackEvent", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setErrorEvent", "setPopBack", "toString", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.b */
public final class CreateStatusState implements ModifyStatusState<CreateStatusState> {

    /* renamed from: a */
    private final Event<CreateUserCustomStatusResponse> f115106a;

    /* renamed from: b */
    private final Event<ErrorEvent> f115107b;

    /* renamed from: c */
    private final Event<Boolean> f115108c;

    /* renamed from: d */
    private Event<? extends Pair<? extends List<AvatarViewData>, Integer>> f115109d;

    public CreateStatusState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mine.impl.custom_status.model.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ CreateStatusState m180643a(CreateStatusState bVar, Event dVar, Event dVar2, Event dVar3, Event dVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = bVar.f115106a;
        }
        if ((i & 2) != 0) {
            dVar2 = bVar.f115107b;
        }
        if ((i & 4) != 0) {
            dVar3 = bVar.f115108c;
        }
        if ((i & 8) != 0) {
            dVar4 = bVar.f115109d;
        }
        return bVar.mo160463a(dVar, dVar2, dVar3, dVar4);
    }

    /* renamed from: a */
    public final CreateStatusState mo160463a(Event<CreateUserCustomStatusResponse> dVar, Event<? extends ErrorEvent> dVar2, Event<Boolean> dVar3, Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar4) {
        Intrinsics.checkParameterIsNotNull(dVar, "createStatus");
        Intrinsics.checkParameterIsNotNull(dVar2, "errorEvent");
        Intrinsics.checkParameterIsNotNull(dVar3, "popBackEvent");
        Intrinsics.checkParameterIsNotNull(dVar4, "avatarEvent");
        return new CreateStatusState(dVar, dVar2, dVar3, dVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateStatusState)) {
            return false;
        }
        CreateStatusState bVar = (CreateStatusState) obj;
        return Intrinsics.areEqual(this.f115106a, bVar.f115106a) && Intrinsics.areEqual(this.f115107b, bVar.f115107b) && Intrinsics.areEqual(this.f115108c, bVar.f115108c) && Intrinsics.areEqual(this.f115109d, bVar.f115109d);
    }

    public int hashCode() {
        Event<CreateUserCustomStatusResponse> dVar = this.f115106a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        Event<ErrorEvent> dVar2 = this.f115107b;
        int hashCode2 = (hashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        Event<Boolean> dVar3 = this.f115108c;
        int hashCode3 = (hashCode2 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar4 = this.f115109d;
        if (dVar4 != null) {
            i = dVar4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CreateStatusState(createStatus=" + this.f115106a + ", errorEvent=" + this.f115107b + ", popBackEvent=" + this.f115108c + ", avatarEvent=" + this.f115109d + ")";
    }

    /* renamed from: a */
    public final Event<CreateUserCustomStatusResponse> mo160462a() {
        return this.f115106a;
    }

    /* renamed from: b */
    public final Event<ErrorEvent> mo160467b() {
        return this.f115107b;
    }

    /* renamed from: c */
    public final Event<Boolean> mo160470c() {
        return this.f115108c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.larksuite.arch.jack.d<? extends kotlin.Pair<? extends java.util.List<com.ss.android.lark.mine.impl.custom_status.emoji_panel.a>, java.lang.Integer>>, com.larksuite.arch.jack.d<kotlin.Pair<java.util.List<com.ss.android.lark.mine.impl.custom_status.emoji_panel.a>, java.lang.Integer>> */
    /* renamed from: d */
    public final Event<Pair<List<AvatarViewData>, Integer>> mo160471d() {
        return this.f115109d;
    }

    /* renamed from: a */
    public final void mo160466a(Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        this.f115109d = dVar;
    }

    /* renamed from: a */
    public CreateStatusState mo160468b(ErrorEvent hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return m180643a(this, null, new Event(hVar), null, null, 13, null);
    }

    /* renamed from: a */
    public CreateStatusState mo160469b(Pair<? extends List<AvatarViewData>, Integer> pair) {
        Intrinsics.checkParameterIsNotNull(pair, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return m180643a(this, null, null, null, new Event(pair), 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.larksuite.arch.jack.d<? extends com.ss.android.lark.mine.impl.custom_status.model.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateStatusState(Event<CreateUserCustomStatusResponse> dVar, Event<? extends ErrorEvent> dVar2, Event<Boolean> dVar3, Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar4) {
        Intrinsics.checkParameterIsNotNull(dVar, "createStatus");
        Intrinsics.checkParameterIsNotNull(dVar2, "errorEvent");
        Intrinsics.checkParameterIsNotNull(dVar3, "popBackEvent");
        Intrinsics.checkParameterIsNotNull(dVar4, "avatarEvent");
        this.f115106a = dVar;
        this.f115107b = dVar2;
        this.f115108c = dVar3;
        this.f115109d = dVar4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateStatusState(Event dVar, Event dVar2, Event dVar3, Event dVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Event(null) : dVar, (i & 2) != 0 ? new Event(null) : dVar2, (i & 4) != 0 ? new Event(null) : dVar3, (i & 8) != 0 ? new Event(null) : dVar4);
    }
}
