package androidx.navigation;

import androidx.lifecycle.C1144ai;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class NavGraphViewModelLazyKt$navGraphViewModels$1 extends Lambda implements Function0<C1144ai.AbstractC1146b> {
    final /* synthetic */ Lazy $backStackEntry;
    final /* synthetic */ KProperty $backStackEntry$metadata;
    final /* synthetic */ Function0 $factoryProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$1(Function0 function0, Lazy lazy, KProperty kProperty) {
        super(0);
        this.$factoryProducer = function0;
        this.$backStackEntry = lazy;
        this.$backStackEntry$metadata = kProperty;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1144ai.AbstractC1146b invoke() {
        C1144ai.AbstractC1146b bVar;
        Function0 function0 = this.$factoryProducer;
        if (function0 != null && (bVar = (C1144ai.AbstractC1146b) function0.invoke()) != null) {
            return bVar;
        }
        C1250f fVar = (C1250f) this.$backStackEntry.getValue();
        Intrinsics.checkExpressionValueIsNotNull(fVar, "backStackEntry");
        C1144ai.AbstractC1146b defaultViewModelProviderFactory = fVar.getDefaultViewModelProviderFactory();
        Intrinsics.checkExpressionValueIsNotNull(defaultViewModelProviderFactory, "backStackEntry.defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}
