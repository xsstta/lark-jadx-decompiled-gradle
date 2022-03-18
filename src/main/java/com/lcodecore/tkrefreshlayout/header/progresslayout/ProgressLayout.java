package com.lcodecore.tkrefreshlayout.header.progresslayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lcodecore.tkrefreshlayout.AbstractC26394b;
import com.lcodecore.tkrefreshlayout.AbstractC26398c;

public class ProgressLayout extends FrameLayout implements AbstractC26394b {

    /* renamed from: a */
    private int f65246a;

    /* renamed from: b */
    private int f65247b;

    /* renamed from: c */
    private C26419a f65248c;

    /* renamed from: d */
    private MaterialProgressDrawable f65249d;

    /* renamed from: e */
    private boolean f65250e;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    public View getView() {
        return this;
    }

    /* renamed from: b */
    private void m95718b() {
        this.f65248c = new C26419a(getContext(), -328966, 20.0f);
        MaterialProgressDrawable materialProgressDrawable = new MaterialProgressDrawable(getContext(), this);
        this.f65249d = materialProgressDrawable;
        materialProgressDrawable.mo93733b(-328966);
        this.f65248c.setImageDrawable(this.f65249d);
        this.f65248c.setVisibility(8);
        this.f65248c.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(this.f65248c);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93668a() {
        this.f65248c.clearAnimation();
        this.f65249d.stop();
        this.f65248c.setVisibility(8);
        this.f65248c.getBackground().setAlpha(255);
        this.f65249d.setAlpha(255);
        ViewCompat.m4081g(this.f65248c, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4083h(this.f65248c, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4064c((View) this.f65248c, 1.0f);
    }

    public ProgressLayout(Context context) {
        this(context, null);
    }

    public void setColorSchemeColors(int... iArr) {
        this.f65249d.mo93730a(iArr);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f65248c.setBackgroundColor(i);
        this.f65249d.mo93733b(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93671a(final AbstractC26398c cVar) {
        this.f65248c.animate().scaleX(BitmapDescriptorFactory.HUE_RED).scaleY(BitmapDescriptorFactory.HUE_RED).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
            /* class com.lcodecore.tkrefreshlayout.header.progresslayout.ProgressLayout.C264181 */

            public void onAnimationEnd(Animator animator) {
                ProgressLayout.this.mo93668a();
                cVar.mo93557a();
            }
        }).start();
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.f65246a = i2;
                this.f65247b = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.f65246a = i3;
                this.f65247b = i3;
            }
            this.f65248c.setImageDrawable(null);
            this.f65249d.mo93729a(i);
            this.f65248c.setImageDrawable(this.f65249d);
        }
    }

    public ProgressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93669a(float f, float f2) {
        this.f65248c.setVisibility(0);
        this.f65248c.getBackground().setAlpha(255);
        this.f65249d.setAlpha(255);
        ViewCompat.m4081g((View) this.f65248c, 1.0f);
        ViewCompat.m4083h((View) this.f65248c, 1.0f);
        this.f65249d.mo93726a(1.0f);
        this.f65249d.start();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: b */
    public void mo93672b(float f, float f2, float f3) {
        this.f65250e = false;
        if (f >= 1.0f) {
            ViewCompat.m4081g((View) this.f65248c, 1.0f);
            ViewCompat.m4083h((View) this.f65248c, 1.0f);
            return;
        }
        ViewCompat.m4081g(this.f65248c, f);
        ViewCompat.m4083h(this.f65248c, f);
    }

    public ProgressLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f65246a = (int) (displayMetrics.density * 40.0f);
        this.f65247b = (int) (displayMetrics.density * 40.0f);
        m95718b();
        ViewCompat.m4050a((ViewGroup) this, true);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93670a(float f, float f2, float f3) {
        if (!this.f65250e) {
            this.f65250e = true;
            this.f65249d.setAlpha(76);
        }
        if (this.f65248c.getVisibility() != 0) {
            this.f65248c.setVisibility(0);
        }
        if (f >= 1.0f) {
            ViewCompat.m4081g((View) this.f65248c, 1.0f);
            ViewCompat.m4083h((View) this.f65248c, 1.0f);
        } else {
            ViewCompat.m4081g(this.f65248c, f);
            ViewCompat.m4083h(this.f65248c, f);
        }
        if (f <= 1.0f) {
            this.f65249d.setAlpha((int) ((179.0f * f) + 76.0f));
        }
        float max = (((float) Math.max(((double) f) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        this.f65249d.mo93727a(BitmapDescriptorFactory.HUE_RED, Math.min(0.8f, max * 0.8f));
        this.f65249d.mo93726a(Math.min(1.0f, max));
        this.f65249d.mo93731b(((max * 0.4f) - 16.0f) * 0.5f);
    }
}
