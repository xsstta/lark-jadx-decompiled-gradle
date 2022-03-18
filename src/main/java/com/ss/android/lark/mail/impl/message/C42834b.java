package com.ss.android.lark.mail.impl.message;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2171h.C42187a;

/* renamed from: com.ss.android.lark.mail.impl.message.b */
public class C42834b {

    /* renamed from: a */
    public long f109042a;

    /* renamed from: b */
    public boolean f109043b;

    /* renamed from: c */
    private final String f109044c = "MessageMemoryTracker";

    /* renamed from: d */
    private int f109045d;

    /* renamed from: e */
    private int f109046e;

    /* renamed from: f */
    private long f109047f;

    /* renamed from: a */
    public void mo153749a() {
        Log.m165379d("MessageMemoryTracker", "onEnterWebView");
        this.f109043b = true;
        if (this.f109047f == 0) {
            this.f109047f = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            this.f109042a = 0;
        }
    }

    /* renamed from: b */
    public void mo153750b() {
        Log.m165379d("MessageMemoryTracker", "onLeaveWebView");
        long j = this.f109042a;
        if (j > 0) {
            float f = (((float) ((int) (j - this.f109047f))) / 1024.0f) / 1024.0f;
            Log.m165389i("MessageMemoryTracker", "MAIL_DEV_MESSAGE_LIST_MEMORY_DIFF = " + f);
            C42187a.m168466a(this.f109045d, f);
        }
        this.f109043b = false;
    }

    public C42834b(int i) {
        this.f109045d = i;
        this.f109046e = i;
    }
}
