package com.ss.android.lark.moments.impl.broadcast;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011R\u001b\u0010\u0003\u001a\u00020\u00048TX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastEditViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "()V", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "replaceResult", "Landroidx/lifecycle/MutableLiveData;", "", "getReplaceResult", "()Landroidx/lifecycle/MutableLiveData;", "replaceBroadcast", "", "newPostId", "", "broadcastTitle", "endTime", "", "unsetPostId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.broadcast.b */
public final class BroadcastEditViewModel extends BaseViewModel {
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47197a.INSTANCE);
    private final C1177w<Boolean> replaceResult = new C1177w<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public final C1177w<Boolean> getReplaceResult() {
        return this.replaceResult;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.b$a */
    static final class C47197a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47197a INSTANCE = new C47197a();

        C47197a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-broadcast");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…ol(\"lk-moment-broadcast\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.broadcast.BroadcastEditViewModel$replaceBroadcast$1", mo239173f = "BroadcastEditViewModel.kt", mo239174i = {0}, mo239175l = {24}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.b$b */
    static final class C47198b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Broadcast $newBroadcast;
        final /* synthetic */ String $unsetPostId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ BroadcastEditViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47198b(BroadcastEditViewModel bVar, Broadcast broadcast, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$newBroadcast = broadcast;
            this.$unsetPostId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47198b bVar = new C47198b(this.this$0, this.$newBroadcast, this.$unsetPostId, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47198b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                Broadcast broadcast = this.$newBroadcast;
                String str = this.$unsetPostId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = bVar.mo167222a(broadcast, str, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.getReplaceResult().mo5926a(C69089a.m265837a(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public final void replaceBroadcast(String str, String str2, long j, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "newPostId");
        Intrinsics.checkParameterIsNotNull(str2, "broadcastTitle");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47198b(this, new Broadcast.C18326a().mo63431a(str).mo63433b(str2).mo63430a(Long.valueOf(j)).build(), str3, null), 2, null);
    }
}
