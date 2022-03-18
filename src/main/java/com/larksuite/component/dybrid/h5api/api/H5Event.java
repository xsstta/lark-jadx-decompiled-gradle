package com.larksuite.component.dybrid.h5api.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class H5Event {

    /* renamed from: a */
    private String f59732a;

    /* renamed from: b */
    private JSONObject f59733b;

    /* renamed from: c */
    private AbstractC24163f f59734c;

    /* renamed from: d */
    private AbstractC24161d f59735d;

    /* renamed from: e */
    private String f59736e;

    /* renamed from: f */
    private Error f59737f;

    /* renamed from: g */
    private boolean f59738g;

    public enum Error {
        NONE,
        NOT_FOUND,
        INVALID_PARAM,
        UNKNOWN_ERROR,
        FORBIDDEN
    }

    public enum EventType {
        CALL,
        CALLBACK
    }

    /* renamed from: com.larksuite.component.dybrid.h5api.api.H5Event$b */
    public interface AbstractC24157b {
        void onCreated(Activity activity, boolean z);
    }

    /* renamed from: h */
    public void mo86714h() {
        this.f59738g = true;
    }

    /* renamed from: a */
    public AbstractC24161d mo86700a() {
        return this.f59735d;
    }

    /* renamed from: b */
    public String mo86707b() {
        return this.f59732a;
    }

    /* renamed from: c */
    public String mo86709c() {
        return this.f59736e;
    }

    /* renamed from: d */
    public JSONObject mo86710d() {
        return this.f59733b;
    }

    /* renamed from: e */
    public AbstractC24163f mo86711e() {
        return this.f59734c;
    }

    /* renamed from: g */
    public boolean mo86713g() {
        return this.f59738g;
    }

    /* renamed from: com.larksuite.component.dybrid.h5api.api.H5Event$a */
    public static class C24156a {

        /* renamed from: a */
        public String f59740a;

        /* renamed from: b */
        public JSONObject f59741b;

        /* renamed from: c */
        public AbstractC24163f f59742c;

        /* renamed from: d */
        public String f59743d;

        /* renamed from: e */
        public Error f59744e;

        /* renamed from: a */
        public H5Event mo86718a() {
            return new H5Event(this, null);
        }

        /* renamed from: a */
        public C24156a mo86716a(String str) {
            this.f59743d = str;
            return this;
        }

        /* renamed from: b */
        public C24156a mo86719b(String str) {
            this.f59740a = str;
            return this;
        }

        /* renamed from: a */
        public C24156a mo86717a(JSONObject jSONObject) {
            this.f59741b = jSONObject;
            return this;
        }
    }

    /* renamed from: i */
    public boolean mo86715i() {
        boolean m = ((AbstractC24168k) this.f59734c).mo86760m();
        if (!m) {
            mo86706a(Error.FORBIDDEN);
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.dybrid.h5api.api.H5Event$1 */
    public static /* synthetic */ class C241551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59739a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.larksuite.component.dybrid.h5api.api.H5Event$Error[] r0 = com.larksuite.component.dybrid.h5api.api.H5Event.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.dybrid.h5api.api.H5Event.C241551.f59739a = r0
                com.larksuite.component.dybrid.h5api.api.H5Event$Error r1 = com.larksuite.component.dybrid.h5api.api.H5Event.Error.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.dybrid.h5api.api.H5Event.C241551.f59739a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.dybrid.h5api.api.H5Event$Error r1 = com.larksuite.component.dybrid.h5api.api.H5Event.Error.INVALID_PARAM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.dybrid.h5api.api.H5Event.C241551.f59739a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.dybrid.h5api.api.H5Event$Error r1 = com.larksuite.component.dybrid.h5api.api.H5Event.Error.UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.dybrid.h5api.api.H5Event.C241551.f59739a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.dybrid.h5api.api.H5Event$Error r1 = com.larksuite.component.dybrid.h5api.api.H5Event.Error.FORBIDDEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.dybrid.h5api.api.H5Event.C241551.<clinit>():void");
        }
    }

    /* renamed from: f */
    public final Activity mo86712f() {
        AbstractC24163f fVar = this.f59734c;
        if (!(fVar instanceof AbstractC24168k)) {
            return null;
        }
        AbstractC24168k kVar = (AbstractC24168k) fVar;
        if (kVar.mo86757j() == null) {
            return null;
        }
        Context a = kVar.mo86757j().mo86731a();
        if (a instanceof Activity) {
            return (Activity) a;
        }
        C24174b.m88299b("H5Event", "pls use callProxyActivity to start biz!!!");
        return null;
    }

    /* renamed from: a */
    public void mo86702a(AbstractC24161d dVar) {
        this.f59735d = dVar;
    }

    /* renamed from: a */
    public void mo86703a(AbstractC24163f fVar) {
        this.f59734c = fVar;
    }

    /* renamed from: a */
    public void mo86701a(AbstractC24157b bVar) {
        if (bVar != null) {
            if (mo86712f() != null) {
                bVar.onCreated(mo86712f(), false);
            } else {
                mo86711e().mo86734a(bVar);
            }
        }
    }

    public H5Event(String str) {
        this.f59737f = Error.NONE;
        this.f59732a = str;
        if (TextUtils.isEmpty(this.f59736e)) {
            this.f59736e = str + System.nanoTime();
        }
        this.f59738g = false;
    }

    /* renamed from: b */
    private String m88217b(Error error) {
        int i = C241551.f59739a[error.ordinal()];
        if (i == 1) {
            return "not implemented!";
        }
        if (i == 2) {
            return "invalid parameter!";
        }
        if (i == 3) {
            return "unknown error!";
        }
        if (i != 4) {
            return "none error occured!";
        }
        return "forbidden!";
    }

    /* renamed from: a */
    public void mo86705a(JSONObject jSONObject) {
        this.f59733b = jSONObject;
    }

    private H5Event(C24156a aVar) {
        this.f59732a = aVar.f59740a;
        this.f59733b = aVar.f59741b;
        this.f59734c = aVar.f59742c;
        String str = aVar.f59743d;
        this.f59736e = str;
        if (TextUtils.isEmpty(str)) {
            this.f59736e = this.f59732a + System.nanoTime();
        }
        if (aVar.f59744e == null || aVar.f59744e.equals("")) {
            this.f59737f = Error.NONE;
        } else {
            this.f59737f = aVar.f59744e;
        }
    }

    /* renamed from: b */
    public boolean mo86708b(JSONObject jSONObject) {
        if (this.f59735d == null) {
            return false;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("eventType", "callback");
            jSONObject2.put("eventData", jSONObject);
        } catch (JSONException e) {
            C24174b.m88297a("H5Event", "JSONException", e);
        }
        this.f59735d.mo86730a(jSONObject2);
        return true;
    }

    /* renamed from: a */
    public boolean mo86706a(Error error) {
        C24174b.m88299b("H5Event", "sendError " + error + " [action] " + this.f59732a);
        mo86714h();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorMessage", m88217b(error));
            jSONObject.put("error", error.ordinal());
        } catch (JSONException e) {
            C24174b.m88297a("H5Event", ApiHandler.API_CALLBACK_EXCEPTION, e);
        }
        return mo86708b(jSONObject);
    }

    /* synthetic */ H5Event(C24156a aVar, C241551 r2) {
        this(aVar);
    }

    /* renamed from: a */
    public void mo86704a(String str, JSONObject jSONObject) {
        AbstractC24168k kVar = (AbstractC24168k) this.f59734c;
        if (kVar.mo86755h() != null) {
            kVar.mo86755h().mo86726a(str, jSONObject, null);
        } else if (this.f59735d != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("eventType", "call");
                jSONObject2.put("eventName", str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject2.put("eventData", jSONObject);
            } catch (JSONException e) {
                C24174b.m88297a("H5Event", "JSONException", e);
            }
            this.f59735d.mo86730a(jSONObject2);
        }
    }
}
