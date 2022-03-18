package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p980a.C22117b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
public final class C22489f {

    /* renamed from: a */
    public Animator f55315a;

    /* renamed from: b */
    public int f55316b;

    /* renamed from: c */
    public TextView f55317c;

    /* renamed from: d */
    private final Context f55318d;

    /* renamed from: e */
    private final TextInputLayout f55319e;

    /* renamed from: f */
    private LinearLayout f55320f;

    /* renamed from: g */
    private int f55321g;

    /* renamed from: h */
    private FrameLayout f55322h;

    /* renamed from: i */
    private int f55323i;

    /* renamed from: j */
    private final float f55324j;

    /* renamed from: k */
    private int f55325k;

    /* renamed from: l */
    private CharSequence f55326l;

    /* renamed from: m */
    private boolean f55327m;

    /* renamed from: n */
    private CharSequence f55328n;

    /* renamed from: o */
    private int f55329o;

    /* renamed from: p */
    private ColorStateList f55330p;

    /* renamed from: q */
    private CharSequence f55331q;

    /* renamed from: r */
    private boolean f55332r;

    /* renamed from: s */
    private TextView f55333s;

    /* renamed from: t */
    private int f55334t;

    /* renamed from: u */
    private ColorStateList f55335u;

    /* renamed from: v */
    private Typeface f55336v;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo78561a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo78572e() {
        return this.f55327m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo78573f() {
        return this.f55332r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public CharSequence mo78575h() {
        return this.f55326l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo78576i() {
        return this.f55331q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public CharSequence mo78579l() {
        return this.f55328n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78559a(CharSequence charSequence) {
        mo78568c();
        this.f55331q = charSequence;
        this.f55333s.setText(charSequence);
        int i = this.f55316b;
        if (i != 2) {
            this.f55325k = 2;
        }
        m81611a(i, this.f55325k, m81615a(this.f55333s, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78558a(TextView textView, int i) {
        if (this.f55320f == null && this.f55322h == null) {
            LinearLayout linearLayout = new LinearLayout(this.f55318d);
            this.f55320f = linearLayout;
            linearLayout.setOrientation(0);
            this.f55319e.addView(this.f55320f, -1, -2);
            this.f55322h = new FrameLayout(this.f55318d);
            this.f55320f.addView(this.f55322h, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f55319e.getEditText() != null) {
                mo78571d();
            }
        }
        if (mo78561a(i)) {
            this.f55322h.setVisibility(0);
            this.f55322h.addView(textView);
            this.f55323i++;
        } else {
            this.f55320f.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f55320f.setVisibility(0);
        this.f55321g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78560a(boolean z) {
        if (this.f55327m != z) {
            mo78568c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f55318d);
                this.f55317c = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f55317c.setTextAlignment(5);
                }
                Typeface typeface = this.f55336v;
                if (typeface != null) {
                    this.f55317c.setTypeface(typeface);
                }
                mo78563b(this.f55329o);
                mo78556a(this.f55330p);
                mo78570c(this.f55328n);
                this.f55317c.setVisibility(4);
                ViewCompat.m4084h((View) this.f55317c, 1);
                mo78558a(this.f55317c, 0);
            } else {
                mo78562b();
                mo78565b(this.f55317c, 0);
                this.f55317c = null;
                this.f55319e.mo78368c();
                this.f55319e.mo78375f();
            }
            this.f55327m = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78557a(Typeface typeface) {
        if (typeface != this.f55336v) {
            this.f55336v = typeface;
            m81613a(this.f55317c, typeface);
            m81613a(this.f55333s, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78556a(ColorStateList colorStateList) {
        this.f55330p = colorStateList;
        TextView textView = this.f55317c;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78568c() {
        Animator animator = this.f55315a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo78574g() {
        return m81617e(this.f55325k);
    }

    /* renamed from: n */
    private boolean m81618n() {
        if (this.f55320f == null || this.f55319e.getEditText() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo78577j() {
        TextView textView = this.f55317c;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public ColorStateList mo78578k() {
        TextView textView = this.f55317c;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo78580m() {
        TextView textView = this.f55333s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78562b() {
        this.f55326l = null;
        mo78568c();
        if (this.f55316b == 1) {
            if (!this.f55332r || TextUtils.isEmpty(this.f55331q)) {
                this.f55325k = 0;
            } else {
                this.f55325k = 2;
            }
        }
        m81611a(this.f55316b, this.f55325k, m81615a(this.f55317c, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo78571d() {
        if (m81618n()) {
            ViewCompat.m4058b(this.f55320f, ViewCompat.m4094l(this.f55319e.getEditText()), 0, ViewCompat.m4097m(this.f55319e.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78555a() {
        mo78568c();
        int i = this.f55316b;
        if (i == 2) {
            this.f55325k = 0;
        }
        m81611a(i, this.f55325k, m81615a(this.f55333s, (CharSequence) null));
    }

    /* renamed from: d */
    private TextView m81616d(int i) {
        if (i == 1) {
            return this.f55317c;
        }
        if (i != 2) {
            return null;
        }
        return this.f55333s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78563b(int i) {
        this.f55329o = i;
        TextView textView = this.f55317c;
        if (textView != null) {
            this.f55319e.mo78360a(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78569c(int i) {
        this.f55334t = i;
        TextView textView = this.f55333s;
        if (textView != null) {
            TextViewCompat.m4490a(textView, i);
        }
    }

    public C22489f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f55318d = context;
        this.f55319e = textInputLayout;
        this.f55324j = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    private ObjectAnimator m81608a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f55324j, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C22116a.f53782d);
        return ofFloat;
    }

    /* renamed from: e */
    private boolean m81617e(int i) {
        if (i != 1 || this.f55317c == null || TextUtils.isEmpty(this.f55326l)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78564b(ColorStateList colorStateList) {
        this.f55335u = colorStateList;
        TextView textView = this.f55333s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78570c(CharSequence charSequence) {
        this.f55328n = charSequence;
        TextView textView = this.f55317c;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78566b(CharSequence charSequence) {
        mo78568c();
        this.f55326l = charSequence;
        this.f55317c.setText(charSequence);
        int i = this.f55316b;
        if (i != 1) {
            this.f55325k = 1;
        }
        m81611a(i, this.f55325k, m81615a(this.f55317c, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78567b(boolean z) {
        if (this.f55332r != z) {
            mo78568c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f55318d);
                this.f55333s = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f55333s.setTextAlignment(5);
                }
                Typeface typeface = this.f55336v;
                if (typeface != null) {
                    this.f55333s.setTypeface(typeface);
                }
                this.f55333s.setVisibility(4);
                ViewCompat.m4084h((View) this.f55333s, 1);
                mo78569c(this.f55334t);
                mo78564b(this.f55335u);
                mo78558a(this.f55333s, 1);
            } else {
                mo78555a();
                mo78565b(this.f55333s, 1);
                this.f55333s = null;
                this.f55319e.mo78368c();
                this.f55319e.mo78375f();
            }
            this.f55332r = z;
        }
    }

    /* renamed from: a */
    private void m81612a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m81613a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    private ObjectAnimator m81609a(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C22116a.f53779a);
        return ofFloat;
    }

    /* renamed from: a */
    private void m81610a(int i, int i2) {
        TextView d;
        TextView d2;
        if (i != i2) {
            if (!(i2 == 0 || (d2 = m81616d(i2)) == null)) {
                d2.setVisibility(0);
                d2.setAlpha(1.0f);
            }
            if (!(i == 0 || (d = m81616d(i)) == null)) {
                d.setVisibility(4);
                if (i == 1) {
                    d.setText((CharSequence) null);
                }
            }
            this.f55316b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78565b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f55320f != null) {
            if (!mo78561a(i) || (frameLayout = this.f55322h) == null) {
                this.f55320f.removeView(textView);
            } else {
                int i2 = this.f55323i - 1;
                this.f55323i = i2;
                m81612a(frameLayout, i2);
                this.f55322h.removeView(textView);
            }
            int i3 = this.f55321g - 1;
            this.f55321g = i3;
            m81612a(this.f55320f, i3);
        }
    }

    /* renamed from: a */
    private boolean m81615a(TextView textView, CharSequence charSequence) {
        if (!ViewCompat.m4012F(this.f55319e) || !this.f55319e.isEnabled() || (this.f55325k == this.f55316b && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m81611a(final int i, final int i2, boolean z) {
        if (i != i2) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f55315a = animatorSet;
                ArrayList arrayList = new ArrayList();
                m81614a(arrayList, this.f55332r, this.f55333s, 2, i, i2);
                m81614a(arrayList, this.f55327m, this.f55317c, 1, i, i2);
                C22117b.m79707a(animatorSet, arrayList);
                final TextView d = m81616d(i);
                final TextView d2 = m81616d(i2);
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    /* class com.google.android.material.textfield.C22489f.C224901 */

                    public void onAnimationStart(Animator animator) {
                        TextView textView = d2;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }

                    public void onAnimationEnd(Animator animator) {
                        C22489f.this.f55316b = i2;
                        C22489f.this.f55315a = null;
                        TextView textView = d;
                        if (textView != null) {
                            textView.setVisibility(4);
                            if (i == 1 && C22489f.this.f55317c != null) {
                                C22489f.this.f55317c.setText((CharSequence) null);
                            }
                        }
                        TextView textView2 = d2;
                        if (textView2 != null) {
                            textView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                            d2.setAlpha(1.0f);
                        }
                    }
                });
                animatorSet.start();
            } else {
                m81610a(i, i2);
            }
            this.f55319e.mo78368c();
            this.f55319e.mo78363a(z);
            this.f55319e.mo78375f();
        }
    }

    /* renamed from: a */
    private void m81614a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(m81609a(textView, z2));
                if (i3 == i) {
                    list.add(m81608a(textView));
                }
            }
        }
    }
}
