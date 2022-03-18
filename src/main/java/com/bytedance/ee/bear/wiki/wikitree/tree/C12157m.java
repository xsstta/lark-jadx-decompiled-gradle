package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12138g;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.m */
class C12157m implements AbstractC1178x<C12138g> {

    /* renamed from: a */
    private String f32728a = "Wiki_WikiListObserver";

    /* renamed from: b */
    private C12151j f32729b;

    /* renamed from: c */
    private AbstractC12143e f32730c;

    /* renamed from: b */
    private void m50501b(C12138g gVar) {
        C13479a.m54772d(this.f32728a, String.format("WikiListObserver.onChanged, wikiList: %s", gVar));
    }

    /* renamed from: c */
    private boolean m50502c(C12138g gVar) {
        if (gVar == null || gVar.f32697b == 1001 || gVar.f32697b == 1002 || gVar.f32697b == 1003 || gVar.f32697b == 1004) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m50504e(C12138g gVar) {
        if (gVar.f32697b == 1008) {
            if (this.f32729b.mo46474l().mo46373b((String) gVar.mo46434a("MOV_TOKEN"), this.f32729b.mo46478u())) {
                this.f32729b.mo46475m().mo46574d(this.f32729b.mo46478u());
            }
        }
    }

    /* renamed from: f */
    private void m50505f(C12138g gVar) {
        int a = this.f32729b.mo46477n().mo46491a(gVar.f32697b, gVar.f32698c);
        if (a != -1 && ((C12164q) this.f32729b.mo46473k()).mo46352h()) {
            this.f32729b.mo46475m().mo46568b(a, 0);
        }
    }

    /* renamed from: g */
    private void m50506g(C12138g gVar) {
        int a = this.f32729b.mo46477n().mo46490a(gVar.f32697b);
        if (a != -1 && ((C12164q) this.f32729b.mo46473k()).mo46352h()) {
            this.f32729b.mo46475m().mo46558a(a);
        }
    }

    /* renamed from: h */
    private void m50507h(C12138g gVar) {
        int b = this.f32729b.mo46477n().mo46492b(gVar.f32697b);
        if (b != -1 && ((C12164q) this.f32729b.mo46473k()).mo46352h()) {
            this.f32729b.mo46475m().mo46559a(b, 0);
        }
    }

    /* renamed from: a */
    public void onChanged(C12138g gVar) {
        if (m50502c(gVar)) {
            m50501b(gVar);
            this.f32729b.mo46475m().mo46557a();
            switch (gVar.f32696a) {
                case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                    m50506g(gVar);
                    return;
                case 1002:
                    m50503d(gVar);
                    return;
                case 1003:
                    m50505f(gVar);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: d */
    private void m50503d(C12138g gVar) {
        boolean z;
        if (!C13657b.m55421a(gVar.f32700e) && ((C12164q) this.f32729b.mo46473k()).mo46352h()) {
            this.f32729b.mo46475m().mo46565a(gVar.f32700e);
            m50507h(gVar);
            m50504e(gVar);
        }
        if (TextUtils.isEmpty(this.f32729b.mo46478u()) || this.f32729b.mo46474l().mo46379e(this.f32729b.mo46478u())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f32729b.mo46476f(null);
        }
        int i = gVar.f32697b;
        if (i != 2002) {
            if (i != 2003) {
                switch (i) {
                    case 1005:
                        this.f32730c.mo46442a((String) gVar.mo46434a("ADD_TOKEN"));
                        return;
                    case 1006:
                        if (z) {
                            this.f32730c.mo46447b((String) gVar.mo46434a("DEL_PARENT_TOKEN"));
                            return;
                        }
                        return;
                    case 1007:
                        this.f32729b.mo46475m().mo46559a(R.string.Doc_Wiki_RemoveSuccess, 0);
                        this.f32730c.mo46451d();
                        return;
                    default:
                        switch (i) {
                            case 2005:
                                if (z) {
                                    this.f32730c.mo46454e((String) gVar.mo46434a("DEL_AREA_ROOT_PARENT_TOKEN"));
                                    return;
                                }
                                return;
                            case 2006:
                                this.f32730c.mo46452d((String) gVar.mo46434a("UDE_TOKEN"));
                                return;
                            case 2007:
                                if (z) {
                                    this.f32730c.mo46443a((String) gVar.mo46434a("DEL_AREA_ROOT_PARENT_TOKEN"), gVar.mo46435a("DEL_AREA_IS_FOCUS_HAS_PERM", false));
                                    return;
                                }
                                return;
                            case 2008:
                                this.f32730c.mo46444a(gVar.mo46435a("DEL_AREA_IS_FOCUS_AT_ROOT", false));
                                return;
                            default:
                                switch (i) {
                                    case 2010:
                                        this.f32729b.mo46475m().mo46567b(99);
                                        this.f32730c.mo46453e();
                                        return;
                                    case 2011:
                                        this.f32730c.mo46456g();
                                        return;
                                    case 2012:
                                        this.f32730c.mo46457h();
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
            } else {
                this.f32730c.mo46455f();
            }
        } else if (z) {
            this.f32730c.mo46450c((String) gVar.mo46434a("DEL_PARENT_TOKEN"));
        }
    }

    public C12157m(C12151j jVar, AbstractC12143e eVar, String str) {
        this.f32728a = String.format("%s_%s", "Wiki_WikiListObserver", str);
        this.f32729b = jVar;
        this.f32730c = eVar;
    }
}
