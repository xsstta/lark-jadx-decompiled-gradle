package com.ss.android.lark.money.redpacket.send;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.dto.PayURLType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.money.redpacket.send.d */
public class C48179d {
    /* renamed from: a */
    private static JSONObject m190181a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cashdesk_show_style", 0);
            jSONObject.put("result_page_show_style", 0);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m190183a(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: b */
    private static JSONArray m190184b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i));
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static String m190180a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add("balance");
            }
            arrayList.add("quickpay");
            JSONObject a = m190182a(arrayList);
            if (a != null) {
                jSONObject.put("limit_pay", a.toString());
            }
            JSONObject a2 = m190181a();
            if (a2 != null) {
                jSONObject.put("exts", a2.toString());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m190182a(List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("limit_pay_channel", m190184b(list));
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C48178c m190179a(String str, PayURLType payURLType) {
        if (!m190183a(str)) {
            return null;
        }
        if (Objects.equals(PayURLType.BYTE_PAY, payURLType)) {
            try {
                return new C48178c((Map) new Gson().fromJson(str, new TypeToken<Map<String, String>>() {
                    /* class com.ss.android.lark.money.redpacket.send.C48179d.C481801 */
                }.getType()), payURLType);
            } catch (Exception e) {
                Log.m165384e("PayParamsUtil", "parse param err", e);
                return null;
            }
        } else {
            Uri parse = Uri.parse(str);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            HashMap hashMap = new HashMap();
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
            return new C48178c(hashMap, payURLType);
        }
    }
}
