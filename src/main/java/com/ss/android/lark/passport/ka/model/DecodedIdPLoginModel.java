package com.ss.android.lark.passport.ka.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class DecodedIdPLoginModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<DecodedIdPLoginModel> CREATOR = new Parcelable.Creator<DecodedIdPLoginModel>() {
        /* class com.ss.android.lark.passport.ka.model.DecodedIdPLoginModel.C492991 */

        /* renamed from: a */
        public DecodedIdPLoginModel[] newArray(int i) {
            return new DecodedIdPLoginModel[i];
        }

        /* renamed from: a */
        public DecodedIdPLoginModel createFromParcel(Parcel parcel) {
            return new DecodedIdPLoginModel(parcel);
        }
    };
    private int code;
    private String message;
    private String state;

    public int describeContents() {
        return 0;
    }

    public DecodedIdPLoginModel() {
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getState() {
        return this.state;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    protected DecodedIdPLoginModel(Parcel parcel) {
        this.state = parcel.readString();
        this.code = parcel.readInt();
        this.message = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.state);
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
    }
}
