package com.ss.android.lark.multitask.p2373a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.p028b.C0745a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.slideback.SlideFrameLayout;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.multitask.a.c */
public class C48278c extends SlideFrameLayout.C54912g {

    /* renamed from: a */
    FrameLayout f121566a;

    /* renamed from: b */
    ConstraintLayout f121567b;

    /* renamed from: c */
    View f121568c;

    /* renamed from: d */
    TextView f121569d;

    /* renamed from: e */
    Drawable f121570e;

    /* renamed from: f */
    int f121571f;

    /* renamed from: g */
    int f121572g;

    /* renamed from: h */
    AbstractC48280b f121573h;

    /* renamed from: i */
    AbstractC48279a f121574i;

    /* renamed from: j */
    boolean f121575j;

    /* renamed from: k */
    boolean f121576k;

    /* renamed from: l */
    float f121577l = Float.MAX_VALUE;

    /* renamed from: com.ss.android.lark.multitask.a.c$a */
    public interface AbstractC48279a {
        /* renamed from: a */
        void mo168867a(View view);
    }

    /* renamed from: com.ss.android.lark.multitask.a.c$b */
    public interface AbstractC48280b {
        /* renamed from: a */
        int mo168892a();

        /* renamed from: b */
        int mo168893b();

        /* renamed from: c */
        Drawable mo168894c();

        /* renamed from: d */
        int mo168895d();

        /* renamed from: e */
        int mo168896e();
    }

    /* renamed from: a */
    private boolean m190457a(double d, double d2, double d3, double d4, double d5) {
        return d4 >= d - d3 && d4 <= d + d3 && d5 >= d2 - d3 && d5 <= d2 + d3;
    }

    /* renamed from: b */
    public void mo168891b() {
        this.f121576k = true;
    }

    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54914i, com.ss.android.lark.slideback.SlideFrameLayout.C54912g
    /* renamed from: a */
    public void mo168889a(View view, int i, int i2, int i3, int i4) {
        float f;
        super.mo168889a(view, i, i2, i3, i4);
        if (this.f121572g == 2) {
            float f2 = (float) i3;
            if (Math.signum(f2) > BitmapDescriptorFactory.HUE_RED) {
                f = this.f121567b.getTranslationX() + f2;
            } else {
                f = this.f121567b.getTranslationX() - f2;
            }
            this.f121567b.setTranslationX(f);
            this.f121567b.setTranslationY(f);
        }
    }

    /* renamed from: a */
    public void mo168887a() {
        FrameLayout frameLayout = this.f121566a;
        if (frameLayout != null) {
            ((WindowManager) frameLayout.getContext().getSystemService("window")).removeView(this.f121566a);
            this.f121566a = null;
            this.f121570e = null;
            this.f121569d = null;
            this.f121568c = null;
            this.f121567b = null;
        }
    }

    /* renamed from: a */
    public void mo168890a(AbstractC48279a aVar) {
        this.f121574i = aVar;
    }

    public C48278c(AbstractC48280b bVar) {
        this.f121573h = bVar;
    }

    /* renamed from: a */
    private void m190456a(View view) {
        if (this.f121570e == null) {
            this.f121570e = this.f121573h.mo168894c();
        }
        Context context = view.getContext();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 16, -3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f121566a = frameLayout;
        frameLayout.setClipChildren(false);
        this.f121571f = (int) C25653b.m91892a(context, 146.0f);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.f121567b = constraintLayout;
        constraintLayout.setClipChildren(false);
        int i = this.f121571f;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 8388693;
        this.f121566a.addView(this.f121567b, layoutParams2);
        this.f121567b.setTranslationX((float) this.f121571f);
        this.f121567b.setTranslationY((float) this.f121571f);
        View view2 = new View(context);
        this.f121568c = view2;
        view2.setBackground(this.f121570e);
        int i2 = this.f121571f;
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(i2, i2);
        layoutParams3.f2825q = 0;
        layoutParams3.f2827s = 0;
        layoutParams3.f2816h = 0;
        layoutParams3.f2819k = 0;
        this.f121567b.addView(this.f121568c, layoutParams3);
        this.f121569d = new AppCompatTextView(context);
        Drawable drawable = ContextCompat.getDrawable(context, this.f121573h.mo168895d());
        int color = ContextCompat.getColor(context, this.f121573h.mo168896e());
        C0774a.m3766a(drawable, color);
        this.f121569d.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        this.f121569d.setCompoundDrawablePadding(UIHelper.dp2px(8.0f));
        this.f121569d.setTextSize(12.0f);
        this.f121569d.setText(this.f121573h.mo168892a());
        this.f121569d.setTextColor(color);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams4.f2825q = 0;
        layoutParams4.f2827s = 0;
        layoutParams4.f2816h = 0;
        layoutParams4.f2819k = 0;
        layoutParams4.f2834z = 0.67f;
        layoutParams4.f2783A = 0.67f;
        this.f121567b.addView(this.f121569d, layoutParams4);
        ((WindowManager) context.getSystemService("window")).addView(this.f121566a, layoutParams);
    }

    /* renamed from: a */
    private boolean m190458a(float f, float f2) {
        FrameLayout frameLayout = this.f121566a;
        if (frameLayout == null) {
            return false;
        }
        return m190459b((double) frameLayout.getMeasuredWidth(), (double) this.f121566a.getMeasuredHeight(), (double) this.f121571f, (double) f, (double) f2);
    }

    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h, com.ss.android.lark.slideback.SlideFrameLayout.C54912g
    /* renamed from: a */
    public void mo22168a(View view, float f) {
        float f2;
        super.mo22168a(view, f);
        FrameLayout frameLayout = this.f121566a;
        if (frameLayout != null) {
            float measuredWidth = (float) frameLayout.getMeasuredWidth();
            C0745a.m3627a(Math.round(f * measuredWidth), 0, this.f121571f);
            if (f < 0.2f) {
                f2 = (float) this.f121571f;
            } else {
                int i = this.f121571f;
                f2 = C0745a.m3626a(((float) i) - (((1.6666666f * f) - 13.333333f) * measuredWidth), (float) BitmapDescriptorFactory.HUE_RED, (float) i);
            }
            if (this.f121572g == 1) {
                this.f121567b.setTranslationX(f2);
                this.f121567b.setTranslationY(f2);
                String str = null;
                float f3 = this.f121577l;
                int i2 = this.f121571f;
                if (f3 >= ((float) i2) && f2 < ((float) i2)) {
                    str = "zero";
                } else if (f3 >= ((float) i2) * 0.75f && f2 < ((float) i2) * 0.75f) {
                    str = "quarter";
                } else if (f3 >= ((float) i2) * 0.5f && f2 < ((float) i2) * 0.5f) {
                    str = "half";
                } else if (f3 > BitmapDescriptorFactory.HUE_RED && Math.abs(f2) < 0.001f) {
                    str = "complete";
                }
                if (str != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("percentage", str);
                    } catch (JSONException unused) {
                    }
                    Statistics.sendEvent("tasklist_basket_view", jSONObject);
                }
            }
            if (this.f121577l > f2) {
                this.f121577l = f2;
            }
        }
    }

    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h, com.ss.android.lark.slideback.SlideFrameLayout.C54912g
    /* renamed from: a */
    public void mo22169a(View view, int i) {
        super.mo22169a(view, i);
        this.f121572g = i;
        Log.m165389i("MULTITASK-SlideFrameLayoutBasketListener", "onSlideStateChanged, state = " + i);
        if (i == 0) {
            if (this.f121576k) {
                this.f121575j = false;
                this.f121576k = false;
            }
            mo168887a();
        } else if (i == 1 && this.f121566a == null) {
            m190456a(view);
        }
    }

    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54914i, com.ss.android.lark.slideback.SlideFrameLayout.C54912g
    /* renamed from: a */
    public void mo168888a(View view, float f, float f2) {
        int i = this.f121572g;
        if (i != 1 || this.f121566a != null) {
            if (this.f121566a == null) {
                Log.m165397w("MULTITASK-SlideFrameLayoutBasketListener", "BasketContainer == null, state - " + this.f121572g);
                return;
            }
            if (i == 1 || i == 2) {
                if (!m190458a(f, f2)) {
                    this.f121569d.setText(this.f121573h.mo168892a());
                    this.f121568c.setSelected(false);
                    this.f121568c.setScaleX(1.0f);
                    this.f121568c.setScaleY(1.0f);
                } else if (!this.f121568c.isSelected()) {
                    this.f121568c.setSelected(true);
                    this.f121568c.setScaleX(1.2f);
                    this.f121568c.setScaleY(1.2f);
                    Vibrator vibrator = (Vibrator) view.getContext().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(100);
                    }
                    this.f121569d.setText(this.f121573h.mo168893b());
                }
            }
            if (this.f121572g == 2 && m190458a(f, f2) && !this.f121575j) {
                this.f121575j = true;
                if (this.f121574i != null) {
                    Log.m165389i("MULTITASK-SlideFrameLayoutBasketListener", "User drop task into basket");
                    this.f121574i.mo168867a(this.f121566a);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m190459b(double d, double d2, double d3, double d4, double d5) {
        if (!m190457a(d, d2, d3, d4, d5)) {
            return false;
        }
        double d6 = d - d4;
        double d7 = d2 - d5;
        if ((d6 * d6) + (d7 * d7) <= d3 * d3) {
            return true;
        }
        return false;
    }
}
