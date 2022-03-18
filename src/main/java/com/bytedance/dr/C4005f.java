package com.bytedance.dr;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.bytedance.dr.f */
final class C4005f {
    /* renamed from: a */
    public static Thread m16667a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: com.bytedance.dr.f$a */
    private static class RunnableC4006a implements Runnable {

        /* renamed from: a */
        private final Runnable f12155a;

        /* renamed from: b */
        private final String f12156b;

        /* renamed from: c */
        private final String f12157c = Log.getStackTraceString(new RuntimeException("origin stacktrace"));

        public void run() {
            try {
                this.f12155a.run();
            } catch (Exception e) {
                e.printStackTrace();
                C4002d.m16662b("TrackerDr", "Thread:" + this.f12156b + " exception\n" + this.f12157c, e);
            }
        }

        RunnableC4006a(Runnable runnable, String str) {
            this.f12155a = runnable;
            this.f12156b = str;
        }
    }

    /* renamed from: a */
    static boolean m16669a(Context context, String str) {
        try {
            if (context.getPackageManager().getPackageInfo(str, SmActions.ACTION_ONTHECALL_EXIT) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static void m16668a(String str, Runnable runnable) {
        if (runnable != null) {
            if (TextUtils.isEmpty(str)) {
                str = "TrackerDr";
            }
            m16667a(new Thread(new RunnableC4006a(runnable, str), str)).start();
        }
    }
}
