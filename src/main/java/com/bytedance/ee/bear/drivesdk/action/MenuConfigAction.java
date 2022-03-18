package com.bytedance.ee.bear.drivesdk.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import java.util.ArrayList;

public class MenuConfigAction implements PreviewAction {
    public static final Parcelable.Creator<MenuConfigAction> CREATOR = new Parcelable.Creator<MenuConfigAction>() {
        /* class com.bytedance.ee.bear.drivesdk.action.MenuConfigAction.C75731 */

        /* renamed from: a */
        public MenuConfigAction[] newArray(int i) {
            return new MenuConfigAction[i];
        }

        /* renamed from: a */
        public MenuConfigAction createFromParcel(Parcel parcel) {
            return new MenuConfigAction(parcel);
        }
    };

    /* renamed from: a */
    private ArrayList<BaseMoreMenuAction> f20566a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public ArrayList<BaseMoreMenuAction> mo29716a() {
        return this.f20566a;
    }

    protected MenuConfigAction(Parcel parcel) {
        this.f20566a = parcel.createTypedArrayList(BaseMoreMenuAction.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f20566a);
    }
}
