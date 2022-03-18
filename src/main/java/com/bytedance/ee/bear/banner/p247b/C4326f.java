package com.bytedance.ee.bear.banner.p247b;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReport;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.banner.b.f */
public class C4326f extends C4319a {
    @Override // com.bytedance.ee.bear.banner.p247b.C4319a, com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        String str2;
        new C10917c(new C10929e());
        if (!TextUtils.isEmpty(str)) {
            str2 = Uri.parse(str).getQueryParameter("categeryID");
        } else {
            str2 = null;
        }
        TemplateReport.f31011b.mo44233c("from_onboarding_banner");
        C8292f.m34154a((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class), "home", "", "system", str2, "", "onboarding_doc");
        return super.mo16930a(view, str);
    }
}
