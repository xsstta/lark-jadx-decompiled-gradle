package com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.d */
public class C31904d implements AbstractC31902b<C31905a> {

    /* renamed from: a */
    public String[] f81486a;

    /* renamed from: b */
    public TimeZone f81487b;

    /* renamed from: c */
    public CalendarDate f81488c;

    /* renamed from: d */
    private int f81489d;

    /* renamed from: e */
    private int f81490e;

    /* renamed from: f */
    private boolean f81491f;

    /* renamed from: g */
    private String f81492g;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: b */
    public String mo116508b() {
        return "12月24日 周三";
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31902b
    /* renamed from: a */
    public int mo116503a() {
        return (this.f81490e - this.f81489d) + 1;
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.a.d$a */
    public class C31905a implements AbstractC31908f {

        /* renamed from: a */
        public int f81493a;

        /* renamed from: b */
        public boolean f81494b;

        /* renamed from: c */
        public String f81495c;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.AbstractC31908f
        /* renamed from: a */
        public String mo116514a() {
            if (this.f81494b) {
                return this.f81495c;
            }
            CalendarDate calendarDate = new CalendarDate(C31904d.this.f81488c, C31904d.this.f81487b);
            calendarDate.add(5, this.f81493a);
            return C32646c.m125258a(calendarDate, C31904d.this.f81487b, false) + " " + C31904d.this.f81486a[calendarDate.getWeekDay() - 1];
        }

        public C31905a(int i, boolean z, String str) {
            this.f81493a = i;
            this.f81494b = z;
            this.f81495c = str;
        }
    }

    /* renamed from: a */
    public int mo116504a(C31905a aVar) {
        return aVar.f81493a;
    }

    /* renamed from: a */
    public C31905a mo116507b(int i) {
        return new C31905a(i, this.f81491f, this.f81492g);
    }

    public C31904d(CalendarDate calendarDate, int i, int i2, String[] strArr) {
        this(calendarDate, i, i2, strArr, false, "");
    }

    public C31904d(CalendarDate calendarDate, int i, int i2, String[] strArr, boolean z, String str) {
        this.f81492g = "";
        this.f81487b = TimeZone.getTimeZone("UTC");
        this.f81489d = i;
        this.f81490e = i2;
        this.f81486a = strArr;
        this.f81491f = z;
        this.f81492g = str;
        this.f81488c = new CalendarDate(calendarDate);
    }
}
