package com.bytedance.applog.p199c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.applog.C3368a;
import com.bytedance.common.utility.NetworkUtils;
import java.util.HashMap;

/* renamed from: com.bytedance.applog.c.c */
public class RunnableC3391c implements Runnable {

    /* renamed from: f */
    private static final Handler f10739f = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final AbstractC3388a f10740a;

    /* renamed from: b */
    private String f10741b;

    /* renamed from: c */
    private String f10742c;

    /* renamed from: d */
    private String f10743d;

    /* renamed from: e */
    private Context f10744e;

    /* renamed from: a */
    private void m14166a() {
        f10739f.post(new Runnable() {
            /* class com.bytedance.applog.p199c.RunnableC3391c.RunnableC33932 */

            public void run() {
                RunnableC3391c.this.f10740a.mo13627a();
            }
        });
    }

    public void run() {
        try {
            if (!NetworkUtils.isNetworkAvailable(this.f10744e)) {
                m14167a(0);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json");
            hashMap.put("X-APIKEY", this.f10742c);
            C3368a.m14053p().mo13887a(this.f10741b, this.f10743d.getBytes(), hashMap);
            m14166a();
        } catch (Throwable th) {
            th.printStackTrace();
            m14167a(1);
        }
    }

    /* renamed from: a */
    private void m14167a(final int i) {
        f10739f.post(new Runnable() {
            /* class com.bytedance.applog.p199c.RunnableC3391c.RunnableC33921 */

            public void run() {
                if (RunnableC3391c.this.f10740a != null) {
                    RunnableC3391c.this.f10740a.mo13628a(i);
                }
            }
        });
    }

    public RunnableC3391c(String str, String str2, String str3, AbstractC3388a aVar, Context context) {
        this.f10741b = str;
        this.f10742c = str2;
        this.f10743d = str3;
        this.f10740a = aVar;
        this.f10744e = context;
    }
}
