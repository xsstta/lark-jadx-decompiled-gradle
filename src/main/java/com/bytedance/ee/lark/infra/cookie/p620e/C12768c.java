package com.bytedance.ee.lark.infra.cookie.p620e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.lark.infra.cookie.e.c */
public class C12768c extends AbstractC12744b {

    /* renamed from: c */
    private static final AbstractC12790g<C12768c> f34153c = new AbstractC12790g<C12768c>() {
        /* class com.bytedance.ee.lark.infra.cookie.p620e.C12768c.C127691 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12768c mo48227b(Context... contextArr) {
            return new C12768c();
        }
    };

    /* renamed from: a */
    public final List<String> f34154a = Arrays.asList("sgsnssdk.com", "snssdk.com", "toutiao.com", "wukong.com", "baohuaxia.com", "bytedance.net");

    /* renamed from: b */
    private final List<String> f34155b = Arrays.asList("ee.bytedance.net", "bytedance.com");

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "cookieUrlWhiteList";
    }

    /* renamed from: a */
    public static final C12768c m52791a() {
        return f34153c.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public List<String> mo48292b() {
        String settingFromLocal = getSettingFromLocal("key_web_white_list", "");
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
        if (arrayList.isEmpty()) {
            return this.f34155b;
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo48293b(String str) {
        return m52792a(str, this.f34154a);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("key_web_white_list", str);
    }

    /* renamed from: a */
    public boolean mo48291a(String str) {
        return m52792a(str, mo48292b());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b("key_web_white_list", "");
    }

    /* renamed from: a */
    private boolean m52792a(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
