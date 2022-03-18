package com.ss.android.lark.platform.dynamicconfig;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.map.MapModuleProvider;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(AbstractC36883a.class)
public class DynamicConfigModuleDependencyImpl implements AbstractC36883a {
    @Override // com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a
    public Context getContext() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a
    public int getEnv2Type() {
        return C36083a.m141486a().getEnvDependency().mo132692a();
    }

    public String getTenantId() {
        return C36083a.m141486a().getPassportDependency().mo133088g();
    }

    @Override // com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a
    public String getUserUnit() {
        return C36083a.m141486a().getEnvDependency().mo132694b();
    }

    public boolean isLarkPackage() {
        return C36083a.m141487b().isUsPackage();
    }

    public /* synthetic */ void lambda$getLatLon$1$DynamicConfigModuleDependencyImpl() {
        MapModuleProvider.m201088a().getLocation(getContext(), $$Lambda$DynamicConfigModuleDependencyImpl$jxA6EpAwTBKnV4da4kKqcm0LrrQ.INSTANCE);
    }

    public String getDid() {
        return C36083a.m141486a().getPassportDependency().mo133096o().getDeviceId();
    }

    public String getLoginToken() {
        return C36083a.m141486a().getPassportDependency().mo133094m().mo172424e();
    }

    public String getUid() {
        return C36083a.m141486a().getPassportDependency().mo133094m().mo172422c();
    }

    @Override // com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a
    public boolean isLogin() {
        return C36083a.m141486a().getPassportDependency().mo133094m().mo172428i();
    }

    @Override // com.ss.android.lark.dynamicconfig.p1819a.AbstractC36883a
    public InitSDKRequest.EnvType getEnvType() {
        int a = C36083a.m141486a().getEnvDependency().mo132692a();
        if (a == 1) {
            return InitSDKRequest.EnvType.ONLINE;
        }
        if (a == 2) {
            return InitSDKRequest.EnvType.STAGING;
        }
        if (a != 3) {
            return InitSDKRequest.EnvType.ONLINE;
        }
        return InitSDKRequest.EnvType.PRE_RELEASE;
    }

    public String getLatLon() {
        boolean z;
        if (AppLifecycle.m200904a().mo177978h() == null) {
            return "";
        }
        if (ActivityCompat.checkSelfPermission(getContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        long j = C57744a.m224104a().getLong("cache_location_lat_lon_timestamp", 0);
        String string = C57744a.m224104a().getString("cache_location_lat_lon", "");
        if (TextUtils.isEmpty(string) || System.currentTimeMillis() - j > 43200000) {
            CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
                /* class com.ss.android.lark.platform.dynamicconfig.$$Lambda$DynamicConfigModuleDependencyImpl$PIekOH6WE5rzlpwSGBfeOEOS77k */

                public final void run() {
                    DynamicConfigModuleDependencyImpl.this.lambda$getLatLon$1$DynamicConfigModuleDependencyImpl();
                }
            });
        }
        return string;
    }

    public boolean isFeatureOn(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    static /* synthetic */ void lambda$null$0(LarkLocation larkLocation) {
        if (larkLocation != null) {
            C57744a.m224104a().putLong("cache_location_lat_lon_timestamp", System.currentTimeMillis());
            C57744a a = C57744a.m224104a();
            a.putString("cache_location_lat_lon", larkLocation.getLatitude() + "," + larkLocation.getLongitude());
        }
    }

    public String getNewTidPath(Context context, String str) {
        return C36083a.m141486a().getGeckoResDependency().mo132776a(context, str);
    }
}
