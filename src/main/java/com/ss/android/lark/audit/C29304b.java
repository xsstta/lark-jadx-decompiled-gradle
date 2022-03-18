package com.ss.android.lark.audit;

import android.content.Context;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.auth.C29299c;
import com.ss.android.lark.audit.db.C29313b;
import com.ss.android.lark.audit.model.AuditEvent;
import com.ss.android.lark.audit.p1377a.C29288e;
import com.ss.android.lark.log.Log;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.audit.b */
public class C29304b {

    /* renamed from: e */
    private static boolean f73345e;

    /* renamed from: a */
    private Context f73346a;

    /* renamed from: b */
    private C29308d f73347b;

    /* renamed from: c */
    private AbstractC29324f f73348c;

    /* renamed from: d */
    private AuthorizationManager f73349d;

    /* renamed from: com.ss.android.lark.audit.b$a */
    private static class C29305a {

        /* renamed from: a */
        public static C29304b f73350a = new C29304b();
    }

    /* renamed from: com.ss.android.lark.audit.b$b */
    public static class C29306b implements AbstractC29324f {
        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ AbstractC29324f.AbstractC29326b mo103859a(Context context) {
            return AbstractC29324f.CC.$default$a(this, context);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public String mo103860a() {
            return "";
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ String mo103861a(String str) {
            return AbstractC29324f.CC.$default$a(this, str);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ void mo103862a(AbstractC29324f.AbstractC29327c cVar) {
            AbstractC29324f.CC.$default$a(this, cVar);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ void mo103863a(AbstractC29324f.AbstractC29328d dVar) {
            AbstractC29324f.CC.$default$a(this, dVar);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ void mo103864a(AbstractC29324f.AbstractC29329e eVar) {
            AbstractC29324f.CC.$default$a(this, eVar);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ void mo103865a(String str, String str2, AbstractC29324f.AbstractC29330f fVar) {
            AbstractC29324f.CC.$default$a(this, str, str2, fVar);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ void mo103866a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            AbstractC29324f.CC.$default$a(this, str, jSONObject, jSONObject2, jSONObject3);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: a */
        public /* synthetic */ boolean mo103867a(String str, boolean z) {
            return AbstractC29324f.CC.$default$a(this, str, z);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: b */
        public /* synthetic */ AbstractC29324f.AbstractC29325a mo103868b(Context context) {
            return AbstractC29324f.CC.$default$b(this, context);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: b */
        public String mo103869b() {
            return "mock session";
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: c */
        public /* synthetic */ boolean mo103870c() {
            return AbstractC29324f.CC.$default$c(this);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: d */
        public /* synthetic */ String mo103871d() {
            return AbstractC29324f.CC.$default$d(this);
        }

        @Override // com.ss.android.lark.audit.AbstractC29324f
        /* renamed from: e */
        public /* synthetic */ int mo103872e() {
            return AbstractC29324f.CC.$default$e(this);
        }
    }

    /* renamed from: a */
    public static C29304b m107713a() {
        return C29305a.f73350a;
    }

    /* renamed from: b */
    public static boolean m107714b() {
        return f73345e;
    }

    /* renamed from: c */
    public Context mo103857c() {
        return this.f73346a;
    }

    /* renamed from: d */
    public AbstractC29324f mo103858d() {
        AbstractC29324f fVar = this.f73348c;
        if (fVar != null) {
            return fVar;
        }
        return new C29306b();
    }

    /* renamed from: a */
    public void mo103855a(AuditEvent auditEvent) {
        C29308d dVar;
        if (m107714b() && (dVar = this.f73347b) != null) {
            dVar.mo103877a(auditEvent);
        }
    }

    /* renamed from: a */
    public int mo103852a(int i) {
        AuthorizationManager authorizationManager = this.f73349d;
        if (authorizationManager != null) {
            return authorizationManager.mo103792a(i);
        }
        Log.m165383e("AuditManager", "[checkAuthority 1] mAuthorizationManager is null");
        return 3;
    }

    /* renamed from: a */
    public void mo103856a(boolean z) {
        AuthorizationManager authorizationManager = this.f73349d;
        if (authorizationManager == null) {
            Log.m165383e("AuditManager", "[onAppStateChanged] mAuthorizationManager is null");
        } else {
            authorizationManager.mo103795a(z);
        }
    }

    /* renamed from: a */
    public void mo103854a(Context context, AbstractC29324f fVar) {
        try {
            if (!f73345e) {
                Context applicationContext = context.getApplicationContext();
                this.f73346a = applicationContext;
                this.f73348c = fVar;
                if (C26252ad.m94993b(applicationContext)) {
                    C29313b.m107749a().mo103891a(this.f73346a);
                }
                this.f73347b = new C29308d(this.f73348c);
                C29288e.m107657a().mo103809a(this.f73348c);
                if (this.f73348c.mo103867a("lark.security.audit.permission", true)) {
                    if (C26252ad.m94993b(this.f73346a)) {
                        C29299c.m107708a().mo103845a(this.f73346a);
                    }
                    this.f73349d = new AuthorizationManager(context, fVar);
                }
                f73345e = true;
            }
        } catch (Throwable th) {
            Log.m165384e("AuditManager", "init failed", th);
        }
    }

    /* renamed from: a */
    public int mo103853a(int i, int i2, String str) {
        AuthorizationManager authorizationManager = this.f73349d;
        if (authorizationManager != null) {
            return authorizationManager.mo103793a(i, i2, str);
        }
        Log.m165383e("AuditManager", "[checkAuthority 3] mAuthorizationManager is null");
        return 3;
    }
}
