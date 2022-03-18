package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() {
        /* class com.google.android.material.datepicker.CalendarConstraints.C222201 */

        /* renamed from: a */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }

        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()));
        }
    };

    /* renamed from: a */
    public final Month f54302a;

    /* renamed from: b */
    public final Month f54303b;

    /* renamed from: c */
    public final Month f54304c;

    /* renamed from: d */
    public final DateValidator f54305d;

    /* renamed from: e */
    private final int f54306e;

    /* renamed from: f */
    private final int f54307f;

    public interface DateValidator extends Parcelable {
        /* renamed from: a */
        boolean mo77303a(long j);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public DateValidator mo77287a() {
        return this.f54305d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Month mo77290b() {
        return this.f54302a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Month mo77291c() {
        return this.f54303b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Month mo77292d() {
        return this.f54304c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo77294e() {
        return this.f54307f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo77296f() {
        return this.f54306e;
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public static final class C22221a {

        /* renamed from: a */
        static final long f54308a = C22265o.m80537a(Month.m80428a(1900, 0).f54347e);

        /* renamed from: b */
        static final long f54309b = C22265o.m80537a(Month.m80428a(2100, 11).f54347e);

        /* renamed from: c */
        private long f54310c = f54308a;

        /* renamed from: d */
        private long f54311d = f54309b;

        /* renamed from: e */
        private Long f54312e;

        /* renamed from: f */
        private DateValidator f54313f = DateValidatorPointForward.m80403b(Long.MIN_VALUE);

        public C22221a() {
        }

        /* renamed from: a */
        public CalendarConstraints mo77305a() {
            if (this.f54312e == null) {
                long f = MaterialDatePicker.m80418f();
                long j = this.f54310c;
                if (j > f || f > this.f54311d) {
                    f = j;
                }
                this.f54312e = Long.valueOf(f);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f54313f);
            return new CalendarConstraints(Month.m80429a(this.f54310c), Month.m80429a(this.f54311d), Month.m80429a(this.f54312e.longValue()), (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"));
        }

        /* renamed from: a */
        public C22221a mo77304a(long j) {
            this.f54312e = Long.valueOf(j);
            return this;
        }

        C22221a(CalendarConstraints calendarConstraints) {
            this.f54310c = calendarConstraints.f54302a.f54347e;
            this.f54311d = calendarConstraints.f54303b.f54347e;
            this.f54312e = Long.valueOf(calendarConstraints.f54304c.f54347e);
            this.f54313f = calendarConstraints.f54305d;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54302a, this.f54303b, this.f54304c, this.f54305d});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Month mo77288a(Month month) {
        if (month.compareTo(this.f54302a) < 0) {
            return this.f54302a;
        }
        if (month.compareTo(this.f54303b) > 0) {
            return this.f54303b;
        }
        return month;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo77289a(long j) {
        if (this.f54302a.mo77358a(1) <= j) {
            Month month = this.f54303b;
            if (j <= month.mo77358a(month.f54346d)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f54302a.equals(calendarConstraints.f54302a) || !this.f54303b.equals(calendarConstraints.f54303b) || !this.f54304c.equals(calendarConstraints.f54304c) || !this.f54305d.equals(calendarConstraints.f54305d)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f54302a, 0);
        parcel.writeParcelable(this.f54303b, 0);
        parcel.writeParcelable(this.f54304c, 0);
        parcel.writeParcelable(this.f54305d, 0);
    }

    private CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.f54302a = month;
        this.f54303b = month2;
        this.f54304c = month3;
        this.f54305d = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3.compareTo(month2) <= 0) {
            this.f54307f = month.mo77360b(month2) + 1;
            this.f54306e = (month2.f54344b - month.f54344b) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
