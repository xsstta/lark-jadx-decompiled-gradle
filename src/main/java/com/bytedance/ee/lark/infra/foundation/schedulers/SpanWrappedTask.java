package com.bytedance.ee.lark.infra.foundation.schedulers;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.AbstractC48931c;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.C48939c;
import java.util.concurrent.Callable;

public abstract class SpanWrappedTask<V> extends CompletableFutureTask<V> {
    private TracingCoreSpan mSpan;

    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.CompletableFutureTask
    public void run() {
        if (this.mSpan != null) {
            AbstractC48931c a = C48939c.m192792a().mo170890a().mo170897a(this.mSpan);
            super.run();
            a.mo170895a();
            return;
        }
        AppBrandLogger.m52831w("SpanWrappedTask", "span null");
        super.run();
    }

    public SpanWrappedTask(Callable<V> callable) {
        super(callable);
        TracingCoreSpan a = C48939c.m192792a().mo170890a().mo170896a();
        if (a == null) {
            AppBrandLogger.m52831w("SpanWrappedTask", "no activeSpan for currentThread");
            a = OPTraceService.m192757a();
            C48939c.m192792a().mo170890a().mo170897a(a);
        }
        this.mSpan = a.generateSpan();
    }
}
