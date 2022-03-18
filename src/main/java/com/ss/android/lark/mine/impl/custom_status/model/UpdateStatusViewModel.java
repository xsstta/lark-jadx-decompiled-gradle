package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.DeleteUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusService;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0006\u0010\t\u001a\u00020\nJQ\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\nJO\u0010\u0018\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0016¢\u0006\u0002\u0010\u001bJA\u0010\u001c\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/AbsModifyAwareViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusService;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;)V", "defaultState", "delete", "", "generateModifyMeta", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "state", "title", "", "iconKey", "isNotDisturbMode", "", "syncSetting", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "(Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "sendDeleteStatusClick", "tryLeave", "onModified", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "trySave", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "updateAutoSyncSetting", "field", "enable", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.l */
public final class UpdateStatusViewModel extends AbsModifyAwareViewModel<UpdateStatusState> {
    private final UserCustomStatus status;

    public final void sendDeleteStatusClick() {
        withState(C45534b.INSTANCE);
    }

    public final void delete() {
        withState(new C45529a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public UpdateStatusState defaultState() {
        return new UpdateStatusState(this.status, null, null, null, null, null, 62, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.l$a */
    public static final class C45529a extends Lambda implements Function1<UpdateStatusState, Unit> {
        final /* synthetic */ UpdateStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45529a(UpdateStatusViewModel lVar) {
            super(1);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
            invoke(jVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UpdateStatusState jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "state");
            DeleteUserCustomStatusRequest a = new DeleteUserCustomStatusRequest.C16162a().mo57990a(CollectionsKt.listOf(Long.valueOf(jVar.mo160540a()))).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "deleteRequest.build()");
            RucketJob.m95402b(RucketJob.m95401a(UserCustomStatusService.C45609a.m180935a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a, (Function1) null, 2, (Object) null), (CoroutineContext) null, new Function2<DeleteUserCustomStatusResponse, Continuation<? super Unit>, Object>(this, null) {
                /* class com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusViewModel.C45529a.C455301 */
                int label;
                private DeleteUserCustomStatusResponse p$0;
                final /* synthetic */ C45529a this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                    C455301 r0 = 

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.l$b */
                    static final class C45534b extends Lambda implements Function1<UpdateStatusState, Unit> {
                        public static final C45534b INSTANCE = new C45534b();

                        C45534b() {
                            super(1);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
                            invoke(jVar);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(UpdateStatusState jVar) {
                            Intrinsics.checkParameterIsNotNull(jVar, "it");
                            UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
                            String str = jVar.mo160554h().event_name;
                            Intrinsics.checkExpressionValueIsNotNull(str, "it.currentStatus.event_name");
                            aVar.mo160424e(str);
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.l$c */
                    static final class C45535c extends Lambda implements Function1<UpdateStatusState, Unit> {
                        final /* synthetic */ String $iconKey;
                        final /* synthetic */ Boolean $isNotDisturbMode;
                        final /* synthetic */ Function0 $onModified;
                        final /* synthetic */ Map $syncSetting;
                        final /* synthetic */ String $title;
                        final /* synthetic */ UpdateStatusViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C45535c(UpdateStatusViewModel lVar, String str, String str2, Boolean bool, Map map, Function0 function0) {
                            super(1);
                            this.this$0 = lVar;
                            this.$title = str;
                            this.$iconKey = str2;
                            this.$isNotDisturbMode = bool;
                            this.$syncSetting = map;
                            this.$onModified = function0;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
                            invoke(jVar);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(UpdateStatusState jVar) {
                            Intrinsics.checkParameterIsNotNull(jVar, "it");
                            UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
                            String str = jVar.mo160554h().event_name;
                            Intrinsics.checkExpressionValueIsNotNull(str, "it.currentStatus.event_name");
                            aVar.mo160413b(str);
                            if (this.this$0.generateModifyMeta(jVar, this.$title, this.$iconKey, this.$isNotDisturbMode, this.$syncSetting).fields.isEmpty()) {
                                this.this$0.setState(C455361.INSTANCE);
                            } else {
                                this.$onModified.invoke();
                            }
                        }
                    }

                    /* access modifiers changed from: package-private */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.l$d */
                    public static final class C45537d extends Lambda implements Function1<UpdateStatusState, Unit> {
                        final /* synthetic */ String $iconKey;
                        final /* synthetic */ Boolean $isNotDisturbMode;
                        final /* synthetic */ Map $syncSetting;
                        final /* synthetic */ String $title;
                        final /* synthetic */ UpdateStatusViewModel this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C45537d(UpdateStatusViewModel lVar, Map map, Boolean bool, String str, String str2) {
                            super(1);
                            this.this$0 = lVar;
                            this.$syncSetting = map;
                            this.$isNotDisturbMode = bool;
                            this.$title = str;
                            this.$iconKey = str2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
                            invoke(jVar);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(UpdateStatusState jVar) {
                            boolean z;
                            Intrinsics.checkParameterIsNotNull(jVar, "it");
                            Map map = this.$syncSetting;
                            boolean z2 = false;
                            if (map == null || map.isEmpty()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                UserCustomStatusHitPoint aVar = UserCustomStatusHitPoint.f115066a;
                                String str = jVar.mo160554h().event_name;
                                Intrinsics.checkExpressionValueIsNotNull(str, "it.currentStatus.event_name");
                                Boolean bool = this.$isNotDisturbMode;
                                if (bool != null) {
                                    z2 = bool.booleanValue();
                                }
                                aVar.mo160406a(str, z2);
                            } else {
                                UserCustomStatusHitPoint aVar2 = UserCustomStatusHitPoint.f115066a;
                                String str2 = jVar.mo160554h().event_name;
                                Intrinsics.checkExpressionValueIsNotNull(str2, "it.currentStatus.event_name");
                                Boolean bool2 = this.$isNotDisturbMode;
                                if (bool2 != null) {
                                    z2 = bool2.booleanValue();
                                }
                                aVar2.mo160407a(str2, z2, this.$syncSetting.values().contains(true));
                            }
                            UpdateUserCustomStatusMeta generateModifyMeta = this.this$0.generateModifyMeta(jVar, this.$title, this.$iconKey, this.$isNotDisturbMode, this.$syncSetting);
                            if (generateModifyMeta.fields.isEmpty()) {
                                this.this$0.setState(C455381.INSTANCE);
                                return;
                            }
                            List<UpdateUserCustomStatusMeta.UserCustomStatusField> list = generateModifyMeta.fields;
                            Intrinsics.checkExpressionValueIsNotNull(list, "meta.fields");
                            for (T t : list) {
                                if (t != null) {
                                    int i = C45548m.f115133a[t.ordinal()];
                                    if (i == 1) {
                                        UserCustomStatusHitPoint aVar3 = UserCustomStatusHitPoint.f115066a;
                                        String str3 = jVar.mo160554h().event_name;
                                        Intrinsics.checkExpressionValueIsNotNull(str3, "it.currentStatus.event_name");
                                        aVar3.mo160421d(str3);
                                    } else if (i == 2) {
                                        UserCustomStatusHitPoint aVar4 = UserCustomStatusHitPoint.f115066a;
                                        String str4 = jVar.mo160554h().event_name;
                                        Intrinsics.checkExpressionValueIsNotNull(str4, "it.currentStatus.event_name");
                                        aVar4.mo160417c(str4);
                                    }
                                }
                            }
                            UpdateUserCustomStatusRequest a = new UpdateUserCustomStatusRequest.C16416a().mo58598a(CollectionsKt.listOf(generateModifyMeta)).build();
                            Intrinsics.checkExpressionValueIsNotNull(a, "UpdateUserCustomStatusRe…                ).build()");
                            RucketJob.m95402b(RucketJob.m95401a(UserCustomStatusService.C45609a.m180938a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a, (Function1) null, 2, (Object) null), (CoroutineContext) null, new Function2<UpdateUserCustomStatusResponse, Continuation<? super Unit>, Object>(this, null) {
                                /* class com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusViewModel.C45537d.C455392 */
                                int label;
                                private UpdateUserCustomStatusResponse p$0;
                                final /* synthetic */ C45537d this$0;

                                {
                                    this.this$0 = r1;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                    C455392 r0 = 

                                    /* access modifiers changed from: package-private */
                                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/mine/impl/custom_status/model/UpdateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                                    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.l$e */
                                    public static final class C45543e extends Lambda implements Function1<UpdateStatusState, Unit> {
                                        final /* synthetic */ boolean $enable;
                                        final /* synthetic */ CustomStatusSyncField $field;
                                        final /* synthetic */ UpdateStatusViewModel this$0;

                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                        C45543e(UpdateStatusViewModel lVar, boolean z, CustomStatusSyncField customStatusSyncField) {
                                            super(1);
                                            this.this$0 = lVar;
                                            this.$enable = z;
                                            this.$field = customStatusSyncField;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(UpdateStatusState jVar) {
                                            invoke(jVar);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(UpdateStatusState jVar) {
                                            Intrinsics.checkParameterIsNotNull(jVar, "state");
                                            final Map mutableMap = MapsKt.toMutableMap(jVar.mo160553g());
                                            mutableMap.put(this.$field, Boolean.valueOf(this.$enable));
                                            RucketJob.m95402b(RucketJob.m95401a(C45616s.m180941a(jVar.mo160540a(), mutableMap, (UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class)), (CoroutineContext) null, new Function2<UpdateUserCustomStatusResponse, Continuation<? super Unit>, Object>(this, null) {
                                                /* class com.ss.android.lark.mine.impl.custom_status.model.UpdateStatusViewModel.C45543e.C455441 */
                                                int label;
                                                private UpdateUserCustomStatusResponse p$0;
                                                final /* synthetic */ C45543e this$0;

                                                {
                                                    this.this$0 = r1;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                                    C455441 r0 = 

                                                    public UpdateStatusViewModel(UserCustomStatus userCustomStatus) {
                                                        Intrinsics.checkParameterIsNotNull(userCustomStatus, UpdateKey.STATUS);
                                                        this.status = userCustomStatus;
                                                    }

                                                    public final void updateAutoSyncSetting(CustomStatusSyncField customStatusSyncField, boolean z) {
                                                        Intrinsics.checkParameterIsNotNull(customStatusSyncField, "field");
                                                        withState(new C45543e(this, z, customStatusSyncField));
                                                    }

                                                    @Override // com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel
                                                    public void trySave(String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map) {
                                                        withState(new C45537d(this, map, bool, str, str2));
                                                    }

                                                    public final UpdateUserCustomStatusMeta generateModifyMeta(UpdateStatusState jVar, String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map) {
                                                        return getModifyMeta(jVar.mo160554h(), str, str2, bool, map);
                                                    }

                                                    @Override // com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel
                                                    public void tryLeave(String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map, Function0<Unit> function0) {
                                                        Intrinsics.checkParameterIsNotNull(function0, "onModified");
                                                        withState(new C45535c(this, str, str2, bool, map, function0));
                                                    }

                                                    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.mine.impl.custom_status.model.l */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    static /* synthetic */ UpdateUserCustomStatusMeta generateModifyMeta$default(UpdateStatusViewModel lVar, UpdateStatusState jVar, String str, String str2, Boolean bool, Map map, int i, Object obj) {
                                                        if ((i & 2) != 0) {
                                                            str = null;
                                                        }
                                                        if ((i & 4) != 0) {
                                                            str2 = null;
                                                        }
                                                        if ((i & 8) != 0) {
                                                            bool = null;
                                                        }
                                                        if ((i & 16) != 0) {
                                                            map = null;
                                                        }
                                                        return lVar.generateModifyMeta(jVar, str, str2, bool, map);
                                                    }
                                                }
