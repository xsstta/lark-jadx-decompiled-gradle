package com.bytedance.ee.bear.drive.business.preview.attachment.menuaction;

import android.os.IBinder;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class AttachmentMenuActionProxy implements AbstractC10952a<AttachmentBaseMenuAction.AbstractC6877a> {
    /* renamed from: a */
    public AttachmentBaseMenuAction.AbstractC6877a mo16349b(IBinder iBinder) {
        return BinderAttachmentMenuAction.Stub.asInterface(iBinder);
    }
}
