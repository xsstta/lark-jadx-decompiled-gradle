package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;

public class SpaceThirdPartyOpenEntity extends BaseSpaceOpenEntity {
    public static final Parcelable.Creator<SpaceThirdPartyOpenEntity> CREATOR = new Parcelable.Creator<SpaceThirdPartyOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceThirdPartyOpenEntity.C51641 */

        /* renamed from: a */
        public SpaceThirdPartyOpenEntity[] newArray(int i) {
            return new SpaceThirdPartyOpenEntity[i];
        }

        /* renamed from: a */
        public SpaceThirdPartyOpenEntity createFromParcel(Parcel parcel) {
            return new SpaceThirdPartyOpenEntity(parcel);
        }
    };

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity, com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public int describeContents() {
        return 0;
    }

    protected SpaceThirdPartyOpenEntity(Parcel parcel) {
        super(parcel);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity, com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public SpaceThirdPartyOpenEntity(String str, String str2, String str3) {
        super(str, str2, str3);
        setBizType(5);
    }
}
