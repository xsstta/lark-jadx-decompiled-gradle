package com.lynx.tasm.base;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateData;
import java.util.Map;

/* renamed from: com.lynx.tasm.base.f */
public class C26618f {

    /* renamed from: a */
    private LynxTemplateRender f65883a;

    /* renamed from: b */
    private String f65884b;

    /* renamed from: c */
    private boolean f65885c;

    /* renamed from: d */
    private boolean f65886d;

    /* renamed from: e */
    private C26620a f65887e = new C26620a();

    /* renamed from: f */
    private C26621b f65888f = new C26621b();

    /* renamed from: com.lynx.tasm.base.f$a */
    private class C26620a {

        /* renamed from: a */
        public byte[] f65889a;

        /* renamed from: b */
        public String f65890b;

        /* renamed from: c */
        public TemplateData f65891c;

        private C26620a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.base.f$b */
    public class C26621b {

        /* renamed from: a */
        public String f65893a;

        /* renamed from: b */
        public TemplateData f65894b;

        private C26621b() {
        }
    }

    /* renamed from: a */
    public void mo94503a(TemplateData templateData) {
        this.f65887e.f65891c = templateData;
    }

    public C26618f(LynxTemplateRender lynxTemplateRender) {
        this.f65883a = lynxTemplateRender;
    }

    /* renamed from: a */
    public void mo94504a(String str, TemplateData templateData) {
        this.f65885c = false;
        this.f65886d = true;
        this.f65888f.f65893a = str;
        this.f65888f.f65894b = templateData;
        this.f65884b = str;
    }

    /* renamed from: a */
    public void mo94506a(byte[] bArr, TemplateData templateData, String str) {
        this.f65886d = false;
        this.f65885c = true;
        this.f65887e.f65889a = bArr;
        this.f65887e.f65890b = str;
        this.f65887e.f65891c = templateData;
        this.f65884b = str;
    }

    /* renamed from: a */
    public void mo94505a(String str, TemplateData templateData, Map<String, Object> map, String str2) {
        if (templateData != null) {
            mo94504a(str, templateData);
        } else if (map != null) {
            mo94504a(str, TemplateData.m96225a(map));
        } else if (str2 != null) {
            mo94504a(str, TemplateData.m96224a(str2));
        } else {
            mo94504a(str, null);
        }
    }
}
