package com.bytedance.ee.bear.drive.business.preview.attachment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.drive.business.preview.attachment.menuaction.AttachmentBaseMenuAction;

public class SaveToLocalMenu extends AttachmentBaseMenuAction {
    public static final Parcelable.Creator<SaveToLocalMenu> CREATOR = new Parcelable.Creator<SaveToLocalMenu>() {
        /* class com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu.C68721 */

        /* renamed from: a */
        public SaveToLocalMenu[] newArray(int i) {
            return new SaveToLocalMenu[i];
        }

        /* renamed from: a */
        public SaveToLocalMenu createFromParcel(Parcel parcel) {
            return new SaveToLocalMenu(parcel);
        }
    };

    /* renamed from: a */
    private AbstractC6873a f18643a;

    /* renamed from: com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu$a */
    public interface AbstractC6873a {
        /* renamed from: a */
        void mo27042a(boolean z, C6874b bVar);
    }

    /* renamed from: com.bytedance.ee.bear.drive.business.preview.attachment.SaveToLocalMenu$b */
    public static final class C6874b {
    }

    /* renamed from: a */
    public AbstractC6873a mo27037a() {
        return this.f18643a;
    }

    protected SaveToLocalMenu(Parcel parcel) {
        super(parcel);
    }

    public SaveToLocalMenu(AbstractC6873a aVar) {
        this("", aVar);
    }

    public SaveToLocalMenu(String str, AbstractC6873a aVar) {
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("saveToDir", str);
            mo27051a(bundle);
        }
        this.f18643a = aVar;
    }
}
