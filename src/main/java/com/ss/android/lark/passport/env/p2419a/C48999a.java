package com.ss.android.lark.passport.env.p2419a;

import android.content.Context;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.EnvConst;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;

/* renamed from: com.ss.android.lark.passport.env.a.a */
public class C48999a {

    /* renamed from: a */
    private volatile HostEnvBean f123028a;

    /* renamed from: c */
    public String mo171078c() {
        return mo171075a().userUnit;
    }

    /* renamed from: d */
    public synchronized void mo171079d() {
        this.f123028a = null;
        C49000b.m192980a((HostEnvBean) null);
    }

    /* renamed from: a */
    public synchronized HostEnvBean mo171075a() {
        boolean z;
        HostEnvBean hostEnvBean;
        if (this.f123028a == null) {
            this.f123028a = C49000b.m192978a();
        }
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        if (this.f123028a != null || (!C26284k.m95186b(applicationContext) && !C26284k.m95185a(applicationContext))) {
            z = false;
        } else {
            z = true;
        }
        if (this.f123028a != null) {
            hostEnvBean = this.f123028a.cloneMe();
        } else if (ServiceFinder.m193748c().isLarkPackage()) {
            hostEnvBean = EnvConst.m194443b();
        } else {
            hostEnvBean = EnvConst.m194442a();
        }
        if (z) {
            hostEnvBean.userUnit = ServiceFinder.m193748c().getDebugUnit();
            Log.m165379d("EnvManager", "currentHostEnv() use debugger unit option: " + hostEnvBean.userUnit);
        }
        return hostEnvBean;
    }

    /* renamed from: b */
    public HostEnvBean mo171077b() {
        HostEnvBean hostEnvBean;
        String str = mo171075a().userUnit;
        if ("boecn".equals(str) || "boeva".equals(str)) {
            if (ServiceFinder.m193748c().isLarkPackage()) {
                hostEnvBean = EnvConst.m194445d();
            } else {
                hostEnvBean = EnvConst.m194444c();
            }
        } else if (ServiceFinder.m193748c().isLarkPackage()) {
            hostEnvBean = EnvConst.m194443b();
        } else {
            hostEnvBean = EnvConst.m194442a();
        }
        Log.m165389i("EnvManager", "appEnv is " + hostEnvBean.envType + ", userUnit is " + str);
        return hostEnvBean;
    }

    /* renamed from: a */
    public void mo171076a(HostEnvBean hostEnvBean) {
        if (hostEnvBean == null) {
            Log.m165383e("EnvManager", "empty hostEnvChange");
            return;
        }
        Log.m165389i("EnvManager", "hostEnvChange: " + hostEnvBean.userUnit);
        synchronized (this) {
            this.f123028a = hostEnvBean.cloneMe();
            C49000b.m192980a(hostEnvBean);
        }
    }
}
