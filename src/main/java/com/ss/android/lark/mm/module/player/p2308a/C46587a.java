package com.ss.android.lark.mm.module.player.p2308a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.lark.mm.depend.C45899c;

/* renamed from: com.ss.android.lark.mm.module.player.a.a */
public class C46587a {

    /* renamed from: a */
    private static Handler f117234a = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.lark.mm.module.player.p2308a.C46587a.HandlerC465881 */

        public void handleMessage(Message message) {
            C45899c.m181859a().getSpDependency().mo144579a(C46587a.m184218c((String) message.obj), message.arg1);
        }
    };

    /* renamed from: b */
    public static int m184217b(String str) {
        return Math.max(1, m184214a(str));
    }

    /* renamed from: a */
    public static int m184214a(String str) {
        return C45899c.m181859a().getSpDependency().mo144577a(m184218c(str));
    }

    /* renamed from: c */
    public static String m184218c(String str) {
        String a = C45899c.m181859a().getLoginDepend().mo144647a();
        if (a == null) {
            a = "";
        }
        return a + "-" + str;
    }

    /* renamed from: a */
    public static void m184215a(String str, int i) {
        m184216a(str, i, false);
    }

    /* renamed from: a */
    public static void m184216a(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            f117234a.removeMessages(str.hashCode());
            C45899c.m181859a().getSpDependency().mo144579a(m184218c(str), i);
            return;
        }
        int hashCode = str.hashCode();
        Message obtain = Message.obtain();
        obtain.what = hashCode;
        obtain.obj = str;
        obtain.arg1 = i;
        f117234a.removeMessages(obtain.what);
        f117234a.sendMessageDelayed(obtain, 500);
    }
}
