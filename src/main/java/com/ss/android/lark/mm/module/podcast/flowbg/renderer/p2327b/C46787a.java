package com.ss.android.lark.mm.module.podcast.flowbg.renderer.p2327b;

import android.os.SystemClock;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.podcast.flowbg.renderer.b.a */
public class C46787a {

    /* renamed from: a */
    private static long f117755a;

    /* renamed from: b */
    private static int f117756b;

    /* renamed from: a */
    public static void m185412a() {
        double elapsedRealtime = ((double) (SystemClock.elapsedRealtime() - f117755a)) / 1000.0d;
        if (elapsedRealtime >= 1.0d) {
            C45855f.m181662a("Current FPS is ", (((double) f117756b) / elapsedRealtime) + "fps");
            f117755a = SystemClock.elapsedRealtime();
            f117756b = 0;
        }
        f117756b++;
    }
}
