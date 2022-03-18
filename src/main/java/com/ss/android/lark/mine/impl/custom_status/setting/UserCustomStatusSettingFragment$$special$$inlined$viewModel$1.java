package com.ss.android.lark.mine.impl.custom_status.setting;

import kotlin.Metadata;
import kotlin.jvm.C69113a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\f\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0002\u0010\b*\u00020\tH\n¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lcom/larksuite/arch/jack/JackView;", "VM", "Lcom/larksuite/arch/jack/JackViewModel;", "S", "Lcom/larksuite/arch/jack/State;", "invoke", "com/larksuite/arch/jack/ExtensionsKt$viewModel$1"}, mo238835k = 3, mv = {1, 1, 16})
public final class UserCustomStatusSettingFragment$$special$$inlined$viewModel$1 extends Lambda implements Function0<String> {
    final /* synthetic */ KClass $viewModelClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserCustomStatusSettingFragment$$special$$inlined$viewModel$1(KClass kClass) {
        super(0);
        this.$viewModelClass = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String name = C69113a.m265954a(this.$viewModelClass).getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
        return name;
    }
}
