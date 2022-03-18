package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;

public class DefaultOpenEntity extends BaseOpenEntity {
    public static final Parcelable.Creator<DefaultOpenEntity> CREATOR = new Parcelable.Creator<DefaultOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.DefaultOpenEntity.C51581 */

        /* renamed from: a */
        public DefaultOpenEntity[] newArray(int i) {
            return new DefaultOpenEntity[i];
        }

        /* renamed from: a */
        public DefaultOpenEntity createFromParcel(Parcel parcel) {
            return new DefaultOpenEntity(parcel);
        }
    };

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
    }

    public DefaultOpenEntity() {
        super("-1", "", "", "", null);
    }

    protected DefaultOpenEntity(Parcel parcel) {
        super(parcel);
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
