package com.bytedance.ee.ref.impl.host;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.eenet.util.HttpChannel;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.ee.ref.impl.host.p697a.C13581a;
import com.ss.android.lark.littleapp.C41300b;
import com.ss.android.lark.permission.C51325d;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.settings.v2.handler.C66788n;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3367e.AbstractC67457c;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.service.net.AbstractC67854b;
import com.tt.refer.common.service.net.entity.C67856a;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.impl.host.a */
public class C13577a extends AbstractC67457c implements AbstractC67724a {
    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50445a(AbstractC67854b bVar) {
        HostExtensionManager.getInstance().getHostInterface().registerLarkNetQualityListener(bVar);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public boolean mo50450a(String str) {
        return HostExtensionManager.getInstance().getHostInterface().canOpenCloudFile(str);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public boolean mo50449a(Activity activity, String str, String str2, String str3, boolean z) {
        return HostExtensionManager.getInstance().getHostInterface().startDriveSDKActivity(activity, str, str2, str3, z);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50444a(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar) {
        HostExtensionManager.getInstance().getHostInterface().showActionSheet(context, str, strArr, aVar);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50447a(String str, final AbstractC67724a.AbstractC67725a aVar) {
        HostExtensionManager.getInstance().getHostInterface().getAppState(str, new HostInterface.AbstractC13576a() {
            /* class com.bytedance.ee.ref.impl.host.C13577a.C135781 */

            @Override // com.bytedance.ee.ref.impl.host.HostInterface.AbstractC13576a
            /* renamed from: a */
            public void mo50433a(int i) {
                aVar.mo235097a(i);
            }

            @Override // com.bytedance.ee.ref.impl.host.HostInterface.AbstractC13576a
            /* renamed from: a */
            public void mo50434a(String str) {
                aVar.mo235098a(str);
            }
        });
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50448a(String str, String str2) {
        C41300b.m163741a(str, str2, getAppContext().getCurrentActivity());
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50446a(String str, CrossProcessDataEntity crossProcessDataEntity, AbstractC67727a aVar) {
        CrossProcessCallEntity crossProcessCallEntity = new CrossProcessCallEntity("hostProcess", str, crossProcessDataEntity);
        if (ProcessUtil.isMainProcess(AppbrandContext.getInst().getApplicationContext())) {
            C13581a.m55111a(crossProcessCallEntity, aVar);
        } else {
            HostExtensionManager.getInstance().getHostInterface().callProcessAsync(crossProcessCallEntity, aVar);
        }
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public int mo50435a() {
        return HostExtensionManager.getInstance().getHostInterface().getCurNetworkLevel();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: c */
    public int mo50457c() {
        return HostExtensionManager.getInstance().getHostInterface().getTTNetworkQualityType();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: d */
    public String mo50459d() {
        return HostExtensionManager.getInstance().getHostInterface().getSession();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: e */
    public boolean mo50461e() {
        return HostExtensionManager.getInstance().getHostInterface().isLoginLarkEnv();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: f */
    public int mo50463f() {
        return HostExtensionManager.getInstance().getHostInterface().getEnvType();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: g */
    public boolean mo50465g() {
        if (C12617b.m52367d() == HttpChannel.OkHttpChannel) {
            return true;
        }
        return false;
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: h */
    public boolean mo50467h() {
        return HostExtensionManager.getInstance().getHostInterface().isUsingTTWebView();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: i */
    public String mo50468i() {
        return HostExtensionManager.getInstance().getHostInterface().getTTWebViewSoVersion();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: j */
    public String mo50469j() {
        return HostExtensionManager.getInstance().getHostInterface().getTenantId();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: k */
    public String mo50470k() {
        return HostExtensionManager.getInstance().getHostInterface().getDeviceId();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: l */
    public String mo50471l() {
        return HostExtensionManager.getInstance().getHostInterface().getUserId();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: m */
    public long mo50472m() {
        return HostExtensionManager.getInstance().getHostInterface().getServerTime();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: n */
    public boolean mo50473n() {
        return HostExtensionManager.getInstance().getHostInterface().isShowGlobalWatermark();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: o */
    public boolean mo50474o() {
        return HostExtensionManager.getInstance().getHostInterface().isGooglePlay();
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: p */
    public String mo50475p() {
        return HostExtensionManager.getInstance().getHostInterface().getBlockDomain(this.f170082d);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: b */
    public C67856a mo50452b() {
        return HostExtensionManager.getInstance().getHostInterface().getNetworkQuality();
    }

    public C13577a(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: b */
    public boolean mo50455b(IAppContext iAppContext) {
        return C41300b.m163750a(iAppContext);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: c */
    public String mo50458c(String str) {
        return C12782a.m52838b(str, "");
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public String mo50438a(IAppContext iAppContext) {
        return HostExtensionManager.getInstance().getHostInterface().getMinaBaseUrl(iAppContext);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: d */
    public List<C66578b.C66579a> mo50460d(String str) {
        return C13282a.m54094a(str, getAppContext());
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: f */
    public boolean mo50464f(String str) {
        return HostExtensionManager.getInstance().getHostInterface().canOpenUrl(str);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: g */
    public boolean mo50466g(String str) {
        return HostExtensionManager.getInstance().getHostInterface().brandApplicationCanDebug(str);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: b */
    public void mo50454b(AbstractC67854b bVar) {
        HostExtensionManager.getInstance().getHostInterface().unRegisterLarkNetQualityListener(bVar);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: e */
    public boolean mo50462e(String str) {
        if (this.f170082d.getAppType() == AppType.GadgetAPP) {
            try {
                AppInfoEntity appInfo = C67432a.m262319a(this.f170082d).getAppInfo();
                boolean a = C66788n.m260652a().mo232698a(str, appInfo.appId);
                AppBrandLogger.m52830i("HostServiceImpl", "checkInternalApi, appId: ", appInfo.appId, ", appName: ", appInfo.appName, ", allowed: ", Boolean.valueOf(a));
                return a;
            } catch (Exception e) {
                AppBrandLogger.m52829e("HostServiceImpl", "checkInternalApi error: " + e.getMessage(), e);
            }
        }
        return false;
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: b */
    public boolean mo50456b(String str) {
        return HostExtensionManager.getInstance().getHostInterface().getFeatureGating(str);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: b */
    public MessageTriggerInfo mo50451b(String str, String str2) {
        return HostExtensionManager.getInstance().getHostInterface().getMessagesByCode(str, str2);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public CrossProcessDataEntity mo50436a(String str, CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessCallEntity crossProcessCallEntity = new CrossProcessCallEntity("hostProcess", str, crossProcessDataEntity);
        if (ProcessUtil.isMainProcess(AppbrandContext.getInst().getApplicationContext())) {
            return C13581a.m55110a(crossProcessCallEntity);
        }
        return HostExtensionManager.getInstance().getHostInterface().callProcessSync(crossProcessCallEntity);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50442a(Context context, String str) {
        HostExtensionManager.getInstance().getHostInterface().openUrl(context, str);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50440a(Activity activity, String str, String str2) {
        HostExtensionManager.getInstance().getHostInterface().openWeb(activity, str, str2);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50441a(final Activity activity, final String[] strArr, final AbstractC67709b.AbstractC67711b bVar) {
        C67866g.m264027a(new Runnable() {
            /* class com.bytedance.ee.ref.impl.host.C13577a.RunnableC135792 */

            public void run() {
                Activity activity = activity;
                if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                    AppBrandLogger.m52829e("HostServiceImpl", " activity is destroyed");
                    return;
                }
                final ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
                new C51331a(activity).mo176925d(strArr).subscribe(new Consumer<C51325d>() {
                    /* class com.bytedance.ee.ref.impl.host.C13577a.RunnableC135792.C135801 */

                    /* renamed from: a */
                    public void accept(C51325d dVar) throws Exception {
                        if (dVar.f127818b) {
                            arrayList.remove(dVar.f127817a);
                            if (arrayList.isEmpty()) {
                                bVar.mo87574a();
                                return;
                            }
                            return;
                        }
                        bVar.mo87575a(dVar.f127817a);
                    }
                });
            }
        });
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public Observable<String> mo50437a(String str, Map<String, String> map, JSONObject jSONObject, IAppContext iAppContext, boolean z) {
        return C12843b.m53039a(str, map, jSONObject, iAppContext, z);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: b */
    public void mo50453b(Activity activity, int i, int i2, String str, String str2) {
        HostExtensionManager.getInstance().getHostInterface().startDocSelectActivity(activity, i, i2, str, str2);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50439a(Activity activity, int i, int i2, String str, String str2) {
        HostExtensionManager.getInstance().getHostInterface().startFilePickerActivity(activity, i, i2, str, str2);
    }

    @Override // com.tt.refer.p3400a.p3408f.AbstractC67724a
    /* renamed from: a */
    public void mo50443a(Context context, String str, float f, long j, String str2, long j2, AbstractC67724a.AbstractC67726b bVar) {
        AppBrandLogger.m52830i("HostServiceImpl", "getLocation start");
        HostExtensionManager.getInstance().getHostInterface().getLocation(context, str, f, j, str2, j2, bVar);
    }
}
