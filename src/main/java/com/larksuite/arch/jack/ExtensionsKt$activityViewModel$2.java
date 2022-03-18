package com.larksuite.arch.jack;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.aj;
import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "VM", "T", "Landroidx/fragment/app/Fragment;", "Lcom/larksuite/arch/jack/JackView;", "Lcom/larksuite/arch/jack/JackViewModel;", "S", "Lcom/larksuite/arch/jack/State;", "invoke", "()Lcom/larksuite/arch/jack/JackViewModel;"}, mo238835k = 3, mv = {1, 1, 16})
public final class ExtensionsKt$activityViewModel$2 extends Lambda implements Function0<VM> {
    final /* synthetic */ Function0 $keyFactory;
    final /* synthetic */ Fragment $this_activityViewModel;
    final /* synthetic */ KClass $viewModelClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionsKt$activityViewModel$2(Fragment fragment, Function0 function0, KClass kClass) {
        super(0);
        this.$this_activityViewModel = fragment;
        this.$keyFactory = function0;
        this.$viewModelClass = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VM invoke() {
        return (VM) ((JackViewModel) aj.m5367a(this.$this_activityViewModel.requireActivity(), C24022f.m87798a()).mo6006a((String) this.$keyFactory.invoke(), C69113a.m265954a(this.$viewModelClass)));
    }
}
