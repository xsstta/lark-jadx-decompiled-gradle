package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42203g;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42248o;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.i */
public class C42280i extends AbstractC42251b<C42248o> {

    /* renamed from: e */
    public long f107593e;

    /* renamed from: f */
    public long f107594f;

    /* renamed from: g */
    private long f107595g;

    /* renamed from: h */
    private long f107596h;

    /* renamed from: i */
    private long f107597i;

    /* renamed from: j */
    private long f107598j;

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b, com.ss.android.lark.mail.impl.p2171h.p2175c.AbstractC42340a
    /* renamed from: c */
    public boolean mo152325c() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: e */
    public boolean mo152387e(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: h */
    public String mo152390h() {
        return "email_apm_draft_send_draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: i */
    public long mo152392i() {
        return 60000;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return true;
    }

    /* renamed from: r */
    private void m168852r() {
        this.f107598j = 0;
    }

    public C42280i() {
        this.f107570c = new C42320v();
    }

    /* renamed from: l */
    public void mo152403l() {
        if (mo152394k() && this.f107570c != null) {
            ((C42320v) this.f107570c).mo152410g();
        }
        this.f107595g = System.currentTimeMillis();
    }

    /* renamed from: m */
    public void mo152404m() {
        if (mo152394k() && this.f107570c != null) {
            ((C42320v) this.f107570c).mo152439h();
        }
        if (this.f107788m != null) {
            this.f107593e = System.currentTimeMillis() - this.f107595g;
        }
    }

    /* renamed from: n */
    public void mo152405n() {
        if (mo152394k() && this.f107570c != null) {
            ((C42320v) this.f107570c).mo152440i();
        }
        if (this.f107788m != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f107596h = currentTimeMillis;
            this.f107597i = (currentTimeMillis - ((AbstractC42251b.C42254b) this.f107788m).f107588k) - this.f107593e;
        }
    }

    /* renamed from: o */
    public void mo152406o() {
        if (mo152394k() && this.f107570c != null) {
            ((C42320v) this.f107570c).mo152441j();
        }
        if (this.f107598j == 0) {
            this.f107598j = System.currentTimeMillis();
        }
        if (this.f107569b != null) {
            this.f107569b.mo152397c();
        }
    }

    /* renamed from: p */
    public void mo152407p() {
        if (mo152394k() && this.f107570c != null) {
            ((C42320v) this.f107570c).mo152442k();
        }
        if (this.f107569b != null) {
            this.f107569b.f107576a = "cancel";
            mo152370a((AbstractC42251b.C42254b) this.f107788m, this.f107569b);
            m168852r();
        }
    }

    /* renamed from: q */
    public void mo152408q() {
        if (mo152394k() && this.f107570c != null) {
            ((C42320v) this.f107570c).mo152443l();
        }
        if (this.f107569b != null) {
            this.f107569b.f107576a = "cancel";
            mo152370a((AbstractC42251b.C42254b) this.f107788m, this.f107569b);
            m168852r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42248o mo152381c(String str) {
        return new C42248o(false);
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public synchronized void mo152380b(String str) {
        super.mo152380b(str);
        m168852r();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42248o>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_draft_send_draft).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42280i.C422844 */
            final /* synthetic */ JSONObject val$category;
            final /* synthetic */ JSONObject val$metric;

            {
                this.val$category = r2;
                this.val$metric = r3;
                put("category", r2);
                put("metric", r3);
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42248o>.C42252a aVar) {
        if (this.f107598j > 0) {
            long j = aVar.f107578c;
            if (this.f107596h - this.f107598j > 0) {
                aVar.f107578c -= this.f107596h - this.f107598j;
            }
            if (aVar.f107578c <= 0) {
                aVar.f107578c = j;
            }
            m168852r();
        }
        this.f107594f = System.currentTimeMillis() - this.f107596h;
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("latency_detail", new ConcurrentHashMap<String, Long>() {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42280i.C422811 */

            {
                put("time_get_html_ms", Long.valueOf(C42280i.this.f107593e));
                put("rust_ms", Long.valueOf(C42280i.this.f107594f));
            }
        }).mo155932a("event", Event.mail_draft_send_draft).mo155934a(), C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42280i.C422822 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r4;
                put("time_get_html_ms", Long.valueOf(C42280i.this.f107593e));
                put("mail_body_length", Long.valueOf(r4.f107577b));
                put("mail_status", r4.f107576a);
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42280i.C422833 */
            final /* synthetic */ JSONObject val$category;
            final /* synthetic */ JSONObject val$extra;
            final /* synthetic */ JSONObject val$metric;

            {
                this.val$category = r2;
                this.val$metric = r3;
                this.val$extra = r4;
                put("category", r2);
                put("metric", r3);
                put("extra", r4);
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public synchronized void mo152379b(AbstractC42251b.C42254b bVar, AbstractC42251b<C42248o>.C42252a aVar) {
        super.mo152379b(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42248o>.C42252a aVar) {
        ((C42203g) C42343c.m169090a(C42203g.class)).mo152306d(C43767j.m173489a().mo155931a("error_code", mo152388f()).mo155930a("mail_body_length", (float) aVar.f107577b).mo155933a("mail_status", this.f107569b.f107576a).mo155933a("debug_message", mo152389g()).mo155934a());
    }
}
