package com.larksuite.arch.jack;

import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ak;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.State;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005BV\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016R\u001f\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\b\u0011X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00028\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "S", "Lcom/larksuite/arch/jack/State;", "T", "Lcom/larksuite/arch/jack/JackViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "keyFactory", "Lkotlin/Function0;", "", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argumentsAcceptor", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "cached", "Lcom/larksuite/arch/jack/JackViewModel;", "value", "getValue", "()Lcom/larksuite/arch/jack/JackViewModel;", "isInitialized", "", "toString", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.o */
public class LifecycleAwareLazy<S extends State, T extends JackViewModel<S>> implements Lazy<T> {

    /* renamed from: a */
    private T f59425a;

    /* renamed from: b */
    private final KClass<T> f59426b;

    /* renamed from: c */
    private final Function0<String> f59427c;

    /* renamed from: d */
    private final Function0<ak> f59428d;

    /* renamed from: e */
    private final Function0<C1144ai.AbstractC1146b> f59429e;

    /* renamed from: f */
    private final Function1<S, S> f59430f;

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        if (this.f59425a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return getValue().toString();
        }
        return "Lazy value not initialized yet.";
    }

    /* renamed from: aN_ */
    public T getValue() {
        T t = this.f59425a;
        if (t != null) {
            return t;
        }
        T t2 = (T) ((JackViewModel) new C1144ai(this.f59428d.invoke(), this.f59429e.invoke()).mo6006a(this.f59427c.invoke(), C69113a.m265954a((KClass) this.f59426b)));
        this.f59425a = t2;
        t2.initialize(this.f59430f);
        t2.onPrepared();
        Intrinsics.checkExpressionValueIsNotNull(t2, "ViewModelProvider(store,…     it\n                }");
        return t2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ak> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ai$b> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super S extends com.larksuite.arch.jack.s, ? extends S extends com.larksuite.arch.jack.s> */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareLazy(KClass<T> kClass, Function0<String> function0, Function0<? extends ak> function02, Function0<? extends C1144ai.AbstractC1146b> function03, Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(kClass, "viewModelClass");
        Intrinsics.checkParameterIsNotNull(function0, "keyFactory");
        Intrinsics.checkParameterIsNotNull(function02, "storeProducer");
        Intrinsics.checkParameterIsNotNull(function03, "factoryProducer");
        Intrinsics.checkParameterIsNotNull(function1, "argumentsAcceptor");
        this.f59426b = kClass;
        this.f59427c = function0;
        this.f59428d = function02;
        this.f59429e = function03;
        this.f59430f = function1;
    }
}
