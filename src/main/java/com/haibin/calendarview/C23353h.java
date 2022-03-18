package com.haibin.calendarview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.larksuite.suite.R;

/* renamed from: com.haibin.calendarview.h */
public class C23353h extends YearView {

    /* renamed from: z */
    private int f57656z;

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.YearView
    /* renamed from: a */
    public void mo81069a(Canvas canvas, Calendar calendar, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.YearView
    /* renamed from: a */
    public boolean mo81071a(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        return false;
    }

    public C23353h(Context context) {
        super(context);
        this.f57656z = C23349d.m84776a(context, 3.0f);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.YearView
    /* renamed from: a */
    public void mo81067a(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        canvas.drawText(getContext().getResources().getStringArray(R.array.year_view_week_string_array)[i], (float) (i2 + (i4 / 2)), ((float) i3) + this.f57577u, this.f57571o);
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.YearView
    /* renamed from: a */
    public void mo81070a(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        float f = this.f57575s + ((float) i2);
        int i3 = i + (this.f57574r / 2);
        if (z2) {
            String valueOf = String.valueOf(calendar.getDay());
            float f2 = (float) i3;
            if (z) {
                paint3 = this.f57566j;
            } else {
                paint3 = this.f57567k;
            }
            canvas.drawText(valueOf, f2, f, paint3);
        } else if (z) {
            String valueOf2 = String.valueOf(calendar.getDay());
            float f3 = (float) i3;
            if (calendar.isCurrentDay()) {
                paint2 = this.f57568l;
            } else if (calendar.isCurrentMonth()) {
                paint2 = this.f57566j;
            } else {
                paint2 = this.f57559c;
            }
            canvas.drawText(valueOf2, f3, f, paint2);
        } else {
            String valueOf3 = String.valueOf(calendar.getDay());
            float f4 = (float) i3;
            if (calendar.isCurrentDay()) {
                paint = this.f57568l;
            } else if (calendar.isCurrentMonth()) {
                paint = this.f57558b;
            } else {
                paint = this.f57559c;
            }
            canvas.drawText(valueOf3, f4, f, paint);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.haibin.calendarview.YearView
    /* renamed from: a */
    public void mo81068a(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6) {
        canvas.drawText(getContext().getResources().getStringArray(R.array.month_string_array)[i2 - 1], (float) ((i3 + (this.f57574r / 2)) - this.f57656z), ((float) i4) + this.f57576t, this.f57570n);
    }
}
