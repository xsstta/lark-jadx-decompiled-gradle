package com.bytedance.ee.bear.drive.biz.upload.error;

import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.error.-$$Lambda$c$9sptUvLGRsoYMSeaRSS28mX_9-0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$c$9sptUvLGRsoYMSeaRSS28mX_90 implements Consumer {
    public static final /* synthetic */ $$Lambda$c$9sptUvLGRsoYMSeaRSS28mX_90 INSTANCE = new $$Lambda$c$9sptUvLGRsoYMSeaRSS28mX_90();

    private /* synthetic */ $$Lambda$c$9sptUvLGRsoYMSeaRSS28mX_90() {
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        C13479a.m54773d("ExceedLimitHandler", "reportCreateExceedQuotaEvent ", (Throwable) obj);
    }
}
