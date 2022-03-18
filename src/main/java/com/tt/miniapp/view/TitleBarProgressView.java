package com.tt.miniapp.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;

public class TitleBarProgressView extends FrameLayout {

    /* renamed from: a */
    public TextView f169320a;

    /* renamed from: b */
    private PaintFlagsDrawFilter f169321b = new PaintFlagsDrawFilter(0, 3);

    /* renamed from: c */
    private boolean f169322c;

    /* renamed from: d */
    private Drawable f169323d;

    /* renamed from: e */
    private Drawable f169324e;

    /* renamed from: f */
    private boolean f169325f;

    /* renamed from: g */
    private Animation f169326g;

    /* renamed from: h */
    private ImageView f169327h;

    /* renamed from: i */
    private TextWatcher f169328i = new TextWatcher() {
        /* class com.tt.miniapp.view.TitleBarProgressView.C671491 */

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            TitleBarProgressView.this.mo233508d();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            TitleBarProgressView.this.mo233510e();
        }
    };

    /* renamed from: a */
    public boolean mo233504a() {
        return this.f169322c;
    }

    /* renamed from: b */
    public boolean mo233506b() {
        if (!this.f169325f || getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo233508d() {
        TextView textView = this.f169320a;
        if (textView != null) {
            textView.post(new Runnable() {
                /* class com.tt.miniapp.view.TitleBarProgressView.RunnableC671513 */

                public void run() {
                    Layout layout = TitleBarProgressView.this.f169320a.getLayout();
                    if (layout != null && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
                        int round = Math.round(TitleBarProgressView.this.f169320a.getPaint().measureText(layout.getText().toString()));
                        int width = TitleBarProgressView.this.f169320a.getWidth();
                        if (width > round) {
                            TitleBarProgressView.this.mo233501a((width - round) / 2);
                        }
                    }
                }
            });
        }
    }

    private Drawable getDarkModeRes() {
        if (this.f169323d == null) {
            this.f169323d = getContext().getResources().getDrawable(2131234653);
        }
        return this.f169323d;
    }

    private Drawable getLightModeRes() {
        if (this.f169324e == null) {
            this.f169324e = getContext().getResources().getDrawable(2131234654);
        }
        return this.f169324e;
    }

    /* renamed from: c */
    public void mo233507c() {
        setVisibility(8);
        this.f169325f = false;
        this.f169327h.clearAnimation();
        this.f169320a.removeTextChangedListener(this.f169328i);
        mo233510e();
    }

    /* renamed from: f */
    private void m261771f() {
        ImageView imageView = new ImageView(getContext());
        this.f169327h = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int a = (int) C67590h.m263065a(getContext(), 16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 16;
        layoutParams.topMargin = (int) C67590h.m263065a(getContext(), 0.5f);
        addView(this.f169327h, layoutParams);
        setLayerType(1, null);
    }

    /* renamed from: e */
    public void mo233510e() {
        if (this.f169320a != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).rightMargin = (int) C67590h.m263065a(getContext(), 8.0f);
                setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo233502a(TextView textView) {
        this.f169320a = textView;
    }

    public void setDarkModeDrawable(Drawable drawable) {
        this.f169323d = drawable;
    }

    public void setLightModeDrawable(Drawable drawable) {
        this.f169324e = drawable;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.setDrawFilter(this.f169321b);
    }

    public TitleBarProgressView(Context context) {
        super(context, null);
        m261771f();
    }

    /* renamed from: a */
    public void mo233501a(int i) {
        if (this.f169320a != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).rightMargin -= i;
                setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo233503a(boolean z) {
        if (!this.f169325f) {
            mo233505b(z);
            if (this.f169326g == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.microapp_m_titlebar_loading_anim);
                this.f169326g = loadAnimation;
                loadAnimation.setInterpolator(new LinearInterpolator());
            }
            this.f169327h.startAnimation(this.f169326g);
            mo233508d();
            this.f169320a.addTextChangedListener(this.f169328i);
            this.f169325f = true;
            post(new Runnable() {
                /* class com.tt.miniapp.view.TitleBarProgressView.RunnableC671502 */

                public void run() {
                    TitleBarProgressView.this.setVisibility(0);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo233505b(boolean z) {
        Drawable drawable;
        this.f169322c = z;
        if (z) {
            drawable = getDarkModeRes();
        } else {
            drawable = getLightModeRes();
        }
        if (this.f169327h != null) {
            if (drawable instanceof BitmapDrawable) {
                ((BitmapDrawable) drawable).setAntiAlias(true);
                drawable.setFilterBitmap(true);
            }
            this.f169327h.setImageDrawable(drawable);
        }
    }

    public TitleBarProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m261771f();
    }

    public TitleBarProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        m261771f();
    }
}
