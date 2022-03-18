package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.p3510a.C70015a;

/* renamed from: androidx.webkit.internal.i */
public class C1630i {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f5610a;

    public C1630i(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f5610a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public InvocationHandler mo8390a(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f5610a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    /* renamed from: a */
    public WebResourceError mo8388a(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f5610a.convertWebResourceError(invocationHandler);
    }

    /* renamed from: b */
    public SafeBrowsingResponse mo8392b(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f5610a.convertSafeBrowsingResponse(invocationHandler);
    }

    /* renamed from: a */
    public C1624e mo8389a(WebSettings webSettings) {
        return new C1624e((WebSettingsBoundaryInterface) C70015a.m268593a(WebSettingsBoundaryInterface.class, this.f5610a.convertSettings(webSettings)));
    }

    /* renamed from: a */
    public InvocationHandler mo8391a(WebResourceError webResourceError) {
        return this.f5610a.convertWebResourceError(webResourceError);
    }
}
