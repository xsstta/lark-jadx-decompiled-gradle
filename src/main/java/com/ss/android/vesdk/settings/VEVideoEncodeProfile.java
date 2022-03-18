package com.ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public enum VEVideoEncodeProfile implements Parcelable {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;
    
    public static final Parcelable.Creator<VEVideoEncodeProfile> CREATOR = new Parcelable.Creator<VEVideoEncodeProfile>() {
        /* class com.ss.android.vesdk.settings.VEVideoEncodeProfile.C640711 */

        /* renamed from: a */
        public VEVideoEncodeProfile[] newArray(int i) {
            return new VEVideoEncodeProfile[i];
        }

        /* renamed from: a */
        public VEVideoEncodeProfile createFromParcel(Parcel parcel) {
            return VEVideoEncodeProfile.values()[parcel.readInt()];
        }
    };

    public int describeContents() {
        return 0;
    }

    public static VEVideoEncodeProfile valueOfString(String str) {
        VEVideoEncodeProfile vEVideoEncodeProfile = ENCODE_PROFILE_UNKNOWN;
        if (TextUtils.isEmpty(str)) {
            return vEVideoEncodeProfile;
        }
        if ("baseline".equals(str)) {
            return ENCODE_PROFILE_BASELINE;
        }
        if ("main".equals(str)) {
            return ENCODE_PROFILE_MAIN;
        }
        if ("high".equals(str)) {
            return ENCODE_PROFILE_HIGH;
        }
        return vEVideoEncodeProfile;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
