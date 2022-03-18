package com.larksuite.arch.jack;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\f\b\u0000\u0010\u0007*\u00020\b*\u00020\t\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\u0006\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\b¢\u0006\u0002\u0010\u0012\u001a¥\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00060\u0014\"\f\b\u0000\u0010\u0007*\u00020\u0015*\u00020\t\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0002\u0010\u000b*\u00020\f*\u0002H\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u000e\b\n\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0019\b\n\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b0\u0017¢\u0006\u0002\b\u00182\u0010\b\n\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u000e\b\n\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010H\b¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001d"}, d2 = {"assertionFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getAssertionFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "activityViewModel", "Lkotlin/Lazy;", "VM", "T", "Landroidx/fragment/app/Fragment;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/larksuite/arch/jack/JackViewModel;", "S", "Lcom/larksuite/arch/jack/State;", "viewModelClass", "Lkotlin/reflect/KClass;", "keyFactory", "Lkotlin/Function0;", "", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "viewModel", "Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "Landroidx/lifecycle/ViewModelStoreOwner;", "argumentsAcceptor", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "factoryProducer", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/larksuite/arch/jack/LifecycleAwareLazy;", "jack_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.f */
public final class C24022f {

    /* renamed from: a */
    private static final C1144ai.AbstractC1146b f59414a = new C24023a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/larksuite/arch/jack/ExtensionsKt$assertionFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.arch.jack.f$a */
    public static final class C24023a implements C1144ai.AbstractC1146b {
        C24023a() {
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "modelClass");
            throw new ViewModelNotCreatedException(cls.getSimpleName() + " should be created in the host before being used.");
        }
    }

    /* renamed from: a */
    public static final C1144ai.AbstractC1146b m87798a() {
        return f59414a;
    }
}
