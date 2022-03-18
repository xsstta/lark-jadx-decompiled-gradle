package com.bytedance.ee.bear.wiki.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;

public class ExpandableTextView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    protected TextView f32263a;

    /* renamed from: b */
    protected ExpandButton f32264b;

    /* renamed from: c */
    public boolean f32265c;

    /* renamed from: d */
    public int f32266d;

    /* renamed from: e */
    public int f32267e;

    /* renamed from: f */
    public boolean f32268f;

    /* renamed from: g */
    public AbstractC11938b f32269g;

    /* renamed from: h */
    private boolean f32270h;

    /* renamed from: i */
    private int f32271i;

    /* renamed from: j */
    private int f32272j;

    /* renamed from: k */
    private int f32273k;

    /* renamed from: l */
    private Drawable f32274l;

    /* renamed from: m */
    private Drawable f32275m;

    /* renamed from: n */
    private String f32276n;

    /* renamed from: o */
    private String f32277o;

    /* renamed from: p */
    private float f32278p;

    /* renamed from: q */
    private SparseBooleanArray f32279q;

    /* renamed from: r */
    private int f32280r;

    /* renamed from: com.bytedance.ee.bear.wiki.common.widget.ExpandableTextView$b */
    public interface AbstractC11938b {
        /* renamed from: a */
        void mo45856a(TextView textView, boolean z);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m49491a();
    }

    public CharSequence getText() {
        TextView textView = this.f32263a;
        if (textView == null) {
            return "";
        }
        return textView.getText();
    }

    /* renamed from: a */
    private void m49491a() {
        Drawable drawable;
        String str;
        this.f32263a = (TextView) findViewById(R.id.expandable_text);
        ExpandButton expandButton = (ExpandButton) findViewById(R.id.expand_collapse);
        this.f32264b = expandButton;
        boolean z = this.f32265c;
        if (z) {
            drawable = this.f32274l;
        } else {
            drawable = this.f32275m;
        }
        if (z) {
            str = this.f32276n;
        } else {
            str = this.f32277o;
        }
        expandButton.mo45838a(drawable, str);
        this.f32264b.setOnClickListener(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32268f;
    }

    public void setOnExpandStateChangeListener(AbstractC11938b bVar) {
        this.f32269g = bVar;
    }

    public ExpandableTextView(Context context) {
        this(context, null);
    }

    public void setOrientation(int i) {
        if (i != 0) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
    }

    /* renamed from: a */
    private static int m49489a(TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    public void setText(CharSequence charSequence) {
        int i;
        this.f32270h = true;
        this.f32263a.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    public void onClick(View view) {
        C11937a aVar;
        Drawable drawable;
        String str;
        if (this.f32264b.getVisibility() == 0) {
            boolean z = !this.f32265c;
            this.f32265c = z;
            SparseBooleanArray sparseBooleanArray = this.f32279q;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(this.f32280r, z);
            }
            this.f32268f = true;
            if (this.f32265c) {
                aVar = new C11937a(this, getHeight(), this.f32271i);
            } else {
                aVar = new C11937a(this, getHeight(), (getHeight() + this.f32272j) - this.f32263a.getHeight());
            }
            ExpandButton expandButton = this.f32264b;
            boolean z2 = this.f32265c;
            if (z2) {
                drawable = this.f32274l;
            } else {
                drawable = this.f32275m;
            }
            if (z2) {
                str = this.f32276n;
            } else {
                str = this.f32277o;
            }
            expandButton.mo45839a(drawable, str, this.f32267e);
            aVar.setFillAfter(true);
            aVar.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.ee.bear.wiki.common.widget.ExpandableTextView.animationAnimation$AnimationListenerC119351 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    ExpandableTextView.this.clearAnimation();
                    ExpandableTextView.this.f32268f = false;
                    if (ExpandableTextView.this.f32269g != null) {
                        ExpandableTextView.this.f32269g.mo45856a(ExpandableTextView.this.f32263a, !ExpandableTextView.this.f32265c);
                    }
                }
            });
            clearAnimation();
            startAnimation(aVar);
        }
    }

    /* renamed from: a */
    private void m49492a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.animAlphaStart, R.attr.animDuration, R.attr.collapseDrawable, R.attr.expandDrawable, R.attr.maxCollapsedLines});
        this.f32273k = obtainStyledAttributes.getInt(4, 8);
        this.f32267e = obtainStyledAttributes.getInt(1, LocationRequest.PRIORITY_INDOOR);
        this.f32278p = obtainStyledAttributes.getFloat(0, 1.0f);
        this.f32274l = obtainStyledAttributes.getDrawable(3);
        this.f32275m = obtainStyledAttributes.getDrawable(2);
        if (this.f32274l == null) {
            this.f32274l = m49490a(getContext(), R.drawable.facade_icon_arrow_down);
        }
        if (this.f32275m == null) {
            this.f32275m = m49490a(getContext(), R.drawable.facade_icon_arrow_up);
        }
        this.f32276n = getResources().getString(R.string.Doc_Wiki_SpaceDetail_ExpandIntroduction);
        this.f32277o = getResources().getString(R.string.Doc_Wiki_SpaceDetail_CollapseIntroduction);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        setVisibility(8);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32265c = true;
        m49492a(attributeSet);
    }

    /* renamed from: a */
    private static Drawable m49490a(Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    /* renamed from: com.bytedance.ee.bear.wiki.common.widget.ExpandableTextView$a */
    class C11937a extends Animation {

        /* renamed from: b */
        private final View f32284b;

        /* renamed from: c */
        private final int f32285c;

        /* renamed from: d */
        private final int f32286d;

        public boolean willChangeBounds() {
            return true;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            int i = this.f32286d;
            int i2 = this.f32285c;
            int i3 = (int) ((((float) (i - i2)) * f) + ((float) i2));
            ExpandableTextView.this.f32263a.setMaxHeight(i3 - ExpandableTextView.this.f32266d);
            this.f32284b.getLayoutParams().height = i3;
            this.f32284b.requestLayout();
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
        }

        public C11937a(View view, int i, int i2) {
            this.f32284b = view;
            this.f32285c = i;
            this.f32286d = i2;
            setDuration((long) ExpandableTextView.this.f32267e);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f32270h || getVisibility() == 8) {
            super.onMeasure(i, i2);
            return;
        }
        this.f32270h = false;
        this.f32264b.setVisibility(8);
        this.f32263a.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        if (this.f32263a.getLineCount() > this.f32273k) {
            this.f32272j = m49489a(this.f32263a);
            if (this.f32265c) {
                this.f32263a.setMaxLines(this.f32273k);
            }
            this.f32264b.setVisibility(0);
            ((LinearLayout.LayoutParams) this.f32263a.getLayoutParams()).bottomMargin = 0;
            super.onMeasure(i, i2);
            if (this.f32265c) {
                this.f32263a.post(new Runnable() {
                    /* class com.bytedance.ee.bear.wiki.common.widget.ExpandableTextView.RunnableC119362 */

                    public void run() {
                        ExpandableTextView expandableTextView = ExpandableTextView.this;
                        expandableTextView.f32266d = expandableTextView.getHeight() - ExpandableTextView.this.f32263a.getHeight();
                    }
                });
                this.f32271i = getMeasuredHeight();
            }
        }
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32265c = true;
        m49492a(attributeSet);
    }
}
