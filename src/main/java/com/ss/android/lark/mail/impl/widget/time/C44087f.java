package com.ss.android.lark.mail.impl.widget.time;

import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.widget.wheelpicker.AbstractC59257b;
import com.ss.android.lark.widget.wheelpicker.AbstractC59265j;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.mail.impl.widget.time.f */
public class C44087f implements AbstractC44097j, AbstractC59265j<C44088a> {

    /* renamed from: a */
    public Date f111921a;

    /* renamed from: b */
    public String[] f111922b;

    /* renamed from: c */
    public TimeZone f111923c;

    /* renamed from: d */
    private int f111924d;

    /* renamed from: e */
    private int f111925e;

    /* renamed from: f */
    private boolean f111926f;

    /* renamed from: g */
    private String f111927g;

    @Override // com.ss.android.lark.mail.impl.widget.time.AbstractC44097j
    public String aQ_() {
        return "12月24日 周三";
    }

    @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59265j
    /* renamed from: a */
    public int mo156880a() {
        return (this.f111925e - this.f111924d) + 1;
    }

    /* renamed from: com.ss.android.lark.mail.impl.widget.time.f$a */
    public class C44088a implements AbstractC59257b {

        /* renamed from: a */
        public int f111928a;

        /* renamed from: b */
        public boolean f111929b;

        /* renamed from: c */
        public String f111930c;

        @Override // com.ss.android.lark.widget.wheelpicker.AbstractC59257b
        /* renamed from: a */
        public String mo156890a() {
            if (this.f111929b) {
                return this.f111930c;
            }
            CalendarDate calendarDate = new CalendarDate(C44087f.this.f111921a, C44087f.this.f111923c);
            calendarDate.add(5, this.f111928a);
            return C43760c.m173468a(calendarDate, C44087f.this.f111923c, false) + " " + C44087f.this.f111922b[calendarDate.getWeekDay() - 1];
        }

        public C44088a(int i, boolean z, String str) {
            this.f111928a = i;
            this.f111929b = z;
            this.f111930c = str;
        }
    }

    /* renamed from: a */
    public int mo156882a(C44088a aVar) {
        return aVar.f111928a;
    }

    /* renamed from: a */
    public C44088a mo156885b(int i) {
        return new C44088a(i, this.f111926f, this.f111927g);
    }

    /* renamed from: a */
    public void mo156888a(Date date) {
        this.f111921a = date;
    }

    /* renamed from: a */
    public void mo156889a(TimeZone timeZone) {
        if (timeZone != null) {
            this.f111923c = timeZone;
        }
    }

    public C44087f(Date date, int i, int i2, String[] strArr) {
        this(date, i, i2, strArr, false, "");
    }

    public C44087f(Date date, int i, int i2, String[] strArr, boolean z, String str) {
        this.f111923c = TimeZone.getDefault();
        this.f111927g = "";
        this.f111921a = date;
        this.f111924d = i;
        this.f111925e = i2;
        this.f111922b = strArr;
        this.f111926f = z;
        this.f111927g = str;
    }
}
