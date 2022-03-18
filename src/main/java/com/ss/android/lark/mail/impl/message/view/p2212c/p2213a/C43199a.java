package com.ss.android.lark.mail.impl.message.view.p2212c.p2213a;

import android.webkit.JavascriptInterface;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.view.c.a.a */
public class C43199a {

    /* renamed from: a */
    AbstractC43200a f109960a;

    /* renamed from: com.ss.android.lark.mail.impl.message.view.c.a.a$a */
    public interface AbstractC43200a {
        /* renamed from: a */
        void mo153803a(String str, JSONObject jSONObject);
    }

    /* renamed from: a */
    public void mo154617a(AbstractC43200a aVar) {
        this.f109960a = aVar;
    }

    @JavascriptInterface
    public void prompt(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject == null) {
                Log.m165389i("MessageBridge", "args is null");
                return;
            }
            AbstractC43200a aVar = this.f109960a;
            if (aVar != null) {
                aVar.mo153803a(optString, optJSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Log.m165389i("MessageBridge", "parse json error :" + e);
        }
    }
}
