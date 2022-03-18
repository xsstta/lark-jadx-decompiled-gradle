package com.bytedance.ee.ref.impl.host;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.ui.C67697b;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;
import com.tt.refer.impl.business.api.diagnose.entity.DumpService;
import com.tt.refer.impl.business.api.diagnose.entity.DumpServiceType;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import java.util.List;
import java.util.Map;

public interface HostInterface {

    /* renamed from: com.bytedance.ee.ref.impl.host.HostInterface$a */
    public interface AbstractC13576a {
        /* renamed from: a */
        void mo50433a(int i);

        /* renamed from: a */
        void mo50434a(String str);
    }

    DumpService applyDumpInfo(DumpServiceType dumpServiceType, DumpConfig dumpConfig);

    boolean brandApplicationCanDebug(String str);

    void callProcessAsync(CrossProcessCallEntity crossProcessCallEntity, AbstractC67727a aVar);

    CrossProcessDataEntity callProcessSync(CrossProcessCallEntity crossProcessCallEntity);

    boolean canOpenCloudFile(String str);

    boolean canOpenUrl(String str);

    List<AbstractC25558a> getAllBizWorkerProviders();

    <T extends AbstractNativeComponent> Map<String, Class<T>> getAllNativeComponentType();

    void getAppState(String str, AbstractC13576a aVar);

    String getBlockDomain(IAppContext iAppContext);

    int getCurNetworkLevel();

    String getDeviceId();

    int getEnvType();

    boolean getFeatureGating(String str);

    void getLocation(Context context, String str, float f, long j, String str2, long j2, AbstractC67724a.AbstractC67726b bVar);

    MessageTriggerInfo getMessagesByCode(String str, String str2);

    String getMinaBaseUrl(IAppContext iAppContext);

    String getMiraPluginNativeDir(String str);

    String getMiraPluginSoureFile(String str);

    C67856a getNetworkQuality();

    String getRawDeviceId();

    long getServerTime();

    String getSession();

    int getTTNetworkQualityType();

    String getTTWebViewSoVersion();

    String getTenantId();

    String getUserId();

    boolean inspectModeIsOpen();

    void installMiraClassLoader(String str);

    boolean isAOTTaskRunning();

    boolean isGooglePlay();

    boolean isLoginLarkEnv();

    boolean isMiraPluginInstalled(String str);

    boolean isMiraPluginLoaded(String str);

    boolean isP0MergeToMainProc();

    boolean isShowGlobalWatermark();

    boolean isUsingTTWebView();

    void loadMiraPlugin(String str);

    void openUrl(Context context, String str);

    void openWeb(Activity activity, String str, String str2);

    void registerLarkNetQualityListener(AbstractC67854b bVar);

    void showActionSheet(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar);

    void showModal(C67697b bVar);

    void startChatWindowActivityByChatterId(String str, String str2, boolean z);

    void startDocSelectActivity(Activity activity, int i, int i2, String str, String str2);

    boolean startDriveSDKActivity(Activity activity, String str, String str2, String str3, boolean z);

    boolean startFileDetailActivity(Activity activity, String str, String str2, boolean z);

    void startFilePickerActivity(Activity activity, int i, int i2, String str, String str2);

    void unRegisterLarkNetQualityListener(AbstractC67854b bVar);
}
