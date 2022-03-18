package com.huawei.hms.support.api.core;

import android.text.TextUtils;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CheckConnectResp;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeReq;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;

public final class ConnectService {
    private static final String TAG = "connectservice";

    private ConnectService() {
    }

    public static PendingResult<ResolveResult<ConnectResp>> connect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp>(apiClient, CoreNaming.CONNECT, connectInfo) {
            /* class com.huawei.hms.support.api.core.ConnectService.C237891 */

            /* access modifiers changed from: protected */
            @Override // com.huawei.hms.support.api.PendingResultImpl
            public boolean checkApiClient(ApiClient apiClient) {
                return apiClient != null;
            }

            public ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
                ResolveResult<ConnectResp> resolveResult = new ResolveResult<>(connectResp);
                resolveResult.setStatus(Status.SUCCESS);
                HMSLog.m86961d(ConnectService.TAG, "connect - onComplete: success");
                return resolveResult;
            }
        };
    }

    public static PendingResult<ResolveResult<ConnectResp>> forceConnect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp>(apiClient, CoreNaming.FORECONNECT, connectInfo) {
            /* class com.huawei.hms.support.api.core.ConnectService.C237902 */

            /* access modifiers changed from: protected */
            @Override // com.huawei.hms.support.api.PendingResultImpl
            public boolean checkApiClient(ApiClient apiClient) {
                return apiClient != null;
            }

            public ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
                ResolveResult<ConnectResp> resolveResult = new ResolveResult<>(connectResp);
                resolveResult.setStatus(Status.SUCCESS);
                HMSLog.m86961d(ConnectService.TAG, "forceConnect - onComplete: success");
                return resolveResult;
            }
        };
    }

    public static InnerPendingResult<ResolveResult<CheckConnectResp>> checkconnect(ApiClient apiClient, CheckConnectInfo checkConnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.CHECKCONNECT, checkConnectInfo, CheckConnectResp.class);
    }

    public static ResolvePendingResult<DisconnectResp> disconnect(ApiClient apiClient, DisconnectInfo disconnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.DISCONNECT, disconnectInfo, DisconnectResp.class);
    }

    public static PendingResult<ResolveResult<JosGetNoticeResp>> getNotice(ApiClient apiClient, int i, String str) {
        JosGetNoticeReq josGetNoticeReq = new JosGetNoticeReq();
        josGetNoticeReq.setNoticeType(i);
        josGetNoticeReq.setHmsSdkVersionName(str);
        if (!TextUtils.isEmpty(apiClient.getCpID())) {
            josGetNoticeReq.setCpID(apiClient.getCpID());
        }
        return new PendingResultImpl<ResolveResult<JosGetNoticeResp>, JosGetNoticeResp>(apiClient, CoreNaming.GETNOTICE, josGetNoticeReq) {
            /* class com.huawei.hms.support.api.core.ConnectService.C237913 */

            public ResolveResult<JosGetNoticeResp> onComplete(JosGetNoticeResp josGetNoticeResp) {
                if (josGetNoticeResp == null) {
                    HMSLog.m86964e(ConnectService.TAG, "JosNoticeResp is null");
                    return null;
                }
                HMSLog.m86966i(ConnectService.TAG, "josNoticeResp status code :" + josGetNoticeResp.getStatusCode());
                ResolveResult<JosGetNoticeResp> resolveResult = new ResolveResult<>(josGetNoticeResp);
                resolveResult.setStatus(Status.SUCCESS);
                return resolveResult;
            }
        };
    }
}
