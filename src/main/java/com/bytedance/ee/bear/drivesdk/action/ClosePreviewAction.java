package com.bytedance.ee.bear.drivesdk.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;

public class ClosePreviewAction implements PreviewAction {
    public static final Parcelable.Creator<ClosePreviewAction> CREATOR = new Parcelable.Creator<ClosePreviewAction>() {
        /* class com.bytedance.ee.bear.drivesdk.action.ClosePreviewAction.C75721 */

        /* renamed from: a */
        public ClosePreviewAction[] newArray(int i) {
            return new ClosePreviewAction[i];
        }

        /* renamed from: a */
        public ClosePreviewAction createFromParcel(Parcel parcel) {
            return new ClosePreviewAction(parcel);
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public ClosePreviewAction() {
    }

    protected ClosePreviewAction(Parcel parcel) {
    }
}
