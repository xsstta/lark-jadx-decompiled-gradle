package com.haibin.calendarview;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class Calendar implements Serializable, Comparable<Calendar> {
    private static final long serialVersionUID = 141315161718191143L;
    private int day;
    private String gregorianFestival;
    private boolean isCurrentDay;
    private boolean isCurrentMonth;
    private boolean isLeapYear;
    private boolean isWeekend;
    private int leapMonth;
    private String lunar;
    private Calendar lunarCalendar;
    private int month;
    private String scheme;
    private int schemeColor;
    private List<Scheme> schemes;
    private String solarTerm;
    private String traditionFestival;
    private int week;
    private int year;

    public static final class Scheme implements Serializable {
        private Object obj;
        private String other;
        private String scheme;
        private int shcemeColor;
        private int type;

        public Scheme() {
        }

        public Object getObj() {
            return this.obj;
        }

        public String getOther() {
            return this.other;
        }

        public String getScheme() {
            return this.scheme;
        }

        public int getShcemeColor() {
            return this.shcemeColor;
        }

        public int getType() {
            return this.type;
        }

        public void setObj(Object obj2) {
            this.obj = obj2;
        }

        public void setOther(String str) {
            this.other = str;
        }

        public void setScheme(String str) {
            this.scheme = str;
        }

        public void setShcemeColor(int i) {
            this.shcemeColor = i;
        }

        public void setType(int i) {
            this.type = i;
        }

        public Scheme(int i, String str) {
            this.shcemeColor = i;
            this.scheme = str;
        }

        public Scheme(int i, int i2, String str) {
            this.type = i;
            this.shcemeColor = i2;
            this.scheme = str;
        }

        public Scheme(int i, String str, String str2) {
            this.shcemeColor = i;
            this.scheme = str;
            this.other = str2;
        }

        public Scheme(int i, int i2, String str, String str2) {
            this.type = i;
            this.shcemeColor = i2;
            this.scheme = str;
            this.other = str2;
        }
    }

    public int getDay() {
        return this.day;
    }

    public String getGregorianFestival() {
        return this.gregorianFestival;
    }

    public int getLeapMonth() {
        return this.leapMonth;
    }

    public String getLunar() {
        return this.lunar;
    }

    public Calendar getLunarCalendar() {
        return this.lunarCalendar;
    }

    public int getMonth() {
        return this.month;
    }

    public String getScheme() {
        return this.scheme;
    }

    public int getSchemeColor() {
        return this.schemeColor;
    }

    public List<Scheme> getSchemes() {
        return this.schemes;
    }

    public String getSolarTerm() {
        return this.solarTerm;
    }

    public String getTraditionFestival() {
        return this.traditionFestival;
    }

    public int getWeek() {
        return this.week;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isCurrentDay() {
        return this.isCurrentDay;
    }

    public boolean isCurrentMonth() {
        return this.isCurrentMonth;
    }

    public boolean isLeapYear() {
        return this.isLeapYear;
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    /* access modifiers changed from: package-private */
    public final void clearScheme() {
        setScheme("");
        setSchemeColor(0);
        setSchemes(null);
    }

    public long getTimeInMillis() {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.set(1, this.year);
        instance.set(2, this.month - 1);
        instance.set(5, this.day);
        return instance.getTimeInMillis();
    }

    public boolean hasScheme() {
        List<Scheme> list = this.schemes;
        if ((list == null || list.size() == 0) && TextUtils.isEmpty(this.scheme)) {
            return false;
        }
        return true;
    }

    public boolean isAvailable() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.year;
        boolean z7 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.month;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z8 = z & z2;
        int i3 = this.day;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = z8 & z3;
        if (i3 <= 31) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = z9 & z4;
        if (i2 <= 12) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z11 = z10 & z5;
        if (i >= 1900) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z12 = z11 & z6;
        if (i > 2099) {
            z7 = false;
        }
        return z12 & z7;
    }

    public String toString() {
        Object obj;
        Object obj2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append("");
        int i = this.month;
        if (i < 10) {
            obj = "0" + this.month;
        } else {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        sb.append("");
        int i2 = this.day;
        if (i2 < 10) {
            obj2 = "0" + this.day;
        } else {
            obj2 = Integer.valueOf(i2);
        }
        sb.append(obj2);
        return sb.toString();
    }

    public void setCurrentDay(boolean z) {
        this.isCurrentDay = z;
    }

    public void setCurrentMonth(boolean z) {
        this.isCurrentMonth = z;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setGregorianFestival(String str) {
        this.gregorianFestival = str;
    }

    public void setLeapMonth(int i) {
        this.leapMonth = i;
    }

    public void setLeapYear(boolean z) {
        this.isLeapYear = z;
    }

    public void setLunar(String str) {
        this.lunar = str;
    }

    public void setLunarCalendar(Calendar calendar) {
        this.lunarCalendar = calendar;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setSchemeColor(int i) {
        this.schemeColor = i;
    }

    public void setSchemes(List<Scheme> list) {
        this.schemes = list;
    }

    public void setSolarTerm(String str) {
        this.solarTerm = str;
    }

    public void setTraditionFestival(String str) {
        this.traditionFestival = str;
    }

    public void setWeek(int i) {
        this.week = i;
    }

    public void setWeekend(boolean z) {
        this.isWeekend = z;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public final int differ(Calendar calendar) {
        return C23349d.m84779a(this, calendar);
    }

    public int compareTo(Calendar calendar) {
        if (calendar == null) {
            return 1;
        }
        return toString().compareTo(calendar.toString());
    }

    public boolean isSameMonth(Calendar calendar) {
        if (this.year == calendar.getYear() && this.month == calendar.getMonth()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Calendar)) {
            Calendar calendar = (Calendar) obj;
            if (calendar.getYear() == this.year && calendar.getMonth() == this.month && calendar.getDay() == this.day) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public void addScheme(Scheme scheme2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(scheme2);
    }

    /* access modifiers changed from: package-private */
    public final void mergeScheme(Calendar calendar, String str) {
        if (calendar != null) {
            if (!TextUtils.isEmpty(calendar.getScheme())) {
                str = calendar.getScheme();
            }
            setScheme(str);
            setSchemeColor(calendar.getSchemeColor());
            setSchemes(calendar.getSchemes());
        }
    }

    public void addScheme(int i, String str) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, str));
    }

    public void addScheme(int i, int i2, String str) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, i2, str));
    }

    public void addScheme(int i, String str, String str2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, str, str2));
    }

    public void addScheme(int i, int i2, String str, String str2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, i2, str, str2));
    }
}
