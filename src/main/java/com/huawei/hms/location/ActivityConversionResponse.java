package com.huawei.hms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.List;

public class ActivityConversionResponse implements Parcelable {
    public static final Parcelable.Creator<ActivityConversionResponse> CREATOR = new C23631a();

    /* renamed from: a */
    private List<ActivityConversionData> f58359a;

    /* renamed from: com.huawei.hms.location.ActivityConversionResponse$a */
    static class C23631a implements Parcelable.Creator<ActivityConversionResponse> {
        C23631a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionResponse createFromParcel(Parcel parcel) {
            return new ActivityConversionResponse(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionResponse[] newArray(int i) {
            return new ActivityConversionResponse[i];
        }
    }

    public ActivityConversionResponse() {
        this.f58359a = new ArrayList();
    }

    private ActivityConversionResponse(Parcel parcel) {
        this.f58359a = new ArrayList();
        this.f58359a = parcel.createTypedArrayList(ActivityConversionData.CREATOR);
    }

    /* synthetic */ ActivityConversionResponse(Parcel parcel, C23631a aVar) {
        this(parcel);
    }

    public ActivityConversionResponse(List<ActivityConversionData> list) {
        this.f58359a = new ArrayList();
        this.f58359a = list;
    }

    public static boolean containDataFromIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_RESULT");
        } catch (Exception unused) {
            HMSLog.m86964e("ActivityConversionResp", "containDataFromIntent fail");
            return false;
        }
    }

    public static ActivityConversionResponse getDataFromIntent(Intent intent) {
        try {
            if (containDataFromIntent(intent)) {
                Bundle bundle = (Bundle) intent.getParcelableExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_RESULT");
                Parcelable parcelable = bundle != null ? bundle.getParcelable("KEY_RESPONSE") : intent.getParcelableExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_RESULT");
                if (parcelable instanceof ActivityConversionResponse) {
                    return (ActivityConversionResponse) parcelable;
                }
            }
        } catch (Exception unused) {
            HMSLog.m86964e("ActivityConversionResp", "getDataFromIntent fail");
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
        return obj != null && ActivityConversionResponse.class == obj.getClass() && this.f58359a.equals(((ActivityConversionResponse) obj).f58359a);
    }

    public List<ActivityConversionData> getActivityConversionDatas() {
        return this.f58359a;
    }

    public int hashCode() {
        return this.f58359a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f58359a);
    }
}
