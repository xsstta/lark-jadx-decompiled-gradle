package com.ss.android.lark.audit_provider;

import android.content.Context;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.audit.auth.TransactionalPermData;
import com.ss.android.lark.audit.db.AuditDBData;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.C68183b;
import java.util.List;

/* renamed from: com.ss.android.lark.audit_provider.b */
public class C29384b implements AbstractC29324f.AbstractC29325a, AbstractC29324f.AbstractC29326b {

    /* renamed from: a */
    private IDataIPCService f73460a;

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void deletePermissionData(String str) {
        IDataIPCService iDataIPCService = this.f73460a;
        if (iDataIPCService == null) {
            Log.m165383e("DataIPCServiceImpl", "deletePermissionData failed for null mDataIPCService");
        } else {
            iDataIPCService.deletePermissionData(str);
        }
    }

    public C29384b(Context context) {
        try {
            this.f73460a = (IDataIPCService) C68183b.m264839a().mo237086a(context, IDataIPCService.class);
        } catch (Throwable th) {
            Log.m165384e("DataIPCServiceImpl", "init DataHandlerImpl failed", th);
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public TransactionalPermData queryPermissionData(String str) {
        IDataIPCService iDataIPCService = this.f73460a;
        if (iDataIPCService != null) {
            return iDataIPCService.queryPermissionData(str);
        }
        Log.m165383e("DataIPCServiceImpl", "queryPermissionData failed for null mDataIPCService");
        return null;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void deleteAuditData(String str, List<AuditDBData> list) {
        IDataIPCService iDataIPCService = this.f73460a;
        if (iDataIPCService == null) {
            Log.m165383e("DataIPCServiceImpl", "deleteAuditData failed for null mDataIPCService");
        } else {
            iDataIPCService.deleteAuditData(str, list);
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public void recordAuditData(String str, String str2) {
        IDataIPCService iDataIPCService = this.f73460a;
        if (iDataIPCService == null) {
            Log.m165383e("DataIPCServiceImpl", "recordAuditData failed for null mDataIPCService");
        } else {
            iDataIPCService.recordAuditData(str, str2);
        }
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29325a
    public List<AuditDBData> queryAuditData(String str, int i) {
        IDataIPCService iDataIPCService = this.f73460a;
        if (iDataIPCService != null) {
            return iDataIPCService.queryAuditData(str, i);
        }
        Log.m165383e("DataIPCServiceImpl", "queryAuditData failed for null mDataIPCService");
        return null;
    }

    @Override // com.ss.android.lark.audit.AbstractC29324f.AbstractC29326b
    public void savePermissionData(String str, String str2, byte[] bArr, byte[] bArr2) {
        IDataIPCService iDataIPCService = this.f73460a;
        if (iDataIPCService == null) {
            Log.m165383e("DataIPCServiceImpl", "savePermissionData failed for null mDataIPCService");
        } else {
            iDataIPCService.savePermissionData(str, str2, bArr, bArr2);
        }
    }
}
