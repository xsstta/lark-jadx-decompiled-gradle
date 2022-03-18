package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.p3510a.C70015a;

/* renamed from: androidx.webkit.internal.h */
public class C1629h implements AbstractC1628g {

    /* renamed from: a */
    WebViewProviderFactoryBoundaryInterface f5609a;

    @Override // androidx.webkit.internal.AbstractC1628g
    /* renamed from: b */
    public String[] mo8385b() {
        return this.f5609a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.AbstractC1628g
    /* renamed from: a */
    public WebkitToCompatConverterBoundaryInterface mo8384a() {
        return (WebkitToCompatConverterBoundaryInterface) C70015a.m268593a(WebkitToCompatConverterBoundaryInterface.class, this.f5609a.getWebkitToCompatConverter());
    }

    public C1629h(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f5609a = webViewProviderFactoryBoundaryInterface;
    }
}
