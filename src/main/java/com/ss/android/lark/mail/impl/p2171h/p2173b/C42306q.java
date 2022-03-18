package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.os.Bundle;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.message.framework.tabcontainer.C42930b;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42216n;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42245l;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.q */
public class C42306q extends AbstractC42251b<C42245l> {

    /* renamed from: e */
    private boolean f107618e;

    /* renamed from: f */
    private int f107619f = -1;

    /* renamed from: g */
    private boolean f107620g = true;

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
        return "email_apm_messagelist_load";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return this.f107620g;
    }

    public C42306q() {
        this.f107570c = new C42305p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: e */
    public boolean mo152386e() {
        if (!super.mo152386e() || this.f107788m == null || ((AbstractC42251b.C42254b) this.f107788m).f107589l == "swipe_thread") {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42245l mo152381c(String str) {
        return new C42245l();
    }

    /* renamed from: a */
    public void mo152427a(int i) {
        if (i == 1) {
            this.f107618e = true;
        } else if (i == 0) {
            this.f107618e = false;
            this.f107619f = -1;
        }
    }

    /* renamed from: a */
    public void mo152429a(long j) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152357a(j);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152357a(j);
        }
    }

    /* renamed from: b */
    public void mo152434b(int i) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152361b(i);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152361b(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42245l>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "message").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("event", Event.mail_message_list_load).mo155934a(), C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>(aVar, (C42245l) mo152393j()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q.C423071 */
            final /* synthetic */ C42245l val$detailMonitor;
            final /* synthetic */ AbstractC42251b.C42252a val$endEvent;

            {
                int i;
                this.val$endEvent = r4;
                this.val$detailMonitor = r5;
                put("scene_type", r4.f107589l);
                put("mail_body_length", Long.valueOf(r4.f107577b));
                if (r5 == null || r5.mo152365g()) {
                    i = 0;
                } else {
                    i = 1;
                }
                put("from_db", Integer.valueOf(i));
                put("mail_status", r4.f107576a);
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q.C423082 */
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
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42245l>.C42252a aVar) {
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailRead).mo155933a("page", "message").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_message_list_load).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42306q.C423093 */
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

    /* renamed from: b */
    public void mo152435b(long j) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152362b(j);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152362b(j);
        }
    }

    /* renamed from: b */
    public void mo152436b(boolean z) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152363b(z);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152363b(z);
        }
    }

    /* renamed from: a */
    public void mo152431a(Bundle bundle) {
        String string = bundle.getString("come_from");
        if (string == null) {
            string = "";
        }
        char c = 65535;
        switch (string.hashCode()) {
            case -1868792091:
                if (string.equals("come_from_notification")) {
                    c = 1;
                    break;
                }
                break;
            case -1320531829:
                if (string.equals("come_from_forward")) {
                    c = 2;
                    break;
                }
                break;
            case 145020450:
                if (string.equals("come_from_threadlist")) {
                    c = 3;
                    break;
                }
                break;
            case 1566760738:
                if (string.equals("come_from_search")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            mo152380b("search");
        } else if (c == 1) {
            mo152380b("notification");
        } else if (c != 2) {
            mo152380b("select_thread");
        } else {
            this.f107620g = false;
            mo152380b("forward");
        }
    }

    /* renamed from: a */
    public void mo152433a(boolean z) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152360a(z);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152360a(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public synchronized void mo152379b(AbstractC42251b.C42254b bVar, AbstractC42251b<C42245l>.C42252a aVar) {
        super.mo152379b(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42245l>.C42252a aVar) {
        ErrorType errorType;
        int i;
        C42245l lVar = (C42245l) mo152393j();
        C43767j.C43768a a = C43767j.m173489a().mo155931a("error_code", mo152388f());
        if (aVar.f107576a.equals("rust_fail")) {
            errorType = ErrorType.SDK;
        } else {
            errorType = ErrorType.Other;
        }
        C43767j.C43768a a2 = a.mo155932a("error_type", errorType).mo155933a("scene_type", aVar.f107589l).mo155930a("mail_body_length", (float) aVar.f107577b).mo155933a("debug_message", mo152389g());
        if (lVar == null || lVar.mo152365g()) {
            i = 0;
        } else {
            i = 1;
        }
        ((C42216n) C42343c.m169090a(C42216n.class)).mo152306d(a2.mo155931a("from_db", i).mo155933a("mail_status", this.f107569b.f107576a).mo155934a());
    }

    /* renamed from: a */
    public void mo152430a(long j, long j2) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152358a(j, j2);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152358a(j, j2);
        }
    }

    /* renamed from: a */
    public void mo152428a(int i, float f, int i2, C42930b bVar) {
        AbsMessageTemplateView absMessageTemplateView;
        if (!this.f107618e) {
            return;
        }
        if (this.f107619f == -1) {
            this.f107619f = i2;
            return;
        }
        mo152380b("swipe_thread");
        if (this.f107619f < i2) {
            absMessageTemplateView = bVar.mo154029c(i + 1);
        } else {
            absMessageTemplateView = bVar.mo154029c(i - 1);
        }
        if (absMessageTemplateView == null) {
            this.f107618e = false;
            this.f107619f = -1;
            mo152372a("success", 0);
        } else if (absMessageTemplateView.mo154348c()) {
            this.f107618e = false;
            this.f107619f = -1;
            mo152372a("success", absMessageTemplateView.f109704l);
        }
    }

    /* renamed from: a */
    public void mo152432a(String str, int i, boolean z, boolean z2) {
        if (!(this.f107570c == null || this.f107570c.mo152330f() == null)) {
            ((C42245l) this.f107570c.mo152330f()).mo152359a(str, i, z, z2);
        }
        if (mo152393j() != null) {
            ((C42245l) mo152393j()).mo152359a(str, i, z, z2);
        }
    }
}
