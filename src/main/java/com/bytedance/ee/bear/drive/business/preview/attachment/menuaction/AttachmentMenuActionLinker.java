package com.bytedance.ee.bear.drive.business.preview.attachment.menuaction;

import android.app.Application;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;

public class AttachmentMenuActionLinker implements IInterface, AbstractC10957d {
    private AbstractC6879a mAttachmentMenuActionImp;
    private BinderAttachmentMenuAction mBinderAttachmentMenuAction;

    public boolean isNewRemoteService() {
        return false;
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    public IBinder asBinder() {
        return this.mBinderAttachmentMenuAction.asBinder();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.mAttachmentMenuActionImp.destroy();
    }

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
        this.mAttachmentMenuActionImp.init(application);
    }

    public AttachmentMenuActionLinker(AbstractC6879a aVar, Application application) {
        this.mAttachmentMenuActionImp = aVar;
        this.mBinderAttachmentMenuAction = new BinderAttachmentMenuActionImp(this.mAttachmentMenuActionImp, application);
    }
}
