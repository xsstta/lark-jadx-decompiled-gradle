package com.bytedance.ee.bear.drive.business.preview.attachment;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction;

public class SaveToSpaceMenu extends AttachmentBaseMenuAction {
    public static final Parcelable.Creator<SaveToSpaceMenu> CREATOR = new Parcelable.Creator<SaveToSpaceMenu>() {
        /* class com.bytedance.ee.bear.drive.business.preview.attachment.SaveToSpaceMenu.C68751 */

        /* renamed from: a */
        public SaveToSpaceMenu[] newArray(int i) {
            return new SaveToSpaceMenu[i];
        }

        /* renamed from: a */
        public SaveToSpaceMenu createFromParcel(Parcel parcel) {
            return new SaveToSpaceMenu(parcel);
        }
    };

    /* renamed from: a */
    private boolean f18644a = true;

    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction
    public int describeContents() {
        return 0;
    }

    public SaveToSpaceMenu() {
    }

    /* renamed from: a */
    public boolean mo27044a() {
        return this.f18644a;
    }

    /* renamed from: a */
    public void mo27043a(boolean z) {
        this.f18644a = z;
    }

    protected SaveToSpaceMenu(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.f18644a = parcel.readByte() == 0 ? false : z;
    }

    @Override // com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f18644a ? (byte) 1 : 0);
    }
}
