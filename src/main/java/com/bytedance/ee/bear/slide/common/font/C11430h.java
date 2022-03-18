package com.bytedance.ee.bear.slide.common.font;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.slide.common.font.h */
public class C11430h {

    /* renamed from: a */
    private AbstractC5233x f30738a;

    /* renamed from: b */
    private DocViewModel f30739b;

    /* renamed from: a */
    public void mo43796a() {
        this.f30739b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo43804f() {
        this.f30738a.mo21087d("SlideFontAnalytic");
    }

    /* renamed from: c */
    public void mo43801c() {
        Map<String, String> g = m47549g();
        if (g != null) {
            g.put("action", "retry");
            this.f30738a.mo21079a("client_slide_font", g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo43802d() {
        Map<String, String> g = m47549g();
        if (g != null) {
            g.put("action", "start_download");
            this.f30738a.mo21079a("dev_client_slide_font_download", g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo43803e() {
        Map<String, String> g = m47549g();
        if (g != null) {
            g.put("action", "download_success");
            this.f30738a.mo21079a("dev_client_slide_font_download", g);
        }
    }

    /* renamed from: b */
    public void mo43800b() {
        Map<String, String> g = m47549g();
        if (g != null) {
            g.put("action", "download");
            this.f30738a.mo21079a("client_slide_font", g);
        }
    }

    /* renamed from: g */
    private Map<String, String> m47549g() {
        if (this.f30738a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String a = C8275a.f22376i.mo32553a();
        DocViewModel docViewModel = this.f30739b;
        if (docViewModel != null) {
            hashMap.put("file_id", C13598b.m55197d(docViewModel.getToken()));
            if (!TextUtils.isEmpty(this.f30739b.getDocumentType())) {
                a = this.f30739b.getDocumentType();
            }
            hashMap.put("is_owner", String.valueOf(this.f30739b.isOwner()));
        }
        hashMap.put("file_type", a);
        hashMap.put("module", a);
        return hashMap;
    }

    /* renamed from: b */
    private void m47547b(String str) {
        AbstractC5233x xVar = this.f30738a;
        xVar.mo21078a("SlideFontAnalytic", str, SystemClock.uptimeMillis() + "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43798a(String str) {
        Map<String, String> g = m47549g();
        if (g != null) {
            g.put("action", "download_fail");
            g.put("fail_reason", str);
            this.f30738a.mo21079a("dev_client_slide_font_download", g);
        }
    }

    /* renamed from: a */
    public void mo43797a(DocViewModel docViewModel, AbstractC5233x xVar) {
        this.f30738a = xVar;
        this.f30739b = docViewModel;
    }

    /* renamed from: b */
    private void m47548b(String str, String str2, String str3) {
        long j;
        HashMap hashMap = new HashMap();
        String a = this.f30738a.mo21075a("SlideFontAnalytic", str);
        if (!TextUtils.isEmpty(a)) {
            j = SystemClock.uptimeMillis() - Long.parseLong(a);
        } else {
            j = 0;
        }
        hashMap.put("stage", str);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.valueOf(j));
        hashMap.put("md5", str2);
        hashMap.put("data_from", "cdn");
        hashMap.put("length", str3);
        this.f30738a.mo21079a("dev_performance_font_download_stage", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43799a(String str, String str2, String str3) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1330236551:
                if (str.equals("network_download")) {
                    c = 0;
                    break;
                }
                break;
            case 110549828:
                if (str.equals("total")) {
                    c = 1;
                    break;
                }
                break;
            case 1637007091:
                if (str.equals("get_fileinfo")) {
                    c = 2;
                    break;
                }
                break;
            case 2122624156:
                if (str.equals("file_verify")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m47548b("get_fileinfo", str2, str3);
                m47547b("network_download");
                return;
            case 1:
                m47548b("file_verify", str2, str3);
                m47548b("total", str2, str3);
                return;
            case 2:
                this.f30738a.mo21077a("SlideFontAnalytic");
                m47547b("total");
                m47547b("get_fileinfo");
                return;
            case 3:
                m47548b("network_download", str2, str3);
                m47547b("file_verify");
                return;
            default:
                return;
        }
    }
}
