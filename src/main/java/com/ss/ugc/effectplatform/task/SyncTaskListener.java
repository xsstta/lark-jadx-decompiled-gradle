package com.ss.ugc.effectplatform.task;

import com.ss.ugc.effectplatform.model.ExceptionResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J&\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J#\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¨\u0006\u0013"}, d2 = {"Lcom/ss/ugc/effectplatform/task/SyncTaskListener;", "T", "", "onFailed", "", "syncTask", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onFinally", "onProgress", "progress", "", "totalSize", "", "onResponse", "response", "(Lcom/ss/ugc/effectplatform/task/SyncTask;Ljava/lang/Object;)V", "onStart", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.n */
public interface SyncTaskListener<T> {
    /* renamed from: a */
    void mo228251a(SyncTask<T> mVar);

    /* renamed from: a */
    void mo228252a(SyncTask<T> mVar, int i, long j);

    /* renamed from: a */
    void mo228253a(SyncTask<T> mVar, ExceptionResult cVar);

    /* renamed from: a */
    void mo228255a(SyncTask<T> mVar, T t);

    /* renamed from: b */
    void mo228256b(SyncTask<T> mVar);
}
