package com.bytedance.lynx.webview.internal;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.bytedance.lynx.webview.util.C20040b;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.internal.w */
public class C19999w {

    /* renamed from: a */
    public Context f48853a;

    /* renamed from: b */
    private ViewGroup f48854b;

    /* renamed from: c */
    private C20001x f48855c;

    /* renamed from: d */
    private boolean f48856d = true;

    /* renamed from: e */
    private boolean f48857e;

    /* renamed from: b */
    private C20001x m72962b() {
        if (this.f48855c == null) {
            this.f48855c = new C20001x(this.f48853a);
            this.f48855c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        return this.f48855c;
    }

    /* renamed from: a */
    public boolean mo67883a() {
        if (this.f48856d) {
            return false;
        }
        this.f48856d = true;
        this.f48854b.removeView(m72962b());
        return true;
    }

    public C19999w(ViewGroup viewGroup) {
        this.f48854b = viewGroup;
        boolean z = true;
        this.f48853a = viewGroup.getContext();
        if (!C19986s.m72924a().mo67856a("sdk_enable_debug_page") && !C20040b.m73122a(this.f48853a)) {
            z = false;
        }
        this.f48857e = z;
    }

    /* renamed from: b */
    private JSONObject m72963b(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : queryParameterNames) {
                jSONObject.put(str2, parse.getQueryParameter(str2));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public boolean mo67884a(String str) {
        if (!this.f48857e) {
            return false;
        }
        if (str.startsWith("ttwebsdk.bytedance.com") || str.startsWith("https://ttwebsdk.bytedance.com")) {
            JSONObject b = m72963b(str);
            if (b.length() > 0) {
                C19941e.m72704a().mo67720a(true);
                C19951h.m72733a().mo67743b(b);
                String e = C20011y.m72976a().mo67939v().mo67830e();
                String str2 = null;
                try {
                    str2 = b.getString("sdk_upto_so_md5");
                } catch (JSONException unused) {
                }
                if (str2 != null && !e.equals(str2)) {
                    C20011y.m72998c(new Runnable() {
                        /* class com.bytedance.lynx.webview.internal.C19999w.RunnableC200001 */

                        public void run() {
                            Toast.makeText(C19999w.this.f48853a, "开始下载内核。", 0).show();
                        }
                    });
                    C19986s.m72924a().mo67855a(true);
                }
            }
            if (this.f48856d) {
                this.f48856d = false;
                this.f48854b.addView(m72962b());
            }
            return true;
        }
        if (!this.f48856d) {
            this.f48856d = true;
            this.f48854b.removeView(m72962b());
        }
        return false;
    }
}
