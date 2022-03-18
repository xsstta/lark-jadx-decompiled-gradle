package com.ss.android.lark.calendar.impl.features.calendarview.list.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.AbstractC31169a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.C31181c;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.month.MonthViewPager;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.viewdata.CalendarAttr;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.C31189a;
import com.ss.android.lark.calendar.impl.features.common.widget.calendar.week.WeekViewPager;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32670u;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import java.util.ArrayList;

public class ListCalendarView extends FrameLayout implements NestedScrollingParent {

    /* renamed from: a */
    LinearLayout f77636a;

    /* renamed from: b */
    RecyclerView f77637b;

    /* renamed from: c */
    ImageView f77638c;

    /* renamed from: d */
    ViewGroup f77639d;

    /* renamed from: e */
    MonthViewPager f77640e;

    /* renamed from: f */
    WeekViewPager f77641f;

    /* renamed from: g */
    C30850a f77642g;

    /* renamed from: h */
    FrameLayout f77643h;

    /* renamed from: i */
    public CalendarAttr.CalendarType f77644i;

    /* renamed from: j */
    public AbstractC30849a f77645j;

    /* renamed from: k */
    public boolean f77646k;

    /* renamed from: l */
    public ListEventDateLogic f77647l;

    /* renamed from: m */
    private int f77648m;

    /* renamed from: n */
    private int f77649n;

    /* renamed from: o */
    private ValueAnimator f77650o;

    /* renamed from: p */
    private ValueAnimator f77651p;

    /* renamed from: q */
    private int f77652q;

    /* renamed from: r */
    private int f77653r;

    /* renamed from: s */
    private int f77654s;

    /* renamed from: t */
    private int f77655t;

    /* renamed from: u */
    private boolean f77656u;

    /* renamed from: v */
    private boolean f77657v;

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView$a */
    public interface AbstractC30849a {
        /* renamed from: a */
        void mo111734a(CalendarAttr.CalendarType calendarType);
    }

    /* renamed from: b */
    private int m115088b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return true;
    }

    public CalendarAttr.CalendarType getCalendarType() {
        return this.f77644i;
    }

    public C30850a getmCalendarRecyclerView() {
        return this.f77642g;
    }

    private int getEventContainerOffset() {
        return getMonthHeight() - this.f77648m;
    }

    /* renamed from: a */
    public void mo111737a() {
        C30850a aVar = this.f77642g;
        if (aVar != null) {
            aVar.mo111788c();
        }
    }

    /* renamed from: h */
    public void mo111757h() {
        this.f77642g.mo111789d();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        mo111744c();
    }

    private int getMonthCalendarOffset() {
        return this.f77640e.getRowIndex() * this.f77648m;
    }

    public CalendarDate getCenterMonthStartDate() {
        return this.f77640e.getCenterView().getMonthStartDate();
    }

    public CalendarDate getCenterWeekEndDate() {
        return this.f77641f.getCenterView().getEndDate();
    }

    public CalendarDate getCenterWeekStartDate() {
        return this.f77641f.getCenterView().getStartDate();
    }

    /* renamed from: n */
    private void m115096n() {
        if (this.f77636a.getTop() == this.f77648m) {
            mo111758i();
        } else if (this.f77636a.getTop() == getMonthHeight()) {
            mo111742b();
        }
    }

    /* renamed from: d */
    public void mo111745d() {
        ViewGroup.LayoutParams layoutParams = this.f77640e.getLayoutParams();
        layoutParams.height = this.f77649n;
        this.f77640e.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f77641f.getLayoutParams();
        layoutParams2.height = this.f77648m;
        this.f77641f.setLayoutParams(layoutParams2);
    }

    /* renamed from: e */
    public void mo111746e() {
        boolean isShowLunarCalendar = C30022a.f74884c.mo108456c().isShowLunarCalendar();
        m115089b(isShowLunarCalendar);
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(isShowLunarCalendar) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.$$Lambda$ListCalendarView$AjSQR_O6KuACvT2lbEFQESiMSPQ */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                ListCalendarView.lambda$AjSQR_O6KuACvT2lbEFQESiMSPQ(ListCalendarView.this, this.f$1, calendarSetting);
            }
        });
    }

    /* renamed from: f */
    public void mo111747f() {
        this.f77646k = false;
        m115084a(this.f77640e.getTop(), 0, this.f77636a.getTop(), this.f77640e.getRowNum() * this.f77648m);
    }

    /* renamed from: g */
    public void mo111748g() {
        this.f77646k = true;
        m115084a(0, -getMonthCalendarOffset(), this.f77636a.getTop(), this.f77648m);
    }

    public CalendarDate getCenterCalendarEndDate() {
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            return this.f77640e.getCenterView().getEndDate();
        }
        return this.f77641f.getCenterView().getEndDate();
    }

    public CalendarDate getCenterCalendarStartDate() {
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            return this.f77640e.getCenterView().getStartDate();
        }
        return this.f77641f.getCenterView().getStartDate();
    }

    public int getMonthHeight() {
        return Math.min(this.f77640e.getRowNum() * this.f77648m, this.f77649n);
    }

    /* renamed from: i */
    public void mo111758i() {
        this.f77644i = CalendarAttr.CalendarType.WEEK;
        this.f77641f.setVisibility(0);
        this.f77640e.setVisibility(4);
        this.f77638c.setImageResource(R.drawable.list_calendar_down);
    }

    /* renamed from: b */
    public void mo111742b() {
        this.f77644i = CalendarAttr.CalendarType.MONTH;
        this.f77640e.setVisibility(0);
        this.f77641f.setVisibility(4);
        this.f77638c.setImageResource(R.drawable.ud_icon_vc_toolbar_up_filled);
    }

    /* renamed from: j */
    public void mo111759j() {
        int min = Math.min(this.f77640e.getRowNum() * this.f77648m, this.f77649n) - Math.min(this.f77640e.getRightView().getRowNum() * this.f77648m, this.f77649n);
        if (min != 0 && this.f77644i == CalendarAttr.CalendarType.MONTH) {
            m115094e(min);
        }
    }

    /* renamed from: k */
    public void mo111760k() {
        int min = Math.min(this.f77640e.getRowNum() * this.f77648m, this.f77649n) - Math.min(this.f77640e.getLeftView().getRowNum() * this.f77648m, this.f77649n);
        if (min != 0 && this.f77644i == CalendarAttr.CalendarType.MONTH) {
            m115094e(min);
        }
    }

    /* renamed from: l */
    public void mo111761l() {
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            ((C31181c) this.f77640e.getAdapter()).mo112966f();
            ((C31189a) this.f77641f.getAdapter()).mo113014g();
            return;
        }
        ((C31189a) this.f77641f.getAdapter()).mo113014g();
        ((C31181c) this.f77640e.getAdapter()).mo112966f();
    }

    /* renamed from: m */
    private void m115095m() {
        int top = this.f77640e.getTop();
        int top2 = this.f77636a.getTop();
        if (top == 0 && top2 == getMonthHeight()) {
            mo111742b();
            this.f77645j.mo111734a(this.f77644i);
        } else if (top == (-getMonthCalendarOffset()) && top2 == this.f77648m) {
            mo111758i();
            this.f77645j.mo111734a(this.f77644i);
        } else if (this.f77646k) {
            GeneralHitPoint.m124240d("close");
            m115084a(top, -getMonthCalendarOffset(), top2, this.f77648m);
        } else {
            GeneralHitPoint.m124240d("open");
            m115084a(top, 0, top2, getMonthHeight());
        }
    }

    /* renamed from: c */
    public void mo111744c() {
        int i;
        this.f77640e = (MonthViewPager) findViewById(R.id.list_calendar_month_viewpager);
        this.f77641f = (WeekViewPager) findViewById(R.id.list_calendar_week_viewpager);
        this.f77636a = (LinearLayout) findViewById(R.id.list_calendar_event_container);
        this.f77637b = (RecyclerView) findViewById(R.id.list_calendar_rv);
        this.f77638c = (ImageView) findViewById(R.id.list_calendar_status);
        this.f77643h = (FrameLayout) findViewById(R.id.list_event_container);
        this.f77639d = (ViewGroup) findViewById(R.id.calendar_status_container);
        boolean isShowLunarCalendar = C30022a.f74884c.mo108456c().isShowLunarCalendar();
        mo111741a(isShowLunarCalendar);
        mo111745d();
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(isShowLunarCalendar) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.$$Lambda$ListCalendarView$cM6enbkBibSobwdAEpxsV_HaEFE */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                ListCalendarView.lambda$cM6enbkBibSobwdAEpxsV_HaEFE(ListCalendarView.this, this.f$1, calendarSetting);
            }
        });
        C30850a aVar = new C30850a(this.f77637b, (LKUIPtrClassicFrameLayout) findViewById(R.id.calendar_rv_ptr_layout), this.f77647l);
        this.f77642g = aVar;
        aVar.mo111782a(new IListDateShowListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.C308464 */

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener
            /* renamed from: a */
            public void mo111710a() {
                ListCalendarView.this.f77647l.mo111800a(ListCalendarView.this.f77643h);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener
            /* renamed from: a */
            public void mo111712a(ArrayList<Integer> arrayList) {
                ListCalendarView.this.f77647l.mo111802a(ListCalendarView.this.f77643h, arrayList);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener
            /* renamed from: a */
            public void mo111711a(int i, int i2, String str, String str2, int i3, boolean z) {
                ListCalendarView.this.f77647l.mo111801a(ListCalendarView.this.f77643h, i, i2, str, str2, i3, z);
            }
        });
        ImageView imageView = this.f77638c;
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            i = R.drawable.ud_icon_vc_toolbar_up_filled;
        } else {
            i = R.drawable.list_calendar_down;
        }
        imageView.setImageResource(i);
        this.f77638c.setColorFilter(C32634ae.m125178a(R.color.ud_N400));
        this.f77639d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.View$OnClickListenerC308475 */

            public void onClick(View view) {
                if (ListCalendarView.this.f77644i == CalendarAttr.CalendarType.MONTH) {
                    GeneralHitPoint.m124240d("close");
                    ListCalendarView.this.mo111748g();
                    return;
                }
                GeneralHitPoint.m124240d("open");
                ListCalendarView.this.mo111747f();
            }
        });
        this.f77637b.setOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.C308486 */

            /* renamed from: a */
            boolean f77663a = true;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (i2 > 0) {
                    if (this.f77663a) {
                        ListCalendarView.this.mo111740a("next");
                    }
                    this.f77663a = false;
                } else if (i2 < 0) {
                    if (!this.f77663a) {
                        ListCalendarView.this.mo111740a("prev");
                    }
                    this.f77663a = true;
                }
            }
        });
    }

    public void setCalendarTypeChangedListener(AbstractC30849a aVar) {
        this.f77645j = aVar;
    }

    public void setMonthAdapter(C31181c cVar) {
        this.f77640e.setAdapter(cVar);
    }

    public void setMonthViewPageListener(AbstractC31169a aVar) {
        this.f77640e.setViewPageListener(aVar);
    }

    public void setWeekAdapter(C31189a aVar) {
        this.f77641f.setAdapter(aVar);
    }

    public void setWeekViewPageListener(AbstractC31169a aVar) {
        this.f77641f.setViewPageListener(aVar);
    }

    /* renamed from: b */
    private void m115089b(boolean z) {
        m115092c(z);
        this.f77642g.mo111785b();
        requestLayout();
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.f77656u) {
            m115095m();
            this.f77656u = false;
        }
    }

    public void setRecyclerViewListener(AbstractC30861b bVar) {
        C30850a aVar = this.f77642g;
        if (aVar != null) {
            aVar.mo111783a(bVar);
        }
    }

    /* renamed from: a */
    public void mo111738a(int i) {
        this.f77640e.mo112949a(i);
    }

    public void setSmoothScrollFinishListener(AbstractC31109e eVar) {
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            this.f77640e.setOnSmoothScrollFinishListener(eVar);
        } else {
            this.f77641f.setOnSmoothScrollFinishListener(eVar);
        }
    }

    /* renamed from: c */
    private void m115092c(boolean z) {
        int monthHeight = getMonthHeight();
        mo111741a(z);
        mo111745d();
        C31181c cVar = (C31181c) this.f77640e.getAdapter();
        if (cVar != null) {
            cVar.mo112967g();
        }
        C31189a aVar = (C31189a) this.f77641f.getAdapter();
        if (aVar != null) {
            aVar.mo113013f();
        }
        mo111743b(monthHeight);
    }

    /* renamed from: e */
    private void m115094e(int i) {
        if (this.f77651p.isRunning()) {
            this.f77651p.end();
        }
        int top = this.f77636a.getTop();
        int top2 = this.f77636a.getTop() + i;
        this.f77651p.setIntValues(top, top2);
        this.f77651p.setDuration(100L);
        this.f77651p.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != 3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L_0x0025
            r2 = 2
            if (r0 == r2) goto L_0x000e
            r4 = 3
            if (r0 == r4) goto L_0x0025
            goto L_0x002b
        L_0x000e:
            float r4 = r4.getY()
            int r4 = (int) r4
            int r0 = r3.f77654s
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x001c
            r3.m115091c(r0)
            goto L_0x001f
        L_0x001c:
            r3.m115093d(r0)
        L_0x001f:
            r3.m115096n()
            r3.f77654s = r4
            goto L_0x002b
        L_0x0025:
            r3.m115095m()
            r4 = 0
            r3.f77656u = r4
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m115085a(Context context) {
        setMotionEventSplittingEnabled(false);
        this.f77655t = ao.m125215a();
        this.f77644i = CalendarAttr.CalendarType.WEEK;
        this.f77650o = new ValueAnimator();
        this.f77651p = new ValueAnimator();
        this.f77647l = new ListEventDateLogic(context, false);
        this.f77650o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.C308431 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ListCalendarView.this.f77640e.offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - ListCalendarView.this.f77640e.getTop());
            }
        });
        this.f77651p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.C308442 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ListCalendarView.this.f77636a.offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - ListCalendarView.this.f77636a.getTop());
            }
        });
        this.f77650o.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListCalendarView.C308453 */

            public void onAnimationEnd(Animator animator) {
                if (ListCalendarView.this.f77646k) {
                    ListCalendarView.this.mo111758i();
                } else {
                    ListCalendarView.this.mo111742b();
                }
                ListCalendarView.this.f77645j.mo111734a(ListCalendarView.this.f77644i);
            }
        });
    }

    /* renamed from: c */
    private void m115091c(int i) {
        boolean z;
        if (Math.abs(i) > this.f77655t) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f77646k = z;
        }
        this.f77656u = true;
        int monthHeight = getMonthHeight() - this.f77648m;
        float b = (((float) m115088b(Math.abs(i), monthHeight)) * 1.0f) / ((float) monthHeight);
        int b2 = m115088b((int) Math.ceil((double) (((float) getMonthCalendarOffset()) * b)), getMonthCalendarOffset() + this.f77640e.getTop());
        int b3 = m115088b((int) (((float) getEventContainerOffset()) * b), this.f77636a.getTop() - this.f77648m);
        if (i > 0) {
            this.f77640e.offsetTopAndBottom(-b2);
            this.f77636a.offsetTopAndBottom(-b3);
            return;
        }
        this.f77640e.offsetTopAndBottom(b2);
        this.f77636a.offsetTopAndBottom(b3);
    }

    /* renamed from: d */
    private void m115093d(int i) {
        boolean z;
        if (Math.abs(i) > this.f77655t) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f77646k = z;
        }
        this.f77656u = true;
        this.f77640e.setVisibility(0);
        this.f77641f.setVisibility(4);
        int monthHeight = getMonthHeight() - this.f77648m;
        float b = (((float) m115088b(Math.abs(i), monthHeight)) * 1.0f) / ((float) monthHeight);
        int b2 = m115088b((int) Math.ceil((double) (((float) getMonthCalendarOffset()) * b)), 0 - this.f77640e.getTop());
        int b3 = m115088b((int) (((float) getEventContainerOffset()) * b), getMonthHeight() - this.f77636a.getTop());
        if (i > 0) {
            this.f77640e.offsetTopAndBottom(-b2);
            this.f77636a.offsetTopAndBottom(-b3);
            return;
        }
        this.f77640e.offsetTopAndBottom(b2);
        this.f77636a.offsetTopAndBottom(b3);
    }

    /* renamed from: b */
    public void mo111743b(int i) {
        if (this.f77650o.isRunning()) {
            this.f77650o.end();
        }
        int min = Math.min(this.f77640e.getRowNum() * this.f77648m, this.f77649n) - i;
        if (min != 0 && this.f77644i == CalendarAttr.CalendarType.MONTH) {
            m115094e(min);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f77653r = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.f77652q = y;
            this.f77654s = y;
        } else if (action == 2) {
            int abs = Math.abs(this.f77652q - ((int) motionEvent.getY()));
            int abs2 = Math.abs(this.f77653r - ((int) motionEvent.getX()));
            boolean a = m115087a(this.f77653r, this.f77652q);
            if (abs2 < abs && abs > this.f77655t && a) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo111740a(String str) {
        GeneralHitPoint.m124209a("default_view", str, "list");
    }

    /* renamed from: a */
    public void mo111741a(boolean z) {
        if (z) {
            int dp2px = UIHelper.dp2px(62.0f);
            this.f77648m = dp2px;
            this.f77649n = dp2px * 6;
            return;
        }
        int dp2px2 = UIHelper.dp2px(34.0f);
        this.f77648m = dp2px2;
        this.f77649n = dp2px2 * 6;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m115086a(boolean z, CalendarSetting calendarSetting) {
        boolean isShowLunarCalendar = calendarSetting.isShowLunarCalendar();
        if (isShowLunarCalendar != z) {
            m115089b(isShowLunarCalendar);
        }
    }

    public ListCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C32670u.m125362a(context).inflate(R.layout.list_calendar_view, this);
        m115085a(context);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m115090b(boolean z, CalendarSetting calendarSetting) {
        boolean isShowLunarCalendar = calendarSetting.isShowLunarCalendar();
        if (isShowLunarCalendar != z && (this.f77640e.getAdapter() instanceof C31181c)) {
            m115092c(isShowLunarCalendar);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f77636a.getLayoutParams().height = getMeasuredHeight() - this.f77648m;
    }

    /* renamed from: a */
    private boolean m115087a(int i, int i2) {
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            if (i2 < 0 || i2 >= this.f77649n + UIUtils.dp2px(getContext(), 28.0f)) {
                return false;
            }
            return true;
        } else if (i2 < 0 || i2 >= this.f77648m + UIUtils.dp2px(getContext(), 28.0f)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public void mo111739a(int i, boolean z) {
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            this.f77640e.mo113203a(i, z);
        } else {
            this.f77641f.mo113203a(i, z);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        try {
            super.onNestedScrollAccepted(view, view2, i);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if (f2 < BitmapDescriptorFactory.HUE_RED && this.f77636a.getTop() == getMonthHeight()) {
            return true;
        }
        try {
            return super.onNestedPreFling(view, f, f2);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        try {
            return super.onNestedFling(view, f, f2, z);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m115084a(int i, int i2, int i3, int i4) {
        this.f77650o.setIntValues(i, i2);
        this.f77650o.setDuration(100L);
        this.f77650o.start();
        this.f77651p.setIntValues(i3, i4);
        this.f77651p.setDuration(100L);
        this.f77651p.start();
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.f77644i != CalendarAttr.CalendarType.MONTH) {
            iArr[1] = 0;
        } else if (i2 < 0 && this.f77636a.getTop() == getMonthHeight()) {
            iArr[1] = i2;
        } else if (i2 < 0 && this.f77636a.getTop() < getMonthHeight()) {
            m115091c(i2);
            iArr[1] = i2;
        } else if (i2 > 0) {
            m115091c(i2);
            iArr[1] = i2;
            m115096n();
        } else {
            iArr[1] = 0;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && !this.f77657v) {
            this.f77657v = true;
            int julianDay = new CalendarDate().getJulianDay();
            PagerAdapter adapter = this.f77641f.getAdapter();
            if (adapter instanceof C31189a) {
                julianDay = ((C31189a) adapter).mo113005a().getJulianDay();
            }
            this.f77642g.mo111780a(julianDay, true);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        try {
            super.onNestedScroll(view, i, i2, i3, i4);
        } catch (Throwable unused) {
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f77644i == CalendarAttr.CalendarType.MONTH) {
            i6 = this.f77640e.getTop();
            if (this.f77636a.getTop() == 0) {
                i5 = this.f77649n;
            } else {
                i5 = this.f77636a.getTop();
            }
        } else {
            i6 = -getMonthCalendarOffset();
            i5 = this.f77648m;
        }
        this.f77640e.layout(0, i6, i3, this.f77649n + i6);
        this.f77636a.layout(0, i5, i3, this.f77636a.getLayoutParams().height + i5);
        this.f77641f.layout(0, 0, i3, this.f77648m);
    }
}
