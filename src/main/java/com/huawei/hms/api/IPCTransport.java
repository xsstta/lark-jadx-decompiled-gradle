package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.AbstractC23525c;
import com.huawei.hms.core.aidl.C23522a;
import com.huawei.hms.core.aidl.C23523b;
import com.huawei.hms.core.aidl.C23531e;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

public class IPCTransport implements DatagramTransport {

    /* renamed from: a */
    private final String f57854a;

    /* renamed from: b */
    private final IMessageEntity f57855b;

    /* renamed from: c */
    private final Class<? extends IMessageEntity> f57856c;

    /* renamed from: d */
    private int f57857d;

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.CallBack callBack) {
        send(apiClient, callBack);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.CallBack callBack) {
        int a = m85080a(apiClient, new IPCCallback(this.f57856c, callBack));
        if (a != 0) {
            callBack.onCallback(a, null);
        }
    }

    /* renamed from: a */
    private int m85080a(ApiClient apiClient, AbstractC23525c cVar) {
        if (apiClient instanceof HuaweiApiClientImpl) {
            C23523b bVar = new C23523b(this.f57854a, ProtocolNegotiate.getInstance().getVersion());
            C23531e a = C23522a.m85287a(bVar.mo82630c());
            bVar.mo82628a(a.mo82640a(this.f57855b, new Bundle()));
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setAppID(apiClient.getAppID());
            requestHeader.setPackageName(apiClient.getPackageName());
            requestHeader.setSdkVersion(50005300);
            requestHeader.setApiNameList(((HuaweiApiClientImpl) apiClient).getApiNameList());
            requestHeader.setSessionId(apiClient.getSessionId());
            requestHeader.setApiLevel(this.f57857d);
            bVar.f57979b = a.mo82640a(requestHeader, new Bundle());
            try {
                HuaweiApiClientImpl huaweiApiClientImpl = (HuaweiApiClientImpl) apiClient;
                if (huaweiApiClientImpl.getService() == null) {
                    HMSLog.m86964e("IPCTransport", "HuaweiApiClient is not binded to service yet.");
                    return CommonCode.ErrorCode.INTERNAL_ERROR;
                }
                huaweiApiClientImpl.getService().mo82638a(bVar, cVar);
                return 0;
            } catch (Exception e) {
                HMSLog.m86964e("IPCTransport", "sync call ex:" + e);
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
        } else {
            if (apiClient instanceof AidlApiClient) {
                AidlApiClient aidlApiClient = (AidlApiClient) apiClient;
                C23523b bVar2 = new C23523b(this.f57854a, ProtocolNegotiate.getInstance().getVersion());
                bVar2.mo82628a(C23522a.m85287a(bVar2.mo82630c()).mo82640a(this.f57855b, new Bundle()));
                try {
                    aidlApiClient.getService().mo82638a(bVar2, cVar);
                    return 0;
                } catch (Exception e2) {
                    HMSLog.m86964e("IPCTransport", "sync call ex:" + e2);
                }
            }
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
        this.f57854a = str;
        this.f57855b = iMessageEntity;
        this.f57856c = cls;
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls, int i) {
        this.f57854a = str;
        this.f57855b = iMessageEntity;
        this.f57856c = cls;
        this.f57857d = i;
    }
}
