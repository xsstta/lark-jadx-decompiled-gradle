package com.larksuite.component.dybrid.h5core.core.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.larksuite.component.dybrid.h5api.api.AbstractC24159b;
import com.larksuite.component.dybrid.h5api.api.AbstractC24161d;
import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24166i;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.AbstractC24172n;
import com.larksuite.component.dybrid.h5api.api.C24162e;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.AbstractC24198a;
import com.larksuite.component.dybrid.h5core.ipc.H5MainProcessMessenger;
import com.larksuite.component.dybrid.h5core.p1072a.C24183a;
import com.larksuite.component.dybrid.h5core.p1073b.C24189a;
import com.larksuite.component.dybrid.h5core.p1074c.C24195a;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1079g.C24235b;
import com.larksuite.component.dybrid.h5core.p1079g.C24239c;
import com.larksuite.component.dybrid.h5core.p1079g.C24240d;
import com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24220a;
import com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24225b;
import com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c;
import com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24234d;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.framework.utils.C26252ad;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.core.impl.b */
public class C24205b extends AbstractC24198a implements AbstractC24168k {

    /* renamed from: c */
    public Bundle f59824c;

    /* renamed from: d */
    public Messenger f59825d;

    /* renamed from: e */
    private Activity f59826e;

    /* renamed from: f */
    private boolean f59827f;

    /* renamed from: g */
    private AbstractC24172n f59828g;

    /* renamed from: h */
    private C24162e f59829h;

    /* renamed from: i */
    private WebView f59830i;

    /* renamed from: j */
    private AbstractC24159b f59831j;

    /* renamed from: k */
    private Messenger f59832k = new Messenger(new HandlerC24207a());

    /* renamed from: l */
    private ServiceConnection f59833l = new ServiceConnection() {
        /* class com.larksuite.component.dybrid.h5core.core.impl.C24205b.ServiceConnectionC242061 */

        public void onServiceDisconnected(ComponentName componentName) {
            C24174b.m88296a("H5PageImpl", "onServiceDisconnected --->" + System.currentTimeMillis() + " pageId:" + C24205b.this.mo86738b());
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C24174b.m88296a("H5PageImpl", "onServiceConnected --->" + System.currentTimeMillis() + " pageId:" + C24205b.this.mo86738b());
            C24205b.this.f59825d = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, 100);
            obtain.replyTo = C24205b.this.mo86752e();
            C24205b.this.f59824c.putInt("nodeId", C24205b.this.mo86738b());
            obtain.setData(C24205b.this.f59824c);
            try {
                if (C24205b.this.f59825d != null) {
                    C24205b.this.f59825d.send(obtain);
                }
            } catch (RemoteException e) {
                C24174b.m88297a("H5PageImpl", "dispatch event exception:", e);
            }
        }
    };

    /* renamed from: com.larksuite.component.dybrid.h5core.core.impl.b$a */
    private static class HandlerC24207a extends Handler {
        private HandlerC24207a() {
        }

        public void handleMessage(Message message) {
            AbstractC24168k kVar;
            int i = message.getData().getInt("nodeId");
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC24163f a = C24210e.m88437g().mo86733a(i);
            if (a instanceof AbstractC24168k) {
                kVar = (AbstractC24168k) a;
                C24174b.m88296a("H5PageImpl", "found h5page:" + kVar.mo86738b());
            } else {
                kVar = null;
            }
            try {
                int i2 = message.what;
                if (i2 == 201) {
                    C24174b.m88296a("H5PageImpl", "find page timestamp:" + (System.currentTimeMillis() - currentTimeMillis));
                    if (kVar != null) {
                        m88425a(message, kVar);
                    } else {
                        C24174b.m88301c("H5PageImpl", "not handlerH5Page");
                    }
                } else if (i2 != 202) {
                    super.handleMessage(message);
                } else {
                    C24174b.m88296a("H5PageImpl", "main process send event to h5container !!!!");
                    JSONObject jSONObject = new JSONObject(message.getData().getString("ipcParams"));
                    String a2 = C24246a.m88559a(jSONObject, "eventName");
                    JSONObject a3 = C24246a.m88562a(jSONObject, "eventData", new JSONObject());
                    C24174b.m88296a("H5PageImpl", "action :" + a2 + " event Data:" + a3.toString());
                    if (kVar != null) {
                        kVar.mo86736a(a2, a3);
                    }
                }
            } catch (JSONException e) {
                C24174b.m88297a("H5PageImpl", "JSONException", e);
            }
        }

        /* renamed from: a */
        private void m88425a(Message message, AbstractC24168k kVar) throws JSONException {
            JSONObject jSONObject = new JSONObject(message.getData().getString("ipcParams"));
            String a = C24246a.m88559a(jSONObject, "eventType");
            C24174b.m88296a("H5PageImpl", "MAIN_SEND_MSG_TO_H5CONTAINER: " + a + " handleH5PageId:" + kVar.mo86738b());
            if ("callback".equals(a)) {
                AbstractC24161d a2 = kVar.mo86750a(message.getData().getString("eventId"));
                if (a2 != null) {
                    C24174b.m88296a("H5PageImpl", " callback params");
                    a2.mo86730a(jSONObject);
                }
            } else if ("call".equals(a)) {
                JSONObject a3 = C24246a.m88562a(jSONObject, "eventData", new JSONObject());
                kVar.mo86755h().mo86726a(C24246a.m88559a(jSONObject, "eventName"), a3, null);
            }
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: e */
    public Messenger mo86752e() {
        return this.f59832k;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: f */
    public Messenger mo86753f() {
        return this.f59825d;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: g */
    public AbstractC24172n mo86754g() {
        return this.f59828g;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: h */
    public AbstractC24159b mo86755h() {
        return this.f59831j;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: j */
    public C24162e mo86757j() {
        return this.f59829h;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: k */
    public WebView mo86758k() {
        return this.f59830i;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: l */
    public Bundle mo86759l() {
        return this.f59824c;
    }

    /* renamed from: t */
    private void m88412t() {
        this.f59826e.unbindService(this.f59833l);
    }

    /* renamed from: q */
    private void m88409q() {
        this.f59826e.bindService(new Intent(this.f59826e, H5MainProcessMessenger.class), this.f59833l, 1);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j, com.larksuite.component.dybrid.h5core.core.AbstractC24198a
    /* renamed from: d */
    public void mo86749d() {
        super.mo86749d();
        this.f59829h = null;
        this.f59830i = null;
        AbstractC24159b bVar = this.f59831j;
        if (bVar != null) {
            bVar.mo86728c();
            this.f59831j = null;
        }
        this.f59824c = null;
        this.f59826e = null;
        this.f59828g = null;
        this.f59829h = null;
        this.f59813b.clear();
    }

    /* renamed from: o */
    private void m88407o() {
        Activity activity = this.f59826e;
        if (activity == null) {
            this.f59829h = new C24162e(C24214b.m88460a());
        } else {
            this.f59829h = new C24162e(activity);
            this.f59824c = this.f59826e.getIntent().getExtras();
        }
        this.f59827f = false;
        if (this.f59824c == null) {
            this.f59824c = new Bundle();
        }
        this.f59812a = new C24195a();
    }

    /* renamed from: p */
    private void m88408p() {
        AbstractC24171m n = mo86816n();
        n.mo86762a(new C24234d());
        n.mo86762a(new C24220a());
        n.mo86762a(new C24225b());
        n.mo86762a(new C24227c());
        n.mo86762a(new C24240d(this));
        AbstractC24169l a = C24189a.m88341a().mo86795a(H5PluginConfig.Scope.PAGE, n);
        if (a != null) {
            n.mo86762a(a);
        }
    }

    /* renamed from: r */
    private void m88410r() {
        AbstractC24171m n = mo86816n();
        n.mo86762a(new C24240d(this));
        n.mo86762a(new C24235b());
        n.mo86762a(new C24239c(this));
        if (C26252ad.m94993b(C24214b.m88460a())) {
            m88408p();
        }
    }

    /* renamed from: s */
    private void m88411s() {
        String a = C24246a.m88555a(this.f59824c, "bizName");
        if (TextUtils.isEmpty(a)) {
            a = C24246a.m88555a(this.f59824c, "bn");
        }
        if (TextUtils.isEmpty(a)) {
            a = "H5Container";
        }
        this.f59824c.putString("sessionId", a);
        AbstractC24172n a2 = C24210e.m88437g().mo86844a(C24246a.m88555a(this.f59824c, "sessionId"));
        this.f59828g = a2;
        a2.mo86764a((AbstractC24168k) this);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: i */
    public boolean mo86756i() {
        if (this.f59827f) {
            C24174b.m88296a("H5PageImpl", "page already exited! main process ->>>" + C26252ad.m94993b(C24214b.m88460a()));
            return false;
        }
        this.f59827f = true;
        Activity activity = this.f59826e;
        if (activity != null) {
            if (!C26252ad.m94993b(activity)) {
                Message obtain = Message.obtain((Handler) null, 101);
                Bundle bundle = new Bundle();
                bundle.putInt("nodeId", mo86738b());
                obtain.setData(bundle);
                try {
                    Messenger messenger = this.f59825d;
                    if (messenger != null) {
                        messenger.send(obtain);
                    }
                } catch (RemoteException e) {
                    C24174b.m88297a("H5PageImpl", "dispatch event exception:", e);
                }
                C24174b.m88296a("H5PageImpl", "unBindIpc!");
                m88412t();
            }
            if (!this.f59826e.isFinishing()) {
                this.f59826e.finish();
            }
        } else {
            C24174b.m88296a("H5PageImpl", "sent close event to other process!!");
            mo86736a("h5PageClose", null);
        }
        return this.f59828g.mo86765b((AbstractC24168k) this);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: m */
    public boolean mo86760m() {
        AbstractC24166i b = C24212a.m88458b();
        if (b == null) {
            C24174b.m88301c("H5PageImpl", "checkPermission but h5EnvConfigListener==null!!!");
            return false;
        }
        Bundle l = mo86759l();
        String a = C24246a.m88555a(l, "u");
        if (TextUtils.isEmpty(a)) {
            a = C24246a.m88555a(l, "url");
        }
        if (TextUtils.isEmpty(a)) {
            C24174b.m88301c("H5PageImpl", "checkPermission but url is empty!!!");
            return false;
        }
        boolean a2 = b.mo86746a(C24246a.m88558a(a));
        if (!a2) {
            C24174b.m88296a("H5PageImpl", "unauthorized!!!");
        }
        return a2;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: a */
    public void mo86751a(Messenger messenger) {
        this.f59832k = messenger;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24168k
    /* renamed from: a */
    public AbstractC24161d mo86750a(String str) {
        H5Event h5Event = (H5Event) this.f59813b.remove(str);
        if (h5Event != null) {
            return h5Event.mo86700a();
        }
        return null;
    }

    public C24205b(Bundle bundle) {
        this.f59824c = bundle;
        m88407o();
        m88408p();
        m88411s();
    }

    public C24205b(Activity activity, Bundle bundle, WebView webView) {
        this.f59826e = activity;
        this.f59824c = bundle;
        this.f59830i = webView;
        this.f59831j = new C24183a(webView);
        if (!C26252ad.m94993b(C24214b.m88460a())) {
            m88409q();
        }
        m88407o();
        m88410r();
        m88411s();
    }
}
