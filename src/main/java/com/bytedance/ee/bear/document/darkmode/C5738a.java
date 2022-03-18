package com.bytedance.ee.bear.document.darkmode;

import androidx.appcompat.app.AppCompatDelegate;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.contract.darkmode.AbstractC5128c;
import com.bytedance.ee.bear.contract.darkmode.BinderIDarkModeChangedListener;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.document.darkmode.a */
public class C5738a extends C4918a {

    /* renamed from: b */
    private static final String f16193b = String.format("{\"%s\":\"%s\"}", "theme", "light");

    /* renamed from: c */
    private static final String f16194c = String.format("{\"%s\":\"%s\"}", "theme", "dark");

    /* renamed from: a */
    public C5739a f16195a;

    /* renamed from: d */
    private BinderIDarkModeChangedListener.Stub f16196d = new DarkModeWebService$1(this);

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.darkmode.a$a */
    public static class C5739a implements AbstractC7945d {

        /* renamed from: a */
        public AbstractC7947h f16197a;

        private C5739a() {
        }

        /* synthetic */ C5739a(DarkModeWebService$1 darkModeWebService$1) {
            this();
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public void handle(Object obj, AbstractC7947h hVar) {
            if (hVar == null) {
                C13479a.m54758a("JSDarkModeHandler", "JSDarkModeHandler handle, callback is null");
                return;
            }
            this.f16197a = hVar;
            JSONObject parseObject = JSONObject.parseObject(C5738a.m23205a(AppCompatDelegate.m732l()));
            C13479a.m54772d("JSDarkModeHandler", "DarkModeWebService handle callback = " + parseObject);
            hVar.mo17188a(parseObject);
        }
    }

    /* renamed from: d */
    private void m23212d() {
        new C10917c(new C10929e()).mo41508c(AbstractC5128c.class).mo237985a(C11678b.m48480d()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.darkmode.$$Lambda$a$9GLRhCBaO2rGL2JFFmJoAdIFa0U */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5738a.this.m23208b((AbstractC5128c) obj);
            }
        }).mo238001b($$Lambda$a$gbEDE8PxaPAaN8ae_Q5kNMFSEqk.INSTANCE, $$Lambda$a$Q233pRNoWKUrzMDg4TqmWnoCk4o.INSTANCE);
    }

    /* renamed from: e */
    private void m23213e() {
        new C10917c(new C10929e()).mo41508c(AbstractC5128c.class).mo237985a(C11678b.m48480d()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.document.darkmode.$$Lambda$a$X6Cl4D6hv4evNo1DPVVD3w36hs */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C5738a.this.m23206a((AbstractC5128c) obj);
            }
        }).mo238001b($$Lambda$a$1LHd_NB7zcl40Clgl2yNKx6L1SU.INSTANCE, $$Lambda$a$SZpDuaFDhoFIdLH5MwCZPZpzIKU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m23206a(AbstractC5128c cVar) throws Exception {
        cVar.removeDarkModeListener(this.f16196d);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ String m23208b(AbstractC5128c cVar) throws Exception {
        cVar.addDarkModeListener(this.f16196d);
        return "";
    }

    /* renamed from: a */
    public static String m23205a(int i) {
        if (i == 1) {
            return f16193b;
        }
        if (i == 2) {
            return f16194c;
        }
        if (UDUiModeUtils.m93319a(C13615c.f35773a)) {
            return f16194c;
        }
        return f16193b;
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19341a(AbstractC4931i iVar) {
        super.mo19341a(iVar);
        this.f16195a = null;
        m23213e();
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        m23212d();
        C5739a aVar = new C5739a(null);
        this.f16195a = aVar;
        mo19344a("biz.util.theme", aVar);
    }
}
