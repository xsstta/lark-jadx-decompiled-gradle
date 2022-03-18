package com.lynx.tasm.core;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.provider.AbstractC26939f;
import com.lynx.tasm.provider.AbstractC26940g;
import com.lynx.tasm.provider.C26941h;
import java.lang.ref.WeakReference;

public class ExternalSourceLoader {

    /* renamed from: a */
    public final WeakReference<LynxTemplateRender> f66728a;

    /* renamed from: b */
    private final AbstractC26940g f66729b;

    private String loadExternalSource(String str) {
        C26941h hVar = new C26941h(str);
        final String[] strArr = new String[1];
        this.f66729b.mo95798a(hVar, new AbstractC26939f() {
            /* class com.lynx.tasm.core.ExternalSourceLoader.C268781 */
        });
        return strArr[0];
    }

    public ExternalSourceLoader(AbstractC26940g gVar, LynxTemplateRender lynxTemplateRender) {
        this.f66729b = gVar;
        this.f66728a = new WeakReference<>(lynxTemplateRender);
    }
}
