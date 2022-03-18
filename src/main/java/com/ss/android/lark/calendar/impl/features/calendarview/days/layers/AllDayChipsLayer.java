package com.ss.android.lark.calendar.impl.features.calendarview.days.layers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30166b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.AllDayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.AllDayColumnData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.AllDayColDataConverter;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 S2\u00020\u0001:\u0003QRSB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0015H\u0002J \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020%H\u0002J\u0016\u00100\u001a\u00020,2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u00102\u001a\u00020,2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u00103\u001a\u00020,H\u0002J\u000e\u00104\u001a\u00020,2\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020,J\u0006\u00108\u001a\u00020,J\u000e\u00109\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007J\u000e\u0010:\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0007J\u0006\u0010;\u001a\u00020%J\u0012\u0010<\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020,2\b\u0010@\u001a\u0004\u0018\u00010\u0019J\u000e\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\u001bJ\u000e\u0010C\u001a\u00020,2\u0006\u0010B\u001a\u00020\u001dJ\u000e\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020%J\u0016\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0007J\u001e\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0007J\u0016\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007J\u0006\u0010P\u001a\u00020,R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u000e¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "layerEndDay", "getLayerEndDay", "()I", "setLayerEndDay", "(I)V", "layerStartDay", "getLayerStartDay", "setLayerStartDay", "mAllDayOffsetY", "mAllDayShowHeight", "mChipDataList", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "mChipGap", "mChipHeight", "mChipPool", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipViewPool;", "mClickChipListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$ClickChipListener;", "mClickShowListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$ClickShowMoreListener;", "mColumnChipData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayColumnData;", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayColumnData;", "mColumnNumber", "mDayWith", "mIsAddedChipView", "", "mIsExpandStatus", "mMarginLeft", "mParentWidth", "addChipView", "viewData", "addShowMoreHint", "", "col", "count", "isShow", "asyncLoadView", "chipDataList", "batchAddView", "batchAddViewActual", "bindData", "allDayChipData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayChipData;", "clearLayerDay", "clearView", "getIndexHeight", "isHideChips", "isNotLayerDay", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setChipViewPool", "chipPool", "setClickChipListener", "clickListener", "setClickShowMoreListener", "setExpandStatus", "isExpand", "setLayerDay", "startDay", "endDay", "setLayoutParams", "dayWith", "marginLeft", "parentWidth", "updateChipVisibility", "allDayShowHeight", "allDayOffsetY", "updateOnScroll", "ClickChipListener", "ClickShowMoreListener", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AllDayChipsLayer extends FrameLayout {

    /* renamed from: d */
    public static final Companion f77284d = new Companion(null);

    /* renamed from: a */
    public ClickShowMoreListener f77285a;

    /* renamed from: b */
    public ClickChipListener f77286b;

    /* renamed from: c */
    public boolean f77287c;

    /* renamed from: e */
    private volatile int f77288e;

    /* renamed from: f */
    private volatile int f77289f;

    /* renamed from: g */
    private final int f77290g;

    /* renamed from: h */
    private final int f77291h;

    /* renamed from: i */
    private int f77292i;

    /* renamed from: j */
    private int f77293j;

    /* renamed from: k */
    private int f77294k;

    /* renamed from: l */
    private int f77295l;

    /* renamed from: m */
    private List<? extends AllDayEventChipViewData> f77296m;

    /* renamed from: n */
    private AllDayColumnData[] f77297n;

    /* renamed from: o */
    private boolean f77298o;

    /* renamed from: p */
    private C30166b f77299p;

    /* renamed from: q */
    private int f77300q;

    /* renamed from: r */
    private int f77301r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$ClickChipListener;", "", "onEventChipClick", "", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer$a */
    public interface ClickChipListener {
        /* renamed from: a */
        void mo111110a(AllDayEventChipViewData allDayEventChipViewData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$ClickShowMoreListener;", "", "onShowMoreClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer$b */
    public interface ClickShowMoreListener {
        /* renamed from: a */
        void mo111071a();
    }

    public AllDayChipsLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AllDayChipsLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$Companion;", "", "()V", "GAP_EVENT_CHIP", "", "HEIGHT_EVENT_CHIP", "HINT_TAG", "", "MAX_EVENT_COUNT_CONTRACT", "", "PADDING_TOP_BOTTOM", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getLayerEndDay() {
        return this.f77289f;
    }

    public final int getLayerStartDay() {
        return this.f77288e;
    }

    /* renamed from: b */
    public final void mo111285b() {
        this.f77288e = -1;
        this.f77289f = -1;
        this.f77292i = 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer$f */
    public static final class RunnableC30778f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AllDayChipsLayer f77305a;

        /* renamed from: b */
        final /* synthetic */ List f77306b;

        /* renamed from: c */
        final /* synthetic */ AllDayChipData f77307c;

        RunnableC30778f(AllDayChipsLayer allDayChipsLayer, List list, AllDayChipData aVar) {
            this.f77305a = allDayChipsLayer;
            this.f77306b = list;
            this.f77307c = aVar;
        }

        public final void run() {
            this.f77305a.mo111284a(this.f77306b);
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer.RunnableC30778f.RunnableC307791 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30778f f77308a;

                {
                    this.f77308a = r1;
                }

                public final void run() {
                    if (!this.f77308a.f77307c.mo110931a() || !this.f77308a.f77305a.f77287c) {
                        this.f77308a.f77305a.f77287c = true;
                        this.f77308a.f77305a.mo111287b(this.f77308a.f77306b);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final boolean mo111289c() {
        if (this.f77288e == -1 || this.f77289f == -1 || this.f77292i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m114764e() {
        List<AllDayEventChipViewData> list;
        int i = this.f77292i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AllDayColumnData[] bVarArr = this.f77297n;
            if (bVarArr != null && i3 < bVarArr.length) {
                AllDayColumnData bVar = bVarArr[i3];
                if (this.f77298o) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(bVar.mo110945e());
                    arrayList.addAll(bVar.mo110946f());
                    bVar.mo110939a(true);
                    list = CollectionsKt.toList(arrayList);
                } else {
                    list = CollectionsKt.toList(bVar.mo110945e());
                }
                for (AllDayEventChipViewData allDayEventChipViewData : list) {
                    if (m114763a(allDayEventChipViewData)) {
                        i2++;
                    }
                }
                int d = bVar.mo110944d();
                if (d > 0) {
                    m114762a(i3, d, !this.f77298o);
                }
            } else {
                return;
            }
        }
        Log.m165389i("AllDaysChipLayer", C32673y.m125378d("logAddChipCount = " + i2 + ", mIsExpandStatus = " + this.f77298o));
    }

    /* renamed from: d */
    public final void mo111290d() {
        List<? extends AllDayEventChipViewData> list = this.f77296m;
        if (list != null) {
            int left = getLeft() + 1;
            int right = getRight() - 1;
            int i = this.f77295l;
            if (left <= i && right >= i) {
                for (AllDayEventChipViewData allDayEventChipViewData : list) {
                    EventChipView chipView = allDayEventChipViewData.getChipView();
                    if (chipView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(chipView, "viewData.chipView ?: continue");
                        int span = (this.f77293j * allDayEventChipViewData.getSpan()) - this.f77291h;
                        int col = allDayEventChipViewData.getCol() * this.f77293j;
                        ViewGroup.LayoutParams layoutParams = chipView.getLayoutParams();
                        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                            layoutParams = null;
                        }
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.leftMargin = col;
                            layoutParams2.width = span;
                            chipView.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
            int left2 = getLeft();
            int right2 = getRight();
            int i2 = this.f77294k;
            if (left2 <= i2 && right2 >= i2) {
                for (AllDayEventChipViewData allDayEventChipViewData2 : list) {
                    EventChipView chipView2 = allDayEventChipViewData2.getChipView();
                    if (chipView2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(chipView2, "viewData.chipView ?: continue");
                        ViewGroup.LayoutParams layoutParams3 = chipView2.getLayoutParams();
                        if (!(layoutParams3 instanceof FrameLayout.LayoutParams)) {
                            layoutParams3 = null;
                        }
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        if (layoutParams4 != null) {
                            int left3 = this.f77294k - getLeft();
                            int span2 = (this.f77293j * allDayEventChipViewData2.getSpan()) - this.f77291h;
                            int col2 = allDayEventChipViewData2.getCol();
                            int i3 = this.f77293j;
                            int i4 = col2 * i3;
                            int i5 = i4 + span2;
                            int i6 = i5 - 1;
                            if (i4 + 1 <= left3 && i6 >= left3) {
                                int max = Math.max(i5 - left3, i3);
                                layoutParams4.width = max;
                                layoutParams4.leftMargin = i5 - max;
                            }
                            if (left3 < i4) {
                                layoutParams4.leftMargin = i4;
                                layoutParams4.width = span2;
                            }
                            chipView2.setLayoutParams(layoutParams4);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111280a() {
        this.f77296m = null;
        this.f77297n = null;
        Log.m165389i("AllDaysChipLayer", C32673y.m125378d("clearView " + this.f77288e + ' ' + this.f77289f));
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof EventChipView) {
                removeView(childAt);
                C30166b bVar = this.f77299p;
                if (bVar != null) {
                    bVar.mo108793a(0, childAt);
                }
            }
        }
        removeAllViews();
    }

    public final void setChipViewPool(C30166b bVar) {
        this.f77299p = bVar;
    }

    public final void setLayerEndDay(int i) {
        this.f77289f = i;
    }

    public final void setLayerStartDay(int i) {
        this.f77288e = i;
    }

    public final void setClickChipListener(ClickChipListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f77286b = aVar;
    }

    public final void setClickShowMoreListener(ClickShowMoreListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "clickListener");
        this.f77285a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer$d */
    public static final class View$OnClickListenerC30776d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AllDayChipsLayer f77302a;

        /* renamed from: b */
        final /* synthetic */ AllDayEventChipViewData f77303b;

        View$OnClickListenerC30776d(AllDayChipsLayer allDayChipsLayer, AllDayEventChipViewData allDayEventChipViewData) {
            this.f77302a = allDayChipsLayer;
            this.f77303b = allDayEventChipViewData;
        }

        public final void onClick(View view) {
            ClickChipListener aVar = this.f77302a.f77286b;
            if (aVar != null) {
                aVar.mo111110a(this.f77303b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer$e */
    public static final class View$OnClickListenerC30777e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AllDayChipsLayer f77304a;

        View$OnClickListenerC30777e(AllDayChipsLayer allDayChipsLayer) {
            this.f77304a = allDayChipsLayer;
        }

        public final void onClick(View view) {
            this.f77304a.setExpandStatus(true);
            ClickShowMoreListener bVar = this.f77304a.f77285a;
            if (bVar != null) {
                bVar.mo111071a();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo111288b(int i) {
        AllDayColumnData[] bVarArr = this.f77297n;
        if (bVarArr == null || i < 0 || i >= bVarArr.length || bVarArr[i].mo110944d() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo111279a(int i) {
        int i2;
        int i3;
        AllDayColumnData[] bVarArr = this.f77297n;
        if (bVarArr == null || i < 0 || i >= bVarArr.length) {
            return 0;
        }
        if (this.f77298o) {
            i2 = bVarArr[i].mo110940b();
            i3 = this.f77290g;
        } else {
            i2 = bVarArr[i].mo110937a();
            i3 = this.f77290g;
        }
        return i2 * i3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getY() < ((float) this.f77300q)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m114763a(AllDayEventChipViewData allDayEventChipViewData) {
        EventChipView chipView = allDayEventChipViewData.getChipView();
        if (chipView == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(chipView, "viewData.chipView ?: return false");
        if (this.f77293j <= 0) {
            return false;
        }
        ViewParent parent = chipView.getParent();
        if (parent instanceof ViewGroup) {
            Log.m165383e("AllDaysChipLayer", C32673y.m125378d("chip view has parent"));
            ((ViewGroup) parent).removeView(chipView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((this.f77293j * allDayEventChipViewData.getSpan()) - this.f77291h, this.f77290g);
        layoutParams.leftMargin = allDayEventChipViewData.getCol() * this.f77293j;
        layoutParams.topMargin = (allDayEventChipViewData.getRow() * this.f77290g) + 4;
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        chipView.setLayoutParams(layoutParams2);
        chipView.mo112558a(allDayEventChipViewData);
        chipView.setPadding(0, 0, 0, this.f77291h);
        chipView.setBottomPaddingPx(this.f77291h);
        addView(chipView, layoutParams2);
        chipView.setVisibility(0);
        chipView.setOnClickListener(new View$OnClickListenerC30776d(this, allDayEventChipViewData));
        return true;
    }

    /* renamed from: b */
    public final void mo111287b(List<? extends AllDayEventChipViewData> list) {
        if (list.isEmpty()) {
            mo111280a();
        } else if (this.f77293j == 0) {
            Log.m165383e("AllDaysChipLayer", C32673y.m125378d("not batchAddView mDayWith = " + this.f77293j));
        } else {
            mo111280a();
            this.f77296m = list;
            this.f77297n = AllDayColDataConverter.f77364a.mo111338a(this.f77292i, list);
            m114764e();
            mo111290d();
            mo111286b(this.f77300q, this.f77301r);
        }
    }

    public final void setExpandStatus(boolean z) {
        int i;
        Log.m165389i("AllDaysChipLayer", C32673y.m125378d("setExpandStatus isExpand = " + z + ", mIsExpandStatus = " + this.f77298o));
        if (this.f77298o != z) {
            this.f77298o = z;
            int i2 = 8;
            int i3 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            AllDayColumnData[] bVarArr = this.f77297n;
            if (bVarArr != null) {
                for (AllDayColumnData bVar : bVarArr) {
                    if (bVar.mo110943c()) {
                        Iterator<T> it = bVar.mo110946f().iterator();
                        while (it.hasNext()) {
                            EventChipView chipView = it.next().getChipView();
                            if (chipView != null) {
                                chipView.setVisibility(i);
                            }
                        }
                    } else if (z) {
                        Iterator<T> it2 = bVar.mo110946f().iterator();
                        while (it2.hasNext()) {
                            m114763a((AllDayEventChipViewData) it2.next());
                        }
                        bVar.mo110939a(true);
                    }
                }
                if (!z) {
                    i2 = 0;
                }
                int childCount = getChildCount();
                if (childCount >= 0) {
                    while (true) {
                        View childAt = getChildAt(i3);
                        if (childAt instanceof TextView) {
                            TextView textView = (TextView) childAt;
                            if (Intrinsics.areEqual(textView.getTag(), "hint_tag")) {
                                textView.setVisibility(i2);
                            }
                        }
                        if (i3 != childCount) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111283a(AllDayChipData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "allDayChipData");
        Log.m165389i("AllDaysChipLayer", C32673y.m125378d("layer = " + this.f77288e + ", " + this.f77289f + "; allDayChipData = " + aVar));
        List<AllDayEventChipViewData> b = aVar.mo110933b();
        if (b != null) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(new RunnableC30778f(this, b, aVar));
        }
    }

    /* renamed from: a */
    public final void mo111284a(List<? extends AllDayEventChipViewData> list) {
        EventChipView eventChipView;
        if (!list.isEmpty()) {
            for (AllDayEventChipViewData allDayEventChipViewData : list) {
                C30166b bVar = this.f77299p;
                if (bVar != null) {
                    eventChipView = (EventChipView) bVar.mo108795b(0);
                } else {
                    eventChipView = null;
                }
                allDayEventChipViewData.setChipView(eventChipView);
            }
            Log.m165389i("AllDaysChipLayer", C32673y.m125378d("asyncLoadView size = " + list.size()));
        }
    }

    /* renamed from: a */
    public final void mo111281a(int i, int i2) {
        this.f77288e = i;
        this.f77289f = i2;
        this.f77292i = (i2 - i) + 1;
    }

    /* renamed from: b */
    public final void mo111286b(int i, int i2) {
        this.f77300q = i;
        this.f77301r = i2;
        if (this.f77290g != 0 && this.f77298o) {
            int i3 = i - i2;
            List<? extends AllDayEventChipViewData> list = this.f77296m;
            if (list != null) {
                for (T t : list) {
                    if ((t.getRow() * this.f77290g) + 4 >= i3) {
                        EventChipView chipView = t.getChipView();
                        if (chipView != null) {
                            chipView.setVisibility(8);
                        }
                    } else {
                        EventChipView chipView2 = t.getChipView();
                        if (chipView2 != null) {
                            chipView2.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111282a(int i, int i2, int i3) {
        this.f77293j = i;
        this.f77295l = i3;
        this.f77294k = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllDayChipsLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77288e = -1;
        this.f77289f = -1;
        this.f77290g = UIUtils.dp2px(context, 25.0f);
        this.f77291h = UIUtils.dp2px(context, 2.0f);
        this.f77292i = 7;
        setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
    }

    /* renamed from: a */
    private final void m114762a(int i, int i2, boolean z) {
        int i3 = this.f77293j;
        if (i3 > 0) {
            TextView textView = new TextView(getContext());
            textView.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Plural_EventLeft, "count", String.valueOf(i2)));
            textView.setTextColor(UIUtils.getColor(getContext(), R.color.lkui_N500));
            textView.setTextSize(12.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f77293j - this.f77291h, this.f77290g);
            layoutParams.leftMargin = i * i3;
            layoutParams.topMargin = this.f77290g * 2;
            textView.setGravity(16);
            int i4 = 0;
            textView.setPadding(UIUtils.dp2px(getContext(), (float) this.f77291h), 0, 0, 0);
            textView.setLayoutParams(layoutParams);
            textView.setOnClickListener(new View$OnClickListenerC30777e(this));
            textView.setTag("hint_tag");
            if (!z) {
                i4 = 8;
            }
            textView.setVisibility(i4);
            addView(textView);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AllDayChipsLayer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
