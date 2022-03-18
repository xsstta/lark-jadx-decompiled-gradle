package com.bytedance.feelgood.p738d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.feelgood.p737c.C13925e;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.feelgood.d.d */
public class C13932d {

    /* renamed from: a */
    private WeakReference<Context> f36416a;

    /* renamed from: b */
    private boolean f36417b = true;

    /* renamed from: c */
    private boolean f36418c;

    /* renamed from: d */
    private boolean f36419d = true;

    /* renamed from: e */
    private boolean f36420e = true;

    /* renamed from: f */
    private boolean f36421f = true;

    /* renamed from: g */
    private boolean f36422g = true;

    /* renamed from: h */
    private boolean f36423h = true;

    /* renamed from: i */
    private boolean f36424i;

    /* renamed from: a */
    public static C13932d m56386a(Context context) {
        return new C13932d(context);
    }

    /* renamed from: a */
    private void m56387a(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 17) {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        }
    }

    /* renamed from: c */
    private void m56389c(WebView webView) {
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
    }

    private C13932d(Context context) {
        this.f36416a = new WeakReference<>(context);
    }

    /* renamed from: b */
    private void m56388b(WebView webView) {
        if (webView != null && webView.getSettings() != null) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (TextUtils.isEmpty(userAgentString)) {
                userAgentString = "Mozilla/5.0 (Linux; Android 10; Pixel 4 Build/QQ2A.200305.003; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/84.0.4147.125 Mobile Safari/537.36";
            }
            settings.setUserAgentString(userAgentString + " " + C13925e.m56367b());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:4|(1:6)|7|8|9|10|11|(1:13)(1:14)|17|(3:18|19|(4:24|(1:28)|31|(2:33|34)(1:36))(3:23|31|(0)(0)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51282a(android.webkit.WebView r6) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feelgood.p738d.C13932d.mo51282a(android.webkit.WebView):void");
    }
}
