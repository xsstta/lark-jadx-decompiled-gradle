package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Log;
import android.widget.CheckedTextView;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.prolificinteractive.materialcalendarview.C27000i;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.prolificinteractive.materialcalendarview.g */
public class C26998g extends CheckedTextView {

    /* renamed from: a */
    private CalendarDay f67047a;

    /* renamed from: b */
    private int f67048b = -7829368;

    /* renamed from: c */
    private final int f67049c = m98130a(getResources(), 17694720);

    /* renamed from: d */
    private Drawable f67050d;

    /* renamed from: e */
    private Drawable f67051e;

    /* renamed from: f */
    private Drawable f67052f;

    /* renamed from: g */
    private AbstractC26988e f67053g = AbstractC26988e.f67016a;

    /* renamed from: h */
    private boolean f67054h = true;

    /* renamed from: i */
    private boolean f67055i = true;

    /* renamed from: j */
    private boolean f67056j;
    @MaterialCalendarView.ShowOtherDates

    /* renamed from: k */
    private int f67057k = 4;

    /* renamed from: l */
    private final Rect f67058l = new Rect();

    /* renamed from: m */
    private final Rect f67059m = new Rect();

    /* renamed from: b */
    public CalendarDay mo96084b() {
        return this.f67047a;
    }

    /* renamed from: a */
    public void mo96082a(AbstractC26988e eVar) {
        if (eVar == null) {
            eVar = AbstractC26988e.f67016a;
        }
        this.f67053g = eVar;
        CharSequence text = getText();
        Object[] objArr = null;
        if (text instanceof Spanned) {
            objArr = ((Spanned) text).getSpans(0, text.length(), Object.class);
        }
        SpannableString spannableString = new SpannableString(mo96077a());
        if (objArr != null) {
            for (Object obj : objArr) {
                spannableString.setSpan(obj, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo96083a(C27000i iVar) {
        this.f67056j = iVar.mo96098f();
        m98135c();
        mo96085b(iVar.mo96096d());
        mo96080a(iVar.mo96095c());
        List<C27000i.C27001a> e = iVar.mo96097e();
        if (!e.isEmpty()) {
            String a = mo96077a();
            SpannableString spannableString = new SpannableString(mo96077a());
            for (C27000i.C27001a aVar : e) {
                spannableString.setSpan(aVar.f67065a, 0, a.length(), 33);
            }
            setText(spannableString);
            return;
        }
        setText(mo96077a());
    }

    /* renamed from: a */
    public String mo96077a() {
        return this.f67053g.mo96014a(this.f67047a);
    }

    /* renamed from: d */
    private void m98136d() {
        Drawable drawable = this.f67051e;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        Drawable a = m98131a(this.f67048b, this.f67049c, this.f67059m);
        this.f67052f = a;
        setBackgroundDrawable(a);
    }

    /* renamed from: c */
    private void m98135c() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 0;
        if (!this.f67055i || !this.f67054h || this.f67056j) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f67054h || this.f67056j) {
            z2 = false;
        } else {
            z2 = true;
        }
        super.setEnabled(z2);
        boolean a = MaterialCalendarView.m98041a(this.f67057k);
        if (MaterialCalendarView.m98043b(this.f67057k) || a) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean c = MaterialCalendarView.m98044c(this.f67057k);
        boolean z5 = this.f67055i;
        if (!z5 && a) {
            z = true;
        }
        boolean z6 = this.f67054h;
        if (!z6 && z3) {
            z |= z5;
        }
        if (this.f67056j && c) {
            if (!z5 || !z6) {
                z4 = false;
            } else {
                z4 = true;
            }
            z |= z4;
        }
        if (!z5 && z) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        if (!z) {
            i = 4;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public void mo96078a(int i) {
        this.f67048b = i;
        m98136d();
    }

    /* renamed from: b */
    private static Drawable m98134b(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    /* renamed from: b */
    public void mo96085b(Drawable drawable) {
        if (drawable == null) {
            this.f67050d = null;
        } else {
            this.f67050d = drawable.getConstantState().newDrawable(getResources());
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f67050d;
        if (drawable != null) {
            drawable.setBounds(this.f67058l);
            this.f67050d.setState(getDrawableState());
            this.f67050d.draw(canvas);
        }
        this.f67052f.setBounds(this.f67059m);
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public void mo96080a(Drawable drawable) {
        if (drawable == null) {
            this.f67051e = null;
        } else {
            this.f67051e = drawable.getConstantState().newDrawable(getResources());
        }
        m98136d();
    }

    /* renamed from: a */
    public void mo96081a(CalendarDay calendarDay) {
        this.f67047a = calendarDay;
        setText(mo96077a());
    }

    /* renamed from: a */
    private static Drawable m98132a(int i, Rect rect) {
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), null, m98134b(-1));
        if (Build.VERSION.SDK_INT == 21) {
            rippleDrawable.setBounds(rect);
        }
        if (Build.VERSION.SDK_INT == 22) {
            int i2 = (rect.left + rect.right) / 2;
            rippleDrawable.setHotspotBounds(i2, rect.top, i2, rect.bottom);
        }
        return rippleDrawable;
    }

    public C26998g(Context context, CalendarDay calendarDay) {
        super(context);
        mo96078a(this.f67048b);
        setGravity(17);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextAlignment(4);
        }
        mo96081a(calendarDay);
    }

    /* renamed from: a */
    public static int m98130a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    private void m98133a(int i, int i2) {
        int i3;
        int min = Math.min(i2, i);
        int abs = Math.abs(i2 - i) / 2;
        if (Build.VERSION.SDK_INT == 21) {
            i3 = abs / 2;
        } else {
            i3 = abs;
        }
        if (i >= i2) {
            this.f67058l.set(abs, 0, min + abs, i2);
            this.f67059m.set(i3, 0, min + i3, i2);
            return;
        }
        this.f67058l.set(0, abs, i, min + abs);
        this.f67059m.set(0, i3, i, min + i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96079a(@MaterialCalendarView.ShowOtherDates int i, boolean z, boolean z2) {
        this.f67057k = i;
        this.f67055i = z2;
        this.f67054h = z;
        m98135c();
    }

    /* renamed from: a */
    private static Drawable m98131a(int i, int i2, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i2);
        stateListDrawable.addState(new int[]{16842912}, m98134b(i));
        if (Build.VERSION.SDK_INT >= 21) {
            stateListDrawable.addState(new int[]{16842919}, m98132a(i, rect));
        } else {
            stateListDrawable.addState(new int[]{16842919}, m98134b(i));
        }
        stateListDrawable.addState(new int[0], m98134b(0));
        return stateListDrawable;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m98133a(i3 - i, i4 - i2);
        m98136d();
    }
}
