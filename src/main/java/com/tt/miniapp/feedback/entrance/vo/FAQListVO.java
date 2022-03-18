package com.tt.miniapp.feedback.entrance.vo;

import android.os.Parcel;
import android.os.Parcelable;

public class FAQListVO implements Parcelable {
    public static final Parcelable.Creator<FAQListVO> CREATOR = new Parcelable.Creator<FAQListVO>() {
        /* class com.tt.miniapp.feedback.entrance.vo.FAQListVO.C661541 */

        /* renamed from: a */
        public FAQListVO[] newArray(int i) {
            return new FAQListVO[i];
        }

        /* renamed from: a */
        public FAQListVO createFromParcel(Parcel parcel) {
            return new FAQListVO(parcel);
        }
    };

    /* renamed from: a */
    private int f166993a;

    /* renamed from: b */
    private String f166994b;

    public int describeContents() {
        return 0;
    }

    protected FAQListVO(Parcel parcel) {
        this.f166993a = parcel.readInt();
        this.f166994b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f166993a);
        parcel.writeString(this.f166994b);
    }
}
