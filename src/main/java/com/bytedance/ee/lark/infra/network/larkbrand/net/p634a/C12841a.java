package com.bytedance.ee.lark.infra.network.larkbrand.net.p634a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.larkbrand.net.a.a */
public class C12841a extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C12841a> f34295a = new AbstractC12790g<C12841a>() {
        /* class com.bytedance.ee.lark.infra.network.larkbrand.net.p634a.C12841a.C128421 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12841a mo48227b(Context... contextArr) {
            return new C12841a();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "tt_request_header_monitor";
    }

    /* renamed from: a */
    public static C12841a m53030a() {
        return f34295a.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public List<String> mo48476a(String str) {
        return mo48477a(str, "request_header_keys");
    }

    /* renamed from: b */
    public List<String> mo48478b(String str) {
        return mo48477a(str, "response_header_keys");
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("RequestHeaderMonitorHandler", "saveSettingFromRemote:", str);
        C12782a.m52834a("tt_request_header_monitor", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }

    /* renamed from: a */
    public List<String> mo48477a(String str, String str2) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        ArrayList arrayList = new ArrayList();
        String settingFromLocal = getSettingFromLocal("tt_request_header_monitor", "");
        if (!TextUtils.isEmpty(settingFromLocal)) {
            try {
                JSONObject jSONObject = new JSONObject(settingFromLocal);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("default_header_keys");
                if (!(optJSONObject2 == null || (optJSONArray2 = optJSONObject2.optJSONArray(str2)) == null)) {
                    int length = optJSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray2.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("header_keys");
                if (!(optJSONObject3 == null || TextUtils.isEmpty(str) || (optJSONObject = optJSONObject3.optJSONObject(str)) == null || (optJSONArray = optJSONObject.optJSONArray(str2)) == null)) {
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (!TextUtils.isEmpty(optString2)) {
                            arrayList.add(optString2);
                        }
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("RequestHeaderMonitorHandler", "get request header keys err ", e);
            }
        }
        return arrayList;
    }
}
