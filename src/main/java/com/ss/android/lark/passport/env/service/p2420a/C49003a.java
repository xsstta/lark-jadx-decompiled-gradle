package com.ss.android.lark.passport.env.service.p2420a;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;

/* renamed from: com.ss.android.lark.passport.env.service.a.a */
public class C49003a {
    /* renamed from: a */
    public void mo171103a(HostEnvBean hostEnvBean, AbstractC49352d<String> dVar) {
        if (hostEnvBean != null) {
            Log.m165389i("HostEnvChangeListener", "hostEnv is not null");
            ServiceFinder.m193762q().clearAppLogDidCache();
        }
        Log.m165389i("HostEnvChangeListener", "notify listeners");
        ServiceFinder.m193749d().onLoginEnvChange(hostEnvBean, dVar);
    }
}
