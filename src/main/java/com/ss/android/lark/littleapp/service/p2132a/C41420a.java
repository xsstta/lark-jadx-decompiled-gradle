package com.ss.android.lark.littleapp.service.p2132a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.C13145a;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.component.openplatform.plugins.p1144c.AbstractC25558a;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.suite.R;
import com.ss.android.lark.littleapp.C41300b;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57859q;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.option.ui.C67697b;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.impl.business.api.diagnose.entity.C67892a;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;
import com.tt.refer.impl.business.api.diagnose.entity.DumpService;
import com.tt.refer.impl.business.api.diagnose.entity.DumpServiceType;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import ee.android.framework.manis.C68183b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.littleapp.service.a.a */
public class C41420a implements HostInterface {

    /* renamed from: a */
    private Context f105296a;

    /* renamed from: b */
    private AbstractC41301a f105297b;

    /* renamed from: c */
    private boolean f105298c;

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public List<AbstractC25558a> getAllBizWorkerProviders() {
        return this.f105297b.getAllBizWorkerProviders();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public <T extends AbstractNativeComponent> Map<String, Class<T>> getAllNativeComponentType() {
        return this.f105297b.getAllNativeComponentType();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public int getCurNetworkLevel() {
        return this.f105297b.getCurNetworkLevel();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getDeviceId() {
        return m164313a(true);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public C67856a getNetworkQuality() {
        return this.f105297b.getNetworkQuality();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getRawDeviceId() {
        return m164313a(false);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public int getTTNetworkQualityType() {
        return this.f105297b.getTTNetworkQualityType();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getTTWebViewSoVersion() {
        return this.f105297b.getTTWebViewSoVersion();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isAOTTaskRunning() {
        return this.f105297b.isAotRunning();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isGooglePlay() {
        return this.f105297b.isGooglePlay();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isP0MergeToMainProc() {
        return this.f105297b.isP0MergeToMainProc();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isUsingTTWebView() {
        return this.f105297b.isUsingTTWebView();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getTenantId() {
        return this.f105297b.getLoginDependency().mo144248c();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getUserId() {
        return this.f105297b.getLoginDependency().mo144247b();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isShowGlobalWatermark() {
        return this.f105297b.getLoginDependency().mo144249d();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean inspectModeIsOpen() {
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.inspectModeIsOpen();
        }
        Log.m165383e("HostInterfaceImpl", "inspectModeIsOpen littleAppProxy null");
        return false;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public int getEnvType() {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "getEnvType :inMainProcess");
            return this.f105297b.getEnvType();
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy == null) {
            return 1;
        }
        return littleAppProxy.getEnvType();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public long getServerTime() {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "getServerTime :inMainProcess");
            return this.f105297b.getServerTime();
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.getServerTime();
        }
        Log.m165383e("HostInterfaceImpl", "getServerTime littleAppProxy null");
        return -1;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isLoginLarkEnv() {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "isLoginLarkEnv :inMainProcess");
            return this.f105297b.isOverseaTenantBrand();
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy == null) {
            return false;
        }
        return littleAppProxy.isLoginLarkEnv();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getSession() {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "getSession :inMainProcess");
            try {
                return this.f105297b.getLoginDependency().mo144246a();
            } catch (Exception e) {
                Log.m165383e("HostInterfaceImpl", "getSession error:" + e.getMessage());
                return null;
            }
        } else {
            LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
            if (littleAppProxy != null) {
                return littleAppProxy.getSession();
            }
            return null;
        }
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean getFeatureGating(String str) {
        return this.f105297b.getFgValue(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getMiraPluginNativeDir(String str) {
        return this.f105297b.getMiraPluginNativeDir(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getMiraPluginSoureFile(String str) {
        return this.f105297b.getMiraPluginSoureFile(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void installMiraClassLoader(String str) {
        this.f105297b.installMiraClassLoader(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isMiraPluginInstalled(String str) {
        return this.f105297b.isMiraPluginInstalled(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean isMiraPluginLoaded(String str) {
        return this.f105297b.isMiraPluginLoaded(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void loadMiraPlugin(String str) {
        this.f105297b.loadMiraPlugin(str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void registerLarkNetQualityListener(AbstractC67854b bVar) {
        this.f105297b.registerLarkNetQualityListener(bVar);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void unRegisterLarkNetQualityListener(AbstractC67854b bVar) {
        this.f105297b.unRegisterLarkNetQualityListener(bVar);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getBlockDomain(IAppContext iAppContext) {
        return C41354g.m163939a().getDynamicDomain(DomainSettings.Alias.INTERNAL_API);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean brandApplicationCanDebug(String str) {
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.brandApplicationCanDebug(str);
        }
        Log.m165383e("HostInterfaceImpl", "brandApplicationCanDebug littleAppProxy null");
        return false;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public CrossProcessDataEntity callProcessSync(CrossProcessCallEntity crossProcessCallEntity) {
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.handleProcessSyncCall(crossProcessCallEntity);
        }
        Log.m165383e("HostInterfaceImpl", "littleAppProxy null ,in process " + C26252ad.m94992a(this.f105296a));
        return null;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean canOpenCloudFile(String str) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "canOpenCloudFile :inMainProcess");
            return this.f105297b.canOpenCloudFile(str);
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.canOpenCloudFile(str);
        }
        Log.m165383e("HostInterfaceImpl", "littleAppProxy null ");
        return false;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean canOpenUrl(String str) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "canOpenUrl :inMainProcess");
            return this.f105297b.canOpen(str);
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.canOpen(str);
        }
        Log.m165383e("HostInterfaceImpl", "littleAppProxy null ");
        return false;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void showModal(C67697b bVar) {
        if (bVar == null) {
            AppBrandLogger.m52829e("HostInterfaceImpl", "params is null");
            return;
        }
        C13145a.m53753a(bVar.mo234952a(), bVar.mo234960b(), bVar.mo234962c(), bVar.mo234964d(), bVar.mo234966e(), bVar.mo234970g(), bVar.mo234971h(), bVar.mo234972i(), bVar.mo234973j(), bVar.mo234968f(), bVar.mo234974k());
    }

    /* renamed from: a */
    private String m164313a(boolean z) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "getDeviceId :inMainProcess");
            if (z) {
                return C57859q.m224566b(this.f105297b.getDeviceId());
            }
            return this.f105297b.getDeviceId();
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy == null) {
            Log.m165383e("HostInterfaceImpl", "littleAppProxy null ");
            return null;
        } else if (z) {
            return C57859q.m224566b(littleAppProxy.getDeviceId());
        } else {
            return littleAppProxy.getDeviceId();
        }
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public String getMinaBaseUrl(IAppContext iAppContext) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "getMinaBaseUrl :inMainProcess");
            if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP) {
                try {
                    return this.f105297b.getDynamicDomain(DomainSettings.Alias.MP_CONFIG);
                } catch (Exception e) {
                    Log.m165383e("HostInterfaceImpl", "getMinaBaseUrlForGadget error:" + e.getMessage());
                    return "";
                }
            } else if (iAppContext.getAppType() == AppType.WebAPP) {
                try {
                    return this.f105297b.getDynamicDomain(DomainSettings.Alias.OPEN);
                } catch (Exception e2) {
                    Log.m165383e("HostInterfaceImpl", "getMinaBaseUrlForGadget error:" + e2.getMessage());
                    return "";
                }
            }
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy == null) {
            AppBrandLogger.m52829e("HostInterfaceImpl", "getMinaBaseUrl ipc proxy is null!");
            return "";
        } else if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP || iAppContext.getAppType() == AppType.BlockitApp) {
            return littleAppProxy.getMinaBaseUrlForGadget();
        } else {
            if (iAppContext.getAppType() == AppType.WebAPP) {
                return littleAppProxy.getMinaBaseUrlForWebApp();
            }
            Log.m165389i("HostInterfaceImpl", "getMinaBaseUrl:UnSupport AppType");
            throw new RuntimeException("getMinaBaseUrl:UnSupport AppType");
        }
    }

    public C41420a(Context context, AbstractC41301a aVar) {
        this.f105296a = context;
        this.f105297b = aVar;
        this.f105298c = C26252ad.m94993b(context);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void getAppState(String str, final HostInterface.AbstractC13576a aVar) {
        this.f105297b.getAppState(str, new AbstractC41301a.AbstractC41303b() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41420a.C414211 */

            @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41303b
            /* renamed from: a */
            public void mo148748a(int i) {
                aVar.mo50433a(i);
            }

            @Override // com.ss.android.lark.littleapp.p2124b.AbstractC41301a.AbstractC41303b
            /* renamed from: a */
            public void mo148749a(String str) {
                aVar.mo50434a(str);
            }
        });
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void openUrl(Context context, String str) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "openUrl :inMainProcess");
            this.f105297b.openUrlByLark(context, str);
            return;
        }
        C41300b.m163740a(context, str);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void callProcessAsync(CrossProcessCallEntity crossProcessCallEntity, final AbstractC67727a aVar) {
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy == null) {
            Log.m165383e("HostInterfaceImpl", "littleAppProxy null ,in process " + C26252ad.m94992a(this.f105296a));
            aVar.mo49530a(null);
            return;
        }
        littleAppProxy.handleProcessAsyncCall(crossProcessCallEntity, new LittleAppProxy.AbstractC41394a() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41420a.C414244 */

            @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy.AbstractC41394a
            public void onIpcCallback(CrossProcessDataEntity crossProcessDataEntity) {
                aVar.mo49530a(crossProcessDataEntity);
            }
        });
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public DumpService applyDumpInfo(DumpServiceType dumpServiceType, DumpConfig dumpConfig) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "addDumpInfo :inMainProcess");
            return C67892a.m264173a().mo235545a(dumpServiceType, dumpConfig);
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            Bundle applyDumpInfo = littleAppProxy.applyDumpInfo(dumpServiceType.type(), dumpConfig);
            if (applyDumpInfo == null) {
                return null;
            }
            applyDumpInfo.setClassLoader(getClass().getClassLoader());
            return (DumpService) applyDumpInfo.getParcelable("dump_service");
        }
        Log.m165383e("HostInterfaceImpl", "add dump fail , littleAppProxy null ");
        return null;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public MessageTriggerInfo getMessagesByCode(String str, String str2) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "getMessagesByCode :inMainProcess");
            return this.f105297b.getOpenPlatformDependency().mo144239a(str, str2);
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy != null) {
            return littleAppProxy.getMessagesByCode(str, str2);
        }
        Log.m165383e("HostInterfaceImpl", "getMessagesByCode littleAppProxy null ,in process " + C26252ad.m94992a(this.f105296a));
        return null;
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void openWeb(Activity activity, String str, String str2) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "openWeb :inMainProcess");
            this.f105297b.openBrowser(activity, str, str2);
            return;
        }
        C41300b.m163743a(activity, str, str2);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void startChatWindowActivityByChatterId(String str, String str2, boolean z) {
        if (this.f105298c) {
            Log.m165389i("HostInterfaceImpl", "startChatWindowActivityByChatterId :inMainProcess");
            this.f105297b.startChatterWindowActivityByChatterId(this.f105296a, str, str2, z);
            return;
        }
        LittleAppProxy littleAppProxy = (LittleAppProxy) C68183b.m264839a().mo237086a(this.f105296a, LittleAppProxy.class);
        if (littleAppProxy == null) {
            Log.m165383e("HostInterfaceImpl", "startChatWindowActivityByChatterId littleAppProxy null");
        } else {
            littleAppProxy.startChatWindowActivityByChatterId(str, str2, z);
        }
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean startFileDetailActivity(Activity activity, String str, String str2, boolean z) {
        if (!this.f105298c) {
            return C41300b.m163745a(activity, str, str2, z);
        }
        Log.m165389i("HostInterfaceImpl", "startFileDetailActivity :inMainProcess");
        return this.f105297b.startFileDetailActivity(activity, str, str2, z);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void showActionSheet(Context context, String str, String[] strArr, final AbstractC67550j.AbstractC67551a<Integer> aVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            arrayList.add(new UDBaseListDialogBuilder.ListItem(new UDBaseListDialogBuilder.ListItemBuilder(str2)));
        }
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90878d(R.layout.lark_brand_action_sheet_item)).mo90873b(arrayList)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.lark_brand_cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41420a.DialogInterface$OnClickListenerC414233 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        })).mo90869a(new UDListDialogController.OnItemClickListener() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41420a.C414222 */

            @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
            public void onItemClick(int i) {
                aVar.onNativeModuleCall(Integer.valueOf(i));
            }
        })).show();
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void startDocSelectActivity(Activity activity, int i, int i2, String str, String str2) {
        this.f105297b.startDocSelectActivity(activity, i, i2, str, str2);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void startFilePickerActivity(Activity activity, int i, int i2, String str, String str2) {
        this.f105297b.startFilePickerActivity(activity, i, i2, str, str2);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public boolean startDriveSDKActivity(Activity activity, String str, String str2, String str3, boolean z) {
        if (!this.f105298c) {
            return C41300b.m163744a(activity, str, str2, str3, z);
        }
        Log.m165389i("HostInterfaceImpl", "startDriveSDKActivity :inMainProcess");
        return this.f105297b.startDriveSDKActivity(activity, str, str2, str3, z);
    }

    @Override // com.bytedance.ee.ref.impl.host.HostInterface
    public void getLocation(Context context, String str, float f, long j, String str2, long j2, AbstractC67724a.AbstractC67726b bVar) {
        AppBrandLogger.m52830i("HostInterfaceImpl", "getLocation start");
        this.f105297b.getLocationInfo(context, str, f, j, str2, j2, bVar);
    }
}
