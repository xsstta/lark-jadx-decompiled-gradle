package com.larksuite.component.dybrid.h5core.p1072a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.larksuite.component.dybrid.h5api.api.AbstractC24159b;
import com.larksuite.component.dybrid.h5api.api.AbstractC24161d;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.a.a */
public class C24183a implements AbstractC24159b {

    /* renamed from: a */
    public WebView f59783a;

    /* renamed from: b */
    private Map<String, AbstractC24161d> f59784b;

    /* renamed from: c */
    private boolean f59785c;

    /* renamed from: d */
    private boolean f59786d;

    /* renamed from: e */
    private final Object f59787e = new Object();

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24159b
    /* renamed from: b */
    public void mo86727b() {
        this.f59786d = false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24159b
    /* renamed from: c */
    public void mo86728c() {
        this.f59783a = null;
        this.f59785c = true;
        this.f59784b.clear();
        this.f59784b = null;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24159b
    /* renamed from: a */
    public void mo86724a() {
        if (this.f59783a == null) {
            C24174b.m88296a("H5BridgeImpl", "inspectDispatchNativeEvent, WebView == null");
        } else if (!this.f59786d) {
            synchronized (this.f59787e) {
                if (!this.f59786d) {
                    try {
                        WebView webView = this.f59783a;
                        webView.loadUrl("javascript:" + C24246a.m88554a((int) R.raw.dybrid_bridge, this.f59783a.getContext()));
                        this.f59786d = true;
                    } catch (Exception e) {
                        C24174b.m88297a("H5BridgeImpl", ApiHandler.API_CALLBACK_EXCEPTION, e);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m88322d(final H5Event h5Event) {
        C24246a.m88563a((Runnable) new Runnable() {
            /* class com.larksuite.component.dybrid.h5core.p1072a.C24183a.RunnableC241852 */

            public void run() {
                C24183a.this.mo86781c(h5Event);
            }
        });
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24159b
    /* renamed from: a */
    public void mo86725a(H5Event h5Event) {
        if (h5Event != null && !this.f59785c) {
            m88322d(h5Event);
        }
    }

    public C24183a(WebView webView) {
        this.f59783a = webView;
        this.f59785c = false;
        this.f59784b = new HashMap();
        this.f59786d = false;
    }

    /* renamed from: b */
    public void mo86780b(final H5Event h5Event) {
        if (h5Event == null || this.f59783a == null) {
            C24174b.m88296a("H5BridgeImpl", "Dybrid bridge not inspect");
            return;
        }
        synchronized (this.f59787e) {
            if (this.f59786d) {
                C24246a.m88563a((Runnable) new Runnable() {
                    /* class com.larksuite.component.dybrid.h5core.p1072a.C24183a.RunnableC241841 */

                    public void run() {
                        String str;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("func", h5Event.mo86707b());
                            jSONObject.put("clientId", h5Event.mo86709c());
                            if (h5Event.mo86710d() != null) {
                                str = h5Event.mo86710d().toString();
                            } else {
                                str = "{}";
                            }
                            jSONObject.put("param", str);
                        } catch (JSONException e) {
                            C24174b.m88297a("H5BridgeImpl", "JSONException", e);
                        }
                        String format = String.format("LkWebViewJavascriptBridge._dispatchNativeEvent(%s)", jSONObject.toString());
                        C24174b.m88296a("H5BridgeImpl", "sentToWeb:" + format);
                        WebView webView = C24183a.this.f59783a;
                        webView.loadUrl("javascript:" + format);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public void mo86781c(H5Event h5Event) {
        String c = h5Event.mo86709c();
        boolean containsKey = this.f59784b.containsKey(c);
        JSONObject d = h5Event.mo86710d();
        if (containsKey) {
            this.f59784b.remove(c).mo86730a(d);
            return;
        }
        String b = h5Event.mo86707b();
        String str = null;
        if (d != null) {
            str = d.toString();
        }
        C24174b.m88294a("h5_jsapi_call name={" + b + "} params={" + str + "}");
        C24212a.m88459c().mo86828a(h5Event);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24159b
    /* renamed from: a */
    public void mo86726a(String str, JSONObject jSONObject, AbstractC24161d dVar) {
        if (TextUtils.isEmpty(str) || this.f59783a == null) {
            C24174b.m88296a("H5BridgeImpl", "Dybrid bridge not inspect");
            return;
        }
        H5Event a = new H5Event.C24156a().mo86719b(str).mo86717a(jSONObject).mo86718a();
        if (dVar != null) {
            this.f59784b.put(a.mo86709c(), dVar);
        }
        mo86780b(a);
    }
}
