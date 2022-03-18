package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42222q;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42249p;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.x */
public class C42322x extends AbstractC42251b<C42249p> {

    /* renamed from: e */
    public int f107628e = -1;

    /* renamed from: f */
    public String f107629f;

    /* renamed from: g */
    private boolean f107630g = true;

    /* renamed from: h */
    private final long f107631h = 30000;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: h */
    public String mo152390h() {
        return "email_apm_threadlist_load";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: i */
    public long mo152392i() {
        return 30000;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return this.f107630g;
    }

    public C42322x() {
        this.f107570c = new C42321w();
    }

    /* renamed from: j */
    public void mo152447j(String str) {
        this.f107629f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42249p mo152381c(String str) {
        return new C42249p();
    }

    /* renamed from: a */
    public void mo152446a(boolean z) {
        if (!z || this.f107628e < 0) {
            if (mo152394k() && this.f107570c != null) {
                ((C42321w) this.f107570c).mo152444a(z);
            }
            this.f107628e = z ? 1 : 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42249p>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "thread").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("event", Event.mail_thread_list_load).mo155934a(), C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(aVar) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x.C423231 */
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                this.val$endEvent = r4;
                put("scene_type", r4.f107589l);
                put("list_length", Long.valueOf(r4.f107577b));
                put("from_db", Integer.valueOf(C42322x.this.f107628e));
                put("mail_status", r4.f107576a);
                put("label_id", C42322x.this.f107629f);
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x.C423242 */
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
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42249p>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "thread").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_thread_list_load).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x.C423253 */
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

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public synchronized void mo152380b(String str) {
        if (str == null) {
            str = "init";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1552746406:
                if (str.equals("filter_all")) {
                    c = 3;
                    break;
                }
                break;
            case -1204191267:
                if (str.equals("change_folder")) {
                    c = 1;
                    break;
                }
                break;
            case -495694250:
                if (str.equals("filter_unread")) {
                    c = 2;
                    break;
                }
                break;
            case 243364261:
                if (str.equals("change_label")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3) {
            this.f107630g = false;
        } else {
            this.f107630g = true;
        }
        super.mo152380b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public synchronized void mo152379b(AbstractC42251b.C42254b bVar, AbstractC42251b<C42249p>.C42252a aVar) {
        super.mo152379b(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42249p>.C42252a aVar) {
        ((C42222q) C42343c.m169090a(C42222q.class)).mo152306d(C43767j.m173489a().mo155931a("error_code", mo152388f()).mo155933a("scene_type", aVar.f107589l).mo155930a("list_length", (float) aVar.f107577b).mo155931a("from_db", this.f107628e).mo155933a("label_id", this.f107629f).mo155933a("mail_status", this.f107569b.f107576a).mo155933a("debug_message", mo152389g()).mo155934a());
    }
}
