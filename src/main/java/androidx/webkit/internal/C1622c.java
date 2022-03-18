package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.AbstractC1618a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.p3510a.C70015a;

/* renamed from: androidx.webkit.internal.c */
public class C1622c extends AbstractC1618a {

    /* renamed from: a */
    private SafeBrowsingResponse f5602a;

    /* renamed from: b */
    private SafeBrowsingResponseBoundaryInterface f5603b;

    /* renamed from: a */
    private SafeBrowsingResponse m7328a() {
        if (this.f5602a == null) {
            this.f5602a = C1625f.m7336b().mo8392b(Proxy.getInvocationHandler(this.f5603b));
        }
        return this.f5602a;
    }

    /* renamed from: b */
    private SafeBrowsingResponseBoundaryInterface m7329b() {
        if (this.f5603b == null) {
            this.f5603b = (SafeBrowsingResponseBoundaryInterface) C70015a.m268593a(SafeBrowsingResponseBoundaryInterface.class, C1625f.m7336b().mo8390a(this.f5602a));
        }
        return this.f5603b;
    }

    public C1622c(SafeBrowsingResponse safeBrowsingResponse) {
        this.f5602a = safeBrowsingResponse;
    }

    public C1622c(InvocationHandler invocationHandler) {
        this.f5603b = (SafeBrowsingResponseBoundaryInterface) C70015a.m268593a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @Override // androidx.webkit.AbstractC1618a
    /* renamed from: a */
    public void mo8379a(boolean z) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            m7328a().showInterstitial(z);
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            m7329b().showInterstitial(z);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
