package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.C2637b;
import com.bytedance.android.monitor.p104a.AbstractC2633e;
import com.bytedance.android.monitor.p112i.C2657e;
import com.bytedance.android.monitor.webview.p118b.AbstractC2680a;
import com.bytedance.android.monitor.webview.p118b.AbstractC2683c;
import com.bytedance.android.monitor.webview.p118b.AbstractC2684d;
import com.bytedance.android.monitor.webview.p118b.AbstractC2685e;
import com.bytedance.android.monitor.webview.p118b.AbstractC2686f;
import com.bytedance.android.monitor.webview.p118b.AbstractC2687g;
import com.bytedance.android.monitor.webview.p118b.AbstractC2688h;
import com.bytedance.android.monitor.webview.p118b.AbstractC2689i;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c */
public interface AbstractC2690c extends AbstractC2680a, AbstractC2683c, AbstractC2684d, AbstractC2685e, AbstractC2687g, AbstractC2688h, AbstractC2689i {
    /* renamed from: a */
    void mo11591a(WebView webView);

    /* renamed from: a */
    void mo11592a(boolean z);

    /* renamed from: b */
    void mo11593b(WebView webView);

    /* renamed from: com.bytedance.android.monitor.webview.c$a */
    public static class C2691a {

        /* renamed from: A */
        JSONObject f8525A = new JSONObject();

        /* renamed from: a */
        String f8526a;

        /* renamed from: b */
        AbstractC2701d f8527b;

        /* renamed from: c */
        AbstractC2679b f8528c;

        /* renamed from: d */
        AbstractC2686f f8529d;

        /* renamed from: e */
        String[] f8530e;

        /* renamed from: f */
        String[] f8531f;

        /* renamed from: g */
        String f8532g;

        /* renamed from: h */
        AbstractC2633e f8533h;

        /* renamed from: i */
        AbstractC2677a f8534i;

        /* renamed from: j */
        String f8535j = "";

        /* renamed from: k */
        boolean f8536k;

        /* renamed from: l */
        boolean f8537l = true;

        /* renamed from: m */
        boolean f8538m = true;

        /* renamed from: n */
        boolean f8539n = true;

        /* renamed from: o */
        boolean f8540o = true;

        /* renamed from: p */
        boolean f8541p = true;

        /* renamed from: q */
        boolean f8542q;

        /* renamed from: r */
        boolean f8543r;

        /* renamed from: s */
        boolean f8544s;

        /* renamed from: t */
        String f8545t = "loc_after_detach";

        /* renamed from: u */
        boolean f8546u = true;

        /* renamed from: v */
        String f8547v = "";

        /* renamed from: w */
        String f8548w = "";

        /* renamed from: x */
        AbstractC2685e f8549x;

        /* renamed from: y */
        int f8550y = 100;

        /* renamed from: z */
        String f8551z = "";

        C2691a() {
        }

        /* renamed from: a */
        public C2691a mo11597a(boolean z) {
            this.f8542q = z;
            return this;
        }

        /* renamed from: b */
        public C2691a mo11599b(boolean z) {
            this.f8546u = z;
            return this;
        }

        /* renamed from: c */
        public C2691a mo11600c(boolean z) {
            this.f8543r = z;
            return this;
        }

        /* renamed from: d */
        public C2691a mo11601d(boolean z) {
            this.f8544s = z;
            return this;
        }

        /* renamed from: a */
        public C2691a mo11594a(AbstractC2677a aVar) {
            this.f8534i = aVar;
            this.f8533h = new C2637b(aVar);
            return this;
        }

        /* renamed from: a */
        public C2691a mo11595a(String str) {
            this.f8551z = str;
            if (this.f8536k) {
                this.f8551z = "live";
            }
            return this;
        }

        /* renamed from: a */
        public C2691a mo11598a(WebView... webViewArr) {
            if (webViewArr != null && webViewArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (WebView webView : webViewArr) {
                    if (webView != null) {
                        arrayList.add(C2711i.m11480a().mo11570t(webView));
                    }
                }
                this.f8531f = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            return this;
        }

        /* renamed from: a */
        public C2691a mo11596a(String str, Object obj) {
            C2657e.m11174a(this.f8525A, str, obj.toString());
            return this;
        }
    }
}
