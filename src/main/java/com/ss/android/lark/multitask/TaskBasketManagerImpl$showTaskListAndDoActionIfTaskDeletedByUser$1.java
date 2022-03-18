package com.ss.android.lark.multitask;

import com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/multitask/TaskBasketManagerImpl$showTaskListAndDoActionIfTaskDeletedByUser$1", "Lcom/ss/android/lark/multitask/task/RemoteFloatingWindowInterface$Stub;", "call", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TaskBasketManagerImpl$showTaskListAndDoActionIfTaskDeletedByUser$1 extends RemoteFloatingWindowInterface.Stub {
    final /* synthetic */ Function0 $action;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.lark.multitask.q] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call() {
        /*
            r3 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            kotlin.jvm.functions.Function0 r1 = r3.$action
            if (r1 == 0) goto L_0x0013
            com.ss.android.lark.multitask.q r2 = new com.ss.android.lark.multitask.q
            r2.<init>(r1)
            r1 = r2
        L_0x0013:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.multitask.TaskBasketManagerImpl$showTaskListAndDoActionIfTaskDeletedByUser$1.call():void");
    }

    TaskBasketManagerImpl$showTaskListAndDoActionIfTaskDeletedByUser$1(Function0 function0) {
        this.$action = function0;
    }
}
