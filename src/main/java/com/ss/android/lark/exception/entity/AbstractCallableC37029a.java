package com.ss.android.lark.exception.entity;

import com.ss.android.lark.log.Log;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.lark.exception.entity.a */
public abstract class AbstractCallableC37029a<T> implements Callable<T> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo102726b() throws Exception;

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        try {
            return mo102726b();
        } catch (Exception e) {
            Log.m165385e("ExceptionDetectorCallab", "" + e.getStackTrace(), e, true);
            return null;
        }
    }
}
