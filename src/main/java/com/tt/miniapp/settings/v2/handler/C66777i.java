package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.ss.android.lark.log.Log;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.settings.v2.handler.i */
public class C66777i extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66777i> f168521a = new AbstractC12790g<C66777i>() {
        /* class com.tt.miniapp.settings.v2.handler.C66777i.C667781 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66777i mo48227b(Context... contextArr) {
            return new C66777i();
        }
    };

    /* renamed from: com.tt.miniapp.settings.v2.handler.i$a */
    public static class C66779a {

        /* renamed from: a */
        public long f168522a = 604800000;

        /* renamed from: b */
        public int f168523b = 1;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "meta_expiration_time_setting";
    }

    /* renamed from: a */
    public static final C66777i m260625a() {
        return f168521a.mo48348c(new Context[0]);
    }

    /* renamed from: d */
    private String m260626d() {
        return getSettingFromLocal(Storage.getStorageFilePrefix("meta_expiration_time_setting"), "");
    }

    /* renamed from: c */
    public boolean mo232685c() {
        String d = m260626d();
        if (TextUtils.isEmpty(d)) {
            Log.m165389i("ExpirationTimeSettingHandler", "getFirstForbidden jsonData is empty");
            return false;
        }
        try {
            JSONObject optJSONObject = new JSONObject(d).optJSONObject("on_update_ready_max_age");
            if (optJSONObject != null) {
                return optJSONObject.optBoolean("first_update_control");
            }
        } catch (Exception e) {
            Log.m165384e("ExpirationTimeSettingHandler", "ExpirationTime config parse error", e);
        }
        return false;
    }

    /* renamed from: b */
    public long mo232683b() {
        String settingFromLocal = getSettingFromLocal(Storage.getStorageFilePrefix("meta_expiration_time_setting"), "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            Log.m165389i("ExpirationTimeSettingHandler", "ExpirationTime jsonData is empty");
            return 0;
        }
        try {
            long j = new JSONObject(settingFromLocal).getLong("expiration_time");
            Log.m165389i("ExpirationTimeSettingHandler", "from setting get ExpirationTime is " + j);
            return j;
        } catch (Exception e) {
            Log.m165384e("ExpirationTimeSettingHandler", "ExpirationTime config parse error", e);
            return 0;
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a(Storage.getStorageFilePrefix("meta_expiration_time_setting"), str);
    }

    /* renamed from: b */
    public long mo232684b(String str) {
        String d = m260626d();
        if (TextUtils.isEmpty(d)) {
            Log.m165389i("ExpirationTimeSettingHandler", "getAppUpdateMaxAge jsonData is empty");
            return 0;
        }
        try {
            JSONObject optJSONObject = new JSONObject(d).optJSONObject("on_update_ready_max_age");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong(str);
                long optLong2 = optJSONObject.optLong("default_max_age");
                if (optLong != 0) {
                    return optLong;
                }
                if (optLong2 != 0) {
                    return optLong2;
                }
            }
        } catch (Exception e) {
            Log.m165384e("ExpirationTimeSettingHandler", "getAppUpdateMaxAge config parse error", e);
        }
        return 0;
    }

    /* renamed from: a */
    public C66779a mo232682a(String str) {
        JSONObject optJSONObject;
        C66779a aVar = new C66779a();
        String d = m260626d();
        if (TextUtils.isEmpty(d)) {
            Log.m165389i("ExpirationTimeSettingHandler", "getUserUpdateSettings jsonData is empty");
            return aVar;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(d).optJSONObject("on_update_ready_max_age");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("user_strategy")) == null) {
                return aVar;
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject(str);
            if (optJSONObject3 != null) {
                aVar.f168523b = optJSONObject3.optInt("max_update_count", 1);
                aVar.f168522a = optJSONObject3.optLong("max_age", 604800000);
            } else {
                aVar.f168523b = optJSONObject.optInt("max_update_count", 1);
                aVar.f168522a = optJSONObject.optLong("max_age", 604800000);
            }
            return aVar;
        } catch (Exception e) {
            Log.m165384e("ExpirationTimeSettingHandler", "ExpirationTime config parse error", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
