package com.larksuite.arch.jack;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ak;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0005\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "T", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lcom/larksuite/arch/jack/JackView;", "VM", "Lcom/larksuite/arch/jack/JackViewModel;", "S", "Lcom/larksuite/arch/jack/State;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class ExtensionsKt$viewModel$3 extends Lambda implements Function0<ak> {
    final /* synthetic */ ViewModelStoreOwner $this_viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionsKt$viewModel$3(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$this_viewModel = viewModelStoreOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ak invoke() {
        ak viewModelStore = this.$this_viewModel.getViewModelStore();
        Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
