package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() {
        /* class com.google.android.material.datepicker.DateValidatorPointForward.C222241 */

        /* renamed from: a */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }

        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }
    };

    /* renamed from: a */
    private final long f54316a;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f54316a)});
    }

    private DateValidatorPointForward(long j) {
        this.f54316a = j;
    }

    /* renamed from: b */
    public static DateValidatorPointForward m80403b(long j) {
        return new DateValidatorPointForward(j);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: a */
    public boolean mo77303a(long j) {
        if (j >= this.f54316a) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.f54316a == ((DateValidatorPointForward) obj).f54316a) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f54316a);
    }
}
