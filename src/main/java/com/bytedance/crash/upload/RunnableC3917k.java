package com.bytedance.crash.upload;

import android.content.Context;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.util.C3933b;

/* renamed from: com.bytedance.crash.upload.k */
public final class RunnableC3917k implements Runnable {

    /* renamed from: a */
    private final Context f11998a;

    /* renamed from: a */
    public static boolean m16207a() {
        if (C3890c.m16121a().mo15530d() || !C3933b.m16336b(C3774m.m15609j())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|(1:7)(1:8)|9|(1:32)(3:13|22|30)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        com.bytedance.crash.util.C3968x.m16537b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        com.bytedance.crash.runtime.C3873q.m16033a().mo15490a(com.bytedance.crash.C3774m.m15591a().mo15457b(), com.bytedance.crash.entity.C3743c.m15469a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.bytedance.crash.runtime.C3866n.m16016b().mo15507a() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = com.bytedance.crash.runtime.C3866n.m16016b();
        r7 = new com.bytedance.crash.runtime.p229c.C3849c(com.bytedance.crash.runtime.C3866n.m16016b().mo15507a(), 0, 5000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        com.bytedance.crash.runtime.C3873q.m16033a().mo15490a(com.bytedance.crash.C3774m.m15591a().mo15457b(), com.bytedance.crash.entity.C3743c.m15469a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c8, code lost:
        com.bytedance.crash.runtime.C3866n.m16016b().mo15508a(new com.bytedance.crash.runtime.p229c.C3849c(com.bytedance.crash.runtime.C3866n.m16016b().mo15507a(), 0, 5000));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000a */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A[Catch:{ all -> 0x005f, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020 A[Catch:{ all -> 0x005f, all -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.RunnableC3917k.run():void");
    }

    private RunnableC3917k(Context context) {
        this.f11998a = context;
    }

    /* renamed from: a */
    public static void m16205a(Context context) {
        m16206a(context, 0);
    }

    /* renamed from: a */
    private static void m16206a(Context context, int i) {
        C3866n.m16016b().mo15509a(new RunnableC3917k(context), (long) i);
    }
}
