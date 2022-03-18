package com.bytedance.ee.bear.drive.business.preview.attachment.menuaction;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction;
import com.bytedance.ee.bear.service.C10906a;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicBoolean;

public class BinderAttachmentMenuActionImp extends BinderAttachmentMenuAction.Stub {
    Application mApplication;
    AtomicBoolean mAtomicBoolean = new AtomicBoolean(false);
    private AttachmentBaseMenuAction.AbstractC6877a mAttachmentMenuAction;

    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void init(Application application) {
    }

    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction.Stub, com.bytedance.ee.bear.service.base.AbstractC10913a
    public void lazyInit(Application application) {
    }

    /* access modifiers changed from: package-private */
    public void lazyInit() {
        AbstractC10957d dVar = (AbstractC10957d) this.mAttachmentMenuAction;
        if (!this.mAtomicBoolean.get()) {
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.mAtomicBoolean.get()) {
                    dVar.lazyInit(this.mApplication);
                    this.mAtomicBoolean.set(true);
                }
                C13479a.m54764b("BinderAttachmentMenuActionImp", "lazyInit RemoteService: " + dVar.getClass().getName() + " Thread: " + Thread.currentThread().getName() + " cost: " + (System.currentTimeMillis() - currentTimeMillis));
                C10906a.m45376a(C10929e.m45432a(), "2", dVar.getClass().getName(), System.currentTimeMillis() - currentTimeMillis, "remote");
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction.AbstractC6877a
    public void action(Bundle bundle) {
        lazyInit();
        this.mAttachmentMenuAction.action(bundle);
    }

    public BinderAttachmentMenuActionImp(AttachmentBaseMenuAction.AbstractC6877a aVar, Application application) {
        this.mAttachmentMenuAction = aVar;
        this.mApplication = application;
    }
}
