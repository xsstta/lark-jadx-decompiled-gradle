package com.bytedance.ee.bear.banner.p247b;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReport;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.banner.b.e */
public class C4325e extends C4319a {
    /* renamed from: a */
    private void m17861a(C10917c cVar) {
        TemplateReport.f31011b.mo44233c("from_onboarding_banner");
        C8292f.m34152a((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class), "home", "", "onboarding_doc");
    }

    @Override // com.bytedance.ee.bear.banner.p247b.C4319a, com.ss.android.lark.banner.export.AbstractC29483d
    /* renamed from: a */
    public boolean mo16930a(View view, String str) {
        C10917c cVar = new C10917c(new C10929e());
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("ojbType");
            String queryParameter2 = parse.getQueryParameter("templateObjToken");
            if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
                m17861a(cVar);
            } else {
                C8241g.m33838a(view.getContext(), queryParameter2, Integer.parseInt(queryParameter), true, true, false, new C8237e(cVar, "", "home", "docs_manage"), null, true);
            }
        } else {
            m17861a(cVar);
        }
        return super.mo16930a(view, str);
    }
}
