package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.TimeState;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.j */
public class C30132j extends FrameLayout {

    /* renamed from: a */
    private int f75142a = 7;

    /* renamed from: b */
    private AbstractC30124b f75143b;

    /* renamed from: c */
    private AbstractC30124b f75144c;

    /* renamed from: d */
    private EventChipView f75145d;

    /* renamed from: e */
    private int f75146e;

    /* renamed from: f */
    private boolean f75147f;

    /* renamed from: g */
    private Paint f75148g;

    public AbstractC30124b getBottomDragHandle() {
        return this.f75144c;
    }

    public EventChipView getEventChipView() {
        return this.f75145d;
    }

    public AbstractC30124b getTopDragHandle() {
        return this.f75143b;
    }

    public int getDragCircleRadius() {
        return this.f75143b.getDragCircleRadius();
    }

    public FrameLayout.LayoutParams getChipViewLayoutParams() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        layoutParams2.topMargin = layoutParams.topMargin + getDragCircleRadius();
        layoutParams2.height = layoutParams.height - (getDragCircleRadius() * 2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        return layoutParams2;
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f75147f = z;
        invalidate();
    }

    /* renamed from: a */
    private void m111587a(Context context) {
        this.f75142a = UIUtils.dp2px(context, (float) this.f75142a);
        m111588a(this.f75145d);
        m111589b(context);
        setWillNotDraw(false);
    }

    public void setDragHandleType(EventChipView eventChipView) {
        int i = this.f75146e;
        if (i == 1) {
            eventChipView.setAttribute(new TimeState());
        } else if (i == 2) {
            eventChipView.setAttribute(new AppendState());
        }
    }

    /* renamed from: a */
    private void m111588a(EventChipView eventChipView) {
        EventChipView eventChipView2 = new EventChipView(getContext(), 0);
        setDragHandleType(eventChipView2);
        if (eventChipView != null) {
            eventChipView2.setShowDragBorder(true);
            eventChipView2.mo112558a(eventChipView.getViewData());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.f75142a;
        layoutParams.bottomMargin = this.f75142a;
        addView(eventChipView2, layoutParams);
        this.f75145d = eventChipView2;
    }

    /* renamed from: b */
    private void m111589b(Context context) {
        int dragCircleColor = this.f75145d.getDragCircleColor();
        C30158w wVar = new C30158w(context);
        this.f75143b = wVar;
        wVar.setEventColor(dragCircleColor);
        AbstractC30124b bVar = this.f75143b;
        addView(bVar, bVar.mo108615a());
        C30128f fVar = new C30128f(context);
        this.f75144c = fVar;
        fVar.setEventColor(dragCircleColor);
        AbstractC30124b bVar2 = this.f75144c;
        addView(bVar2, bVar2.mo108615a());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f75147f) {
            if (this.f75148g == null) {
                Paint paint = new Paint();
                this.f75148g = paint;
                paint.setColor(C32658j.m125333a(C32634ae.m125178a(R.color.lkui_N500), 0.1d));
            }
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) this.f75142a, (float) getWidth(), (float) (getHeight() - this.f75142a), this.f75148g);
        }
    }

    public C30132j(Context context, EventChipView eventChipView) {
        super(context);
        this.f75145d = eventChipView;
        m111587a(context);
    }

    public C30132j(Context context, EventChipView eventChipView, int i) {
        super(context);
        this.f75145d = eventChipView;
        this.f75146e = i;
        m111587a(context);
    }

    /* renamed from: a */
    public FrameLayout.LayoutParams mo108644a(int i, int i2, int i3, int i4) {
        int i5 = this.f75142a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2 + (i5 * 2));
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4 - i5;
        return layoutParams;
    }
}
