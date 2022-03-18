package com.ss.android.lark.todo.impl.features.detail.helper.time;

import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/helper/time/DueTimeHelper;", "", "()V", "getOtherDayDueTimeMillis", "", "year", "", "monthOfYear", "dayOfMonth", "getTodayDueTimeMillis", "getTodayWithoutDueTimeMillis", "getTomorrowDueTimeMillis", "getTomorrowWithoutDueTimeMillis", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.b.b.a */
public final class DueTimeHelper {

    /* renamed from: a */
    public static final DueTimeHelper f139699a = new DueTimeHelper();

    private DueTimeHelper() {
    }

    /* renamed from: b */
    public final long mo192307b() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: c */
    public final long mo192308c() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(5, 1);
        gregorianCalendar.set(11, 18);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: d */
    public final long mo192309d() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.add(5, 1);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: a */
    public final long mo192305a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.set(11, 17);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        if (gregorianCalendar.getTimeInMillis() < gregorianCalendar2.getTimeInMillis()) {
            gregorianCalendar2.set(11, 18);
            return gregorianCalendar2.getTimeInMillis();
        }
        gregorianCalendar.add(11, 2);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
        gregorianCalendar3.set(11, 23);
        gregorianCalendar3.set(12, 59);
        gregorianCalendar3.set(13, 59);
        return Math.min(gregorianCalendar.getTimeInMillis(), gregorianCalendar3.getTimeInMillis());
    }

    /* renamed from: a */
    public final long mo192306a(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2);
        gregorianCalendar.set(5, i3);
        gregorianCalendar.set(11, 18);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
