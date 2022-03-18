package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.AppendState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.ReserveRoomState;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.chipstate.TimeState;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32658j;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.b.d */
public class C30760d extends FrameLayout {

    /* renamed from: a */
    private int f77268a = 7;

    /* renamed from: b */
    private AbstractC30757a f77269b;

    /* renamed from: c */
    private AbstractC30757a f77270c;

    /* renamed from: d */
    private EventChipView f77271d;

    /* renamed from: e */
    private int f77272e;

    /* renamed from: f */
    private boolean f77273f;

    /* renamed from: g */
    private Paint f77274g;

    public AbstractC30757a getBottomDragHandle() {
        return this.f77270c;
    }

    public EventChipView getEventChipView() {
        return this.f77271d;
    }

    public AbstractC30757a getTopDragHandle() {
        return this.f77269b;
    }

    public int getDragCircleRadius() {
        return this.f77269b.getDragCircleRadius();
    }

    /* renamed from: b */
    public void mo111224b() {
        this.f77271d.mo112563d();
        this.f77269b.mo111215e();
        this.f77270c.mo111215e();
    }

    public FrameLayout.LayoutParams getChipViewLayoutParams() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        layoutParams2.topMargin = layoutParams.topMargin + getDragCircleRadius();
        layoutParams2.height = layoutParams.height - (getDragCircleRadius() * 2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        return layoutParams2;
    }

    /* renamed from: a */
    public void mo111223a() {
        this.f77271d.mo112561c();
        this.f77269b.mo111214d();
        this.f77270c.mo111214d();
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f77273f = z;
        invalidate();
    }

    /* renamed from: a */
    private void m114620a(Context context) {
        this.f77268a = UIUtils.dp2px(context, (float) this.f77268a);
        m114622a(this.f77271d);
        m114623b(context);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    private void m114621a(DragDrawChipViewData eVar) {
        EventChipView eventChipView = new EventChipView(getContext(), 0);
        setDragHandleType(eventChipView);
        if (eVar != null) {
            eventChipView.setShowDragBorder(true);
            eventChipView.mo112557a(eVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.f77268a;
        layoutParams.bottomMargin = this.f77268a;
        addView(eventChipView, layoutParams);
        this.f77271d = eventChipView;
    }

    /* renamed from: b */
    private void m114623b(Context context) {
        int dragCircleColor = this.f77271d.getDragCircleColor();
        C30761e eVar = new C30761e(context);
        this.f77269b = eVar;
        eVar.setEventColor(dragCircleColor);
        AbstractC30757a aVar = this.f77269b;
        addView(aVar, aVar.mo111211a());
        C30759c cVar = new C30759c(context);
        this.f77270c = cVar;
        cVar.setEventColor(dragCircleColor);
        AbstractC30757a aVar2 = this.f77270c;
        addView(aVar2, aVar2.mo111211a());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f77273f) {
            if (this.f77274g == null) {
                Paint paint = new Paint();
                this.f77274g = paint;
                paint.setColor(C32658j.m125333a(C32634ae.m125178a(R.color.ud_N500), 0.1d));
            }
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) this.f77268a, (float) getWidth(), (float) (getHeight() - this.f77268a), this.f77274g);
        }
    }

    public void setDragHandleType(EventChipView eventChipView) {
        int i = this.f77272e;
        if (i == 1) {
            eventChipView.setAttribute(new TimeState());
        } else if (i == 2) {
            eventChipView.setAttribute(new AppendState());
        } else if (i == 3) {
            eventChipView.setAttribute(new ReserveRoomState());
        }
    }

    /* renamed from: a */
    private void m114622a(EventChipView eventChipView) {
        EventChipView eventChipView2 = new EventChipView(getContext(), 0);
        setDragHandleType(eventChipView2);
        if (eventChipView != null) {
            eventChipView2.setShowDragBorder(true);
            eventChipView2.mo112558a(eventChipView.getViewData());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = this.f77268a;
        layoutParams.bottomMargin = this.f77268a;
        addView(eventChipView2, layoutParams);
        this.f77271d = eventChipView2;
    }

    public C30760d(Context context, DragDrawChipViewData eVar) {
        super(context);
        this.f77271d = eVar.mo110972f();
        this.f77272e = 0;
        this.f77268a = UIUtils.dp2px(context, (float) this.f77268a);
        m114621a(eVar);
        m114623b(context);
        setWillNotDraw(false);
    }

    public C30760d(Context context, EventChipView eventChipView, int i) {
        super(context);
        this.f77271d = eventChipView;
        this.f77272e = i;
        m114620a(context);
    }

    /* renamed from: a */
    public FrameLayout.LayoutParams mo111222a(int i, int i2, int i3, int i4) {
        int i5 = this.f77268a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2 + (i5 * 2));
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4 - i5;
        return layoutParams;
    }
}
