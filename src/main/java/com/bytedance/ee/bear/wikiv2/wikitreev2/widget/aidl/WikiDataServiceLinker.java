package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class WikiDataServiceLinker implements IInterface, AbstractC10957d {
    private BinderWikiDataService mBinderWikiDataService;
    private AbstractC12447a mWikiDataServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderWikiDataService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mWikiDataServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mWikiDataServiceImp.init(application);
    }

    public WikiDataServiceLinker(AbstractC12447a aVar, Application application) {
        this.mWikiDataServiceImp = aVar;
        this.mBinderWikiDataService = new BinderWikiDataServiceImp(this.mWikiDataServiceImp, application);
    }
}
