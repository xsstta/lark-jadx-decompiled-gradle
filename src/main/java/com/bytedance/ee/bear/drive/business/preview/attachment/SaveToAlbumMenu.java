package com.bytedance.ee.bear.drive.business.preview.attachment;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu;

public class SaveToAlbumMenu extends SaveToLocalMenu {
    public static final Parcelable.Creator<SaveToAlbumMenu> CREATOR = new Parcelable.Creator<SaveToAlbumMenu>() {
        /* class com.bytedance.ee.bear.drive.business.preview.attachment.SaveToAlbumMenu.C68711 */

        /* renamed from: a */
        public SaveToAlbumMenu[] newArray(int i) {
            return new SaveToAlbumMenu[i];
        }

        /* renamed from: a */
        public SaveToAlbumMenu createFromParcel(Parcel parcel) {
            return new SaveToAlbumMenu(parcel);
        }
    };

    protected SaveToAlbumMenu(Parcel parcel) {
        super(parcel);
    }

    public SaveToAlbumMenu(SaveToLocalMenu.AbstractC6873a aVar) {
        super(aVar);
    }
}
