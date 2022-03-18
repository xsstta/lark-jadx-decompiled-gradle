package com.lynx.tasm.component;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.component.AbstractC26876a;
import java.lang.ref.WeakReference;

public final class DynamicComponentLoader {

    /* renamed from: a */
    public WeakReference<LynxTemplateRender> f66722a;

    /* renamed from: b */
    private AbstractC26876a f66723b;

    public native void nativeLoadComponent(long j, String str, byte[] bArr, boolean z);

    public DynamicComponentLoader(AbstractC26876a aVar, LynxTemplateRender lynxTemplateRender) {
        this.f66723b = aVar;
        this.f66722a = new WeakReference<>(lynxTemplateRender);
    }

    /* access modifiers changed from: package-private */
    public void requireTemplate(final String str, final long j) {
        AbstractC26876a aVar = this.f66723b;
        if (aVar != null) {
            final boolean[] zArr = {true};
            aVar.mo95659a(str, new AbstractC26876a.AbstractC26877a() {
                /* class com.lynx.tasm.component.DynamicComponentLoader.C268751 */
            });
            zArr[0] = false;
        }
    }
}
