package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new Parcelable.Creator<DateValidatorPointBackward>() {
        /* class com.google.android.material.datepicker.DateValidatorPointBackward.C222231 */

        /* renamed from: a */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }

        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong());
        }
    };

    /* renamed from: a */
    private final long f54315a;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f54315a)});
    }

    private DateValidatorPointBackward(long j) {
        this.f54315a = j;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: a */
    public boolean mo77303a(long j) {
        if (j <= this.f54315a) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointBackward) && this.f54315a == ((DateValidatorPointBackward) obj).f54315a) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f54315a);
    }
}
