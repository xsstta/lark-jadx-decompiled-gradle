package com.prolificinteractive.materialcalendarview;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.android.HwBuildEx;
import java.util.Calendar;
import java.util.Date;

public final class CalendarDay implements Parcelable {
    public static final Parcelable.Creator<CalendarDay> CREATOR = new Parcelable.Creator<CalendarDay>() {
        /* class com.prolificinteractive.materialcalendarview.CalendarDay.C269741 */

        /* renamed from: a */
        public CalendarDay[] newArray(int i) {
            return new CalendarDay[i];
        }

        /* renamed from: a */
        public CalendarDay createFromParcel(Parcel parcel) {
            return new CalendarDay(parcel);
        }
    };

    /* renamed from: a */
    private final int f66943a;

    /* renamed from: b */
    private final int f66944b;

    /* renamed from: c */
    private final int f66945c;

    /* renamed from: d */
    private transient Calendar f66946d;

    /* renamed from: e */
    private transient Date f66947e;

    /* renamed from: b */
    private static int m98027b(int i, int i2, int i3) {
        return (i * HwBuildEx.VersionCodes.CUR_DEVELOPMENT) + (i2 * 100) + i3;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public int mo95889b() {
        return this.f66943a;
    }

    /* renamed from: c */
    public int mo95892c() {
        return this.f66944b;
    }

    /* renamed from: d */
    public int mo95893d() {
        return this.f66945c;
    }

    public CalendarDay() {
        this(C26996e.m98121a());
    }

    /* renamed from: a */
    public static CalendarDay m98023a() {
        return m98025a(C26996e.m98121a());
    }

    /* renamed from: f */
    public Calendar mo95897f() {
        if (this.f66946d == null) {
            Calendar a = C26996e.m98121a();
            this.f66946d = a;
            mo95890b(a);
        }
        return this.f66946d;
    }

    public int hashCode() {
        return m98027b(this.f66943a, this.f66944b, this.f66945c);
    }

    /* renamed from: e */
    public Date mo95895e() {
        if (this.f66947e == null) {
            this.f66947e = mo95897f().getTime();
        }
        return this.f66947e;
    }

    public String toString() {
        return "CalendarDay{" + this.f66943a + "-" + this.f66944b + "-" + this.f66945c + "}";
    }

    /* renamed from: b */
    public void mo95890b(Calendar calendar) {
        calendar.clear();
        calendar.set(this.f66943a, this.f66944b, this.f66945c);
    }

    public CalendarDay(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    /* renamed from: a */
    public static CalendarDay m98025a(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return m98024a(C26996e.m98120a(calendar), C26996e.m98124b(calendar), C26996e.m98125c(calendar));
    }

    public CalendarDay(Calendar calendar) {
        this(C26996e.m98120a(calendar), C26996e.m98124b(calendar), C26996e.m98125c(calendar));
    }

    /* renamed from: a */
    public static CalendarDay m98026a(Date date) {
        if (date == null) {
            return null;
        }
        return m98025a(C26996e.m98122a(date));
    }

    /* renamed from: b */
    public boolean mo95891b(CalendarDay calendarDay) {
        if (calendarDay != null) {
            int i = this.f66943a;
            int i2 = calendarDay.f66943a;
            if (i == i2) {
                int i3 = this.f66944b;
                int i4 = calendarDay.f66944b;
                if (i3 == i4) {
                    if (this.f66945c > calendarDay.f66945c) {
                        return true;
                    }
                } else if (i3 > i4) {
                    return true;
                }
                return false;
            } else if (i > i2) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IllegalArgumentException("other cannot be null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CalendarDay calendarDay = (CalendarDay) obj;
        if (this.f66945c == calendarDay.f66945c && this.f66944b == calendarDay.f66944b && this.f66943a == calendarDay.f66943a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo95887a(CalendarDay calendarDay) {
        if (calendarDay != null) {
            int i = this.f66943a;
            int i2 = calendarDay.f66943a;
            if (i == i2) {
                int i3 = this.f66944b;
                int i4 = calendarDay.f66944b;
                if (i3 == i4) {
                    if (this.f66945c < calendarDay.f66945c) {
                        return true;
                    }
                } else if (i3 < i4) {
                    return true;
                }
                return false;
            } else if (i < i2) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IllegalArgumentException("other cannot be null");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66943a);
        parcel.writeInt(this.f66944b);
        parcel.writeInt(this.f66945c);
    }

    /* renamed from: a */
    public boolean mo95888a(CalendarDay calendarDay, CalendarDay calendarDay2) {
        if ((calendarDay == null || !calendarDay.mo95891b(this)) && (calendarDay2 == null || !calendarDay2.mo95887a(this))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static CalendarDay m98024a(int i, int i2, int i3) {
        return new CalendarDay(i, i2, i3);
    }

    public CalendarDay(int i, int i2, int i3) {
        this.f66943a = i;
        this.f66944b = i2;
        this.f66945c = i3;
    }
}
