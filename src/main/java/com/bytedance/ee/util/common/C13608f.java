package com.bytedance.ee.util.common;

import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.util.common.f */
public class C13608f {
    /* renamed from: a */
    public static void m55249a(final Runnable runnable) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new Consumer<String>() {
            /* class com.bytedance.ee.util.common.C13608f.C136091 */

            /* renamed from: a */
            public void accept(String str) {
                runnable.run();
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.util.common.C13608f.C136102 */

            /* renamed from: a */
            public void accept(Throwable th) {
                C13479a.m54761a("SwitchThreadUtils", th);
            }
        });
    }
}
