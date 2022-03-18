package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;

public class SpaceAttachmentOpenEntity extends BaseSpaceOpenEntity {
    public static final Parcelable.Creator<SpaceAttachmentOpenEntity> CREATOR = new Parcelable.Creator<SpaceAttachmentOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceAttachmentOpenEntity.C51621 */

        /* renamed from: a */
        public SpaceAttachmentOpenEntity[] newArray(int i) {
            return new SpaceAttachmentOpenEntity[i];
        }

        /* renamed from: a */
        public SpaceAttachmentOpenEntity createFromParcel(Parcel parcel) {
            return new SpaceAttachmentOpenEntity(parcel);
        }
    };

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity, com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity
    public int describeContents() {
        return 0;
    }

    protected SpaceAttachmentOpenEntity(Parcel parcel) {
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

    public SpaceAttachmentOpenEntity(String str, String str2, String str3) {
        super(str, str2, str3);
        setBizType(4);
    }
}
