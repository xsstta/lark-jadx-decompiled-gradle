package com.ss.android.lark.inv.export.router;

import android.content.Context;
import android.net.Uri;
import com.ss.android.lark.utils.ViewUtils;
import java.util.Map;

/* renamed from: com.ss.android.lark.inv.export.router.a */
public abstract class AbstractC40091a {

    /* renamed from: a */
    public String f101886a;

    /* renamed from: b */
    public String f101887b;

    /* renamed from: c */
    public String f101888c;

    /* renamed from: a */
    public abstract void mo145602a(Context context, Map<String, String> map);

    public String toString() {
        return "\nInvBasePath { routerPath: " + this.f101886a + ", appLinkPath: " + this.f101887b + ", dynamicRouterPath: " + this.f101888c + " }\n";
    }

    /* renamed from: a */
    public static Map<String, String> m158939a(String str) {
        return m158938a(Uri.parse(str));
    }

    public AbstractC40091a(String str) {
        this(str, "/client" + str, "//client" + str);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (r3.equals("/invite/external/search") != false) goto L_0x00a4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m158938a(android.net.Uri r10) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.inv.export.router.AbstractC40091a.m158938a(android.net.Uri):java.util.Map");
    }

    /* renamed from: b */
    public void mo145603b(final Context context, final Map<String, String> map) {
        ViewUtils.m224148a(new Runnable() {
            /* class com.ss.android.lark.inv.export.router.AbstractC40091a.RunnableC400921 */

            public void run() {
                AbstractC40091a.this.mo145602a(context, map);
            }
        });
    }

    public AbstractC40091a(String str, String str2, String str3) {
        this.f101886a = str;
        this.f101887b = str2;
        this.f101888c = str3;
    }
}
