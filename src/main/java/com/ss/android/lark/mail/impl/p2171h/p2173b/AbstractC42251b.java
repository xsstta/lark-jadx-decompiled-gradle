package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42341b;
import com.ss.android.lark.mail.impl.utils.C43791r;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.b */
public abstract class AbstractC42251b<T extends AbstractC42235a> extends AbstractC42340a<C42254b> {

    /* renamed from: a */
    protected String f107568a;

    /* renamed from: b */
    protected AbstractC42251b<T>.C42252a f107569b;

    /* renamed from: c */
    protected AbstractC42231a<T> f107570c;

    /* renamed from: d */
    protected T f107571d;

    /* renamed from: e */
    private final HashMap<String, AbstractC42251b<T>.C42252a> f107572e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, String> f107573f = new HashMap<>();

    /* renamed from: g */
    private int f107574g;

    /* renamed from: h */
    private String f107575h;

    /* renamed from: com.ss.android.lark.mail.impl.h.b.b$b */
    public static class C42254b extends C42341b.C42342a {

        /* renamed from: k */
        protected long f107588k = System.currentTimeMillis();

        /* renamed from: l */
        protected String f107589l;

        /* renamed from: m */
        protected long f107590m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, JSONObject> mo152367a(AbstractC42251b<T>.C42252a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152375a(String str, String str2, String str3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract HashMap<String, JSONObject> mo152377b(AbstractC42251b<T>.C42252a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo152381c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo152382c(C42254b bVar, AbstractC42251b<T>.C42252a aVar);

    @Override // com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a
    /* renamed from: c */
    public boolean mo152325c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo152387e(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo152390h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public long mo152392i() {
        return 35000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo152394k();

    /* renamed from: com.ss.android.lark.mail.impl.h.b.b$a */
    public class C42252a extends C42254b {

        /* renamed from: a */
        protected String f107576a;

        /* renamed from: b */
        protected long f107577b;

        /* renamed from: c */
        protected long f107578c;

        /* renamed from: d */
        protected int f107579d;

        /* renamed from: e */
        protected Handler f107580e = new Handler(Looper.getMainLooper());

        /* renamed from: f */
        protected Runnable f107581f;

        /* renamed from: g */
        protected AbstractC42235a f107582g;

        /* renamed from: h */
        protected int f107583h;

        /* renamed from: i */
        protected String f107584i;

        /* renamed from: o */
        private final C42254b f107586o;

        /* renamed from: a */
        public C42254b mo152395a() {
            return this.f107586o;
        }

        /* renamed from: c */
        public void mo152397c() {
            this.f107580e.removeCallbacks(this.f107581f);
        }

        /* renamed from: d */
        public void mo152398d() {
            mo152397c();
            mo152396b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo152399e() {
            this.f107576a = "timeout";
            AbstractC42251b.this.mo152370a(this.f107586o, this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo152396b() {
            if (this.f107581f != null) {
                mo152397c();
            }
            RunnableC422531 r0 = new Runnable() {
                /* class com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b.C42252a.RunnableC422531 */

                public void run() {
                    C42252a.this.mo152399e();
                }
            };
            this.f107581f = r0;
            this.f107580e.postDelayed(r0, AbstractC42251b.this.mo152392i());
        }

        public C42252a(C42254b bVar) {
            this.f107586o = bVar;
        }
    }

    /* renamed from: f */
    public int mo152388f() {
        return this.f107574g;
    }

    /* renamed from: g */
    public String mo152389g() {
        return this.f107575h;
    }

    /* renamed from: j */
    public T mo152393j() {
        return this.f107571d;
    }

    /* renamed from: a */
    public synchronized void mo152368a() {
        AbstractC42251b<T>.C42252a aVar = this.f107569b;
        if (aVar != null) {
            aVar.mo152396b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo152386e() {
        if (this.f107788m == null || this.f107569b == null || !C43791r.m173558a()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void mo152403l() {
        if (!TextUtils.isEmpty(this.f107568a) && !"def_bid".equals(this.f107568a) && this.f107788m != null) {
            String h = mo152390h();
            mo152375a(h, "repeat_start", this.f107568a + ((C42254b) this.f107788m).f107589l);
        }
    }

    /* renamed from: b */
    public synchronized void mo152378b() {
        if (this.f107569b != null) {
            C13479a.m54764b("BaseEventMonitorV2", getClass() + " reset time out");
            this.f107569b.mo152398d();
        }
    }

    /* renamed from: d */
    public synchronized void mo152384d() {
        AbstractC42231a<T> aVar;
        this.f107790o = null;
        if (mo152394k() && (aVar = this.f107570c) != null) {
            aVar.mo152316a();
        }
        if (!mo152386e()) {
            AbstractC42251b<T>.C42252a aVar2 = this.f107569b;
            if (aVar2 != null) {
                aVar2.f107576a = "cancel";
                mo152370a((C42254b) this.f107788m, this.f107569b);
            } else {
                mo152379b((C42254b) this.f107788m, this.f107569b);
            }
            return;
        }
        if (this.f107788m == null || ((C42254b) this.f107788m).f107588k == 0 || !TextUtils.isEmpty(this.f107569b.f107576a)) {
            mo152379b((C42254b) this.f107788m, this.f107569b);
        } else {
            this.f107569b.f107579d = 1;
            this.f107569b.f107576a = "cancel";
            mo152370a((C42254b) this.f107788m, this.f107569b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C42254b mo152332g(String str) {
        return new C42254b();
    }

    /* renamed from: b */
    public synchronized void mo152380b(String str) {
        mo152376a(str, true);
    }

    /* renamed from: i */
    private String mo152402i(String str) {
        if (str == null) {
            return "";
        }
        String replaceFirst = str.replaceFirst("^key_", "");
        return replaceFirst + "_cost_time";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo152383c(AbstractC42251b<T>.C42252a aVar) {
        if (aVar.f107578c < 0 || TextUtils.isEmpty(aVar.f107576a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo152371a(Runnable runnable) {
        String str = this.f107568a;
        for (String str2 : new ArrayList(this.f107572e.keySet())) {
            mo152331f(str2);
            runnable.run();
        }
        mo152331f(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a
    /* renamed from: f */
    public synchronized void mo152331f(String str) {
        if (!"def_bid".equals(str) && this.f107790o != null && (this.f107790o instanceof C42252a)) {
            ((C42252a) this.f107790o).mo152397c();
        }
        this.f107568a = str;
        this.f107788m = this.f107787l.get(str);
        AbstractC42251b<T>.C42252a aVar = this.f107572e.get(str);
        this.f107569b = aVar;
        this.f107790o = aVar;
    }

    /* renamed from: h */
    public synchronized boolean mo152391h(String str) {
        boolean z;
        AbstractC42231a<T> aVar;
        if (!(!mo152394k() || (aVar = this.f107570c) == null || aVar.mo152330f() == null)) {
            this.f107570c.mo152330f().mo152339a(str);
        }
        if (mo152393j() == null || !mo152393j().mo152339a(str)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo152385d(String str) {
        String str2;
        AbstractC42251b<T>.C42252a aVar;
        if (this.f107788m == null || ((str2 = this.f107568a) != null && !"def_bid".equals(str2))) {
            if (this.f107788m != null) {
                mo152379b((C42254b) this.f107788m, this.f107569b);
            }
        } else if (mo152387e(str)) {
            mo152384d();
        } else if (this.f107788m == null || (aVar = this.f107569b) == null) {
            mo152379b((C42254b) this.f107788m, this.f107569b);
        } else {
            aVar.f107576a = "cancel";
            mo152370a((C42254b) this.f107788m, this.f107569b);
        }
    }

    /* renamed from: a */
    public void mo152369a(int i, String str) {
        this.f107574g = i;
        this.f107575h = str;
    }

    /* renamed from: a */
    public synchronized void mo152372a(String str, long j) {
        mo152373a(str, j, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo152379b(C42254b bVar, AbstractC42251b<T>.C42252a aVar) {
        this.f107790o = null;
        if (bVar != null) {
            this.f107787l.remove(bVar.f107791n);
        }
        if (aVar != null) {
            this.f107572e.remove(aVar.f107791n);
            aVar.mo152397c();
        }
        this.f107788m = null;
        this.f107569b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152370a(C42254b bVar, AbstractC42251b<T>.C42252a aVar) {
        String str;
        ConcurrentHashMap concurrentHashMap;
        Map<String, ? extends Object> map;
        Map<String, ? extends Object> map2;
        Map<String, ? extends Object> map3;
        String[] b;
        if (!(bVar == null || aVar == null)) {
            aVar.mo152397c();
            String str2 = this.f107568a;
            if (str2 == null) {
                str = null;
            } else {
                str = this.f107573f.remove(str2);
            }
            if (bVar.f107588k == 0 || TextUtils.isEmpty(str)) {
                mo152379b(bVar, aVar);
                return;
            }
            aVar.f107588k = System.currentTimeMillis();
            aVar.f107578c = aVar.f107588k - bVar.f107588k;
            if (TextUtils.isEmpty(aVar.f107576a)) {
                aVar.f107576a = "success";
            }
            if (aVar.f107578c < 70000) {
                if (TextUtils.equals(aVar.f107576a, "success")) {
                    HashMap<String, JSONObject> a = mo152367a(aVar);
                    JSONObject jSONObject = a.get("category");
                    JSONObject jSONObject2 = a.get("metric");
                    JSONObject jSONObject3 = a.get("extra");
                    T j = mo152393j();
                    try {
                        if (!jSONObject2.has("latency_detail")) {
                            jSONObject2.put("latency_detail", new ConcurrentHashMap());
                        }
                        concurrentHashMap = (ConcurrentHashMap) jSONObject2.get("latency_detail");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        concurrentHashMap = null;
                    }
                    if (!(j == null || (b = j.mo152341b()) == null || b.length <= 2)) {
                        int i = 1;
                        for (int i2 = 1; i < b.length - i2; i2 = 1) {
                            concurrentHashMap.put(mo152402i(b[i]), Long.valueOf(j.mo152337a(i)));
                            i++;
                        }
                    }
                    C13479a.m54764b("appreciable_log:latency:", getClass() + " report  metric:" + jSONObject2 + " category:" + jSONObject + " extra:" + jSONObject3);
                    try {
                        map = (Map) jSONObject2.get("latency_detail");
                    } catch (JSONException unused) {
                        map = null;
                    }
                    try {
                        map2 = (Map) jSONObject3.get("metric");
                    } catch (JSONException unused2) {
                        map2 = null;
                    }
                    try {
                        map3 = (Map) jSONObject3.get("category");
                    } catch (JSONException unused3) {
                        map3 = null;
                    }
                    AppreciableKit.m107394b().mo103523c(str, map, null, map2, map3);
                } else if (!TextUtils.equals(aVar.f107576a, "cancel")) {
                    mo152382c(bVar, aVar);
                }
            }
            if (mo152383c(aVar)) {
                mo152375a(mo152390h(), "launch_without_fill", this.f107568a);
            }
            mo152379b(bVar, aVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo152374a(String str, String str2) {
        AbstractC42231a<T> aVar;
        this.f107790o = null;
        if (mo152394k() && (aVar = this.f107570c) != null) {
            aVar.mo152321b(str2);
        }
        mo152403l();
        mo152385d(str);
        if (this.f107788m == null) {
            this.f107788m = new C42254b();
            ((C42254b) this.f107788m).f107791n = this.f107568a;
            this.f107787l.put(this.f107568a, this.f107788m);
        }
        if (this.f107569b == null) {
            AbstractC42251b<T>.C42252a aVar2 = new C42252a((C42254b) this.f107788m);
            this.f107569b = aVar2;
            aVar2.f107791n = this.f107568a;
            this.f107572e.put(this.f107568a, this.f107569b);
        }
        ((C42254b) this.f107788m).f107589l = str;
        this.f107569b.f107589l = str;
        this.f107569b.mo152396b();
        if (!TextUtils.equals(str, "swipe_thread")) {
            T c = mo152381c(str);
            this.f107571d = c;
            if (c != null) {
                c.mo152342c();
            }
        }
        HashMap<String, JSONObject> b = mo152377b(this.f107569b);
        JSONObject jSONObject = b.get("category");
        JSONObject jSONObject2 = b.get("metric");
        b.get("extra");
        try {
            String a = AppreciableKit.m107394b().mo103510a((Biz) jSONObject.get("biz"), (Scene) jSONObject.get("scene"), (Event) jSONObject2.get("event"), (String) jSONObject.get("page"), ((Boolean) jSONObject.get("need_net")).booleanValue(), (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
            String str3 = this.f107568a;
            if (!(str3 == null || a == null)) {
                this.f107573f.put(str3, a);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void mo152376a(String str, boolean z) {
        AbstractC42231a<T> aVar;
        this.f107790o = null;
        if (mo152394k() && (aVar = this.f107570c) != null) {
            aVar.mo152321b(str);
        }
        mo152403l();
        mo152385d(str);
        if (this.f107788m == null) {
            this.f107788m = new C42254b();
            ((C42254b) this.f107788m).f107791n = this.f107568a;
            this.f107787l.put(this.f107568a, this.f107788m);
        }
        if (this.f107569b == null) {
            AbstractC42251b<T>.C42252a aVar2 = new C42252a((C42254b) this.f107788m);
            this.f107569b = aVar2;
            aVar2.f107791n = this.f107568a;
            this.f107572e.put(this.f107568a, this.f107569b);
        }
        ((C42254b) this.f107788m).f107589l = str;
        this.f107569b.f107589l = str;
        if (z) {
            this.f107569b.mo152396b();
        }
        if (!TextUtils.equals(str, "swipe_thread")) {
            T c = mo152381c(str);
            this.f107571d = c;
            if (c != null) {
                c.mo152342c();
            }
        }
        HashMap<String, JSONObject> b = mo152377b(this.f107569b);
        JSONObject jSONObject = b.get("category");
        JSONObject jSONObject2 = b.get("metric");
        b.get("extra");
        try {
            String a = AppreciableKit.m107394b().mo103510a((Biz) jSONObject.get("biz"), (Scene) jSONObject.get("scene"), (Event) jSONObject2.get("event"), (String) jSONObject.get("page"), ((Boolean) jSONObject.get("need_net")).booleanValue(), (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
            String str2 = this.f107568a;
            if (!(str2 == null || a == null)) {
                this.f107573f.put(str2, a);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void mo152373a(String str, long j, boolean z) {
        AbstractC42231a<T> aVar;
        this.f107790o = null;
        if (z && mo152394k() && (aVar = this.f107570c) != null) {
            aVar.mo152318a(str, j);
        }
        T t = this.f107571d;
        if (t != null) {
            t.mo152339a("key_finish");
        }
        if (this.f107569b != null) {
            if (this.f107788m != null) {
                if (("rust_fail".equals(str) || ApiHandler.API_CALLBACK_EXCEPTION.equals(str) || "timeout".equals(str)) && !C43791r.m173558a()) {
                    this.f107569b.f107576a = "success";
                    mo152370a((C42254b) this.f107788m, this.f107569b);
                    return;
                }
                this.f107569b.f107576a = str;
                this.f107569b.f107577b = j;
                mo152370a((C42254b) this.f107788m, this.f107569b);
                T t2 = this.f107571d;
                if (t2 != null) {
                    t2.mo152344e();
                    this.f107571d = null;
                }
                return;
            }
        }
        mo152379b((C42254b) this.f107788m, this.f107569b);
    }
}
