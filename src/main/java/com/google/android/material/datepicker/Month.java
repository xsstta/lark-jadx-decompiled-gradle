package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* access modifiers changed from: package-private */
public final class Month implements Parcelable, Comparable<Month> {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() {
        /* class com.google.android.material.datepicker.Month.C222301 */

        /* renamed from: a */
        public Month[] newArray(int i) {
            return new Month[i];
        }

        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m80428a(parcel.readInt(), parcel.readInt());
        }
    };

    /* renamed from: a */
    final int f54343a;

    /* renamed from: b */
    final int f54344b;

    /* renamed from: c */
    final int f54345c;

    /* renamed from: d */
    final int f54346d;

    /* renamed from: e */
    final long f54347e;

    /* renamed from: f */
    private final Calendar f54348f;

    /* renamed from: g */
    private final String f54349g;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo77364d() {
        return this.f54349g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo77362c() {
        return this.f54348f.getTimeInMillis();
    }

    /* renamed from: a */
    static Month m80427a() {
        return new Month(C22265o.m80547b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo77359b() {
        int firstDayOfWeek = this.f54348f.get(7) - this.f54348f.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f54345c;
        }
        return firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f54343a), Integer.valueOf(this.f54344b)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Month mo77361b(int i) {
        Calendar b = C22265o.m80548b(this.f54348f);
        b.add(2, i);
        return new Month(b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f54343a == month.f54343a && this.f54344b == month.f54344b) {
            return true;
        }
        return false;
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = C22265o.m80548b(calendar);
        this.f54348f = b;
        this.f54343a = b.get(2);
        this.f54344b = b.get(1);
        this.f54345c = b.getMaximum(7);
        this.f54346d = b.getActualMaximum(5);
        this.f54349g = C22265o.m80554e().format(b.getTime());
        this.f54347e = b.getTimeInMillis();
    }

    /* renamed from: a */
    static Month m80429a(long j) {
        Calendar c = C22265o.m80550c();
        c.setTimeInMillis(j);
        return new Month(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo77360b(Month month) {
        if (this.f54348f instanceof GregorianCalendar) {
            return ((month.f54344b - this.f54344b) * 12) + (month.f54343a - this.f54343a);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f54348f.compareTo(month.f54348f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo77358a(int i) {
        Calendar b = C22265o.m80548b(this.f54348f);
        b.set(5, i);
        return b.getTimeInMillis();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f54344b);
        parcel.writeInt(this.f54343a);
    }

    /* renamed from: a */
    static Month m80428a(int i, int i2) {
        Calendar c = C22265o.m80550c();
        c.set(1, i);
        c.set(2, i2);
        return new Month(c);
    }
}
