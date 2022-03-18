package com.ss.android.lark.littleapp.prelaunch;

import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;

/* renamed from: com.ss.android.lark.littleapp.prelaunch.a */
public interface AbstractC41413a {
    String getPreLaunchAppId();

    boolean isPreLaunched();

    void preLaunchApp(int i, String str, String str2, IAppSandboxEnvProcessor iAppSandboxEnvProcessor, AbstractC67433a aVar);

    void recordAppLaunched(String str);
}
