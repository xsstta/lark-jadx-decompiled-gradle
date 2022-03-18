package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.locationSdk.y0;
import com.huawei.hms.support.api.client.Status;
import java.util.Arrays;
import java.util.Objects;

public class ActivityIdentificationData implements Parcelable {
    public static final int BIKE = 101;
    public static final Parcelable.Creator<ActivityIdentificationData> CREATOR = new C23632a();
    public static final int FOOT = 102;
    public static final int OTHERS = 104;
    public static final int RUNNING = 108;
    public static final int STILL = 103;
    public static final int VEHICLE = 100;
    public static final int WALKING = 107;

    /* renamed from: c */
    private static final int[] f58360c = {100, 101, 102, 103, WALKING, 108};

    /* renamed from: a */
    private int f58361a;

    /* renamed from: b */
    private int f58362b;

    /* renamed from: com.huawei.hms.location.ActivityIdentificationData$a */
    static class C23632a implements Parcelable.Creator<ActivityIdentificationData> {
        C23632a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActivityIdentificationData createFromParcel(Parcel parcel) {
            return new ActivityIdentificationData(parcel, (C23632a) null);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityIdentificationData[] newArray(int i) {
            return new ActivityIdentificationData[i];
        }
    }

    public ActivityIdentificationData(int i, int i2) throws ApiException {
        if (i2 > 100 || i2 < 0) {
            throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
        }
        this.f58361a = i;
        this.f58362b = i2;
    }

    private ActivityIdentificationData(Parcel parcel) {
        this.f58361a = parcel.readInt();
        this.f58362b = parcel.readInt();
    }

    /* synthetic */ ActivityIdentificationData(Parcel parcel, C23632a aVar) {
        this(parcel);
    }

    public static boolean isValidType(int i) {
        if (Arrays.binarySearch(f58360c, i) >= 0) {
            return true;
        }
        Log.e("ActivityIdData", i + " is not a valid ActivityIdentificationData");
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (ActivityIdentificationData.class != obj.getClass() || !(obj instanceof ActivityIdentificationData)) {
            return false;
        }
        ActivityIdentificationData activityIdentificationData = (ActivityIdentificationData) obj;
        return this.f58361a == activityIdentificationData.getIdentificationActivity() && this.f58362b == activityIdentificationData.getPossibility();
    }

    public int getIdentificationActivity() {
        return this.f58361a;
    }

    public int getPossibility() {
        return this.f58362b;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.f58361a), Integer.valueOf(this.f58362b)});
    }

    public void setIdentificationActivity(int i) {
        this.f58361a = i;
    }

    public void setPossibility(int i) throws ApiException {
        if (i > 100 || i < 0) {
            throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
        }
        this.f58362b = i;
    }

    public String toString() {
        String str;
        int i = this.f58361a;
        switch (i) {
            case 100:
                str = "VEHICLE";
                break;
            case 101:
                str = "BIKE";
                break;
            case 102:
                str = "FOOT";
                break;
            case 103:
                str = "STILL";
                break;
            case 104:
                str = "OTHERS";
                break;
            case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
            case 106:
            default:
                str = Integer.toString(i);
                break;
            case WALKING /*{ENCODED_INT: 107}*/:
                str = "WALKING";
                break;
            case 108:
                str = "RUNNING";
                break;
        }
        return "ActivityIdentificationData{identificationActivity=" + str + ", possibility=" + this.f58362b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f58361a);
        parcel.writeInt(this.f58362b);
    }
}
