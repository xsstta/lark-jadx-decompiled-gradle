package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

public class ActivityConversionInfo implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityConversionInfo> CREATOR = new C23628a();
    public static final int ENTER_ACTIVITY_CONVERSION = 0;
    public static final int EXIT_ACTIVITY_CONVERSION = 1;
    @Packed
    private int activityType;
    @Packed
    private int conversionType;

    public static class Builder {

        /* renamed from: a */
        private int f58357a = -1;

        /* renamed from: b */
        private int f58358b = -1;

        public ActivityConversionInfo build() {
            boolean z = true;
            Preconditions.checkState(this.f58357a != -1, "ActivityType not set.");
            if (this.f58358b == -1) {
                z = false;
            }
            Preconditions.checkState(z, "ConversionType not set.");
            return new ActivityConversionInfo(this.f58357a, this.f58358b);
        }

        public Builder setActivityType(int i) {
            ActivityIdentificationData.isValidType(i);
            this.f58357a = i;
            return this;
        }

        public Builder setConversionType(int i) {
            this.f58358b = i;
            return this;
        }
    }

    /* renamed from: com.huawei.hms.location.ActivityConversionInfo$a */
    static class C23628a implements Parcelable.Creator<ActivityConversionInfo> {
        C23628a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionInfo createFromParcel(Parcel parcel) {
            return new ActivityConversionInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionInfo[] newArray(int i) {
            return new ActivityConversionInfo[i];
        }
    }

    public ActivityConversionInfo() {
    }

    public ActivityConversionInfo(int i, int i2) {
        this.activityType = i;
        this.conversionType = i2;
    }

    protected ActivityConversionInfo(Parcel parcel) {
        this.activityType = parcel.readInt();
        this.conversionType = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof ActivityConversionInfo)) {
            return false;
        }
        ActivityConversionInfo activityConversionInfo = (ActivityConversionInfo) obj;
        return this.activityType == activityConversionInfo.getActivityType() && this.conversionType == activityConversionInfo.getConversionType();
    }

    public int getActivityType() {
        return this.activityType;
    }

    public int getConversionType() {
        return this.conversionType;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.activityType), Integer.valueOf(this.conversionType));
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public void setConversionType(int i) {
        this.conversionType = i;
    }

    public String toString() {
        return "ActivityConversionInfo{activityType=" + this.activityType + ", conversionType=" + this.conversionType + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityType);
        parcel.writeInt(this.conversionType);
    }
}
