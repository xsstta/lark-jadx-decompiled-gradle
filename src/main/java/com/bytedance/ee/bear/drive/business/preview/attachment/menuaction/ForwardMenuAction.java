package com.bytedance.ee.bear.drive.business.preview.attachment.menuaction;

import android.os.Parcel;
import android.os.Parcelable;

public class ForwardMenuAction extends AttachmentBaseMenuAction {
    public static final Parcelable.Creator<ForwardMenuAction> CREATOR = new Parcelable.Creator<ForwardMenuAction>() {
        /* class com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.ForwardMenuAction.C68781 */

        /* renamed from: a */
        public ForwardMenuAction[] newArray(int i) {
            return new ForwardMenuAction[i];
        }

        /* renamed from: a */
        public ForwardMenuAction createFromParcel(Parcel parcel) {
            return new ForwardMenuAction(parcel);
        }
    };

    public ForwardMenuAction() {
    }

    protected ForwardMenuAction(Parcel parcel) {
        super(parcel);
    }
}
