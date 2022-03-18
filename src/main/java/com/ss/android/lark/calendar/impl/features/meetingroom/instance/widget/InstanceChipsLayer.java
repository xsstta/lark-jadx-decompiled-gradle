package com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.RedTimeLine;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysChipsLayer;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.util.InstanceChipPool;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.OneInstanceViewData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u0010\"\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\b\u0010&\u001a\u00020\u001fH\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\u001fH\u0014J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0007H\u0016J\u0016\u00101\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\b\u00102\u001a\u00020\u001fH\u0002R$\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipsLayer;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysChipsLayer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "currentDay", "getCurrentDay", "()I", "setCurrentDay", "(I)V", "instanceChipPool", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;", "getInstanceChipPool", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;", "setInstanceChipPool", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/util/InstanceChipPool;)V", "layerHeight", "layerWidth", "mChipStartEndMargin", "mChipTopBottomMargin", "mChipTopMargin", "mOneMinuteHeight", "", "redTimeLine", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/RedTimeLine;", "addOneInstanceChip", "", "chipView", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipView;", "bindData", "instanceData", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/OneInstanceViewData;", "clearView", "convertLayoutInfo", "Landroid/graphics/Rect;", "insLayout", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceLayout;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onDetachedFromWindow", "setLayerDay", "day", "setLayoutParams", "toggleRedLineDraw", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InstanceChipsLayer extends AbsDaysChipsLayer {

    /* renamed from: a */
    private InstanceChipPool f82123a;

    /* renamed from: b */
    private final float f82124b;

    /* renamed from: c */
    private final int f82125c;

    /* renamed from: d */
    private final int f82126d;

    /* renamed from: e */
    private final int f82127e;

    /* renamed from: f */
    private int f82128f;

    /* renamed from: g */
    private int f82129g;

    /* renamed from: h */
    private RedTimeLine f82130h;

    /* renamed from: i */
    private int f82131i;

    public InstanceChipsLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public InstanceChipsLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getCurrentDay() {
        return this.f82131i;
    }

    public final InstanceChipPool getInstanceChipPool() {
        return this.f82123a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f82130h.mo111380a();
    }

    /* renamed from: d */
    private final void m122164d() {
        boolean z;
        if (this.f82131i == -1 || getMLayerDay() != this.f82131i) {
            z = false;
        } else {
            z = true;
        }
        this.f82130h.mo111384a(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysChipsLayer
    /* renamed from: c */
    public void mo113311c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof InstanceChipView)) {
                InstanceChipView instanceChipView = (InstanceChipView) childAt;
                instanceChipView.mo117201a();
                InstanceChipPool aVar = this.f82123a;
                if (aVar != null) {
                    aVar.mo117166a(instanceChipView);
                }
            }
        }
        removeAllViews();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstanceChipsLayer$b */
    static final class RunnableC32130b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InstanceChipsLayer f82134a;

        /* renamed from: b */
        final /* synthetic */ List f82135b;

        RunnableC32130b(InstanceChipsLayer instanceChipsLayer, List list) {
            this.f82134a = instanceChipsLayer;
            this.f82135b = list;
        }

        public final void run() {
            InstanceChipView instanceChipView;
            List<OneInstanceViewData> list = this.f82135b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (OneInstanceViewData cVar : list) {
                InstanceChipPool instanceChipPool = this.f82134a.getInstanceChipPool();
                if (instanceChipPool == null || (instanceChipView = instanceChipPool.mo117167b()) == null) {
                    Context context = this.f82134a.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    instanceChipView = new InstanceChipView(context, null, 0, 6, null);
                }
                instanceChipView.setData(cVar);
                arrayList.add(instanceChipView);
            }
            final ArrayList arrayList2 = arrayList;
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstanceChipsLayer.RunnableC32130b.RunnableC321311 */

                /* renamed from: a */
                final /* synthetic */ RunnableC32130b f82136a;

                {
                    this.f82136a = r1;
                }

                public final void run() {
                    this.f82136a.f82134a.mo113311c();
                    for (InstanceChipView instanceChipView : arrayList2) {
                        this.f82136a.f82134a.mo117206a(instanceChipView);
                    }
                }
            });
        }
    }

    public final void setInstanceChipPool(InstanceChipPool aVar) {
        this.f82123a = aVar;
    }

    public final void setCurrentDay(int i) {
        this.f82131i = i;
        m122164d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.AbsDaysChipsLayer
    public void setLayerDay(int i) {
        setMLayerDay(i);
        m122164d();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f82130h.mo111382a(canvas);
    }

    /* renamed from: a */
    public final void mo117206a(InstanceChipView instanceChipView) {
        OneInstanceViewData data = instanceChipView.getData();
        if (data != null) {
            Rect a = m122163a(data.mo117184k());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.width(), a.height());
            layoutParams.topMargin = a.top;
            layoutParams.leftMargin = a.left;
            instanceChipView.setLayoutParams(layoutParams);
            instanceChipView.setOnClickListener(new C32129a(layoutParams, data));
            addView(instanceChipView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/instance/widget/InstanceChipsLayer$addOneInstanceChip$1$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.widget.InstanceChipsLayer$a */
    public static final class C32129a extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ FrameLayout.LayoutParams f82132a;

        /* renamed from: b */
        final /* synthetic */ OneInstanceViewData f82133b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            GeneralHitPoint.f83331a.mo118720H(this.f82133b.mo117182i().resource_calendar_id);
            if (this.f82133b.mo117172a()) {
                Context context = view.getContext();
                String c = this.f82133b.mo117174c();
                String b = this.f82133b.mo117173b();
                long d = this.f82133b.mo117175d();
                Long l = this.f82133b.mo117182i().start_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "chipViewData.pbInstance.start_time");
                C31238b.m116875a(context, c, b, d, l.longValue());
                return;
            }
            C31238b.m116869a(view.getContext(), this.f82133b.mo117182i(), this.f82133b.mo117183j());
        }

        C32129a(FrameLayout.LayoutParams layoutParams, OneInstanceViewData cVar) {
            this.f82132a = layoutParams;
            this.f82133b = cVar;
        }
    }

    /* renamed from: a */
    private final Rect m122163a(InstanceLayout instanceLayout) {
        int i = this.f82128f - (this.f82126d * 2);
        float width = instanceLayout.getWidth();
        float height = instanceLayout.getHeight();
        float xOffset = instanceLayout.getXOffset();
        float yOffset = instanceLayout.getYOffset();
        float f = (float) i;
        int a = C69029a.m265653a((width / 100.0f) * f);
        int a2 = C69029a.m265653a((xOffset / 100.0f) * f) + this.f82126d;
        float f2 = (yOffset * 14.4f * this.f82124b) + ((float) this.f82125c);
        return new Rect(a2, C69029a.m265653a(f2), a + a2, C69029a.m265653a(f2 + (height * 14.4f * this.f82124b)));
    }

    /* renamed from: a */
    public final void mo117207a(List<OneInstanceViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "instanceData");
        if (list.isEmpty()) {
            mo113311c();
            return;
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC32130b(this, list));
    }

    /* renamed from: a */
    public final void mo117205a(int i, int i2) {
        this.f82128f = i;
        this.f82129g = i2;
        this.f82130h.mo111381a(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceChipsLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f82124b = ((float) UIHelper.dp2px(50.0f)) / 60.0f;
        this.f82125c = UIHelper.dp2px(7.0f);
        this.f82126d = UIHelper.dp2px(2.0f);
        this.f82127e = UIHelper.dp2px(1.0f);
        this.f82130h = new RedTimeLine(this);
        this.f82131i = -1;
        setWillNotDraw(false);
        setCurrentDay(new CalendarDate().getJulianDay());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstanceChipsLayer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
