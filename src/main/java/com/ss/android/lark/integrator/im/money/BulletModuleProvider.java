package com.ss.android.lark.integrator.im.money;

import android.app.Application;
import android.content.Context;
import com.bytedance.apm.ApmAgent;
import com.bytedance.applog.C3368a;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.lynxlib.bullet.BulletDependency;
import com.bytedance.lark.lynxlib.bullet.BulletHolder;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.Map;
import org.json.JSONObject;

public class BulletModuleProvider {
    /* renamed from: a */
    public static BulletHolder m157725a() {
        return BulletHolder.f38618a;
    }

    @ClaymoreImpl(BulletDependency.class)
    public static class BulletDependencyImpl implements BulletDependency {
        public Application getApplication() {
            return LarkContext.getApplication();
        }

        public int getAppId() {
            return C29410a.m108287a().mo104277a();
        }

        public String getAppUpdateVersionCode() {
            return String.valueOf(C26246a.m94979c(getApplication()));
        }

        public long getAppVersionCode() {
            return (long) C26246a.m94978b(getApplication());
        }

        public String getAppVersionName() {
            return C26246a.m94977a(getApplication());
        }

        public String getChannel() {
            return PackageChannelManager.getRuntimePackageChannel(getApplication());
        }

        public String getDeviceId() {
            return C39603g.m157159a().getPassportDependency().mo143676g();
        }

        public String getGeckoHost() {
            return DynamicConfigModule.m145552b().mo136165a("gecko");
        }

        public String getPayToken() {
            return UserSP.getInstance().getString("key.sp.pay.token");
        }

        public void initCardEnv() {
            C39603g.m157159a().getOpenPlatformDependency().mo143653b(getApplication());
        }

        public boolean isBoe() {
            return C39603g.m157159a().getPassportDependency().mo143687r();
        }

        public boolean isDebugPackage() {
            return C26284k.m95186b(getApplication());
        }

        public String getLanguage() {
            return C39603g.m157159a().getCoreDependency().mo143609q().getLanguage();
        }

        public void onEvent(String str, JSONObject jSONObject) {
            Statistics.sendEvent(str, jSONObject);
        }

        public void putCommonParams(Map<String, String> map, boolean z) {
            C3368a.m14026a(map, z);
        }

        public void openSchema(Context context, String str) {
            if (!MoneyModuleProvider.m157728a(context, str)) {
                C39603g.m157159a().getCoreDependency().mo143437a(context, str);
            }
        }

        public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            ApmAgent.monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
        }
    }
}
