package com.larksuite.framework.thread;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.thread.r */
public class HandlerC26164r extends Handler {

    /* renamed from: a */
    private static String f64622a = "CoreThreadPool LarkHandler";

    /* renamed from: b */
    private long f64623b = 1000;

    /* renamed from: c */
    private long f64624c = 1000;

    /* renamed from: d */
    private String f64625d;

    /* renamed from: e */
    private String f64626e;

    /* renamed from: f */
    private String f64627f = "LarkHandler";

    public HandlerC26164r(Looper looper) {
        super(looper);
    }

    public void dispatchMessage(Message message) {
        String str;
        if (this.f64625d == null) {
            this.f64625d = Thread.currentThread().getName();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!TextUtils.isEmpty(this.f64626e)) {
            str = this.f64626e;
        } else if (message.getCallback() != null) {
            str = message.getCallback().getClass().toString();
        } else {
            str = this.f64627f + "_" + message.what;
        }
        if (CoreThreadPool.getNeedBackgroundTaskMonitor() && !CoreThreadPool.sAppFront) {
            Log.m165389i(f64622a, this.f64625d + " " + str + " background executor");
        }
        super.dispatchMessage(message);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long when = uptimeMillis - message.getWhen();
        long j = uptimeMillis2 - uptimeMillis;
        boolean z = false;
        Log.m165379d(f64622a, this.f64625d + " " + str + ", dispatch delay time is(ms) " + when + "， limit is " + this.f64623b + ", task runtime is(ms) " + j + ", limit is " + this.f64624c);
        if (when > this.f64623b || j > this.f64624c) {
            z = true;
        }
        if (z && CoreThreadPool.needMonitorTask()) {
            C26149k.m94631a().mo93081a(C26149k.m94631a().mo93079a(str, this.f64625d, when, j, this.f64623b, this.f64624c));
            Log.m165397w(f64622a, this.f64625d + " " + str + ", dispatchtime & runtime is(ms) " + when + "， " + j + ", limit is  " + this.f64623b + "," + this.f64624c);
        }
    }

    /* renamed from: a */
    public void mo93102a(long j, long j2) {
        this.f64623b = j;
        this.f64624c = j2;
    }

    public HandlerC26164r(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        if (callback != null) {
            this.f64626e = callback.getClass().toString();
        }
    }

    public HandlerC26164r(Looper looper, String str) {
        super(looper);
        this.f64625d = str;
    }
}
