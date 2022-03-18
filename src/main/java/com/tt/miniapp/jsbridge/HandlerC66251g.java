package com.tt.miniapp.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.he.jsbinding.JsContext;
import com.he.jsbinding.JsScopedContext;
import com.tt.miniapp.JsRuntime;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tt.miniapp.jsbridge.g */
public class HandlerC66251g extends Handler {

    /* renamed from: a */
    private CopyOnWriteArraySet<Integer> f167213a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    private WeakReference<JsRuntime> f167214b;

    /* renamed from: c */
    private boolean f167215c;

    /* renamed from: d */
    private LinkedBlockingQueue<C66253a> f167216d = new LinkedBlockingQueue<>();

    /* renamed from: b */
    public void mo231622b() {
    }

    /* renamed from: a */
    public void mo231619a() {
        if (hasMessages(3)) {
            removeMessages(3);
        }
        sendEmptyMessage(4);
    }

    /* renamed from: c */
    private void m259253c() {
        C66253a poll = this.f167216d.poll();
        while (poll != null) {
            m259254c(poll.f167220a, poll.f167221b);
            poll = this.f167216d.poll();
        }
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 1) {
            int intValue = ((Integer) message.obj).intValue();
            if (this.f167213a.contains(Integer.valueOf(intValue))) {
                m259252b("Timeout", intValue);
                this.f167213a.remove(Integer.valueOf(intValue));
            }
        } else if (i == 2) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            if (this.f167213a.contains(Integer.valueOf(i2))) {
                m259252b("Interval", i2);
                sendMessageDelayed(obtainMessage(2, i2, i3), (long) i3);
            }
        } else if (i == 3) {
            this.f167215c = true;
        } else if (i == 4) {
            this.f167215c = false;
            m259253c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.jsbridge.g$a */
    public static class C66253a {

        /* renamed from: a */
        String f167220a;

        /* renamed from: b */
        int f167221b;

        public C66253a(String str, int i) {
            this.f167220a = str;
            this.f167221b = i;
        }
    }

    public HandlerC66251g(Looper looper, JsRuntime jsRuntime) {
        super(looper);
        this.f167214b = new WeakReference<>(jsRuntime);
    }

    /* renamed from: b */
    private void m259252b(String str, int i) {
        if (this.f167215c) {
            this.f167216d.add(new C66253a(str, i));
            return;
        }
        m259253c();
        m259254c(str, i);
    }

    /* renamed from: a */
    public void mo231620a(String str, int i) {
        this.f167213a.remove(Integer.valueOf(i));
    }

    /* renamed from: c */
    private void m259254c(final String str, final int i) {
        JsRuntime jsRuntime = this.f167214b.get();
        if (jsRuntime != null) {
            jsRuntime.executeInJsThread(new JsContext.ScopeCallback() {
                /* class com.tt.miniapp.jsbridge.HandlerC66251g.C662521 */

                @Override // com.he.jsbinding.JsContext.ScopeCallback
                public void run(JsScopedContext jsScopedContext) {
                    jsScopedContext.push(str);
                    jsScopedContext.push(i);
                    jsScopedContext.global().callMethod("nativeInvokeTimer", 2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo231621a(String str, int i, long j) {
        if (TextUtils.equals(str, "Timeout")) {
            this.f167213a.add(Integer.valueOf(i));
            sendMessageDelayed(obtainMessage(1, Integer.valueOf(i)), j);
        } else if (TextUtils.equals(str, "Interval")) {
            this.f167213a.add(Integer.valueOf(i));
            sendMessageDelayed(obtainMessage(2, i, (int) j), 0);
        }
    }
}
