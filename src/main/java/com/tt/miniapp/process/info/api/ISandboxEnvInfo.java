package com.tt.miniapp.process.info.api;

import android.content.Context;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;

public interface ISandboxEnvInfo {
    Class generateLaunchActivityClass(boolean z);

    AbstractC67433a getAppContext();

    String getAppId();

    Class getInHostStackActivityClass();

    int getIndex();

    String getKillingAppId();

    Class getLaunchActivityClass();

    SandboxMonitor getMiniProcessMontior();

    Class getNormalActivityClass();

    Class getPreloadServiceClass();

    String getProcessIdentity();

    RenderEngineType getRenderEngineType();

    String getSandboxName();

    long getStartTime();

    long getUseTime();

    String getVersionType();

    boolean hasBindSchema();

    void init(Context context);

    boolean isActivityCreated();

    boolean isLaunchActivityInHostStack();

    boolean isPreload();

    boolean isSnapshotCreatingFaker();

    boolean isUsing();

    void prepareStart();

    void processRunning(String str, String str2);

    void reset();

    void reuseInfo(String str, String str2, AbstractC67433a aVar);

    void setKillingAppId(String str);

    void setSchema(String str);

    void updateActivityCreateStatus(boolean z);

    void updateAppId(String str);
}
