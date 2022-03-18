package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.ss.android.lark.log.Log;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapphost.host.HostDependManager;
import java.util.concurrent.atomic.AtomicBoolean;

public class GadgetRuntimeConfigSettingHandler extends AbstractC12744b {

    /* renamed from: c */
    private static final AbstractC12790g<GadgetRuntimeConfigSettingHandler> f168505c = new AbstractC12790g<GadgetRuntimeConfigSettingHandler>() {
        /* class com.tt.miniapp.settings.v2.handler.GadgetRuntimeConfigSettingHandler.C667541 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public GadgetRuntimeConfigSettingHandler mo48227b(Context... contextArr) {
            return new GadgetRuntimeConfigSettingHandler();
        }
    };

    /* renamed from: a */
    private volatile AtomicBoolean f168506a;

    /* renamed from: b */
    private boolean f168507b;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "gadgetAppRuntimeConfig";
    }

    /* access modifiers changed from: private */
    public static class GadgetConfigItem {
        @JSONField(name = "appId")
        public String mAppId;
        @JSONField(name = "isSharedSandbox")
        public boolean mIsSharedSandbox;
        @JSONField(name = "sandboxEnv")
        public int mSandboxEnv = IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS.ordinal();

        private GadgetConfigItem() {
        }
    }

    private GadgetRuntimeConfigSettingHandler() {
        this.f168506a = new AtomicBoolean(false);
        this.f168507b = false;
    }

    /* renamed from: a */
    public static GadgetRuntimeConfigSettingHandler m260575a() {
        return f168505c.mo48348c(new Context[0]);
    }

    /* renamed from: c */
    private boolean m260578c() {
        if (this.f168506a.compareAndSet(false, true)) {
            this.f168507b = HostDependManager.getInst().getFeatureGating("openplatform.gadget.ssb.enable");
        }
        return this.f168507b;
    }

    /* renamed from: b */
    private boolean m260577b() {
        String settingFromLocal = getSettingFromLocal("gadgetAppRuntimeConfig", "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            return true;
        }
        try {
            return JSONArray.parseArray(settingFromLocal).isEmpty();
        } catch (Exception e) {
            Log.m165384e("GadgetRunMainProcessSet", "Exception", e);
            return false;
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("gadgetAppRuntimeConfig", str);
    }

    /* renamed from: a */
    public boolean mo232659a(String str) {
        boolean c = m260578c();
        if (!c || m260577b()) {
            return c;
        }
        GadgetConfigItem b = m260576b(str);
        if (b == null) {
            Log.m165389i("GadgetRunMainProcessSet", "no config appId:" + str);
            return false;
        } else if (!b.mIsSharedSandbox || IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS.ordinal() != b.mSandboxEnv) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private GadgetConfigItem m260576b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("GadgetRunMainProcessSet", "AppId is empty");
            return null;
        }
        String settingFromLocal = getSettingFromLocal("gadgetAppRuntimeConfig", "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            Log.m165397w("GadgetRunMainProcessSet", "setting value is empty");
            return null;
        }
        try {
            JSONArray parseArray = JSONArray.parseArray(settingFromLocal);
            for (int i = 0; i < parseArray.size(); i++) {
                JSONObject jSONObject = parseArray.getJSONObject(i);
                if (jSONObject != null) {
                    GadgetConfigItem gadgetConfigItem = (GadgetConfigItem) JSON.toJavaObject(jSONObject, GadgetConfigItem.class);
                    if (str.equals(gadgetConfigItem.mAppId)) {
                        return gadgetConfigItem;
                    }
                }
            }
            Log.m165383e("GadgetRunMainProcessSet", "no this appId:" + str);
        } catch (Throwable th) {
            Log.m165384e("GadgetRunMainProcessSet", "Throwable", th);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
