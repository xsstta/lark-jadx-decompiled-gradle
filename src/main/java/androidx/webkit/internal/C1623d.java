package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.p3510a.C70015a;

/* renamed from: androidx.webkit.internal.d */
public class C1623d extends WebResourceErrorCompat {

    /* renamed from: a */
    private WebResourceError f5604a;

    /* renamed from: b */
    private WebResourceErrorBoundaryInterface f5605b;

    /* renamed from: a */
    private WebResourceError m7331a() {
        if (this.f5604a == null) {
            this.f5604a = C1625f.m7336b().mo8388a(Proxy.getInvocationHandler(this.f5605b));
        }
        return this.f5604a;
    }

    /* renamed from: b */
    private WebResourceErrorBoundaryInterface m7332b() {
        if (this.f5605b == null) {
            this.f5605b = (WebResourceErrorBoundaryInterface) C70015a.m268593a(WebResourceErrorBoundaryInterface.class, C1625f.m7336b().mo8391a(this.f5604a));
        }
        return this.f5605b;
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public CharSequence getDescription() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return m7331a().getDescription();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return m7332b().getDescription();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return m7331a().getErrorCode();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return m7332b().getErrorCode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public C1623d(WebResourceError webResourceError) {
        this.f5604a = webResourceError;
    }

    public C1623d(InvocationHandler invocationHandler) {
        this.f5605b = (WebResourceErrorBoundaryInterface) C70015a.m268593a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }
}
