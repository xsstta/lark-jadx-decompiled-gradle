package com.ss.android.lark.doc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ThumbnailDetail implements Parcelable, Serializable {
    public static final Parcelable.Creator<ThumbnailDetail> CREATOR = new Parcelable.Creator<ThumbnailDetail>() {
        /* class com.ss.android.lark.doc.entity.ThumbnailDetail.C368351 */

        /* renamed from: a */
        public ThumbnailDetail[] newArray(int i) {
            return new ThumbnailDetail[i];
        }

        /* renamed from: a */
        public ThumbnailDetail createFromParcel(Parcel parcel) {
            return new ThumbnailDetail(parcel);
        }
    };
    @SerializedName("cipher_type")
    public String cipherType;
    @SerializedName("decrypt_key_mobile")
    public String decryptKeyMobile;
    @SerializedName("decrypt_nonce_mobile")
    public String decryptNonceMobile;
    @SerializedName("thumbnail_url_mobile")
    public String thumbnailUrlMobile;

    public int describeContents() {
        return 0;
    }

    public ThumbnailDetail() {
    }

    protected ThumbnailDetail(Parcel parcel) {
        this.cipherType = parcel.readString();
        this.decryptNonceMobile = parcel.readString();
        this.thumbnailUrlMobile = parcel.readString();
        this.decryptKeyMobile = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cipherType);
        parcel.writeString(this.decryptNonceMobile);
        parcel.writeString(this.thumbnailUrlMobile);
        parcel.writeString(this.decryptKeyMobile);
    }
}
