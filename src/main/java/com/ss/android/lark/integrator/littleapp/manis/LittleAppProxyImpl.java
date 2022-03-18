package com.ss.android.lark.integrator.littleapp.manis;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.ref.impl.host.p697a.C13581a;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.mains.LittleAppProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.tt.miniapp.debug.InspectDebugHelper;
import com.tt.miniapp.launchaction.bean.MessageTriggerInfo;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.impl.business.api.diagnose.entity.C67892a;
import com.tt.refer.impl.business.api.diagnose.entity.DumpConfig;
import com.tt.refer.impl.business.api.diagnose.entity.DumpService;
import com.tt.refer.impl.business.api.diagnose.entity.DumpServiceType;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;

@RemoteServiceImpl(service = LittleAppProxy.class)
public class LittleAppProxyImpl implements LittleAppProxy {
    private Context mContext;

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean inspectModeIsOpen() {
        return InspectDebugHelper.f166565a.mo230982a();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public int getEnvType() {
        return C41354g.m163939a().getEnvType();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public long getServerTime() {
        return C41354g.m163939a().getServerTime();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean isLoginLarkEnv() {
        return C41354g.m163939a().isOverseaTenantBrand();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getDeviceId() {
        try {
            return C41354g.m163939a().getDeviceId();
        } catch (Exception e) {
            Log.m165385e("LittleAppProxyImpl", " getdeviceid err ", e, true);
            return "";
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getMinaBaseUrlForGadget() {
        try {
            return C41354g.m163939a().getDynamicDomain(DomainSettings.Alias.MP_CONFIG);
        } catch (Exception e) {
            Log.m165383e("LittleAppProxyImpl", "getMinaBaseUrlForGadget error:" + e.getMessage());
            return "";
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getMinaBaseUrlForWebApp() {
        try {
            return C41354g.m163939a().getDynamicDomain(DomainSettings.Alias.OPEN);
        } catch (Exception e) {
            Log.m165383e("LittleAppProxyImpl", "getMinaBaseUrlForWebApp error:" + e.getMessage());
            return "";
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public String getSession() {
        try {
            return C41354g.m163939a().getLoginDependency().mo144246a();
        } catch (Exception e) {
            Log.m165383e("LittleAppProxyImpl", "getSession error:" + e.getMessage());
            return "";
        }
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean brandApplicationCanDebug(String str) {
        return InspectDebugHelper.f166565a.mo230983a(str);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public CrossProcessDataEntity handleProcessSyncCall(CrossProcessCallEntity crossProcessCallEntity) {
        return C13581a.m55110a(crossProcessCallEntity);
    }

    public LittleAppProxyImpl(Context context) {
        this.mContext = context;
        LittleAppModuleProvider.m157932a();
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean canOpen(String str) {
        return C41354g.m163939a().canOpen(str);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public boolean canOpenCloudFile(String str) {
        return C41354g.m163939a().canOpenCloudFile(str);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public MessageTriggerInfo getMessagesByCode(String str, String str2) {
        return C41354g.m163939a().getOpenPlatformDependency().mo144239a(str, str2);
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public void handleProcessAsyncCall(CrossProcessCallEntity crossProcessCallEntity, final LittleAppProxy.AbstractC41394a aVar) {
        C13581a.m55111a(crossProcessCallEntity, new AbstractC67727a() {
            /* class com.ss.android.lark.integrator.littleapp.manis.LittleAppProxyImpl.C398271 */

            @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
            /* renamed from: a */
            public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                aVar.onIpcCallback(crossProcessDataEntity);
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public Bundle applyDumpInfo(String str, DumpConfig dumpConfig) {
        Bundle bundle = new Bundle();
        DumpService a = C67892a.m264173a().mo235545a(DumpServiceType.getServiceType(str), dumpConfig);
        if (a != null) {
            bundle.putParcelable("dump_service", a);
        }
        return bundle;
    }

    @Override // com.ss.android.lark.littleapp.mains.LittleAppProxy
    public void startChatWindowActivityByChatterId(String str, String str2, boolean z) {
        C41354g.m163939a().startChatterWindowActivityByChatterId(this.mContext, str, str2, z);
    }
}
