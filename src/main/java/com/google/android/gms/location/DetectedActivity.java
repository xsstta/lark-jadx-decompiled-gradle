package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Comparator;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new C21940aa();

    /* renamed from: a */
    private static final Comparator<DetectedActivity> f53388a = new C21972z();

    /* renamed from: b */
    private static final int[] f53389b = {9, 10};

    /* renamed from: c */
    private static final int[] f53390c = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: d */
    private static final int[] f53391d = {0, 1, 2, 3, 7, 8, 16, 17};

    /* renamed from: e */
    private int f53392e;

    /* renamed from: f */
    private int f53393f;

    public DetectedActivity(int i, int i2) {
        this.f53392e = i;
        this.f53393f = i2;
    }

    /* renamed from: a */
    public static void m79278a(int i) {
        boolean z = false;
        for (int i2 : f53391d) {
            if (i2 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
    }

    /* renamed from: a */
    public int mo74300a() {
        int i = this.f53392e;
        if (i > 19 || i < 0) {
            return 4;
        }
        return i;
    }

    /* renamed from: b */
    public int mo74301b() {
        return this.f53393f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            return this.f53392e == detectedActivity.f53392e && this.f53393f == detectedActivity.f53393f;
        }
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f53392e), Integer.valueOf(this.f53393f));
    }

    public String toString() {
        String str;
        int a = mo74300a();
        if (a == 0) {
            str = "IN_VEHICLE";
        } else if (a == 1) {
            str = "ON_BICYCLE";
        } else if (a == 2) {
            str = "ON_FOOT";
        } else if (a == 3) {
            str = "STILL";
        } else if (a == 4) {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        } else if (a == 5) {
            str = "TILTING";
        } else if (a == 7) {
            str = "WALKING";
        } else if (a != 8) {
            switch (a) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(a);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i = this.f53393f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f53392e);
        SafeParcelWriter.writeInt(parcel, 2, this.f53393f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
