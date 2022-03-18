package com.bytedance.ee.bear.drive.biz.feed;

import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.drive.biz.feed.-$$Lambda$c$b$Hw-qcQ50aY1T8ua-iUIZTqWE4bw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$c$b$HwqcQ50aY1T8uaiUIZTqWE4bw implements Consumer {
    public static final /* synthetic */ $$Lambda$c$b$HwqcQ50aY1T8uaiUIZTqWE4bw INSTANCE = new $$Lambda$c$b$HwqcQ50aY1T8uaiUIZTqWE4bw();

    private /* synthetic */ $$Lambda$c$b$HwqcQ50aY1T8uaiUIZTqWE4bw() {
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        C13479a.m54765b("DriveFeedManager", "onChanged drive feed pullData error", (Throwable) obj);
    }
}
