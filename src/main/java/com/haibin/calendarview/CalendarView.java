package com.haibin.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.haibin.calendarview.YearRecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CalendarView extends FrameLayout {

    /* renamed from: a */
    public final C23350e f57522a;

    /* renamed from: b */
    public MonthViewPager f57523b;

    /* renamed from: c */
    public WeekViewPager f57524c;

    /* renamed from: d */
    public YearViewPager f57525d;

    /* renamed from: e */
    public C23363o f57526e;

    /* renamed from: f */
    CalendarLayout f57527f;

    /* renamed from: g */
    private View f57528g;

    /* renamed from: com.haibin.calendarview.CalendarView$a */
    public interface AbstractC23325a {
        /* renamed from: a */
        void mo81029a(Calendar calendar, boolean z);

        /* renamed from: a */
        boolean mo81030a(Calendar calendar);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$b */
    public interface AbstractC23326b {
        /* renamed from: a */
        void mo81031a(Calendar calendar);

        /* renamed from: b */
        void mo81032b(Calendar calendar);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$c */
    public interface AbstractC23327c {
    }

    /* renamed from: com.haibin.calendarview.CalendarView$d */
    public interface AbstractC23328d {
        /* renamed from: a */
        void mo81033a(Calendar calendar, boolean z);

        /* renamed from: b */
        void mo81034b(Calendar calendar, boolean z);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$e */
    public interface AbstractC23329e {
        /* renamed from: a */
        void mo40117a(Calendar calendar);

        /* renamed from: a */
        void mo40118a(Calendar calendar, boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.haibin.calendarview.CalendarView$f */
    public interface AbstractC23330f {
        /* renamed from: a */
        void mo81024a(Calendar calendar, boolean z);

        /* renamed from: b */
        void mo81025b(Calendar calendar, boolean z);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$g */
    public interface AbstractC23331g {
        void onMonthChange(int i, int i2);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$h */
    public interface AbstractC23332h {
        /* renamed from: a */
        void mo81035a(boolean z);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$i */
    public interface AbstractC23333i {
        /* renamed from: a */
        void mo81036a(List<Calendar> list);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$j */
    public interface AbstractC23334j {
        /* renamed from: a */
        void mo81037a(int i);
    }

    /* renamed from: com.haibin.calendarview.CalendarView$k */
    public interface AbstractC23335k {
        /* renamed from: a */
        void mo81038a(boolean z);
    }

    public MonthViewPager getMonthViewPager() {
        return this.f57523b;
    }

    public WeekViewPager getWeekViewPager() {
        return this.f57524c;
    }

    public List<Calendar> getCurrentMonthCalendars() {
        return this.f57523b.getCurrentMonthCalendars();
    }

    public List<Calendar> getCurrentWeekCalendars() {
        return this.f57524c.getCurrentWeekCalendars();
    }

    public final int getMaxMultiSelectSize() {
        return this.f57522a.ac();
    }

    public Calendar getMaxRangeCalendar() {
        return this.f57522a.an();
    }

    public final int getMaxSelectRange() {
        return this.f57522a.ab();
    }

    public Calendar getMinRangeCalendar() {
        return this.f57522a.am();
    }

    public final int getMinSelectRange() {
        return this.f57522a.aa();
    }

    public final List<Calendar> getSelectCalendarRange() {
        return this.f57522a.ao();
    }

    public Calendar getSelectedCalendar() {
        return this.f57522a.f57634o;
    }

    /* renamed from: a */
    public boolean mo80979a() {
        if (this.f57525d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public int getCurDay() {
        return this.f57522a.ad().getDay();
    }

    public int getCurMonth() {
        return this.f57522a.ad().getMonth();
    }

    public int getCurYear() {
        return this.f57522a.ad().getYear();
    }

    /* renamed from: b */
    public final void mo80981b() {
        this.f57526e.onWeekStartChange(this.f57522a.mo81129X());
        this.f57525d.mo81075a();
        this.f57523b.mo81043c();
        this.f57524c.mo81054d();
    }

    public final List<Calendar> getMultiSelectCalendars() {
        ArrayList arrayList = new ArrayList();
        if (this.f57522a.f57636q.size() == 0) {
            return arrayList;
        }
        arrayList.addAll(this.f57522a.f57636q.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() != null && (getParent() instanceof CalendarLayout)) {
            CalendarLayout calendarLayout = (CalendarLayout) getParent();
            this.f57527f = calendarLayout;
            this.f57523b.f57540g = calendarLayout;
            this.f57524c.f57549d = this.f57527f;
            this.f57527f.f57490b = this.f57526e;
            this.f57527f.setup(this.f57522a);
            this.f57527f.mo80951f();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        if (this.f57522a == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.f57522a.f57634o);
        bundle.putSerializable("index_calendar", this.f57522a.f57635p);
        return bundle;
    }

    public CalendarView(Context context) {
        this(context, null);
    }

    public final void setMaxMultiSelectSize(int i) {
        this.f57522a.mo81162d(i);
    }

    public final void setMonthViewScrollable(boolean z) {
        this.f57522a.mo81137a(z);
    }

    public void setOnCalendarLongClickListener(AbstractC23326b bVar) {
        this.f57522a.f57627h = bVar;
    }

    public final void setOnCalendarMultiSelectListener(AbstractC23327c cVar) {
        this.f57522a.f57626g = cVar;
    }

    public final void setOnCalendarRangeSelectListener(AbstractC23328d dVar) {
        this.f57522a.f57625f = dVar;
    }

    public void setOnMonthChangeListener(AbstractC23331g gVar) {
        this.f57522a.f57630k = gVar;
    }

    public void setOnViewChangeListener(AbstractC23332h hVar) {
        this.f57522a.f57632m = hVar;
    }

    public void setOnWeekChangeListener(AbstractC23333i iVar) {
        this.f57522a.f57631l = iVar;
    }

    public void setOnYearChangeListener(AbstractC23334j jVar) {
        this.f57522a.f57629j = jVar;
    }

    public void setOnYearViewChangeListener(AbstractC23335k kVar) {
        this.f57522a.f57633n = kVar;
    }

    public final void setWeekViewScrollable(boolean z) {
        this.f57522a.mo81156b(z);
    }

    public final void setYearViewScrollable(boolean z) {
        this.f57522a.mo81160c(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo80983b(Calendar calendar) {
        C23350e eVar = this.f57522a;
        if (eVar == null || !C23349d.m84788a(calendar, eVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo80980a(Calendar calendar) {
        if (this.f57522a.f57623d == null || !this.f57522a.f57623d.mo81030a(calendar)) {
            return false;
        }
        return true;
    }

    public final void setMonthView(Class<?> cls) {
        if (cls != null && !this.f57522a.mo81177s().equals(cls)) {
            this.f57522a.mo81135a(cls);
            this.f57523b.mo81039a();
        }
    }

    public final void setSchemeDate(Map<String, Calendar> map) {
        this.f57522a.f57622c = map;
        this.f57522a.ak();
        this.f57525d.mo81075a();
        this.f57523b.mo81043c();
        this.f57524c.mo81054d();
    }

    public final void setSelectEndCalendar(Calendar calendar) {
        if (this.f57522a.mo81131Z() == 2 && this.f57522a.f57637r != null) {
            mo80977a(this.f57522a.f57637r, calendar);
        }
    }

    public final void setWeekView(Class<?> cls) {
        if (cls != null && !this.f57522a.mo81179u().equals(cls)) {
            this.f57522a.mo81159c(cls);
            this.f57524c.mo81052b();
        }
    }

    private void setShowMode(int i) {
        if ((i == 0 || i == 1 || i == 2) && this.f57522a.mo81125T() != i) {
            this.f57522a.mo81154b(i);
            this.f57524c.mo81055e();
            this.f57523b.mo81044d();
            this.f57524c.mo81049a();
        }
    }

    private void setWeekStart(int i) {
        if ((i == 1 || i == 2 || i == 7) && i != this.f57522a.mo81129X()) {
            this.f57522a.mo81158c(i);
            this.f57526e.onWeekStartChange(i);
            this.f57526e.onDateSelected(this.f57522a.f57634o, i, false);
            this.f57524c.mo81056f();
            this.f57523b.mo81045e();
            this.f57525d.mo81076b();
        }
    }

    /* renamed from: a */
    public void mo80978a(boolean z) {
        if (mo80979a()) {
            YearViewPager yearViewPager = this.f57525d;
            yearViewPager.setCurrentItem(yearViewPager.getCurrentItem() + 1, z);
        } else if (this.f57524c.getVisibility() == 0) {
            WeekViewPager weekViewPager = this.f57524c;
            weekViewPager.setCurrentItem(weekViewPager.getCurrentItem() + 1, z);
        } else {
            MonthViewPager monthViewPager = this.f57523b;
            monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z);
        }
    }

    /* renamed from: b */
    public void mo80982b(boolean z) {
        if (mo80979a()) {
            YearViewPager yearViewPager = this.f57525d;
            yearViewPager.setCurrentItem(yearViewPager.getCurrentItem() - 1, z);
        } else if (this.f57524c.getVisibility() == 0) {
            WeekViewPager weekViewPager = this.f57524c;
            weekViewPager.setCurrentItem(weekViewPager.getCurrentItem() - 1, z);
        } else {
            MonthViewPager monthViewPager = this.f57523b;
            monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() - 1, z);
        }
    }

    public final void setCalendarItemHeight(int i) {
        if (this.f57522a.mo81108C() != i) {
            this.f57522a.mo81133a(i);
            this.f57523b.mo81046f();
            this.f57524c.mo81057g();
            CalendarLayout calendarLayout = this.f57527f;
            if (calendarLayout != null) {
                calendarLayout.mo80944b();
            }
        }
    }

    public final void setOnCalendarInterceptListener(AbstractC23325a aVar) {
        if (aVar == null) {
            this.f57522a.f57623d = null;
        }
        if (aVar != null && this.f57522a.mo81131Z() != 0) {
            this.f57522a.f57623d = aVar;
            if (aVar.mo81030a(this.f57522a.f57634o)) {
                this.f57522a.f57634o = new Calendar();
            }
        }
    }

    public void setOnCalendarSelectListener(AbstractC23329e eVar) {
        this.f57522a.f57624e = eVar;
        if (this.f57522a.f57624e != null && this.f57522a.mo81131Z() == 0 && mo80983b(this.f57522a.f57634o)) {
            this.f57522a.ak();
        }
    }

    /* renamed from: a */
    public void mo80974a(int i) {
        this.f57525d.setVisibility(8);
        this.f57526e.setVisibility(0);
        if (i != this.f57523b.getCurrentItem()) {
            this.f57523b.setCurrentItem(i, false);
        } else if (!(this.f57522a.f57624e == null || this.f57522a.mo81131Z() == 1)) {
            this.f57522a.f57624e.mo40118a(this.f57522a.f57634o, false);
        }
        this.f57526e.animate().translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(new LinearInterpolator()).setDuration(280).setListener(new AnimatorListenerAdapter() {
            /* class com.haibin.calendarview.CalendarView.C233234 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarView.this.f57526e.setVisibility(0);
            }
        });
        this.f57523b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180).setInterpolator(new LinearInterpolator()).setListener(new AnimatorListenerAdapter() {
            /* class com.haibin.calendarview.CalendarView.C233245 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (CalendarView.this.f57522a.f57633n != null) {
                    CalendarView.this.f57522a.f57633n.mo81038a(true);
                }
                if (CalendarView.this.f57527f != null) {
                    CalendarView.this.f57527f.mo80954i();
                    if (CalendarView.this.f57527f.mo80946c()) {
                        CalendarView.this.f57523b.setVisibility(0);
                    } else {
                        CalendarView.this.f57524c.setVisibility(0);
                        CalendarView.this.f57527f.mo80950e();
                    }
                } else {
                    CalendarView.this.f57523b.setVisibility(0);
                }
                CalendarView.this.f57523b.clearAnimation();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        this.f57522a.f57634o = (Calendar) bundle.getSerializable("selected_calendar");
        this.f57522a.f57635p = (Calendar) bundle.getSerializable("index_calendar");
        if (this.f57522a.f57624e != null) {
            this.f57522a.f57624e.mo40118a(this.f57522a.f57634o, false);
        }
        if (this.f57522a.f57635p != null) {
            mo80975a(this.f57522a.f57635p.getYear(), this.f57522a.f57635p.getMonth(), this.f57522a.f57635p.getDay());
        }
        mo80981b();
        super.onRestoreInstanceState(parcelable2);
    }

    public final void setSelectStartCalendar(Calendar calendar) {
        if (this.f57522a.mo81131Z() != 2 || calendar == null) {
            return;
        }
        if (!mo80983b(calendar)) {
            if (this.f57522a.f57625f != null) {
                this.f57522a.f57625f.mo81033a(calendar, true);
            }
        } else if (!mo80980a(calendar)) {
            this.f57522a.f57638s = null;
            this.f57522a.f57637r = calendar;
            mo80975a(calendar.getYear(), calendar.getMonth(), calendar.getDay());
        } else if (this.f57522a.f57623d != null) {
            this.f57522a.f57623d.mo81029a(calendar, false);
        }
    }

    public final void setWeekBar(Class<?> cls) {
        if (cls != null && !this.f57522a.mo81179u().equals(cls)) {
            this.f57522a.mo81155b(cls);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameContent);
            frameLayout.removeView(this.f57526e);
            try {
                this.f57526e = (C23363o) cls.getConstructor(Context.class).newInstance(getContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
            frameLayout.addView(this.f57526e, 2);
            this.f57526e.setup(this.f57522a);
            this.f57526e.onWeekStartChange(this.f57522a.mo81129X());
            this.f57523b.f57542i = this.f57526e;
            this.f57526e.onDateSelected(this.f57522a.f57634o, this.f57522a.mo81129X(), false);
        }
    }

    /* renamed from: a */
    private void m84687a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.cv_layout_calendar_view, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameContent);
        WeekViewPager weekViewPager = (WeekViewPager) findViewById(R.id.vp_week);
        this.f57524c = weekViewPager;
        weekViewPager.setup(this.f57522a);
        try {
            this.f57526e = (C23363o) this.f57522a.mo81179u().getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        frameLayout.addView(this.f57526e, 2);
        this.f57526e.setup(this.f57522a);
        this.f57526e.onWeekStartChange(this.f57522a.mo81129X());
        View findViewById = findViewById(R.id.line);
        this.f57528g = findViewById;
        findViewById.setBackgroundColor(this.f57522a.mo81175q());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f57528g.getLayoutParams();
        layoutParams.setMargins(this.f57522a.mo81176r(), this.f57522a.mo81182x(), this.f57522a.mo81176r(), 0);
        this.f57528g.setLayoutParams(layoutParams);
        MonthViewPager monthViewPager = (MonthViewPager) findViewById(R.id.vp_month);
        this.f57523b = monthViewPager;
        monthViewPager.f57541h = this.f57524c;
        this.f57523b.f57542i = this.f57526e;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f57523b.getLayoutParams();
        layoutParams2.setMargins(0, this.f57522a.mo81182x() + C23349d.m84776a(context, 1.0f), 0, 0);
        this.f57524c.setLayoutParams(layoutParams2);
        YearViewPager yearViewPager = (YearViewPager) findViewById(R.id.selectLayout);
        this.f57525d = yearViewPager;
        yearViewPager.setBackgroundColor(this.f57522a.mo81174p());
        this.f57525d.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.haibin.calendarview.CalendarView.C233201 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (CalendarView.this.f57524c.getVisibility() != 0 && CalendarView.this.f57522a.f57629j != null) {
                    CalendarView.this.f57522a.f57629j.mo81037a(i + CalendarView.this.f57522a.mo81183y());
                }
            }
        });
        this.f57522a.f57628i = new AbstractC23330f() {
            /* class com.haibin.calendarview.CalendarView.C233212 */

            @Override // com.haibin.calendarview.CalendarView.AbstractC23330f
            /* renamed from: a */
            public void mo81024a(Calendar calendar, boolean z) {
                if (calendar.getYear() != CalendarView.this.f57522a.ad().getYear() || calendar.getMonth() != CalendarView.this.f57522a.ad().getMonth() || CalendarView.this.f57523b.getCurrentItem() == CalendarView.this.f57522a.f57621b) {
                    CalendarView.this.f57522a.f57635p = calendar;
                    if (CalendarView.this.f57522a.mo81131Z() == 0 || z) {
                        CalendarView.this.f57522a.f57634o = calendar;
                    }
                    CalendarView.this.f57524c.mo81051a(CalendarView.this.f57522a.f57635p, false);
                    CalendarView.this.f57523b.mo81042b();
                    if (CalendarView.this.f57526e == null) {
                        return;
                    }
                    if (CalendarView.this.f57522a.mo81131Z() == 0 || z) {
                        CalendarView.this.f57526e.onDateSelected(calendar, CalendarView.this.f57522a.mo81129X(), z);
                    }
                }
            }

            @Override // com.haibin.calendarview.CalendarView.AbstractC23330f
            /* renamed from: b */
            public void mo81025b(Calendar calendar, boolean z) {
                CalendarView.this.f57522a.f57635p = calendar;
                if (CalendarView.this.f57522a.mo81131Z() == 0 || z || CalendarView.this.f57522a.f57635p.equals(CalendarView.this.f57522a.f57634o)) {
                    CalendarView.this.f57522a.f57634o = calendar;
                }
                int year = (((calendar.getYear() - CalendarView.this.f57522a.mo81183y()) * 12) + CalendarView.this.f57522a.f57635p.getMonth()) - CalendarView.this.f57522a.mo81109D();
                CalendarView.this.f57524c.mo81053c();
                CalendarView.this.f57523b.setCurrentItem(year, false);
                CalendarView.this.f57523b.mo81042b();
                if (CalendarView.this.f57526e == null) {
                    return;
                }
                if (CalendarView.this.f57522a.mo81131Z() == 0 || z || CalendarView.this.f57522a.f57635p.equals(CalendarView.this.f57522a.f57634o)) {
                    CalendarView.this.f57526e.onDateSelected(calendar, CalendarView.this.f57522a.mo81129X(), z);
                }
            }
        };
        if (this.f57522a.mo81131Z() != 0) {
            this.f57522a.f57634o = new Calendar();
        } else if (mo80983b(this.f57522a.ad())) {
            C23350e eVar = this.f57522a;
            eVar.f57634o = eVar.al();
        } else {
            C23350e eVar2 = this.f57522a;
            eVar2.f57634o = eVar2.am();
        }
        C23350e eVar3 = this.f57522a;
        eVar3.f57635p = eVar3.f57634o;
        this.f57526e.onDateSelected(this.f57522a.f57634o, this.f57522a.mo81129X(), false);
        this.f57523b.setup(this.f57522a);
        this.f57523b.setCurrentItem(this.f57522a.f57621b);
        this.f57525d.setOnMonthSelectedListener(new YearRecyclerView.AbstractC23341a() {
            /* class com.haibin.calendarview.CalendarView.C233223 */

            @Override // com.haibin.calendarview.YearRecyclerView.AbstractC23341a
            /* renamed from: a */
            public void mo81026a(int i, int i2) {
                CalendarView.this.mo80974a((((i - CalendarView.this.f57522a.mo81183y()) * 12) + i2) - CalendarView.this.f57522a.mo81109D());
                CalendarView.this.f57522a.f57620a = false;
            }
        });
        this.f57525d.setup(this.f57522a);
        this.f57524c.mo81051a(this.f57522a.al(), false);
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57522a = new C23350e(context, attributeSet);
        m84687a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        C23350e eVar = this.f57522a;
        if (eVar == null || !eVar.aj()) {
            super.onMeasure(i, i2);
            return;
        }
        setCalendarItemHeight((size - this.f57522a.mo81182x()) / 6);
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo80977a(Calendar calendar, Calendar calendar2) {
        if (this.f57522a.mo81131Z() == 2 && calendar != null && calendar2 != null) {
            if (mo80980a(calendar)) {
                if (this.f57522a.f57623d != null) {
                    this.f57522a.f57623d.mo81029a(calendar, false);
                }
            } else if (!mo80980a(calendar2)) {
                int differ = calendar2.differ(calendar);
                if (differ < 0 || !mo80983b(calendar) || !mo80983b(calendar2)) {
                    return;
                }
                if (this.f57522a.aa() == -1 || this.f57522a.aa() <= differ + 1) {
                    if (this.f57522a.ab() == -1 || this.f57522a.ab() >= differ + 1) {
                        if (this.f57522a.aa() == -1 && differ == 0) {
                            this.f57522a.f57637r = calendar;
                            this.f57522a.f57638s = null;
                            if (this.f57522a.f57625f != null) {
                                this.f57522a.f57625f.mo81034b(calendar, false);
                            }
                            mo80975a(calendar.getYear(), calendar.getMonth(), calendar.getDay());
                            return;
                        }
                        this.f57522a.f57637r = calendar;
                        this.f57522a.f57638s = calendar2;
                        if (this.f57522a.f57625f != null) {
                            this.f57522a.f57625f.mo81034b(calendar, false);
                            this.f57522a.f57625f.mo81034b(calendar2, true);
                        }
                        mo80975a(calendar.getYear(), calendar.getMonth(), calendar.getDay());
                    } else if (this.f57522a.f57625f != null) {
                        this.f57522a.f57625f.mo81033a(calendar2, false);
                    }
                } else if (this.f57522a.f57625f != null) {
                    this.f57522a.f57625f.mo81033a(calendar2, true);
                }
            } else if (this.f57522a.f57623d != null) {
                this.f57522a.f57623d.mo81029a(calendar2, false);
            }
        }
    }

    /* renamed from: a */
    public void mo80975a(int i, int i2, int i3) {
        mo80976a(i, i2, i3, false);
    }

    /* renamed from: a */
    public void mo80976a(int i, int i2, int i3, boolean z) {
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        if (!calendar.isAvailable() || !mo80983b(calendar)) {
            return;
        }
        if (this.f57522a.f57623d != null && this.f57522a.f57623d.mo81030a(calendar)) {
            this.f57522a.f57623d.mo81029a(calendar, false);
        } else if (this.f57524c.getVisibility() == 0) {
            this.f57524c.mo81050a(i, i2, i3, z);
        } else {
            this.f57523b.mo81041a(i, i2, i3, z);
        }
    }
}
