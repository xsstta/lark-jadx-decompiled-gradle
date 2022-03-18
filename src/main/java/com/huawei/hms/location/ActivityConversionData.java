package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;

public class ActivityConversionData implements Parcelable {
    public static final Parcelable.Creator<ActivityConversionData> CREATOR = new C23627a();

    /* renamed from: a */
    private int f58354a;

    /* renamed from: b */
    private int f58355b;

    /* renamed from: c */
    private long f58356c;

    /* renamed from: com.huawei.hms.location.ActivityConversionData$a */
    static class C23627a implements Parcelable.Creator<ActivityConversionData> {
        C23627a() {
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionData createFromParcel(Parcel parcel) {
            return new ActivityConversionData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public ActivityConversionData[] newArray(int i) {
            return new ActivityConversionData[0];
        }
    }

    public ActivityConversionData() {
    }

    public ActivityConversionData(int i, int i2, long j) {
        this.f58354a = i;
        this.f58355b = i2;
        this.f58356c = j;
    }

    private ActivityConversionData(Parcel parcel) {
        this.f58354a = parcel.readInt();
        this.f58355b = parcel.readInt();
        this.f58356c = parcel.readLong();
    }

    /* synthetic */ ActivityConversionData(Parcel parcel, C23627a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityConversionData)) {
            return false;
        }
        ActivityConversionData activityConversionData = (ActivityConversionData) obj;
        return this.f58354a == activityConversionData.getActivityType() && this.f58355b == activityConversionData.getConversionType() && this.f58356c == activityConversionData.getElapsedTimeFromReboot();
    }

    public int getActivityType() {
        return this.f58354a;
    }

    public int getConversionType() {
        return this.f58355b;
    }

    public long getElapsedTimeFromReboot() {
        return this.f58356c;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "ActivityConversionData{activityType=" + this.f58354a + ", conversionType=" + this.f58355b + ", elapsedTimeFromReboot=" + this.f58356c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f58354a);
        parcel.writeInt(this.f58355b);
        parcel.writeLong(this.f58356c);
    }
}
