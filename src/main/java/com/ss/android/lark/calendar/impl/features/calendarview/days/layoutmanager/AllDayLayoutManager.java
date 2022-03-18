package com.ss.android.lark.calendar.impl.features.calendarview.days.layoutmanager;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.DaysLayoutParam;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.SettingReadyData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.ArrayUtil;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.ExpandArrowView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 _2\u00020\u0001:\u0003_`aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u00105J\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u00020!J\u0010\u00108\u001a\u0002032\u0006\u00109\u001a\u00020\u000eH\u0002J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020\u000eH\u0002J\u000e\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>J\u0012\u0010?\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0018\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020\u000eH\u0002J \u0010H\u001a\u0002032\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020K0Jj\b\u0012\u0004\u0012\u00020K`LH\u0002J\b\u0010M\u001a\u000203H\u0002J\b\u0010N\u001a\u00020%H\u0016J\u0018\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u000eH\u0016J\u0018\u0010R\u001a\u0002032\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u000eH\u0016J\u0010\u0010S\u001a\u0002032\b\u0010T\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010U\u001a\u0002032\b\u0010V\u001a\u0004\u0018\u00010WJ\u0010\u0010X\u001a\u0002032\u0006\u0010Y\u001a\u00020\u000eH\u0016J\u0010\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u00020\u000eH\u0016J\u000e\u0010\\\u001a\u0002032\u0006\u0010]\u001a\u00020\u0013J\b\u0010^\u001a\u000203H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "mDaysLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/calendarview/days/DaysLayoutParam;)V", "layoutListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayoutListener;", "getLayoutListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayoutListener;", "setLayoutListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayoutListener;)V", "mAllDayBackGroundColor", "", "mAllDayBottomPadding", "getMAllDayBottomPadding", "()I", "mAllDayLayerListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayerListener;", "mAllDayLayers", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;", "[Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;", "value", "mAllDayOffset", "setMAllDayOffset", "(I)V", "mAllDayRealHeight", "mAllDayShowHeight", "mDayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "mExpandArrow", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/ExpandArrowView;", "mHeightAnimator", "Landroid/animation/ValueAnimator;", "mIsCanStartRefreshChip", "", "mIsInterceptScrollY", "mIsLayoutFinish", "mMaxAllDayShowHeight", "", "mOffsetYAnimator", "mShadow", "Landroid/graphics/drawable/Drawable;", "mShadowHeight", "mViewTimeZone", "Ljava/util/TimeZone;", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "addAllDayChipsLayer", "", "allDayLayers", "([Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer;)V", "addExpandArrow", "expandArrow", "animHeight", "newHeight", "animOffsetY", "newOffset", "asyncLaunchSettingReady", "settingData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/SettingReadyData;", "dispatchEvent", "ev", "Landroid/view/MotionEvent;", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "getCorrectedOffsetY", "handleLayoutAction", "pageDayRange", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "Lkotlin/collections/ArrayList;", "initAnimListener", "isInterceptScrollY", "layoutChild", "offsetX", "offsetY", "reLayoutChild", "refreshDayOfWeek", "dayOfWeek", "refreshTimeZone", "timeZoneId", "", "scrollDx", "dx", "scrollDy", "dy", "setAllDayLayerListener", "allDayLayerListener", "updateHeight", "Companion", "IAllDayLayerListener", "IAllDayLayoutListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a */
public final class AllDayLayoutManager extends SnapScrollView.LayoutManager {

    /* renamed from: h */
    public static final Companion f77080h = new Companion(null);

    /* renamed from: a */
    public int f77081a;

    /* renamed from: b */
    public boolean f77082b;

    /* renamed from: c */
    public AllDayChipsLayer[] f77083c;

    /* renamed from: d */
    public int f77084d;

    /* renamed from: e */
    public float f77085e = (((float) UIHelper.dp2px(25.0f)) * 7.8f);

    /* renamed from: f */
    public ExpandArrowView f77086f;

    /* renamed from: g */
    public IAllDayLayerListener f77087g;

    /* renamed from: i */
    private boolean f77088i;

    /* renamed from: j */
    private volatile CalendarSetting.DayOfWeek f77089j;

    /* renamed from: k */
    private volatile TimeZone f77090k;

    /* renamed from: l */
    private final int f77091l = UIHelper.dp2px(4.0f);

    /* renamed from: m */
    private int f77092m;

    /* renamed from: n */
    private final int f77093n = UIHelper.dp2px((float) 4);

    /* renamed from: o */
    private final int f77094o = C32634ae.m125178a(R.color.bg_body);

    /* renamed from: p */
    private final Drawable f77095p;

    /* renamed from: q */
    private final ValueAnimator f77096q;

    /* renamed from: r */
    private final ValueAnimator f77097r;

    /* renamed from: s */
    private boolean f77098s;

    /* renamed from: t */
    private IAllDayLayoutListener f77099t;

    /* renamed from: u */
    private final SnapScrollView f77100u;

    /* renamed from: v */
    private final DaysLayoutParam f77101v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayerListener;", "", "onHeightChanged", "", "allDayHeight", "", "onLayerNeedBindData", "startDay", "endDay", "onRefreshLayout", "pageDayRange", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$b */
    public interface IAllDayLayerListener {
        /* renamed from: a */
        void mo111068a(int i);

        /* renamed from: a */
        void mo111069a(int i, int i2);

        /* renamed from: a */
        void mo111070a(List<DayRange> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$IAllDayLayoutListener;", "", "onLayoutFinish", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$c */
    public interface IAllDayLayoutListener {
        /* renamed from: a */
        void mo111050a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$Companion;", "", "()V", "MAX_SHOW_CHIP_NUM", "", "SCROLL_X_DEVIATION", "", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo111051a() {
        return this.f77093n;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public boolean mo111065b() {
        return this.f77098s;
    }

    /* renamed from: c */
    public SnapScrollView mo111066c() {
        return this.f77100u;
    }

    /* renamed from: a */
    public final void mo111062a(AllDayChipsLayer[] allDayChipsLayerArr) {
        Intrinsics.checkParameterIsNotNull(allDayChipsLayerArr, "allDayLayers");
        int length = allDayChipsLayerArr.length;
        AllDayChipsLayer[] allDayChipsLayerArr2 = new AllDayChipsLayer[length];
        for (int i = 0; i < length; i++) {
            allDayChipsLayerArr2[i] = allDayChipsLayerArr[i];
        }
        this.f77083c = allDayChipsLayerArr2;
        for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
            mo111066c().mo113223a(allDayChipsLayer);
            allDayChipsLayer.setClickShowMoreListener(new C30721d(this));
        }
        m114388d();
    }

    /* renamed from: a */
    public final void mo111061a(String str) {
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeZoneId is null = ");
            if (str != null) {
                z = false;
            }
            sb.append(z);
            Log.m165389i("AllDaysLayoutManager", C32673y.m125378d(sb.toString()));
        } else if (!Intrinsics.areEqual(str, this.f77090k.getID())) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            if (timeZone != null) {
                this.f77090k = timeZone;
            }
            Log.m165389i("AllDaysLayoutManager", C32673y.m125378d("setTimeZone timeZoneId = " + str + " mIsLayoutFinish$ = " + this.f77088i));
            mo111053a(mo111066c().getCoordinateApi().mo113242a(), mo111066c().getCoordinateApi().mo113243b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$addAllDayChipsLayer$2$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/AllDayChipsLayer$ClickShowMoreListener;", "onShowMoreClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$d */
    public static final class C30721d implements AllDayChipsLayer.ClickShowMoreListener {

        /* renamed from: a */
        final /* synthetic */ AllDayLayoutManager f77102a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.AllDayChipsLayer.ClickShowMoreListener
        /* renamed from: a */
        public void mo111071a() {
            ExpandArrowView expandArrowView = this.f77102a.f77086f;
            if (expandArrowView != null) {
                expandArrowView.setExpandStatus(true);
            }
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77102a.f77083c;
            if (allDayChipsLayerArr != null) {
                for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                    allDayChipsLayer.setExpandStatus(true);
                    allDayChipsLayer.mo111290d();
                }
            }
        }

        C30721d(AllDayLayoutManager aVar) {
            this.f77102a = aVar;
        }
    }

    /* renamed from: d */
    private final void m114388d() {
        this.f77096q.addUpdateListener(new C30724g(this));
        this.f77097r.addUpdateListener(new C30725h(this));
    }

    /* renamed from: f */
    private final int m114392f() {
        return Math.max(Math.min(this.f77081a, 0), this.f77084d - this.f77092m);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$f */
    public static final class RunnableC30723f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AllDayLayoutManager f77104a;

        RunnableC30723f(AllDayLayoutManager aVar) {
            this.f77104a = aVar;
        }

        public final void run() {
            this.f77104a.f77082b = true;
            this.f77104a.mo111053a(this.f77104a.mo111066c().getCoordinateApi().mo113242a(), this.f77104a.mo111066c().getCoordinateApi().mo113243b());
        }
    }

    /* renamed from: e */
    private final void m114390e() {
        int i;
        boolean z;
        int i2;
        int c = this.f77101v.mo110876c();
        int a = this.f77101v.mo110870a();
        int g = this.f77101v.mo110880g();
        int c2 = this.f77101v.mo110883j().mo110893c();
        int d = this.f77101v.mo110883j().mo110894d();
        if (c > 0) {
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
            if (allDayChipsLayerArr != null) {
                int length = allDayChipsLayerArr.length;
                int i3 = 0;
                z = false;
                i = 0;
                while (i3 < length) {
                    AllDayChipsLayer allDayChipsLayer = allDayChipsLayerArr[i3];
                    int i4 = g + 1;
                    int i5 = a - 1;
                    int left = allDayChipsLayer.getLeft();
                    if (i4 <= left && i5 >= left) {
                        int left2 = allDayChipsLayer.getLeft() + g;
                        int i6 = 0;
                        while (i6 < c2 && left2 < a) {
                            int a2 = allDayChipsLayer.mo111279a(i6);
                            if (z || allDayChipsLayer.mo111288b(i6)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (a2 > i) {
                                i = a2;
                            }
                            left2 += c;
                            i6++;
                            allDayChipsLayerArr = allDayChipsLayerArr;
                        }
                    }
                    int right = allDayChipsLayer.getRight();
                    if (i4 <= right && i5 >= right) {
                        int right2 = allDayChipsLayer.getRight();
                        int i7 = d - 1;
                        for (int i8 = 0; i8 < c2 && right2 > g; i8++) {
                            int a3 = allDayChipsLayer.mo111279a(i7);
                            if (z || allDayChipsLayer.mo111288b(i7)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (a3 > i) {
                                i = a3;
                            }
                            i7--;
                            right2 -= c;
                        }
                    }
                    if (allDayChipsLayer.getRight() >= a && allDayChipsLayer.getLeft() <= g) {
                        int left3 = g - allDayChipsLayer.getLeft();
                        int i9 = left3 / c;
                        int i10 = i9 + c2;
                        if (left3 % c != 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        int i11 = i10 + i2;
                        while (i9 < i11) {
                            int a4 = allDayChipsLayer.mo111279a(i9);
                            if (z || allDayChipsLayer.mo111288b(i9)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (a4 > i) {
                                i = a4;
                            }
                            i9++;
                        }
                    }
                    i3++;
                    allDayChipsLayerArr = allDayChipsLayerArr;
                }
            } else {
                z = false;
                i = 0;
            }
            ExpandArrowView expandArrowView = this.f77086f;
            if (expandArrowView != null) {
                expandArrowView.setArrowVisible(z);
            }
            if (i != this.f77092m) {
                m114389d(i);
            }
            int f = m114392f();
            if (((float) i) <= this.f77085e) {
                m114391e(0);
            } else if (f != this.f77081a) {
                m114391e(f);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/layoutmanager/AllDayLayoutManager$addExpandArrow$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/ExpandArrowView$OnArrowClickListener;", "onClick", "", "isExpand", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$e */
    public static final class C30722e implements ExpandArrowView.OnArrowClickListener {

        /* renamed from: a */
        final /* synthetic */ AllDayLayoutManager f77103a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30722e(AllDayLayoutManager aVar) {
            this.f77103a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.widget.ExpandArrowView.OnArrowClickListener
        /* renamed from: a */
        public void mo111072a(boolean z) {
            this.f77103a.mo111052a(0);
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77103a.f77083c;
            if (allDayChipsLayerArr != null) {
                for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                    allDayChipsLayer.setExpandStatus(z);
                    allDayChipsLayer.mo111290d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111057a(IAllDayLayerListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "allDayLayerListener");
        this.f77087g = bVar;
    }

    /* renamed from: a */
    public final void mo111058a(IAllDayLayoutListener cVar) {
        this.f77099t = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$h */
    public static final class C30725h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AllDayLayoutManager f77106a;

        C30725h(AllDayLayoutManager aVar) {
            this.f77106a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f77106a.mo111052a(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    public final void mo111052a(int i) {
        AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
        if (allDayChipsLayerArr != null) {
            for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                allDayChipsLayer.mo111286b(this.f77084d, i);
            }
        }
        this.f77081a = i;
    }

    /* renamed from: d */
    private final void m114389d(int i) {
        if (!this.f77096q.isRunning()) {
            this.f77092m = i;
            this.f77096q.setIntValues(this.f77084d, i);
            this.f77096q.setDuration(100L);
            this.f77096q.start();
        }
    }

    /* renamed from: e */
    private final void m114391e(int i) {
        if (!this.f77097r.isRunning()) {
            this.f77097r.setIntValues(this.f77081a, i);
            this.f77097r.setDuration(100L);
            this.f77097r.start();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public void mo111067c(int i) {
        ExpandArrowView expandArrowView = this.f77086f;
        if (expandArrowView != null && expandArrowView.mo111375b() && this.f77084d != this.f77092m && this.f77098s) {
            int i2 = this.f77081a;
            mo111052a(i2 - i);
            mo111052a(m114392f());
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
            if (allDayChipsLayerArr != null) {
                for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                    allDayChipsLayer.offsetTopAndBottom(this.f77081a - i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.c.a$g */
    public static final class C30724g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AllDayLayoutManager f77105a;

        C30724g(AllDayLayoutManager aVar) {
            this.f77105a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                if (((float) intValue) > this.f77105a.f77085e) {
                    intValue = (int) this.f77105a.f77085e;
                }
                this.f77105a.f77084d = intValue;
                AllDayChipsLayer[] allDayChipsLayerArr = this.f77105a.f77083c;
                if (allDayChipsLayerArr != null) {
                    for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                        allDayChipsLayer.mo111286b(this.f77105a.f77084d, this.f77105a.f77081a);
                    }
                }
                IAllDayLayerListener bVar = this.f77105a.f77087g;
                if (bVar != null) {
                    bVar.mo111068a(this.f77105a.f77084d + this.f77105a.mo111051a());
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final void m114387a(ArrayList<DayRange> arrayList) {
        IAllDayLayoutListener cVar;
        IAllDayLayerListener bVar;
        Log.m165389i("AllDaysLayoutManager", C32673y.m125378d("handleLayoutAction = " + this.f77082b + '}'));
        if (arrayList.size() > 0) {
            DayRange remove = arrayList.remove(0);
            Intrinsics.checkExpressionValueIsNotNull(remove, "pageDayRange.removeAt(0)");
            arrayList.add(remove);
        }
        if (this.f77082b && (bVar = this.f77087g) != null) {
            bVar.mo111070a(CollectionsKt.toList(arrayList));
        }
        if (!this.f77088i && (cVar = this.f77099t) != null) {
            cVar.mo111050a();
        }
        this.f77088i = true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111063b(int i) {
        boolean z;
        boolean z2;
        int c = this.f77101v.mo110876c();
        int a = this.f77101v.mo110870a();
        int g = this.f77101v.mo110880g();
        DaysLayoutParam.AllDayLayersInfo j = this.f77101v.mo110883j();
        int d = j.mo110894d() * c;
        int a2 = j.mo110891a();
        int d2 = j.mo110894d();
        if (c > 0) {
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
            int i2 = 0;
            if (allDayChipsLayerArr != null) {
                int length = allDayChipsLayerArr.length;
                int i3 = 0;
                z2 = false;
                z = false;
                while (i3 < length) {
                    AllDayChipsLayer allDayChipsLayer = allDayChipsLayerArr[i3];
                    if (allDayChipsLayer.mo111289c()) {
                        allDayChipsLayer.offsetLeftAndRight(i);
                        return;
                    }
                    if (i > 0 && allDayChipsLayer.getLeft() + i + i2 >= a + d) {
                        int layerStartDay = allDayChipsLayer.getLayerStartDay() - (a2 * d2);
                        int i4 = (layerStartDay + d2) - 1;
                        allDayChipsLayer.mo111281a(layerStartDay, i4);
                        IAllDayLayerListener bVar = this.f77087g;
                        if (bVar != null) {
                            bVar.mo111069a(layerStartDay, i4);
                        }
                        allDayChipsLayer.mo111280a();
                        allDayChipsLayer.offsetLeftAndRight(i - (d * a2));
                        z2 = true;
                        z = false;
                    } else if (i > 0 || (allDayChipsLayer.getRight() + i) - 0 > g - d) {
                        allDayChipsLayer.offsetLeftAndRight(i);
                    } else {
                        int layerStartDay2 = allDayChipsLayer.getLayerStartDay() + (a2 * d2);
                        int i5 = (layerStartDay2 + d2) - 1;
                        allDayChipsLayer.mo111281a(layerStartDay2, i5);
                        IAllDayLayerListener bVar2 = this.f77087g;
                        if (bVar2 != null) {
                            bVar2.mo111069a(layerStartDay2, i5);
                        }
                        allDayChipsLayer.mo111280a();
                        allDayChipsLayer.offsetLeftAndRight((d * a2) + i);
                        z2 = true;
                        z = true;
                    }
                    i3++;
                    i2 = 0;
                }
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                ArrayUtil.f77180a.mo111131a(this.f77083c, z);
            }
            AllDayChipsLayer[] allDayChipsLayerArr2 = this.f77083c;
            if (allDayChipsLayerArr2 != null) {
                for (AllDayChipsLayer allDayChipsLayer2 : allDayChipsLayerArr2) {
                    allDayChipsLayer2.mo111290d();
                }
            }
            m114390e();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111055a(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent != null) {
            Rect a = this.f77101v.mo110871a(this.f77084d);
            if (a == null) {
                this.f77098s = false;
            } else if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() >= ((float) a.top) && motionEvent.getY() <= ((float) a.bottom)) {
                    z = true;
                }
                this.f77098s = z;
            }
        } else {
            this.f77098s = false;
        }
    }

    /* renamed from: a */
    public final void mo111056a(SettingReadyData gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "settingData");
        TimeZone timeZone = TimeZone.getTimeZone(gVar.mo110985b());
        if (timeZone != null) {
            this.f77090k = timeZone;
        }
        this.f77089j = gVar.mo110984a();
        UICallbackExecutor.execute(new RunnableC30723f(this));
    }

    /* renamed from: a */
    public final void mo111059a(ExpandArrowView expandArrowView) {
        Intrinsics.checkParameterIsNotNull(expandArrowView, "expandArrow");
        this.f77086f = expandArrowView;
        expandArrowView.setArrowClick(new C30722e(this));
        mo111066c().mo113223a(expandArrowView);
    }

    /* renamed from: a */
    public final void mo111060a(CalendarSetting.DayOfWeek dayOfWeek) {
        if (dayOfWeek != null && this.f77089j != dayOfWeek) {
            this.f77089j = dayOfWeek;
            Log.m165389i("AllDaysLayoutManager", C32673y.m125378d("refreshDayOfWeek dayOfWeek = " + dayOfWeek + " mIsLayoutFinish " + this.f77088i));
            mo111053a(mo111066c().getCoordinateApi().mo113242a(), mo111066c().getCoordinateApi().mo113243b());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111053a(int i, int i2) {
        if (this.f77088i && this.f77082b) {
            Log.m165389i("AllDaysLayoutManager", C32673y.m125378d("reLayoutChild"));
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
            if (allDayChipsLayerArr != null) {
                for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                    allDayChipsLayer.mo111285b();
                }
                mo111064b(i, i2);
            }
        }
    }

    public AllDayLayoutManager(SnapScrollView snapScrollView, DaysLayoutParam daysLayoutParam) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(daysLayoutParam, "mDaysLayoutParam");
        this.f77100u = snapScrollView;
        this.f77101v = daysLayoutParam;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        this.f77090k = timeZone;
        Drawable d = C32634ae.m125184d(R.drawable.bg_shadow);
        Intrinsics.checkExpressionValueIsNotNull(d, "ResUtil.getDrawable(R.drawable.bg_shadow)");
        this.f77095p = d;
        this.f77096q = new ValueAnimator();
        this.f77097r = new ValueAnimator();
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect a = this.f77101v.mo110871a(this.f77084d);
        if (a != null) {
            int save = canvas.save();
            canvas.clipRect(0, a.top, a.right, a.bottom + this.f77093n);
            canvas.drawColor(this.f77094o);
            canvas.restoreToCount(save);
            int save2 = canvas.save();
            canvas.clipRect(a);
            AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
            if (allDayChipsLayerArr != null) {
                for (AllDayChipsLayer allDayChipsLayer : allDayChipsLayerArr) {
                    mo111066c().mo113225a(canvas, allDayChipsLayer, j);
                }
            }
            mo111066c().mo113225a(canvas, this.f77086f, j);
            canvas.restoreToCount(save2);
            int save3 = canvas.save();
            int i = a.bottom + this.f77093n;
            int i2 = this.f77091l + i;
            canvas.clipRect(0, i, a.right, i2);
            this.f77095p.setBounds(0, i, a.right, i2);
            this.f77095p.draw(canvas);
            canvas.restoreToCount(save3);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int c = this.f77101v.mo110876c();
        int g = this.f77101v.mo110880g();
        int e = this.f77101v.mo110878e();
        CalendarSetting.DayOfWeek dayOfWeek = this.f77089j;
        if (dayOfWeek != null) {
            DaysLayoutParam.AllDayLayersInfo j = this.f77101v.mo110883j();
            int d = j.mo110894d();
            int b = j.mo110892b();
            int d2 = j.mo110894d() * c;
            if (c > 0) {
                int i7 = (-i) / d2;
                int i8 = i % d2;
                CalendarDate calendarDate = new CalendarDate(this.f77090k);
                if (j.mo110895e()) {
                    int julianDay = calendarDate.getJulianDay();
                    CalendarDate firstDayOfTheWeek = calendarDate.getFirstDayOfTheWeek(dayOfWeek);
                    Intrinsics.checkExpressionValueIsNotNull(firstDayOfTheWeek, "currentDate.getFirstDayOfTheWeek(dayOfWeek)");
                    i3 = julianDay - firstDayOfTheWeek.getJulianDay();
                } else {
                    i3 = 0;
                }
                int i9 = (g - (i3 * c)) + i8;
                int i10 = i9 - d2;
                if (j.mo110895e()) {
                    calendarDate.setJulianDay(calendarDate.getJulianDay() + (i7 * d));
                    CalendarDate firstDayOfTheWeek2 = calendarDate.getFirstDayOfTheWeek(dayOfWeek);
                    Intrinsics.checkExpressionValueIsNotNull(firstDayOfTheWeek2, "currentDate.getFirstDayOfTheWeek(dayOfWeek)");
                    i4 = firstDayOfTheWeek2.getJulianDay();
                } else {
                    i4 = calendarDate.getJulianDay() + (i7 * d);
                }
                int i11 = i4 - (b * d);
                AllDayChipsLayer[] allDayChipsLayerArr = this.f77083c;
                if (allDayChipsLayerArr != null) {
                    ArrayList<DayRange> arrayList = new ArrayList<>(allDayChipsLayerArr.length);
                    int length = allDayChipsLayerArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        AllDayChipsLayer allDayChipsLayer = allDayChipsLayerArr[i12];
                        if (allDayChipsLayer.mo111289c()) {
                            int i13 = (i12 * d) + i11;
                            int i14 = (i13 + d) - 1;
                            arrayList.add(new DayRange(i13, i14));
                            allDayChipsLayer.mo111281a(i13, i14);
                            int i15 = i12 * d2;
                            int i16 = this.f77081a;
                            i5 = i10;
                            i6 = i9;
                            allDayChipsLayer.layout(i10 + i15, e + i16, i15 + i9, this.f77092m + e + i16);
                            if (allDayChipsLayerArr.length - 1 == i12) {
                                m114387a(arrayList);
                            }
                        } else {
                            i5 = i10;
                            i6 = i9;
                            allDayChipsLayer.layout(allDayChipsLayer.getLeft(), this.f77081a + e, allDayChipsLayer.getRight(), this.f77092m + e + this.f77081a);
                        }
                        i12++;
                        i10 = i5;
                        i9 = i6;
                    }
                    ExpandArrowView expandArrowView = this.f77086f;
                    if (expandArrowView != null) {
                        expandArrowView.layout(0, e, g, this.f77084d + e);
                    }
                    m114390e();
                }
            }
        }
    }
}
