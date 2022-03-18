package com.bytedance.ee.bear.contract.darkmode;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class IDarkModeChangedListenerLinker implements IInterface, AbstractC10957d {
    private BinderIDarkModeChangedListener mBinderIDarkModeChangedListener;
    private AbstractC5127b mIDarkModeChangedListenerImp;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderIDarkModeChangedListener.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mIDarkModeChangedListenerImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mIDarkModeChangedListenerImp.init(application);
    }

    public IDarkModeChangedListenerLinker(AbstractC5127b bVar, Application application) {
        this.mIDarkModeChangedListenerImp = bVar;
        this.mBinderIDarkModeChangedListener = new BinderIDarkModeChangedListenerImp(this.mIDarkModeChangedListenerImp, application);
    }
}
