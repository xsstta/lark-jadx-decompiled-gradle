package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.State;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\b\u0018\u0000 Z2\u00020\u0001:\u0001ZB½\u0001\u0012(\b\u0002\u0010\u0002\u001a\"\u0012\u001e\u0012\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00050\u0003\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\u0016J)\u00105\u001a\"\u0012\u001e\u0012\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tHÆ\u0003J\u001b\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00050\u0003HÆ\u0003J\u001b\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00050\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\tHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003JÁ\u0001\u0010=\u001a\u00020\u00002(\b\u0002\u0010\u0002\u001a\"\u0012\u001e\u0012\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00050\u00032\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010>\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010B\u001a\u00020\u0006H\u0002J\t\u0010C\u001a\u00020DHÖ\u0001J\u0015\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0007H\u0000¢\u0006\u0002\bGJ\u001a\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u00072\b\u0010J\u001a\u0004\u0018\u00010\u0007H\u0002J\u001e\u0010K\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\b\b\u0002\u0010M\u001a\u00020NJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0013J\t\u0010P\u001a\u00020QHÖ\u0001J\r\u0010R\u001a\u00020\u0000H\u0000¢\u0006\u0002\bSJ\u001e\u0010T\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u00072\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0002J!\u0010V\u001a\u00020\u00002\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0002\bXJ\u0014\u0010Y\u001a\u00020\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR1\u0010\u0002\u001a\"\u0012\u001e\u0012\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010#\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0013\u0010(\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010,\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010/\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0013\u00101\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010.R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001e¨\u0006["}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "Lcom/larksuite/arch/jack/State;", "getRequest", "Lcom/larksuite/arch/jack/Async;", "Lkotlin/Pair;", "", "", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "isAllowCreate", "Lcom/larksuite/arch/jack/Event;", "Lcom/ss/android/lark/pb/im_settings/IsAllowedCreateUserCustomStatusResponse;", "errorEvent", "Lcom/ss/android/lark/mine/impl/custom_status/model/ErrorEvent;", "syncSetting", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "", "systemState", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus$Type;", "settingDisplayState", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "onBoardingEvent", "onBackPressEvent", "(Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Event;Lcom/larksuite/arch/jack/Event;)V", "allUserStatus", "", "getAllUserStatus", "()Ljava/util/List;", "getErrorEvent", "()Lcom/larksuite/arch/jack/Event;", "getGetRequest", "()Lcom/larksuite/arch/jack/Async;", "isShowCollapse", "()Z", "getOnBackPressEvent", "getOnBoardingEvent", "onLeaveStatusId", "getOnLeaveStatusId", "()Ljava/lang/Long;", "onMeetingStatusId", "getOnMeetingStatusId", "openedStatus", "getOpenedStatus", "()Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "getSettingDisplayState", "syncMeeting", "getSyncMeeting", "()Ljava/lang/Boolean;", "syncOnLeave", "getSyncOnLeave", "syncSchedule", "getSyncSchedule", "getSyncSetting", "getSystemState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "error", "getCurrentTime", "hashCode", "", "insertItem", UpdateKey.STATUS, "insertItem$core_mine_release", "isPrior", "newStatus", "oldStatus", "setList", "list", ShareHitPoint.f121868c, "Lcom/ss/android/lark/mine/impl/custom_status/model/FetchSource;", "displayState", "toString", "", "updateBackPressOpenedStatus", "updateBackPressOpenedStatus$core_mine_release", "updateItemIfNeeded", "origin", "updateItems", "map", "updateItems$core_mine_release", "updateListItem", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.d */
public final class CustomStatusState implements State {

    /* renamed from: a */
    public static final Companion f115110a = new Companion(null);

    /* renamed from: b */
    private final Async<Pair<Map<Long, UserCustomStatus>, Long>> f115111b;

    /* renamed from: c */
    private final Event<IsAllowedCreateUserCustomStatusResponse> f115112c;

    /* renamed from: d */
    private final Event<ErrorEvent> f115113d;

    /* renamed from: e */
    private final Async<Map<CustomStatusSyncField, Boolean>> f115114e;

    /* renamed from: f */
    private final Async<Map<UserCustomStatus.Type, Long>> f115115f;

    /* renamed from: g */
    private final Async<ExpandableAdapter.DisplayState> f115116g;

    /* renamed from: h */
    private final Event<Boolean> f115117h;

    /* renamed from: i */
    private final Event<UserCustomStatus> f115118i;

    public CustomStatusState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: a */
    public static /* synthetic */ CustomStatusState m180655a(CustomStatusState dVar, Async aVar, Event dVar2, Event dVar3, Async aVar2, Async aVar3, Async aVar4, Event dVar4, Event dVar5, int i, Object obj) {
        return dVar.mo160479a((i & 1) != 0 ? dVar.f115111b : aVar, (i & 2) != 0 ? dVar.f115112c : dVar2, (i & 4) != 0 ? dVar.f115113d : dVar3, (i & 8) != 0 ? dVar.f115114e : aVar2, (i & 16) != 0 ? dVar.f115115f : aVar3, (i & 32) != 0 ? dVar.f115116g : aVar4, (i & 64) != 0 ? dVar.f115117h : dVar4, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? dVar.f115118i : dVar5);
    }

    /* renamed from: a */
    public final CustomStatusState mo160479a(Async<? extends Pair<? extends Map<Long, UserCustomStatus>, Long>> aVar, Event<IsAllowedCreateUserCustomStatusResponse> dVar, Event<? extends ErrorEvent> dVar2, Async<? extends Map<CustomStatusSyncField, Boolean>> aVar2, Async<? extends Map<UserCustomStatus.Type, Long>> aVar3, Async<? extends ExpandableAdapter.DisplayState> aVar4, Event<Boolean> dVar3, Event<UserCustomStatus> dVar4) {
        Intrinsics.checkParameterIsNotNull(aVar, "getRequest");
        Intrinsics.checkParameterIsNotNull(dVar, "isAllowCreate");
        Intrinsics.checkParameterIsNotNull(dVar2, "errorEvent");
        Intrinsics.checkParameterIsNotNull(aVar2, "syncSetting");
        Intrinsics.checkParameterIsNotNull(aVar3, "systemState");
        Intrinsics.checkParameterIsNotNull(aVar4, "settingDisplayState");
        Intrinsics.checkParameterIsNotNull(dVar3, "onBoardingEvent");
        Intrinsics.checkParameterIsNotNull(dVar4, "onBackPressEvent");
        return new CustomStatusState(aVar, dVar, dVar2, aVar2, aVar3, aVar4, dVar3, dVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStatusState)) {
            return false;
        }
        CustomStatusState dVar = (CustomStatusState) obj;
        return Intrinsics.areEqual(this.f115111b, dVar.f115111b) && Intrinsics.areEqual(this.f115112c, dVar.f115112c) && Intrinsics.areEqual(this.f115113d, dVar.f115113d) && Intrinsics.areEqual(this.f115114e, dVar.f115114e) && Intrinsics.areEqual(this.f115115f, dVar.f115115f) && Intrinsics.areEqual(this.f115116g, dVar.f115116g) && Intrinsics.areEqual(this.f115117h, dVar.f115117h) && Intrinsics.areEqual(this.f115118i, dVar.f115118i);
    }

    public int hashCode() {
        Async<Pair<Map<Long, UserCustomStatus>, Long>> aVar = this.f115111b;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Event<IsAllowedCreateUserCustomStatusResponse> dVar = this.f115112c;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Event<ErrorEvent> dVar2 = this.f115113d;
        int hashCode3 = (hashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        Async<Map<CustomStatusSyncField, Boolean>> aVar2 = this.f115114e;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Async<Map<UserCustomStatus.Type, Long>> aVar3 = this.f115115f;
        int hashCode5 = (hashCode4 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        Async<ExpandableAdapter.DisplayState> aVar4 = this.f115116g;
        int hashCode6 = (hashCode5 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        Event<Boolean> dVar3 = this.f115117h;
        int hashCode7 = (hashCode6 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        Event<UserCustomStatus> dVar4 = this.f115118i;
        if (dVar4 != null) {
            i = dVar4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "CustomStatusState(getRequest=" + this.f115111b + ", isAllowCreate=" + this.f115112c + ", errorEvent=" + this.f115113d + ", syncSetting=" + this.f115114e + ", systemState=" + this.f115115f + ", settingDisplayState=" + this.f115116g + ", onBoardingEvent=" + this.f115117h + ", onBackPressEvent=" + this.f115118i + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState$Companion;", "", "()V", "POSITION_NOT_EXISTS", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    public final Async<Pair<Map<Long, UserCustomStatus>, Long>> mo160494i() {
        return this.f115111b;
    }

    /* renamed from: j */
    public final Event<IsAllowedCreateUserCustomStatusResponse> mo160495j() {
        return this.f115112c;
    }

    /* renamed from: k */
    public final Event<ErrorEvent> mo160496k() {
        return this.f115113d;
    }

    /* renamed from: l */
    public final Event<Boolean> mo160497l() {
        return this.f115117h;
    }

    /* renamed from: m */
    public final Event<UserCustomStatus> mo160498m() {
        return this.f115118i;
    }

    /* renamed from: a */
    public final List<UserCustomStatus> mo160484a() {
        Map<Long, UserCustomStatus> first;
        Collection<UserCustomStatus> values;
        Pair<Map<Long, UserCustomStatus>, Long> a = this.f115111b.mo86206a();
        if (a == null || (first = a.getFirst()) == null || (values = first.values()) == null) {
            return null;
        }
        return CollectionsKt.sortedWith(values, new C45497b());
    }

    /* renamed from: a */
    public final CustomStatusState mo160483a(Map<Long, UserCustomStatus> map) {
        List mutableList;
        Intrinsics.checkParameterIsNotNull(map, "map");
        List<UserCustomStatus> a = mo160484a();
        if (a == null || (mutableList = CollectionsKt.toMutableList((Collection) a)) == null) {
            return this;
        }
        List<UserCustomStatus> list = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UserCustomStatus userCustomStatus : list) {
            UserCustomStatus userCustomStatus2 = map.get(userCustomStatus.id);
            if (userCustomStatus2 != null) {
                userCustomStatus = userCustomStatus2;
            }
            arrayList.add(userCustomStatus);
        }
        return m180656a(this, arrayList, null, 2, null);
    }

    /* renamed from: n */
    private final long m180658n() {
        return C45616s.m180945b() / 1000;
    }

    /* renamed from: g */
    public final boolean mo160491g() {
        if (this.f115116g.mo86206a() == ExpandableAdapter.DisplayState.ShowCollapse) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Long mo160485b() {
        Map<UserCustomStatus.Type, Long> a = this.f115115f.mo86206a();
        if (a != null) {
            return a.get(UserCustomStatus.Type.ON_LEAVE);
        }
        return null;
    }

    /* renamed from: c */
    public final Long mo160486c() {
        Map<UserCustomStatus.Type, Long> a = this.f115115f.mo86206a();
        if (a != null) {
            return a.get(UserCustomStatus.Type.IN_MEETING);
        }
        return null;
    }

    /* renamed from: d */
    public final Boolean mo160487d() {
        Map<CustomStatusSyncField, Boolean> a = this.f115114e.mo86206a();
        if (a != null) {
            return a.get(CustomStatusSyncField.IS_SYN_ON_LEAVE);
        }
        return null;
    }

    /* renamed from: e */
    public final Boolean mo160488e() {
        Map<CustomStatusSyncField, Boolean> a = this.f115114e.mo86206a();
        if (a != null) {
            return a.get(CustomStatusSyncField.IS_SYN_MEETING);
        }
        return null;
    }

    /* renamed from: f */
    public final Boolean mo160490f() {
        Map<CustomStatusSyncField, Boolean> a = this.f115114e.mo86206a();
        if (a != null) {
            return a.get(CustomStatusSyncField.IS_SYN_SCHEDULE);
        }
        return null;
    }

    /* renamed from: h */
    public final CustomStatusState mo160492h() {
        Long l;
        Map<Long, UserCustomStatus> first;
        UserCustomStatus userCustomStatus;
        Pair<Map<Long, UserCustomStatus>, Long> a = this.f115111b.mo86206a();
        if (a != null) {
            l = a.getSecond();
        } else {
            l = null;
        }
        if (l != null && l.longValue() == -1) {
            return m180655a(this, null, null, null, null, null, null, null, new Event(C45499f.m180679b()), SmActions.ACTION_ONTHECALL_ENTRY, null);
        }
        Pair<Map<Long, UserCustomStatus>, Long> a2 = this.f115111b.mo86206a();
        if (a2 == null || (first = a2.getFirst()) == null || (userCustomStatus = first.get(l)) == null) {
            return m180655a(this, null, null, null, null, null, null, null, new Event(C45499f.m180679b()), SmActions.ACTION_ONTHECALL_ENTRY, null);
        }
        return m180655a(this, null, null, null, null, null, null, null, new Event(userCustomStatus), SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    /* renamed from: a */
    public final CustomStatusState mo160478a(UserCustomStatus userCustomStatus) {
        List mutableList;
        boolean z;
        Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
        List<UserCustomStatus> a = mo160484a();
        if (a == null || (mutableList = CollectionsKt.toMutableList((Collection) a)) == null) {
            return this;
        }
        Iterator it = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((UserCustomStatus) it.next()).type == UserCustomStatus.Type.CUSTOM) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (i != -1) {
            mutableList.add(i, userCustomStatus);
        } else {
            mutableList.add(userCustomStatus);
        }
        return m180656a(this, mutableList, null, 2, null);
    }

    /* renamed from: a */
    public final CustomStatusState mo160480a(ErrorEvent hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "errorEvent");
        return m180655a(this, null, null, new Event(hVar), null, null, null, null, null, 251, null);
    }

    /* renamed from: a */
    public final CustomStatusState mo160481a(List<UserCustomStatus> list) {
        Intrinsics.checkParameterIsNotNull(list, UpdateKey.STATUS);
        List<UserCustomStatus> a = mo160484a();
        if (a == null) {
            return this;
        }
        List<UserCustomStatus> list2 = a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m180654a(it.next(), list));
        }
        return m180656a(this, arrayList, null, 2, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.d$b */
    public static final class C45497b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(t.order_weight, t2.order_weight);
        }
    }

    /* renamed from: a */
    private final UserCustomStatus m180654a(UserCustomStatus userCustomStatus, List<UserCustomStatus> list) {
        for (T t : list) {
            if (Intrinsics.areEqual(t.id, userCustomStatus.id)) {
                return t;
            }
        }
        return userCustomStatus;
    }

    /* renamed from: a */
    private final boolean m180657a(UserCustomStatus userCustomStatus, UserCustomStatus userCustomStatus2) {
        Long l;
        Long l2;
        if (userCustomStatus2 == null) {
            return true;
        }
        int intValue = userCustomStatus.display_priority.intValue();
        Integer num = userCustomStatus2.display_priority;
        Intrinsics.checkExpressionValueIsNotNull(num, "oldStatus.display_priority");
        if (Intrinsics.compare(intValue, num.intValue()) < 0) {
            return true;
        }
        StatusEffectiveInterval statusEffectiveInterval = userCustomStatus.effective_interval;
        if (!(statusEffectiveInterval == null || (l = statusEffectiveInterval.start_time) == null)) {
            long longValue = l.longValue();
            StatusEffectiveInterval statusEffectiveInterval2 = userCustomStatus2.effective_interval;
            if (statusEffectiveInterval2 == null || (l2 = statusEffectiveInterval2.start_time) == null || longValue <= l2.longValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0026 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState mo160482a(java.util.List<com.bytedance.lark.pb.contact.v1.UserCustomStatus> r22, com.ss.android.lark.mine.impl.custom_status.model.FetchSource r23) {
        /*
        // Method dump skipped, instructions count: 401
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState.mo160482a(java.util.List, com.ss.android.lark.mine.impl.custom_status.model.FetchSource):com.ss.android.lark.mine.impl.custom_status.model.d");
    }

    /* renamed from: a */
    public static /* synthetic */ CustomStatusState m180656a(CustomStatusState dVar, List list, FetchSource fetchSource, int i, Object obj) {
        if ((i & 2) != 0) {
            fetchSource = FetchSource.Default;
        }
        return dVar.mo160482a(list, fetchSource);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.larksuite.arch.jack.a<? extends kotlin.Pair<? extends java.util.Map<java.lang.Long, com.bytedance.lark.pb.contact.v1.UserCustomStatus>, java.lang.Long>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.larksuite.arch.jack.d<? extends com.ss.android.lark.mine.impl.custom_status.model.h> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.larksuite.arch.jack.a<? extends java.util.Map<com.bytedance.lark.pb.contact.v1.CustomStatusSyncField, java.lang.Boolean>> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.larksuite.arch.jack.a<? extends java.util.Map<com.bytedance.lark.pb.contact.v1.UserCustomStatus$Type, java.lang.Long>> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.larksuite.arch.jack.a<? extends com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter$DisplayState> */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomStatusState(Async<? extends Pair<? extends Map<Long, UserCustomStatus>, Long>> aVar, Event<IsAllowedCreateUserCustomStatusResponse> dVar, Event<? extends ErrorEvent> dVar2, Async<? extends Map<CustomStatusSyncField, Boolean>> aVar2, Async<? extends Map<UserCustomStatus.Type, Long>> aVar3, Async<? extends ExpandableAdapter.DisplayState> aVar4, Event<Boolean> dVar3, Event<UserCustomStatus> dVar4) {
        Intrinsics.checkParameterIsNotNull(aVar, "getRequest");
        Intrinsics.checkParameterIsNotNull(dVar, "isAllowCreate");
        Intrinsics.checkParameterIsNotNull(dVar2, "errorEvent");
        Intrinsics.checkParameterIsNotNull(aVar2, "syncSetting");
        Intrinsics.checkParameterIsNotNull(aVar3, "systemState");
        Intrinsics.checkParameterIsNotNull(aVar4, "settingDisplayState");
        Intrinsics.checkParameterIsNotNull(dVar3, "onBoardingEvent");
        Intrinsics.checkParameterIsNotNull(dVar4, "onBackPressEvent");
        this.f115111b = aVar;
        this.f115112c = dVar;
        this.f115113d = dVar2;
        this.f115114e = aVar2;
        this.f115115f = aVar3;
        this.f115116g = aVar4;
        this.f115117h = dVar3;
        this.f115118i = dVar4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CustomStatusState(com.larksuite.arch.jack.Async r10, com.larksuite.arch.jack.Event r11, com.larksuite.arch.jack.Event r12, com.larksuite.arch.jack.Async r13, com.larksuite.arch.jack.Async r14, com.larksuite.arch.jack.Async r15, com.larksuite.arch.jack.Event r16, com.larksuite.arch.jack.Event r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mine.impl.custom_status.model.CustomStatusState.<init>(com.larksuite.arch.jack.a, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.a, com.larksuite.arch.jack.a, com.larksuite.arch.jack.a, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
