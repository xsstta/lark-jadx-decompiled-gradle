package com.ss.android.lark.multitask.task;

import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\u001a\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J \u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¨\u0006$"}, d2 = {"Lcom/ss/android/lark/multitask/task/RemoteTaskContainer;", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "Lcom/ss/android/lark/multitask/task/TaskContainerApi;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "()V", "clearTasks", "", "dispatchRestoreInstanceState", "taskSnapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "task", "Lcom/ss/android/lark/multitask/task/Task;", "dispatchSaveInstanceState", "outState", "Landroid/os/Bundle;", "getImpl", "getTaskSnapshotForTask", "callback", "Lcom/ss/android/lark/multitask/task/TaskSnapshotCallback;", "isDuplicatedTask", "", "isFull", "notifyTaskWillEnterBackground", "container", "starter", "Lcom/ss/android/lark/multitask/task/TaskStarter;", "notifyTaskWillEnterForeground", "taskIdentifier", "", "size", "", "startTask", "terminateTask", "Companion", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.task.l */
public final class RemoteTaskContainer implements AbstractC48375n {

    /* renamed from: a */
    public static AbstractC48375n f121814a;

    /* renamed from: b */
    public static final Companion f121815b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/multitask/task/RemoteTaskContainer$Companion;", "", "()V", "internalImpl", "Lcom/ss/android/lark/multitask/task/TaskContainer;", "getInternalImpl", "()Lcom/ss/android/lark/multitask/task/TaskContainer;", "setInternalImpl", "(Lcom/ss/android/lark/multitask/task/TaskContainer;)V", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.multitask.task.l$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final AbstractC48375n mo169231a() {
            AbstractC48375n nVar = RemoteTaskContainer.f121814a;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
            }
            return nVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo169232a(AbstractC48375n nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "<set-?>");
            RemoteTaskContainer.f121814a = nVar;
        }
    }

    public RemoteTaskContainer() {
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169157a() {
        AbstractC48375n nVar = f121814a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        return nVar.mo169157a();
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public int mo169160b() {
        AbstractC48375n nVar = f121814a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        return nVar.mo169160b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RemoteTaskContainer(Context context) {
        this();
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: b */
    public void mo169161b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        AbstractC48375n nVar = f121814a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169161b(str);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169155a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskIdentifier");
        AbstractC48375n nVar = f121814a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169155a(str);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public boolean mo169159a(Task task) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        AbstractC48375n nVar = f121814a;
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
        AbstractC48375n nVar = f121814a;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar.mo169151a(task, bundle);
    }

    @Override // com.ss.android.lark.multitask.task.AbstractC48375n
    /* renamed from: a */
    public void mo169153a(Task task, AbstractC48377r rVar) {
        Intrinsics.checkParameterIsNotNull(task, "task");
        AbstractC48375n nVar = f121814a;
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
        AbstractC48375n nVar = f121814a;
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
        AbstractC48375n nVar2 = f121814a;
        if (nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalImpl");
        }
        nVar2.mo169152a(task, nVar, tVar);
    }
}
