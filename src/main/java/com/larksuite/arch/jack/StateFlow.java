package com.larksuite.arch.jack;

import androidx.lifecycle.AbstractC1178x;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0016B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fJ\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\bJ\u001a\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\fR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/larksuite/arch/jack/StateFlow;", "S", "R", "Landroidx/lifecycle/Observer;", "observable", "Lcom/larksuite/arch/jack/StateObservable;", "(Lcom/larksuite/arch/jack/StateObservable;)V", "distinctUntilChanged", "", "lastValue", "Ljava/lang/Object;", "mapper", "Lkotlin/Function1;", "realSubscriber", "", "skipInit", "map", "onChanged", "newValue", "(Ljava/lang/Object;)V", "subscriber", "Lcom/larksuite/arch/jack/Disposable;", "Companion", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.t */
public final class StateFlow<S, R> implements AbstractC1178x<S> {

    /* renamed from: b */
    public static final Companion f59431b = new Companion(null);

    /* renamed from: a */
    public final StateObservable<S> f59432a;

    /* renamed from: c */
    private Function1<? super S, ? extends R> f59433c;

    /* renamed from: d */
    private Function1<? super S, Unit> f59434d;

    /* renamed from: e */
    private S f59435e;

    /* renamed from: f */
    private boolean f59436f;

    /* renamed from: g */
    private boolean f59437g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b¨\u0006\t"}, d2 = {"Lcom/larksuite/arch/jack/StateFlow$Companion;", "", "()V", "create", "Lcom/larksuite/arch/jack/StateFlow;", "S", "R", "observable", "Lcom/larksuite/arch/jack/StateObservable;", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.t$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <S, R> StateFlow<S, R> mo86262a(StateObservable<S> uVar) {
            Intrinsics.checkParameterIsNotNull(uVar, "observable");
            return new StateFlow<>(uVar, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"com/larksuite/arch/jack/StateFlow$subscriber$1", "Lcom/larksuite/arch/jack/Disposable;", "disposed", "", "isDisposed", "()Z", "dispose", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.t$b */
    public static final class C24041b implements Disposable {

        /* renamed from: a */
        final /* synthetic */ StateFlow f59438a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C24041b(StateFlow tVar) {
            this.f59438a = tVar;
        }
    }

    private StateFlow(StateObservable<S> uVar) {
        this.f59432a = uVar;
    }

    /* renamed from: a */
    public final StateFlow<S, R> mo86259a(boolean z) {
        StateFlow<S, R> tVar = this;
        tVar.f59436f = z;
        return tVar;
    }

    /* renamed from: b */
    public final StateFlow<S, R> mo86261b(boolean z) {
        StateFlow<S, R> tVar = this;
        tVar.f59437g = z;
        return tVar;
    }

    /* renamed from: a */
    public final StateFlow<S, R> mo86258a(Function1<? super S, ? extends R> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "mapper");
        StateFlow<S, R> tVar = this;
        tVar.f59433c = function1;
        return tVar;
    }

    /* renamed from: b */
    public final Disposable mo86260b(Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        this.f59434d = function1;
        this.f59432a.mo86249a(this);
        return new C24041b(this);
    }

    @Override // androidx.lifecycle.AbstractC1178x
    public void onChanged(S s) {
        Object obj;
        if (this.f59436f) {
            S s2 = this.f59435e;
            if (s2 != null) {
                Function1<? super S, ? extends R> function1 = this.f59433c;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapper");
                }
                obj = function1.invoke(s2);
            } else {
                obj = null;
            }
            Function1<? super S, ? extends R> function12 = this.f59433c;
            if (function12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapper");
            }
            if (Objects.equals(obj, function12.invoke(s))) {
                return;
            }
        }
        this.f59435e = s;
        Function1<? super S, Unit> function13 = this.f59434d;
        if (function13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realSubscriber");
        }
        function13.invoke(s);
    }

    public /* synthetic */ StateFlow(StateObservable uVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar);
    }
}
