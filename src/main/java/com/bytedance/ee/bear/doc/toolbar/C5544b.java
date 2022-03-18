package com.bytedance.ee.bear.doc.toolbar;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.doc.toolbar.b */
public class C5544b {

    /* renamed from: a */
    private BearUrl f15773a;

    /* renamed from: b */
    private AbstractC5233x f15774b;

    /* renamed from: a */
    private void m22510a() {
        m22511a("highlight_cancel", null);
    }

    /* renamed from: b */
    private String m22512b() {
        BearUrl bearUrl = this.f15773a;
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17447b)) {
            return C13598b.m55197d(this.f15773a.f17447b);
        }
        return "ERR";
    }

    /* renamed from: c */
    private String m22513c() {
        BearUrl bearUrl = this.f15773a;
        if (bearUrl != null && !TextUtils.isEmpty(bearUrl.f17446a)) {
            return this.f15773a.f17446a;
        }
        return "ERR";
    }

    /* renamed from: a */
    public void mo22137a(String str) {
        if (TextUtils.equals(str, "#clear")) {
            m22510a();
        } else {
            m22511a("highlight_default", str);
        }
    }

    /* renamed from: b */
    public void mo22138b(String str) {
        if (TextUtils.equals(str, "#clear")) {
            m22510a();
        } else {
            m22511a("highlight_switch_color", str);
        }
    }

    public C5544b(BearUrl bearUrl, AbstractC5233x xVar) {
        this.f15773a = bearUrl;
        this.f15774b = xVar;
    }

    /* renamed from: a */
    private void m22511a(String str, String str2) {
        if (this.f15774b != null) {
            C13479a.m54772d("DocToolbarAnalytic", "report:" + str + ",color:" + str2);
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            hashMap.put("file_id", m22512b());
            String c = m22513c();
            hashMap.put("file_type", c);
            hashMap.put("module", c);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("op_item", str2);
            }
            this.f15774b.mo21079a("toggle_attribute", hashMap);
        }
    }
}
