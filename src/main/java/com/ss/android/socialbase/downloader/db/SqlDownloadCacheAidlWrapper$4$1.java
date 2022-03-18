package com.ss.android.socialbase.downloader.db;

import com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl;
import com.ss.android.socialbase.downloader.db.ServiceConnectionC60015c;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.Map;

class SqlDownloadCacheAidlWrapper$4$1 extends ISqlCacheLoadCompleteCallbackAidl.Stub {
    final /* synthetic */ ServiceConnectionC60015c.RunnableC600204 this$1;

    SqlDownloadCacheAidlWrapper$4$1(ServiceConnectionC60015c.RunnableC600204 r1) {
        this.this$1 = r1;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl
    public void callback(Map map, Map map2) {
        C60161d.m233758a(r3, map);
        C60161d.m233758a(r4, map2);
        r5.mo204366a();
        ServiceConnectionC60015c.this.mo204367a((ISqlCacheLoadCompleteCallbackAidl) null);
    }
}
