package com.bytedance.ee.bear.document.bridgestatus;

import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.bridgestatus.d */
public class C5680d {

    /* renamed from: a */
    private WebView f16051a;

    /* renamed from: b */
    private boolean f16052b;

    /* renamed from: c */
    private Map<String, Boolean> f16053c = new HashMap();

    /* renamed from: d */
    private List<String> f16054d = new ArrayList();

    /* renamed from: a */
    public void mo22704a() {
        this.f16052b = true;
        if (this.f16054d.isEmpty()) {
            m23034b(this.f16054d);
        } else {
            m23033a(this.f16054d);
        }
    }

    /* renamed from: b */
    public void mo22706b() {
        this.f16052b = false;
        this.f16053c.clear();
        if (DocOpenConfig.m22766g().doc) {
            this.f16054d.add(C8275a.f22371d.mo32553a());
        }
        if (DocOpenConfig.m22766g().sheet) {
            this.f16054d.add(C8275a.f22372e.mo32553a());
        }
        if (DocOpenConfig.m22766g().mindnote) {
            this.f16054d.add(C8275a.f22374g.mo32553a());
        }
        if (DocOpenConfig.m22766g().wiki) {
            this.f16054d.add(C8275a.f22377j.mo32553a());
        }
        if (DocOpenConfig.m22766g().slide) {
            this.f16054d.add(C8275a.f22376i.mo32553a());
        }
        if (DocOpenConfig.m22766g().bitable) {
            this.f16054d.add(C8275a.f22373f.mo32553a());
        }
        if (DocOpenConfig.m22766g().docx) {
            this.f16054d.add(C8275a.f22378k.mo32553a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23032a(JSONObject jSONObject) {
        C11755a.m48725a(this.f16051a, "javascript:preloadJsModule", jSONObject);
    }

    public C5680d(WebView webView) {
        this.f16051a = webView;
        mo22706b();
    }

    /* renamed from: b */
    private void m23034b(List<String> list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, (Object) list);
        C13479a.m54764b("BridgeStatusHelper", "callPreloadJsModule  param: " + jSONObject);
        C13748k.m55732a(new Runnable(jSONObject) {
            /* class com.bytedance.ee.bear.document.bridgestatus.$$Lambda$d$ovwjXgavp7SjjVi__LbOCz7_s */
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C5680d.this.m23032a((C5680d) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo22705a(String str) {
        if (this.f16052b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m23033a(arrayList);
        } else if (!this.f16054d.contains(str)) {
            this.f16054d.add(str);
        }
    }

    /* renamed from: a */
    private void m23033a(List<String> list) {
        if (!(this.f16051a == null || list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (this.f16053c.get(str) == null) {
                    arrayList.add(str);
                    this.f16053c.put(str, true);
                }
            }
            if (!arrayList.isEmpty()) {
                m23034b(arrayList);
            }
        }
    }
}
