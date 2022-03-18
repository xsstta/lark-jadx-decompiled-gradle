package com.bytedance.ee.webapp.config;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;

/* renamed from: com.bytedance.ee.webapp.config.e */
public class C13778e extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C13778e> f36018a = new AbstractC12790g<C13778e>() {
        /* class com.bytedance.ee.webapp.config.C13778e.C137791 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C13778e mo48227b(Context... contextArr) {
            return new C13778e();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "h5sdk_dynamic_api";
    }

    /* renamed from: a */
    public static final C13778e m55825a() {
        return f36018a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public JSONObject mo50800b() {
        return (JSONObject) JSON.parse(getSettingFromLocal("h5sdk_dynamic_api", ""));
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("h5sdk_dynamic_api", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b("h5sdk_dynamic_api", "");
    }
}
