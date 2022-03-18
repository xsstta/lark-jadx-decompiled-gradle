package com.bytedance.ee.bear.doc.blockeditpanel;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.a */
public class C5340a {

    /* renamed from: a */
    private BearUrl f15243a;

    /* renamed from: b */
    private AbstractC5233x f15244b;

    /* renamed from: a */
    public void mo21375a() {
        m21796a("pulling_down");
    }

    /* renamed from: b */
    public void mo21376b() {
        m21796a("button_click");
    }

    /* renamed from: c */
    public void mo21377c() {
        m21796a("menu_back");
    }

    /* renamed from: d */
    private String m21797d() {
        BearUrl bearUrl = this.f15243a;
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17447b)) {
            return C13598b.m55197d(this.f15243a.f17447b);
        }
        return "ERR";
    }

    /* renamed from: e */
    private String m21798e() {
        BearUrl bearUrl = this.f15243a;
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17446a)) {
            return this.f15243a.f17446a;
        }
        return "ERR";
    }

    /* renamed from: a */
    private void m21796a(String str) {
        if (this.f15244b != null) {
            C13479a.m54764b("BlockEditPanelAnalytic", "report:" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", m21797d());
            String e = m21798e();
            hashMap.put("file_type", e);
            hashMap.put("module", e);
            hashMap.put("action_source", str);
            C13479a.m54772d("BlockEditPanelAnalytic", "report param:" + hashMap);
            this.f15244b.mo21079a("ccm_block_close", hashMap);
        }
    }

    public C5340a(BearUrl bearUrl, AbstractC5233x xVar) {
        this.f15243a = bearUrl;
        this.f15244b = xVar;
    }
}
