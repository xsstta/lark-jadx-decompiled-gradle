package com.ss.android.lark.platform.batterymonitor.p2481e;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.platform.batterymonitor.e.b */
public class C51753b {
    /* renamed from: a */
    public void mo177871a() {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.p2481e.C51753b.RunnableC517541 */

            public void run() {
                Log.m165379d("FrontierHostUtils", "do wschannel update long domain");
                String a = DynamicConfigModule.m145551a(DomainSettings.Alias.LONG);
                if (a.isEmpty()) {
                    Log.m165397w("FrontierHostUtils", "get Long domain is empty, so do nothing");
                    return;
                }
                Log.m165379d("FrontierHostUtils", "new long domain is " + a);
                MMKV mmkvWithID = MMKV.mmkvWithID("wschannel_private_sp", 4);
                mmkvWithID.putString("long_domain", a);
                int a2 = C36083a.m141486a().getEnvDependency().mo132692a();
                Log.m165379d("FrontierHostUtils", "mmkv new env type is " + a2);
                mmkvWithID.putInt("env_type", a2);
                String i = C36083a.m141486a().getPassportDependency().mo133090i();
                Log.m165379d("FrontierHostUtils", "mmkv did is " + i);
                mmkvWithID.putString("did", i);
            }
        }, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void mo177872b() {
        C36083a.m141486a().getPassportDependency().mo133101t().registerLoginEnvChangeListener(new AbstractC49370a.AbstractC49371a() {
            /* class com.ss.android.lark.platform.batterymonitor.p2481e.C51753b.C517552 */

            @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
            /* renamed from: a */
            public boolean mo102729a() {
                return false;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
            /* renamed from: a */
            public void mo102728a(boolean z, AbstractC49352d<String> dVar) {
                C51753b.this.mo177871a();
            }
        });
        mo177871a();
    }
}
