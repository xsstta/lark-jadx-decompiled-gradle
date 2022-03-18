package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: androidx.webkit.internal.e */
public class C1624e {

    /* renamed from: a */
    private WebSettingsBoundaryInterface f5606a;

    public C1624e(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f5606a = webSettingsBoundaryInterface;
    }

    /* renamed from: a */
    public void mo8386a(int i) {
        this.f5606a.setForceDark(i);
    }

    /* renamed from: b */
    public void mo8387b(int i) {
        this.f5606a.setForceDarkBehavior(i);
    }
}
