package com.he;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsScopedContext;
import java.util.concurrent.atomic.AtomicInteger;

public final class JsRunLoop extends Thread {
    private static final Delegate delegate = new Delegate();
    private static final AtomicInteger thread_id = new AtomicInteger(0);
    private Handler handler;
    public IAppContext iAppContext;
    private JsContext mJsContext;
    private Runnable posted_task;
    private SetupCallback setupCallback;
    private Throwable thrown;

    public interface SetupCallback extends JsContext.ScopeCallback {
        void cleanup();
    }

    private static class Delegate implements Handler.Callback, JsContext.ScopeCallback {
        public boolean handleMessage(Message message) {
            return false;
        }

        private Delegate() {
        }

        @Override // com.he.jsbinding.JsContext.ScopeCallback
        public void run(JsScopedContext jsScopedContext) {
            Looper.loop();
        }
    }

    public final JsContext getJsContext() {
        return this.mJsContext;
    }

    public final void quit() {
        this.handler.getLooper().quitSafely();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsRunLoop() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TmaJsThread-"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = com.he.JsRunLoop.thread_id
            r2 = 1
            int r3 = r1.addAndGet(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JsRunLoop init onAppRoute id： "
            r3.append(r4)
            int r1 = r1.addAndGet(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "falcon"
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52828d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.JsRunLoop.<init>():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0006 A[LOOP:0: B:4:0x0006->B:18:0x0006, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Handler getHandler() {
        /*
            r3 = this;
            android.os.Handler r0 = r3.handler
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            monitor-enter(r3)
        L_0x0006:
            android.os.Handler r0 = r3.handler     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            java.lang.Throwable r0 = r3.thrown     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0012
            r3.wait()     // Catch:{ InterruptedException -> 0x0006 }
            goto L_0x0006
        L_0x0012:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "failed to create js engine"
            java.lang.Throwable r2 = r3.thrown
            r0.<init>(r1, r2)
            throw r0
        L_0x001c:
            monitor-exit(r3)
            return r0
        L_0x001e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.JsRunLoop.getHandler():android.os.Handler");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[LOOP:0: B:9:0x0020->B:30:0x0020, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            android.os.Looper.prepare()
            monitor-enter(r4)
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0055 }
            com.he.JsRunLoop$Delegate r1 = com.he.JsRunLoop.delegate     // Catch:{ all -> 0x0055 }
            r0.<init>(r1)     // Catch:{ all -> 0x0055 }
            r4.handler = r0     // Catch:{ all -> 0x0055 }
            com.he.jsbinding.JsContext r0 = new com.he.jsbinding.JsContext     // Catch:{ all -> 0x004d }
            com.he.jsbinding.JsEngine r2 = new com.he.jsbinding.JsEngine     // Catch:{ all -> 0x004d }
            android.os.Handler r3 = r4.handler     // Catch:{ all -> 0x004d }
            r2.<init>(r3)     // Catch:{ all -> 0x004d }
            r0.<init>(r2)     // Catch:{ all -> 0x004d }
            r4.mJsContext = r0     // Catch:{ all -> 0x004d }
            r4.notifyAll()
            monitor-exit(r4)
            monitor-enter(r1)
        L_0x0020:
            com.he.JsRunLoop$SetupCallback r2 = r4.setupCallback     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0034
            java.lang.Runnable r2 = r4.posted_task     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x002e
            r2.run()     // Catch:{ all -> 0x004a }
            r2 = 0
            r4.posted_task = r2     // Catch:{ all -> 0x004a }
        L_0x002e:
            com.he.JsRunLoop$Delegate r2 = com.he.JsRunLoop.delegate     // Catch:{ InterruptedException -> 0x0020 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0020
        L_0x0034:
            monitor-exit(r1)
            r0.run(r2)
            com.he.JsRunLoop$Delegate r1 = com.he.JsRunLoop.delegate
            r0.run(r1)
            com.he.JsRunLoop$SetupCallback r1 = r4.setupCallback
            r1.cleanup()
            com.he.jsbinding.JsEngine r0 = r0.getEngine()
            r0.dispose()
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004d:
            r0 = move-exception
            r4.thrown = r0
            r4.notifyAll()
            monitor-exit(r4)
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.JsRunLoop.run():void");
    }

    public void bindJSContext(JsContext jsContext) {
        this.mJsContext = jsContext;
    }

    public void setup(SetupCallback setupCallback2) {
        this.setupCallback = setupCallback2;
        Delegate delegate2 = delegate;
        synchronized (delegate2) {
            delegate2.notify();
        }
    }

    public void post(Runnable runnable) {
        Delegate delegate2 = delegate;
        synchronized (delegate2) {
            if (this.setupCallback == null) {
                this.posted_task = runnable;
                delegate2.notify();
                return;
            }
            getHandler().post(runnable);
        }
    }

    public JsRunLoop(SetupCallback setupCallback2, JsContext jsContext) {
        super("TmaJsThread-" + thread_id.addAndGet(1));
        AppBrandLogger.m52828d("falcon", "JsRunLoop init onAppRoute");
        this.setupCallback = setupCallback2;
        this.mJsContext = jsContext;
    }
}
