package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.larksuite.suite.R;

public class LookOverChatMenu extends BaseMoreMenuAction {
    public static final Parcelable.Creator<LookOverChatMenu> CREATOR = new Parcelable.Creator<LookOverChatMenu>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.LookOverChatMenu.C75781 */

        /* renamed from: a */
        public LookOverChatMenu[] newArray(int i) {
            return new LookOverChatMenu[i];
        }

        /* renamed from: a */
        public LookOverChatMenu createFromParcel(Parcel parcel) {
            return new LookOverChatMenu(parcel);
        }
    };

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    /* renamed from: c */
    public void mo20440c() {
        super.mo20440c();
        mo20448i();
    }

    protected LookOverChatMenu(Parcel parcel) {
        super(parcel);
    }

    public LookOverChatMenu(BinderMenuAction binderMenuAction) {
        this(null, binderMenuAction);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public LookOverChatMenu(Bundle bundle, BinderMenuAction binderMenuAction) {
        super((int) R.string.Drive_Sdk_ViewInChat);
        this.f14885a = binderMenuAction;
        this.f14887c = bundle;
    }
}
