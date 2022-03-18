package com.huawei.hms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ActivityIdentificationResponse implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityIdentificationResponse> CREATOR = new C23633a();
    private static final String EXTRA_CONSTANT = "com.huawei.hms.location.internal.EXTRA_ACTIVITY_RESULT";
    private static final String TAG = "ActivityIdentificationResponse";
    @Packed
    private List<ActivityIdentificationData> activityIdentificationDatas;
    @Packed
    private long elapsedTimeFromReboot;
    @Packed
    private long time;

    /* renamed from: com.huawei.hms.location.ActivityIdentificationResponse$a */
    static class C23633a implements Parcelable.Creator<ActivityIdentificationResponse> {
        C23633a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActivityIdentificationResponse createFromParcel(Parcel parcel) {
            return new ActivityIdentificationResponse(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityIdentificationResponse[] newArray(int i) {
            return new ActivityIdentificationResponse[0];
        }
    }

    public ActivityIdentificationResponse() {
    }

    private ActivityIdentificationResponse(Parcel parcel) {
        this.time = parcel.readLong();
        this.elapsedTimeFromReboot = parcel.readLong();
        this.activityIdentificationDatas = parcel.createTypedArrayList(ActivityIdentificationData.CREATOR);
    }

    /* synthetic */ ActivityIdentificationResponse(Parcel parcel, C23633a aVar) {
        this(parcel);
    }

    public ActivityIdentificationResponse(ActivityIdentificationData activityIdentificationData, long j, long j2) {
        this.activityIdentificationDatas = Collections.singletonList(activityIdentificationData);
        this.time = j;
        this.elapsedTimeFromReboot = j2;
    }

    public ActivityIdentificationResponse(List<ActivityIdentificationData> list, long j, long j2) {
        this.activityIdentificationDatas = list;
        this.time = j;
        this.elapsedTimeFromReboot = j2;
    }

    public static boolean containDataFromIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra(EXTRA_CONSTANT);
        } catch (Exception unused) {
            HMSLog.m86964e(TAG, "getDataFromIntent fail");
            return false;
        }
    }

    public static ActivityIdentificationResponse getDataFromIntent(Intent intent) {
        try {
            if (containDataFromIntent(intent)) {
                Bundle bundle = (Bundle) intent.getParcelableExtra(EXTRA_CONSTANT);
                Parcelable parcelable = bundle != null ? bundle.getParcelable("KEY_RESPONSE") : intent.getParcelableExtra(EXTRA_CONSTANT);
                if (parcelable instanceof ActivityIdentificationResponse) {
                    return (ActivityIdentificationResponse) parcelable;
                }
            }
        } catch (Exception unused) {
            HMSLog.m86964e(TAG, "getDataFromIntent fail");
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityIdentificationResponse.class != obj.getClass() || !(obj instanceof ActivityIdentificationResponse)) {
            return false;
        }
        ActivityIdentificationResponse activityIdentificationResponse = (ActivityIdentificationResponse) obj;
        return this.time == activityIdentificationResponse.getTime() && this.elapsedTimeFromReboot == activityIdentificationResponse.getElapsedTimeFromReboot() && Objects.equals(this.activityIdentificationDatas, activityIdentificationResponse.getActivityIdentificationDatas());
    }

    public List<ActivityIdentificationData> getActivityIdentificationDatas() {
        return this.activityIdentificationDatas;
    }

    public int getActivityPossibility(int i) {
        List<ActivityIdentificationData> list = this.activityIdentificationDatas;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (ActivityIdentificationData activityIdentificationData : this.activityIdentificationDatas) {
            if (activityIdentificationData.getIdentificationActivity() == i) {
                return activityIdentificationData.getPossibility();
            }
        }
        return 0;
    }

    public long getElapsedTimeFromReboot() {
        return this.elapsedTimeFromReboot;
    }

    public ActivityIdentificationData getMostActivityIdentification() {
        List<ActivityIdentificationData> list = this.activityIdentificationDatas;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.activityIdentificationDatas.get(0);
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Long.valueOf(this.time), Long.valueOf(this.elapsedTimeFromReboot), this.activityIdentificationDatas});
    }

    public void setActivityIdentificationDatas(List<ActivityIdentificationData> list) {
        this.activityIdentificationDatas = list;
    }

    public void setElapsedTimeFromReboot(long j) {
        this.elapsedTimeFromReboot = j;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "ActivityIdentificationResponse{time=" + this.time + ", elapsedTimeFromReboot=" + this.elapsedTimeFromReboot + ", activityIdentificationDatas=" + this.activityIdentificationDatas + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.time);
        parcel.writeLong(this.elapsedTimeFromReboot);
        parcel.writeTypedList(this.activityIdentificationDatas);
    }
}
