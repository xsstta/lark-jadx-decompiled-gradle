package com.ss.android.lark.multitask.task;

import com.ss.android.lark.multitask.task.MainTaskChangeCallback;
import com.ss.android.lark.multitask.task.RemoteTaskContainerImpl;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/multitask/task/RemoteTaskContainerImpl$watchMainTaskChanges$1$1", "Lcom/ss/android/lark/multitask/task/MainTaskChangeCallback$Stub;", "onTaskListChanged", "", "identifiers", "", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemoteTaskContainerImpl$watchMainTaskChanges$1$1 extends MainTaskChangeCallback.Stub {
    final /* synthetic */ RemoteTaskContainerImpl.C48360i this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RemoteTaskContainerImpl$watchMainTaskChanges$1$1(RemoteTaskContainerImpl.C48360i iVar) {
        this.this$0 = iVar;
    }

    @Override // com.ss.android.lark.multitask.task.MainTaskChangeCallback
    public void onTaskListChanged(List<String> list) {
        if (list != null) {
            this.this$0.this$0.mo169156a(list);
        }
    }
}
