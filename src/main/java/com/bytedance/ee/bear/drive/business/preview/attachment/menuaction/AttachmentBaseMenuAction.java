package com.bytedance.ee.bear.drive.business.preview.attachment.menuaction;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.BinderAttachmentMenuAction;
import com.bytedance.ee.log.C13479a;

public class AttachmentBaseMenuAction implements Parcelable {
    public static final Parcelable.Creator<AttachmentBaseMenuAction> CREATOR = new Parcelable.Creator<AttachmentBaseMenuAction>() {
        /* class com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction.C68761 */

        /* renamed from: a */
        public AttachmentBaseMenuAction[] newArray(int i) {
            return new AttachmentBaseMenuAction[i];
        }

        /* renamed from: a */
        public AttachmentBaseMenuAction createFromParcel(Parcel parcel) {
            return new AttachmentBaseMenuAction(parcel);
        }
    };

    /* renamed from: a */
    private Bundle f18645a;

    /* renamed from: b */
    private BinderAttachmentMenuAction f18646b;

    /* renamed from: c */
    private int f18647c;

    /* renamed from: com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction$a */
    interface AbstractC6877a {
        void action(Bundle bundle);
    }

    public int describeContents() {
        return 0;
    }

    protected AttachmentBaseMenuAction() {
    }

    /* renamed from: b */
    public BinderAttachmentMenuAction mo27053b() {
        return this.f18646b;
    }

    /* renamed from: c */
    public int mo27054c() {
        return this.f18647c;
    }

    /* renamed from: a */
    public void mo27051a(Bundle bundle) {
        this.f18645a = bundle;
    }

    /* renamed from: a */
    public void mo27052a(BinderAttachmentMenuAction binderAttachmentMenuAction) {
        this.f18646b = binderAttachmentMenuAction;
    }

    protected AttachmentBaseMenuAction(Parcel parcel) {
        try {
            this.f18646b = BinderAttachmentMenuAction.Stub.asInterface(parcel.readStrongBinder());
            this.f18645a = parcel.readBundle(AttachmentBaseMenuAction.class.getClassLoader());
            this.f18647c = parcel.readInt();
        } catch (Throwable th) {
            C13479a.m54759a("AttachmentBaseMenuAction", "AttachmentBaseMenuAction#writeToAbsMoreMenuAction(Parcel) error=", th);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        try {
            BinderAttachmentMenuAction binderAttachmentMenuAction = this.f18646b;
            if (binderAttachmentMenuAction == null) {
                iBinder = null;
            } else {
                iBinder = binderAttachmentMenuAction.asBinder();
            }
            parcel.writeStrongBinder(iBinder);
            parcel.writeBundle(this.f18645a);
            parcel.writeInt(this.f18647c);
        } catch (Throwable th) {
            C13479a.m54759a("AttachmentBaseMenuAction", "AttachmentBaseMenuAction#writeToParcel() error=", th);
        }
    }
}
