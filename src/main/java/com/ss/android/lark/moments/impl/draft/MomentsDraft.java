package com.ss.android.lark.moments.impl.draft;

import com.bytedance.lark.pb.moments.v1.SetKeyValueRequest;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency;
import com.ss.android.lark.moments.impl.rustadapter.service.MomentsSDKService;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/draft/MomentsDraft;", "", "()V", "accountChangeListener", "com/ss/android/lark/moments/impl/draft/MomentsDraft$accountChangeListener$1", "Lcom/ss/android/lark/moments/impl/draft/MomentsDraft$accountChangeListener$1;", "memoryDraft", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getKeyValue", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setKeyValue", "", "value", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.c.a */
public final class MomentsDraft {

    /* renamed from: a */
    public static final MomentsDraft f119064a = new MomentsDraft();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, String> f119065b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final C47205a f119066c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/draft/MomentsDraft$accountChangeListener$1", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency$IAccountChangeListener;", "onAccountChange", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.c.a$a */
    public static final class C47205a implements IPassportSdkModuleDependency.IAccountChangeListener {
        C47205a() {
        }

        @Override // com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency.IAccountChangeListener
        /* renamed from: a */
        public void mo165898a() {
            MomentsDraft aVar = MomentsDraft.f119064a;
            MomentsDraft.f119065b.clear();
        }
    }

    private MomentsDraft() {
    }

    static {
        C47205a aVar = new C47205a();
        f119066c = aVar;
        MomentsDependencyHolder.f118998b.mo165899a().passportSdkDependency().mo144724a(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.draft.MomentsDraft$setKeyValue$2", mo239173f = "MomentsDraft.kt", mo239174i = {0}, mo239175l = {TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE}, mo239176m = "invokeSuspend", mo239177n = {"$this$coroutineScope"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.c.a$b */
    static final class C47206b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        Object L$0;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47206b(String str, String str2, Continuation cVar) {
            super(2, cVar);
            this.$key = str;
            this.$value = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47206b bVar = new C47206b(this.$key, this.$value, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47206b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsSDKService bVar = MomentsSDKService.f120147a;
                SetKeyValueRequest.KeyType keyType = SetKeyValueRequest.KeyType.DRAFT;
                String str = this.$key;
                String str2 = this.$value;
                this.L$0 = ahVar;
                this.label = 1;
                if (bVar.mo167223a(keyType, str, str2, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final Object mo165960a(String str, Continuation<? super String> cVar) {
        ConcurrentHashMap<String, String> concurrentHashMap = f119065b;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        return MomentsSDKService.f120147a.mo167252f(str, cVar);
    }

    /* renamed from: a */
    public final Object mo165959a(String str, String str2, Continuation<? super Unit> cVar) {
        boolean z;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f119065b.remove(str);
        } else {
            f119065b.put(str, str2);
        }
        Object a = C69364ai.m266264a(new C47206b(str, str2, null), cVar);
        if (a == C69086a.m265828a()) {
            return a;
        }
        return Unit.INSTANCE;
    }
}
