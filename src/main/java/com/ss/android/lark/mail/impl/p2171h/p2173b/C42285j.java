package com.ss.android.lark.mail.impl.p2171h.p2173b;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a;
import com.ss.android.lark.mail.impl.p2171h.p2173b.p2174a.C42241h;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.utils.C43767j;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.b.j */
public class C42285j extends AbstractC42231a<C42241h> {

    /* renamed from: d */
    private String f107599d;

    /* renamed from: e */
    private String f107600e;

    /* renamed from: f */
    private boolean f107601f;

    /* renamed from: g */
    private boolean f107602g;

    /* renamed from: h */
    private boolean f107603h;

    /* renamed from: i */
    private boolean f107604i;

    /* renamed from: j */
    private boolean f107605j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: d */
    public String mo152326d() {
        return "email_apm_fmp_start";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: e */
    public String mo152328e() {
        return "email_apm_fmp";
    }

    /* renamed from: g */
    public void mo152410g() {
        this.f107601f = true;
    }

    /* renamed from: h */
    public void mo152412h() {
        this.f107602g = true;
    }

    /* renamed from: a */
    public void mo152409a(boolean z) {
        this.f107603h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C42241h mo152324c(String str) {
        return new C42241h(TextUtils.equals(str, "cold_start"));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: a */
    public JSONObject mo152315a(AbstractC42231a<C42241h>.C42232a aVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        String str;
        if (aVar == null) {
            return null;
        }
        String str2 = aVar.f107521j;
        char c = 65535;
        switch (str2.hashCode()) {
            case -2068756565:
                if (str2.equals("email_tab_clod")) {
                    c = 2;
                    break;
                }
                break;
            case -1572426030:
                if (str2.equals("notification_clod")) {
                    c = 4;
                    break;
                }
                break;
            case -1175107840:
                if (str2.equals("email_tab_hot")) {
                    c = 0;
                    break;
                }
                break;
            case 1611849465:
                if (str2.equals("notification_hot")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 2) {
            this.f107600e = "email_tab";
            this.f107599d = "cold_start";
        } else if (c == 3) {
            this.f107600e = "notification";
            this.f107599d = "hot_start";
        } else if (c != 4) {
            this.f107600e = "email_tab";
            this.f107599d = "hot_start";
        } else {
            this.f107600e = "notification";
            this.f107599d = "cold_start";
        }
        C42241h hVar = (C42241h) mo152330f();
        C43767j.C43768a a = C43767j.m173489a().mo155933a("sence", this.f107600e).mo155933a("mode", this.f107599d).mo155930a("time_cost_ms", (float) aVar.f107512c).mo155933a(UpdateKey.STATUS, aVar.f107510a).mo155932a("has_preload_label_list", Boolean.valueOf(this.f107601f)).mo155932a("has_preload_thread_list", Boolean.valueOf(this.f107602g));
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (hVar != null) {
            f = (float) hVar.mo152340b("key_page_finish_create_view");
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a2 = a.mo155930a("create_view_cost_time", f);
        if (hVar != null) {
            f2 = (float) hVar.mo152340b("key_page_finish_on_resume");
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a3 = a2.mo155930a("on_resume_cost_time", f2);
        if (hVar != null) {
            f3 = (float) hVar.mo152340b("key_finish_load_label_list");
        } else {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a4 = a3.mo155930a("load_label_list_cost_time", f3);
        if (hVar != null) {
            f4 = (float) hVar.mo152340b("key_finish_load_thread_list");
        } else {
            f4 = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a5 = a4.mo155930a("load_thread_list_cost_time", f4);
        if (hVar != null) {
            f5 = (float) hVar.mo152340b("key_set_adapter_data");
        } else {
            f5 = BitmapDescriptorFactory.HUE_RED;
        }
        C43767j.C43768a a6 = a5.mo155930a("set_adapter_data_cost_time", f5);
        if (hVar != null) {
            f6 = (float) hVar.mo152340b("key_finish");
        }
        C43767j.C43768a a7 = a6.mo155930a("display_cost_time", f6).mo155931a("from_db", this.f107603h ? 1 : 0);
        if (C43350d.m172098a().mo155056v()) {
            str = "conversational";
        } else {
            str = "traditional";
        }
        return a7.mo155933a("mail_display_type", str).mo155931a("has_first_label_cache", this.f107604i ? 1 : 0).mo155931a("preload_with_unread_mail", this.f107605j ? 1 : 0).mo155934a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.p2171h.p2173b.AbstractC42231a
    /* renamed from: b */
    public synchronized void mo152320b(AbstractC42231a.C42234b bVar, AbstractC42231a<C42241h>.C42232a aVar) {
        if (this.f107507b != null && this.f107507b.f107512c > 0 && TextUtils.equals(bVar.f107521j, "email_tab_clod") && C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("latency", Long.valueOf(this.f107507b.f107512c));
                if (this.f107508c != null) {
                    for (Map.Entry<String, Long> entry : ((C42241h) this.f107508c).mo152343d().entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                MonitorUtils.monitorEvent("mail_startup_time", null, jSONObject, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.mo152320b(bVar, aVar);
    }
}
