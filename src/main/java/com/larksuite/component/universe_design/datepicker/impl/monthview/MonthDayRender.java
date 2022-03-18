package com.larksuite.component.universe_design.datepicker.impl.monthview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.datepicker.impl.data.BaseDay;
import com.larksuite.component.universe_design.datepicker.impl.data.CalendarAttr;
import com.larksuite.component.universe_design.datepicker.impl.listener.IDayRender;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\rH\u0002J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J(\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/monthview/MonthDayRender;", "Lcom/larksuite/component/universe_design/datepicker/impl/listener/IDayRender;", "context", "Landroid/content/Context;", "itemHeight", "", "(Landroid/content/Context;I)V", "getItemHeight", "()I", "setItemHeight", "(I)V", "mCircleRadius", "mCurrentBlueTextPaint", "Landroid/text/TextPaint;", "mCurrentCirclePaint", "Landroid/graphics/Paint;", "mCurrentDateTextPaint", "mFirstLineTopMargin", "mMonthDateTextPaint", "mMonthDayTextSize", "", "mNotMonthDateTextPaint", "mSelectCirclePaint", "mTextTopMargin", "drawContent", "", "canvas", "Landroid/graphics/Canvas;", "baseDay", "Lcom/larksuite/component/universe_design/datepicker/impl/data/BaseDay;", "drawDay", "drawMonthDays", "getCellHeight", "getCenterTextBaseLine", "textPaint", "getTranslateX", "day", "initBaseData", "initPaint", "renderCurrentMonthDays", "dayText", "", "selectState", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$SelectState;", "dateState", "Lcom/larksuite/component/universe_design/datepicker/impl/data/CalendarAttr$DateState;", "renderNonCurrentMonthDays", "setMonthTextSize", "textSize", "setTypeFace", "typeFace", "Landroid/graphics/Typeface;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.datepicker.impl.b.a */
public class MonthDayRender implements IDayRender {

    /* renamed from: a */
    private float f63198a;

    /* renamed from: b */
    private int f63199b;

    /* renamed from: c */
    private int f63200c;

    /* renamed from: d */
    private int f63201d;

    /* renamed from: e */
    private final TextPaint f63202e = new TextPaint();

    /* renamed from: f */
    private final TextPaint f63203f = new TextPaint();

    /* renamed from: g */
    private final TextPaint f63204g = new TextPaint();

    /* renamed from: h */
    private final TextPaint f63205h = new TextPaint();

    /* renamed from: i */
    private final Paint f63206i = new Paint();

    /* renamed from: j */
    private final Paint f63207j = new Paint();

    /* renamed from: k */
    private final Context f63208k;

    /* renamed from: l */
    private int f63209l;

    @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IDayRender
    /* renamed from: a */
    public int mo90473a() {
        return this.f63209l;
    }

    /* renamed from: b */
    private final void m92644b() {
        this.f63199b = (int) UDDimenUtils.m93307a(this.f63208k, 16.0f);
        this.f63200c = (int) UDDimenUtils.m93307a(this.f63208k, 6.0f);
        this.f63201d = (int) UDDimenUtils.m93307a(this.f63208k, 6.0f);
    }

    /* renamed from: c */
    private final void m92646c() {
        this.f63202e.setTextSize(this.f63198a);
        this.f63202e.setTextAlign(Paint.Align.CENTER);
        this.f63202e.setColor(this.f63208k.getResources().getColor(R.color.text_title));
        this.f63202e.setAntiAlias(true);
        this.f63203f.setTextSize(this.f63198a);
        this.f63203f.setTextAlign(Paint.Align.CENTER);
        this.f63203f.setColor(this.f63208k.getResources().getColor(R.color.text_placeholder));
        this.f63203f.setAntiAlias(true);
        this.f63204g.setTextSize(this.f63198a);
        this.f63204g.setTextAlign(Paint.Align.CENTER);
        this.f63204g.setColor(this.f63208k.getResources().getColor(R.color.static_white));
        this.f63204g.setAntiAlias(true);
        this.f63205h.setTextSize(this.f63198a);
        this.f63205h.setTextAlign(Paint.Align.CENTER);
        this.f63205h.setColor(this.f63208k.getResources().getColor(R.color.primary_pri_500));
        this.f63205h.setAntiAlias(true);
        this.f63206i.setStyle(Paint.Style.FILL);
        this.f63206i.setColor(this.f63208k.getResources().getColor(R.color.primary_pri_500));
        this.f63206i.setAntiAlias(true);
        this.f63207j.setStyle(Paint.Style.FILL);
        this.f63207j.setColor(this.f63208k.getResources().getColor(R.color.line_border_card));
        this.f63207j.setAntiAlias(true);
    }

    /* renamed from: a */
    private final float m92641a(TextPaint textPaint) {
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return (((float) (this.f63209l / 2)) + ((fontMetrics.descent - fontMetrics.ascent) / ((float) 2))) - fontMetrics.descent;
    }

    @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IDayRender
    /* renamed from: a */
    public void mo90474a(float f) {
        this.f63198a = f;
        this.f63202e.setTextSize(f);
        this.f63203f.setTextSize(f);
        this.f63204g.setTextSize(f);
        this.f63205h.setTextSize(f);
    }

    @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IDayRender
    /* renamed from: a */
    public void mo90476a(Typeface typeface) {
        Intrinsics.checkParameterIsNotNull(typeface, "typeFace");
        this.f63202e.setTypeface(typeface);
        this.f63203f.setTypeface(typeface);
        this.f63204g.setTypeface(typeface);
        this.f63205h.setTypeface(typeface);
    }

    /* renamed from: b */
    private final void m92645b(Canvas canvas, BaseDay aVar) {
        m92647c(canvas, aVar);
    }

    /* renamed from: d */
    private final int m92648d(Canvas canvas, BaseDay aVar) {
        int width = canvas.getWidth() / 7;
        return (aVar.mo90516b() * width) + (width / 2);
    }

    /* renamed from: c */
    private final void m92647c(Canvas canvas, BaseDay aVar) {
        CalendarAttr.MonthState c = aVar.mo90518d().mo90508c();
        CalendarAttr.SelectState a = aVar.mo90518d().mo90503a();
        CalendarAttr.DateState b = aVar.mo90518d().mo90507b();
        String valueOf = String.valueOf(aVar.mo90517c().getMonthDay());
        if (c == CalendarAttr.MonthState.CURRENT_MONTH) {
            m92643a(canvas, valueOf, a, b);
        } else {
            m92642a(canvas, valueOf, b);
        }
    }

    public MonthDayRender(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f63208k = context;
        this.f63209l = i;
        this.f63198a = UDDimenUtils.m93307a(context, 16.0f);
        m92644b();
        m92646c();
    }

    @Override // com.larksuite.component.universe_design.datepicker.impl.listener.IDayRender
    /* renamed from: a */
    public void mo90475a(Canvas canvas, BaseDay aVar) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Intrinsics.checkParameterIsNotNull(aVar, "baseDay");
        int save = canvas.save();
        canvas.translate((float) m92648d(canvas, aVar), ((float) aVar.mo90514a()) * ((float) this.f63209l));
        m92645b(canvas, aVar);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private final void m92642a(Canvas canvas, String str, CalendarAttr.DateState dateState) {
        if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, m92641a(this.f63205h), this.f63205h);
        } else {
            canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, m92641a(this.f63203f), this.f63203f);
        }
    }

    /* renamed from: a */
    private final void m92643a(Canvas canvas, String str, CalendarAttr.SelectState selectState, CalendarAttr.DateState dateState) {
        float f = (float) (this.f63209l / 2);
        if (selectState == CalendarAttr.SelectState.SELECT) {
            if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
                canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, f, (float) this.f63199b, this.f63206i);
                canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, m92641a(this.f63204g), this.f63204g);
                return;
            }
            canvas.drawCircle(BitmapDescriptorFactory.HUE_RED, f, (float) this.f63199b, this.f63207j);
            canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, m92641a(this.f63202e), this.f63202e);
        } else if (dateState == CalendarAttr.DateState.CURRENT_DATE) {
            canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, m92641a(this.f63205h), this.f63205h);
        } else {
            canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, m92641a(this.f63202e), this.f63202e);
        }
    }
}
