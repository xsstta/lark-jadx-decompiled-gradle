package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import java.util.HashSet;
import java.util.Set;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.r */
public class C8677r {

    /* renamed from: a */
    private static volatile C8677r f23486a;

    /* renamed from: b */
    private Set<Integer> f23487b;

    /* renamed from: c */
    private boolean f23488c = true;

    private C8677r() {
        m36259c();
    }

    /* renamed from: b */
    public void mo33683b() {
        this.f23487b.clear();
        m36259c();
    }

    /* renamed from: a */
    public static C8677r m36258a() {
        if (f23486a == null) {
            synchronized (C8677r.class) {
                if (f23486a == null) {
                    f23486a = new C8677r();
                }
            }
        }
        return f23486a;
    }

    /* renamed from: c */
    private void m36259c() {
        HashSet hashSet = new HashSet();
        this.f23487b = hashSet;
        hashSet.add(4);
        this.f23487b.add(6);
        this.f23487b.add(Integer.valueOf(C8275a.f22370c.mo32555b()));
        this.f23487b.add(Integer.valueOf(C8275a.f22371d.mo32555b()));
        this.f23487b.add(Integer.valueOf(C8275a.f22372e.mo32555b()));
        this.f23487b.add(Integer.valueOf(C8275a.f22375h.mo32555b()));
        if (!((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e() || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
            this.f23487b.add(Integer.valueOf(C8275a.f22373f.mo32555b()));
        }
        if (C8292f.m34174b()) {
            this.f23487b.add(Integer.valueOf(C8275a.f22374g.mo32555b()));
        }
        if (C4211a.m17514a().mo16536a("spacekit.mobile.slide_enabled", false)) {
            this.f23487b.add(Integer.valueOf(C8275a.f22376i.mo32555b()));
        }
        if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21068b() || ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
            this.f23487b.add(Integer.valueOf(C8275a.f22377j.mo32555b()));
        }
        if (C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false)) {
            this.f23487b.add(Integer.valueOf(C8275a.f22378k.mo32555b()));
        }
        this.f23488c = C4211a.m17514a().mo16536a("space.mobile.hide_unknown_type_in_list", true);
        C13479a.m54764b("SpaceWhiteList", "init()...mWhiteListEnable = " + this.f23488c + ", mWhiteList = " + this.f23487b);
    }

    /* renamed from: a */
    public boolean mo33682a(int i) {
        if (this.f23488c) {
            return this.f23487b.contains(Integer.valueOf(i));
        }
        if (i == C8275a.f22373f.mo32555b()) {
            if (!((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e() || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
                return true;
            }
            return false;
        } else if (i == C8275a.f22374g.mo32555b()) {
            return C8292f.m34174b();
        } else {
            if (i == C8275a.f22376i.mo32555b()) {
                return C4211a.m17514a().mo16536a("spacekit.mobile.slide_enabled", false);
            }
            if (i == C8275a.f22377j.mo32555b()) {
                return ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21068b();
            }
            if (i == C8275a.f22378k.mo32555b()) {
                return C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false);
            }
            return true;
        }
    }
}
