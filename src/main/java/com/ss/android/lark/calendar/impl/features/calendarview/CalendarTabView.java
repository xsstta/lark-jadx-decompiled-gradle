package com.ss.android.lark.calendar.impl.features.calendarview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RotateImageView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.MainTabItemView;
import java.util.Date;

public class CalendarTabView extends MainTabItemView {

    /* renamed from: A */
    private float f76777A;

    /* renamed from: B */
    private float f76778B;

    /* renamed from: C */
    private float f76779C;

    /* renamed from: D */
    private int f76780D;

    /* renamed from: E */
    private int f76781E;

    /* renamed from: F */
    private ValueAnimator f76782F;

    /* renamed from: G */
    private IAccountChangeDependency.IAccountChangeListner f76783G;

    /* renamed from: H */
    private IAccountChangeDependency f76784H;

    /* renamed from: a */
    public float f76785a;

    /* renamed from: b */
    public boolean f76786b;

    /* renamed from: f */
    private Animation f76787f;

    /* renamed from: g */
    private float f76788g;

    /* renamed from: h */
    private boolean f76789h;

    /* renamed from: i */
    private boolean f76790i;

    /* renamed from: j */
    private Context f76791j;

    /* renamed from: k */
    private RotateImageView f76792k;

    /* renamed from: l */
    private RotateImageView f76793l;

    /* renamed from: m */
    private RotateImageView f76794m;

    /* renamed from: n */
    private RotateImageView f76795n;

    /* renamed from: o */
    private RotateImageView f76796o;

    /* renamed from: p */
    private RotateImageView f76797p;

    /* renamed from: q */
    private RelativeLayout f76798q;

    /* renamed from: r */
    private ImageView f76799r;

    /* renamed from: s */
    private ImageView f76800s;

    /* renamed from: t */
    private ImageView f76801t;

    /* renamed from: u */
    private boolean f76802u;

    /* renamed from: v */
    private float f76803v;

    /* renamed from: w */
    private float f76804w;

    /* renamed from: x */
    private float f76805x;

    /* renamed from: y */
    private float f76806y;

    /* renamed from: z */
    private float f76807z;

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m113981l() {
        this.f76789h = true;
    }

    public float getCurrentProgress() {
        return this.f76788g;
    }

    public boolean getIsMoveTodayAnimating() {
        return this.f76786b;
    }

    @Override // com.ss.android.lark.widget.tab.MainTabItemView
    /* renamed from: a */
    public void mo110677a() {
        this.f76790i = DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_icon_color);
        ValueAnimator valueAnimator = this.f76782F;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f76782F.end();
        }
        mo201238b(true);
        m113968c();
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView.RunnableC306591 */

            public void run() {
                CalendarTabView calendarTabView = CalendarTabView.this;
                calendarTabView.mo110679a(BitmapDescriptorFactory.HUE_RED, calendarTabView.f76785a);
            }
        }, 125);
    }

    /* renamed from: a */
    public void mo110678a(float f) {
        mo110680a(this.f76788g, f, LocationRequest.PRIORITY_HD_ACCURACY, false);
    }

    /* renamed from: a */
    public void mo110681a(float f, int i, boolean z) {
        mo110680a(this.f76788g, f, i, z);
    }

    /* renamed from: a */
    public void mo110680a(float f, float f2, int i, final boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.$$Lambda$CalendarTabView$aWXLwAAHS0axmYLRt564jqlfOMg */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CalendarTabView.lambda$aWXLwAAHS0axmYLRt564jqlfOMg(CalendarTabView.this, valueAnimator);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView.C306624 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                if (z) {
                    CalendarTabView.this.f76786b = false;
                }
            }

            public void onAnimationEnd(Animator animator) {
                if (z) {
                    CalendarTabView.this.f76786b = false;
                }
            }

            public void onAnimationStart(Animator animator) {
                if (z) {
                    CalendarTabView.this.f76786b = true;
                }
            }
        });
        ofFloat.start();
    }

    /* renamed from: a */
    private void m113960a(ImageView imageView, float f, int i) {
        int i2;
        imageView.setAlpha(1.0f);
        float abs = Math.abs(f);
        imageView.setTranslationX(this.f76805x * f);
        imageView.setTranslationY(this.f76806y * abs);
        double d = (double) abs;
        float f2 = (float) (1.0d - (0.2d * d));
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setRotation(((float) (i * -5)) - (f * 15.0f));
        if (this.f76790i) {
            i2 = m113951a((float) (0.5d - (d * 0.1d)), R.color.suite_skin_vi_icon_color);
        } else {
            i2 = m113952a(R.color.cal_tab_anim_color_1, R.color.cal_tab_anim_color_2, abs);
        }
        imageView.setColorFilter(i2);
    }

    /* renamed from: a */
    public void mo110682a(int i, boolean z) {
        Log.m165389i("ContactTabView", C32673y.m125378d("setCalendarDay day = " + i + "isInInit = " + z));
        if (i <= 0 || i > 31) {
            Log.m165389i("ContactTabView", "[setCalendarDay]day:" + i + " Illegal day!");
            return;
        }
        int a = m113953a(false, i);
        if (a == 0) {
            Log.m165389i("ContactTabView", "[setCalendarDay]day:" + i + " not found resource.");
        } else if (z) {
            m113957a(a, i);
        } else {
            m113965b(a, i);
        }
    }

    /* renamed from: a */
    private void m113961a(RelativeLayout relativeLayout) {
        this.f76799r = m113964b(relativeLayout);
        this.f76800s = m113964b(relativeLayout);
        this.f76801t = m113964b(relativeLayout);
    }

    /* renamed from: a */
    private void m113962a(RotateImageView rotateImageView, int i, int i2, boolean z) {
        Bitmap a = ao.m125216a(getContext(), i);
        if (this.f76790i) {
            rotateImageView.setBitmap(m113955a(m113954a(a, UIHelper.getColor(R.color.suite_skin_vi_icon_color)), i2, i2));
        } else if (z) {
            rotateImageView.setBitmap(m113955a(m113954a(a, UIHelper.getColor(R.color.primary_pri_500)), i2, i2));
        } else {
            rotateImageView.setBitmap(m113955a(a, i2, i2));
        }
    }

    /* renamed from: i */
    private void m113978i() {
        $$Lambda$CalendarTabView$pJmFTUSLSV3mgO3guU4n984c6tc r0 = new IAccountChangeDependency.IAccountChangeListner() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.$$Lambda$CalendarTabView$pJmFTUSLSV3mgO3guU4n984c6tc */

            @Override // com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency.IAccountChangeListner
            public final void onAccountChange() {
                CalendarTabView.lambda$pJmFTUSLSV3mgO3guU4n984c6tc(CalendarTabView.this);
            }
        };
        this.f76783G = r0;
        this.f76784H.mo108149a(r0);
    }

    /* renamed from: c */
    private void m113968c() {
        if (this.f76787f == null) {
            this.f76787f = getTabAnimation();
        }
        if (this.f76787f != null) {
            getIcon().startAnimation(this.f76787f);
        } else {
            Log.m165383e("ContactTabView", "mTabAnimation is null");
        }
    }

    /* renamed from: e */
    private void m113974e() {
        if (this.f76789h) {
            m113969c(this.f76791j);
            m113966b(this.f76791j);
            m113979j();
            this.f76789h = false;
        }
    }

    /* renamed from: k */
    private void m113980k() {
        RelativeLayout relativeLayout = this.f76798q;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            if (this.f76798q.getParent() instanceof ViewGroup) {
                removeView(this.f76798q);
            }
        }
        this.f76798q = new RelativeLayout(this.f76791j);
    }

    @Override // com.ss.android.lark.widget.tab.MainTabItemView
    /* renamed from: b */
    public void mo110683b() {
        float f = this.f76788g;
        this.f76785a = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            m113973d(f);
            return;
        }
        mo110684b(BitmapDescriptorFactory.HUE_RED);
        mo201238b(false);
        clearAnimation();
    }

    /* renamed from: d */
    private void m113972d() {
        this.f76797p.bringToFront();
        if (this.f76802u) {
            this.f76794m.bringToFront();
            this.f76795n.bringToFront();
        } else {
            this.f76793l.bringToFront();
            this.f76792k.bringToFront();
        }
        this.f76796o.bringToFront();
        mo201240f();
    }

    /* renamed from: j */
    private void m113979j() {
        m113980k();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = UIUtils.dp2px(this.f76791j, 11.0f);
        this.f76798q.setLayoutParams(layoutParams);
        m113961a(this.f76798q);
        m113971c(this.f76798q);
        addView(this.f76798q);
    }

    public void setUpDownArrow(boolean z) {
        this.f76802u = z;
    }

    public CalendarTabView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m113958a(ValueAnimator valueAnimator) {
        mo110684b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void setDateImageViewAlpha(float f) {
        if (!this.f76802u || f >= 0.9f) {
            mo201239c(f);
            this.f76796o.setAlpha(f);
            return;
        }
        mo201239c(BitmapDescriptorFactory.HUE_RED);
        this.f76796o.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    public void setCalendarDayByViewTimeZone(Date date) {
        mo110682a(new CalendarDate(date, C30022a.f74884c.mo108456c().getSafeMobileNormalViewTimezone()).getMonthDay(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Drawable m113963b(int i) {
        int a = m113953a(true, i);
        if (a != 0) {
            return UDIconUtils.getIconDrawable(getContext(), a);
        }
        Log.m165389i("ContactTabView", "[setCalendarDay]day:" + i + " not found resource.");
        return null;
    }

    /* renamed from: c */
    private void m113969c(Context context) {
        this.f76780D = UIUtils.dp2px(context, 22.0f);
        this.f76781E = UIUtils.dp2px(context, 30.0f);
    }

    /* renamed from: b */
    private ImageView m113964b(RelativeLayout relativeLayout) {
        Log.m165389i("ContactTabView", C32673y.m125378d("getBackgroundIconAndAddView"));
        ImageView imageView = new ImageView(this.f76791j);
        imageView.setImageResource(R.drawable.calendar_icon_bg_tab_blue_filled);
        int i = this.f76780D;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(8);
        relativeLayout.addView(imageView);
        return imageView;
    }

    /* renamed from: d */
    private void m113973d(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.f76782F = ofFloat;
        ofFloat.setDuration(200L);
        this.f76782F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView.C306602 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CalendarTabView.this.mo110684b(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f76782F.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.CalendarTabView.C306613 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                CalendarTabView.this.mo110684b(BitmapDescriptorFactory.HUE_RED);
                CalendarTabView.this.mo201238b(false);
            }
        });
        this.f76782F.start();
    }

    /* renamed from: c */
    private void m113971c(RelativeLayout relativeLayout) {
        Log.m165389i("ContactTabView", C32673y.m125378d("addArrowIconImages"));
        this.f76792k = m113956a(R.drawable.ud_icon_calendar_left_colorful, relativeLayout, false);
        this.f76793l = m113956a(R.drawable.ud_icon_calendar_right_colorful, relativeLayout, false);
        this.f76794m = m113956a(R.drawable.ud_icon_calendar_up_colorful, relativeLayout, false);
        this.f76795n = m113956a(R.drawable.ud_icon_calendar_up_colorful, relativeLayout, false);
        this.f76796o = m113956a(R.drawable.calendar_icon_bg_tab_while_filled, relativeLayout, false);
        this.f76797p = m113956a(R.drawable.calendar_icon_bg_tab_while_filled, relativeLayout, false);
    }

    /* renamed from: e */
    private void m113975e(float f) {
        int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i == 0) {
            this.f76792k.setVisibility(8);
            this.f76793l.setVisibility(8);
            this.f76794m.setVisibility(8);
            this.f76795n.setVisibility(8);
            this.f76796o.setVisibility(8);
            this.f76797p.setVisibility(8);
            this.f76799r.setVisibility(8);
            this.f76800s.setVisibility(8);
            this.f76801t.setVisibility(8);
            return;
        }
        if (this.f76802u) {
            this.f76792k.setVisibility(8);
            this.f76793l.setVisibility(8);
        } else {
            this.f76794m.setVisibility(8);
            this.f76795n.setVisibility(8);
        }
        this.f76799r.setVisibility(0);
        this.f76800s.setVisibility(0);
        this.f76801t.setVisibility(0);
        this.f76796o.setVisibility(0);
        this.f76797p.setVisibility(0);
        float f2 = 5.0f * f;
        this.f76796o.setAngle(f2);
        this.f76797p.setAngle(f2);
        if (f < BitmapDescriptorFactory.HUE_RED) {
            if (this.f76802u) {
                this.f76794m.setVisibility(8);
                this.f76795n.setVisibility(0);
                this.f76795n.setAngle(f2);
                return;
            }
            this.f76792k.setVisibility(8);
            this.f76793l.setVisibility(0);
            this.f76793l.setAngle(f2);
        } else if (i <= 0) {
        } else {
            if (this.f76802u) {
                this.f76794m.setVisibility(0);
                this.f76794m.setAngle(f2);
                this.f76795n.setVisibility(8);
                return;
            }
            this.f76792k.setVisibility(0);
            this.f76792k.setAngle(f2);
            this.f76793l.setVisibility(8);
        }
    }

    /* renamed from: f */
    private void m113976f(float f) {
        int i;
        int i2;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            i = -1;
        } else {
            i = 1;
        }
        double d = (double) f;
        if (d <= -1.0d || d >= 1.0d) {
            if (d > 1.0d) {
                i2 = ((int) Math.floor(d)) % 3;
            } else {
                i2 = Math.abs((int) Math.ceil(d)) % 3;
            }
            float f2 = (float) (d % 1.0d);
            if (i2 == 0) {
                this.f76801t.bringToFront();
                this.f76799r.bringToFront();
                this.f76800s.bringToFront();
                m113960a(this.f76800s, f2, i);
                m113967b(this.f76799r, f2, i);
                m113970c(this.f76801t, f2, i);
            } else if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                this.f76800s.bringToFront();
                this.f76801t.bringToFront();
                this.f76799r.bringToFront();
                m113960a(this.f76799r, f2, i);
                m113967b(this.f76801t, f2, i);
                m113970c(this.f76800s, f2, i);
                return;
            }
            this.f76799r.bringToFront();
            this.f76800s.bringToFront();
            this.f76801t.bringToFront();
            m113960a(this.f76801t, f2, i);
            m113967b(this.f76800s, f2, i);
            m113970c(this.f76799r, f2, i);
            this.f76800s.bringToFront();
            this.f76801t.bringToFront();
            this.f76799r.bringToFront();
            m113960a(this.f76799r, f2, i);
            m113967b(this.f76801t, f2, i);
            m113970c(this.f76800s, f2, i);
            return;
        }
        m113977g(f);
    }

    /* renamed from: g */
    private void m113977g(float f) {
        int i;
        int i2;
        float abs = Math.abs(f);
        ImageView imageView = this.f76799r;
        if (this.f76790i) {
            i = m113951a((float) (0.4d - (((double) abs) * 0.25d)), R.color.suite_skin_vi_icon_color);
        } else {
            i = m113952a(R.color.cal_tab_anim_color_1, R.color.cal_tab_anim_color_2, abs);
        }
        imageView.setColorFilter(i);
        this.f76799r.setTranslationX(this.f76803v * f);
        this.f76799r.setTranslationY(this.f76804w * abs);
        double d = (double) abs;
        float f2 = (float) (1.0d - (0.4d * d));
        this.f76799r.setScaleX(f2);
        this.f76799r.setScaleY(f2);
        this.f76799r.setRotation(-25.0f * f);
        ImageView imageView2 = this.f76800s;
        if (this.f76790i) {
            i2 = m113951a((float) (0.5d - (0.1d * d)), R.color.suite_skin_vi_icon_color);
        } else {
            i2 = m113952a(R.color.cal_tab_anim_color_1, R.color.cal_tab_anim_color_2, abs);
        }
        imageView2.setColorFilter(i2);
        this.f76800s.setTranslationX(this.f76805x * f);
        this.f76800s.setTranslationY(this.f76806y * abs);
        float f3 = (float) (1.0d - (d * 0.2d));
        this.f76800s.setScaleX(f3);
        this.f76800s.setScaleY(f3);
        this.f76800s.setRotation(f * -10.0f);
        this.f76800s.bringToFront();
        this.f76801t.setVisibility(8);
    }

    /* renamed from: b */
    private void m113966b(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        this.f76803v = -10.2f * f;
        this.f76804w = 0.033f * f;
        this.f76805x = -5.3f * f;
        this.f76806y = -0.2f * f;
        this.f76807z = -4.9f * f;
        this.f76777A = 0.233f * f;
        this.f76778B = -2.8f * f;
        this.f76779C = f * 0.3f;
    }

    /* renamed from: b */
    public void mo110684b(float f) {
        if (this.f146978c) {
            m113974e();
            this.f76788g = f;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (f >= 1.0f) {
                f = 1.0f;
            } else if (f >= BitmapDescriptorFactory.HUE_RED && f < 1.0f) {
                f2 = 1.0f - f;
            } else if (f >= -1.0f && f < BitmapDescriptorFactory.HUE_RED) {
                f2 = f + 1.0f;
            } else if (f < -1.0f) {
                f = -1.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
                f2 = 1.0f;
            }
            setDateImageViewAlpha(f2);
            m113975e(f);
            m113976f(this.f76788g);
            m113972d();
        }
    }

    /* renamed from: a */
    private void m113959a(Context context) {
        this.f76791j = context;
        m113978i();
        mo110682a(C26279i.m95147a(new Date()), true);
        setId(R.id.tab_calendar);
        setTabTitle(C32634ae.m125182b(R.string.Lark_Legacy_CalendarTab));
    }

    /* renamed from: a */
    public void mo110679a(float f, float f2) {
        mo110680a(f, f2, LocationRequest.PRIORITY_HD_ACCURACY, false);
    }

    public CalendarTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m113951a(float f, int i) {
        int color = UIHelper.getColor(i);
        float f2 = (1.0f - f) * 255.0f;
        int rgb = Color.rgb((int) ((((float) Color.red(color)) * f) + f2), (int) ((((float) Color.green(color)) * f) + f2), (int) ((f * ((float) Color.blue(color))) + f2));
        Log.m165389i("ContactTabView", "the vi skin of CalendarTab icon transparency has worked");
        return rgb;
    }

    /* renamed from: a */
    private int m113953a(boolean z, int i) {
        if (z) {
            return this.f76791j.getResources().getIdentifier("ud_icon_tab_calendar_" + i + "_colorful", "drawable", this.f76791j.getPackageName());
        }
        return this.f76791j.getResources().getIdentifier("ud_icon_calendar_" + i + "_filled", "drawable", this.f76791j.getPackageName());
    }

    /* renamed from: b */
    private void m113965b(int i, int i2) {
        int a = m113953a(true, i2);
        if (a == 0) {
            Log.m165389i("ContactTabView", "[setCalendarDay]day:" + i2 + " not found resource.");
            return;
        }
        mo201234a(UDIconUtils.getIconDrawable(getContext(), i, UDColorUtils.getColor(getContext(), R.color.icon_n3)), UDIconUtils.getIconDrawable(getContext(), a));
        if (this.f146978c) {
            mo201238b(true);
        }
    }

    /* renamed from: a */
    private Bitmap m113954a(Bitmap bitmap, int i) {
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private void m113957a(int i, int i2) {
        mo201235a(UDIconUtils.getIconDrawable(getContext(), i, UDColorUtils.getColor(getContext(), R.color.icon_n3)), new MainTabItemView.AbstractC59196a(i2) {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.$$Lambda$CalendarTabView$3jLxacJYeQVuLlzr5QdurE3Gc1A */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public final Drawable getDrawable() {
                return CalendarTabView.lambda$3jLxacJYeQVuLlzr5QdurE3Gc1A(CalendarTabView.this, this.f$1);
            }
        });
    }

    public CalendarTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76789h = true;
        this.f76784H = C30022a.f74882a.accountChangeDependency();
        m113959a(context);
    }

    /* renamed from: a */
    private Bitmap m113955a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: a */
    private int m113952a(int i, int i2, float f) {
        int color = UIHelper.getColor(i);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        int color2 = UIHelper.getColor(i2);
        return Color.rgb((int) (((float) red) + (((float) (Color.red(color2) - red)) * f)), (int) (((float) green) + (((float) (Color.green(color2) - green)) * f)), (int) (((float) blue) + (((float) (Color.blue(color2) - blue)) * f)));
    }

    /* renamed from: c */
    private void m113970c(ImageView imageView, float f, int i) {
        int i2;
        float abs = Math.abs(f);
        imageView.setTranslationX(((-this.f76803v) * ((float) i)) + (this.f76778B * f));
        imageView.setTranslationY(this.f76804w + (this.f76779C * abs));
        double d = (double) abs;
        float f2 = (float) ((1.0d - (0.25d * d)) * 0.6d);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setRotation(((float) (i * 25)) - (f * 15.0f));
        if (this.f76790i) {
            i2 = m113951a((float) (0.15d - (d * 0.15d)), R.color.suite_skin_vi_icon_color);
        } else {
            i2 = m113952a(R.color.cal_tab_anim_color_3, R.color.cal_tab_anim_color_4, abs);
        }
        imageView.setColorFilter(i2);
        imageView.setAlpha(1.0f - abs);
    }

    /* renamed from: a */
    private RotateImageView m113956a(int i, RelativeLayout relativeLayout, boolean z) {
        this.f76790i = DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_icon_color);
        RotateImageView rotateImageView = new RotateImageView(this.f76791j);
        m113962a(rotateImageView, i, this.f76780D, z);
        int i2 = this.f76781E;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(13);
        rotateImageView.setLayoutParams(layoutParams);
        rotateImageView.setVisibility(8);
        relativeLayout.addView(rotateImageView);
        return rotateImageView;
    }

    /* renamed from: b */
    private void m113967b(ImageView imageView, float f, int i) {
        int i2;
        imageView.setAlpha(1.0f);
        float abs = Math.abs(f);
        imageView.setTranslationX(((-this.f76805x) * ((float) i)) + (this.f76807z * f));
        imageView.setTranslationY(this.f76806y + (this.f76777A * abs));
        double d = ((double) abs) * 0.25d;
        float f2 = (float) ((1.0d - d) * 0.8d);
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        imageView.setRotation(((float) (i * 10)) - (f * 15.0f));
        if (this.f76790i) {
            i2 = m113951a((float) (0.4d - d), R.color.suite_skin_vi_icon_color);
        } else {
            i2 = m113952a(R.color.cal_tab_anim_color_2, R.color.cal_tab_anim_color_3, abs);
        }
        imageView.setColorFilter(i2);
    }
}
