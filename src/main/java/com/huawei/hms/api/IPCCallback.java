package com.huawei.hms.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.AbstractC23525c;
import com.huawei.hms.core.aidl.C23522a;
import com.huawei.hms.core.aidl.C23523b;
import com.huawei.hms.core.aidl.C23531e;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

public class IPCCallback extends AbstractC23525c.AbstractBinderC23526a {

    /* renamed from: a */
    private final Class<? extends IMessageEntity> f57852a;

    /* renamed from: b */
    private final DatagramTransport.CallBack f57853b;

    /* access modifiers changed from: protected */
    public IMessageEntity newResponseInstance() {
        Class<? extends IMessageEntity> cls = this.f57852a;
        if (cls == null) {
            return null;
        }
        try {
            return (IMessageEntity) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            HMSLog.m86964e("IPCCallback", "In newResponseInstance, instancing exception." + e.getMessage());
            return null;
        }
    }

    @Override // com.huawei.hms.core.aidl.AbstractC23525c
    public void call(C23523b bVar) throws RemoteException {
        if (bVar == null || TextUtils.isEmpty(bVar.f57978a)) {
            HMSLog.m86964e("IPCCallback", "In call, URI cannot be empty.");
            throw new RemoteException();
        }
        C23531e a = C23522a.m85287a(bVar.mo82630c());
        IMessageEntity iMessageEntity = null;
        if (bVar.mo82629b() > 0 && (iMessageEntity = newResponseInstance()) != null) {
            a.mo82641a(bVar.mo82627a(), iMessageEntity);
        }
        if (bVar.f57979b != null) {
            ResponseHeader responseHeader = new ResponseHeader();
            a.mo82641a(bVar.f57979b, responseHeader);
            this.f57853b.onCallback(responseHeader.getStatusCode(), iMessageEntity);
            return;
        }
        this.f57853b.onCallback(0, iMessageEntity);
    }

    public IPCCallback(Class<? extends IMessageEntity> cls, DatagramTransport.CallBack callBack) {
        this.f57852a = cls;
        this.f57853b = callBack;
    }
}
