package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.AbstractC42235a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42341b;
import com.ss.android.lark.mail.impl.utils.C43767j;
import com.ss.android.lark.mail.impl.utils.C43791r;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.a */
public abstract class AbstractC42231a<T extends AbstractC42235a> extends AbstractC42340a<C42234b> {

    /* renamed from: d */
    private static String f107505d = "Appreciable Event";

    /* renamed from: a */
    protected String f107506a;

    /* renamed from: b */
    protected AbstractC42231a<T>.C42232a f107507b;

    /* renamed from: c */
    protected T f107508c;

    /* renamed from: e */
    private HashMap<String, AbstractC42231a<T>.C42232a> f107509e = new HashMap<>();

    /* renamed from: com.ss.android.lark.mail.impl.h.b.a$b */
    public static class C42234b extends C42341b.C42342a {

        /* renamed from: i */
        protected long f107520i = System.currentTimeMillis();

        /* renamed from: j */
        protected String f107521j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract JSONObject mo152315a(AbstractC42231a<T>.C42232a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo152324c(String str);

    @Override // com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a
    /* renamed from: c */
    public boolean mo152325c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo152326d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo152328e();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo152329e(String str) {
        return true;
    }

    /* renamed from: f */
    public T mo152330f() {
        return this.f107508c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.h.b.a$a */
    public class C42232a extends C42234b {

        /* renamed from: a */
        protected String f107510a;

        /* renamed from: b */
        protected long f107511b;

        /* renamed from: c */
        protected long f107512c;

        /* renamed from: d */
        protected int f107513d;

        /* renamed from: e */
        protected Handler f107514e = new Handler(Looper.getMainLooper());

        /* renamed from: f */
        protected Runnable f107515f;

        /* renamed from: g */
        protected String f107516g;

        /* renamed from: k */
        private C42234b f107518k;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo152334b() {
            this.f107514e.removeCallbacks(this.f107515f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo152335c() {
            this.f107510a = "timeout";
            AbstractC42231a.this.mo152317a(this.f107518k, this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo152333a() {
            if (this.f107515f != null) {
                mo152334b();
            }
            RunnableC422331 r0 = new Runnable() {
                /* class com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a.C42232a.RunnableC422331 */

                public void run() {
                    C42232a.this.mo152335c();
                }
            };
            this.f107515f = r0;
            this.f107514e.postDelayed(r0, 15000);
        }

        public C42232a(C42234b bVar) {
            this.f107518k = bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo152322b() {
        if (this.f107788m == null || this.f107507b == null || !C43791r.m173558a()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void mo152410g() {
        if (!TextUtils.isEmpty(this.f107506a) && !"def_bid".equals(this.f107506a) && this.f107788m != null) {
            String e = mo152328e();
            mo152319a(e, "repeat_start", this.f107506a + ((C42234b) this.f107788m).f107521j);
        }
    }

    /* renamed from: a */
    public synchronized void mo152316a() {
        if (!mo152322b()) {
            AbstractC42231a<T>.C42232a aVar = this.f107507b;
            if (aVar != null) {
                aVar.f107510a = "success";
                mo152317a((C42234b) this.f107788m, this.f107507b);
            } else {
                mo152320b((C42234b) this.f107788m, this.f107507b);
            }
            return;
        }
        if (this.f107788m == null || ((C42234b) this.f107788m).f107520i == 0 || !TextUtils.isEmpty(this.f107507b.f107510a)) {
            mo152320b((C42234b) this.f107788m, this.f107507b);
        } else {
            this.f107507b.f107513d = 1;
            this.f107507b.f107510a = "success";
            mo152317a((C42234b) this.f107788m, this.f107507b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C42234b mo152332g(String str) {
        return new C42234b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a
    /* renamed from: f */
    public synchronized void mo152331f(String str) {
        this.f107506a = str;
        this.f107788m = this.f107787l.get(str);
        this.f107507b = this.f107509e.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo152323b(AbstractC42231a<T>.C42232a aVar) {
        if (aVar.f107512c < 0 || TextUtils.isEmpty(aVar.f107510a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo152327d(String str) {
        String str2;
        AbstractC42231a<T>.C42232a aVar;
        if (this.f107788m == null || ((str2 = this.f107506a) != null && !"def_bid".equals(str2))) {
            if (this.f107788m != null) {
                mo152320b((C42234b) this.f107788m, this.f107507b);
            }
        } else if (mo152329e(str)) {
            mo152316a();
        } else if (this.f107788m == null || (aVar = this.f107507b) == null) {
            mo152320b((C42234b) this.f107788m, this.f107507b);
        } else {
            aVar.f107510a = "success";
            mo152317a((C42234b) this.f107788m, this.f107507b);
        }
    }

    /* renamed from: b */
    public synchronized void mo152321b(String str) {
        mo152410g();
        mo152327d(str);
        if (this.f107788m == null) {
            this.f107788m = new C42234b();
            ((C42234b) this.f107788m).f107791n = this.f107506a;
            this.f107787l.put(this.f107506a, this.f107788m);
        }
        if (this.f107507b == null) {
            AbstractC42231a<T>.C42232a aVar = new C42232a((C42234b) this.f107788m);
            this.f107507b = aVar;
            aVar.f107791n = this.f107506a;
            this.f107509e.put(this.f107506a, this.f107507b);
        }
        ((C42234b) this.f107788m).f107521j = str;
        this.f107507b.f107521j = str;
        this.f107507b.mo152333a();
        if (!TextUtils.isEmpty(mo152326d())) {
            C41816b.m166115a().mo150114D().mo150182b(mo152326d(), C43767j.m173489a().mo155933a("sence", ((C42234b) this.f107788m).f107521j).mo155934a());
        }
        if (!TextUtils.equals(str, "swipe_thread")) {
            T c = mo152324c(str);
            this.f107508c = c;
            if (c != null) {
                c.mo152342c();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo152320b(C42234b bVar, AbstractC42231a<T>.C42232a aVar) {
        if (bVar != null) {
            try {
                this.f107787l.remove(bVar.f107791n);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            this.f107509e.remove(aVar.f107791n);
            aVar.mo152334b();
        }
        this.f107788m = null;
        this.f107507b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152317a(C42234b bVar, AbstractC42231a<T>.C42232a aVar) {
        if (bVar != null && aVar != null) {
            aVar.mo152334b();
            if (bVar.f107520i == 0) {
                mo152320b(bVar, aVar);
                return;
            }
            aVar.f107520i = System.currentTimeMillis();
            aVar.f107512c = aVar.f107520i - bVar.f107520i;
            if (aVar.f107512c < 30000) {
                if (TextUtils.isEmpty(aVar.f107510a)) {
                    aVar.f107510a = "success";
                }
                JSONObject a = mo152315a(aVar);
                try {
                    a.put("user_leave", aVar.f107513d);
                } catch (JSONException unused) {
                }
                String str = f107505d;
                C13479a.m54764b(str, "EventMonitor report " + mo152326d() + " " + toString() + " json:" + a);
                C41816b.m166115a().mo150114D().mo150182b(mo152328e(), a);
            }
            if (mo152323b(aVar)) {
                mo152319a(mo152328e(), "launch_without_fill", this.f107506a);
            }
            mo152320b(bVar, aVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo152318a(String str, long j) {
        if (this.f107507b != null) {
            if (this.f107788m != null) {
                T t = this.f107508c;
                if (t != null) {
                    t.mo152339a("key_finish");
                }
                if (("rust_fail".equals(str) || ApiHandler.API_CALLBACK_EXCEPTION.equals(str)) && !C43791r.m173558a()) {
                    this.f107507b.f107510a = "success";
                    mo152317a((C42234b) this.f107788m, this.f107507b);
                    return;
                }
                this.f107507b.f107510a = str;
                this.f107507b.f107511b = j;
                mo152317a((C42234b) this.f107788m, this.f107507b);
                T t2 = this.f107508c;
                if (t2 != null) {
                    t2.mo152344e();
                    this.f107508c = null;
                }
                return;
            }
        }
        mo152320b((C42234b) this.f107788m, this.f107507b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo152319a(String str, String str2, String str3) {
        C41816b.m166115a().mo150114D().mo150182b("email_apm_offtrack", C43767j.m173489a().mo155933a("event_name", str).mo155933a(ShareHitPoint.f121869d, str2).mo155933a("message", str3).mo155934a());
    }
}
