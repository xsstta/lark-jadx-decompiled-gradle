package com.ss.android.lark.calendar.impl.features.local.utils;

import android.text.TextUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.utils.c */
public class C31940c {

    /* renamed from: a */
    public EventRecurrence[] f81599a;

    /* renamed from: b */
    public long[] f81600b;

    /* renamed from: c */
    public EventRecurrence[] f81601c;

    /* renamed from: d */
    public long[] f81602d;

    /* renamed from: a */
    public static long[] m121537a(String str) throws EventRecurrence.InvalidFormatException {
        String str2;
        int indexOf = str.indexOf(";");
        if (indexOf != -1) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            str2 = "UTC";
        }
        Time time = new Time(str2);
        String[] split = str.split(",");
        int length = split.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                time.parse(split[i]);
                jArr[i] = time.toMillis(false);
                time.timezone = str2;
            } catch (TimeFormatException unused) {
                throw new EventRecurrence.InvalidFormatException("TimeFormatException thrown when parsing time " + split[i] + " in recurrence " + str);
            }
        }
        return jArr;
    }

    public C31940c(String str, String str2, String str3, String str4) throws EventRecurrence.InvalidFormatException {
        m121536a(str, str2, str3, str4);
    }

    /* renamed from: a */
    private void m121536a(String str, String str2, String str3, String str4) throws EventRecurrence.InvalidFormatException {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("\n");
                this.f81599a = new EventRecurrence[split.length];
                for (int i = 0; i < split.length; i++) {
                    this.f81599a[i] = EventRecurrence.m125131a(split[i]);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f81600b = m121537a(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                String[] split2 = str3.split("\n");
                this.f81601c = new EventRecurrence[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    this.f81601c[i2] = EventRecurrence.m125131a(str3);
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                this.f81602d = m121537a(str4);
            }
        }
    }
}
