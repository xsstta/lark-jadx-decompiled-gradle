package com.bytedance.ee.bear.wiki;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class WikiServiceLinker implements IInterface, AbstractC10957d {
    private BinderWikiService mBinderWikiService;
    private AbstractC11904b mWikiServiceImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderWikiService.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mWikiServiceImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mWikiServiceImp.init(application);
    }

    public WikiServiceLinker(AbstractC11904b bVar, Application application) {
        this.mWikiServiceImp = bVar;
        this.mBinderWikiService = new BinderWikiServiceImp(this.mWikiServiceImp, application);
    }
}
