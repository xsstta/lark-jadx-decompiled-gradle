package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.Event;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005\u0012\"\b\u0002\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e0\u0005¢\u0006\u0002\u0010\u0012J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005HÆ\u0003J#\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e0\u0005HÆ\u0003J\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00052\"\b\u0002\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e0\u0005HÆ\u0001J\u0013\u0010A\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0011HÖ\u0001J\"\u0010\u0015\u001a\u00020\u00002\u0018\u0010E\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\nH\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\fH\u0016J\t\u0010G\u001a\u00020!HÖ\u0001R4\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010+\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0011\u00105\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0014¨\u0006H"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "currentStatus", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "updateStatus", "Lcom/larksuite/arch/jack/Event;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusResponse;", "deleteStatus", "Lcom/bytedance/lark/pb/contact/v1/DeleteUserCustomStatusResponse;", "errorEvent", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "popBackEvent", "", "avatarEvent", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;)V", "getAvatarEvent", "()Lcom/larksuite/arch/jack/Event;", "setAvatarEvent", "(Lcom/larksuite/arch/jack/Event;)V", "getCurrentStatus", "()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "getDeleteStatus", "effectiveInterval", "Lcom/bytedance/lark/pb/basic/v1/StatusEffectiveInterval;", "getEffectiveInterval", "()Lcom/bytedance/lark/pb/basic/v1/StatusEffectiveInterval;", "getErrorEvent", "setErrorEvent", "iconKey", "", "getIconKey", "()Ljava/lang/String;", "id", "", "getId", "()J", "isCustomStatus", "()Z", "isNotDisturbMode", "isSystemStatus", "getPopBackEvent", "setPopBackEvent", "syncSetting", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "getSyncSetting", "()Ljava/util/Map;", "title", "getTitle", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus$Type;", "getType", "()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus$Type;", "getUpdateStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setPopBack", "toString", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.j */
public final class UpdateStatusState implements ModifyStatusState<UpdateStatusState> {

    /* renamed from: a */
    private final UserCustomStatus f115125a;

    /* renamed from: b */
    private final Event<UpdateUserCustomStatusResponse> f115126b;

    /* renamed from: c */
    private final Event<DeleteUserCustomStatusResponse> f115127c;

    /* renamed from: d */
    private Event<? extends ErrorEvent> f115128d;

    /* renamed from: e */
    private Event<Boolean> f115129e;

    /* renamed from: f */
    private Event<? extends Pair<? extends List<AvatarViewData>, Integer>> f115130f;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.lark.mine.impl.custom_status.model.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ UpdateStatusState m180685a(UpdateStatusState jVar, UserCustomStatus userCustomStatus, Event dVar, Event dVar2, Event dVar3, Event dVar4, Event dVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            userCustomStatus = jVar.f115125a;
        }
        if ((i & 2) != 0) {
            dVar = jVar.f115126b;
        }
        if ((i & 4) != 0) {
            dVar2 = jVar.f115127c;
        }
        if ((i & 8) != 0) {
            dVar3 = jVar.f115128d;
        }
        if ((i & 16) != 0) {
            dVar4 = jVar.f115129e;
        }
        if ((i & 32) != 0) {
            dVar5 = jVar.f115130f;
        }
        return jVar.mo160541a(userCustomStatus, dVar, dVar2, dVar3, dVar4, dVar5);
    }

    /* renamed from: a */
    public final UpdateStatusState mo160541a(UserCustomStatus userCustomStatus, Event<UpdateUserCustomStatusResponse> dVar, Event<DeleteUserCustomStatusResponse> dVar2, Event<? extends ErrorEvent> dVar3, Event<Boolean> dVar4, Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar5) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "currentStatus");
        Intrinsics.checkParameterIsNotNull(dVar, "updateStatus");
        Intrinsics.checkParameterIsNotNull(dVar2, "deleteStatus");
        Intrinsics.checkParameterIsNotNull(dVar3, "errorEvent");
        Intrinsics.checkParameterIsNotNull(dVar4, "popBackEvent");
        Intrinsics.checkParameterIsNotNull(dVar5, "avatarEvent");
        return new UpdateStatusState(userCustomStatus, dVar, dVar2, dVar3, dVar4, dVar5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateStatusState)) {
            return false;
        }
        UpdateStatusState jVar = (UpdateStatusState) obj;
        return Intrinsics.areEqual(this.f115125a, jVar.f115125a) && Intrinsics.areEqual(this.f115126b, jVar.f115126b) && Intrinsics.areEqual(this.f115127c, jVar.f115127c) && Intrinsics.areEqual(this.f115128d, jVar.f115128d) && Intrinsics.areEqual(this.f115129e, jVar.f115129e) && Intrinsics.areEqual(this.f115130f, jVar.f115130f);
    }

    public int hashCode() {
        UserCustomStatus userCustomStatus = this.f115125a;
        int i = 0;
        int hashCode = (userCustomStatus != null ? userCustomStatus.hashCode() : 0) * 31;
        Event<UpdateUserCustomStatusResponse> dVar = this.f115126b;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Event<DeleteUserCustomStatusResponse> dVar2 = this.f115127c;
        int hashCode3 = (hashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        Event<? extends ErrorEvent> dVar3 = this.f115128d;
        int hashCode4 = (hashCode3 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        Event<Boolean> dVar4 = this.f115129e;
        int hashCode5 = (hashCode4 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar5 = this.f115130f;
        if (dVar5 != null) {
            i = dVar5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "UpdateStatusState(currentStatus=" + this.f115125a + ", updateStatus=" + this.f115126b + ", deleteStatus=" + this.f115127c + ", errorEvent=" + this.f115128d + ", popBackEvent=" + this.f115129e + ", avatarEvent=" + this.f115130f + ")";
    }

    /* renamed from: h */
    public final UserCustomStatus mo160554h() {
        return this.f115125a;
    }

    /* renamed from: i */
    public final Event<UpdateUserCustomStatusResponse> mo160556i() {
        return this.f115126b;
    }

    /* renamed from: j */
    public final Event<DeleteUserCustomStatusResponse> mo160557j() {
        return this.f115127c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.larksuite.arch.jack.d<? extends com.ss.android.lark.mine.impl.custom_status.model.h>, com.larksuite.arch.jack.d<com.ss.android.lark.mine.impl.custom_status.model.h> */
    /* renamed from: k */
    public final Event<ErrorEvent> mo160558k() {
        return this.f115128d;
    }

    /* renamed from: l */
    public final Event<Boolean> mo160559l() {
        return this.f115129e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.larksuite.arch.jack.d<? extends kotlin.Pair<? extends java.util.List<com.ss.android.lark.mine.impl.custom_status.emoji_panel.a>, java.lang.Integer>>, com.larksuite.arch.jack.d<kotlin.Pair<java.util.List<com.ss.android.lark.mine.impl.custom_status.emoji_panel.a>, java.lang.Integer>> */
    /* renamed from: m */
    public final Event<Pair<List<AvatarViewData>, Integer>> mo160560m() {
        return this.f115130f;
    }

    /* renamed from: a */
    public final long mo160540a() {
        Long l = this.f115125a.id;
        Intrinsics.checkExpressionValueIsNotNull(l, "currentStatus.id");
        return l.longValue();
    }

    /* renamed from: b */
    public final UserCustomStatus.Type mo160545b() {
        UserCustomStatus.Type type = this.f115125a.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "currentStatus.type");
        return type;
    }

    /* renamed from: d */
    public final String mo160549d() {
        String str = this.f115125a.title;
        Intrinsics.checkExpressionValueIsNotNull(str, "currentStatus.title");
        return str;
    }

    /* renamed from: e */
    public final String mo160550e() {
        String str = this.f115125a.icon_key;
        if (str != null) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo160552f() {
        Boolean bool = this.f115125a.is_not_disturb_mode;
        Intrinsics.checkExpressionValueIsNotNull(bool, "currentStatus.is_not_disturb_mode");
        return bool.booleanValue();
    }

    /* renamed from: c */
    public final boolean mo160548c() {
        int i = C45528k.f115131a[mo160545b().ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Map<CustomStatusSyncField, Boolean> mo160553g() {
        Map<Long, Boolean> map = this.f115125a.sync_settings;
        Intrinsics.checkExpressionValueIsNotNull(map, "currentStatus.sync_settings");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (T t : map.entrySet()) {
            linkedHashMap.put(CustomStatusSyncField.fromValue((int) ((Number) t.getKey()).longValue()), t.getValue());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo160544a(Event<? extends ErrorEvent> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        this.f115128d = dVar;
    }

    /* renamed from: c */
    public final void mo160547c(Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        this.f115130f = dVar;
    }

    /* renamed from: a */
    public UpdateStatusState mo160468b(ErrorEvent hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return m180685a(this, null, null, null, new Event(hVar), null, null, 55, null);
    }

    /* renamed from: b */
    public final void mo160546b(Event<Boolean> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        this.f115129e = dVar;
    }

    /* renamed from: a */
    public UpdateStatusState mo160469b(Pair<? extends List<AvatarViewData>, Integer> pair) {
        Intrinsics.checkParameterIsNotNull(pair, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return m180685a(this, null, null, null, null, null, new Event(pair), 31, null);
    }

    public UpdateStatusState(UserCustomStatus userCustomStatus, Event<UpdateUserCustomStatusResponse> dVar, Event<DeleteUserCustomStatusResponse> dVar2, Event<? extends ErrorEvent> dVar3, Event<Boolean> dVar4, Event<? extends Pair<? extends List<AvatarViewData>, Integer>> dVar5) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "currentStatus");
        Intrinsics.checkParameterIsNotNull(dVar, "updateStatus");
        Intrinsics.checkParameterIsNotNull(dVar2, "deleteStatus");
        Intrinsics.checkParameterIsNotNull(dVar3, "errorEvent");
        Intrinsics.checkParameterIsNotNull(dVar4, "popBackEvent");
        Intrinsics.checkParameterIsNotNull(dVar5, "avatarEvent");
        this.f115125a = userCustomStatus;
        this.f115126b = dVar;
        this.f115127c = dVar2;
        this.f115128d = dVar3;
        this.f115129e = dVar4;
        this.f115130f = dVar5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpdateStatusState(com.bytedance.lark.pb.contact.v1.UserCustomStatus r7, com.larksuite.arch.jack.Event r8, com.larksuite.arch.jack.Event r9, com.larksuite.arch.jack.Event r10, com.larksuite.arch.jack.Event r11, com.larksuite.arch.jack.Event r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x000b
            com.larksuite.arch.jack.d r0 = new com.larksuite.arch.jack.d
            r0.<init>(r1)
            goto L_0x000c
        L_0x000b:
            r0 = r8
        L_0x000c:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x0016
            com.larksuite.arch.jack.d r2 = new com.larksuite.arch.jack.d
            r2.<init>(r1)
            goto L_0x0017
        L_0x0016:
            r2 = r9
        L_0x0017:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0021
            com.larksuite.arch.jack.d r3 = new com.larksuite.arch.jack.d
            r3.<init>(r1)
            goto L_0x0022
        L_0x0021:
            r3 = r10
        L_0x0022:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x002c
            com.larksuite.arch.jack.d r4 = new com.larksuite.arch.jack.d
            r4.<init>(r1)
            goto L_0x002d
        L_0x002c:
            r4 = r11
        L_0x002d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0037
            com.larksuite.arch.jack.d r5 = new com.larksuite.arch.jack.d
            r5.<init>(r1)
            goto L_0x0038
        L_0x0037:
            r5 = r12
        L_0x0038:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusState.<init>(com.bytedance.lark.pb.contact.v1.UserCustomStatus, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
