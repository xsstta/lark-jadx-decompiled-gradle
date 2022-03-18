package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42214m;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42244k;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.o */
public class C42299o extends AbstractC42251b<C42244k> {

    /* renamed from: e */
    private final ConcurrentHashMap<String, Long> f107616e = new ConcurrentHashMap<>();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: h */
    public String mo152390h() {
        return "email_message_image_load";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42244k mo152381c(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return false;
    }

    public C42299o() {
        this.f107570c = null;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public synchronized void mo152368a() {
        super.mo152368a();
        if (this.f107788m != null) {
            ((AbstractC42251b.C42254b) this.f107788m).f107590m = System.currentTimeMillis();
        }
    }

    /* renamed from: l */
    public synchronized void mo152403l() {
        if (!(this.f107569b == null || this.f107569b.f107582g == null)) {
            this.f107569b.f107582g.mo152339a("key_native_start");
            ((C42244k) this.f107569b.f107582g).mo152347a(true);
            this.f107569b.f107589l = "download";
        }
    }

    /* renamed from: m */
    public synchronized void mo152425m() {
        if (this.f107569b == null || this.f107569b.f107582g == null) {
            this.f107616e.putIfAbsent(this.f107568a, Long.valueOf(System.currentTimeMillis()));
        } else {
            ((C42244k) this.f107569b.f107582g).mo152354d(System.currentTimeMillis());
        }
    }

    /* renamed from: j */
    public synchronized void mo152424j(String str) {
        long j;
        if (this.f107569b == null) {
            j = 0;
        } else {
            j = this.f107569b.f107577b;
        }
        mo152373a(str, j, true);
    }

    /* renamed from: a */
    public synchronized void mo152421a(long j) {
        if (!(this.f107569b == null || this.f107569b.f107582g == null)) {
            ((C42244k) this.f107569b.f107582g).mo152351c(j);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42244k>.C42252a aVar) {
        if (aVar != null) {
            aVar.f107582g = new C42244k();
            aVar.f107582g.mo152342c();
        }
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "message").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_message_image_load).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o.C423045 */
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
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42244k>.C42252a aVar) {
        long j = 0;
        if (!(aVar == null || aVar.mo152395a() == null || aVar.mo152395a().f107590m <= 0)) {
            long currentTimeMillis = System.currentTimeMillis() - aVar.mo152395a().f107590m;
            aVar.mo152395a().f107590m = 0;
            j = currentTimeMillis;
        }
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "message").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("event", Event.mail_message_image_load).mo155932a("latency_detail", new ConcurrentHashMap<String, Object>(j) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o.C423001 */
            final /* synthetic */ long val$finalDownloadTotalTime;

            {
                this.val$finalDownloadTotalTime = r2;
                put("upload_ms", Long.valueOf(r2));
            }
        }).mo155934a(), C43767j.m173489a().mo155932a("metric", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o.C423023 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r2;
                put("resource_content_length", Long.valueOf(r2.f107577b));
            }
        }).mo155932a("category", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o.C423012 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r3;
                put("mail_status", r3.f107576a);
                put("is_cache", Integer.valueOf("cache".equals(r3.f107589l) ? 1 : 0));
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42299o.C423034 */
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
    public synchronized void mo152379b(AbstractC42251b.C42254b bVar, AbstractC42251b<C42244k>.C42252a aVar) {
        this.f107616e.remove(this.f107568a);
        super.mo152379b(bVar, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public synchronized void mo152369a(int i, String str) {
        if (this.f107569b != null) {
            this.f107569b.f107583h = i;
            AbstractC42251b.C42252a aVar = this.f107569b;
            aVar.f107584i = "code: " + i + "; message: " + str;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42244k>.C42252a aVar) {
        ErrorType errorType;
        if (aVar == null) {
            mo152379b(bVar, aVar);
            return;
        }
        C43767j.C43768a a = C43767j.m173489a();
        if (aVar.f107576a.equals("rust_fail")) {
            errorType = ErrorType.SDK;
        } else {
            errorType = ErrorType.Other;
        }
        ((C42214m) C42343c.m169090a(C42214m.class)).mo152306d(a.mo155932a("error_type", errorType).mo155931a("error_code", aVar.f107583h).mo155933a("mail_status", aVar.f107576a).mo155930a("resource_content_length", (float) aVar.f107577b).mo155933a("debug_message", aVar.f107584i).mo155934a());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public void mo152370a(AbstractC42251b.C42254b bVar, AbstractC42251b<C42244k>.C42252a aVar) {
        if (bVar != null && aVar != null && aVar.f107582g != null) {
            C42244k kVar = (C42244k) aVar.f107582g;
            if ("success".equals(aVar.f107576a)) {
                kVar.mo152344e();
            }
            if (kVar.mo152355f()) {
                super.mo152370a(bVar, (AbstractC42251b<T>.C42252a) aVar);
            } else {
                mo152379b(bVar, aVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo152423a(boolean z, long j) {
        if (!(this.f107569b == null || this.f107569b.f107582g == null)) {
            C42244k kVar = (C42244k) this.f107569b.f107582g;
            kVar.mo152339a("key_native_done");
            kVar.mo152347a(true);
            kVar.mo152353c(z);
            kVar.mo152346a(j);
            Long l = this.f107616e.get(this.f107568a);
            if (l != null) {
                kVar.mo152354d(l.longValue());
            }
            this.f107569b.f107577b = j;
        }
    }

    /* renamed from: a */
    public synchronized void mo152422a(long j, boolean z, boolean z2, int i, String str) {
        if (!(this.f107569b == null || this.f107569b.f107582g == null)) {
            C42244k kVar = (C42244k) this.f107569b.f107582g;
            kVar.mo152347a(z);
            kVar.mo152350b(z2);
            kVar.mo152349b(j);
            kVar.mo152348b(i);
            kVar.mo152352c(str);
        }
    }
}
