package com.bytedance.ee.larkbrand.permission;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.webapp.p720a.C13757d;
import com.bytedance.lark.pb.openplatform.v1.BadgeNodeActionCode;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse;
import com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25105b;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.impl.business.p3427a.p3428a.C67869a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.permission.f */
public class C13290f {
    /* renamed from: a */
    public static CommonEnum.OpenAppFeatureType m54125a(IAppContext iAppContext) {
        if (iAppContext.getAppType() == AppType.GadgetAPP || iAppContext.getAppType() == AppType.WebGadgetAPP) {
            return CommonEnum.OpenAppFeatureType.MiniApp;
        }
        if (iAppContext.getAppType() == AppType.WebAPP) {
            return CommonEnum.OpenAppFeatureType.H5;
        }
        return null;
    }

    /* renamed from: a */
    public static List<LittleAppPermissionData> m54127a(Context context, String str, AppType appType) {
        return C13288e.m54115a().mo49524a(context, str, appType);
    }

    /* renamed from: a */
    public static IGetDataCallback<UpdateOpenAppBadgeNodeResponse> m54126a(final String str, CommonEnum.OpenAppFeatureType openAppFeatureType, final String str2, final IMonitorCreator iMonitorCreator, final Integer num) {
        return new IGetDataCallback<UpdateOpenAppBadgeNodeResponse>() {
            /* class com.bytedance.ee.larkbrand.permission.C13290f.C132943 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AppBrandLogger.m52830i("PermissionDataHandler", "UPDATE_LOCAL_OPEN_APP_BADGE_NODE onError" + errorResult.getDisplayMsg());
                LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_update_notice_node", num, str2, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
            }

            /* renamed from: a */
            public void onSuccess(UpdateOpenAppBadgeNodeResponse updateOpenAppBadgeNodeResponse) {
                if (updateOpenAppBadgeNodeResponse == null) {
                    AppBrandLogger.m52830i("PermissionDataHandler", "UPDATE_LOCAL_OPEN_APP_BADGE_NODE response null");
                    LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_update_notice_node", num, str2, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                } else if (updateOpenAppBadgeNodeResponse.code != BadgeNodeActionCode.CODE_SUCCESS) {
                    AppBrandLogger.m52830i("PermissionDataHandler", "UPDATE_LOCAL_OPEN_APP_BADGE_NODE failed， err = " + updateOpenAppBadgeNodeResponse.msg);
                    ApiCode a = C25105b.m90438a(updateOpenAppBadgeNodeResponse);
                    LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_update_notice_node", num, str2, false, String.valueOf(a.code), a.msg);
                } else {
                    LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_update_notice_node", num, str2, true, null, null);
                    HashMap hashMap = new HashMap();
                    hashMap.put(str, null);
                    C67869a.m264038a((HashMap<String, Integer>) hashMap, (IGetDataCallback<PullOpenAppBadgeNodesResponse>) new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
                        /* class com.bytedance.ee.larkbrand.permission.C13290f.C132943.C132951 */

                        /* renamed from: a */
                        public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                            AppBrandLogger.m52830i("PermissionDataHandler", "PULL_OPEN_APP_BADGE_NODES success");
                            LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_pull_node", 2, str2, true, null, null);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            AppBrandLogger.m52830i("PermissionDataHandler", "PULL_OPEN_APP_BADGE_NODES err = " + errorResult.getDisplayMsg());
                            LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_pull_node", 2, str2, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                        }
                    }, false, true);
                }
            }
        };
    }

    /* renamed from: a */
    public static void m54128a(Context context, String str, String str2, AppType appType, final AbstractC13298i iVar) {
        IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(str);
        if (e == null) {
            AppBrandLogger.m52830i("PermissionDataHandler", "process is null appId:" + str);
        }
        if (e == null || !e.isAppSandBoxEnvExistByAppId(context, str)) {
            AppBrandLogger.m52830i("PermissionDataHandler", "App process not exist, syncAuth from main process");
            IAppContext a = C13282a.m54091a(context, str, appType);
            if (a == null) {
                AppBrandLogger.m52830i("PermissionDataHandler", "appContext null, invalid appType for syncAuth");
                iVar.mo49532b();
                return;
            }
            HostDependManager.getInst().syncAuth(str, a, iVar);
            return;
        }
        ((AbstractC67724a) C13282a.m54091a(context, str, appType).findServiceByInterface(AbstractC67724a.class)).mo50446a("sync_auth", CrossProcessDataEntity.C67574a.m263013a().mo234760a("app_id", (Object) str).mo234759a("app_type", (Serializable) appType).mo234763b(), new AbstractC67727a() {
            /* class com.bytedance.ee.larkbrand.permission.C13290f.C132911 */

            @Override // com.tt.refer.p3400a.p3408f.p3409a.AbstractC67727a
            /* renamed from: a */
            public void mo49530a(CrossProcessDataEntity crossProcessDataEntity) {
                if (Boolean.valueOf(crossProcessDataEntity.mo234746d("sync_auth_result")).booleanValue()) {
                    iVar.mo49531a();
                } else {
                    iVar.mo49532b();
                }
            }
        });
    }

    /* renamed from: a */
    public static void m54130a(Context context, final String str, List<LittleAppPermissionData> list, final IAppContext iAppContext, String str2, final Integer num) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC67733a aVar = (AbstractC67733a) iAppContext.findServiceByInterface(AbstractC67733a.class);
        AbstractC67734b bVar = (AbstractC67734b) iAppContext.findServiceByInterface(AbstractC67734b.class);
        HashMap hashMap = new HashMap();
        for (LittleAppPermissionData littleAppPermissionData : list) {
            aVar.mo50183b(littleAppPermissionData.getPermission(), littleAppPermissionData.isGranted());
            bVar.mo50189a(context, littleAppPermissionData.getPermission(), str, currentTimeMillis);
            if (littleAppPermissionData.getPermission() == 20) {
                hashMap.put(20, Boolean.valueOf(littleAppPermissionData.isGranted()));
            }
        }
        if (hashMap.isEmpty() || !hashMap.containsKey(20)) {
            HostDependManager.getInst().syncPermissionToService(iAppContext, str2);
            return;
        }
        final boolean booleanValue = ((Boolean) hashMap.get(20)).booleanValue();
        HostDependManager.getInst().syncPermissionToService(iAppContext, str2, new AbstractC13298i() {
            /* class com.bytedance.ee.larkbrand.permission.C13290f.C132922 */

            @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
            /* renamed from: b */
            public void mo49532b() {
            }

            @Override // com.bytedance.ee.larkbrand.permission.AbstractC13298i
            /* renamed from: a */
            public void mo49531a() {
                final IMonitorCreator iMonitorCreator;
                CommonEnum.OpenAppFeatureType a = C13290f.m54125a(iAppContext);
                if (a == null) {
                    AppBrandLogger.m52830i("PermissionDataHandler", "invalid appType, can not update local bage");
                    return;
                }
                if (a == CommonEnum.OpenAppFeatureType.MiniApp) {
                    iMonitorCreator = new GadgetMonitorCreator(iAppContext);
                } else {
                    iMonitorCreator = new C13757d(iAppContext);
                }
                final String a2 = C25105b.m90439a(str, Boolean.valueOf(booleanValue), null, a);
                C67869a.m264035a(str, null, Boolean.valueOf(booleanValue), a, C13290f.m54126a(str, a, a2, iMonitorCreator, num));
                HashMap hashMap = new HashMap();
                hashMap.put(str, null);
                C67869a.m264038a((HashMap<String, Integer>) hashMap, (IGetDataCallback<PullOpenAppBadgeNodesResponse>) new IGetDataCallback<PullOpenAppBadgeNodesResponse>() {
                    /* class com.bytedance.ee.larkbrand.permission.C13290f.C132922.C132931 */

                    /* renamed from: a */
                    public void onSuccess(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
                        AppBrandLogger.m52830i("PermissionDataHandler", "PULL_OPEN_APP_BADGE_NODES success");
                        LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_pull_node", 2, a2, true, null, null);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        AppBrandLogger.m52830i("PermissionDataHandler", "PULL_OPEN_APP_BADGE_NODES err = " + errorResult.getDisplayMsg());
                        LarkInnerEventHelper.mpBadgeLocalOperation(iMonitorCreator, "op_app_badge_pull_node", 2, a2, false, String.valueOf(ApiCode.GENERAL_UNKONW_ERROR.code), ApiCode.GENERAL_UNKONW_ERROR.msg);
                    }
                }, false, true);
            }
        });
    }

    /* renamed from: a */
    public static void m54129a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num) {
        String str4;
        IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(str);
        if (e == null) {
            AppBrandLogger.m52830i("PermissionDataHandler", "process is null appId:" + str);
        }
        if (e == null || !e.isAppSandBoxEnvExistByAppId(context, str)) {
            AppBrandLogger.m52830i("PermissionDataHandler", "App process not exist, update request permission to preference");
            IAppContext a = C13282a.m54091a(context, str, appType);
            if (a == null) {
                AppBrandLogger.m52830i("PermissionDataHandler", "appContext null, invalid appType for updateRequestedPermissions");
                return;
            }
            m54130a(context, str, list, a, str3, num);
            return;
        }
        CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("scene", (Object) num).mo234760a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) JSON.toJSONString(list)).mo234763b();
        if (TextUtils.isEmpty(str2)) {
            str4 = C13374s.m54383a(C13301k.m54149a().mo49536d(C13282a.m54091a(context, str, appType)));
        } else {
            str4 = str2;
        }
        C13374s.m54388a(str4, b, false);
    }
}
