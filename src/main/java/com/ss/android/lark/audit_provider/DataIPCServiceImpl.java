package com.ss.android.lark.audit_provider;

import android.content.Context;
import com.ss.android.lark.audit.auth.C29299c;
import com.ss.android.lark.audit.auth.TransactionalPermData;
import com.ss.android.lark.audit.db.AuditDBData;
import com.ss.android.lark.audit.db.C29313b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.List;

@RemoteServiceImpl(service = IDataIPCService.class)
public class DataIPCServiceImpl implements IDataIPCService {
    public DataIPCServiceImpl(Context context) {
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void deletePermissionData(String str) {
        Log.m165389i("DataIPCServiceImpl", "deletePermissionData");
        C29299c.m107708a().deletePermissionData(str);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public TransactionalPermData queryPermissionData(String str) {
        Log.m165389i("DataIPCServiceImpl", "queryPermissionData");
        return C29299c.m107708a().queryPermissionData(str);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void deleteAuditData(String str, List<AuditDBData> list) {
        Log.m165389i("DataIPCServiceImpl", "deleteAuditData");
        C29313b.m107749a().deleteAuditData(str, list);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public List<AuditDBData> queryAuditData(String str, int i) {
        Log.m165389i("DataIPCServiceImpl", "queryAuditData");
        return C29313b.m107749a().queryAuditData(str, i);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void recordAuditData(String str, String str2) {
        Log.m165389i("DataIPCServiceImpl", "recordAuditData");
        C29313b.m107749a().recordAuditData(str, str2);
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2) {
        Log.m165389i("DataIPCServiceImpl", "savePermissionData");
        C29299c.m107708a().savePermissionData(str, str2, bArr, bArr2);
    }
}
