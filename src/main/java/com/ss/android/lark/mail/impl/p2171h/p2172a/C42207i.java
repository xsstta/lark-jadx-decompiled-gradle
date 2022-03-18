package com.ss.android.lark.mail.impl.p2171h.p2172a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.h.a.i */
public class C42207i {

    /* renamed from: a */
    public static Map<String, Runnable> f107476a = new HashMap();

    /* renamed from: b */
    private static Handler f107477b = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static String m168609b(int i, String str) {
        return i + str;
    }

    /* renamed from: a */
    public static void m168607a(int i, String str) {
        switch (i) {
            case 202105241:
            case 202105242:
                Runnable runnable = f107476a.get(m168609b(i, str));
                if (runnable != null) {
                    f107477b.removeCallbacks(runnable);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m168608a(int i, String str, long j) {
        if (TextUtils.isEmpty(str)) {
            Log.m165397w("InteractionErrorCollector", "postErrorReport invalid key");
            return;
        }
        switch (i) {
            case 202105241:
            case 202105242:
                final String b = m168609b(i, str);
                RunnableC422081 r2 = new Runnable() {
                    /* class com.ss.android.lark.mail.impl.p2171h.p2172a.C42207i.RunnableC422081 */

                    public void run() {
                        C42209j.m168610a("mark_as_read_fail");
                        C42207i.f107476a.remove(b);
                    }
                };
                f107476a.put(b, r2);
                f107477b.postDelayed(r2, j);
                return;
            default:
                return;
        }
    }
}
