package com.larksuite.framework.thread;

import com.ss.ttm.player.MediaPlayer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.c */
public class C26138c extends C26155n {

    /* renamed from: a */
    protected static final int f64536a;

    /* renamed from: b */
    protected static final int f64537b;

    /* renamed from: h */
    private static final int f64538h;

    /* renamed from: c */
    public long f64539c = 2000;

    /* renamed from: d */
    public long f64540d = 1000;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f64538h = availableProcessors;
        f64536a = availableProcessors;
        f64537b = availableProcessors + 3;
    }

    public static C26155n c_(String str) {
        return new C26138c(str, new LinkedBlockingDeque((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID), new ThreadFactoryC26153m("lk-cpu", 3, false));
    }

    /* renamed from: a */
    public void mo93041a(long j, long j2) {
        this.f64539c = j;
        this.f64540d = j2;
    }

    private C26138c(String str, BlockingQueue<Runnable> blockingQueue, ThreadFactoryC26153m mVar) {
        super(str, f64536a, f64537b, 30, blockingQueue, mVar);
        this.f64604g = this.f64603f + "-CPUExecutor";
        mo93041a(2000, 1000);
    }
}
