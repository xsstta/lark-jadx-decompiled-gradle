package com.ss.android.lark.todo.impl.features.chatlist.mvvm;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ak;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$1"}, mo238835k = 3, mv = {1, 1, 16})
public final class TodoChatListActivity$$special$$inlined$viewModels$2 extends Lambda implements Function0<ak> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoChatListActivity$$special$$inlined$viewModels$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ak invoke() {
        ak viewModelStore = this.$this_viewModels.getViewModelStore();
        Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "viewModelStore");
        return viewModelStore;
    }
}
