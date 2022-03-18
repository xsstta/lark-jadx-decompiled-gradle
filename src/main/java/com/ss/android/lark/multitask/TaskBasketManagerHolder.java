package com.ss.android.lark.multitask;

import android.view.View;
import com.ss.android.lark.multitask.task.AbstractC48379u;
import com.ss.android.lark.multitask.task.TaskFinishHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/multitask/TaskBasketManagerHolder;", "", "()V", "impl", "Lcom/ss/android/lark/multitask/TaskBasketManager;", "bindLayoutToTask", "Lcom/ss/android/lark/multitask/task/TaskFinishHandler;", "layout", "Landroid/view/View;", "taskWrapper", "Lcom/ss/android/lark/multitask/task/TaskWrapper;", "isRestored", "", "getTaskFinishHandler", "init", "", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.n */
public final class TaskBasketManagerHolder {

    /* renamed from: a */
    public static final TaskBasketManagerHolder f121740a = new TaskBasketManagerHolder();

    /* renamed from: b */
    private static TaskBasketManager f121741b;

    private TaskBasketManagerHolder() {
    }

    /* renamed from: a */
    public final void mo169073a(TaskBasketManager mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "impl");
        f121741b = mVar;
    }

    /* renamed from: a */
    public final TaskFinishHandler mo169072a(AbstractC48379u uVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        TaskBasketManager mVar = f121741b;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
        }
        return mVar.mo169070a(uVar, z);
    }

    /* renamed from: a */
    public final TaskFinishHandler mo169071a(View view, AbstractC48379u uVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "layout");
        Intrinsics.checkParameterIsNotNull(uVar, "taskWrapper");
        TaskBasketManager mVar = f121741b;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
        }
        return mVar.mo169069a(view, uVar, z);
    }
}
