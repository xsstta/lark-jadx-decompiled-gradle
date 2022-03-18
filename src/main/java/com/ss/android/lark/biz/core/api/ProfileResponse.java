package com.ss.android.lark.biz.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.profile.entity.Profile;
import java.io.Serializable;

public class ProfileResponse implements Parcelable, Serializable {
    public static final Parcelable.Creator<ProfileResponse> CREATOR = new Parcelable.Creator<ProfileResponse>() {
        /* class com.ss.android.lark.biz.core.api.ProfileResponse.C295341 */

        /* renamed from: a */
        public ProfileResponse[] newArray(int i) {
            return new ProfileResponse[i];
        }

        /* renamed from: a */
        public ProfileResponse createFromParcel(Parcel parcel) {
            return new ProfileResponse(parcel);
        }
    };
    public Profile profile;
    public int statusCode;

    public int describeContents() {
        return 0;
    }

    public ProfileResponse() {
    }

    public boolean isNormal() {
        if (this.profile == null || this.statusCode == Profile.STATUE.ON_UNKNOWN.getNumber()) {
            return false;
        }
        return true;
    }

    public boolean isNotValid() {
        Profile profile2 = this.profile;
        if (profile2 == null || !profile2.isValid() || !isNormal()) {
            return true;
        }
        return false;
    }

    public ProfileResponse(int i) {
        this(null, i);
    }

    protected ProfileResponse(Parcel parcel) {
        this.statusCode = parcel.readInt();
        this.profile = (Profile) parcel.readSerializable();
    }

    public ProfileResponse(Profile profile2, int i) {
        this.profile = profile2;
        this.statusCode = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.statusCode);
        parcel.writeSerializable(this.profile);
    }
}
