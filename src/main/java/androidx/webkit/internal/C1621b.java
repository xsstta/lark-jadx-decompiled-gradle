package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: androidx.webkit.internal.b */
public class C1621b implements AbstractC1628g {

    /* renamed from: a */
    private static final String[] f5601a = new String[0];

    @Override // androidx.webkit.internal.AbstractC1628g
    /* renamed from: b */
    public String[] mo8385b() {
        return f5601a;
    }

    @Override // androidx.webkit.internal.AbstractC1628g
    /* renamed from: a */
    public WebkitToCompatConverterBoundaryInterface mo8384a() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
