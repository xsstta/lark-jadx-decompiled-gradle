package com.bytedance.ee.lark.infra.cookie.p620e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.cookie.e.b */
public class C12765b extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C12765b> f34149a = new AbstractC12790g<C12765b>() {
        /* class com.bytedance.ee.lark.infra.cookie.p620e.C12765b.C127661 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12765b mo48227b(Context... contextArr) {
            return new C12765b();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "cookieSyncStrategy";
    }

    /* renamed from: com.bytedance.ee.lark.infra.cookie.e.b$a */
    public static class C12767a {

        /* renamed from: a */
        public List<String> f34150a = new ArrayList();

        /* renamed from: b */
        private int f34151b;

        /* renamed from: c */
        private boolean f34152c = false;

        /* renamed from: a */
        public int mo48285a() {
            return this.f34151b;
        }

        /* renamed from: b */
        public List<String> mo48288b() {
            return this.f34150a;
        }

        /* renamed from: c */
        public boolean mo48289c() {
            return this.f34152c;
        }

        public String toString() {
            return "CookieIsolateConfig{mode=" + this.f34151b + ", whiteAppList=" + Arrays.toString(this.f34150a.toArray()) + ", applyAll=" + this.f34152c + '}';
        }

        /* renamed from: a */
        public void mo48286a(int i) {
            this.f34151b = i;
        }

        /* renamed from: a */
        public void mo48287a(boolean z) {
            this.f34152c = z;
        }
    }

    /* renamed from: a */
    public static final C12765b m52782a() {
        return f34149a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public C12767a mo48283b() {
        C12767a aVar = new C12767a();
        String settingFromLocal = getSettingFromLocal("cookieSyncStrategy", "");
        if (!TextUtils.isEmpty(settingFromLocal)) {
            try {
                JSONObject jSONObject = new JSONObject(settingFromLocal);
                JSONArray optJSONArray = jSONObject.optJSONArray("white_app_list");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        aVar.f34150a.add(optJSONArray.optString(i));
                    }
                }
                aVar.mo48287a(jSONObject.optBoolean("apply_all", false));
                aVar.mo48286a(jSONObject.optInt("mode", 0));
            } catch (JSONException e) {
                AppBrandLogger.m52829e("CookiePersistent_Setting", "getWhiteList error:", e);
            }
        }
        AppBrandLogger.m52830i("CookiePersistent_Setting", "getCookieIsolateConfig:", aVar);
        return aVar;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("CookiePersistent_Setting", "saveSettingFromRemote:", str);
        C12782a.m52834a("cookieSyncStrategy", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
