package com.ss.android.lark.multitask.task;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0001H\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0004\u001a\u00020\u0001X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006%"}, d2 = {"Lcom/ss/android/lark/multitask/task/GlobalTaskContainer;", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "Lcom/ss/android/lark/multitask/task/TaskContainerApi;", "()V", "internalImpl", "getInternalImpl", "()Lcom/ss/android/lark/multitask/task/TaskContainer;", "setInternalImpl", "(Lcom/ss/android/lark/multitask/task/TaskContainer;)V", "clearTasks", "", "dispatchRestoreInstanceState", "taskSnapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "task", "Lcom/ss/android/lark/multitask/task/Task;", "dispatchSaveInstanceState", "outState", "Landroid/os/Bundle;", "getImpl", "getTaskSnapshotForTask", "callback", "Lcom/ss/android/lark/multitask/task/TaskSnapshotCallback;", "isDuplicatedTask", "", "isFull", "notifyTaskWillEnterBackground", "container", "starter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "notifyTaskWillEnterForeground", "taskIdentifier", "", "size", "", "startTask", "terminateTask", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.i */
public final class GlobalTaskContainer implements AbstractC48375n {

    /* renamed from: a */
    public static AbstractC48375n f121800a;

    /* renamed from: b */
    public static final GlobalTaskContainer f121801b = new GlobalTaskContainer();

    private GlobalTaskContainer() {
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169157a() {
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        return nVar.mo169157a();
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public int mo169160b() {
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        return nVar.mo169160b();
    }

    /* renamed from: c */
    public AbstractC48375n mo169221c() {
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        return nVar;
    }

    /* renamed from: a */
    public final void mo169220a(AbstractC48375n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "<set-?>");
        f121800a = nVar;
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public void mo169161b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169161b(str);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169155a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169155a(str);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169159a(Task task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        return nVar.mo169159a(task);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169151a(Task task, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169151a(task, bundle);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169153a(Task task, AbstractC48377r rVar) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169153a(task, rVar);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169154a(C48376q qVar, Task task) {
        Intrinsics.checkParameterIsNotNull(qVar, "taskSnapshot");
        Intrinsics.checkParameterIsNotNull(task, "task");
        AbstractC48375n nVar = f121800a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169154a(qVar, task);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169152a(Task task, AbstractC48375n nVar, AbstractC48378t tVar) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        Intrinsics.checkParameterIsNotNull(nVar, "container");
        Intrinsics.checkParameterIsNotNull(tVar, "starter");
        AbstractC48375n nVar2 = f121800a;
        if (nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar2.mo169152a(task, nVar, tVar);
    }
}
