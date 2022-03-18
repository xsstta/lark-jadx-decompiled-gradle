package com.bytedance.ee.bear.contract.drive.sdk.entity.open;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import java.util.ArrayList;

public class LocalOpenEntity extends BaseOpenEntity {
    public static final Parcelable.Creator<LocalOpenEntity> CREATOR = new Parcelable.Creator<LocalOpenEntity>() {
        /* class com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity.C51591 */

        /* renamed from: a */
        public LocalOpenEntity[] newArray(int i) {
            return new LocalOpenEntity[i];
        }

        /* renamed from: a */
        public LocalOpenEntity createFromParcel(Parcel parcel) {
            return new LocalOpenEntity(parcel);
        }
    };
    private String fileType;
    private String localFilePath;
    private String thirdPartyAppID;

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public int describeContents() {
        return 0;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getLocalFilePath() {
        return this.localFilePath;
    }

    public String getThirdPartyAppID() {
        return this.thirdPartyAppID;
    }

    protected LocalOpenEntity(Parcel parcel) {
        super(parcel);
        this.localFilePath = parcel.readString();
        this.fileType = parcel.readString();
        this.thirdPartyAppID = parcel.readString();
    }

    @Override // com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.localFilePath);
        parcel.writeString(this.fileType);
        parcel.writeString(this.thirdPartyAppID);
    }

    public LocalOpenEntity(String str, String str2, ArrayList<BaseMoreMenuAction> arrayList, String str3) {
        super("", "", str, str2, arrayList);
        this.localFilePath = str3;
        setBizType(1);
    }

    public LocalOpenEntity(String str, String str2, String str3, ArrayList<BaseMoreMenuAction> arrayList, String str4) {
        super("", "", str, str3, arrayList);
        this.localFilePath = str4;
        this.fileType = str2;
        setBizType(1);
    }

    public LocalOpenEntity(String str, String str2, String str3, String str4, String str5, ArrayList<BaseMoreMenuAction> arrayList, String str6) {
        super(str, str2, str4, "", arrayList);
        this.thirdPartyAppID = str3;
        this.fileType = str5;
        this.localFilePath = str6;
        setBizType(1);
    }

    public LocalOpenEntity(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<BaseMoreMenuAction> arrayList, String str7) {
        super(str, str2, str4, str6, arrayList);
        this.thirdPartyAppID = str3;
        this.fileType = str5;
        this.localFilePath = str7;
        setBizType(1);
    }
}
