package com.ss.android.lark.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class ExpandTextView extends AppCompatTextView implements View.OnClickListener {

    /* renamed from: a */
    public int f141870a;

    /* renamed from: b */
    public float f141871b;

    /* renamed from: c */
    public boolean f141872c;

    /* renamed from: e */
    public boolean f141873e;

    /* renamed from: f */
    public AbstractC57572b f141874f;

    /* renamed from: g */
    private int f141875g;

    /* renamed from: h */
    private Drawable f141876h;

    /* renamed from: i */
    private Drawable f141877i;

    /* renamed from: j */
    private int f141878j;

    /* renamed from: k */
    private int f141879k;

    /* renamed from: l */
    private int f141880l;

    /* renamed from: m */
    private boolean f141881m;

    /* renamed from: n */
    private int f141882n;

    /* renamed from: o */
    private int f141883o;

    /* renamed from: p */
    private int f141884p;

    /* renamed from: q */
    private int f141885q;

    /* renamed from: r */
    private int f141886r;

    /* renamed from: s */
    private boolean f141887s;

    /* renamed from: com.ss.android.lark.ui.ExpandTextView$b */
    public interface AbstractC57572b {
        /* renamed from: a */
        void mo179887a(TextView textView, boolean z);

        /* renamed from: a */
        void mo179888a(boolean z);
    }

    /* renamed from: a */
    private boolean m223575a() {
        if (Build.VERSION.SDK_INT >= 11) {
            return true;
        }
        return false;
    }

    public void setCollapseDrawable(Drawable drawable) {
        this.f141877i = drawable;
    }

    public void setCollapsed(boolean z) {
        this.f141872c = z;
    }

    public void setExpandDrawable(Drawable drawable) {
        this.f141876h = drawable;
    }

    public void setMaxCollapsedLines(int i) {
        this.f141875g = i;
    }

    public void setOnExpandStateChangeListener(AbstractC57572b bVar) {
        this.f141874f = bVar;
    }

    public ExpandTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m223574a(TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    public void onClick(View view) {
        ImageSpan imageSpan;
        C57571a aVar;
        if (this.f141881m) {
            this.f141872c = !this.f141872c;
            ImageSpan imageSpan2 = null;
            if (this.f141876h != null) {
                imageSpan = new ImageSpan(this.f141876h);
            } else {
                imageSpan = null;
            }
            if (this.f141877i != null) {
                imageSpan2 = new ImageSpan(this.f141877i);
            }
            SpannableString spannableString = new SpannableString("icon");
            if (!(imageSpan == null || imageSpan2 == null)) {
                if (!this.f141872c) {
                    imageSpan = imageSpan2;
                }
                spannableString.setSpan(imageSpan, 0, 4, 33);
            }
            this.f141873e = true;
            if (this.f141872c) {
                aVar = new C57571a(this, getHeight(), this.f141879k);
            } else {
                aVar = new C57571a(this, getHeight(), this.f141880l);
            }
            aVar.setFillAfter(true);
            aVar.setAnimationListener(new Animation.AnimationListener() {
                /* class com.ss.android.lark.ui.ExpandTextView.animationAnimation$AnimationListenerC575701 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    ExpandTextView.this.clearAnimation();
                    ExpandTextView.this.f141873e = false;
                    if (ExpandTextView.this.f141874f != null) {
                        AbstractC57572b bVar = ExpandTextView.this.f141874f;
                        ExpandTextView expandTextView = ExpandTextView.this;
                        bVar.mo179887a(expandTextView, !expandTextView.f141872c);
                    }
                }

                public void onAnimationStart(Animation animation) {
                    if (ExpandTextView.this.f141874f != null) {
                        ExpandTextView.this.f141874f.mo179888a(!ExpandTextView.this.f141872c);
                    }
                    ExpandTextView expandTextView = ExpandTextView.this;
                    expandTextView.mo195515a(expandTextView, expandTextView.f141871b);
                }
            });
            clearAnimation();
            startAnimation(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable;
        int totalPaddingLeft;
        super.onDraw(canvas);
        Drawable drawable2 = this.f141876h;
        if (drawable2 == null) {
            i2 = 0;
            i = 0;
        } else if (drawable2.getBounds().isEmpty()) {
            i2 = this.f141876h.getIntrinsicHeight();
            i = this.f141876h.getIntrinsicWidth();
        } else {
            i2 = this.f141876h.getBounds().height();
            i = this.f141876h.getBounds().width();
        }
        if (this.f141881m) {
            if (this.f141885q == 0) {
                i4 = (getWidth() - getTotalPaddingRight()) + this.f141886r;
                int i5 = this.f141884p;
                if (i5 == 1) {
                    i3 = getTotalPaddingTop();
                } else if (i5 != 2) {
                    i3 = (getHeight() - getTotalPaddingBottom()) - i2;
                } else {
                    i3 = (getHeight() - i2) / 2;
                }
            } else {
                int height = (getHeight() - getTotalPaddingBottom()) + this.f141886r;
                int i6 = this.f141884p;
                if (i6 == 1) {
                    totalPaddingLeft = getTotalPaddingLeft();
                } else if (i6 != 2) {
                    totalPaddingLeft = (getWidth() - getTotalPaddingRight()) - i;
                } else {
                    totalPaddingLeft = (getWidth() - i) / 2;
                }
                i3 = height;
                i4 = totalPaddingLeft;
            }
            canvas.translate((float) i4, (float) i3);
            if (!this.f141872c || (drawable = this.f141876h) == null) {
                Drawable drawable3 = this.f141877i;
                if (drawable3 != null) {
                    if (drawable3.getBounds().isEmpty()) {
                        Drawable drawable4 = this.f141877i;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), this.f141877i.getIntrinsicHeight());
                    }
                    this.f141877i.draw(canvas);
                    return;
                }
                return;
            }
            if (drawable.getBounds().isEmpty()) {
                this.f141876h.setBounds(0, 0, i, i2);
            }
            this.f141876h.draw(canvas);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setCollapsed(true);
        super.setText(charSequence, bufferType);
    }

    public ExpandTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: com.ss.android.lark.ui.ExpandTextView$a */
    private class C57571a extends Animation {

        /* renamed from: b */
        private final View f141890b;

        /* renamed from: c */
        private final int f141891c;

        /* renamed from: d */
        private final int f141892d;

        public boolean willChangeBounds() {
            return true;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            int i = this.f141892d;
            int i2 = this.f141891c;
            int i3 = (int) ((((float) (i - i2)) * f) + ((float) i2));
            this.f141890b.getLayoutParams().height = i3;
            ExpandTextView.this.setMaxHeight(i3);
            if (Float.compare(ExpandTextView.this.f141871b, 1.0f) != 0) {
                ExpandTextView expandTextView = ExpandTextView.this;
                expandTextView.mo195515a(expandTextView, expandTextView.f141871b + (f * (1.0f - ExpandTextView.this.f141871b)));
            }
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
        }

        public C57571a(View view, int i, int i2) {
            this.f141890b = view;
            this.f141891c = i;
            this.f141892d = i2;
            setDuration((long) ExpandTextView.this.f141870a);
        }
    }

    /* renamed from: a */
    public void mo195515a(View view, float f) {
        if (m223575a()) {
            view.setAlpha(f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
        alphaAnimation.setDuration(0);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        if (getVisibility() == 8 || this.f141873e) {
            super.onMeasure(i, i2);
            return;
        }
        getLayoutParams().height = -2;
        setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        if (getLineCount() <= this.f141875g) {
            this.f141881m = false;
            return;
        }
        this.f141881m = true;
        this.f141880l = m223574a(this);
        if (this.f141872c) {
            setMaxLines(this.f141875g);
        }
        Drawable drawable = this.f141876h;
        if (drawable == null) {
            this.f141882n = 0;
            this.f141883o = 0;
        } else if (drawable.getBounds().isEmpty()) {
            this.f141882n = this.f141876h.getIntrinsicWidth();
            this.f141883o = this.f141876h.getIntrinsicHeight();
        } else {
            this.f141882n = this.f141876h.getBounds().width();
            this.f141883o = this.f141876h.getBounds().height();
        }
        if (!this.f141887s) {
            if (this.f141885q == 0) {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight() + this.f141882n + this.f141886r, getPaddingBottom());
            } else {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + this.f141883o + this.f141886r);
            }
            this.f141887s = true;
        }
        super.onMeasure(i, i2);
        if (this.f141872c) {
            this.f141879k = getMeasuredHeight();
        }
    }

    public ExpandTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f141875g = 8;
        this.f141872c = true;
        this.f141881m = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.animAlphaStart, R.attr.animDuration, R.attr.arrowAlign, R.attr.arrowDrawableSize, R.attr.arrowPadding, R.attr.arrowPosition, R.attr.collapseDrawable, R.attr.expandDrawable, R.attr.maxCollapsedLines}, i, 0);
        this.f141875g = obtainStyledAttributes.getInt(8, 8);
        this.f141870a = obtainStyledAttributes.getInt(1, LocationRequest.PRIORITY_INDOOR);
        this.f141871b = obtainStyledAttributes.getFloat(0, 0.7f);
        this.f141876h = obtainStyledAttributes.getDrawable(7);
        this.f141877i = obtainStyledAttributes.getDrawable(6);
        this.f141878j = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int color = UIUtils.getColor(context, R.color.icon_n3);
        Drawable drawable = this.f141876h;
        if (drawable != null) {
            drawable.mutate();
            this.f141876h.setTint(color);
            int i2 = this.f141878j;
            if (i2 > 0) {
                this.f141876h.setBounds(0, 0, i2, i2);
            }
        }
        Drawable drawable2 = this.f141877i;
        if (drawable2 != null) {
            drawable2.mutate();
            this.f141877i.setTint(color);
            int i3 = this.f141878j;
            if (i3 > 0) {
                this.f141877i.setBounds(0, 0, i3, i3);
            }
        }
        this.f141884p = obtainStyledAttributes.getInteger(2, 0);
        this.f141885q = obtainStyledAttributes.getInteger(5, 0);
        this.f141886r = (int) obtainStyledAttributes.getDimension(4, (float) UIUtils.dp2px(context, 2.0f));
        obtainStyledAttributes.recycle();
        setClickable(true);
        setOnClickListener(this);
    }
}
