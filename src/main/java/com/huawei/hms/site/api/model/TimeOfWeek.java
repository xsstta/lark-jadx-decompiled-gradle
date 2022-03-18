package com.huawei.hms.site.api.model;

import com.huawei.hms.site.C23738a;
import com.huawei.hms.site.C23761m;

public class TimeOfWeek {
    public static final int DAY_MAX = 6;
    public static final int DAY_TIME_MIN = 0;
    public static final String TAG = "TimeOfWeek";
    public static final int TIME_MAX = 2359;
    public String time;
    public int week;

    public static TimeOfWeek newInstance(int i, String str) {
        TimeOfWeek timeOfWeek = new TimeOfWeek();
        timeOfWeek.setDay(i);
        timeOfWeek.setTime(str);
        return timeOfWeek;
    }

    public int getDay() {
        return this.week;
    }

    public String getTime() {
        return this.time;
    }

    public void setDay(int i) {
        if (i < 0 || i > 6) {
            C23761m.m86935b(TAG, "TimeOfWeek setDay param Exceeded the range");
        } else {
            this.week = i;
        }
    }

    public void setTime(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0 || parseInt > 2359) {
                C23761m.m86935b(TAG, "TimeOfWeek setTime param Exceeded the range");
            } else {
                this.time = str;
            }
        } catch (NumberFormatException e) {
            String str2 = TAG;
            StringBuilder a = C23738a.m86922a("TimeOfWeek setTime param exception error = ");
            a.append(e.getMessage());
            C23761m.m86935b(str2, a.toString());
        }
    }
}
