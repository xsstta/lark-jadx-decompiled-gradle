package com.larksuite.arch.jack;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.arch.jack.State;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0001\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0001\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00180\u00172\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u00180\u001b0\u001a2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00028\u0000H$¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004J\u001f\u0010'\u001a\u00020\u001f2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\u001fH\u0015J\b\u0010+\u001a\u00020\u001fH\u0016JY\u0010,\u001a\u00020\u0012\"\u0004\b\u0001\u0010-2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H-0\u00172\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H-0\u001b0\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0002\b/Jy\u0010,\u001a\u00020\u0012\"\u0004\b\u0001\u0010-\"\u0004\b\u0002\u001002\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H-0\u00172\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00172\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H0020\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0002\b/J\u0001\u0010,\u001a\u00020\u0012\"\u0004\b\u0001\u0010-\"\u0004\b\u0002\u00100\"\u0004\b\u0003\u001032\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H-0\u00172\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00172\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30\u00172 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u0002H3050\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0002\b/J¹\u0001\u0010,\u001a\u00020\u0012\"\u0004\b\u0001\u0010-\"\u0004\b\u0002\u00100\"\u0004\b\u0003\u00103\"\u0004\b\u0004\u001062\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H-0\u00172\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00172\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30\u00172\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H60\u00172&\b\u0002\u0010\u0019\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H6080\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0002\b/JÙ\u0001\u0010,\u001a\u00020\u0012\"\u0004\b\u0001\u0010-\"\u0004\b\u0002\u00100\"\u0004\b\u0003\u00103\"\u0004\b\u0004\u00106\"\u0004\b\u0005\u001092\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H-0\u00172\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H00\u00172\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H30\u00172\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H60\u00172\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H90\u00172,\b\u0002\u0010\u0019\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H6\u0012\u0004\u0012\u0002H90;0\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0002\b/JL\u0010<\u001a\u00020\u0012\"\u0004\b\u0001\u0010=2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H=0\u001a2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001d2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002J!\u0010?\u001a\u00020\u001f2\u0017\u0010@\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0002\b)H\u0004J9\u0010A\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0002\bBJ\u001a\u0010C\u001a\u00020\u001f2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001dJ\f\u0010&\u001a\u00020\u0012*\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006E"}, d2 = {"Lcom/larksuite/arch/jack/JackViewModel;", "S", "Lcom/larksuite/arch/jack/State;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lcom/larksuite/arch/jack/CompositeDisposable;", "initialState", "Lcom/larksuite/arch/jack/State;", "liveDataState", "Landroidx/lifecycle/MutableLiveData;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "asyncSubscribeInternal", "Lcom/larksuite/arch/jack/Disposable;", "T", "owner", "Landroidx/lifecycle/LifecycleOwner;", "prop1", "Lkotlin/reflect/KProperty1;", "Lcom/larksuite/arch/jack/Async;", "config", "Lcom/larksuite/arch/jack/SubscriptionConfig;", "Lcom/larksuite/arch/jack/Tuple1;", "onError", "Lkotlin/Function1;", "", "", "onLoading", "Lkotlin/Function0;", "onSuccess", "asyncSubscribeInternal$jack_release", "defaultState", "()Lcom/larksuite/arch/jack/State;", "disposeOnClear", "initialize", "argsAcceptor", "Lkotlin/ExtensionFunctionType;", "onCleared", "onPrepared", "selectSubscribeInternal", "A", "subscriber", "selectSubscribeInternal$jack_release", "B", "prop2", "Lcom/larksuite/arch/jack/Tuple2;", "C", "prop3", "Lcom/larksuite/arch/jack/Tuple3;", "D", "prop4", "Lcom/larksuite/arch/jack/Tuple4;", "E", "prop5", "Lcom/larksuite/arch/jack/Tuple5;", "selectSubscribeMapped", "R", "mapper", "setState", "reducer", "subscribeInternal", "subscribeInternal$jack_release", "withState", "block", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.l */
public abstract class JackViewModel<S extends State> extends AbstractC1142af {
    private final CompositeDisposable disposables = new CompositeDisposable();
    private S initialState;
    public C1177w<S> liveDataState;
    private final Lazy mainHandler$delegate = LazyKt.lazy(C24030c.INSTANCE);

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "S", "Lcom/larksuite/arch/jack/State;", "s", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/State;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$k */
    public static final class C24038k extends Lambda implements Function1<S, S> {
        public static final C24038k INSTANCE = new C24038k();

        C24038k() {
            super(1);
        }

        public final S invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "s");
            return s;
        }
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract S defaultState();

    /* access modifiers changed from: protected */
    public final JackViewModel<S> disposeOnClear() {
        return this;
    }

    public void onPrepared() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "S", "Lcom/larksuite/arch/jack/State;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$c */
    static final class C24030c extends Lambda implements Function0<Handler> {
        public static final C24030c INSTANCE = new C24030c();

        C24030c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        this.disposables.mo86213a();
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "S", "Lcom/larksuite/arch/jack/State;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$l */
    static final class RunnableC24039l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JackViewModel f59423a;

        /* renamed from: b */
        final /* synthetic */ Function1 f59424b;

        RunnableC24039l(JackViewModel lVar, Function1 function1) {
            this.f59423a = lVar;
            this.f59424b = function1;
        }

        public final void run() {
            Function1 function1 = this.f59424b;
            Object b = JackViewModel.access$getLiveDataState$p(this.f59423a).mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "liveDataState.value!!");
            function1.invoke(b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "S", "Lcom/larksuite/arch/jack/State;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$j */
    static final class RunnableC24037j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JackViewModel f59421a;

        /* renamed from: b */
        final /* synthetic */ Function1 f59422b;

        RunnableC24037j(JackViewModel lVar, Function1 function1) {
            this.f59421a = lVar;
            this.f59422b = function1;
        }

        public final void run() {
            C1177w access$getLiveDataState$p = JackViewModel.access$getLiveDataState$p(this.f59421a);
            Function1 function1 = this.f59422b;
            Object b = JackViewModel.access$getLiveDataState$p(this.f59421a).mo5927b();
            if (b == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(b, "liveDataState.value!!");
            access$getLiveDataState$p.mo5929b(function1.invoke(b));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$b */
    public static final class C24029b extends Lambda implements Function1<S, Unit> {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function0 $onLoading;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ KProperty1 $prop1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24029b(KProperty1 eVar, Function0 function0, Function1 function1, Function1 function12) {
            super(1);
            this.$prop1 = eVar;
            this.$onLoading = function0;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.arch.jack.l$b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((State) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            Async aVar = (Async) this.$prop1.get(s);
            if (aVar instanceof Loading) {
                Function0 function0 = this.$onLoading;
                if (function0 != null) {
                    Unit unit = (Unit) function0.invoke();
                }
            } else if (aVar instanceof Fail) {
                Function1 function1 = this.$onError;
                if (function1 != null) {
                    Unit unit2 = (Unit) function1.invoke(((Fail) aVar).mo86216b());
                }
            } else if (aVar instanceof Success) {
                Function1 function12 = this.$onSuccess;
                if (function12 != null) {
                    Unit unit3 = (Unit) function12.invoke(((Success) aVar).mo86206a());
                }
            } else {
                JackArchPlugins.f59416a.mo86227a().mo86228a("ISubscriber", "obsever uninit state");
            }
        }
    }

    private final Disposable disposeOnClear(Disposable cVar) {
        this.disposables.mo86214a(cVar);
        return cVar;
    }

    public static final /* synthetic */ C1177w access$getLiveDataState$p(JackViewModel lVar) {
        C1177w<S> wVar = lVar.liveDataState;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveDataState");
        }
        return wVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/Tuple1;", "Lcom/larksuite/arch/jack/Async;", "T", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/Tuple1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$a */
    public static final class C24028a extends Lambda implements Function1<S, Tuple1<Async<? extends T>>> {
        final /* synthetic */ KProperty1 $prop1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24028a(KProperty1 eVar) {
            super(1);
            this.$prop1 = eVar;
        }

        /* JADX WARN: Unknown type variable: T in type: com.larksuite.arch.jack.x<com.larksuite.arch.jack.a<T>> */
        public final Tuple1<Async<T>> invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            return new Tuple1<>(this.$prop1.get(s));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/Tuple1;", "A", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/Tuple1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$d */
    public static final class C24031d extends Lambda implements Function1<S, Tuple1<A>> {
        final /* synthetic */ KProperty1 $prop1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24031d(KProperty1 eVar) {
            super(1);
            this.$prop1 = eVar;
        }

        /* JADX WARN: Unknown type variable: A in type: com.larksuite.arch.jack.x<A> */
        public final Tuple1<A> invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            return new Tuple1<>(this.$prop1.get(s));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/Tuple2;", "A", "B", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/Tuple2;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$e */
    public static final class C24032e extends Lambda implements Function1<S, Tuple2<A, B>> {
        final /* synthetic */ KProperty1 $prop1;
        final /* synthetic */ KProperty1 $prop2;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24032e(KProperty1 eVar, KProperty1 eVar2) {
            super(1);
            this.$prop1 = eVar;
            this.$prop2 = eVar2;
        }

        /* JADX WARN: Unknown type variable: A in type: com.larksuite.arch.jack.y<A, B> */
        /* JADX WARN: Unknown type variable: B in type: com.larksuite.arch.jack.y<A, B> */
        public final Tuple2<A, B> invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            return new Tuple2<>(this.$prop1.get(s), this.$prop2.get(s));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\b\b\u0003\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/Tuple3;", "A", "B", "C", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/Tuple3;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$f */
    public static final class C24033f extends Lambda implements Function1<S, Tuple3<A, B, C>> {
        final /* synthetic */ KProperty1 $prop1;
        final /* synthetic */ KProperty1 $prop2;
        final /* synthetic */ KProperty1 $prop3;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24033f(KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3) {
            super(1);
            this.$prop1 = eVar;
            this.$prop2 = eVar2;
            this.$prop3 = eVar3;
        }

        /* JADX WARN: Unknown type variable: A in type: com.larksuite.arch.jack.z<A, B, C> */
        /* JADX WARN: Unknown type variable: B in type: com.larksuite.arch.jack.z<A, B, C> */
        /* JADX WARN: Unknown type variable: C in type: com.larksuite.arch.jack.z<A, B, C> */
        public final Tuple3<A, B, C> invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            return new Tuple3<>(this.$prop1.get(s), this.$prop2.get(s), this.$prop3.get(s));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/larksuite/arch/jack/JackViewModel$selectSubscribeMapped$1", "Lcom/larksuite/arch/jack/StateObservable;", "onSubscribe", "", "observer", "Landroidx/lifecycle/Observer;", "onUnSubscribe", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$i */
    public static final class C24036i implements StateObservable<S> {

        /* renamed from: a */
        final /* synthetic */ JackViewModel f59419a;

        /* renamed from: b */
        final /* synthetic */ LifecycleOwner f59420b;

        @Override // com.larksuite.arch.jack.StateObservable
        /* renamed from: a */
        public void mo86249a(AbstractC1178x<S> xVar) {
            Intrinsics.checkParameterIsNotNull(xVar, "observer");
            JackViewModel.access$getLiveDataState$p(this.f59419a).mo5923a(this.f59420b, xVar);
        }

        C24036i(JackViewModel lVar, LifecycleOwner lifecycleOwner) {
            this.f59419a = lVar;
            this.f59420b = lifecycleOwner;
        }
    }

    public final void initialize(Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "argsAcceptor");
        if (this.initialState == null) {
            S s = (S) ((State) function1.invoke(defaultState()));
            this.liveDataState = new C1177w<>(s);
            this.initialState = s;
        }
    }

    public final void setState(Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "reducer");
        getMainHandler().post(new RunnableC24037j(this, function1));
    }

    public final void withState(Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        getMainHandler().post(new RunnableC24039l(this, function1));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\b\b\u0004\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/Tuple4;", "A", "B", "C", "D", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/Tuple4;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$g */
    public static final class C24034g extends Lambda implements Function1<S, Tuple4<A, B, C, D>> {
        final /* synthetic */ KProperty1 $prop1;
        final /* synthetic */ KProperty1 $prop2;
        final /* synthetic */ KProperty1 $prop3;
        final /* synthetic */ KProperty1 $prop4;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24034g(KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, KProperty1 eVar4) {
            super(1);
            this.$prop1 = eVar;
            this.$prop2 = eVar2;
            this.$prop3 = eVar3;
            this.$prop4 = eVar4;
        }

        /* JADX WARN: Unknown type variable: A in type: com.larksuite.arch.jack.aa<A, B, C, D> */
        /* JADX WARN: Unknown type variable: B in type: com.larksuite.arch.jack.aa<A, B, C, D> */
        /* JADX WARN: Unknown type variable: C in type: com.larksuite.arch.jack.aa<A, B, C, D> */
        /* JADX WARN: Unknown type variable: D in type: com.larksuite.arch.jack.aa<A, B, C, D> */
        public final Tuple4<A, B, C, D> invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            return new Tuple4<>(this.$prop1.get(s), this.$prop2.get(s), this.$prop3.get(s), this.$prop4.get(s));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a \u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\b\b\u0005\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "Lcom/larksuite/arch/jack/Tuple5;", "A", "B", "C", "D", "E", "S", "Lcom/larksuite/arch/jack/State;", "it", "invoke", "(Lcom/larksuite/arch/jack/State;)Lcom/larksuite/arch/jack/Tuple5;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.l$h */
    public static final class C24035h extends Lambda implements Function1<S, Tuple5<A, B, C, D, E>> {
        final /* synthetic */ KProperty1 $prop1;
        final /* synthetic */ KProperty1 $prop2;
        final /* synthetic */ KProperty1 $prop3;
        final /* synthetic */ KProperty1 $prop4;
        final /* synthetic */ KProperty1 $prop5;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24035h(KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, KProperty1 eVar4, KProperty1 eVar5) {
            super(1);
            this.$prop1 = eVar;
            this.$prop2 = eVar2;
            this.$prop3 = eVar3;
            this.$prop4 = eVar4;
            this.$prop5 = eVar5;
        }

        /* JADX WARN: Unknown type variable: A in type: com.larksuite.arch.jack.ab<A, B, C, D, E> */
        /* JADX WARN: Unknown type variable: B in type: com.larksuite.arch.jack.ab<A, B, C, D, E> */
        /* JADX WARN: Unknown type variable: C in type: com.larksuite.arch.jack.ab<A, B, C, D, E> */
        /* JADX WARN: Unknown type variable: D in type: com.larksuite.arch.jack.ab<A, B, C, D, E> */
        /* JADX WARN: Unknown type variable: E in type: com.larksuite.arch.jack.ab<A, B, C, D, E> */
        public final Tuple5<A, B, C, D, E> invoke(S s) {
            Intrinsics.checkParameterIsNotNull(s, "it");
            return new Tuple5<>(this.$prop1.get(s), this.$prop2.get(s), this.$prop3.get(s), this.$prop4.get(s), this.$prop5.get(s));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.larksuite.arch.jack.v<S extends com.larksuite.arch.jack.s> */
    /* JADX WARN: Multi-variable type inference failed */
    public final Disposable subscribeInternal$jack_release(LifecycleOwner lifecycleOwner, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return selectSubscribeMapped(lifecycleOwner, vVar, C24038k.INSTANCE, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.larksuite.arch.jack.v<com.larksuite.arch.jack.x<A>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <A> Disposable selectSubscribeInternal$jack_release(LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return selectSubscribeMapped(lifecycleOwner, vVar, new C24031d(eVar), function1);
    }

    private final <R> Disposable selectSubscribeMapped(LifecycleOwner lifecycleOwner, SubscriptionConfig<R> vVar, Function1<? super S, ? extends R> function1, Function1<? super S, Unit> function12) {
        return disposeOnClear(StateFlow.f59431b.mo86262a(new C24036i(this, lifecycleOwner)).mo86258a(function1).mo86261b(vVar.mo86264b()).mo86259a(vVar.mo86263a()).mo86260b(function12));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.larksuite.arch.jack.v<com.larksuite.arch.jack.y<A, B>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <A, B> Disposable selectSubscribeInternal$jack_release(LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return selectSubscribeMapped(lifecycleOwner, vVar, new C24032e(eVar, eVar2), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.arch.jack.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable subscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                vVar = new SubscriptionConfig();
            }
            return lVar.subscribeInternal$jack_release(lifecycleOwner, vVar, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeInternal");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.larksuite.arch.jack.v<com.larksuite.arch.jack.x<com.larksuite.arch.jack.a<T>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Disposable asyncSubscribeInternal$jack_release(LifecycleOwner lifecycleOwner, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return selectSubscribeMapped(lifecycleOwner, vVar, new C24028a(eVar), new C24029b(eVar, function0, function1, function12));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.larksuite.arch.jack.v<com.larksuite.arch.jack.z<A, B, C>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <A, B, C> Disposable selectSubscribeInternal$jack_release(LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return selectSubscribeMapped(lifecycleOwner, vVar, new C24033f(eVar, eVar2, eVar3), function1);
    }

    public static /* synthetic */ Disposable selectSubscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, KProperty1 eVar, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                vVar = C24040n.m87838a();
            }
            return lVar.selectSubscribeInternal$jack_release(lifecycleOwner, eVar, vVar, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribeInternal");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.larksuite.arch.jack.v<com.larksuite.arch.jack.aa<A, B, C, D>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <A, B, C, D> Disposable selectSubscribeInternal$jack_release(LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return selectSubscribeMapped(lifecycleOwner, vVar, new C24034g(eVar, eVar2, eVar3, eVar4), function1);
    }

    public static /* synthetic */ Disposable selectSubscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, KProperty1 eVar, KProperty1 eVar2, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                vVar = C24040n.m87838a();
            }
            return lVar.selectSubscribeInternal$jack_release(lifecycleOwner, eVar, eVar2, vVar, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribeInternal");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.larksuite.arch.jack.v<com.larksuite.arch.jack.ab<A, B, C, D, E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <A, B, C, D, E> Disposable selectSubscribeInternal$jack_release(LifecycleOwner lifecycleOwner, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, KProperty1<S, ? extends E> eVar5, SubscriptionConfig<Tuple5<A, B, C, D, E>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(eVar5, "prop5");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return selectSubscribeMapped(lifecycleOwner, vVar, new C24035h(eVar, eVar2, eVar3, eVar4, eVar5), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.larksuite.arch.jack.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Disposable asyncSubscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, KProperty1 eVar, SubscriptionConfig vVar, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                vVar = C24040n.m87838a();
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            if ((i & 16) != 0) {
                function0 = null;
            }
            if ((i & 32) != 0) {
                function12 = null;
            }
            return lVar.asyncSubscribeInternal$jack_release(lifecycleOwner, eVar, vVar, function1, function0, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribeInternal");
    }

    public static /* synthetic */ Disposable selectSubscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                vVar = C24040n.m87838a();
            }
            return lVar.selectSubscribeInternal$jack_release(lifecycleOwner, eVar, eVar2, eVar3, vVar, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribeInternal");
    }

    public static /* synthetic */ Disposable selectSubscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, KProperty1 eVar4, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
        SubscriptionConfig vVar2;
        if (obj == null) {
            if ((i & 32) != 0) {
                vVar2 = C24040n.m87838a();
            } else {
                vVar2 = vVar;
            }
            return lVar.selectSubscribeInternal$jack_release(lifecycleOwner, eVar, eVar2, eVar3, eVar4, vVar2, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribeInternal");
    }

    public static /* synthetic */ Disposable selectSubscribeInternal$jack_release$default(JackViewModel lVar, LifecycleOwner lifecycleOwner, KProperty1 eVar, KProperty1 eVar2, KProperty1 eVar3, KProperty1 eVar4, KProperty1 eVar5, SubscriptionConfig vVar, Function1 function1, int i, Object obj) {
        SubscriptionConfig vVar2;
        if (obj == null) {
            if ((i & 64) != 0) {
                vVar2 = C24040n.m87838a();
            } else {
                vVar2 = vVar;
            }
            return lVar.selectSubscribeInternal$jack_release(lifecycleOwner, eVar, eVar2, eVar3, eVar4, eVar5, vVar2, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribeInternal");
    }
}
