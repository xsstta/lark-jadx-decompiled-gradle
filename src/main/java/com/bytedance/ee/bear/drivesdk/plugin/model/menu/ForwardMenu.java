package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class ForwardMenu extends BaseMoreMenuAction {
    public static final Parcelable.Creator<ForwardMenu> CREATOR = new Parcelable.Creator<ForwardMenu>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.ForwardMenu.C75771 */

        /* renamed from: a */
        public ForwardMenu[] newArray(int i) {
            return new ForwardMenu[i];
        }

        /* renamed from: a */
        public ForwardMenu createFromParcel(Parcel parcel) {
            return new ForwardMenu(parcel);
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
        ((AbstractC7583a) KoinJavaComponent.m268610a(AbstractC7583a.class)).mo27995a(this.f14888d, "send_to_chat", "public_multi_select_share_view");
    }

    protected ForwardMenu(Parcel parcel) {
        super(parcel);
    }

    public ForwardMenu(BinderMenuAction binderMenuAction) {
        this((Bundle) null, binderMenuAction);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public ForwardMenu(int i, BinderMenuAction binderMenuAction) {
        super(i);
        this.f14885a = binderMenuAction;
    }

    public ForwardMenu(Bundle bundle, BinderMenuAction binderMenuAction) {
        super((int) R.string.Drive_Sdk_Forward);
        this.f14885a = binderMenuAction;
        this.f14887c = bundle;
    }
}
