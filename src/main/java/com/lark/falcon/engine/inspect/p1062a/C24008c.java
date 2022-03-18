package com.lark.falcon.engine.inspect.p1062a;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.lark.falcon.engine.common.C23971a;
import com.lark.falcon.engine.inspect.C24011b;
import com.lark.falcon.engine.inspect.InspectorClient;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23980b;
import com.lark.falcon.engine.inspect.p1062a.p1063a.C23987h;
import com.lark.falcon.engine.p1059c.C23970a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.lark.falcon.engine.inspect.a.c */
public class C24008c {

    /* renamed from: a */
    public C23987h f59375a;

    /* renamed from: b */
    private LocalServerSocket f59376b;

    /* renamed from: c */
    private final AtomicInteger f59377c = new AtomicInteger();

    /* renamed from: d */
    private final C24011b f59378d = new C24011b();

    /* renamed from: e */
    private final C23980b f59379e = new C23980b();

    /* renamed from: a */
    public static Thread m87767a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: b */
    private C23987h m87768b() {
        this.f59378d.mo86182a(this.f59379e);
        return new C23987h(this.f59379e);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.inspect.a.c$a */
    public class C24009a extends Thread {

        /* renamed from: b */
        private final LocalSocket f59381b;

        public void run() {
            try {
                C24008c.this.f59375a.mo86148a(new C24010d(this.f59381b, new C23993b(this.f59381b.getInputStream(), 1024)));
            } catch (Exception e) {
                C23970a.m87620a("LocalSocketServer", e);
            }
        }

        public C24009a(LocalSocket localSocket) {
            this.f59381b = localSocket;
        }
    }

    /* renamed from: a */
    public void mo86175a() {
        m87767a(new Thread(new Runnable() {
            /* class com.lark.falcon.engine.inspect.p1062a.$$Lambda$c$PwT4hQrNTeQGlpmmIxcHbz_SjkE */

            public final void run() {
                C24008c.this.m87769c();
            }
        })).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m87769c() {
        try {
            this.f59376b = new LocalServerSocket("JsEngine_" + C23971a.m87624a() + "_devtools_remote");
            this.f59375a = m87768b();
            while (!Thread.interrupted()) {
                C24009a aVar = new C24009a(this.f59376b.accept());
                aVar.setName("LocalSocketServer_WorkerThread_" + this.f59377c.incrementAndGet());
                aVar.setDaemon(true);
                aVar.start();
            }
        } catch (IOException e) {
            C23970a.m87620a("LocalSocketServer", e);
        }
    }

    /* renamed from: b */
    public void mo86177b(InspectorClient inspectorClient) {
        this.f59378d.mo86183b(inspectorClient);
        this.f59379e.mo86139b(inspectorClient.mo86115c(), inspectorClient.mo86116d());
    }

    /* renamed from: a */
    public void mo86176a(InspectorClient inspectorClient) {
        this.f59378d.mo86181a(inspectorClient);
        this.f59379e.mo86138a(inspectorClient.mo86115c(), inspectorClient.mo86116d());
    }
}
