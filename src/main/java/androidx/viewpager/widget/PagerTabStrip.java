package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;

public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: g */
    private int f5477g;

    /* renamed from: h */
    private int f5478h;

    /* renamed from: i */
    private int f5479i;

    /* renamed from: j */
    private int f5480j;

    /* renamed from: k */
    private int f5481k;

    /* renamed from: l */
    private int f5482l;

    /* renamed from: m */
    private final Paint f5483m;

    /* renamed from: n */
    private final Rect f5484n;

    /* renamed from: o */
    private int f5485o;

    /* renamed from: p */
    private boolean f5486p;

    /* renamed from: q */
    private boolean f5487q;

    /* renamed from: r */
    private int f5488r;

    /* renamed from: s */
    private boolean f5489s;

    /* renamed from: t */
    private float f5490t;

    /* renamed from: u */
    private float f5491u;

    /* renamed from: v */
    private int f5492v;

    public boolean getDrawFullUnderline() {
        return this.f5486p;
    }

    public int getTabIndicatorColor() {
        return this.f5477g;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f5481k);
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f5487q) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f5486p = z;
        }
    }

    public void setBackgroundResource(int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f5487q) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5486p = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f5486p = z;
        this.f5487q = true;
        invalidate();
    }

    public void setTabIndicatorColor(int i) {
        this.f5477g = i;
        this.f5483m.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.f5480j;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundColor(int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f5487q) {
            if ((i & -16777216) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f5486p = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f5499c.getLeft() - this.f5482l;
        int right = this.f5499c.getRight() + this.f5482l;
        this.f5483m.setColor((this.f5485o << 24) | (this.f5477g & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f5478h), (float) right, f, this.f5483m);
        if (this.f5486p) {
            this.f5483m.setColor(-16777216 | (this.f5477g & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f5488r), (float) (getWidth() - getPaddingRight()), f, this.f5483m);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f5489s) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f5490t = x;
            this.f5491u = y;
            this.f5489s = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f5490t) > ((float) this.f5492v) || Math.abs(y - this.f5491u) > ((float) this.f5492v))) {
                this.f5489s = true;
            }
        } else if (x < ((float) (this.f5499c.getLeft() - this.f5482l))) {
            this.f5497a.setCurrentItem(this.f5497a.getCurrentItem() - 1);
        } else if (x > ((float) (this.f5499c.getRight() + this.f5482l))) {
            this.f5497a.setCurrentItem(this.f5497a.getCurrentItem() + 1);
        }
        return true;
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f5483m = paint;
        this.f5484n = new Rect();
        this.f5485o = 255;
        this.f5486p = false;
        this.f5487q = false;
        int i = this.f5502f;
        this.f5477g = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5478h = (int) ((3.0f * f) + 0.5f);
        this.f5479i = (int) ((6.0f * f) + 0.5f);
        this.f5480j = (int) (64.0f * f);
        this.f5482l = (int) ((16.0f * f) + 0.5f);
        this.f5488r = (int) ((1.0f * f) + 0.5f);
        this.f5481k = (int) ((f * 32.0f) + 0.5f);
        this.f5492v = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f5498b.setFocusable(true);
        this.f5498b.setOnClickListener(new View.OnClickListener() {
            /* class androidx.viewpager.widget.PagerTabStrip.View$OnClickListenerC15671 */

            public void onClick(View view) {
                PagerTabStrip.this.f5497a.setCurrentItem(PagerTabStrip.this.f5497a.getCurrentItem() - 1);
            }
        });
        this.f5500d.setFocusable(true);
        this.f5500d.setOnClickListener(new View.OnClickListener() {
            /* class androidx.viewpager.widget.PagerTabStrip.View$OnClickListenerC15682 */

            public void onClick(View view) {
                PagerTabStrip.this.f5497a.setCurrentItem(PagerTabStrip.this.f5497a.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.f5486p = true;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: a */
    public void mo8125a(int i, float f, boolean z) {
        Rect rect = this.f5484n;
        int height = getHeight();
        int left = this.f5499c.getLeft() - this.f5482l;
        int right = this.f5499c.getRight() + this.f5482l;
        int i2 = height - this.f5478h;
        rect.set(left, i2, right, height);
        super.mo8125a(i, f, z);
        this.f5485o = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f5499c.getLeft() - this.f5482l, i2, this.f5499c.getRight() + this.f5482l, height);
        invalidate(rect);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f5479i;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }
}
