package com.bytedance.ee.bear.drive.cache;

import com.bytedance.ee.bear.drive.services.AbstractC7181i;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.drive.cache.-$$Lambda$B9Wk2jxnl7-DVUNclMOkD7um7n8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$B9Wk2jxnl7DVUNclMOkD7um7n8 implements Function {
    public static final /* synthetic */ $$Lambda$B9Wk2jxnl7DVUNclMOkD7um7n8 INSTANCE = new $$Lambda$B9Wk2jxnl7DVUNclMOkD7um7n8();

    private /* synthetic */ $$Lambda$B9Wk2jxnl7DVUNclMOkD7um7n8() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((AbstractC7181i) obj).getCleanableCacheSize());
    }
}
