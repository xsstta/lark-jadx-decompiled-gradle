package com.ss.android.lark.mine.impl.custom_status.model;

import android.text.TextUtils;
import com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusRequest;
import com.bytedance.lark.pb.contact.v1.CreateUserCustomStatusResponse;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.larksuite.arch.jack.Event;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusService;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.statistics.UserCustomStatusHitPoint;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\b\u0010\u0011\u001a\u00020\nH\u0014JO\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0016¢\u0006\u0002\u0010\u0018JA\u0010\u0019\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/AbsModifyAwareViewModel;", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusService;", "()V", "createJob", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/bytedance/lark/pb/contact/v1/CreateUserCustomStatusResponse;", "createCustomStatus", "", "title", "", "iconKey", "isNotDisturbMode", "", "defaultState", "onCleared", "tryLeave", "syncSetting", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "onModified", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "trySave", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.c */
public final class CreateStatusViewModel extends AbsModifyAwareViewModel<CreateStatusState> {
    private RucketJob<CreateUserCustomStatusResponse> createJob;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public CreateStatusState defaultState() {
        return new CreateStatusState(null, null, null, null, 15, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.larksuite.arch.jack.JackViewModel
    public void onCleared() {
        super.onCleared();
        RucketJob<CreateUserCustomStatusResponse> aVar = this.createJob;
        if (aVar != null) {
            aVar.mo93464a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/impl/custom_status/model/CreateStatusState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.c$c */
    static final class C45496c extends Lambda implements Function1<CreateStatusState, CreateStatusState> {
        public static final C45496c INSTANCE = new C45496c();

        C45496c() {
            super(1);
        }

        public final CreateStatusState invoke(CreateStatusState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return CreateStatusState.m180643a(bVar, null, null, new Event(true), null, 11, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/contact/v1/CreateUserCustomStatusResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CreateStatusViewModel$createCustomStatus$1", mo239173f = "CreateStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.c$a */
    public static final class C45492a extends SuspendLambda implements Function2<CreateUserCustomStatusResponse, Continuation<? super Unit>, Object> {
        int label;
        private CreateUserCustomStatusResponse p$0;
        final /* synthetic */ CreateStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45492a(CreateStatusViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45492a aVar = new C45492a(this.this$0, cVar);
            aVar.p$0 = (CreateUserCustomStatusResponse) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateUserCustomStatusResponse createUserCustomStatusResponse, Continuation<? super Unit> cVar) {
            return ((C45492a) create(createUserCustomStatusResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final CreateUserCustomStatusResponse createUserCustomStatusResponse = this.p$0;
                this.this$0.setState(new Function1<CreateStatusState, CreateStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CreateStatusViewModel.C45492a.C454931 */

                    public final CreateStatusState invoke(CreateStatusState bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                        return CreateStatusState.m180643a(bVar, new Event(createUserCustomStatusResponse), null, null, null, 14, null);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.CreateStatusViewModel$createCustomStatus$2", mo239173f = "CreateStatusViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.c$b */
    public static final class C45494b extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        int label;
        private ErrorResult p$0;
        final /* synthetic */ CreateStatusViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45494b(CreateStatusViewModel cVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45494b bVar = new C45494b(this.this$0, cVar);
            bVar.p$0 = (ErrorResult) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C45494b) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final ErrorResult errorResult = this.p$0;
                this.this$0.setState(new Function1<CreateStatusState, CreateStatusState>() {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.CreateStatusViewModel.C45494b.C454951 */

                    public final CreateStatusState invoke(CreateStatusState bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                        return CreateStatusState.m180643a(bVar, null, new Event(new ErrorEvent.CreateCustomStatus(errorResult)), null, null, 13, null);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void createCustomStatus(String str, String str2, boolean z) {
        CreateUserCustomStatusRequest a = new CreateUserCustomStatusRequest.C16152a().mo57967a(str).mo57969b(str2).mo57966a(Boolean.valueOf(z)).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "createRequest");
        RucketJob.m95402b(RucketJob.m95401a(UserCustomStatusService.C45609a.m180934a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a, (Function1) null, 2, (Object) null), (CoroutineContext) null, new C45492a(this, null), 1, (Object) null), null, new C45494b(this, null), 1, null);
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel
    public void trySave(String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map) {
        if (str != null && bool != null) {
            createCustomStatus(str, str2, bool.booleanValue());
            UserCustomStatusHitPoint.f115066a.mo160408a(bool.booleanValue());
            if (str2 != null) {
                UserCustomStatusHitPoint.f115066a.mo160425f();
            }
        }
    }

    @Override // com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel
    public void tryLeave(String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onModified");
        UserCustomStatusHitPoint.f115066a.mo160422e();
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !(true ^ Intrinsics.areEqual((Object) bool, (Object) true))) {
            function0.invoke();
        } else {
            setState(C45496c.INSTANCE);
        }
    }
}
