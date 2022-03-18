package com.ss.android.lark.todo.impl.features.common.widget;

import android.view.ViewGroup;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/widget/TodoLoadingUIBuilder;", "Lcom/larksuite/component/ui/loading/LKUIStatus$Builder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.widget.b */
public final class TodoLoadingUIBuilder extends LKUIStatus.C25680a {

    /* renamed from: l */
    private final ViewGroup f139413l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoLoadingUIBuilder(ViewGroup viewGroup) {
        super(viewGroup);
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f139413l = viewGroup;
        mo89861b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_LoadFailedTryAgainLater));
        mo89860b(R.drawable.illustration_placeholder_common_load_failed);
    }
}
