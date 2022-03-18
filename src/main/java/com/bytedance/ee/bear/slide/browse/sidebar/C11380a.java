package com.bytedance.ee.bear.slide.browse.sidebar;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.slide.browse.sidebar.a */
public class C11380a {

    /* renamed from: a */
    private DocViewModel f30571a;

    /* renamed from: b */
    private AbstractC5233x f30572b;

    /* renamed from: c */
    private String m47229c() {
        return String.valueOf(this.f30571a.isOwner());
    }

    /* renamed from: d */
    private String m47230d() {
        BearUrl bearUrl = this.f30571a.getBearUrl();
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17447b)) {
            return C13598b.m55197d(bearUrl.f17447b);
        }
        return "error";
    }

    /* renamed from: e */
    private String m47231e() {
        BearUrl bearUrl = this.f30571a.getBearUrl();
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17446a)) {
            return bearUrl.f17446a;
        }
        return "error";
    }

    /* renamed from: b */
    private Map<String, String> m47228b() {
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", m47230d());
        hashMap.put("file_type", m47231e());
        hashMap.put("is_owner", m47229c());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo43554a() {
        if (this.f30571a == null || this.f30572b == null) {
            C13479a.m54775e("SlideSideBarAnalytic", "reportDragNavHandler bad state");
            return;
        }
        C13479a.m54772d("SlideSideBarAnalytic", "reportDragNavHandler");
        this.f30572b.mo21079a("click_nav_catalog", m47228b());
    }

    public C11380a(DocViewModel docViewModel, AbstractC5233x xVar) {
        this.f30571a = docViewModel;
        this.f30572b = xVar;
    }
}
