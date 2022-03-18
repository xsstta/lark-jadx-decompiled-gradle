package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.SharedReference;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0006\u0010\f\u001a\u00020\u0005J\u001e\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J&\u0010\u0012\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J#\u0010\u0017\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010\u001b\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/ugc/effectplatform/task/SyncTask;", "T", "", "()V", "mCanceled", "", "syncTaskListener", "Lbytekn/foundation/concurrent/SharedReference;", "Lcom/ss/ugc/effectplatform/task/SyncTaskListener;", "cancel", "", "execute", "isCanceled", "onFailed", "syncTask", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onFinally", "onProgress", "progress", "", "totalSize", "", "onResponse", "response", "(Lcom/ss/ugc/effectplatform/task/SyncTask;Ljava/lang/Object;)V", "onStart", "setListener", "listener", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.m */
public class SyncTask<T> {

    /* renamed from: a */
    private SharedReference<SyncTaskListener<T>> f165081a = new SharedReference<>(null);

    /* renamed from: b */
    private boolean f165082b;

    /* renamed from: a */
    public void mo228250a() {
    }

    /* renamed from: b */
    public final boolean mo228291b() {
        return this.f165082b;
    }

    /* renamed from: a */
    public final void mo228289a(SyncTaskListener<T> nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "listener");
        this.f165081a.mo8626a(nVar);
    }

    /* renamed from: a */
    public final void mo228287a(SyncTask<T> mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        SyncTaskListener<T> a = this.f165081a.mo8625a();
        if (a != null) {
            a.mo228251a(mVar);
        }
    }

    /* renamed from: b */
    public final void mo228290b(SyncTask<T> mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        SyncTaskListener<T> a = this.f165081a.mo8625a();
        if (a != null) {
            a.mo228256b(mVar);
        }
    }

    /* renamed from: a */
    public void mo228271a(SyncTask<T> mVar, ExceptionResult cVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        Intrinsics.checkParameterIsNotNull(cVar, "e");
        SyncTaskListener<T> a = this.f165081a.mo8625a();
        if (a != null) {
            a.mo228253a((SyncTask) mVar, cVar);
        }
    }

    /* renamed from: a */
    public void mo228273a(SyncTask<T> mVar, T t) {
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        SyncTaskListener<T> a = this.f165081a.mo8625a();
        if (a != null) {
            a.mo228255a((SyncTask) mVar, (Object) t);
        }
    }

    /* renamed from: a */
    public void mo228288a(SyncTask<T> mVar, int i, long j) {
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        SyncTaskListener<T> a = this.f165081a.mo8625a();
        if (a != null) {
            a.mo228252a(mVar, i, j);
        }
    }
}
