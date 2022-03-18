package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.google.gson.GsonBuilder;
import com.tt.miniapp.settings.v2.model.ConfigSchemaParameterList;

/* renamed from: com.tt.miniapp.settings.v2.handler.f */
public class C66771f extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66771f> f168518a = new AbstractC12790g<C66771f>() {
        /* class com.tt.miniapp.settings.v2.handler.C66771f.C667721 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66771f mo48227b(Context... contextArr) {
            return new C66771f();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "configSchemaParameterLittleAppList";
    }

    /* renamed from: a */
    public static final C66771f m260614a() {
        return f168518a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public ConfigSchemaParameterList mo232677b() {
        String settingFromLocal = getSettingFromLocal("configSchemaParameterLittleAppList", "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            return null;
        }
        try {
            return (ConfigSchemaParameterList) new GsonBuilder().setPrettyPrinting().create().fromJson(settingFromLocal, ConfigSchemaParameterList.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("configSchemaParameterLittleAppList", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
