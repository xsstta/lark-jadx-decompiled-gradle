package com.ss.android.lark.moments.impl.mainview;

import android.os.Looper;
import android.os.MessageQueue;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency;
import com.ss.android.lark.moments.impl.common.BaseViewModel;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0014J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00078TX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel;", "Lcom/ss/android/lark/moments/impl/common/BaseViewModel;", "()V", "accountChangeListener", "com/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel$accountChangeListener$1", "Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel$accountChangeListener$1;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "needShowTab", "Landroidx/lifecycle/MutableLiveData;", "", "getNeedShowTab", "()Landroidx/lifecycle/MutableLiveData;", "needShowTabEdit", "getNeedShowTabEdit", "positionToPage", "", "getPositionToPage", "showInvalidConfigToast", "getShowInvalidConfigToast", "tabListLiveData", "", "Lcom/bytedance/lark/pb/moments/v1/Tab;", "getTabListLiveData", "getUserGlobalConfigAndSettings", "", "onCleared", "removeTab", "tabId", "", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.e */
public final class MomentsMainFragmentViewModel extends BaseViewModel {
    public static final Companion Companion = new Companion(null);
    private final C47743b accountChangeListener;
    private final Lazy dispatcher$delegate = LazyKt.lazy(C47746c.INSTANCE);
    private final C1177w<Boolean> needShowTab = new C1177w<>();
    private final C1177w<Boolean> needShowTabEdit = new C1177w<>();
    private final C1177w<Integer> positionToPage = new C1177w<>();
    private final C1177w<Boolean> showInvalidConfigToast = new C1177w<>();
    private final C1177w<List<Tab>> tabListLiveData = new C1177w<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.moments.impl.common.BaseViewModel
    public ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel$Companion;", "", "()V", "TAG", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<Boolean> getNeedShowTab() {
        return this.needShowTab;
    }

    public final C1177w<Boolean> getNeedShowTabEdit() {
        return this.needShowTabEdit;
    }

    public final C1177w<Integer> getPositionToPage() {
        return this.positionToPage;
    }

    public final C1177w<Boolean> getShowInvalidConfigToast() {
        return this.showInvalidConfigToast;
    }

    public final C1177w<List<Tab>> getTabListLiveData() {
        return this.tabListLiveData;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/mainview/MomentsMainFragmentViewModel$accountChangeListener$1", "Lcom/ss/android/lark/moments/dependency/idependency/IPassportSdkModuleDependency$IAccountChangeListener;", "onAccountChange", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.e$b */
    public static final class C47743b implements IPassportSdkModuleDependency.IAccountChangeListener {

        /* renamed from: a */
        final /* synthetic */ MomentsMainFragmentViewModel f120299a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.mainview.e$b$a */
        static final class RunnableC47744a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47743b f120300a;

            RunnableC47744a(C47743b bVar) {
                this.f120300a = bVar;
            }

            public final void run() {
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) {
                    /* class com.ss.android.lark.moments.impl.mainview.MomentsMainFragmentViewModel.C47743b.RunnableC47744a.C477451 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC47744a f120301a;

                    {
                        this.f120301a = r1;
                    }

                    public final boolean queueIdle() {
                        this.f120301a.f120300a.f120299a.getTabListLiveData().mo5929b(CollectionsKt.arrayListOf(new Tab(String.valueOf(Tab.FeedTabId.FEED_RECOMMEND.getValue()), UIHelper.getString(R.string.Lark_Moments_Homepage), null, false)));
                        this.f120301a.f120300a.f120299a.getNeedShowTab().mo5929b((Boolean) false);
                        this.f120301a.f120300a.f120299a.getNeedShowTabEdit().mo5929b((Boolean) false);
                        this.f120301a.f120300a.f120299a.getUserGlobalConfigAndSettings();
                        return false;
                    }
                });
            }
        }

        @Override // com.ss.android.lark.moments.dependency.idependency.IPassportSdkModuleDependency.IAccountChangeListener
        /* renamed from: a */
        public void mo165898a() {
            UICallbackExecutor.execute(new RunnableC47744a(this));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47743b(MomentsMainFragmentViewModel eVar) {
            this.f120299a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.e$c */
    static final class C47746c extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C47746c INSTANCE = new C47746c();

        C47746c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("lk-moment-main");
            Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…eadPool(\"lk-moment-main\")");
            return bl.m266382a(newSerialIODensityThreadPool);
        }
    }

    public final void getUserGlobalConfigAndSettings() {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), getDispatcher(), null, new C47747d(this, null), 2, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.moments.impl.common.BaseViewModel
    public void onCleared() {
        MomentsDependencyHolder.f118998b.mo165899a().passportSdkDependency().mo144725b(this.accountChangeListener);
        super.onCleared();
    }

    public MomentsMainFragmentViewModel() {
        C47743b bVar = new C47743b(this);
        this.accountChangeListener = bVar;
        MomentsDependencyHolder.f118998b.mo165899a().passportSdkDependency().mo144724a(bVar);
        MomentsDependencyHolder.f118998b.mo165899a().chatModuleDependency().mo144707d();
    }

    public final void removeTab(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tabId");
        List<Tab> b = this.tabListLiveData.mo5927b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "tabListLiveData.value ?: return");
            ArrayList arrayList = new ArrayList();
            for (T t : b) {
                if (!Intrinsics.areEqual(t.id, str)) {
                    arrayList.add(t);
                }
            }
            this.tabListLiveData.mo5929b(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.mainview.MomentsMainFragmentViewModel$getUserGlobalConfigAndSettings$1", mo239173f = "MomentsMainFragmentViewModel.kt", mo239174i = {0, 1}, mo239175l = {59, 60}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.e$d */
    public static final class C47747d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsMainFragmentViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47747d(MomentsMainFragmentViewModel eVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47747d dVar = new C47747d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47747d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 354
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.mainview.MomentsMainFragmentViewModel.C47747d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
