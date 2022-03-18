package com.ss.android.lark.share.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.biz.core.api.BaseShareData;

public class SdkShareData extends BaseShareData implements Parcelable {
    public static final Parcelable.Creator<SdkShareData> CREATOR = new Parcelable.Creator<SdkShareData>() {
        /* class com.ss.android.lark.share.dto.SdkShareData.C547201 */

        /* renamed from: a */
        public SdkShareData[] newArray(int i) {
            return new SdkShareData[i];
        }

        /* renamed from: a */
        public SdkShareData createFromParcel(Parcel parcel) {
            return new SdkShareData(parcel);
        }
    };
    private String mUrl;

    public SdkShareData() {
    }

    @Override // com.ss.android.lark.biz.core.api.BaseShareData
    public int describeContents() {
        return super.describeContents();
    }

    public SdkShareData(Parcel parcel) {
        super(parcel);
    }

    @Override // com.ss.android.lark.biz.core.api.BaseShareData
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
