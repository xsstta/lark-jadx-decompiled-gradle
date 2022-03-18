package com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.p1474a.C30745a;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.ArrayUtil;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00029:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000eJ\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J \u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000b0(j\b\u0012\u0004\u0012\u00020\u000b`)2\u0006\u0010*\u001a\u00020\u0012H\u0002J\u0018\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0018\u0010.\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u000101J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0012H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0012H\u0016J\u000e\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\bJ\b\u00108\u001a\u00020\u0019H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "mDaysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;)V", "mDayLayerListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager$IDayLayerListener;", "mDayLayers", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "mDragLayer", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/draglayer/ChipsDragLayer;", "mIsLayoutFinished", "", "mLastSelectDay", "", "mViewTimeZone", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "addDayLayers", "", "dayLayers", "([Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;)V", "addDragLayer", "dragLayer", "computeLayerIsInScreen", "dispatchCancelTouchEvent", "cancelEvent", "Landroid/view/MotionEvent;", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "findVisibleLayers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchorPos", "layoutChild", "offsetX", "offsetY", "reLayoutChild", "refreshTimeZone", "timeZoneId", "", "scrollDx", "dx", "scrollDy", "dy", "setDayLayerListener", "dayLayerListener", "updateDragLayerDate", "Companion", "IDayLayerListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.c */
public final class DayLayoutManager extends SnapScrollView.LayoutManager {

    /* renamed from: a */
    public static final Companion f77114a = new Companion(null);

    /* renamed from: b */
    private boolean f77115b;

    /* renamed from: c */
    private TimeZone f77116c = TimeZone.getDefault();

    /* renamed from: d */
    private IDayLayerListener f77117d;

    /* renamed from: e */
    private C30745a f77118e;

    /* renamed from: f */
    private DayChipsLayer[] f77119f;

    /* renamed from: g */
    private int f77120g;

    /* renamed from: h */
    private final SnapScrollView f77121h;

    /* renamed from: i */
    private final DaysLayoutParam f77122i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager$IDayLayerListener;", "", "onLayerNeedBindData", "", "layerDay", "", "onSelectDayChanged", "leftLayerDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.c$b */
    public interface IDayLayerListener {
        /* renamed from: a */
        void mo111085a(int i);

        /* renamed from: b */
        void mo111086b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/DayLayoutManager$Companion;", "", "()V", "SCROLL_X_DEVIATION", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public SnapScrollView mo111079a() {
        return this.f77121h;
    }

    /* renamed from: c */
    private final void m114425c() {
        int a = this.f77122i.mo110870a();
        int g = this.f77122i.mo110880g();
        DayChipsLayer[] dayChipsLayerArr = this.f77119f;
        if (dayChipsLayerArr != null) {
            for (DayChipsLayer dayChipsLayer : dayChipsLayerArr) {
                int i = g + 1;
                int right = dayChipsLayer.getRight();
                if (i <= right && a > right) {
                    dayChipsLayer.setInScreen(true);
                } else {
                    int left = dayChipsLayer.getLeft();
                    if (i <= left && a > left) {
                        dayChipsLayer.setInScreen(true);
                    } else {
                        dayChipsLayer.setInScreen(false);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final void m114426d() {
        ArrayList<DayChipsLayer> a = m114424a(this.f77122i.mo110880g());
        C30745a aVar = this.f77118e;
        if (aVar != null) {
            aVar.setChipsLayerList(a);
        }
        if (a.size() > 0) {
            int layerDay = a.get(0).getLayerDay();
            C30745a aVar2 = this.f77118e;
            if (aVar2 != null) {
                aVar2.setDate(layerDay);
            }
            if (layerDay != this.f77120g) {
                this.f77120g = layerDay;
                IDayLayerListener bVar = this.f77117d;
                if (bVar != null) {
                    bVar.mo111085a(layerDay);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111080a(IDayLayerListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dayLayerListener");
        this.f77117d = bVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111084b(MotionEvent motionEvent) {
        C30745a aVar;
        if (motionEvent != null && (aVar = this.f77118e) != null) {
            aVar.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo111081a(C30745a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dragLayer");
        this.f77118e = aVar;
        mo111079a().mo113223a(aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public void mo111067c(int i) {
        DayChipsLayer[] dayChipsLayerArr = this.f77119f;
        if (dayChipsLayerArr != null) {
            for (DayChipsLayer dayChipsLayer : dayChipsLayerArr) {
                dayChipsLayer.offsetTopAndBottom(i);
            }
        }
        C30745a aVar = this.f77118e;
        if (aVar != null) {
            aVar.offsetTopAndBottom(i);
        }
    }

    /* renamed from: a */
    private final ArrayList<DayChipsLayer> m114424a(int i) {
        int b = this.f77122i.mo110884k().mo110900b();
        ArrayList<DayChipsLayer> arrayList = new ArrayList<>();
        int i2 = 1;
        if (1 <= b) {
            while (true) {
                int i3 = Integer.MAX_VALUE;
                DayChipsLayer dayChipsLayer = null;
                DayChipsLayer[] dayChipsLayerArr = this.f77119f;
                if (dayChipsLayerArr != null) {
                    for (DayChipsLayer dayChipsLayer2 : dayChipsLayerArr) {
                        int abs = Math.abs(dayChipsLayer2.getLeft() - i);
                        if (abs < i3) {
                            dayChipsLayer = dayChipsLayer2;
                            i3 = abs;
                        }
                    }
                }
                if (dayChipsLayer != null) {
                    arrayList.add(dayChipsLayer);
                    i = dayChipsLayer.getRight();
                }
                if (i2 == b) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111063b(int i) {
        DayChipsLayer[] dayChipsLayerArr = this.f77119f;
        if (dayChipsLayerArr != null) {
            int a = this.f77122i.mo110870a();
            int c = this.f77122i.mo110876c();
            int g = this.f77122i.mo110880g();
            DaysLayoutParam.LayersInfo k = this.f77122i.mo110884k();
            int c2 = k.mo110901c();
            int a2 = k.mo110899a();
            boolean z = false;
            boolean z2 = false;
            for (DayChipsLayer dayChipsLayer : dayChipsLayerArr) {
                if (i > 0) {
                    if (dayChipsLayer.getLeft() + i + 0 >= a + (c * c2)) {
                        int layerDay = dayChipsLayer.getLayerDay() - a2;
                        dayChipsLayer.setLayerDay(layerDay);
                        dayChipsLayer.mo111311d();
                        dayChipsLayer.offsetLeftAndRight(i - (c * a2));
                        IDayLayerListener bVar = this.f77117d;
                        if (bVar != null) {
                            bVar.mo111086b(layerDay);
                        }
                        z = true;
                        z2 = false;
                    }
                } else if ((dayChipsLayer.getRight() + i) - 0 <= g - (c2 * c)) {
                    int layerDay2 = dayChipsLayer.getLayerDay() + a2;
                    dayChipsLayer.setLayerDay(layerDay2);
                    dayChipsLayer.mo111311d();
                    dayChipsLayer.offsetLeftAndRight((c * a2) + i);
                    IDayLayerListener bVar2 = this.f77117d;
                    if (bVar2 != null) {
                        bVar2.mo111086b(layerDay2);
                    }
                    z = true;
                    z2 = true;
                }
                dayChipsLayer.offsetLeftAndRight(i);
            }
            if (z) {
                ArrayUtil.f77180a.mo111131a(this.f77119f, z2);
            }
            m114426d();
            m114425c();
            C30745a aVar = this.f77118e;
            if (aVar != null) {
                aVar.mo111148a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo111082a(String str) {
        String str2;
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeZoneId is null = ");
            if (str != null) {
                z = false;
            }
            sb.append(z);
            Log.m165389i("DayLayoutManager", C32673y.m125378d(sb.toString()));
            return;
        }
        TimeZone timeZone = this.f77116c;
        if (timeZone != null) {
            str2 = timeZone.getID();
        } else {
            str2 = null;
        }
        if (!Intrinsics.areEqual(str2, str)) {
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            if (timeZone2 != null) {
                this.f77116c = timeZone2;
            }
            mo111053a(mo111079a().getCoordinateApi().mo113242a(), mo111079a().getCoordinateApi().mo113243b());
        }
    }

    /* renamed from: a */
    public final void mo111083a(DayChipsLayer[] dayChipsLayerArr) {
        Intrinsics.checkParameterIsNotNull(dayChipsLayerArr, "dayLayers");
        int length = dayChipsLayerArr.length;
        DayChipsLayer[] dayChipsLayerArr2 = new DayChipsLayer[length];
        for (int i = 0; i < length; i++) {
            dayChipsLayerArr2[i] = dayChipsLayerArr[i];
        }
        this.f77119f = dayChipsLayerArr2;
        for (DayChipsLayer dayChipsLayer : dayChipsLayerArr) {
            mo111079a().mo113223a(dayChipsLayer);
        }
    }

    public DayLayoutManager(SnapScrollView snapScrollView, DaysLayoutParam daysLayoutParam) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(daysLayoutParam, "mDaysLayoutParam");
        this.f77121h = snapScrollView;
        this.f77122i = daysLayoutParam;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111053a(int i, int i2) {
        DayChipsLayer[] dayChipsLayerArr;
        Log.m165389i("DayLayoutManager", C32673y.m125378d("reLayoutChild = " + this.f77115b));
        if (this.f77115b && (dayChipsLayerArr = this.f77119f) != null) {
            for (DayChipsLayer dayChipsLayer : dayChipsLayerArr) {
                dayChipsLayer.mo111309b();
            }
            mo111064b(i, i2);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect p = this.f77122i.mo110889p();
        if (p != null) {
            int save = canvas.save();
            canvas.clipRect(p);
            DayChipsLayer[] dayChipsLayerArr = this.f77119f;
            if (dayChipsLayerArr != null) {
                for (DayChipsLayer dayChipsLayer : dayChipsLayerArr) {
                    mo111079a().mo113225a(canvas, dayChipsLayer, j);
                }
            }
            mo111079a().mo113225a(canvas, this.f77118e, j);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        int i3;
        int i4;
        int c = this.f77122i.mo110876c();
        int a = this.f77122i.mo110870a();
        int h = this.f77122i.mo110881h();
        int g = this.f77122i.mo110880g();
        int e = this.f77122i.mo110878e();
        int c2 = this.f77122i.mo110884k().mo110901c();
        if (c > 0) {
            int i5 = (-i) / c;
            int i6 = i % c;
            if (i > 0 && i6 != 0) {
                i5--;
            }
            if (i6 < 0) {
                i6 += c;
            }
            if (i6 > 0) {
                i3 = i6 - (c2 * c);
            } else {
                i3 = c - (c2 * c);
            }
            int i7 = i3 + g;
            int i8 = (i7 - c) + 0;
            int julianDay = (new CalendarDate(this.f77116c).getJulianDay() - c2) + i5;
            DayChipsLayer[] dayChipsLayerArr = this.f77119f;
            if (dayChipsLayerArr != null) {
                int length = dayChipsLayerArr.length;
                int i9 = 0;
                while (i9 < length) {
                    DayChipsLayer dayChipsLayer = dayChipsLayerArr[i9];
                    if (dayChipsLayer.mo111310c()) {
                        dayChipsLayer.setLayerDay(julianDay + i9);
                        int i10 = i9 * c;
                        i4 = c;
                        dayChipsLayer.layout(i8 + i10, e + i2, i10 + i7, h + e + i2);
                        if (i9 == dayChipsLayerArr.length - 1) {
                            m114426d();
                            this.f77115b = true;
                        }
                    } else {
                        i4 = c;
                        dayChipsLayer.layout(dayChipsLayer.getLeft(), e + i2, dayChipsLayer.getRight(), dayChipsLayer.getBottom());
                    }
                    i9++;
                    c = i4;
                }
                DayChipsLayer[] dayChipsLayerArr2 = this.f77119f;
                if (dayChipsLayerArr2 != null) {
                    for (DayChipsLayer dayChipsLayer2 : dayChipsLayerArr2) {
                        new CalendarDate().setJulianDay(dayChipsLayer2.getLayerDay());
                    }
                }
                C30745a aVar = this.f77118e;
                if (aVar != null) {
                    aVar.layout(g, e + i2, a, h + e + i2);
                }
                m114425c();
                m114426d();
            }
        }
    }
}
