package com.ss.android.medialib.util;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

public class VEPlatformUtils {
    /* renamed from: a */
    public static VEPlatform m230717a() {
        VEPlatform vEPlatform = VEPlatform.PLATFORM_UNKNOWN;
        String str = Build.HARDWARE;
        if (str.matches("qcom")) {
            return VEPlatform.PLATFORM_QCOM;
        }
        if (str.matches("mt[0-9]*")) {
            return VEPlatform.PLATFORM_MTK;
        }
        if (str.matches("kirin[0-9]*")) {
            return VEPlatform.PLATFORM_HISI;
        }
        return vEPlatform;
    }

    public enum VEPlatform implements Parcelable {
        PLATFORM_UNKNOWN,
        PLATFORM_QCOM,
        PLATFORM_MTK,
        PLATFORM_HISI,
        PLATFORM_EXYNOS;
        
        public static final Parcelable.Creator<VEPlatform> CREATOR = new Parcelable.Creator<VEPlatform>() {
            /* class com.ss.android.medialib.util.VEPlatformUtils.VEPlatform.C594301 */

            /* renamed from: a */
            public VEPlatform[] newArray(int i) {
                return new VEPlatform[i];
            }

            /* renamed from: a */
            public VEPlatform createFromParcel(Parcel parcel) {
                return VEPlatform.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}
