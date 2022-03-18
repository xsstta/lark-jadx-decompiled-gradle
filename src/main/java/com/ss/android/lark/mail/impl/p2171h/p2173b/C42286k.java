package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.text.TextUtils;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42205h;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42241h;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42343c;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.k */
public class C42286k extends AbstractC42251b<C42241h> {

    /* renamed from: e */
    public String f107606e;

    /* renamed from: f */
    public String f107607f;

    /* renamed from: g */
    public boolean f107608g;

    /* renamed from: h */
    public boolean f107609h;

    /* renamed from: i */
    public int f107610i = -1;

    /* renamed from: j */
    public boolean f107611j;

    /* renamed from: k */
    public boolean f107612k;

    /* renamed from: p */
    private boolean f107613p = true;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: h */
    public String mo152390h() {
        return "email_apm_fmp";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: k */
    public boolean mo152394k() {
        return this.f107613p;
    }

    /* renamed from: l */
    public void mo152403l() {
        ((C42285j) this.f107570c).mo152410g();
        this.f107608g = true;
    }

    /* renamed from: m */
    public void mo152416m() {
        ((C42285j) this.f107570c).mo152412h();
        this.f107609h = true;
    }

    public C42286k() {
        this.f107570c = new C42285j();
    }

    /* renamed from: c */
    public void mo152415c(boolean z) {
        ((C42285j) this.f107570c).mo152409a(z);
        this.f107612k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C42241h mo152381c(String str) {
        return new C42241h(TextUtils.equals(str, "cold_start"));
    }

    /* renamed from: a */
    public void mo152413a(boolean z) {
        if (!z || this.f107610i < 0) {
            ((C42285j) this.f107570c).mo152409a(z);
            this.f107610i = z ? 1 : 0;
        }
    }

    /* renamed from: b */
    public void mo152414b(boolean z) {
        ((C42285j) this.f107570c).mo152409a(z);
        this.f107611j = z;
    }

    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: b */
    public synchronized void mo152380b(String str) {
        if (str == null) {
            str = "email_tab_hot";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1679810517) {
            if (hashCode == 222912038) {
                if (str.equals("public_account_change_hot")) {
                    c = 1;
                }
            }
        } else if (str.equals("public_account_change_cold")) {
            c = 0;
        }
        if (c == 0 || c == 1) {
            this.f107613p = false;
        } else {
            this.f107613p = true;
        }
        super.mo152380b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: a */
    public HashMap<String, JSONObject> mo152367a(AbstractC42251b<C42241h>.C42252a aVar) {
        if (aVar == null) {
            return null;
        }
        String str = aVar.f107589l;
        char c = 65535;
        switch (str.hashCode()) {
            case -2068756565:
                if (str.equals("email_tab_clod")) {
                    c = 0;
                    break;
                }
                break;
            case -1679810517:
                if (str.equals("public_account_change_cold")) {
                    c = 4;
                    break;
                }
                break;
            case -1572426030:
                if (str.equals("notification_clod")) {
                    c = 2;
                    break;
                }
                break;
            case -1175107840:
                if (str.equals("email_tab_hot")) {
                    c = 5;
                    break;
                }
                break;
            case 222912038:
                if (str.equals("public_account_change_hot")) {
                    c = 3;
                    break;
                }
                break;
            case 1611849465:
                if (str.equals("notification_hot")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.f107607f = "email_tab";
            this.f107606e = "cold_start";
        } else if (c == 1) {
            this.f107607f = "notification";
            this.f107606e = "hot_start";
        } else if (c == 2) {
            this.f107607f = "notification";
            this.f107606e = "cold_start";
        } else if (c == 3) {
            this.f107607f = "public_account_change";
            this.f107606e = "hot_start";
        } else if (c != 4) {
            this.f107607f = "email_tab";
            this.f107606e = "hot_start";
        } else {
            this.f107607f = "public_account_change";
            this.f107606e = "cold_start";
        }
        C42241h hVar = (C42241h) mo152393j();
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailFMP).mo155933a("page", "fmp").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155930a("latency", (float) aVar.f107578c).mo155932a("event", Event.mail_fmp_load).mo155934a(), C43767j.m173489a().mo155932a("category", new ConcurrentHashMap<String, Object>() {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k.C422871 */

            {
                String str;
                put("scene_type", C42286k.this.f107607f);
                put("mode", C42286k.this.f107606e);
                put("from_db", Integer.valueOf(C42286k.this.f107610i));
                put("has_preload_label_list", Boolean.valueOf(C42286k.this.f107608g));
                put("has_preload_thread_list", Boolean.valueOf(C42286k.this.f107609h));
                put("mail_status", C42286k.this.f107569b.f107576a);
                if (C43350d.m172098a().mo155056v()) {
                    str = "conversational";
                } else {
                    str = "traditional";
                }
                put("mail_display_type", str);
                put("has_first_label_cache", Integer.valueOf(C42286k.this.f107611j ? 1 : 0));
                put("preload_with_unread_mail", Integer.valueOf(C42286k.this.f107612k ? 1 : 0));
            }
        }).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k.C422882 */
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
    public HashMap<String, JSONObject> mo152377b(AbstractC42251b<C42241h>.C42252a aVar) {
        if (aVar == null) {
            return null;
        }
        String str = aVar.f107589l;
        char c = 65535;
        switch (str.hashCode()) {
            case -2068756565:
                if (str.equals("email_tab_clod")) {
                    c = 0;
                    break;
                }
                break;
            case -1679810517:
                if (str.equals("public_account_change_cold")) {
                    c = 4;
                    break;
                }
                break;
            case -1572426030:
                if (str.equals("notification_clod")) {
                    c = 2;
                    break;
                }
                break;
            case -1175107840:
                if (str.equals("email_tab_hot")) {
                    c = 5;
                    break;
                }
                break;
            case 222912038:
                if (str.equals("public_account_change_hot")) {
                    c = 3;
                    break;
                }
                break;
            case 1611849465:
                if (str.equals("notification_hot")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.f107607f = "email_tab";
            this.f107606e = "cold_start";
        } else if (c == 1) {
            this.f107607f = "notification";
            this.f107606e = "hot_start";
        } else if (c == 2) {
            this.f107607f = "notification";
            this.f107606e = "cold_start";
        } else if (c == 3) {
            this.f107607f = "public_account_change";
            this.f107606e = "hot_start";
        } else if (c != 4) {
            this.f107607f = "email_tab";
            this.f107606e = "hot_start";
        } else {
            this.f107607f = "public_account_change";
            this.f107606e = "cold_start";
        }
        return new HashMap<String, JSONObject>(C43767j.m173489a().mo155932a("biz", Biz.Mail).mo155932a("scene", Scene.MailFMP).mo155933a("page", "fmp").mo155932a("need_net", (Object) true).mo155934a(), C43767j.m173489a().mo155932a("event", Event.mail_fmp_load).mo155934a()) {
            /* class com.ss.android.lark.mail.impl.p2171h.p2173b.C42286k.C422893 */
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
    /* renamed from: b */
    public synchronized void mo152379b(AbstractC42251b.C42254b bVar, AbstractC42251b<C42241h>.C42252a aVar) {
        super.mo152379b(bVar, aVar);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42251b
    /* renamed from: c */
    public void mo152382c(AbstractC42251b.C42254b bVar, AbstractC42251b<C42241h>.C42252a aVar) {
        char c;
        String str = aVar.f107589l;
        switch (str.hashCode()) {
            case -2068756565:
                if (str.equals("email_tab_clod")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1679810517:
                if (str.equals("public_account_change_cold")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1572426030:
                if (str.equals("notification_clod")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1175107840:
                if (str.equals("email_tab_hot")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 222912038:
                if (str.equals("public_account_change_hot")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1611849465:
                if (str.equals("notification_hot")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.f107607f = "email_tab";
            this.f107606e = "cold_start";
        } else if (c == 1) {
            this.f107607f = "notification";
            this.f107606e = "hot_start";
        } else if (c == 2) {
            this.f107607f = "notification";
            this.f107606e = "cold_start";
        } else if (c == 3) {
            this.f107607f = "public_account_change";
            this.f107606e = "hot_start";
        } else if (c != 4) {
            this.f107607f = "email_tab";
            this.f107606e = "hot_start";
        } else {
            this.f107607f = "public_account_change";
            this.f107606e = "cold_start";
        }
        ((C42205h) C42343c.m169090a(C42205h.class)).mo152306d(C43767j.m173489a().mo155931a("error_code", mo152388f()).mo155933a("scene_type", this.f107607f).mo155933a("mode", this.f107606e).mo155931a("from_db", this.f107610i).mo155932a("has_preload_label_list", Boolean.valueOf(this.f107608g)).mo155933a("debug_message", mo152389g()).mo155932a("has_preload_thread_list", Boolean.valueOf(this.f107609h)).mo155933a("mail_status", this.f107569b.f107576a).mo155934a());
    }
}
