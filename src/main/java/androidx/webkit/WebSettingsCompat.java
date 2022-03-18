package androidx.webkit;

import android.webkit.WebSettings;
import androidx.webkit.internal.C1624e;
import androidx.webkit.internal.C1625f;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class WebSettingsCompat {

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    /* renamed from: a */
    private static C1624e m7321a(WebSettings webSettings) {
        return C1625f.m7336b().mo8389a(webSettings);
    }

    /* renamed from: a */
    public static void m7322a(WebSettings webSettings, int i) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.FORCE_DARK;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            webSettings.setForceDark(i);
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            m7321a(webSettings).mo8386a(i);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public static void m7323b(WebSettings webSettings, int i) {
        if (WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            m7321a(webSettings).mo8387b(i);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
