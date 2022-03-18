package com.ss.android.lark.mail.impl.p2171h.p2173b;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42245l;
import com.ss.android.lark.mail.impl.utils.C43767j;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.p */
public class C42305p extends AbstractC42231a<C42245l> {

    /* renamed from: d */
    private int f107617d = -1;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "email_apm_messagelist_load_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_messagelist_load";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public boolean mo152329e(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public boolean mo152322b() {
        if (!super.mo152322b() || this.f107788m == null || ((AbstractC42231a.C42234b) this.f107788m).f107521j == "swipe_thread") {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C42245l mo152324c(String str) {
        return new C42245l();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<C42245l>.C42232a aVar) {
        int i;
        C42245l lVar = (C42245l) mo152330f();
        C43767j.C43768a a = C43767j.m173489a().mo155933a("sence", aVar.f107521j).mo155930a("mail_body_length", (float) aVar.f107511b).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a);
        if (lVar == null || lVar.mo152365g()) {
            i = 0;
        } else {
            i = 1;
        }
        return a.mo155931a("from_db", i).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152320b(AbstractC42231a.C42234b bVar, AbstractC42231a<C42245l>.C42232a aVar) {
        int i;
        if (this.f107507b != null && this.f107507b.f107512c > 0 && C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("latency", Long.valueOf(this.f107507b.f107512c));
                if (this.f107508c != null) {
                    jSONObject.putOpt("rust", Long.valueOf(((C42245l) this.f107508c).mo152340b("key_get_rust_data_success")));
                    jSONObject.putOpt("parse_html", Long.valueOf(((C42245l) this.f107508c).mo152340b("key_parse_html_finish")));
                    jSONObject.putOpt("render", Long.valueOf(((C42245l) this.f107508c).mo152340b("key_render_page_finish")));
                    jSONObject.putOpt("init_web_view", Long.valueOf(((C42245l) this.f107508c).mo152364f()));
                }
                JSONObject jSONObject2 = new JSONObject();
                if (this.f107508c == null || ((C42245l) this.f107508c).mo152365g()) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject2.putOpt("from_db", Integer.valueOf(i));
                MonitorUtils.monitorEvent("mail_open_thread_time", jSONObject2, jSONObject, jSONObject2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152320b(bVar, aVar);
    }
}
