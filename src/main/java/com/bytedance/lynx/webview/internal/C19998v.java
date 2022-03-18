package com.bytedance.lynx.webview.internal;

import com.bytedance.lynx.webview.glue.ISdkToGlue;
import com.bytedance.lynx.webview.glue.TTWebProviderWrapper;

/* renamed from: com.bytedance.lynx.webview.internal.v */
public class C19998v {
    /* renamed from: c */
    private ISdkToGlue m72956c() {
        return C20011y.m72976a().mo67902F().mo67781e();
    }

    /* renamed from: a */
    public boolean mo67878a() {
        m72955b();
        ISdkToGlue c = m72956c();
        if (c != null) {
            return c.isAdblockEnable();
        }
        return false;
    }

    /* renamed from: b */
    private void m72955b() {
        TTWebProviderWrapper f = C20011y.m72976a().mo67902F().mo67783f();
        if (f != null) {
            f.ensureFactoryProviderCreated(false);
        }
    }

    /* renamed from: a */
    public boolean mo67880a(boolean z) {
        m72955b();
        ISdkToGlue c = m72956c();
        if (c != null) {
            return c.setAdblockEnable(z);
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo67882b(String[] strArr, String[] strArr2) {
        m72955b();
        ISdkToGlue c = m72956c();
        if (c != null) {
            return c.setRustRulesPath(strArr, strArr2);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo67879a(String str, String str2) {
        m72955b();
        ISdkToGlue c = m72956c();
        if (c != null) {
            return c.setAdblockDeserializeFile(str, str2);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo67881a(String[] strArr, String[] strArr2) {
        m72955b();
        ISdkToGlue c = m72956c();
        if (c != null) {
            return c.setAdblockRulesPath(strArr, strArr2);
        }
        return false;
    }
}
