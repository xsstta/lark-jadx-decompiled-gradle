package com.ss.android.lark.mail.impl.mulprocess;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43853v;

/* renamed from: com.ss.android.lark.mail.impl.mulprocess.d */
public class C43215d {
    /* renamed from: a */
    public static void m171785a(Context context) {
        Log.m165389i("WebProcessLifecycle", "afterOnCreate");
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mulprocess.C43215d.RunnableC432161 */

            public void run() {
                Log.m165389i("WebProcessLifecycle", "afterOnCreate syncTranslationSetting");
                C43853v.m173840a(C41816b.m166115a().mo150152s());
            }
        });
    }
}
