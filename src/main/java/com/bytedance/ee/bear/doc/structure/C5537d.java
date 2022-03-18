package com.bytedance.ee.bear.doc.structure;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.doc.structure.d */
public class C5537d {

    /* renamed from: a */
    private DocViewModel f15761a;

    /* renamed from: b */
    private AbstractC5233x f15762b;

    /* renamed from: c */
    private boolean f15763c;

    C5537d() {
    }

    /* renamed from: e */
    private String m22487e() {
        return String.valueOf(this.f15761a.isOwner());
    }

    /* renamed from: f */
    private String m22488f() {
        BearUrl bearUrl = this.f15761a.getBearUrl();
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17447b)) {
            return C13598b.m55197d(bearUrl.f17447b);
        }
        return "ERR";
    }

    /* renamed from: g */
    private String m22489g() {
        BearUrl bearUrl = this.f15761a.getBearUrl();
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17446a)) {
            return bearUrl.f17446a;
        }
        return "ERR";
    }

    /* renamed from: d */
    private Map<String, String> m22486d() {
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", m22488f());
        hashMap.put("file_type", m22489g());
        hashMap.put("is_owner", m22487e());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22102a() {
        if (this.f15761a == null || this.f15762b == null) {
            C13479a.m54775e("StructureAnalytic", "reportOpenFloatingStructure bad state");
            return;
        }
        C13479a.m54772d("StructureAnalytic", "reportOpenFloatingStructure");
        this.f15762b.mo21079a("show_nav_catalog", m22486d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo22106c() {
        if (this.f15761a == null || this.f15762b == null) {
            C13479a.m54775e("StructureAnalytic", "reportClickFixedStructureItem bad state");
            return;
        }
        C13479a.m54772d("StructureAnalytic", "reportClickFixedStructureItem:" + this.f15763c);
        this.f15762b.mo21079a("click_outline_catalog_item", m22485b(this.f15763c));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo22105b() {
        if (this.f15761a == null || this.f15762b == null) {
            C13479a.m54775e("StructureAnalytic", "reportClickFloatingStructureItem bad state");
            return;
        }
        C13479a.m54772d("StructureAnalytic", "reportClickFloatingStructureItem");
        this.f15762b.mo21079a("click_nav_catalog_item", m22486d());
    }

    /* renamed from: b */
    private Map<String, String> m22485b(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", m22488f());
        hashMap.put("file_type", m22489g());
        hashMap.put("is_owner", m22487e());
        if (z) {
            str = "nav_catalog";
        } else {
            str = "more";
        }
        hashMap.put(ShareHitPoint.f121868c, str);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22104a(boolean z) {
        this.f15763c = z;
        if (this.f15761a == null || this.f15762b == null) {
            C13479a.m54775e("StructureAnalytic", "reportOpenFixedStructure bad state");
            return;
        }
        C13479a.m54772d("StructureAnalytic", "reportOpenFixedStructure:" + z);
        this.f15762b.mo21079a("show_outline_catalog", m22485b(z));
    }

    /* renamed from: a */
    public void mo22103a(DocViewModel docViewModel, AbstractC5233x xVar) {
        this.f15761a = docViewModel;
        this.f15762b = xVar;
    }
}
