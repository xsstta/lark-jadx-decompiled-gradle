package com.tt.miniapp.process.manager;

import android.content.Context;
import android.os.Handler;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.tt.miniapp.process.C66615b;
import com.tt.miniapp.process.SandboxMonitor;
import com.tt.miniapp.process.info.C66643a;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.render.RenderEngineType;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import java.util.List;

public interface IAppSandboxEnvProcessor {
    void finishServiceSticky(Context context, Class cls, String str, AbstractC67433a aVar, AppInfoEntity appInfoEntity);

    List<RenderEngineType> getAllRenderEngineType();

    ISandboxEnvInfo[] getAllSandboxEnvs();

    Class getCurrentMiniAppProcessServiceClass();

    SandboxMonitor.AbstractC66610a getInnerProcessLifeListener();

    Handler getKillSandBoxHandler(AbstractC67433a aVar);

    ISandboxEnvInfo getLatestUsingHostStackSandboxInfo();

    C66643a getLaunchClass(Context context, AppInfoEntity appInfoEntity, boolean z, boolean z2, boolean z3, AbstractC67433a aVar);

    String getPlayingBgAudioProcessName();

    ISandboxEnvInfo getPreloadSandboxEnvInfo();

    ISandboxEnvInfo getPreloadSandboxEnvInfo(Context context);

    ISandboxEnvInfo getPreloadSandboxEnvInfo(Context context, RenderEngineType renderEngineType);

    ISandboxEnvInfo getPreloadSandboxEnvInfo(RenderEngineType renderEngineType);

    List<Class> getRunningServiceClass(Context context);

    IAppSandboxEnvManagerService.SandBoxEnvType getSandBoxType();

    Handler getSandboxEnvHandler(AbstractC67433a aVar);

    ISandboxEnvInfo getSandboxEnvInfoByAppId(String str);

    ISandboxEnvInfo getSandboxInfoByIdentity(String str);

    ISandboxEnvInfo getSandboxInfoByName(String str);

    boolean hasSandboxExist(Context context);

    boolean hasSandboxExist(Context context, RenderEngineType renderEngineType);

    void initSandBoxList(Context context);

    boolean isAppSandBoxEnvExistByAppId(Context context, String str);

    boolean isHostProcessExist(Context context);

    boolean isInHostStack(Class cls);

    boolean isSandboxEnvExistByName(String str);

    void killAllSandbox();

    void killSandBoxByAppId(String str);

    void killSandbox(Context context, ISandboxEnvInfo iSandboxEnvInfo);

    void launchSnapshotCreatingSandboxEnv(int i, String str, AbstractC67433a aVar);

    void notifyProcessorPreloadResult(Boolean bool, ErrorResult errorResult);

    void preLaunchSandboxEnvById(int i, String str, RenderEngineType renderEngineType, String str2, AbstractC67433a aVar);

    void preloadEmptySandboxEnv();

    void preloadEmptySandboxEnv(int i, String str, RenderEngineType renderEngineType, int i2, AbstractC67433a aVar);

    void preloadEmptySandboxEnv(int i, String str, AbstractC67433a aVar);

    void preloadEmptySandboxEnvInternal(int i, String str, RenderEngineType renderEngineType, String str2);

    void registerHostProcessLifeListener(C66615b.AbstractC66618a aVar);

    void registerSandboxLifeListener(SandboxMonitor.AbstractC66610a aVar);

    void release(IAppContext iAppContext);

    void setPlayingBgAudioProcessName(String str);

    void setProcessorPreloadCallback(IGetDataCallback<Boolean> iGetDataCallback);

    void startSandboxEnvMonitor(Context context, ISandboxEnvInfo iSandboxEnvInfo, String str);

    void startSandboxEnvMonitor(Context context, ISandboxEnvInfo iSandboxEnvInfo, boolean z, String str);

    void unregisterHostProcessLifeListener(C66615b.AbstractC66618a aVar);

    void unregisterSandboxLifeListener(SandboxMonitor.AbstractC66610a aVar);

    void updateSandboxEnvInfo(String str, String str2, String str3);
}
