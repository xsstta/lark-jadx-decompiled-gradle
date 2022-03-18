package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import java.util.ArrayList;

public class OnlineOpenEntity extends BaseOpenEntity {
    public static final Parcelable.Creator<OnlineOpenEntity> CREATOR = new Parcelable.Creator<OnlineOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.OnlineOpenEntity.C51601 */

        /* renamed from: a */
        public OnlineOpenEntity[] newArray(int i) {
            return new OnlineOpenEntity[i];
        }

        /* renamed from: a */
        public OnlineOpenEntity createFromParcel(Parcel parcel) {
            return new OnlineOpenEntity(parcel);
        }
    };
    private String authExtra;
    private int noPermissionTipsStringRes;
    private boolean restrictDownloadUsage;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public int describeContents() {
        return 0;
    }

    public String getAuthExtra() {
        return this.authExtra;
    }

    public int getNoPermissionTipsStringRes() {
        return this.noPermissionTipsStringRes;
    }

    public boolean isRestrictDownloadUsage() {
        return this.restrictDownloadUsage;
    }

    public void setAuthExtra(String str) {
        this.authExtra = str;
    }

    public void setNoPermissionTipsStringRes(int i) {
        this.noPermissionTipsStringRes = i;
    }

    public void setRestrictDownloadUsage(boolean z) {
        this.restrictDownloadUsage = z;
    }

    protected OnlineOpenEntity(Parcel parcel) {
        super(parcel);
        boolean z;
        this.authExtra = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.restrictDownloadUsage = z;
        this.noPermissionTipsStringRes = parcel.readInt();
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.authExtra);
        parcel.writeByte(this.restrictDownloadUsage ? (byte) 1 : 0);
        parcel.writeInt(this.noPermissionTipsStringRes);
    }

    public OnlineOpenEntity(String str, String str2, String str3, ArrayList<BaseMoreMenuAction> arrayList, String str4, String str5, boolean z) {
        super(str, str4, str2, str3, arrayList);
        this.restrictDownloadUsage = z;
        this.authExtra = str5;
        setBizType(3);
    }
}
