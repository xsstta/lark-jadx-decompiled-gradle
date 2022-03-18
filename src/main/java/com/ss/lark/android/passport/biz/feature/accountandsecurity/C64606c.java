package com.ss.lark.android.passport.biz.feature.accountandsecurity;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;

/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.c */
public class C64606c {
    /* renamed from: a */
    public static void m253859a(Context context) {
        C64601b.m253843a().mo223365b(context);
    }

    /* renamed from: a */
    public static void m253860a(Context context, String str) {
        C64601b.m253843a().mo223363a(context);
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.lark.android.passport.biz.feature.accountandsecurity.C64606c.RunnableC646071 */

            public void run() {
                C64608d.m253861a();
            }
        });
    }
}
