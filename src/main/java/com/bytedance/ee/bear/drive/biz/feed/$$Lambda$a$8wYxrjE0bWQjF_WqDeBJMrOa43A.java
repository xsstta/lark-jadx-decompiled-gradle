package com.bytedance.ee.bear.drive.biz.feed;

import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.drive.biz.feed.-$$Lambda$a$8wYxrjE0bWQjF_WqDeBJMrOa43A  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$a$8wYxrjE0bWQjF_WqDeBJMrOa43A implements Consumer {
    public static final /* synthetic */ $$Lambda$a$8wYxrjE0bWQjF_WqDeBJMrOa43A INSTANCE = new $$Lambda$a$8wYxrjE0bWQjF_WqDeBJMrOa43A();

    private /* synthetic */ $$Lambda$a$8wYxrjE0bWQjF_WqDeBJMrOa43A() {
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        C13479a.m54765b("DriveFeedManager", "drive feed pullData error", (Throwable) obj);
    }
}
