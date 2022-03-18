package com.bytedance.ee.bear.slide.common.export;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.slide.common.export.e */
public class C11409e {

    /* renamed from: a */
    private DocViewModel f30653a;

    /* renamed from: b */
    private AbstractC5233x f30654b;

    /* renamed from: b */
    private String m47370b() {
        return String.valueOf(this.f30653a.isOwner());
    }

    /* renamed from: c */
    private String m47371c() {
        return String.valueOf(this.f30653a.isCanEdit());
    }

    /* renamed from: d */
    private String m47372d() {
        BearUrl bearUrl = this.f30653a.getBearUrl();
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17447b)) {
            return C13598b.m55197d(bearUrl.f17447b);
        }
        return "error";
    }

    /* renamed from: e */
    private String m47373e() {
        BearUrl bearUrl = this.f30653a.getBearUrl();
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17446a)) {
            return bearUrl.f17446a;
        }
        return "error";
    }

    /* renamed from: a */
    private Map<String, String> m47369a() {
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", m47372d());
        hashMap.put("file_type", m47373e());
        hashMap.put("is_owner", m47370b());
        return hashMap;
    }

    public C11409e(DocViewModel docViewModel, AbstractC5233x xVar) {
        this.f30653a = docViewModel;
        this.f30654b = xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43669a(String str, String str2, String str3, String str4, String str5) {
        if (this.f30653a == null || this.f30654b == null) {
            C13479a.m54775e("SlideExportAnalytic", "reportClickExport bad state");
            return;
        }
        C13479a.m54772d("SlideExportAnalytic", "reportClickExport()...");
        Map<String, String> a = m47369a();
        a.put("module", m47373e());
        a.put("export", str);
        a.put("is_editor", m47371c());
        a.put("export_file_type", str);
        a.put("export_file_size", str2);
        a.put("export_file_amount", str3);
        a.put("status_code", str4);
        a.put("status_name", str5);
        this.f30654b.mo21079a("click_export", a);
    }
}
