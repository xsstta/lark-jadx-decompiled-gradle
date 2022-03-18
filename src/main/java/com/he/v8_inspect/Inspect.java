package com.he.v8_inspect;

import com.bytedance.ee.falcon.inspector.C12644b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12837a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.net.p3310c.C66513a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.Arrays;
import java.util.UUID;

public class Inspect {
    private String debugURL;
    private Runnable devToolConnectCallback;
    private IAppContext mAppContext;
    private Inspector sInspector;
    private boolean started;

    private static native void _connect(String str);

    private static native void _listen(int i);

    private static native void nativeConnect(String str);

    private static native void nativeListen(int i);

    public static native void onDispose(String str);

    public static native void onNewIsolate(String str, String str2);

    private void callDevToolConnectCallback() {
        Runnable runnable = this.devToolConnectCallback;
        if (runnable != null) {
            runnable.run();
            this.devToolConnectCallback = null;
        }
    }

    public void onRelease() {
        Inspector inspector = this.sInspector;
        if (inspector != null) {
            InspectorHelper.removeInspector(inspector);
        }
        this.mAppContext = null;
    }

    public void setDevToolConnectCallback(Runnable runnable) {
        this.devToolConnectCallback = runnable;
    }

    public void setRemoteDebugURL(String str) {
        this.debugURL = str;
    }

    public Inspect(IAppContext iAppContext) {
        this.mAppContext = iAppContext;
    }

    public static Inspect get(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234276F();
    }

    public void updateLaunchMode(String str) {
        if (this.sInspector != null) {
            AppInfoEntity appInfo = C67432a.m262319a(this.mAppContext).getAppInfo();
            Inspector inspector = this.sInspector;
            inspector.updateDisplayName(appInfo.appName + "-" + str);
        }
    }

    public void start(long j) {
        if (!this.started) {
            synchronized (Inspect.class) {
                if (!this.started) {
                    if (this.debugURL != null) {
                        AppBrandLogger.m52828d("Inspect", "nativeConnect, debugURL is " + this.debugURL);
                        nativeConnect(this.debugURL);
                        onNewIsolate(ProcessUtil.getProcessIdentify(), UUID.randomUUID().toString());
                    } else {
                        this.sInspector = InspectorHelper.createInspector(this.mAppContext.getApplicationContext(), j);
                        C12837a.m53022a(Arrays.asList(new C12644b(), new C66513a()));
                    }
                    this.started = true;
                }
            }
        }
    }

    public void transferInspector(long j, long j2) {
        Inspector inspector = this.sInspector;
        if (inspector != null) {
            inspector.transferInspector(j, j2);
        }
    }
}
