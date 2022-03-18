package com.ss.android.lark.integrator.p2019f;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.f.b */
public class C39404b {

    /* renamed from: a */
    private static final PassportLog f100741a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    public static void m155633a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        PassportLog passportLog = f100741a;
        passportLog.mo171465b("PerfQuickSwitchUserLog", "onSwitchTenantUserClick from =  " + str + "start time = " + currentTimeMillis);
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        iCoreApi.startPerfQuickSwitchUserMonitor(str);
        iCoreApi.getPerfQuickSwitchUserMonitor().mo105365a(currentTimeMillis);
    }

    /* renamed from: a */
    public static void m155632a(TenantInfo tenantInfo, final IGetDataCallback<Boolean> iGetDataCallback) {
        m155633a("push");
        C39959a.m158588a().mo101459p().mo172413a(tenantInfo, new IGetDataCallback<SessionResult>() {
            /* class com.ss.android.lark.integrator.p2019f.C39404b.C394062 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(SessionResult sessionResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(true);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m155634a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        List<TenantInfo> C = C39959a.m158588a().mo101386C();
        HashMap hashMap = new HashMap();
        for (TenantInfo tenantInfo : C) {
            hashMap.put(tenantInfo.getUserId(), tenantInfo);
        }
        TenantInfo tenantInfo2 = (TenantInfo) hashMap.get(str);
        if (tenantInfo2 == null) {
            PassportLog passportLog = f100741a;
            passportLog.mo171465b("SwitchTenantUtils", "can not find target tenant");
            String a = C53234a.m205877a();
            passportLog.mo171465b("SwitchTenantUtils", "contextId = " + a);
            C39959a.m158588a().mo101425a(a, str, new IGetDataCallback<TenantInfo>() {
                /* class com.ss.android.lark.integrator.p2019f.C39404b.C394051 */

                /* renamed from: a */
                public void onSuccess(TenantInfo tenantInfo) {
                    C39404b.m155632a(tenantInfo, iGetDataCallback);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
            return;
        }
        m155632a(tenantInfo2, iGetDataCallback);
    }
}
