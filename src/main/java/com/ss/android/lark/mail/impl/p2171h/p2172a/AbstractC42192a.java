package com.ss.android.lark.mail.impl.p2171h.p2172a;

import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.h.a.a */
public abstract class AbstractC42192a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract JSONObject mo152303a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract JSONObject mo152304b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract JSONObject mo152305c(JSONObject jSONObject);

    /* renamed from: a */
    private ErrorType m168580a(int i) {
        if (i == 0) {
            return ErrorType.Unknown;
        }
        if (i == 10008 || i == 10018) {
            return ErrorType.Network;
        }
        return ErrorType.SDK;
    }

    /* renamed from: d */
    public void mo152306d(JSONObject jSONObject) {
        JSONObject a = mo152303a(jSONObject);
        JSONObject b = mo152304b(jSONObject);
        JSONObject c = mo152305c(jSONObject);
        int optInt = jSONObject.optInt("error_code");
        ErrorType a2 = m168580a(optInt);
        try {
            m168581a(a, "error_message", jSONObject.opt("error_message"), "");
            m168581a(a, "error_code", Integer.valueOf(optInt), 0);
            m168581a(a, "level", jSONObject.opt("level"), ErrorLevel.Fatal);
            m168581a(a, "user_action", jSONObject.opt("user_action"), "");
            m168581a(b, "error_type", a2, ErrorType.Unknown);
            m168581a(b, "need_net", jSONObject.opt("need_net"), true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C13479a.m54764b("appreciable_log:error:", getClass() + " report  metric:" + a + " category:" + b + " extra:" + c);
        try {
            AppreciableKit.m107394b().mo103514a(new ErrorParams((Biz) b.get("biz"), (Scene) b.get("scene"), (Event) a.get("event"), (ErrorType) b.get("error_type"), (ErrorLevel) a.get("level"), ((Integer) a.get("error_code")).intValue(), (String) a.get("user_action"), (String) b.get("page"), (String) a.get("error_message"), (Boolean) b.get("need_net"), null, null, (Map) c.get("category")));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private <T> void m168581a(JSONObject jSONObject, String str, T t, T t2) throws JSONException {
        if (!jSONObject.has(str)) {
            if (t == null) {
                t = t2;
            }
            jSONObject.put(str, t);
        }
    }
}
