package com.bytedance.ee.bear.wiki;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class WikiListDataServiceLinker implements IInterface, AbstractC10957d {
    private BinderWikiListDataService mBinderWikiListDataService;
    private AbstractC11902a mWikiListDataServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderWikiListDataService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mWikiListDataServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mWikiListDataServiceImp.init(application);
    }

    public WikiListDataServiceLinker(AbstractC11902a aVar, Application application) {
        this.mWikiListDataServiceImp = aVar;
        this.mBinderWikiListDataService = new BinderWikiListDataServiceImp(this.mWikiListDataServiceImp, application);
    }
}
