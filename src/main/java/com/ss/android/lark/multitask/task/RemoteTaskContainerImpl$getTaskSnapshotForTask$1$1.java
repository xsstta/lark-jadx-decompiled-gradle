package com.ss.android.lark.multitask.task;

import com.ss.android.lark.multitask.task.RemoteTaskCallback;
import com.ss.android.lark.multitask.task.RemoteTaskContainerImpl;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/multitask/task/RemoteTaskContainerImpl$getTaskSnapshotForTask$1$1", "Lcom/ss/android/lark/multitask/task/RemoteTaskCallback$Stub;", "actionPerformed", "", "snapshot", "Lcom/ss/android/lark/multitask/task/RemoteTaskSnapshot;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemoteTaskContainerImpl$getTaskSnapshotForTask$1$1 extends RemoteTaskCallback.Stub {
    final /* synthetic */ RemoteTaskContainerImpl.C48355d this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RemoteTaskContainerImpl$getTaskSnapshotForTask$1$1(RemoteTaskContainerImpl.C48355d dVar) {
        this.this$0 = dVar;
    }

    @Override // com.ss.android.lark.multitask.task.RemoteTaskCallback
    public void actionPerformed(RemoteTaskSnapshot remoteTaskSnapshot) {
        AbstractC48377r rVar = this.this$0.$callback;
        if (rVar != null) {
            rVar.mo168851a(remoteTaskSnapshot);
        }
    }
}
