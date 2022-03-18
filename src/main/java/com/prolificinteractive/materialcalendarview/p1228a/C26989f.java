package com.prolificinteractive.materialcalendarview.p1228a;

import android.text.SpannableStringBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;

/* renamed from: com.prolificinteractive.materialcalendarview.a.f */
public class C26989f implements AbstractC26990g {

    /* renamed from: a */
    private final CharSequence[] f67017a;

    public C26989f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        } else if (charSequenceArr.length >= 12) {
            this.f67017a = charSequenceArr;
        } else {
            throw new IllegalArgumentException("Label array is too short");
        }
    }

    @Override // com.prolificinteractive.materialcalendarview.p1228a.AbstractC26990g
    /* renamed from: a */
    public CharSequence mo96015a(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.f67017a[calendarDay.mo95892c()]).append((CharSequence) " ").append((CharSequence) String.valueOf(calendarDay.mo95889b()));
    }
}
