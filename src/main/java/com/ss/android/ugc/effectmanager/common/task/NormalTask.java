package com.ss.android.ugc.effectmanager.common.task;

import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0004J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/task/NormalTask;", "Lcom/ss/android/ugc/effectmanager/common/task/ITask;", "handler", "Landroid/os/Handler;", "taskId", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "getHandler", "()Landroid/os/Handler;", "isCanceled", "", "()Z", "setCanceled", "(Z)V", "cancel", "", "getTaskId", "sendMessage", "msg", "", "result", "Lcom/ss/android/ugc/effectmanager/common/task/BaseTaskResult;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.g.f */
public abstract class NormalTask implements AbstractC60520e {

    /* renamed from: a */
    private boolean f151320a;

    /* renamed from: b */
    private final Handler f151321b;

    /* renamed from: c */
    private String f151322c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo207225b() {
        return this.f151320a;
    }

    public NormalTask(Handler handler, String str) {
        this.f151321b = handler;
        this.f151322c = str;
    }

    /* renamed from: a */
    public final void mo207224a(int i, C60518b bVar) {
        Message message;
        Intrinsics.checkParameterIsNotNull(bVar, "result");
        bVar.mo207216a(this.f151322c);
        Handler handler = this.f151321b;
        if (handler != null) {
            message = handler.obtainMessage(i);
        } else {
            message = null;
        }
        if (message != null) {
            message.obj = bVar;
        }
        if (message != null) {
            message.sendToTarget();
        }
    }
}
