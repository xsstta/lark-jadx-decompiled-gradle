package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42195c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42237d;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.e */
public class C42262e extends AbstractC42251b<C42237d> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: h */
    public String mo152390h() {
        return "email_draft_add_image";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public synchronized void mo152368a() {
        super.mo152368a();
        if (this.f107788m != null) {
            ((AbstractC42251b.C42254b) this.f107788m).f107590m = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42237d mo152381c(String str) {
        return new C42237d();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42237d>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_draft_add_image).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e.C422675 */
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
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42237d>.C42252a aVar) {
        long j = 0;
        if (!(aVar == null || aVar.mo152395a() == null || aVar.mo152395a().f107590m <= 0)) {
            long currentTimeMillis = System.currentTimeMillis() - aVar.mo152395a().f107590m;
            aVar.mo152395a().f107590m = 0;
            j = currentTimeMillis;
        }
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("event", Event.mail_draft_add_image).mo155932a("latency_detail", new ConcurrentHashMap<String, Object>(j) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e.C422631 */
            final /* synthetic */ long val$finalUploadTotalTime;

            {
                this.val$finalUploadTotalTime = r2;
                put("upload_ms", Long.valueOf(r2));
            }
        }).mo155934a(), C43767j.m173489a().mo155932a("metric", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e.C422653 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r2;
                put("resource_content_length", Long.valueOf(r2.f107577b));
            }
        }).mo155932a("category", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e.C422642 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r2;
                put("mail_status", r2.f107576a);
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42262e.C422664 */
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
    public synchronized void mo152379b(AbstractC42251b.C42254b bVar, AbstractC42251b<C42237d>.C42252a aVar) {
        super.mo152379b(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42237d>.C42252a aVar) {
        ((C42195c) C42343c.m169090a(C42195c.class)).mo152306d(C43767j.m173489a().mo155931a("error_code", mo152388f()).mo155930a("resource_content_length", (float) aVar.f107577b).mo155933a("mail_status", this.f107569b.f107576a).mo155933a("debug_message", mo152389g()).mo155934a());
    }
}
