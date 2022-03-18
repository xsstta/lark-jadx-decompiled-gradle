package androidx.webkit;

import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class WebViewFeature {

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewSupportFeature {
    }

    /* renamed from: a */
    public static boolean m7324a(String str) {
        return WebViewFeatureInternal.isSupported(str);
    }
}
