package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.statistics.AbstractC49137a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.passport.infra.util.ab */
public class C49146ab {

    /* renamed from: com.ss.android.lark.passport.infra.util.ab$a */
    public static class C49147a {

        /* renamed from: a */
        private final JSONObject f123421a = new JSONObject();

        /* renamed from: a */
        public JSONObject mo171629a() {
            return this.f123421a;
        }

        /* renamed from: a */
        public C49147a mo171628a(String str, Object obj) {
            try {
                this.f123421a.put(str, obj);
            } catch (JSONException e) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171462a("TeaUtil", "put k=" + str + "; v=" + obj, e);
            }
            return this;
        }
    }

    /* renamed from: a */
    public static String m193803a(Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getStringExtra("__tea_path__");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static String m193802a(Context context, com.alibaba.fastjson.JSONObject jSONObject) {
        Intent intent;
        if (jSONObject == null) {
            return "";
        }
        String string = jSONObject.getString("__tea_path__");
        if (string != null) {
            return string;
        }
        if (context instanceof AbstractC49137a) {
            return ((AbstractC49137a) context).mo171139k();
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
            return string;
        }
        return intent.getStringExtra("__tea_path__");
    }
}
