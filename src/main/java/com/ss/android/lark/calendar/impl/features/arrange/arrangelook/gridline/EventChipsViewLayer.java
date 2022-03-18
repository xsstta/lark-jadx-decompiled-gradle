package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.DragTargetOptionBuilder;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.am;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EventChipsViewLayer extends FrameLayout {

    /* renamed from: a */
    public CalendarDaysContract.AbstractC30658d f75218a;

    /* renamed from: b */
    private final String f75219b = "EventChipsViewLayer";

    /* renamed from: c */
    private final int f75220c = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: d */
    private C26213k f75221d;

    /* renamed from: e */
    private CalendarDate f75222e;

    /* renamed from: f */
    private int f75223f;

    /* renamed from: g */
    private C30166b f75224g;

    /* renamed from: h */
    private View f75225h;

    /* renamed from: i */
    private C30167c f75226i;

    /* renamed from: j */
    private SparseArray<List<DayEventChipViewData>> f75227j;

    /* renamed from: k */
    private ArrayList<ArrayList<DayEventChipViewData>> f75228k;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m111747b() {
        this.f75224g.mo108792a(10);
    }

    /* renamed from: a */
    public void mo108736a() {
        Log.m165389i("EventChipsViewLayer", C32673y.m125378d("reset getChildCount = " + getChildCount()));
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            C26213k kVar = this.f75221d;
            if (kVar != null) {
                kVar.mo93237b(childAt);
            }
            if (this.f75225h != childAt) {
                removeView(childAt);
                this.f75224g.mo108793a(i, (EventChipView) childAt);
            }
        }
        removeAllViews();
    }

    public void setDate(CalendarDate calendarDate) {
        this.f75222e = calendarDate;
    }

    public void setDragger(C26213k kVar) {
        this.f75221d = kVar;
    }

    public void setNumDays(int i) {
        this.f75223f = i;
    }

    public void setViewDependency(CalendarDaysContract.AbstractC30658d dVar) {
        this.f75218a = dVar;
    }

    public EventChipsViewLayer(Context context) {
        super(context);
        m111746a(context);
    }

    /* renamed from: a */
    public void mo108738a(SparseArray<List<DayEventChipViewData>> sparseArray) {
        mo108736a();
        if (sparseArray != null) {
            m111748b(sparseArray);
        }
    }

    /* renamed from: a */
    private void m111746a(final Context context) {
        this.f75224g = new C30166b(new AbstractC30173d.AbstractC30174a<EventChipView>() {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer.C301621 */

            @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.AbstractC30173d.AbstractC30174a
            /* renamed from: b */
            public int mo108749b() {
                return 100;
            }

            /* renamed from: a */
            public EventChipView mo108750c() {
                EventChipView eventChipView = new EventChipView(context, 0);
                eventChipView.setBottomPadding(1.0f);
                return eventChipView;
            }
        });
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.$$Lambda$EventChipsViewLayer$dh7wZSk0n5ndP_HCa8q8UTHzPZI */

            public final void run() {
                EventChipsViewLayer.this.m111747b();
            }
        });
    }

    /* renamed from: b */
    private void m111748b(SparseArray<List<DayEventChipViewData>> sparseArray) {
        if (this.f75226i == null) {
            this.f75227j = sparseArray;
            return;
        }
        this.f75227j = null;
        m111745a(this.f75222e.getJulianDay(), sparseArray);
    }

    public void setEventChipsGridLine(C30167c cVar) {
        this.f75226i = cVar;
        SparseArray<List<DayEventChipViewData>> sparseArray = this.f75227j;
        if (sparseArray != null) {
            mo108738a(sparseArray);
        }
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.$$Lambda$zWpSezLbBB82jbSVV3d5PQ1Dz_M */

            public final void run() {
                EventChipsViewLayer.this.requestLayout();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer$a */
    public class View$OnLongClickListenerC30164a implements View.OnLongClickListener {

        /* renamed from: b */
        private int f75234b;

        public boolean onLongClick(View view) {
            if (EventChipsViewLayer.this.f75218a != null) {
                am.m125208a(view.getContext(), 80);
                int i = this.f75234b;
                int i2 = R.string.Calendar_Edit_PermissonErrorTip;
                if (i != 1 && i == 2) {
                    i2 = R.string.Calendar_Edit_DragCrossDayEventTip;
                }
                LKUIToast.show(EventChipsViewLayer.this.getContext(), i2);
            }
            return true;
        }

        public View$OnLongClickListenerC30164a(int i) {
            this.f75234b = i;
        }
    }

    /* renamed from: a */
    public void mo108739a(View view) {
        this.f75225h = view;
        C30166b bVar = this.f75224g;
        if (bVar != null && (view instanceof EventChipView)) {
            bVar.mo108794a((EventChipView) view);
        }
    }

    /* renamed from: b */
    public void mo108742b(ArrayList<ArrayList<DayEventChipViewData>> arrayList) {
        mo108736a();
        if (!(CollectionUtils.isEmpty(arrayList) || this.f75226i == null)) {
            this.f75228k = arrayList;
            for (int i = 0; i < arrayList.size(); i++) {
                ArrayList<DayEventChipViewData> arrayList2 = arrayList.get(i);
                if (CollectionUtils.isNotEmpty(arrayList2)) {
                    for (DayEventChipViewData dayEventChipViewData : arrayList2) {
                        EventChipView chipView = dayEventChipViewData.getChipView();
                        if (chipView != null && chipView.getParent() == null) {
                            InstanceLayout layout = dayEventChipViewData.getLayout();
                            Rect a = this.f75226i.mo108772a(layout.getWidth(), layout.getHeight(), layout.getXOffset(), layout.getYOffset(), i);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.width(), a.height());
                            layoutParams.topMargin = a.top;
                            layoutParams.leftMargin = a.left;
                            chipView.setLayoutParams(layoutParams);
                            if (chipView.getParent() != null) {
                                ((ViewGroup) chipView.getParent()).removeView(chipView);
                            }
                            addView(chipView);
                            chipView.mo112558a(dayEventChipViewData);
                            chipView.setEnabled(false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo108737a(int i) {
        if (!CollectionUtils.isEmpty(this.f75228k) && i > 0 && i < this.f75228k.size()) {
            ArrayList<DayEventChipViewData> arrayList = this.f75228k.get(i);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ArrayList<DayEventChipViewData> arrayList2 = this.f75228k.get(i2);
                if (CollectionUtils.isNotEmpty(arrayList2)) {
                    for (DayEventChipViewData dayEventChipViewData : arrayList2) {
                        EventChipView chipView = dayEventChipViewData.getChipView();
                        if (chipView != null) {
                            InstanceLayout layout = dayEventChipViewData.getLayout();
                            Rect a = this.f75226i.mo108772a(layout.getWidth(), layout.getHeight(), layout.getXOffset(), layout.getYOffset(), i2 + 1);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) chipView.getLayoutParams();
                            layoutParams.leftMargin = a.left;
                            chipView.setLayoutParams(layoutParams);
                        }
                    }
                }
                Collections.swap(this.f75228k, i2, i2 + 1);
            }
            if (CollectionUtils.isNotEmpty(arrayList)) {
                for (DayEventChipViewData dayEventChipViewData2 : arrayList) {
                    EventChipView chipView2 = dayEventChipViewData2.getChipView();
                    if (chipView2 != null) {
                        InstanceLayout layout2 = dayEventChipViewData2.getLayout();
                        ao.m125224a((View) chipView2, this.f75226i.mo108772a(layout2.getWidth(), layout2.getHeight(), layout2.getXOffset(), layout2.getYOffset(), 0).left, 200L);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo108741a(ArrayList<ArrayList<DayEventChipViewData>> arrayList) {
        if (!CollectionUtils.isEmpty(arrayList)) {
            Iterator<ArrayList<DayEventChipViewData>> it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList<DayEventChipViewData> next = it.next();
                if (CollectionUtils.isNotEmpty(next)) {
                    for (DayEventChipViewData dayEventChipViewData : next) {
                        dayEventChipViewData.setChipView((EventChipView) this.f75224g.mo108795b(0));
                    }
                }
            }
        }
    }

    public EventChipsViewLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m111746a(context);
    }

    /* renamed from: a */
    private void m111745a(int i, SparseArray<List<DayEventChipViewData>> sparseArray) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < this.f75223f + i; i5++) {
            List<DayEventChipViewData> list = sparseArray.get(i5);
            if (CollectionUtils.isNotEmpty(list)) {
                i4 += list.size();
                for (final DayEventChipViewData dayEventChipViewData : list) {
                    EventChipView chipView = dayEventChipViewData.getChipView();
                    if (chipView != null) {
                        InstanceLayout layout = dayEventChipViewData.getLayout();
                        Rect a = this.f75226i.mo108772a(layout.getWidth(), layout.getHeight(), layout.getXOffset(), layout.getYOffset(), i5 - i);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a.width(), a.height());
                        layoutParams.topMargin = a.top;
                        layoutParams.leftMargin = a.left;
                        chipView.setLayoutParams(layoutParams);
                        if (chipView.getParent() != null) {
                            ((ViewGroup) chipView.getParent()).removeView(chipView);
                        }
                        addView(chipView);
                        i3++;
                        chipView.mo112558a(dayEventChipViewData);
                        chipView.setOnClickListener(new AbstractView$OnClickListenerC32626b() {
                            /* class com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.EventChipsViewLayer.C301632 */

                            @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
                            /* renamed from: a */
                            public void mo108751a(View view) {
                                EventChipsViewLayer.this.mo108740a(view, dayEventChipViewData);
                            }
                        });
                        chipView.setOnLongClickListener(null);
                        if (dayEventChipViewData.isSupportDrag()) {
                            this.f75221d.mo93231a(chipView, DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.LONG_PRESS_NO_DRAG_EXIT_HINT));
                        } else {
                            if (dayEventChipViewData.isCrossDay()) {
                                i2 = 2;
                            } else {
                                i2 = 1;
                            }
                            chipView.setOnLongClickListener(new View$OnLongClickListenerC30164a(i2));
                        }
                    }
                }
            }
        }
        Log.m165389i("EventChipsViewLayer", C32673y.m125378d("drawViewCount=" + i3 + ", eventDataCount=" + i4));
    }

    /* renamed from: a */
    public void mo108740a(View view, DayEventChipViewData dayEventChipViewData) {
        int i = this.f75223f;
        if (i == 1) {
            Log.m165389i("EventChipsViewLayer", C32673y.m125369a("oneDetail"));
        } else if (i == 3) {
            Log.m165389i("EventChipsViewLayer", C32673y.m125369a("threeDetail"));
        }
        this.f75218a.mo108517a((EventChipViewData) dayEventChipViewData, true);
        CalendarHitPoint.m124124b();
    }
}
