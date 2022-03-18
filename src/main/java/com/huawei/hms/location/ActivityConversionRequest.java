package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ActivityConversionRequest implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityConversionRequest> CREATOR = new C23629a();
    public static final Comparator<ActivityConversionInfo> IS_EQUAL_CONVERSION = new C23630b();
    @Packed
    private List<ActivityConversionInfo> activityConversions;

    /* renamed from: com.huawei.hms.location.ActivityConversionRequest$a */
    static class C23629a implements Parcelable.Creator<ActivityConversionRequest> {
        C23629a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionRequest createFromParcel(Parcel parcel) {
            return new ActivityConversionRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionRequest[] newArray(int i) {
            return new ActivityConversionRequest[i];
        }
    }

    /* renamed from: com.huawei.hms.location.ActivityConversionRequest$b */
    static class C23630b implements Comparator<ActivityConversionInfo> {
        C23630b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001d A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(com.huawei.hms.location.ActivityConversionInfo r3, com.huawei.hms.location.ActivityConversionInfo r4) {
            /*
                r2 = this;
                int r0 = r3.getActivityType()
                int r1 = r4.getActivityType()
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x000e
                if (r0 <= 0) goto L_0x001d
                goto L_0x001b
            L_0x000e:
                int r3 = r3.getConversionType()
                int r4 = r4.getConversionType()
                int r3 = r3 - r4
                if (r3 == 0) goto L_0x001f
                if (r3 <= 0) goto L_0x001d
            L_0x001b:
                r3 = 1
                goto L_0x0020
            L_0x001d:
                r3 = -1
                goto L_0x0020
            L_0x001f:
                r3 = 0
            L_0x0020:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.location.ActivityConversionRequest.C23630b.compare(com.huawei.hms.location.ActivityConversionInfo, com.huawei.hms.location.ActivityConversionInfo):int");
        }
    }

    public ActivityConversionRequest() {
    }

    protected ActivityConversionRequest(Parcel parcel) {
        this.activityConversions = parcel.createTypedArrayList(ActivityConversionInfo.CREATOR);
    }

    public ActivityConversionRequest(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityConversionRequest.class != obj.getClass() || !(obj instanceof ActivityConversionRequest)) {
            return false;
        }
        return Objects.equals(this.activityConversions, ((ActivityConversionRequest) obj).getActivityConversions());
    }

    public List<ActivityConversionInfo> getActivityConversions() {
        return this.activityConversions;
    }

    public int hashCode() {
        return this.activityConversions.hashCode();
    }

    public void setActivityConversions(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }

    public void setDataToIntent(Intent intent) {
        intent.putExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_REQUEST", this);
    }

    public String toString() {
        return "ActivityConversionRequest{activityConversions=" + this.activityConversions + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.activityConversions);
    }
}
