package p001a.p002a.p008b.p009a;

import android.util.Base64;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;
import p001a.p002a.p003a.p005b.C0030c;

/* renamed from: a.a.b.a.a */
public class C0032a {

    /* renamed from: d */
    private static volatile C0032a f51d;

    /* renamed from: a */
    protected int f52a = 504;

    /* renamed from: b */
    protected boolean f53b = false;

    /* renamed from: c */
    protected String f54c = "";

    private C0032a() {
    }

    /* renamed from: a */
    public static C0032a m55a() {
        if (f51d == null) {
            synchronized (C0032a.class) {
                if (f51d == null) {
                    f51d = new C0032a();
                }
            }
        }
        return f51d;
    }

    /* renamed from: b */
    public static String m56b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "1.0.3");
            if (m55a().f53b) {
                jSONObject.put("token_id", m55a().f54c);
            } else {
                jSONObject.put("token_id", "");
            }
            jSONObject.put("code", m55a().f52a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused) {
            C0030c.m48a("Call onEvent Error");
            return "";
        }
    }
}
