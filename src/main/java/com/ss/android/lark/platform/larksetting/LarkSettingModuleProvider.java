package com.ss.android.lark.platform.larksetting;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.component.dybrid.offlineresource.C24256d;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.C41163b;
import com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a;
import com.ss.android.lark.platform.abtest.C51660a;
import com.ss.android.lark.platform.p2489j.C51819a;
import com.ss.android.lark.platform.p2494o.C51886a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class LarkSettingModuleProvider {
    /* renamed from: a */
    public static C41163b m200903a() {
        return new C41163b();
    }

    @ClaymoreImpl(AbstractC41162a.class)
    public static class LarkSettingModuleDependency implements AbstractC41162a {
        @Override // com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a
        public Set<String> getAllAbTestKeys() {
            return C51660a.m200386a().getAllAbTestKeys();
        }

        @Override // com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a
        public C24256d getOfflineResourceAPi() {
            return C51819a.m200877a().mo86773c();
        }

        @Override // com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a
        public List<AbstractBaseSettingHandler> getSettingHandlers() {
            return C36083a.m141486a().getOpenFeatureDependency().mo132990a();
        }

        public void setAppLogReportUrl(String[] strArr) {
            AppLogProxy.setSendLogUrlRuntime(strArr);
        }

        public void saveSafeModeConfig(JSONObject jSONObject) {
            C36083a.m141486a().getSafeModeDependency().mo133108a(jSONObject);
        }

        @Override // com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a
        public boolean isFeatureEnable(String str) {
            return C37239a.m146648b().mo136952a(str, C37239a.m146645a(str).booleanValue());
        }

        @Override // com.ss.android.lark.larkconfig.larksetting.p2106a.AbstractC41162a
        public void fillDefaultKey2LoadConfigMap(Map<String, C41149a> map) {
            synchronized (map) {
                map.putAll(C36083a.m141486a().getIMDependency().mo132905c());
                map.put("op_monitor", new C41149a.C41151a().mo148397a(false).mo148398a());
                map.put("short_applink_to_long_applink", C41149a.f104927a);
                map.put("blank_detect", C41149a.f104927a);
                map.put("contacts_config", C41149a.f104927a);
            }
        }

        public void setCpuExceptionStandard(long j, long j2, long j3) {
            C51886a.m201246a().mo168807a(j, j2, j3);
        }
    }
}
