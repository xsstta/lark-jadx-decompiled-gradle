package com.bytedance.ee.bear.wikiv2.home;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.b */
public class C12267b {
    /* renamed from: a */
    public static boolean m51040a() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki2.0_space_classify_enable", false);
        C13479a.m54764b("WikiFGHelperV2", "isEnableSpaceClassify:" + b);
        return b;
    }

    /* renamed from: b */
    public static boolean m51042b() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki_new_mindnote", false);
        C13479a.m54764b("WikiFGHelperV2", "isEnableWikiMindnote:" + b);
        return b;
    }

    /* renamed from: c */
    public static boolean m51043c() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki_new_bitable", false);
        C13479a.m54764b("WikiFGHelperV2", "isEnableWikiBitable:" + b);
        return b;
    }

    /* renamed from: d */
    public static boolean m51044d() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki_new_file", false);
        C13479a.m54764b("WikiFGHelperV2", "isEnableWikiDrive:" + b);
        return b;
    }

    /* renamed from: e */
    public static boolean m51045e() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false);
        C13479a.m54764b("WikiFGHelperV2", "isEnableWikiDocx:" + b);
        return b;
    }

    /* renamed from: f */
    public static boolean m51046f() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki_new_docx", false);
        C13479a.m54764b("WikiFGHelperV2", "isEnableCreateWikiDocx:" + b);
        return b;
    }

    /* renamed from: g */
    public static boolean m51047g() {
        boolean b = C4211a.m17514a().mo16538b("ccm.wiki.mobile.doc1.0_create_disable", false);
        C13479a.m54764b("WikiFGHelperV2", "isWikiDocDisable:" + b);
        return b;
    }

    /* renamed from: a */
    public static boolean m51041a(C10917c cVar, int i) {
        if (C8275a.f22371d.mo32555b() == i || C8275a.f22372e.mo32555b() == i) {
            return true;
        }
        if (C8275a.f22374g.mo32555b() == i) {
            return m51042b();
        }
        if (C8275a.f22373f.mo32555b() == i) {
            return m51043c();
        }
        if (C8275a.f22375h.mo32555b() == i) {
            return m51044d();
        }
        if (C8275a.f22378k.mo32555b() == i) {
            return m51045e();
        }
        return false;
    }
}
