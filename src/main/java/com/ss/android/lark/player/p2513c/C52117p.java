package com.ss.android.lark.player.p2513c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.player.c.p */
public class C52117p {

    /* renamed from: a */
    public boolean f129312a;

    /* renamed from: b */
    public boolean f129313b;

    /* renamed from: c */
    public boolean f129314c;

    /* renamed from: d */
    public AbstractC52119a f129315d;

    /* renamed from: e */
    private final int f129316e = 1;

    /* renamed from: f */
    private int f129317f;

    /* renamed from: g */
    private Handler f129318g = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.lark.player.p2513c.C52117p.HandlerC521181 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && C52117p.this.f129314c && C52117p.this.f129312a && C52117p.this.f129313b) {
                if (C52117p.this.f129315d != null) {
                    C52117p.this.f129315d.mo178532a();
                }
                C52117p.this.mo178528b();
            }
        }
    };

    /* renamed from: com.ss.android.lark.player.c.p$a */
    public interface AbstractC52119a {
        /* renamed from: a */
        void mo178532a();
    }

    /* renamed from: d */
    private void m202181d() {
        this.f129318g.removeMessages(1);
    }

    /* renamed from: c */
    public void mo178530c() {
        this.f129312a = false;
        m202181d();
    }

    /* renamed from: a */
    public void mo178524a() {
        this.f129312a = true;
        m202181d();
        this.f129318g.sendEmptyMessage(1);
    }

    /* renamed from: b */
    public void mo178528b() {
        m202181d();
        this.f129318g.sendEmptyMessageDelayed(1, (long) this.f129317f);
    }

    /* renamed from: a */
    public void mo178526a(AbstractC52119a aVar) {
        this.f129315d = aVar;
    }

    public C52117p(int i) {
        this.f129317f = i;
    }

    /* renamed from: a */
    public void mo178527a(boolean z) {
        this.f129314c = z;
        if (!z) {
            mo178530c();
            Log.m165383e("TimerCounterProxy", "Timer Stopped");
            return;
        }
        mo178524a();
        Log.m165383e("TimerCounterProxy", "Timer Started");
    }

    /* renamed from: b */
    public void mo178529b(int i, Bundle bundle) {
        this.f129313b = false;
        mo178530c();
    }

    /* renamed from: a */
    public void mo178525a(int i, Bundle bundle) {
        boolean z = true;
        boolean z2 = false;
        switch (i) {
            case -99016:
            case -99009:
            case -99008:
            case -99007:
                this.f129313b = false;
                z = false;
                z2 = true;
                break;
            case -99015:
            case -99014:
            case -99011:
            case -99010:
            case -99006:
            case -99005:
            case -99001:
                this.f129313b = true;
                break;
            case -99013:
            case -99012:
            case -99004:
            case -99003:
            case -99002:
            default:
                Log.m165389i("TimerCounterProxy", "unknown event int proxyPlayEvent");
                z = false;
                break;
        }
        if (this.f129314c) {
            if (z) {
                mo178524a();
            }
            if (z2) {
                mo178530c();
            }
        }
    }
}
