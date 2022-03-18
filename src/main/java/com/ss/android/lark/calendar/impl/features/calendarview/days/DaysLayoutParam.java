package com.ss.android.lark.calendar.impl.features.calendarview.days;

import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u000389:B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\b\u0010\"\u001a\u0004\u0018\u00010\u001fJ\b\u0010#\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010$\u001a\u00020\u0003J\b\u0010%\u001a\u0004\u0018\u00010\u0018J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020*J\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030,J\b\u0010-\u001a\u0004\u0018\u00010\u001fJ\b\u0010.\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010/\u001a\u00020\u0003J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003J\u000e\u00104\u001a\u0002012\u0006\u0010 \u001a\u00020\u0003J\u000e\u00105\u001a\u0002012\u0006\u00106\u001a\u000207R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u000e\u0010\u0015\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "", "mNumDays", "", "(I)V", "allDayLayerInfo", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$AllDayLayersInfo;", "getAllDayLayerInfo", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$AllDayLayersInfo;", "dateHeaderHeight", "dayHeight", "getDayHeight", "()I", "dayLayerInfo", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$LayersInfo;", "getDayLayerInfo", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$LayersInfo;", "headerLayerInfo", "getHeaderLayerInfo", "hourTextWidth", "getHourTextWidth", "mAllDayHeight", "mDayWidth", "mGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "mHeight", "mWidth", "oneHourHeight", "timeLayerHeight", "timeLayerMarginTop", "getAllDayChipShowRect", "Landroid/graphics/Rect;", "allDayHeight", "getDateHeaderHeight", "getDateHeaderShowRect", "getDayChipShowRect", "getDayWidth", "getGridLine", "getHeaderType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$HeaderType;", "getHeight", "getOneMinuteHeight", "", "getScrollMinMaxOffsetY", "Lkotlin/Pair;", "getTimeLineShowRect", "getTimeZoneShowRect", "getWidth", "update", "", "width", "height", "updateAllDayHeight", "updateViewPageHeadHeight", "isShowLunar", "", "AllDayLayersInfo", "HeaderType", "LayersInfo", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DaysLayoutParam {

    /* renamed from: a */
    private int f76955a;

    /* renamed from: b */
    private int f76956b;

    /* renamed from: c */
    private int f76957c;

    /* renamed from: d */
    private int f76958d;

    /* renamed from: e */
    private int f76959e;

    /* renamed from: f */
    private C30167c f76960f;

    /* renamed from: g */
    private final int f76961g;

    /* renamed from: h */
    private final int f76962h;

    /* renamed from: i */
    private final int f76963i;

    /* renamed from: j */
    private final int f76964j = UIHelper.dp2px(56.0f);

    /* renamed from: k */
    private final int f76965k;

    /* renamed from: l */
    private final LayersInfo f76966l;

    /* renamed from: m */
    private final AllDayLayersInfo f76967m;

    /* renamed from: n */
    private final LayersInfo f76968n;

    /* renamed from: o */
    private final int f76969o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$HeaderType;", "", "(Ljava/lang/String;I)V", "DATE_WEEK", "DATE_PAGER", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum HeaderType {
        DATE_WEEK,
        DATE_PAGER
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$AllDayLayersInfo;", "", "visibleLayers", "", "cacheLayers", "visibleDays", "daysOneLayer", "isAlignFirstDayOfWeek", "", "(IIIIZ)V", "getCacheLayers", "()I", "getDaysOneLayer", "()Z", "layersSum", "getLayersSum", "getVisibleDays", "getVisibleLayers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam$a */
    public static final class AllDayLayersInfo {

        /* renamed from: a */
        private final int f76970a;

        /* renamed from: b */
        private final int f76971b;

        /* renamed from: c */
        private final int f76972c;

        /* renamed from: d */
        private final int f76973d;

        /* renamed from: e */
        private final int f76974e;

        /* renamed from: f */
        private final boolean f76975f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllDayLayersInfo)) {
                return false;
            }
            AllDayLayersInfo aVar = (AllDayLayersInfo) obj;
            return this.f76971b == aVar.f76971b && this.f76972c == aVar.f76972c && this.f76973d == aVar.f76973d && this.f76974e == aVar.f76974e && this.f76975f == aVar.f76975f;
        }

        public int hashCode() {
            int i = ((((((this.f76971b * 31) + this.f76972c) * 31) + this.f76973d) * 31) + this.f76974e) * 31;
            boolean z = this.f76975f;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return i + i2;
        }

        public String toString() {
            return "AllDayLayersInfo(visibleLayers=" + this.f76971b + ", cacheLayers=" + this.f76972c + ", visibleDays=" + this.f76973d + ", daysOneLayer=" + this.f76974e + ", isAlignFirstDayOfWeek=" + this.f76975f + ")";
        }

        /* renamed from: a */
        public final int mo110891a() {
            return this.f76970a;
        }

        /* renamed from: b */
        public final int mo110892b() {
            return this.f76972c;
        }

        /* renamed from: c */
        public final int mo110893c() {
            return this.f76973d;
        }

        /* renamed from: d */
        public final int mo110894d() {
            return this.f76974e;
        }

        /* renamed from: e */
        public final boolean mo110895e() {
            return this.f76975f;
        }

        public AllDayLayersInfo(int i, int i2, int i3, int i4, boolean z) {
            this.f76971b = i;
            this.f76972c = i2;
            this.f76973d = i3;
            this.f76974e = i4;
            this.f76975f = z;
            this.f76970a = i + (i2 * 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam$LayersInfo;", "", "visibleLayers", "", "cacheLayers", "(II)V", "getCacheLayers", "()I", "layersSum", "getLayersSum", "getVisibleLayers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam$b */
    public static final class LayersInfo {

        /* renamed from: a */
        private final int f76976a;

        /* renamed from: b */
        private final int f76977b;

        /* renamed from: c */
        private final int f76978c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayersInfo)) {
                return false;
            }
            LayersInfo bVar = (LayersInfo) obj;
            return this.f76977b == bVar.f76977b && this.f76978c == bVar.f76978c;
        }

        public int hashCode() {
            return (this.f76977b * 31) + this.f76978c;
        }

        public String toString() {
            return "LayersInfo(visibleLayers=" + this.f76977b + ", cacheLayers=" + this.f76978c + ")";
        }

        /* renamed from: a */
        public final int mo110899a() {
            return this.f76976a;
        }

        /* renamed from: b */
        public final int mo110900b() {
            return this.f76977b;
        }

        /* renamed from: c */
        public final int mo110901c() {
            return this.f76978c;
        }

        public LayersInfo(int i, int i2) {
            this.f76977b = i;
            this.f76978c = i2;
            this.f76976a = i + (i2 * 2);
        }
    }

    /* renamed from: a */
    public final int mo110870a() {
        return this.f76955a;
    }

    /* renamed from: b */
    public final int mo110874b() {
        return this.f76956b;
    }

    /* renamed from: c */
    public final int mo110876c() {
        return this.f76957c;
    }

    /* renamed from: e */
    public final int mo110878e() {
        return this.f76959e;
    }

    /* renamed from: f */
    public final C30167c mo110879f() {
        return this.f76960f;
    }

    /* renamed from: g */
    public final int mo110880g() {
        return this.f76964j;
    }

    /* renamed from: h */
    public final int mo110881h() {
        return this.f76965k;
    }

    /* renamed from: i */
    public final LayersInfo mo110882i() {
        return this.f76966l;
    }

    /* renamed from: j */
    public final AllDayLayersInfo mo110883j() {
        return this.f76967m;
    }

    /* renamed from: k */
    public final LayersInfo mo110884k() {
        return this.f76968n;
    }

    /* renamed from: d */
    public final float mo110877d() {
        return ((float) this.f76961g) / 60.0f;
    }

    /* renamed from: l */
    public final HeaderType mo110885l() {
        if (this.f76969o == 1) {
            return HeaderType.DATE_PAGER;
        }
        return HeaderType.DATE_WEEK;
    }

    /* renamed from: m */
    public final Rect mo110886m() {
        if (this.f76955a == 0 || this.f76956b == 0) {
            return null;
        }
        return new Rect(this.f76964j, 0, this.f76955a, this.f76959e);
    }

    /* renamed from: n */
    public final Rect mo110887n() {
        if (this.f76955a == 0 || this.f76956b == 0) {
            return null;
        }
        return new Rect(0, this.f76959e, this.f76955a, this.f76956b);
    }

    /* renamed from: o */
    public final Rect mo110888o() {
        if (this.f76955a == 0 || this.f76956b == 0) {
            return null;
        }
        return new Rect(0, 0, this.f76964j, this.f76959e);
    }

    /* renamed from: p */
    public final Rect mo110889p() {
        if (this.f76955a == 0 || this.f76956b == 0) {
            return null;
        }
        return new Rect(this.f76964j, this.f76959e, this.f76955a, this.f76956b);
    }

    /* renamed from: q */
    public final Pair<Integer, Integer> mo110890q() {
        return new Pair<>(Integer.valueOf(((-this.f76965k) - this.f76959e) + this.f76956b), Integer.valueOf(this.f76958d));
    }

    /* renamed from: b */
    public final void mo110875b(int i) {
        this.f76958d = i;
    }

    /* renamed from: a */
    public final Rect mo110871a(int i) {
        if (this.f76955a == 0 || this.f76956b == 0) {
            return null;
        }
        int i2 = this.f76959e;
        return new Rect(0, i2, this.f76955a, i + i2);
    }

    public DaysLayoutParam(int i) {
        int i2;
        AllDayLayersInfo aVar;
        this.f76969o = i;
        int dp2px = UIHelper.dp2px(50.0f);
        this.f76961g = dp2px;
        int dp2px2 = UIHelper.dp2px(7.0f);
        this.f76962h = dp2px2;
        this.f76963i = (dp2px * 24) + (dp2px2 * 2);
        this.f76965k = (dp2px * 24) + (dp2px2 * 2);
        if (mo110885l() == HeaderType.DATE_PAGER) {
            i2 = UIHelper.dp2px(59.0f);
        } else {
            i2 = UIHelper.dp2px(52.0f);
        }
        this.f76959e = i2;
        this.f76968n = new LayersInfo(i, i);
        this.f76966l = new LayersInfo(i, i);
        if (i != 1) {
            aVar = new AllDayLayersInfo(1, 1, 3, 7, true);
        } else {
            aVar = new AllDayLayersInfo(1, 1, 1, 1, false);
        }
        this.f76967m = aVar;
    }

    /* renamed from: a */
    public final void mo110873a(boolean z) {
        int i;
        if (mo110885l() == HeaderType.DATE_PAGER) {
            if (z) {
                i = UIHelper.dp2px(82.0f);
            } else {
                i = UIHelper.dp2px(59.0f);
            }
            this.f76959e = i;
        }
    }

    /* renamed from: a */
    public final void mo110872a(int i, int i2) {
        this.f76955a = i;
        this.f76956b = i2;
        this.f76957c = (i - this.f76964j) / this.f76969o;
        this.f76960f = new C30167c.C30168a().mo108787g(this.f76969o).mo108782b(this.f76963i).mo108780a(this.f76955a - this.f76964j).mo108781a();
    }
}
