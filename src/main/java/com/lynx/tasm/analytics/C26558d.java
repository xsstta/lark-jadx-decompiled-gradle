package com.lynx.tasm.analytics;

import android.util.Log;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.C26880a;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.lynx.tasm.analytics.d */
public final class C26558d {

    /* renamed from: a */
    public static AbstractC26555a f65670a;

    /* renamed from: b */
    private static final HashSet<String> f65671b = new HashSet() {
        /* class com.lynx.tasm.analytics.C26558d.C265591 */

        {
            add("lynx_rapid_render_error");
        }
    };

    private C26558d() {
    }

    /* renamed from: a */
    public static void m96280a(AbstractC26555a aVar) {
        f65670a = aVar;
    }

    /* renamed from: a */
    private static void m96281a(Runnable runnable) {
        try {
            C26880a.m97713a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m96282a(String str) {
        Log.i("lynx_rapidRender", str);
        LLog.m96425c("lynx_rapidRender", str);
    }

    /* renamed from: a */
    public static String m96279a(String str, String... strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("{");
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(";");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m96283a(final String str, final AbstractC26556b bVar) {
        m96281a(new Runnable() {
            /* class com.lynx.tasm.analytics.C26558d.RunnableC265613 */

            public void run() {
                C26558d.m96285a(str, bVar.mo94366a());
            }
        });
    }

    /* renamed from: a */
    public static void m96285a(String str, JSONObject jSONObject) {
        if (jSONObject != null && f65670a != null) {
            if (f65671b.contains(str)) {
                f65670a.mo53856a(str, jSONObject);
            } else {
                f65670a.mo53857b(str, jSONObject);
            }
            m96282a(m96279a(str, jSONObject.toString()));
        }
    }

    /* renamed from: a */
    public static void m96284a(final String str, final String str2, final Object obj) {
        m96281a(new Runnable() {
            /* class com.lynx.tasm.analytics.C26558d.RunnableC265602 */

            public void run() {
                JSONObject jSONObject = new JSONObject();
                C26558d.m96286a(jSONObject, str2, obj);
                C26558d.m96285a(str, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static void m96286a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
            m96282a(m96279a("lynx_ZeroCola", e.toString()));
        }
    }
}
