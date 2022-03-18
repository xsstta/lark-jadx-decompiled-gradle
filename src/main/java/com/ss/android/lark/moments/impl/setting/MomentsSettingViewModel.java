package com.ss.android.lark.moments.impl.setting;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.UserSetting;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8TX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/setting/MomentsSettingViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "()V", "changeFailedToReturn", "Landroidx/lifecycle/MutableLiveData;", "", "getChangeFailedToReturn", "()Landroidx/lifecycle/MutableLiveData;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "redDotIsMute", "getRedDotIsMute", "getUserSetting", "", "patchRedDotNotification", "isOpened", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.setting.a */
public final class MomentsSettingViewModel extends BaseViewModel {
    private final C1177w<Boolean> changeFailedToReturn = new C1177w<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C48018a.INSTANCE);
    private final C1177w<Boolean> redDotIsMute = new C1177w<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public final C1177w<Boolean> getChangeFailedToReturn() {
        return this.changeFailedToReturn;
    }

    public final C1177w<Boolean> getRedDotIsMute() {
        return this.redDotIsMute;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.setting.a$a */
    static final class C48018a extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C48018a INSTANCE = new C48018a();

        C48018a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-setting");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…Pool(\"lk-moment-setting\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public final void getUserSetting() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C48019b(this, null), 2, null);
    }

    public final void patchRedDotNotification(boolean z) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C48020c(this, z, null), 2, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.setting.MomentsSettingViewModel$getUserSetting$1", mo239173f = "MomentsSettingViewModel.kt", mo239174i = {0}, mo239175l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.setting.a$b */
    public static final class C48019b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsSettingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48019b(MomentsSettingViewModel aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C48019b bVar = new C48019b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C48019b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Boolean bool;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                UserGlobalConfigAndSettingsManager aVar = UserGlobalConfigAndSettingsManager.f120180a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo167301c(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserSetting userSetting = (UserSetting) obj;
            if (userSetting == null || (bool = userSetting.mute_red_dot_notify) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            this.this$0.getRedDotIsMute().mo5926a(C69089a.m265837a(z));
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.setting.MomentsSettingViewModel$patchRedDotNotification$1", mo239173f = "MomentsSettingViewModel.kt", mo239174i = {0, 1, 1, 1}, mo239175l = {35, 40}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "userSetting", "updateField"}, mo239178s = {"L$0", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.moments.impl.setting.a$c */
    public static final class C48020c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isOpened;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsSettingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48020c(MomentsSettingViewModel aVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$isOpened = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C48020c cVar2 = new C48020c(this.this$0, this.$isOpened, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C48020c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 173
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.setting.MomentsSettingViewModel.C48020c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
