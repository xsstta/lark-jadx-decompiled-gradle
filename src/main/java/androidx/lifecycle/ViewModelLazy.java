package androidx.lifecycle;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel-ktx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: androidx.lifecycle.ah */
public final class ViewModelLazy<VM extends AbstractC1142af> implements Lazy<VM> {

    /* renamed from: a */
    private VM f4256a;

    /* renamed from: b */
    private final KClass<VM> f4257b;

    /* renamed from: c */
    private final Function0<ak> f4258c;

    /* renamed from: d */
    private final Function0<C1144ai.AbstractC1146b> f4259d;

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        if (this.f4256a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f4256a;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new C1144ai(this.f4258c.invoke(), this.f4259d.invoke()).mo6005a(C69113a.m265954a((KClass) this.f4257b));
        this.f4256a = vm2;
        Intrinsics.checkExpressionValueIsNotNull(vm2, "ViewModelProvider(store,…ed = it\n                }");
        return vm2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ak> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ai$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(KClass<VM> kClass, Function0<? extends ak> function0, Function0<? extends C1144ai.AbstractC1146b> function02) {
        Intrinsics.checkParameterIsNotNull(kClass, "viewModelClass");
        Intrinsics.checkParameterIsNotNull(function0, "storeProducer");
        Intrinsics.checkParameterIsNotNull(function02, "factoryProducer");
        this.f4257b = kClass;
        this.f4258c = function0;
        this.f4259d = function02;
    }
}
