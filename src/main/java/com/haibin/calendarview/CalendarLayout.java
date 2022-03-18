package com.haibin.calendarview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.core.view.C0908j;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class CalendarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f57489a;

    /* renamed from: b */
    C23363o f57490b;

    /* renamed from: c */
    MonthViewPager f57491c;

    /* renamed from: d */
    CalendarView f57492d;

    /* renamed from: e */
    WeekViewPager f57493e;

    /* renamed from: f */
    YearViewPager f57494f;

    /* renamed from: g */
    ViewGroup f57495g;

    /* renamed from: h */
    public int f57496h;

    /* renamed from: i */
    public int f57497i;

    /* renamed from: j */
    public int f57498j;

    /* renamed from: k */
    public boolean f57499k;

    /* renamed from: l */
    public C23350e f57500l;

    /* renamed from: m */
    private int f57501m;

    /* renamed from: n */
    private int f57502n;

    /* renamed from: o */
    private int f57503o;

    /* renamed from: p */
    private int f57504p;

    /* renamed from: q */
    private float f57505q;

    /* renamed from: r */
    private float f57506r;

    /* renamed from: s */
    private int f57507s;

    /* renamed from: t */
    private VelocityTracker f57508t = VelocityTracker.obtain();

    /* renamed from: u */
    private int f57509u;

    /* renamed from: v */
    private int f57510v;

    /* renamed from: com.haibin.calendarview.CalendarLayout$a */
    public interface AbstractC23319a {
        /* renamed from: a */
        boolean mo80973a();
    }

    /* renamed from: d */
    public boolean mo80948d() {
        return mo80947c(240);
    }

    /* renamed from: e */
    public boolean mo80950e() {
        return mo80949d(240);
    }

    /* renamed from: j */
    private void m84669j() {
        this.f57491c.setTranslationY(((float) this.f57498j) * ((this.f57495g.getTranslationY() * 1.0f) / ((float) this.f57497i)));
    }

    /* renamed from: k */
    private void m84670k() {
        if (this.f57493e.getVisibility() != 0 && this.f57500l.f57632m != null && !this.f57489a) {
            this.f57500l.f57632m.mo81035a(false);
        }
    }

    /* renamed from: l */
    private void m84671l() {
        if (this.f57491c.getVisibility() != 0 && this.f57500l.f57632m != null && this.f57489a) {
            this.f57500l.f57632m.mo81035a(true);
        }
    }

    /* renamed from: c */
    public final boolean mo80946c() {
        if (this.f57495g == null || this.f57491c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo80952g() {
        m84670k();
        this.f57493e.getAdapter().notifyDataSetChanged();
        this.f57493e.setVisibility(0);
        this.f57491c.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", mo80946c());
        return bundle;
    }

    private int getCalendarViewHeight() {
        int i;
        int i2;
        if (this.f57491c.getVisibility() == 0) {
            i2 = this.f57500l.mo81182x();
            i = this.f57491c.getHeight();
        } else {
            i2 = this.f57500l.mo81182x();
            i = this.f57500l.mo81108C();
        }
        return i2 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo80951f() {
        if (this.f57495g != null) {
            if ((this.f57502n == 1 || this.f57503o == 1) && this.f57503o != 2) {
                post(new Runnable() {
                    /* class com.haibin.calendarview.CalendarLayout.RunnableC233158 */

                    public void run() {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(CalendarLayout.this.f57495g, "translationY", CalendarLayout.this.f57495g.getTranslationY(), (float) (-CalendarLayout.this.f57497i));
                        ofFloat.setDuration(0L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.haibin.calendarview.CalendarLayout.RunnableC233158.C233161 */

                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                CalendarLayout.this.f57491c.setTranslationY(((float) CalendarLayout.this.f57498j) * ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / ((float) CalendarLayout.this.f57497i)));
                                CalendarLayout.this.f57499k = true;
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() {
                            /* class com.haibin.calendarview.CalendarLayout.RunnableC233158.C233172 */

                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                CalendarLayout.this.f57499k = false;
                                CalendarLayout.this.mo80952g();
                            }
                        });
                        ofFloat.start();
                    }
                });
            } else if (this.f57500l.f57632m != null) {
                post(new Runnable() {
                    /* class com.haibin.calendarview.CalendarLayout.RunnableC233189 */

                    public void run() {
                        CalendarLayout.this.f57500l.f57632m.mo81035a(true);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo80954i() {
        ViewGroup viewGroup = this.f57495g;
        if (viewGroup != null) {
            viewGroup.setTranslationY((float) (getHeight() - this.f57491c.getHeight()));
            this.f57495g.setVisibility(0);
            this.f57495g.animate().translationY(BitmapDescriptorFactory.HUE_RED).setDuration(180).setInterpolator(new LinearInterpolator()).setListener(new AnimatorListenerAdapter() {
                /* class com.haibin.calendarview.CalendarLayout.C233092 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80941a() {
        ViewGroup viewGroup;
        Calendar calendar = this.f57500l.f57635p;
        if (this.f57500l.mo81125T() == 0) {
            this.f57497i = this.f57510v * 5;
        } else {
            this.f57497i = C23349d.m84773a(calendar.getYear(), calendar.getMonth(), this.f57510v, this.f57500l.mo81129X()) - this.f57510v;
        }
        if (this.f57493e.getVisibility() == 0 && (viewGroup = this.f57495g) != null) {
            viewGroup.setTranslationY((float) (-this.f57497i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo80944b() {
        this.f57510v = this.f57500l.mo81108C();
        if (this.f57495g != null) {
            Calendar calendar = this.f57500l.f57635p;
            mo80945b(C23349d.m84777a(calendar, this.f57500l.mo81129X()));
            if (this.f57500l.mo81125T() == 0) {
                this.f57497i = this.f57510v * 5;
            } else {
                this.f57497i = C23349d.m84773a(calendar.getYear(), calendar.getMonth(), this.f57510v, this.f57500l.mo81129X()) - this.f57510v;
            }
            m84669j();
            if (this.f57493e.getVisibility() == 0) {
                this.f57495g.setTranslationY((float) (-this.f57497i));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo80953h() {
        ViewGroup viewGroup = this.f57495g;
        if (viewGroup instanceof AbstractC23319a) {
            return ((AbstractC23319a) viewGroup).mo80973a();
        }
        boolean z = true;
        if (viewGroup instanceof RecyclerView) {
            if (((RecyclerView) viewGroup).computeVerticalScrollOffset() == 0) {
                return true;
            }
            return false;
        } else if (viewGroup instanceof AbsListView) {
            AbsListView absListView = (AbsListView) viewGroup;
            if (absListView.getFirstVisiblePosition() != 0) {
                return false;
            }
            if (absListView.getChildAt(0).getTop() != 0) {
                z = false;
            }
            return z;
        } else if (viewGroup.getScrollY() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f57491c = (MonthViewPager) findViewById(R.id.vp_month);
        this.f57493e = (WeekViewPager) findViewById(R.id.vp_week);
        if (getChildCount() > 0) {
            this.f57492d = (CalendarView) getChildAt(0);
        }
        this.f57495g = (ViewGroup) findViewById(this.f57507s);
        this.f57494f = (YearViewPager) findViewById(R.id.selectLayout);
        ViewGroup viewGroup = this.f57495g;
        if (viewGroup != null) {
            viewGroup.setOverScrollMode(2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo80945b(int i) {
        this.f57498j = (i - 1) * this.f57510v;
    }

    /* renamed from: a */
    private void m84668a(Calendar calendar) {
        mo80942a((C23349d.m84792b(calendar, this.f57500l.mo81129X()) + calendar.getDay()) - 1);
    }

    /* access modifiers changed from: package-private */
    public final void setup(C23350e eVar) {
        Calendar calendar;
        this.f57500l = eVar;
        this.f57510v = eVar.mo81108C();
        if (eVar.f57634o.isAvailable()) {
            calendar = eVar.f57634o;
        } else {
            calendar = eVar.al();
        }
        m84668a(calendar);
        mo80941a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80942a(int i) {
        this.f57498j = (((i + 7) / 7) - 1) * this.f57510v;
    }

    /* renamed from: d */
    public boolean mo80949d(int i) {
        ViewGroup viewGroup;
        if (this.f57496h == 2) {
            requestLayout();
        }
        if (this.f57499k || (viewGroup = this.f57495g) == null) {
            return false;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), (float) (-this.f57497i));
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.haibin.calendarview.CalendarLayout.C233136 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CalendarLayout.this.f57491c.setTranslationY(((float) CalendarLayout.this.f57498j) * ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / ((float) CalendarLayout.this.f57497i)));
                CalendarLayout.this.f57499k = true;
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.haibin.calendarview.CalendarLayout.C233147 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.f57499k = false;
                CalendarLayout.this.mo80952g();
                CalendarLayout.this.f57489a = true;
            }
        });
        ofFloat.start();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        if (bundle.getBoolean("isExpand")) {
            post(new Runnable() {
                /* class com.haibin.calendarview.CalendarLayout.RunnableC233081 */

                public void run() {
                    CalendarLayout.this.mo80947c(0);
                }
            });
        } else {
            post(new Runnable() {
                /* class com.haibin.calendarview.CalendarLayout.RunnableC233103 */

                public void run() {
                    CalendarLayout.this.mo80949d(0);
                }
            });
        }
        super.onRestoreInstanceState(parcelable2);
    }

    /* renamed from: c */
    public boolean mo80947c(int i) {
        if (this.f57499k || this.f57503o == 1 || this.f57495g == null) {
            return false;
        }
        if (this.f57491c.getVisibility() != 0) {
            this.f57493e.setVisibility(8);
            m84671l();
            this.f57489a = false;
            this.f57491c.setVisibility(0);
        }
        ViewGroup viewGroup = this.f57495g;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.haibin.calendarview.CalendarLayout.C233114 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CalendarLayout.this.f57491c.setTranslationY(((float) CalendarLayout.this.f57498j) * ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / ((float) CalendarLayout.this.f57497i)));
                CalendarLayout.this.f57499k = true;
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* class com.haibin.calendarview.CalendarLayout.C233125 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.f57499k = false;
                if (CalendarLayout.this.f57496h == 2) {
                    CalendarLayout.this.requestLayout();
                }
                CalendarLayout.this.mo80943a(true);
                if (CalendarLayout.this.f57500l.f57632m != null && CalendarLayout.this.f57489a) {
                    CalendarLayout.this.f57500l.f57632m.mo81035a(true);
                }
                CalendarLayout.this.f57489a = false;
            }
        });
        ofFloat.start();
        return true;
    }

    /* renamed from: a */
    public void mo80943a(boolean z) {
        if (z) {
            m84671l();
        }
        this.f57493e.setVisibility(8);
        this.f57491c.setVisibility(0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.f57499k) {
            return true;
        }
        if (this.f57496h == 2) {
            return false;
        }
        if (this.f57494f == null || (calendarView = this.f57492d) == null || calendarView.getVisibility() == 8 || (viewGroup = this.f57495g) == null || viewGroup.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i = this.f57503o;
        if (i == 2 || i == 1) {
            return false;
        }
        if (this.f57494f.getVisibility() == 0 || this.f57500l.f57620a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f57489a = !mo80946c();
            this.f57501m = C0908j.m4369b(motionEvent, C0908j.m4368b(motionEvent));
            this.f57505q = y;
            this.f57506r = y;
        } else if (action == 2) {
            float f = y - this.f57506r;
            int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i2 < 0 && this.f57495g.getTranslationY() == ((float) (-this.f57497i))) {
                return false;
            }
            int i3 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i3 > 0 && this.f57495g.getTranslationY() == ((float) (-this.f57497i)) && y >= ((float) C23349d.m84776a(getContext(), 98.0f)) && !mo80953h()) {
                return false;
            }
            if (i3 > 0 && this.f57495g.getTranslationY() == BitmapDescriptorFactory.HUE_RED && y >= ((float) C23349d.m84776a(getContext(), 98.0f))) {
                return false;
            }
            if (Math.abs(f) > ((float) this.f57504p) && ((i3 > 0 && this.f57495g.getTranslationY() <= BitmapDescriptorFactory.HUE_RED) || (i2 < 0 && this.f57495g.getTranslationY() >= ((float) (-this.f57497i))))) {
                this.f57506r = y;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r0 != 6) goto L_0x0140;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: com.haibin.calendarview.CalendarLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private int m84667a(MotionEvent motionEvent, int i) {
        int a = C0908j.m4367a(motionEvent, i);
        if (a == -1) {
            this.f57501m = -1;
        }
        return a;
    }

    public CalendarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.calendar_content_view_id, R.attr.calendar_show_mode, R.attr.default_status, R.attr.gesture_mode});
        this.f57507s = obtainStyledAttributes.getResourceId(0, 0);
        this.f57502n = obtainStyledAttributes.getInt(2, 0);
        this.f57503o = obtainStyledAttributes.getInt(1, 0);
        this.f57496h = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f57504p = viewConfiguration.getScaledTouchSlop();
        this.f57509u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f57495g == null || this.f57492d == null) {
            super.onMeasure(i, i2);
            return;
        }
        int year = this.f57500l.f57635p.getYear();
        int month = this.f57500l.f57635p.getMonth();
        int a = C23349d.m84776a(getContext(), 1.0f) + this.f57500l.mo81182x();
        int a2 = C23349d.m84774a(year, month, this.f57500l.mo81108C(), this.f57500l.mo81129X(), this.f57500l.mo81125T()) + a;
        int size = View.MeasureSpec.getSize(i2);
        if (this.f57500l.aj()) {
            super.onMeasure(i, i2);
            this.f57495g.measure(i, View.MeasureSpec.makeMeasureSpec((size - a) - this.f57500l.mo81108C(), 1073741824));
            ViewGroup viewGroup = this.f57495g;
            viewGroup.layout(viewGroup.getLeft(), this.f57495g.getTop(), this.f57495g.getRight(), this.f57495g.getBottom());
            return;
        }
        if (a2 >= size && this.f57491c.getHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(a2 + a + this.f57500l.mo81182x(), 1073741824);
            size = a2;
        } else if (a2 < size && this.f57491c.getHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (this.f57503o == 2 || this.f57492d.getVisibility() == 8) {
            if (this.f57492d.getVisibility() == 8) {
                a2 = 0;
            } else {
                a2 = this.f57492d.getHeight();
            }
        } else if (this.f57496h != 2 || this.f57499k) {
            size -= a;
            a2 = this.f57510v;
        } else if (!mo80946c()) {
            size -= a;
            a2 = this.f57510v;
        }
        super.onMeasure(i, i2);
        this.f57495g.measure(i, View.MeasureSpec.makeMeasureSpec(size - a2, 1073741824));
        ViewGroup viewGroup2 = this.f57495g;
        viewGroup2.layout(viewGroup2.getLeft(), this.f57495g.getTop(), this.f57495g.getRight(), this.f57495g.getBottom());
    }
}
