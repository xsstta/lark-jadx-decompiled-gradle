package com.bytedance.ee.bear.wiki.homepage;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.b */
public class C11970b {
    /* renamed from: a */
    static boolean m49572a() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki_new_mindnote", false);
        C13479a.m54764b("WikiFGHelper", "isEnableWikiMindnote:" + b);
        return b;
    }

    /* renamed from: b */
    static boolean m49574b() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false);
        C13479a.m54764b("WikiFGHelper", "isEnableWikiOpenDocx:" + b);
        return b;
    }

    /* renamed from: c */
    static boolean m49575c() {
        boolean b = C4211a.m17514a().mo16538b("ccm.wiki.mobile.docx_create_enable", false);
        C13479a.m54764b("WikiFGHelper", "isWikiEnableDocxCreate:" + b);
        return b;
    }

    /* renamed from: d */
    static boolean m49576d() {
        boolean b = C4211a.m17514a().mo16538b("ccm.wiki.mobile.doc1.0_create_disable", false);
        C13479a.m54764b("WikiFGHelper", "isWikiDocDisable:" + b);
        return b;
    }

    /* renamed from: a */
    public static boolean m49573a(C10917c cVar, int i) {
        if (C8275a.f22371d.mo32555b() == i || C8275a.f22372e.mo32555b() == i) {
            return true;
        }
        if (C8275a.f22378k.mo32555b() == i && m49574b()) {
            return true;
        }
        if (C8275a.f22374g.mo32555b() == i) {
            return m49572a();
        }
        return false;
    }
}
