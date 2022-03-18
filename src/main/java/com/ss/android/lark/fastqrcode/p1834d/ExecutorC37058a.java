package com.ss.android.lark.fastqrcode.p1834d;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.fastqrcode.d.a */
public class ExecutorC37058a implements Executor {

    /* renamed from: a */
    private Handler f95204a;

    /* renamed from: b */
    private final HandlerThread f95205b;

    /* renamed from: b */
    public static HandlerThread m146176b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: d */
    private void m146177d() {
        this.f95205b.start();
    }

    /* renamed from: c */
    public void mo136588c() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f95205b.quitSafely();
        }
    }

    /* renamed from: a */
    public synchronized Handler mo136586a() {
        if (this.f95204a == null) {
            this.f95204a = new Handler(this.f95205b.getLooper());
        }
        return this.f95204a;
    }

    /* renamed from: b */
    public boolean mo136587b() {
        if (Looper.myLooper() == mo136586a().getLooper()) {
            return true;
        }
        return false;
    }

    private ExecutorC37058a(String str) {
        this.f95205b = m146176b(str);
    }

    /* renamed from: a */
    public static ExecutorC37058a m146175a(String str) {
        ExecutorC37058a aVar = new ExecutorC37058a(str);
        aVar.m146177d();
        return aVar;
    }

    public void execute(Runnable runnable) {
        if (this.f95205b.isAlive()) {
            if (mo136587b()) {
                runnable.run();
            } else {
                mo136586a().post(runnable);
            }
        }
    }
}
