package com.bytedance.ee.bear.wikiv2.common.widget;

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
    protected TextView f32893a;

    /* renamed from: b */
    protected ExpandButton f32894b;

    /* renamed from: c */
    public boolean f32895c;

    /* renamed from: d */
    public int f32896d;

    /* renamed from: e */
    public int f32897e;

    /* renamed from: f */
    public boolean f32898f;

    /* renamed from: g */
    public AbstractC12246b f32899g;

    /* renamed from: h */
    private boolean f32900h;

    /* renamed from: i */
    private int f32901i;

    /* renamed from: j */
    private int f32902j;

    /* renamed from: k */
    private int f32903k;

    /* renamed from: l */
    private Drawable f32904l;

    /* renamed from: m */
    private Drawable f32905m;

    /* renamed from: n */
    private String f32906n;

    /* renamed from: o */
    private String f32907o;

    /* renamed from: p */
    private float f32908p;

    /* renamed from: q */
    private SparseBooleanArray f32909q;

    /* renamed from: r */
    private int f32910r;

    /* renamed from: com.bytedance.ee.bear.wikiv2.common.widget.ExpandableTextView$b */
    public interface AbstractC12246b {
        /* renamed from: a */
        void mo46785a(TextView textView, boolean z);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m50948a();
    }

    public CharSequence getText() {
        TextView textView = this.f32893a;
        if (textView == null) {
            return "";
        }
        return textView.getText();
    }

    /* renamed from: a */
    private void m50948a() {
        Drawable drawable;
        String str;
        this.f32893a = (TextView) findViewById(R.id.expandable_text);
        ExpandButton expandButton = (ExpandButton) findViewById(R.id.expand_collapse);
        this.f32894b = expandButton;
        boolean z = this.f32895c;
        if (z) {
            drawable = this.f32904l;
        } else {
            drawable = this.f32905m;
        }
        if (z) {
            str = this.f32906n;
        } else {
            str = this.f32907o;
        }
        expandButton.mo46767a(drawable, str);
        this.f32894b.setOnClickListener(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32898f;
    }

    public void setOnExpandStateChangeListener(AbstractC12246b bVar) {
        this.f32899g = bVar;
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
    private static int m50946a(TextView textView) {
        return textView.getLayout().getLineTop(textView.getLineCount()) + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
    }

    public void setText(CharSequence charSequence) {
        int i;
        this.f32900h = true;
        this.f32893a.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    public void onClick(View view) {
        C12245a aVar;
        Drawable drawable;
        String str;
        if (this.f32894b.getVisibility() == 0) {
            boolean z = !this.f32895c;
            this.f32895c = z;
            SparseBooleanArray sparseBooleanArray = this.f32909q;
            if (sparseBooleanArray != null) {
                sparseBooleanArray.put(this.f32910r, z);
            }
            this.f32898f = true;
            if (this.f32895c) {
                aVar = new C12245a(this, getHeight(), this.f32901i);
            } else {
                aVar = new C12245a(this, getHeight(), (getHeight() + this.f32902j) - this.f32893a.getHeight());
            }
            ExpandButton expandButton = this.f32894b;
            boolean z2 = this.f32895c;
            if (z2) {
                drawable = this.f32904l;
            } else {
                drawable = this.f32905m;
            }
            if (z2) {
                str = this.f32906n;
            } else {
                str = this.f32907o;
            }
            expandButton.mo46768a(drawable, str, this.f32897e);
            aVar.setFillAfter(true);
            aVar.setAnimationListener(new Animation.AnimationListener() {
                /* class com.bytedance.ee.bear.wikiv2.common.widget.ExpandableTextView.animationAnimation$AnimationListenerC122431 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    ExpandableTextView.this.clearAnimation();
                    ExpandableTextView.this.f32898f = false;
                    if (ExpandableTextView.this.f32899g != null) {
                        ExpandableTextView.this.f32899g.mo46785a(ExpandableTextView.this.f32893a, !ExpandableTextView.this.f32895c);
                    }
                }
            });
            clearAnimation();
            startAnimation(aVar);
        }
    }

    /* renamed from: a */
    private void m50949a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.animAlphaStart, R.attr.animDuration, R.attr.collapseDrawable, R.attr.expandDrawable, R.attr.maxCollapsedLines});
        this.f32903k = obtainStyledAttributes.getInt(4, 8);
        this.f32897e = obtainStyledAttributes.getInt(1, LocationRequest.PRIORITY_INDOOR);
        this.f32908p = obtainStyledAttributes.getFloat(0, 1.0f);
        this.f32904l = obtainStyledAttributes.getDrawable(3);
        this.f32905m = obtainStyledAttributes.getDrawable(2);
        if (this.f32904l == null) {
            this.f32904l = m50947a(getContext(), R.drawable.facade_icon_arrow_down);
        }
        if (this.f32905m == null) {
            this.f32905m = m50947a(getContext(), R.drawable.facade_icon_arrow_up);
        }
        this.f32906n = getResources().getString(R.string.Doc_Wiki_SpaceDetail_ExpandIntroduction);
        this.f32907o = getResources().getString(R.string.Doc_Wiki_SpaceDetail_CollapseIntroduction);
        obtainStyledAttributes.recycle();
        setOrientation(1);
        setVisibility(8);
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32895c = true;
        m50949a(attributeSet);
    }

    /* renamed from: a */
    private static Drawable m50947a(Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.common.widget.ExpandableTextView$a */
    class C12245a extends Animation {

        /* renamed from: b */
        private final View f32914b;

        /* renamed from: c */
        private final int f32915c;

        /* renamed from: d */
        private final int f32916d;

        public boolean willChangeBounds() {
            return true;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            int i = this.f32916d;
            int i2 = this.f32915c;
            int i3 = (int) ((((float) (i - i2)) * f) + ((float) i2));
            ExpandableTextView.this.f32893a.setMaxHeight(i3 - ExpandableTextView.this.f32896d);
            this.f32914b.getLayoutParams().height = i3;
            this.f32914b.requestLayout();
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
        }

        public C12245a(View view, int i, int i2) {
            this.f32914b = view;
            this.f32915c = i;
            this.f32916d = i2;
            setDuration((long) ExpandableTextView.this.f32897e);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f32900h || getVisibility() == 8) {
            super.onMeasure(i, i2);
            return;
        }
        this.f32900h = false;
        this.f32894b.setVisibility(8);
        this.f32893a.setMaxLines(Integer.MAX_VALUE);
        super.onMeasure(i, i2);
        if (this.f32893a.getLineCount() > this.f32903k) {
            this.f32902j = m50946a(this.f32893a);
            if (this.f32895c) {
                this.f32893a.setMaxLines(this.f32903k);
            }
            this.f32894b.setVisibility(0);
            ((LinearLayout.LayoutParams) this.f32893a.getLayoutParams()).bottomMargin = 0;
            super.onMeasure(i, i2);
            if (this.f32895c) {
                this.f32893a.post(new Runnable() {
                    /* class com.bytedance.ee.bear.wikiv2.common.widget.ExpandableTextView.RunnableC122442 */

                    public void run() {
                        ExpandableTextView expandableTextView = ExpandableTextView.this;
                        expandableTextView.f32896d = expandableTextView.getHeight() - ExpandableTextView.this.f32893a.getHeight();
                    }
                });
                this.f32901i = getMeasuredHeight();
            }
        }
    }

    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32895c = true;
        m50949a(attributeSet);
    }
}
