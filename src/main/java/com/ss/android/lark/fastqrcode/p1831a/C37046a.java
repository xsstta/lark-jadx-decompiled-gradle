package com.ss.android.lark.fastqrcode.p1831a;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.fastqrcode.a.a */
public class C37046a {

    /* renamed from: a */
    private static final int f95172a = (Runtime.getRuntime().availableProcessors() - 1);

    /* renamed from: b */
    private static final int f95173b = (Runtime.getRuntime().availableProcessors() * 2);

    /* renamed from: c */
    private static BlockingQueue<Runnable> f95174c;

    /* renamed from: d */
    private static ThreadPoolExecutor f95175d;

    /* renamed from: a */
    public static void m146131a() {
        f95174c = new LinkedBlockingQueue((int) SmActions.ACTION_ONTHECALL_EXIT);
        f95175d = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, f95174c, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    /* renamed from: b */
    public static void m146133b() {
        if (!f95174c.isEmpty()) {
            while (true) {
                Runnable poll = f95174c.poll();
                if (poll != null) {
                    f95175d.remove(poll);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m146132a(FutureTask futureTask) {
        f95175d.submit(futureTask);
    }
}
