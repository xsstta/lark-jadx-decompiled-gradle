package com.bytedance.ee.bear.document.at;

import android.util.Log;
import com.bytedance.ee.bear.at.AbstractC4241h;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.at.a */
public class C5661a implements AbstractC4241h {

    /* renamed from: a */
    private Map<String, Object> f16012a = new HashMap();

    /* renamed from: b */
    private AbstractC5233x f16013b;

    /* renamed from: c */
    private C4520c f16014c;

    /* renamed from: d */
    private String f16015d = "toolbar";

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: b */
    public void mo16675b() {
        this.f16012a.clear();
    }

    /* renamed from: c */
    private Map<String, Object> m22958c() {
        HashMap hashMap = new HashMap();
        m22956b(hashMap);
        m22959c(hashMap);
        hashMap.put("target", "none");
        return hashMap;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: a */
    public void mo16669a() {
        Map<String, Object> c = m22958c();
        Log.d("AtAnalytic", "ccm_mention_panel_view, params = " + c);
        this.f16013b.mo21084b("ccm_mention_panel_view", c);
    }

    /* renamed from: d */
    private void m22960d() {
        String a = C10599b.m43899a(this.f16014c.mo17415c()).mo32553a();
        this.f16012a.put("module", a);
        if (this.f16014c.mo17418f() != 0) {
            a = C8275a.m34050a(this.f16014c.mo17418f());
        }
        this.f16012a.put("file_type", a);
        this.f16012a.put("file_id", C13598b.m55197d(this.f16014c.mo17414b()));
        if (!this.f16012a.containsKey("zone")) {
            this.f16012a.put("zone", this.f16014c.mo17416d());
        }
        this.f16012a.put(ShareHitPoint.f121868c, this.f16015d);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: a */
    public void mo16672a(C4520c cVar) {
        this.f16014c = cVar;
    }

    /* renamed from: b */
    private void m22957b(boolean z) {
        String str;
        if (z) {
            str = "toolbar";
        } else {
            str = "keyboard";
        }
        this.f16015d = str;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: a */
    public void mo16674a(boolean z) {
        m22957b(z);
        m22960d();
        this.f16013b.mo21079a("open_mention", this.f16012a);
    }

    public C5661a(AbstractC5233x xVar) {
        this.f16013b = xVar;
    }

    /* renamed from: b */
    private void m22956b(Map<String, Object> map) {
        for (Map.Entry<String, String> entry : this.f16013b.mo21083b("bizCommonParams").entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    private void m22959c(Map<String, Object> map) {
        HashMap<String, Object> c = this.f16013b.mo21086c("docCommonParams");
        if (!c.isEmpty()) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return;
        }
        for (Map.Entry<String, String> entry2 : this.f16013b.mo21083b("driveCommonParams").entrySet()) {
            map.put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: a */
    public void mo16670a(AtObject atObject) {
        boolean z;
        Map<String, Object> c = m22958c();
        c.put("click", "mention_confirm");
        c.put("mention_type", C10599b.m43910f(atObject.getType()));
        c.put("mention_obj_id", C13598b.m55197d(atObject.getToken()));
        c.put("domain", this.f16014c.mo17417e());
        if (16 == atObject.getType()) {
            z = true;
        } else {
            z = false;
        }
        c.put("is_wiki", String.valueOf(z));
        if (z) {
            c.put("wiki_token", C13598b.m55197d(atObject.getToken()));
        } else {
            c.put("wiki_token", "none");
        }
        Log.d("AtAnalytic", "ccm_mention_panel_click, params = " + c);
        this.f16013b.mo21084b("ccm_mention_panel_click", c);
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: a */
    public void mo16673a(Map<String, Object> map) {
        mo16675b();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.f16012a.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4241h
    /* renamed from: a */
    public void mo16671a(AtObject atObject, boolean z) {
        String str;
        m22957b(z);
        m22960d();
        int type = atObject.getType();
        if (type != 0) {
            if (!(type == 1 || type == 3)) {
                if (type == 5) {
                    str = "chat";
                } else if (!(type == 8 || type == 22 || type == 11 || type == 12 || type == 15 || type == 16)) {
                    str = "";
                }
            }
            str = "link_file";
        } else {
            if (atObject.getSource() == 1) {
                this.f16012a.put("recommend_source", "recent_view_user");
            } else if (atObject.getSource() == 2) {
                this.f16012a.put("recommend_source", "recent_mention_user");
            } else if (atObject.getSource() == 3) {
                this.f16012a.put("recommend_source", "lark_search_user");
            }
            str = "user";
        }
        this.f16012a.put("mention_type", str);
        this.f16012a.put("mention_sequence_num", Integer.valueOf(atObject.getSequenceNum()));
        if ("link_file".equals(str)) {
            this.f16012a.put("mention_sub_type", C10599b.m43909e(atObject.getType()));
        }
        this.f16013b.mo21079a("confirm_mention", this.f16012a);
    }
}
