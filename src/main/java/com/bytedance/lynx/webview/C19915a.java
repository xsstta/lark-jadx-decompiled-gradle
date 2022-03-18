package com.bytedance.lynx.webview;

import android.webkit.WebSettings;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.bytedance.lynx.webview.glue.ISdkToGlue;
import com.bytedance.lynx.webview.internal.C20011y;

/* renamed from: com.bytedance.lynx.webview.a */
public class C19915a {
    /* renamed from: a */
    public static boolean m72650a() {
        if (!TTWebSdk.isWebSdkInit() || !C20011y.m73013k()) {
            return WebViewFeature.m7324a("FORCE_DARK");
        }
        ISdkToGlue e = C20011y.m72976a().mo67902F().mo67781e();
        if (e != null) {
            return e.isDarkModeSupported();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m72652b() {
        if (!TTWebSdk.isWebSdkInit() || !C20011y.m73013k()) {
            return WebViewFeature.m7324a("FORCE_DARK_STRATEGY");
        }
        ISdkToGlue e = C20011y.m72976a().mo67902F().mo67781e();
        if (e != null) {
            return e.isDarkStrategySupported();
        }
        return false;
    }

    /* renamed from: a */
    public static void m72649a(WebSettings webSettings, int i) {
        if (m72650a()) {
            if (!TTWebSdk.isWebSdkInit() || !C20011y.m73013k()) {
                WebSettingsCompat.m7322a(webSettings, i);
                return;
            }
            ISdkToGlue e = C20011y.m72976a().mo67902F().mo67781e();
            if (e != null) {
                e.setForceDark(webSettings, i);
            }
        }
    }

    /* renamed from: b */
    public static void m72651b(WebSettings webSettings, int i) {
        if (m72652b()) {
            if (!TTWebSdk.isWebSdkInit() || !C20011y.m73013k()) {
                WebSettingsCompat.m7323b(webSettings, i);
                return;
            }
            ISdkToGlue e = C20011y.m72976a().mo67902F().mo67781e();
            if (e != null) {
                e.setForceDarkStrategy(webSettings, i);
            }
        }
    }
}
