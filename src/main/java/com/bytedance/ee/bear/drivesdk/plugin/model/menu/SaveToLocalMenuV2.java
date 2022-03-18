package com.bytedance.ee.bear.drivesdk.plugin.model.menu;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.larksuite.suite.R;

public class SaveToLocalMenuV2 extends BaseMoreMenuAction {
    public static final Parcelable.Creator<SaveToLocalMenuV2> CREATOR = new Parcelable.Creator<SaveToLocalMenuV2>() {
        /* class com.bytedance.ee.bear.drivesdk.plugin.model.menu.SaveToLocalMenuV2.C75811 */

        /* renamed from: a */
        public SaveToLocalMenuV2[] newArray(int i) {
            return new SaveToLocalMenuV2[i];
        }

        /* renamed from: a */
        public SaveToLocalMenuV2 createFromParcel(Parcel parcel) {
            return new SaveToLocalMenuV2(parcel);
        }
    };

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public int describeContents() {
        return 0;
    }

    public SaveToLocalMenuV2() {
        super((int) R.string.CreationMobile_ECM_SaveToLocal_option);
    }

    protected SaveToLocalMenuV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
