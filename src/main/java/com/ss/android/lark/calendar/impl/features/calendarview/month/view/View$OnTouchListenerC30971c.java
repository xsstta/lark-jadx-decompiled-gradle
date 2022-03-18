package com.ss.android.lark.calendar.impl.features.calendarview.month.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IMonthDayViewListener;
import com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IRowAnimateListener;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.C31115j;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32647d;
import com.ss.android.lark.calendar.impl.utils.C32670u;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.c */
public class View$OnTouchListenerC30971c extends FrameLayout implements View.OnTouchListener {

    /* renamed from: A */
    private CalendarDate f78040A;

    /* renamed from: B */
    private CalendarDate f78041B;

    /* renamed from: C */
    private MonthViewAttr.AnimatorCallbackType f78042C = MonthViewAttr.AnimatorCallbackType.None;

    /* renamed from: D */
    private C30970b f78043D;

    /* renamed from: E */
    private IMonthDayViewListener f78044E;

    /* renamed from: F */
    private boolean f78045F = true;

    /* renamed from: G */
    private CalendarSetting.DayOfWeek f78046G = CalendarSetting.DayOfWeek.SUNDAY;

    /* renamed from: H */
    private boolean f78047H;

    /* renamed from: I */
    private AbstractC31110f f78048I = new C31115j<MonthDayPage>() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c.C309732 */

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.C31115j, com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
        /* renamed from: a */
        public void mo108577a(int i) {
            View$OnTouchListenerC30971c.this.f78053e.mo111610c((float) View$OnTouchListenerC30971c.this.f78051c.dayDiff(View$OnTouchListenerC30971c.this.f78050b));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.C31115j, com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f
        /* renamed from: b */
        public void mo112084b(int i) {
            CalendarDate selectedDate = View$OnTouchListenerC30971c.this.f78049a.getSelectedDate();
            int selectedCol = View$OnTouchListenerC30971c.this.f78049a.getSelectedCol();
            C30975d selectedRowView = View$OnTouchListenerC30971c.this.f78049a.getSelectedRowView();
            if (i == 0) {
                Log.m165389i("MonthPageView", C32673y.m125369a("monthLeft"));
                if (selectedCol != 6) {
                    View$OnTouchListenerC30971c.this.f78051c = selectedDate.addDay(1);
                    selectedRowView.mo112149c();
                    View$OnTouchListenerC30971c cVar = View$OnTouchListenerC30971c.this;
                    cVar.mo112114a(cVar.f78051c);
                    View$OnTouchListenerC30971c.this.f78052d.onSelectDateChanged(View$OnTouchListenerC30971c.this.f78051c);
                    View$OnTouchListenerC30971c.this.f78049a.setSelectedDate(View$OnTouchListenerC30971c.this.f78051c);
                    View$OnTouchListenerC30971c.this.f78049a.setSelectedCol(selectedCol + 1);
                }
            } else if (i == 1) {
                Log.m165389i("MonthPageView", C32673y.m125369a("monthRight"));
                if (selectedCol != 0) {
                    View$OnTouchListenerC30971c.this.f78051c = selectedDate.addDay(-1);
                    selectedRowView.mo112149c();
                    View$OnTouchListenerC30971c cVar2 = View$OnTouchListenerC30971c.this;
                    cVar2.mo112114a(cVar2.f78051c);
                    View$OnTouchListenerC30971c.this.f78052d.onSelectDateChanged(View$OnTouchListenerC30971c.this.f78051c);
                    View$OnTouchListenerC30971c.this.f78049a.setSelectedDate(View$OnTouchListenerC30971c.this.f78051c);
                    View$OnTouchListenerC30971c.this.f78049a.setSelectedCol(selectedCol - 1);
                }
            }
        }
    };

    /* renamed from: a */
    public MonthDayViewPager f78049a;

    /* renamed from: b */
    public CalendarDate f78050b;

    /* renamed from: c */
    public CalendarDate f78051c;

    /* renamed from: d */
    public AbstractC30979f f78052d;

    /* renamed from: e */
    public C30804f f78053e;

    /* renamed from: f */
    private Context f78054f;

    /* renamed from: g */
    private ArrayList<C30975d> f78055g;

    /* renamed from: h */
    private SparseArray<List<MonthEventChipViewData>> f78056h;

    /* renamed from: i */
    private SparseArray<List<MonthEventChipViewData>> f78057i;

    /* renamed from: j */
    private SparseArray<ArrayList<Integer>> f78058j;

    /* renamed from: k */
    private int f78059k;

    /* renamed from: l */
    private FrameLayout f78060l;

    /* renamed from: m */
    private MonthCalendarWeekIndicator f78061m;

    /* renamed from: n */
    private int f78062n;

    /* renamed from: o */
    private int f78063o;

    /* renamed from: p */
    private int f78064p;

    /* renamed from: q */
    private int f78065q;

    /* renamed from: r */
    private int f78066r;

    /* renamed from: s */
    private float f78067s;

    /* renamed from: t */
    private float f78068t;

    /* renamed from: u */
    private int f78069u;

    /* renamed from: v */
    private boolean f78070v;

    /* renamed from: w */
    private C30975d f78071w;

    /* renamed from: x */
    private CalendarDate f78072x;

    /* renamed from: y */
    private int f78073y;

    /* renamed from: z */
    private int f78074z = -1;

    public CalendarDate getCurrentDate() {
        return this.f78050b;
    }

    public CalendarDate getFirstDateOfMonth() {
        return this.f78041B;
    }

    public CalendarDate getSelectDate() {
        return this.f78051c;
    }

    public CalendarDate getStartDate() {
        return this.f78040A;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: t */
    private /* synthetic */ void m115602t() {
        this.f78060l.requestLayout();
    }

    /* renamed from: d */
    public boolean mo112119d() {
        return this.f78049a.mo112096a();
    }

    /* renamed from: g */
    public void mo112122g() {
        mo112115a(false);
        mo112128h();
        mo112130j();
    }

    public CalendarDate getPageEndDate() {
        return this.f78040A.addDay((this.f78062n * 7) - 1);
    }

    /* renamed from: j */
    public void mo112130j() {
        this.f78061m.mo112075a(this.f78040A, this.f78050b, getPageEndDate());
    }

    /* renamed from: l */
    private void m115594l() {
        for (int i = 0; i < 6; i++) {
            C30975d dVar = this.f78055g.get(i);
            this.f78049a.setOpened(false);
            dVar.setMaxRowList(null);
            dVar.mo112146a((List<MonthEventChipViewData>) null);
        }
    }

    /* renamed from: n */
    private void m115596n() {
        for (int i = 0; i < this.f78062n; i++) {
            C30975d dVar = this.f78055g.get(i);
            dVar.setSelectState(-1);
            dVar.setCurrentDateHasBgCircle(true);
            dVar.invalidate();
        }
    }

    /* renamed from: p */
    private void m115598p() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f78049a.getLayoutParams();
        layoutParams.topMargin = this.f78054f.getResources().getDisplayMetrics().heightPixels * 2;
        this.f78049a.setLayoutParams(layoutParams);
    }

    /* renamed from: r */
    private void m115600r() {
        this.f78065q = this.f78063o;
        this.f78066r = (int) Math.ceil((double) (this.f78064p / this.f78062n));
        if (this.f78074z == -1) {
            m115593k();
        } else {
            m115601s();
        }
    }

    /* renamed from: b */
    public void mo112116b() {
        for (int i = 0; i < this.f78055g.size(); i++) {
            this.f78055g.get(i).mo112143a();
        }
        C30970b bVar = this.f78043D;
        if (bVar != null) {
            bVar.mo112109a();
        }
    }

    /* renamed from: e */
    public void mo112120e() {
        for (int i = 0; i < this.f78062n; i++) {
            this.f78055g.get(i).setCurrentDateHasBgCircle(true);
        }
    }

    /* renamed from: f */
    public void mo112121f() {
        for (int i = 0; i < this.f78062n; i++) {
            this.f78055g.get(i).mo112149c();
        }
    }

    /* renamed from: h */
    public void mo112128h() {
        this.f78062n = m115595m();
        this.f78045F = true;
        this.f78056h = null;
        this.f78057i = null;
        this.f78058j = null;
        mo112112a();
        m115594l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.view.c$3 */
    public static /* synthetic */ class C309743 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr$AnimatorCallbackType[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr.AnimatorCallbackType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c.C309743.f78077a = r0
                com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr$AnimatorCallbackType r1 = com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr.AnimatorCallbackType.Open     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c.C309743.f78077a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr$AnimatorCallbackType r1 = com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr.AnimatorCallbackType.Close     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c.C309743.f78077a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr$AnimatorCallbackType r1 = com.ss.android.lark.calendar.impl.features.calendarview.month.MonthViewAttr.AnimatorCallbackType.OpenAfterClosed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c.C309743.<clinit>():void");
        }
    }

    /* renamed from: m */
    private int m115595m() {
        return ((C32647d.m125273a(this.f78041B.getYear(), this.f78041B.getMonth(), this.f78046G) + C26279i.m95146a(this.f78041B.getYear(), this.f78041B.getMonth())) / 7) + 1;
    }

    /* renamed from: o */
    private void m115597o() {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f78049a.getLayoutParams();
        if (this.f78074z == this.f78062n - 1) {
            i2 = this.f78064p;
            i = this.f78066r;
        } else {
            i2 = this.f78064p;
            i = this.f78066r * 2;
        }
        layoutParams.height = i2 - i;
        layoutParams.topMargin = this.f78066r;
        this.f78049a.setLayoutParams(layoutParams);
        this.f78049a.setVisibility(0);
    }

    /* renamed from: q */
    private void m115599q() {
        if (!(this.f78056h == null || this.f78058j == null)) {
            for (int i = 0; i < this.f78062n; i++) {
                C30975d dVar = this.f78055g.get(i);
                int yearWeek = m115588a(i).getYearWeek();
                dVar.setMaxRowList(this.f78058j.get(yearWeek));
                dVar.mo112146a(this.f78056h.get(yearWeek));
            }
        }
    }

    /* renamed from: i */
    public void mo112129i() {
        for (int i = 0; i < this.f78062n; i++) {
            this.f78055g.get(i).mo112145a(this.f78050b, this.f78051c, m115588a(i), this.f78041B);
        }
        mo112130j();
    }

    /* renamed from: k */
    private void m115593k() {
        for (int i = 0; i < 6; i++) {
            if (i >= this.f78062n) {
                this.f78055g.get(i).setVisibility(8);
            } else {
                C30975d dVar = this.f78055g.get(i);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f78066r);
                layoutParams.topMargin = this.f78066r * i;
                dVar.setLayoutParams(layoutParams);
                dVar.setIsShowLunarCalendar(this.f78047H);
                dVar.mo112148b(this.f78065q, this.f78066r);
                dVar.mo112145a(this.f78050b, this.f78051c, m115588a(i), this.f78041B);
                dVar.setVisibility(0);
            }
        }
        m115592b(false);
    }

    /* renamed from: s */
    private void m115601s() {
        int i;
        m115597o();
        for (int i2 = 0; i2 < this.f78062n; i2++) {
            C30975d dVar = this.f78055g.get(i2);
            int i3 = this.f78074z;
            if (i2 <= i3) {
                i = this.f78066r * (i2 - i3);
            } else {
                int i4 = this.f78064p;
                int i5 = this.f78066r;
                i = (i4 - i5) + (((i2 - i3) - 1) * i5);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f78066r);
            layoutParams.topMargin = i;
            dVar.setLayoutParams(layoutParams);
            dVar.mo112148b(this.f78065q, this.f78066r);
            dVar.mo112145a(this.f78050b, this.f78051c, m115588a(i2), this.f78041B);
        }
    }

    /* renamed from: c */
    public void m115603u() {
        int i = this.f78059k + 1;
        this.f78059k = i;
        if (i >= this.f78062n) {
            int i2 = C309743.f78077a[this.f78042C.ordinal()];
            if (i2 == 1) {
                this.f78049a.setOpened(true);
                this.f78045F = true;
            } else if (i2 == 2) {
                this.f78049a.setOpened(false);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f78049a.getLayoutParams();
                layoutParams.topMargin = -this.f78049a.getHeight();
                this.f78049a.setLayoutParams(layoutParams);
                this.f78074z = -1;
                this.f78045F = true;
            } else if (i2 == 3) {
                this.f78049a.setOpened(false);
                this.f78042C = MonthViewAttr.AnimatorCallbackType.Open;
                this.f78049a.setSelectedRowView(this.f78071w);
                this.f78049a.setSelectedDate(this.f78072x);
                this.f78049a.setSelectedCol(this.f78073y);
                m115590a(this.f78071w);
            }
            this.f78070v = false;
        }
    }

    /* renamed from: a */
    public void mo112112a() {
        this.f78063o = this.f78060l.getWidth();
        int height = this.f78060l.getHeight();
        this.f78064p = height;
        this.f78065q = this.f78063o;
        this.f78066r = (int) Math.ceil((double) (height / this.f78062n));
        m115593k();
    }

    public void setCurrentDate(CalendarDate calendarDate) {
        this.f78050b = calendarDate;
    }

    public void setDayOfWeek(CalendarSetting.DayOfWeek dayOfWeek) {
        this.f78046G = dayOfWeek;
    }

    public void setFirstDateOfMonth(CalendarDate calendarDate) {
        this.f78041B = calendarDate;
    }

    public void setIsShowLunarCalendar(boolean z) {
        this.f78047H = z;
    }

    public void setMonthDaySelectListener(AbstractC30979f fVar) {
        this.f78052d = fVar;
    }

    public void setMonthDayViewListener(IMonthDayViewListener aVar) {
        this.f78044E = aVar;
    }

    public void setSelectDate(CalendarDate calendarDate) {
        this.f78051c = calendarDate;
    }

    public void setStartDate(CalendarDate calendarDate) {
        this.f78040A = calendarDate;
    }

    /* renamed from: a */
    private CalendarDate m115588a(int i) {
        return this.f78040A.addDay(i * 7);
    }

    /* renamed from: b */
    private void m115592b(boolean z) {
        this.f78059k = 0;
        this.f78070v = true;
        for (int i = 0; i < this.f78062n; i++) {
            C30975d dVar = this.f78055g.get(i);
            if (z) {
                dVar.mo112144a(0, this.f78066r * i);
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
                layoutParams.topMargin = this.f78066r * i;
                dVar.setLayoutParams(layoutParams);
                m115603u();
            }
        }
        m115598p();
    }

    private void setClickDate(CalendarDate calendarDate) {
        this.f78049a.setIsClickToScroll(true);
        this.f78053e.mo111608b((float) calendarDate.dayDiff(this.f78050b));
        if (this.f78043D == null) {
            this.f78043D = new C30970b(this.f78054f, this.f78057i, calendarDate, this.f78044E);
            this.f78049a.setListener(this.f78048I);
            this.f78049a.setAdapter(this.f78043D);
            this.f78049a.setCurrentPage(calendarDate);
            return;
        }
        this.f78049a.mo112095a(this.f78057i, calendarDate);
    }

    /* renamed from: a */
    private void m115590a(C30975d dVar) {
        int i;
        this.f78059k = 0;
        this.f78070v = true;
        this.f78074z = this.f78055g.indexOf(dVar);
        m115597o();
        int i2 = 0;
        while (true) {
            i = this.f78074z;
            if (i2 > i) {
                break;
            }
            this.f78055g.get(i2).mo112144a(0, (i2 - this.f78074z) * this.f78066r);
            i2++;
        }
        for (int i3 = i + 1; i3 < this.f78062n; i3++) {
            int i4 = this.f78064p;
            int i5 = this.f78066r;
            this.f78055g.get(i3).mo112144a(0, (i4 - i5) + (((i3 - this.f78074z) - 1) * i5));
        }
    }

    /* renamed from: b */
    public void mo112117b(CalendarDate calendarDate) {
        if (this.f78045F) {
            int i = 0;
            this.f78045F = false;
            C30975d dVar = null;
            int i2 = -1;
            while (true) {
                if (i >= this.f78062n) {
                    break;
                }
                dVar = this.f78055g.get(i);
                if (calendarDate.getJulianDay() >= dVar.getFirstDateOfTheRow().getJulianDay() && calendarDate.getJulianDay() < dVar.getFirstDateOfTheRow().addDay(7).getJulianDay()) {
                    i2 = calendarDate.getWeeklyDayIndex();
                    break;
                }
                i++;
            }
            this.f78051c = calendarDate;
            setClickDate(calendarDate);
            this.f78052d.onSelectDateChanged(calendarDate);
            if (i2 >= 0 && i2 < 7) {
                m115591a(dVar, calendarDate, i2);
            }
        }
    }

    public View$OnTouchListenerC30971c(Context context) {
        super(context);
        this.f78054f = context;
        C32670u.m125362a(context).inflate(R.layout.calendar_month_general_view, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f78069u = context.getResources().getDimensionPixelSize(R.dimen.dp_20);
        this.f78055g = new ArrayList<>();
        this.f78061m = (MonthCalendarWeekIndicator) findViewById(R.id.calendar_month_week_indicator);
        this.f78060l = (FrameLayout) findViewById(R.id.view_calendar_month_body);
        this.f78049a = (MonthDayViewPager) findViewById(R.id.calendar_month_day_view_pager);
        this.f78053e = new C30804f();
        $$Lambda$c$eSMOA6Nt5_u1d8GwJPAhSHKIkpI r0 = new IRowAnimateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.$$Lambda$c$eSMOA6Nt5_u1d8GwJPAhSHKIkpI */

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.month.listener.IRowAnimateListener
            public final void onRowViewAnimatorFinished() {
                View$OnTouchListenerC30971c.this.m115603u();
            }
        };
        for (int i = 0; i < 6; i++) {
            C30975d dVar = new C30975d(context);
            dVar.setClickable(true);
            dVar.setOnTouchListener(this);
            dVar.setRowAnimateListener(r0);
            dVar.setIsShowLunarCalendar(this.f78047H);
            this.f78055g.add(dVar);
            this.f78060l.addView(dVar);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.View$OnTouchListenerC30971c.ViewTreeObserver$OnGlobalLayoutListenerC309721 */

            public void onGlobalLayout() {
                View$OnTouchListenerC30971c.this.mo112112a();
                View$OnTouchListenerC30971c.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    /* renamed from: a */
    public void mo112114a(CalendarDate calendarDate) {
        boolean z;
        if (calendarDate.getJulianDay() == this.f78050b.getJulianDay()) {
            z = true;
        } else {
            z = false;
        }
        for (int i = 0; i < this.f78062n; i++) {
            C30975d dVar = this.f78055g.get(i);
            int i2 = -1;
            if (calendarDate.before(dVar.getFirstDateOfTheRow().addDay(7))) {
                int i3 = 0;
                while (true) {
                    if (i3 >= 7) {
                        break;
                    } else if (calendarDate.getJulianDay() == dVar.getFirstDateOfTheRow().addDay(i3).getJulianDay()) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            dVar.setSelectState(i2);
            dVar.mo112147b();
            dVar.setCurrentDateHasBgCircle(z);
            dVar.invalidate();
        }
    }

    /* renamed from: a */
    public void mo112115a(boolean z) {
        if (this.f78049a.mo112096a()) {
            this.f78042C = MonthViewAttr.AnimatorCallbackType.Close;
            m115592b(z);
            this.f78049a.getSelectedRowView().mo112149c();
        }
    }

    /* renamed from: a */
    private void m115589a(View view, MotionEvent motionEvent) {
        if (this.f78045F) {
            this.f78045F = false;
            CalendarHitPoint.m124142j();
            C30975d dVar = (C30975d) view;
            this.f78074z = this.f78055g.indexOf(dVar);
            int a = dVar.mo112142a(motionEvent.getX());
            CalendarDate addDay = dVar.getFirstDateOfTheRow().addDay(a);
            this.f78051c = addDay;
            setClickDate(addDay);
            this.f78052d.onSelectDateChanged(addDay);
            m115591a(dVar, addDay, a);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f78067s = motionEvent.getX();
            this.f78068t = motionEvent.getY();
        } else if (action == 1 && Math.abs(this.f78067s - motionEvent.getX()) < ((float) this.f78069u) && Math.abs(this.f78068t - motionEvent.getY()) < ((float) this.f78069u)) {
            m115589a(view, motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo112113a(SparseArray<List<MonthEventChipViewData>> sparseArray, SparseArray<List<MonthEventChipViewData>> sparseArray2, SparseArray<ArrayList<Integer>> sparseArray3) {
        LaunchPerfMonitor.m124428c("show_chip");
        this.f78056h = sparseArray;
        this.f78057i = sparseArray2;
        this.f78058j = sparseArray3;
        m115599q();
        this.f78049a.mo112094a(this.f78057i);
    }

    /* renamed from: a */
    private void m115591a(C30975d dVar, CalendarDate calendarDate, int i) {
        if (dVar != null && calendarDate != null && i <= 6 && i >= 0 && !this.f78070v) {
            if (!this.f78049a.mo112096a()) {
                Log.m165389i("MonthPageView", C32673y.m125369a("monthClickTime"));
                this.f78042C = MonthViewAttr.AnimatorCallbackType.Open;
                this.f78049a.setSelectedRowView(dVar);
                this.f78049a.setSelectedCol(i);
                this.f78049a.setSelectedDate(calendarDate);
                m115590a(dVar);
                this.f78049a.setOpened(true);
                mo112114a(calendarDate);
            } else if (this.f78049a.getSelectedRowView() != dVar) {
                Log.m165389i("MonthPageView", C32673y.m125369a("monthClickTime"));
                this.f78042C = MonthViewAttr.AnimatorCallbackType.OpenAfterClosed;
                this.f78073y = i;
                this.f78071w = dVar;
                this.f78072x = calendarDate;
                m115592b(true);
                this.f78049a.setOpened(true);
                this.f78049a.getSelectedRowView().mo112149c();
                mo112114a(calendarDate);
            } else if (this.f78049a.getSelectedCol() < i) {
                Log.m165389i("MonthPageView", C32673y.m125369a("monthClickTime"));
                this.f78049a.setSelectedDate(calendarDate);
                this.f78049a.setSelectedCol(i);
                this.f78049a.setSelectedDate(calendarDate);
                dVar.mo112149c();
                mo112114a(calendarDate);
                this.f78045F = true;
            } else if (this.f78049a.getSelectedCol() > i) {
                Log.m165389i("MonthPageView", C32673y.m125369a("monthClickTime"));
                this.f78049a.setSelectedDate(calendarDate);
                this.f78049a.setSelectedCol(i);
                this.f78049a.setSelectedDate(calendarDate);
                dVar.mo112149c();
                mo112114a(calendarDate);
                this.f78045F = true;
            } else {
                this.f78042C = MonthViewAttr.AnimatorCallbackType.Close;
                if (this.f78050b.getJulianDay() >= this.f78040A.getJulianDay() && this.f78050b.getJulianDay() <= getPageEndDate().getJulianDay()) {
                    this.f78051c = this.f78050b;
                    this.f78053e.mo111608b(BitmapDescriptorFactory.HUE_RED);
                    this.f78052d.onSelectDateChanged(this.f78050b);
                }
                m115592b(true);
                this.f78049a.setOpened(false);
                this.f78049a.setVisibility(4);
                m115596n();
                dVar.mo112149c();
                invalidate();
            }
            GeneralHitPoint.m124209a("default_view", "by_date", "month");
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f78063o = i;
        this.f78064p = i2 - this.f78061m.getHeight();
        m115600r();
        this.f78060l.post(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.month.view.$$Lambda$c$atiuKSKpay5xhh9DkrqjcrD4nyo */

            public final void run() {
                View$OnTouchListenerC30971c.this.m115602t();
            }
        });
    }
}
