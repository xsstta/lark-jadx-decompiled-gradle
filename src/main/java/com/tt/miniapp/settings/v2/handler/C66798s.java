package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.google.gson.GsonBuilder;
import com.tt.miniapp.settings.v2.model.ConfigSplitPackageModel;

/* renamed from: com.tt.miniapp.settings.v2.handler.s */
public class C66798s extends AbstractC12744b {

    /* renamed from: a */
    private static final AbstractC12790g<C66798s> f168536a = new AbstractC12790g<C66798s>() {
        /* class com.tt.miniapp.settings.v2.handler.C66798s.C667991 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C66798s mo48227b(Context... contextArr) {
            return new C66798s();
        }
    };

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "open_split_package_config";
    }

    /* renamed from: a */
    public static final C66798s m260670a() {
        return f168536a.mo48348c(new Context[0]);
    }

    /* renamed from: b */
    public ConfigSplitPackageModel mo232706b() {
        String settingFromLocal = getSettingFromLocal("open_split_package_config", "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            AppBrandLogger.m52830i("OpenSplitPackageConfigSettingHandler", "getConfigSplitPackageModel jsonData is null:");
            return null;
        }
        try {
            return (ConfigSplitPackageModel) new GsonBuilder().setPrettyPrinting().create().fromJson(settingFromLocal, ConfigSplitPackageModel.class);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("OpenSplitPackageConfigSettingHandler", "getConfigSplitPackageModel error :", e);
            return null;
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("open_split_package_config", str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
