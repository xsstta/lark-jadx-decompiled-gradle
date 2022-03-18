package com.ss.android.lark.mail.impl.utils.bubble;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.utils.C43849u;

public class BubbleLayout extends RelativeLayout {

    /* renamed from: a */
    public static float f111025a;

    /* renamed from: b */
    public boolean f111026b;

    /* renamed from: c */
    public AbstractC43757a f111027c;

    /* renamed from: d */
    public Runnable f111028d;

    /* renamed from: e */
    private ArrowDirection f111029e;

    /* renamed from: f */
    private C43758a f111030f;

    /* renamed from: g */
    private float f111031g;

    /* renamed from: h */
    private float f111032h;

    /* renamed from: i */
    private float f111033i;

    /* renamed from: j */
    private float f111034j;

    /* renamed from: k */
    private int f111035k;

    /* renamed from: l */
    private float f111036l;

    /* renamed from: m */
    private int f111037m;

    /* renamed from: n */
    private int f111038n;

    /* renamed from: o */
    private int f111039o;

    /* renamed from: p */
    private int f111040p;

    /* renamed from: q */
    private int f111041q;

    /* renamed from: r */
    private RadiusShape f111042r;

    /* renamed from: s */
    private float f111043s;

    /* renamed from: t */
    private PopupWindow f111044t;

    /* renamed from: u */
    private boolean f111045u;

    /* renamed from: v */
    private ViewGroup f111046v;

    /* renamed from: com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout$a */
    public interface AbstractC43757a {
        /* renamed from: a */
        void mo155921a();
    }

    public ArrowDirection getArrowDirection() {
        return this.f111029e;
    }

    public float getArrowHeight() {
        return this.f111033i;
    }

    public float getArrowPosition() {
        return this.f111034j;
    }

    public float getArrowWidth() {
        return this.f111031g;
    }

    public int getBubbleColor() {
        return this.f111035k;
    }

    public float getCornersRadius() {
        return this.f111032h;
    }

    public int getStrokeColor() {
        return this.f111037m;
    }

    public float getStrokeWidth() {
        return this.f111036l;
    }

    /* renamed from: a */
    public void mo155905a(View view, int[] iArr, int[] iArr2) {
        int i = 0;
        if (this.f111029e == ArrowDirection.VERTICAL_AUTO) {
            this.f111029e = m173442b(getContext()) / 2 > iArr[1] ? ArrowDirection.TOP : ArrowDirection.BOTTOM;
        }
        int i2 = iArr[1];
        int width = iArr.length > 2 ? iArr[2] : view.getWidth();
        int height = iArr.length > 3 ? iArr[3] : view.getHeight();
        int i3 = (width - ((int) this.f111031g)) / 2;
        int i4 = iArr[0] + i3;
        int i5 = (iArr[0] + i3) - (iArr2[0] / 2);
        int a = m173438a(getContext()) - this.f111039o;
        if (iArr2[0] + i5 > a) {
            i5 = a - iArr2[0];
        }
        int max = Math.max(this.f111038n, i5);
        mo155900a((float) (i4 - max));
        if (this.f111029e == ArrowDirection.TOP || this.f111029e == ArrowDirection.TOP_CENTER) {
            i2 = iArr[1] + height + this.f111040p;
        } else if (this.f111029e == ArrowDirection.BOTTOM || this.f111029e == ArrowDirection.BOTTOM_CENTER) {
            if (iArr2 != null) {
                i = iArr2[1];
            }
            i2 = (iArr[1] - i) - this.f111041q;
        }
        m173441a(view, max, i2);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f111028d;
        if (runnable != null) {
            C43849u.m173829b(runnable);
            this.f111028d = null;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout$3 */
    public static /* synthetic */ class C437563 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111049a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection[] r0 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a = r0
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.LEFT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.RIGHT_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.TOP_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.BOTTOM_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.LEFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.RIGHT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.f111049a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437563.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m173443b() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (C437563.f111049a[this.f111029e.ordinal()]) {
            case 1:
            case 5:
                paddingLeft = (int) (((float) paddingLeft) + this.f111031g);
                break;
            case 2:
            case 6:
                paddingRight = (int) (((float) paddingRight) + this.f111031g);
                break;
            case 3:
            case 7:
                paddingTop = (int) (((float) paddingTop) + this.f111033i);
                break;
            case 4:
            case 8:
                paddingBottom = (int) (((float) paddingBottom) + this.f111033i);
                break;
        }
        float f = this.f111036l;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            paddingLeft = (int) (((float) paddingLeft) + f);
            paddingRight = (int) (((float) paddingRight) + f);
            paddingTop = (int) (((float) paddingTop) + f);
            paddingBottom = (int) (((float) paddingBottom) + f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* renamed from: c */
    private void m173444c() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        switch (C437563.f111049a[this.f111029e.ordinal()]) {
            case 1:
            case 5:
                paddingLeft = (int) (((float) paddingLeft) - this.f111031g);
                break;
            case 2:
            case 6:
                paddingRight = (int) (((float) paddingRight) - this.f111031g);
                break;
            case 3:
            case 7:
                paddingTop = (int) (((float) paddingTop) - this.f111033i);
                break;
            case 4:
            case 8:
                paddingBottom = (int) (((float) paddingBottom) - this.f111033i);
                break;
        }
        float f = this.f111036l;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            paddingLeft = (int) (((float) paddingLeft) - f);
            paddingRight = (int) (((float) paddingRight) - f);
            paddingTop = (int) (((float) paddingTop) - f);
            paddingBottom = (int) (((float) paddingBottom) - f);
        }
        setPadding(Math.max(0, paddingLeft), Math.max(0, paddingTop), Math.max(0, paddingRight), Math.max(0, paddingBottom));
    }

    /* renamed from: d */
    private void m173445d() {
        ViewGroup viewGroup = this.f111046v;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.utils.bubble.$$Lambda$BubbleLayout$80OUHYnqDPEYcmpgk9L246TQjHo */

                public final void onClick(View view) {
                    BubbleLayout.lambda$80OUHYnqDPEYcmpgk9L246TQjHo(BubbleLayout.this, view);
                }
            });
            return;
        }
        PopupWindow popupWindow = this.f111044t;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f111044t = null;
        }
        PopupWindow popupWindow2 = new PopupWindow(getContext());
        this.f111044t = popupWindow2;
        popupWindow2.setContentView(this);
        this.f111044t.setFocusable(this.f111045u);
        this.f111044t.setOutsideTouchable(true);
        this.f111044t.setWidth(-2);
        this.f111044t.setHeight(-2);
        this.f111044t.setAnimationStyle(16973826);
        this.f111044t.setBackgroundDrawable(new ColorDrawable(0));
        this.f111044t.setTouchInterceptor(new View.OnTouchListener() {
            /* class com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.View$OnTouchListenerC437541 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!BubbleLayout.this.f111026b) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if ((motionEvent.getAction() != 0 || (x >= 0 && x < BubbleLayout.this.getWidth() && y >= 0 && y < BubbleLayout.this.getHeight())) && motionEvent.getAction() != 4) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        });
        this.f111044t.setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout.C437552 */

            public void onDismiss() {
                Log.m165389i("BubbleLayout", "onDismiss");
                if (BubbleLayout.this.f111027c != null) {
                    BubbleLayout.this.f111027c.mo155921a();
                }
            }
        });
    }

    /* renamed from: e */
    private int[] m173446e() {
        int i;
        int[] iArr = new int[2];
        float f = this.f111043s;
        if (f >= 1.0f || f <= BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE);
        }
        measure(i, 0);
        iArr[0] = getMeasuredWidth();
        iArr[1] = getMeasuredHeight();
        if (getPaddingBottom() + getPaddingTop() == 0 && this.f111029e == ArrowDirection.VERTICAL_AUTO) {
            iArr[1] = (int) (((float) iArr[1]) + this.f111033i);
        }
        return iArr;
    }

    /* renamed from: a */
    public void mo155902a() {
        ViewGroup viewGroup = this.f111046v;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f111046v.setVisibility(8);
            return;
        }
        PopupWindow popupWindow = this.f111044t;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f111044t.dismiss();
        }
    }

    /* renamed from: a */
    public BubbleLayout mo155901a(boolean z) {
        this.f111045u = z;
        return this;
    }

    public void setListener(AbstractC43757a aVar) {
        this.f111027c = aVar;
    }

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private int m173438a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        return displayMetrics.widthPixels;
    }

    public void dispatchDraw(Canvas canvas) {
        C43758a aVar = this.f111030f;
        if (aVar != null) {
            aVar.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public static int m173437a(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    private int m173442b(Context context) {
        ViewGroup viewGroup = this.f111046v;
        if (viewGroup != null) {
            return viewGroup.getMeasuredHeight();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        return displayMetrics.heightPixels;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m173440a(View view) {
        if (this.f111026b) {
            this.f111046v.setVisibility(8);
            AbstractC43757a aVar = this.f111027c;
            if (aVar != null) {
                aVar.mo155921a();
            }
        }
    }

    /* renamed from: a */
    public BubbleLayout mo155900a(float f) {
        m173444c();
        this.f111034j = f;
        m173443b();
        return this;
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        float f = this.f111043s;
        if (f > BitmapDescriptorFactory.HUE_RED && f < 1.0f && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((float) m173438a(getContext())) * this.f111043s), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public void mo155903a(View view, int[] iArr) {
        m173445d();
        mo155905a(view, iArr, m173446e());
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f111026b = true;
        this.f111045u = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.mbl_arrowDirection, R.attr.mbl_arrowHeight, R.attr.mbl_arrowPosition, R.attr.mbl_arrowWidth, R.attr.mbl_bubbleColor, R.attr.mbl_cornersRadius, R.attr.mbl_marginBottom, R.attr.mbl_marginLeft, R.attr.mbl_marginRight, R.attr.mbl_marginTop, R.attr.mbl_maxWidthPercent, R.attr.mbl_radiusShape, R.attr.mbl_strokeColor, R.attr.mbl_strokeWidth});
        this.f111031g = obtainStyledAttributes.getDimension(3, (float) m173437a(12));
        this.f111033i = obtainStyledAttributes.getDimension(1, (float) m173437a(6));
        this.f111032h = obtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED);
        this.f111034j = obtainStyledAttributes.getDimension(2, (float) m173437a(12));
        this.f111035k = obtainStyledAttributes.getColor(4, -1);
        this.f111036l = obtainStyledAttributes.getDimension(13, f111025a);
        this.f111037m = obtainStyledAttributes.getColor(12, -7829368);
        this.f111038n = (int) obtainStyledAttributes.getDimension(7, (float) m173437a(16));
        this.f111039o = (int) obtainStyledAttributes.getDimension(8, (float) m173437a(16));
        this.f111040p = (int) obtainStyledAttributes.getDimension(9, BitmapDescriptorFactory.HUE_RED);
        this.f111041q = (int) obtainStyledAttributes.getDimension(6, BitmapDescriptorFactory.HUE_RED);
        this.f111043s = obtainStyledAttributes.getFloat(10, BitmapDescriptorFactory.HUE_RED);
        this.f111029e = ArrowDirection.fromInt(obtainStyledAttributes.getInt(0, ArrowDirection.LEFT.getValue()));
        this.f111042r = RadiusShape.fromInt(obtainStyledAttributes.getInt(11, RadiusShape.RECTANGLE.getValue()));
        obtainStyledAttributes.recycle();
        m173443b();
    }

    /* renamed from: a */
    private void m173441a(View view, int i, int i2) {
        ViewGroup viewGroup = this.f111046v;
        if (viewGroup != null) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            this.f111046v.removeAllViews();
            this.f111046v.setPadding(i, i2 - iArr[1], 0, 0);
            if (this.f111046v.getVisibility() != 0) {
                this.f111046v.setVisibility(0);
            }
            this.f111046v.addView(this);
            return;
        }
        PopupWindow popupWindow = this.f111044t;
        if (popupWindow != null) {
            try {
                popupWindow.showAtLocation(view, 0, i, i2);
            } catch (Exception e) {
                Log.m165384e("BubbleLayout", "popupWindow showAtLocation error:", e);
            }
        }
    }

    /* renamed from: a */
    public void mo155904a(View view, int[] iArr, int i) {
        if (iArr != null && iArr.length >= 3) {
            m173445d();
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int a = (iArr[2] - m173437a(12)) / 2;
                int a2 = iArr2[0] + iArr[0] + a + m173437a(16);
                int a3 = (((iArr2[0] + iArr[0]) + a) - (i / 2)) + m173437a(16);
                int a4 = m173438a(getContext()) - m173437a(16);
                if (a3 + i > a4) {
                    a3 = a4 - i;
                }
                int max = Math.max(m173437a(16), a3);
                mo155900a((float) (a2 - max));
                m173441a(view, max, (iArr2[1] + iArr[1]) - m173437a(42));
            }
        }
    }

    /* renamed from: a */
    private void m173439a(int i, int i2, int i3, int i4) {
        if (i2 >= i && i4 >= i3) {
            RectF rectF = new RectF((float) i, (float) i3, (float) i2, (float) i4);
            int i5 = C437563.f111049a[this.f111029e.ordinal()];
            if (i5 == 1 || i5 == 2) {
                this.f111034j = ((float) ((i4 - i3) / 2)) - (this.f111033i / 2.0f);
            } else if (i5 == 3 || i5 == 4) {
                this.f111034j = ((float) ((i2 - i) / 2)) - (this.f111031g / 2.0f);
            }
            this.f111030f = new C43758a(rectF, this.f111031g, this.f111032h, this.f111033i, this.f111034j, this.f111036l, this.f111037m, this.f111035k, this.f111029e, this.f111042r);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m173439a(0, getWidth(), 0, getHeight());
    }
}
