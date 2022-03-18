package com.ss.android.lark.app.util;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.exception.crash.npth.C37024c;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.app.util.f */
public class C29088f {
    /* renamed from: a */
    public static void m106966a(final boolean z) {
        Log.m165389i("NpthANRControl", "fixAnrMonitorState because app state is " + z);
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.app.util.C29088f.RunnableC290891 */

            public void run() {
                if (z) {
                    Log.m165389i("NpthANRControl", "app change to front , start anr monitor");
                    C37024c.m146083b();
                    return;
                }
                Log.m165389i("NpthANRControl", "app change to background , stop anr monitor");
                C37024c.m146086c();
            }
        });
    }
}
