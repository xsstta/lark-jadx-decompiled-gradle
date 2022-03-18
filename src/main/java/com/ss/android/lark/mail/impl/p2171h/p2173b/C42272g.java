package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42199e;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42239f;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.g */
public class C42272g extends AbstractC42251b<C42239f> {

    /* renamed from: e */
    private static long f107592e;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: h */
    public String mo152390h() {
        return "email_apm_create_draft";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return true;
    }

    public C42272g() {
        this.f107570c = new C42255c();
    }

    /* renamed from: a */
    public static void m168835a(long j) {
        C42255c.m168802a(j);
        f107592e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42239f mo152381c(String str) {
        return new C42239f();
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public void mo152380b(String str) {
        super.mo152380b(str);
        if (f107592e == 0) {
            f107592e = System.currentTimeMillis();
        }
        ((AbstractC42251b.C42254b) this.f107788m).f107588k = f107592e;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42239f>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("event", Event.mail_draft_create_draft).mo155934a(), C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42272g.C422731 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r4;
                put("scene_type", r4.f107589l);
                put("mail_body_length", Long.valueOf(r4.f107577b));
                put("mail_status", r4.f107576a);
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42272g.C422742 */
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
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42239f>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailDraft).mo155933a("page", "draft").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_draft_create_draft).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42272g.C422753 */
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
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42239f>.C42252a aVar) {
        ((C42199e) C42343c.m169090a(C42199e.class)).mo152306d(C43767j.m173489a().mo155931a("error_code", mo152388f()).mo155933a("mail_status", this.f107569b.f107576a).mo155933a("scene_type", aVar.f107589l).mo155933a("debug_message", mo152389g()).mo155934a());
    }
}
