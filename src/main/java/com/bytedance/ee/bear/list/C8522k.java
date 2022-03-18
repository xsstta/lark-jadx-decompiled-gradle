package com.bytedance.ee.bear.list;

import android.util.Log;
import com.bytedance.ee.bear.contract.offline.AbstractC5210a;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.list.k */
public class C8522k {

    /* renamed from: a */
    private static volatile C8522k f23062a;

    /* renamed from: b */
    private AbstractC5210a f23063b;

    /* renamed from: a */
    public static C8522k m35387a() {
        if (f23062a == null) {
            synchronized (C8522k.class) {
                if (f23062a == null) {
                    f23062a = new C8522k(new C8523l(new C10917c(new C10929e())));
                }
            }
        }
        return f23062a;
    }

    private C8522k(AbstractC5210a aVar) {
        this.f23063b = aVar;
    }

    /* renamed from: a */
    public void mo33288a(OfflineDoc offlineDoc) {
        Log.d("OfflineOperationProxy", "ListDataServiceImpl.handleSyncedDoc: 66 doc=");
        AbstractC5210a aVar = this.f23063b;
        if (aVar != null) {
            aVar.mo20899a(offlineDoc);
        } else {
            Log.d("OfflineOperationProxy", "ListDataServiceImpl.handleSyncedDoc: 70 mOfflineOperator is null");
        }
    }

    /* renamed from: b */
    public AbstractC68307f<Boolean> mo33290b(String str) {
        Log.d("OfflineOperationProxy", "ListDataServiceImpl.deleteOfflineDoc: 56 fakeToken=" + str);
        AbstractC5210a aVar = this.f23063b;
        if (aVar != null) {
            return aVar.mo20901b(str);
        }
        return AbstractC68307f.m265097b();
    }

    /* renamed from: a */
    public AbstractC68307f<OfflineDoc> mo33286a(String str) {
        Log.d("OfflineOperationProxy", "ListDataServiceImpl.getOfflineDoc: 45 fakeToken=" + str);
        AbstractC5210a aVar = this.f23063b;
        if (aVar != null) {
            return aVar.mo20897a(str);
        }
        Log.d("OfflineOperationProxy", "ListDataServiceImpl.getOfflineDoc: 49 mOfflineOperator is null");
        return AbstractC68307f.m265097b();
    }

    /* renamed from: a */
    public void mo33289a(OfflineRenameData offlineRenameData) {
        Log.d("OfflineOperationProxy", "ListDataServiceImpl.setOfflineFileName: 33 ");
        AbstractC5210a aVar = this.f23063b;
        if (aVar != null) {
            aVar.mo20900a(offlineRenameData);
        } else {
            Log.d("OfflineOperationProxy", "ListDataServiceImpl.setOfflineFileName: 36 mOfflineOperator is null");
        }
    }

    /* renamed from: a */
    public AbstractC68307f<OfflineDoc> mo33287a(String str, int i, String str2, boolean z) {
        Log.i("OfflineOperationProxy", "ListDataServiceImpl.createDoc: 56 parentToken=" + str);
        AbstractC5210a aVar = this.f23063b;
        if (aVar != null) {
            return aVar.mo20898a(str, i, str2, z);
        }
        Log.e("OfflineOperationProxy", "ListDataServiceImpl.createDoc: 60 mOfflineOperator is null");
        return AbstractC68307f.m265097b();
    }
}
