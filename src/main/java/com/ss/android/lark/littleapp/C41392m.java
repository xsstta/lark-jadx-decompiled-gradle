package com.ss.android.lark.littleapp;

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

/* renamed from: com.ss.android.lark.littleapp.m */
public class C41392m extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C41392m> f105248a = new AbstractC12790g<C41392m>() {
        /* class com.ss.android.lark.littleapp.C41392m.C413931 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C41392m mo48227b(Context... contextArr) {
            return new C41392m();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "cellular_can_download_appList";
    }

    /* renamed from: b */
    public static final C41392m m164164b() {
        return f105248a.mo48348c(new Context[0]);
    }

    /* renamed from: a */
    public List<String> mo149059a() {
        String settingFromLocal = getSettingFromLocal("cellular_can_download_appList", "");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(settingFromLocal)) {
            try {
                JSONArray jSONArray = new JSONArray(settingFromLocal);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        AppBrandLogger.m52830i("PreUpdateSettingHandler", "saveSettingFromRemote:", str);
        C12782a.m52834a("cellular_can_download_appList", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
