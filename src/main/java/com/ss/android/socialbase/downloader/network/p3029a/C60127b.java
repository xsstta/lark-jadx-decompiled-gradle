package com.ss.android.socialbase.downloader.network.p3029a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.socialbase.downloader.setting.C60148a;

/* renamed from: com.ss.android.socialbase.downloader.network.a.b */
public class C60127b {

    /* renamed from: a */
    public static final Handler f150041a;

    /* renamed from: b */
    static long f150042b;

    /* renamed from: c */
    static long f150043c;

    /* renamed from: d */
    private static final HandlerThread f150044d;

    /* renamed from: a */
    public static HandlerThread m233659a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    static {
        HandlerThread a = m233659a("Downloader-preconnecter");
        f150044d = a;
        m233660a();
        a.start();
        Handler handler = new Handler(a.getLooper());
        f150041a = handler;
        handler.post(new Runnable() {
            /* class com.ss.android.socialbase.downloader.network.p3029a.C60127b.RunnableC601281 */

            public void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    private static void m233660a() {
        f150042b = C60148a.m233727c().mo205471a("preconnect_connection_outdate_time", 300000L);
        f150043c = C60148a.m233727c().mo205471a("preconnect_head_info_outdate_time", 300000L);
        C60124a.m233655a().mo205427a(C60148a.m233727c().mo205470a("preconnect_max_cache_size", 3));
    }
}
