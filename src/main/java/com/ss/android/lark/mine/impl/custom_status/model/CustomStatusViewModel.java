package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.basic.v1.StatusEffectiveInterval;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.GetUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.GetUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.C24021e;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.Fail;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.Success;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusService;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.setting.ExpandableAdapter;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusRequest;
import com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J\u001a\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00180\u0014J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00180\u0014J\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0016J\u0014\u0010%\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\"J\u000e\u0010(\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0016J\u0006\u0010*\u001a\u00020\u0007J\u001a\u0010+\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010,\u001a\u00020\u0015H\u0002¨\u0006."}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusService;", "()V", "checkIsAllowCreateUserCustomStatus", "", "completeOnBoarding", "defaultState", "fetchOnBoarding", "fetchUserCustomStatus", ShareHitPoint.f121868c, "Lcom/ss/android/lark/mine/impl/custom_status/model/FetchSource;", "getUpdateSyncSettingMeta", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusResponse;", "id", "", "map", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "", "notifyAfterDelete", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "notifyInsert", UpdateKey.STATUS, "notifyModify", "onBackPress", "saveSettingDisplayState", "displayState", "Lcom/ss/android/lark/mine/impl/custom_status/setting/ExpandableAdapter$DisplayState;", "setUserCustomStatus", "statusCollection", "", "updateMeetingSyncSetting", "enable", "updateMeta", "list", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "updateOnLeaveSyncSetting", "updateScheduleSyncSetting", "updateSyncSettingOnBoarding", "handleSyncSetting", "syncField", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g */
public final class CustomStatusViewModel extends JackViewModel<CustomStatusState> {
    public static final Companion Companion = new Companion(null);

    public final void saveSettingDisplayState(ExpandableAdapter.DisplayState displayState) {
        Intrinsics.checkParameterIsNotNull(displayState, "displayState");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusViewModel$Companion;", "", "()V", "CUSTOM_STATUS_GUIDE_KEY", "", "TAG", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onBackPress() {
        setState(C45518l.INSTANCE);
    }

    public final void updateSyncSettingOnBoarding() {
        withState(new C45527s(this));
    }

    public final void completeOnBoarding() {
        C24021e.m87797a(this, null, null, new C45504d(null), 3, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public CustomStatusState defaultState() {
        return new CustomStatusState(null, null, null, null, null, null, null, null, 255, null);
    }

    public final void fetchOnBoarding() {
        C24021e.m87797a(this, null, null, new C45505e(this, null), 3, null);
    }

    public final void checkIsAllowCreateUserCustomStatus() {
        IsAllowedCreateUserCustomStatusRequest a = new IsAllowedCreateUserCustomStatusRequest.C49805a().build();
        Intrinsics.checkExpressionValueIsNotNull(a, "IsAllowedCreateUserCusto…Request.Builder().build()");
        RucketJob.m95402b(RucketJob.m95401a(UserCustomStatusService.C45609a.m180939a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a, (Function1) null, 2, (Object) null), (CoroutineContext) null, new C45500b(this, null), 1, (Object) null), null, new C45502c(this, null), 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$n */
    static final class C45520n extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45520n(CustomStatusViewModel gVar, boolean z) {
            super(1);
            this.this$0 = gVar;
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "state");
            Long c = dVar.mo160486c();
            if (c != null) {
                long longValue = c.longValue();
                Map<CustomStatusSyncField, Boolean> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(CustomStatusSyncField.IS_SYN_MEETING, Boolean.valueOf(this.$enable)));
                Boolean f = dVar.mo160490f();
                if (f != null) {
                    mutableMapOf.put(CustomStatusSyncField.IS_SYN_SCHEDULE, Boolean.valueOf(f.booleanValue()));
                }
                CustomStatusViewModel gVar = this.this$0;
                gVar.handleSyncSetting(gVar.getUpdateSyncSettingMeta(longValue, mutableMapOf), CustomStatusSyncField.IS_SYN_MEETING);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$q */
    static final class C45525q extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45525q(CustomStatusViewModel gVar, boolean z) {
            super(1);
            this.this$0 = gVar;
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "state");
            Long b = dVar.mo160485b();
            if (b != null) {
                long longValue = b.longValue();
                CustomStatusViewModel gVar = this.this$0;
                gVar.handleSyncSetting(gVar.getUpdateSyncSettingMeta(longValue, MapsKt.mapOf(TuplesKt.to(CustomStatusSyncField.IS_SYN_ON_LEAVE, Boolean.valueOf(this.$enable)))), CustomStatusSyncField.IS_SYN_ON_LEAVE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$r */
    static final class C45526r extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45526r(CustomStatusViewModel gVar, boolean z) {
            super(1);
            this.this$0 = gVar;
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "state");
            Long c = dVar.mo160486c();
            if (c != null) {
                long longValue = c.longValue();
                Map<CustomStatusSyncField, Boolean> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(CustomStatusSyncField.IS_SYN_SCHEDULE, Boolean.valueOf(this.$enable)));
                Boolean e = dVar.mo160488e();
                if (e != null) {
                    mutableMapOf.put(CustomStatusSyncField.IS_SYN_MEETING, Boolean.valueOf(e.booleanValue()));
                }
                CustomStatusViewModel gVar = this.this$0;
                gVar.handleSyncSetting(gVar.getUpdateSyncSettingMeta(longValue, mutableMapOf), CustomStatusSyncField.IS_SYN_SCHEDULE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$s */
    static final class C45527s extends Lambda implements Function1<CustomStatusState, Unit> {
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45527s(CustomStatusViewModel gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CustomStatusState dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "state");
            Long c = dVar.mo160486c();
            if (c != null) {
                long longValue = c.longValue();
                Map<CustomStatusSyncField, Boolean> mapOf = MapsKt.mapOf(TuplesKt.to(CustomStatusSyncField.IS_SYN_SCHEDULE, true), TuplesKt.to(CustomStatusSyncField.IS_SYN_MEETING, true));
                CustomStatusViewModel gVar = this.this$0;
                gVar.handleSyncSetting(gVar.getUpdateSyncSettingMeta(longValue, mapOf), CustomStatusSyncField.IS_SYN_SCHEDULE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$j */
    static final class C45516j extends Lambda implements Function1<CustomStatusState, CustomStatusState> {
        final /* synthetic */ UserCustomStatus $status;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45516j(UserCustomStatus userCustomStatus) {
            super(1);
            this.$status = userCustomStatus;
        }

        public final CustomStatusState invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return dVar.mo160478a(this.$status);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$k */
    static final class C45517k extends Lambda implements Function1<CustomStatusState, CustomStatusState> {
        final /* synthetic */ Map $map;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45517k(Map map) {
            super(1);
            this.$map = map;
        }

        public final CustomStatusState invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return dVar.mo160483a(this.$map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$l */
    static final class C45518l extends Lambda implements Function1<CustomStatusState, CustomStatusState> {
        public static final C45518l INSTANCE = new C45518l();

        C45518l() {
            super(1);
        }

        public final CustomStatusState invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return dVar.mo160492h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$m */
    static final class C45519m extends Lambda implements Function1<CustomStatusState, CustomStatusState> {
        final /* synthetic */ List $statusCollection;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45519m(List list) {
            super(1);
            this.$statusCollection = list;
        }

        public final CustomStatusState invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return CustomStatusState.m180656a(dVar, this.$statusCollection, null, 2, null);
        }
    }

    public final void notifyAfterDelete(Map<Long, UserCustomStatus> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        setState(new C45515i(map));
    }

    public final void notifyInsert(UserCustomStatus userCustomStatus) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
        setState(new C45516j(userCustomStatus));
    }

    public final void notifyModify(Map<Long, UserCustomStatus> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        setState(new C45517k(map));
    }

    @Deprecated(message = "For Test Only")
    public final void setUserCustomStatus(List<UserCustomStatus> list) {
        Intrinsics.checkParameterIsNotNull(list, "statusCollection");
        setState(new C45519m(list));
    }

    public final void updateMeetingSyncSetting(boolean z) {
        withState(new C45520n(this, z));
    }

    public final void updateOnLeaveSyncSetting(boolean z) {
        withState(new C45525q(this, z));
    }

    public final void updateScheduleSyncSetting(boolean z) {
        withState(new C45526r(this, z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$fetchOnBoarding$1", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$e */
    static final class C45505e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45505e(CustomStatusViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45505e eVar = new C45505e(this.this$0, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C45505e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.this$0.setState(C455061.INSTANCE);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/custom_status/model/CustomStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$i */
    static final class C45515i extends Lambda implements Function1<CustomStatusState, CustomStatusState> {
        final /* synthetic */ Map $map;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45515i(Map map) {
            super(1);
            this.$map = map;
        }

        public final CustomStatusState invoke(CustomStatusState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return CustomStatusState.m180656a(dVar, CollectionsKt.toList(this.$map.values()), null, 2, null);
        }
    }

    public final void fetchUserCustomStatus(FetchSource fetchSource) {
        Intrinsics.checkParameterIsNotNull(fetchSource, ShareHitPoint.f121868c);
        C24021e.m87797a(this, null, null, new C45507f(this, fetchSource, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/im_settings/IsAllowedCreateUserCustomStatusResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$checkIsAllowCreateUserCustomStatus$1", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$b */
    static final class C45500b extends SuspendLambda implements Function2<IsAllowedCreateUserCustomStatusResponse, Continuation<? super Unit>, Object> {
        int label;
        private IsAllowedCreateUserCustomStatusResponse p$0;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45500b(CustomStatusViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45500b bVar = new C45500b(this.this$0, cVar);
            bVar.p$0 = (IsAllowedCreateUserCustomStatusResponse) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IsAllowedCreateUserCustomStatusResponse isAllowedCreateUserCustomStatusResponse, Continuation<? super Unit> cVar) {
            return ((C45500b) create(isAllowedCreateUserCustomStatusResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final IsAllowedCreateUserCustomStatusResponse isAllowedCreateUserCustomStatusResponse = this.p$0;
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45500b.C455011 */

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        return CustomStatusState.m180655a(dVar, null, new Event(isAllowedCreateUserCustomStatusResponse), null, null, null, null, null, null, 253, null);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$checkIsAllowCreateUserCustomStatus$2", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$c */
    static final class C45502c extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        int label;
        private ErrorResult p$0;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45502c(CustomStatusViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45502c cVar2 = new C45502c(this.this$0, cVar);
            cVar2.p$0 = (ErrorResult) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C45502c) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final ErrorResult errorResult = this.p$0;
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45502c.C455031 */

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        return dVar.mo160480a(new ErrorEvent.IsAllowedToCreateStatus(errorResult));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$completeOnBoarding$1", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$d */
    static final class C45504d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;

        C45504d(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45504d dVar = new C45504d(cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C45504d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                AbstractC45399a a = C45421b.m180420a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
                a.mo133445d().mo133468a("all_im_status_setting");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$handleSyncSetting$1", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$g */
    public static final class C45511g extends SuspendLambda implements Function2<UpdateUserCustomStatusResponse, Continuation<? super Unit>, Object> {
        int label;
        private UpdateUserCustomStatusResponse p$0;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45511g(CustomStatusViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45511g gVar = new C45511g(this.this$0, cVar);
            gVar.p$0 = (UpdateUserCustomStatusResponse) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdateUserCustomStatusResponse updateUserCustomStatusResponse, Continuation<? super Unit> cVar) {
            return ((C45511g) create(updateUserCustomStatusResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final UpdateUserCustomStatusResponse updateUserCustomStatusResponse = this.p$0;
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45511g.C455121 */

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        return dVar.mo160481a(CollectionsKt.toList(updateUserCustomStatusResponse.status.values()));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$handleSyncSetting$2", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$h */
    public static final class C45513h extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ CustomStatusSyncField $syncField;
        int label;
        private ErrorResult p$0;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45513h(CustomStatusViewModel gVar, CustomStatusSyncField customStatusSyncField, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
            this.$syncField = customStatusSyncField;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45513h hVar = new C45513h(this.this$0, this.$syncField, cVar);
            hVar.p$0 = (ErrorResult) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C45513h) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final ErrorResult errorResult = this.p$0;
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>(this) {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45513h.C455141 */
                    final /* synthetic */ C45513h this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        return dVar.mo160480a(new ErrorEvent.SettingSync(errorResult, this.this$0.$syncField));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$updateMeta$1", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$o */
    static final class C45521o extends SuspendLambda implements Function2<UpdateUserCustomStatusResponse, Continuation<? super Unit>, Object> {
        int label;
        private UpdateUserCustomStatusResponse p$0;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45521o(CustomStatusViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45521o oVar = new C45521o(this.this$0, cVar);
            oVar.p$0 = (UpdateUserCustomStatusResponse) obj;
            return oVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UpdateUserCustomStatusResponse updateUserCustomStatusResponse, Continuation<? super Unit> cVar) {
            return ((C45521o) create(updateUserCustomStatusResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final UpdateUserCustomStatusResponse updateUserCustomStatusResponse = this.p$0;
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45521o.C455221 */

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        return dVar.mo160481a(CollectionsKt.filterNotNull(updateUserCustomStatusResponse.status.values()));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$updateMeta$2", mo239173f = "CustomStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$p */
    public static final class C45523p extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $list;
        int label;
        private ErrorResult p$0;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45523p(CustomStatusViewModel gVar, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45523p pVar = new C45523p(this.this$0, this.$list, cVar);
            pVar.p$0 = (ErrorResult) obj;
            return pVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C45523p) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final ErrorResult errorResult = this.p$0;
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>(this) {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45523p.C455241 */
                    final /* synthetic */ C45523p this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Long l;
                        boolean z;
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        ErrorResult errorResult = errorResult;
                        List list = this.this$0.$list;
                        boolean z2 = true;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                StatusEffectiveInterval statusEffectiveInterval = ((UpdateUserCustomStatusMeta) it.next()).effective_interval;
                                if (statusEffectiveInterval != null) {
                                    l = statusEffectiveInterval.start_time;
                                } else {
                                    l = null;
                                }
                                if (l != null && l.longValue() == 0) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        return dVar.mo160480a(new ErrorEvent.SwitchStatus(errorResult, z2));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateMeta(List<UpdateUserCustomStatusMeta> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        UpdateUserCustomStatusRequest a = new UpdateUserCustomStatusRequest.C16416a().mo58598a(list).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        RucketJob.m95402b(RucketJob.m95401a(UserCustomStatusService.C45609a.m180938a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a, (Function1) null, 2, (Object) null), (CoroutineContext) null, new C45521o(this, null), 1, (Object) null), null, new C45523p(this, list, null), 1, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel$fetchUserCustomStatus$1", mo239173f = "CustomStatusViewModel.kt", mo239174i = {0}, mo239175l = {44}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.g$f */
    public static final class C45507f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FetchSource $source;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CustomStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45507f(CustomStatusViewModel gVar, FetchSource fetchSource, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
            this.$source = fetchSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45507f fVar = new C45507f(this.this$0, this.$source, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C45507f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                this.this$0.setState(C455081.INSTANCE);
                GetUserCustomStatusRequest a2 = new GetUserCustomStatusRequest.C16272a().build();
                Intrinsics.checkExpressionValueIsNotNull(a2, "GetUserCustomStatusRequest.Builder().build()");
                RucketJob a3 = UserCustomStatusService.C45609a.m180937a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a2, (Function1) null, 2, (Object) null);
                this.L$0 = ahVar;
                this.label = 1;
                obj = a3.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final Async a4 = C24021e.m87795a((RucketResult) obj);
            if (a4 instanceof Success) {
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>(this) {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45507f.C455092 */
                    final /* synthetic */ C45507f this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        List<UserCustomStatus> list = ((GetUserCustomStatusResponse) ((Success) a4).mo86206a()).status;
                        Intrinsics.checkExpressionValueIsNotNull(list, "result().status");
                        return dVar.mo160482a(list, this.this$0.$source);
                    }
                });
            } else if (a4 instanceof Fail) {
                this.this$0.setState(new Function1<CustomStatusState, CustomStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CustomStatusViewModel.C45507f.C455103 */

                    public final CustomStatusState invoke(CustomStatusState dVar) {
                        Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                        Throwable b = ((Fail) a4).mo86216b();
                        if (b != null) {
                            return dVar.mo160480a(new ErrorEvent.GetUserStatus((ErrorResult) b));
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.framework.callback.Entity.ErrorResult");
                    }
                });
                UserCustomStatusHitPoint.f115066a.mo160409a(false, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public final RucketJob<UpdateUserCustomStatusResponse> getUpdateSyncSettingMeta(long j, Map<CustomStatusSyncField, Boolean> map) {
        return C45616s.m180941a(j, map, (UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class));
    }

    public final void handleSyncSetting(RucketJob<UpdateUserCustomStatusResponse> aVar, CustomStatusSyncField customStatusSyncField) {
        RucketJob.m95402b(RucketJob.m95401a(aVar, (CoroutineContext) null, new C45511g(this, null), 1, (Object) null), null, new C45513h(this, customStatusSyncField, null), 1, null);
    }
}
