package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm;

import com.huawei.hms.maps.model.CameraPosition;
import com.larksuite.arch.jack.C24021e;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001$B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J)\u0010\u0018\u001a\u00020\u000e2\u001a\u0010\u0019\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a\"\u0006\u0012\u0002\b\u00030\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0017H\u0002J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0012¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/chatsetting/service/IChatSettingService;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "value", "", "isApprovalDescriptionsEmpty", "()Z", "setApprovalDescriptionsEmpty", "(Z)V", "isSubmittingApply", "setSubmittingApply", "defaultState", "fetchApprovalSettingInfo", "", "interceptError", "results", "", "Lcom/larksuite/rucket/job/base/RucketResult;", "([Lcom/larksuite/rucket/job/base/RucketResult;)Z", "selectApplyOption", "index", "", "setSubmitButtonEnableIfNeed", "submitApply", "descriptions", "", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a */
public final class ApplyGroupMemberLimitModel extends JackViewModel<ApplyMemberLimitPageState> {
    public static final Companion Companion = new Companion(null);
    private final Chat chat;
    public final AbstractC34461c.AbstractC34466e chatDependency;
    private boolean isApprovalDescriptionsEmpty = true;
    public boolean isSubmittingApply;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyGroupMemberLimitModel$Companion;", "", "()V", "TAG", "", "VALUE_NO_OPTION", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Chat getChat() {
        return this.chat;
    }

    public final boolean isApprovalDescriptionsEmpty() {
        return this.isApprovalDescriptionsEmpty;
    }

    private final void setSubmitButtonEnableIfNeed() {
        setState(new C34758e(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public ApplyMemberLimitPageState defaultState() {
        return new ApplyMemberLimitPageState(0, false, null, null, null, null, 63, null);
    }

    public final void fetchApprovalSettingInfo() {
        C24021e.m87797a(this, null, null, new C34751b(this, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel$fetchApprovalSettingInfo$1", mo239173f = "ApplyGroupMemberLimitModel.kt", mo239174i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, mo239175l = {CameraPosition.TILT_90, 91, 103}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "tenantId", "chatId", "approvalReq", "chatSettingReq", "pullApprovalSettingReq", "pullChatMemberSettingReq", "$this$launch", "tenantId", "chatId", "approvalReq", "chatSettingReq", "pullApprovalSettingReq", "pullChatMemberSettingReq", "approvalResp", "$this$launch", "tenantId", "chatId", "approvalReq", "chatSettingReq", "pullApprovalSettingReq", "pullChatMemberSettingReq", "approvalResp", "chatSettingResp", "curSelectOption", "options", "approvalIds"}, mo239178s = {"L$0", "J$0", "J$1", "L$1", "L$2", "L$3", "L$4", "L$0", "J$0", "J$1", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "J$0", "J$1", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$b */
    public static final class C34751b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ApplyGroupMemberLimitModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34751b(ApplyGroupMemberLimitModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34751b bVar = new C34751b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34751b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$b$a */
        public static final class C34754a extends Lambda implements Function1<IGetDataCallback<Map<String, ? extends Chatter>>, Unit> {
            final /* synthetic */ List $approvalIds;
            final /* synthetic */ C34751b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34754a(C34751b bVar, List list) {
                super(1);
                this.this$0 = bVar;
                this.$approvalIds = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IGetDataCallback<Map<String, ? extends Chatter>> iGetDataCallback) {
                invoke((IGetDataCallback<Map<String, Chatter>>) iGetDataCallback);
                return Unit.INSTANCE;
            }

            public final void invoke(IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
                Intrinsics.checkParameterIsNotNull(iGetDataCallback, "it");
                this.this$0.this$0.chatDependency.mo127362b(this.$approvalIds, iGetDataCallback);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x016e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0210  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
            // Method dump skipped, instructions count: 588
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel.C34751b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$d */
    public static final class C34756d extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ int $index;
        final /* synthetic */ ApplyGroupMemberLimitModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34756d(ApplyGroupMemberLimitModel aVar, int i) {
            super(1);
            this.this$0 = aVar;
            this.$index = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            int size = bVar.mo128326c().size();
            int i = this.$index;
            if (i >= 0 && size > i) {
                this.this$0.setState(new Function1<ApplyMemberLimitPageState, ApplyMemberLimitPageState>(this) {
                    /* class com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel.C34756d.C347571 */
                    final /* synthetic */ C34756d this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final ApplyMemberLimitPageState invoke(ApplyMemberLimitPageState bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                        return ApplyMemberLimitPageState.m135141a(bVar, bVar.mo128326c().get(this.this$0.$index).intValue(), false, null, null, null, null, 62, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$f */
    public static final class C34759f extends Lambda implements Function1<ApplyMemberLimitPageState, Unit> {
        final /* synthetic */ String $descriptions;
        final /* synthetic */ ApplyGroupMemberLimitModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34759f(ApplyGroupMemberLimitModel aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$descriptions = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApplyMemberLimitPageState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ApplyMemberLimitPageState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            boolean b = bVar.mo128325b();
            final int a = bVar.mo128323a();
            if (b) {
                C24021e.m87797a(this.this$0, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                    /* class com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.vm.ApplyGroupMemberLimitModel.C34759f.C347601 */
                    long J$0;
                    Object L$0;
                    Object L$1;
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C34759f this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C347601 r0 = 

                        public final void selectApplyOption(int i) {
                            withState(new C34756d(this, i));
                        }

                        public final void setApprovalDescriptionsEmpty(boolean z) {
                            if (this.isApprovalDescriptionsEmpty != z) {
                                this.isApprovalDescriptionsEmpty = z;
                                setSubmitButtonEnableIfNeed();
                            }
                        }

                        public final void setSubmittingApply(boolean z) {
                            if (this.isSubmittingApply != z) {
                                this.isSubmittingApply = z;
                                setSubmitButtonEnableIfNeed();
                            }
                        }

                        public final void submitApply(String str) {
                            Intrinsics.checkParameterIsNotNull(str, "descriptions");
                            withState(new C34759f(this, str));
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$c */
                        public static final class C34755c extends Lambda implements Function1<ApplyMemberLimitPageState, ApplyMemberLimitPageState> {
                            final /* synthetic */ RucketResult.Error $err;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C34755c(RucketResult.Error bVar) {
                                super(1);
                                this.$err = bVar;
                            }

                            public final ApplyMemberLimitPageState invoke(ApplyMemberLimitPageState bVar) {
                                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                                return ApplyMemberLimitPageState.m135141a(bVar, 0, false, null, null, null, new Event(this.$err.mo93493c()), 31, null);
                            }
                        }

                        public ApplyGroupMemberLimitModel(Chat chat2) {
                            Intrinsics.checkParameterIsNotNull(chat2, "chat");
                            this.chat = chat2;
                            AbstractC34461c a = ChatSettingModule.m133639a();
                            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                            this.chatDependency = a.mo127274d();
                        }

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/vm/ApplyMemberLimitPageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
                        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.b.a$e */
                        public static final class C34758e extends Lambda implements Function1<ApplyMemberLimitPageState, ApplyMemberLimitPageState> {
                            final /* synthetic */ ApplyGroupMemberLimitModel this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C34758e(ApplyGroupMemberLimitModel aVar) {
                                super(1);
                                this.this$0 = aVar;
                            }

                            public final ApplyMemberLimitPageState invoke(ApplyMemberLimitPageState bVar) {
                                boolean z;
                                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                                if (this.this$0.isSubmittingApply || this.this$0.isApprovalDescriptionsEmpty()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                return ApplyMemberLimitPageState.m135141a(bVar, 0, z, null, null, null, null, 61, null);
                            }
                        }

                        public final boolean interceptError(RucketResult<?>... bVarArr) {
                            ArrayList arrayList = new ArrayList();
                            for (RucketResult<?> bVar : bVarArr) {
                                if (bVar instanceof RucketResult.Error) {
                                    arrayList.add(bVar);
                                }
                            }
                            RucketResult.Error bVar2 = (RucketResult.Error) CollectionsKt.firstOrNull((List) arrayList);
                            if (bVar2 == null) {
                                return false;
                            }
                            setState(new C34755c(bVar2));
                            return true;
                        }
                    }
