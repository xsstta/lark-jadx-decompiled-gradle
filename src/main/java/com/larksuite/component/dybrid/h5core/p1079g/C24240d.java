package com.larksuite.component.dybrid.h5core.p1079g;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24159b;
import com.larksuite.component.dybrid.h5api.api.AbstractC24161d;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.framework.utils.C26252ad;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.d */
public class C24240d implements AbstractC24169l {

    /* renamed from: a */
    private AbstractC24168k f59887a;

    /* renamed from: b */
    private AbstractC24159b f59888b;

    /* renamed from: c */
    private WebView f59889c;

    /* renamed from: d */
    private EnumC24243c f59890d = EnumC24243c.NONE;

    /* renamed from: e */
    private C24242b f59891e = new C24242b();

    /* renamed from: f */
    private EnumC24241a f59892f = EnumC24241a.BACK;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.dybrid.h5core.g.d$a */
    public enum EnumC24241a {
        POP,
        BACK
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.dybrid.h5core.g.d$c */
    public enum EnumC24243c {
        NONE,
        LOADING,
        READY,
        ERROR,
        FINISHED
    }

    /* renamed from: b */
    private void m88520b() {
        boolean z;
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z3 = false;
        if (this.f59890d != EnumC24243c.FINISHED || this.f59891e.f59894a) {
            z = false;
        } else {
            z = true;
        }
        if (currentTimeMillis - this.f59891e.f59895b > 500) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            z3 = true;
        }
        if (!z3) {
            C24174b.m88296a("H5PagePlugin", "send back event to bridge!");
            this.f59891e.f59894a = true;
            this.f59891e.f59895b = currentTimeMillis;
            this.f59888b.mo86726a("back", null, this.f59891e);
            return;
        }
        C24174b.m88296a("H5PagePlugin", "ignore bridge, perform back!");
        mo86869a();
    }

    /* renamed from: a */
    public void mo86869a() {
        C24174b.m88296a("H5PagePlugin", "perform back behavior " + this.f59892f);
        if (this.f59892f == EnumC24241a.POP) {
            this.f59887a.mo86736a("h5PageClose", null);
        } else if (this.f59892f == EnumC24241a.BACK) {
            WebView webView = this.f59889c;
            if (webView == null || !webView.canGoBack()) {
                C24174b.m88296a("H5PagePlugin", "webview can't go back and do exit!");
                this.f59887a.mo86736a("h5PageClose", null);
            } else if (this.f59889c.copyBackForwardList().getCurrentIndex() <= 0) {
                C24174b.m88296a("H5PagePlugin", "webview with no history and do exit!");
                this.f59887a.mo86736a("h5PageClose", null);
            } else {
                this.f59889c.goBack();
            }
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
        this.f59887a = null;
        this.f59888b = null;
        if (this.f59889c != null) {
            C24174b.m88296a("H5PagePlugin", " h5WebView.isActivated():" + this.f59889c.isActivated());
        }
        WebView webView = this.f59889c;
        if (webView != null && webView.isActivated()) {
            this.f59889c.destroy();
            this.f59889c = null;
        }
        this.f59891e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.dybrid.h5core.g.d$b */
    public class C24242b implements AbstractC24161d {

        /* renamed from: a */
        public boolean f59894a;

        /* renamed from: b */
        public long f59895b;

        public C24242b() {
        }

        @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24161d
        /* renamed from: a */
        public void mo86730a(JSONObject jSONObject) {
            this.f59894a = false;
            boolean a = C24246a.m88564a(jSONObject, "prevent", false);
            C24174b.m88296a("H5PagePlugin", "back event prevent " + a);
            if (!a) {
                C24240d.this.mo86869a();
            }
        }
    }

    /* renamed from: e */
    private void m88523e(H5Event h5Event) {
        String a = C24246a.m88559a(h5Event.mo86710d(), "url");
        if (TextUtils.isEmpty(a)) {
            C24174b.m88298b("h5_url_isnull");
        } else {
            this.f59889c.loadUrl(a);
        }
    }

    public C24240d(AbstractC24168k kVar) {
        this.f59887a = kVar;
        this.f59888b = kVar.mo86755h();
        this.f59889c = kVar.mo86758k();
    }

    /* renamed from: d */
    private void m88522d(H5Event h5Event) {
        JSONObject d = h5Event.mo86710d();
        if (d != null) {
            String a = C24246a.m88559a(d, "h5_action_on_result_param");
            if (!TextUtils.isEmpty(a)) {
                this.f59887a.mo86754g().mo86744c().mo86742a("h5_session_pop_param", a);
            }
        }
    }

    /* renamed from: f */
    private void m88524f(H5Event h5Event) {
        if (this.f59888b != null) {
            String b = this.f59887a.mo86754g().mo86744c().mo86743b("h5_session_pop_param");
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(b)) {
                jSONObject = C24246a.m88567c(b);
            }
            this.f59888b.mo86726a("onShow", jSONObject, null);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        JSONObject d = h5Event.mo86710d();
        if ("h5PageError".equals(b)) {
            this.f59890d = EnumC24243c.ERROR;
            return false;
        } else if (!"h5ExtEvent".equals(b)) {
            return false;
        } else {
            this.f59888b.mo86725a(new H5Event.C24156a().mo86716a(C24246a.m88559a(d, "clientId")).mo86717a(d).mo86718a());
            return true;
        }
    }

    /* renamed from: c */
    private void m88521c(H5Event h5Event) {
        try {
            if (h5Event.mo86712f() == null && this.f59887a.mo86752e() != null) {
                Message obtain = Message.obtain((Handler) null, 202);
                JSONObject jSONObject = new JSONObject();
                Bundle l = ((AbstractC24168k) h5Event.mo86711e()).mo86759l();
                if (l.containsKey("ipcParams")) {
                    jSONObject = new JSONObject(l.getString("ipcParams"));
                }
                jSONObject.put("eventName", h5Event.mo86707b());
                jSONObject.put("eventData", h5Event.mo86710d());
                l.putString("ipcParams", jSONObject.toString());
                obtain.setData(l);
                C24174b.m88296a("H5PagePlugin", "sent event to H5Container!!  ipcParams:" + jSONObject.toString());
                try {
                    this.f59887a.mo86752e().send(obtain);
                } catch (RemoteException e) {
                    C24174b.m88297a("H5PagePlugin", "RemoteException", e);
                }
            }
        } catch (JSONException e2) {
            C24174b.m88297a("H5PagePlugin", "JSONException", e2);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("h5PageStarted");
        aVar.mo86723a("h5PageFinished");
        aVar.mo86723a("h5PageClose");
        aVar.mo86723a("h5PageResume");
        aVar.mo86723a("h5PageActivityOnResult");
        aVar.mo86723a("h5PageClosed");
        aVar.mo86723a("h5PageLoadUrl");
        aVar.mo86723a("h5PageBack");
        aVar.mo86723a("h5PageError");
        aVar.mo86723a("h5PageDoLoadUrl");
        aVar.mo86723a("h5PageReceivedTitle");
        aVar.mo86723a("h5PageBackBehavior");
        aVar.mo86723a("h5PageCreated");
        aVar.mo86723a("h5PagePhysicalBack");
        aVar.mo86723a("h5ExtEvent");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        JSONObject d = h5Event.mo86710d();
        m88521c(h5Event);
        if ("h5PageBackBehavior".equals(b)) {
            String a = C24246a.m88559a(d, "backBehavior");
            if ("pop".equals(a)) {
                this.f59892f = EnumC24241a.POP;
                return true;
            } else if (!"back".equals(a)) {
                return true;
            } else {
                this.f59892f = EnumC24241a.BACK;
                return true;
            }
        } else if ("h5PageStarted".equals(b)) {
            this.f59890d = EnumC24243c.LOADING;
            return true;
        } else if ("h5PageFinished".equals(b)) {
            if (this.f59890d != EnumC24243c.READY && this.f59890d != EnumC24243c.LOADING) {
                return true;
            }
            this.f59890d = EnumC24243c.FINISHED;
            return true;
        } else if ("h5PageReceivedTitle".equals(b)) {
            if (this.f59890d != EnumC24243c.LOADING) {
                return true;
            }
            this.f59890d = EnumC24243c.READY;
            return true;
        } else if ("h5PageClose".equals(b)) {
            C24174b.m88296a("H5PagePlugin", "H5_PAGE_CLOSE");
            this.f59887a.mo86756i();
            return true;
        } else if ("h5PageCreated".equals(b)) {
            C24174b.m88296a("H5PagePlugin", "H5_PAGE_CREATED in " + C26252ad.m94993b(C24214b.m88460a()));
            return true;
        } else if ("h5PageResume".equals(b)) {
            C24174b.m88296a("H5PagePlugin", "h5_page_resume");
            m88524f(h5Event);
            return true;
        } else if ("h5PageLoadUrl".equals(b)) {
            if (TextUtils.isEmpty(this.f59889c.getUrl())) {
                this.f59887a.mo86736a("h5PageShouldLoadUrl", h5Event.mo86710d());
                return true;
            }
            m88523e(h5Event);
            return true;
        } else if ("h5PageDoLoadUrl".equals(b)) {
            String a2 = C24246a.m88559a(h5Event.mo86710d(), "url");
            String url = this.f59889c.getUrl();
            if (!TextUtils.isEmpty(url) && !url.equals(a2)) {
                return true;
            }
            m88523e(h5Event);
            return true;
        } else if ("h5PageBack".equals(b)) {
            m88520b();
            return true;
        } else if ("h5PageActivityOnResult".equals(b)) {
            m88522d(h5Event);
            return true;
        } else if (!"h5PagePhysicalBack".equals(b)) {
            return true;
        } else {
            this.f59887a.mo86736a("h5PageBack", null);
            return true;
        }
    }
}
