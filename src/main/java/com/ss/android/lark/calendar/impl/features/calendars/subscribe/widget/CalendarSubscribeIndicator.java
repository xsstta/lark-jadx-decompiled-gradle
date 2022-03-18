package com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/widget/CalendarSubscribeIndicator;", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/indicators/LinePagerIndicator;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dividerHeight", "", "getDividerHeight", "()F", "setDividerHeight", "(F)V", "dividerPaint", "Landroid/graphics/Paint;", "drawDivider", "", "canvas", "Landroid/graphics/Canvas;", "onDraw", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.a */
public final class CalendarSubscribeIndicator extends C69625a {

    /* renamed from: a */
    private float f76770a;

    /* renamed from: b */
    private final Paint f76771b;

    public final float getDividerHeight() {
        return this.f76770a;
    }

    public final void setDividerHeight(float f) {
        this.f76770a = f;
    }

    /* access modifiers changed from: protected */
    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        m113935a(canvas);
        super.onDraw(canvas);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarSubscribeIndicator(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Paint paint = new Paint(1);
        this.f76771b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(context.getResources().getColor(R.color.line_divider_default));
    }

    /* renamed from: a */
    private final void m113935a(Canvas canvas) {
        this.f76771b.setStrokeWidth(this.f76770a);
        float f = (float) 2;
        canvas.drawLine(BitmapDescriptorFactory.HUE_RED, (((float) getHeight()) - getYOffset()) - (this.f76770a / f), (float) DeviceUtils.getScreenWidth(getContext()), (((float) getHeight()) - getYOffset()) - (this.f76770a / f), this.f76771b);
    }
}
