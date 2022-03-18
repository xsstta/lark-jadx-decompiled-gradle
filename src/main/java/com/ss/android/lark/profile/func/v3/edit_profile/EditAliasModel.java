package com.ss.android.lark.profile.func.v3.edit_profile;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.impl.serverimpl.annotation.ServerCall;
import com.larksuite.rucket.job.RucketJob;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.users.PatchUserMemoRequest;
import com.ss.android.lark.pb.users.PatchUserMemoResponse;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasModel;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasModel$ISdkService;", "()V", "saveAlias", "", "userId", "", "aliasName", "aliasDescription", "aliasImageKey", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "ISdkService", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.b */
public final class EditAliasModel {

    /* renamed from: a */
    public static final EditAliasModel f130352a = new EditAliasModel();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasModel$ISdkService;", "", "saveAlias", "Lcom/larksuite/rucket/job/RucketJob;", "Lcom/ss/android/lark/pb/users/PatchUserMemoResponse;", "request", "Lcom/ss/android/lark/pb/users/PatchUserMemoRequest;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.b$a */
    public interface ISdkService {
        @ServerCall(Command.PATCH_USER_MEMO)
        /* renamed from: a */
        RucketJob<PatchUserMemoResponse> mo179948a(PatchUserMemoRequest patchUserMemoRequest);
    }

    private EditAliasModel() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/users/PatchUserMemoResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.edit_profile.EditAliasModel$saveAlias$1", mo239173f = "EditAliasModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.b$b */
    static final class C52657b extends SuspendLambda implements Function2<PatchUserMemoResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private PatchUserMemoResponse p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52657b(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52657b bVar = new C52657b(this.$callback, cVar);
            bVar.p$0 = (PatchUserMemoResponse) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PatchUserMemoResponse patchUserMemoResponse, Continuation<? super Unit> cVar) {
            return ((C52657b) create(patchUserMemoResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onSuccess(null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.profile.func.v3.edit_profile.EditAliasModel$saveAlias$2", mo239173f = "EditAliasModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.b$c */
    static final class C52658c extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ IGetDataCallback $callback;
        int label;
        private ErrorResult p$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52658c(IGetDataCallback iGetDataCallback, Continuation cVar) {
            super(2, cVar);
            this.$callback = iGetDataCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C52658c cVar2 = new C52658c(this.$callback, cVar);
            cVar2.p$0 = (ErrorResult) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C52658c) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                this.$callback.onError(this.p$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final void mo179947a(String str, String str2, String str3, String str4, IGetDataCallback<Unit> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "aliasName");
        Intrinsics.checkParameterIsNotNull(str3, "aliasDescription");
        Intrinsics.checkParameterIsNotNull(str4, "aliasImageKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        PatchUserMemoRequest a = new PatchUserMemoRequest.C50264a().mo174398a(str).mo174400b(str2).mo174401c(str3).mo174402d(str4).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "request");
        RucketJob.m95402b(RucketJob.m95401a(((ISdkService) Rucket.m95345a(ISdkService.class)).mo179948a(a), (CoroutineContext) null, new C52657b(iGetDataCallback, null), 1, (Object) null), null, new C52658c(iGetDataCallback, null), 1, null);
    }
}
