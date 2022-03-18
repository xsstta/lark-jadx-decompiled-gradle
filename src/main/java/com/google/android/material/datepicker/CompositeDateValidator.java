package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C0845f;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() {
        /* class com.google.android.material.datepicker.CompositeDateValidator.C222221 */

        /* renamed from: a */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }

        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            return new CompositeDateValidator((List) C0845f.m3991a(parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader())));
        }
    };

    /* renamed from: a */
    private final List<CalendarConstraints.DateValidator> f54314a;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return this.f54314a.hashCode();
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list) {
        this.f54314a = list;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    /* renamed from: a */
    public boolean mo77303a(long j) {
        for (CalendarConstraints.DateValidator dateValidator : this.f54314a) {
            if (dateValidator != null && !dateValidator.mo77303a(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        return this.f54314a.equals(((CompositeDateValidator) obj).f54314a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f54314a);
    }
}
