package com.ss.android.lark.mail.impl.utils.bubble;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.utils.bubble.a */
public class C43758a extends Drawable {

    /* renamed from: a */
    private RectF f111050a;

    /* renamed from: b */
    private Path f111051b = new Path();

    /* renamed from: c */
    private Paint f111052c = new Paint(1);

    /* renamed from: d */
    private Path f111053d;

    /* renamed from: e */
    private Paint f111054e;

    /* renamed from: f */
    private float f111055f;

    /* renamed from: g */
    private float f111056g;

    /* renamed from: h */
    private float f111057h;

    /* renamed from: i */
    private float f111058i;

    /* renamed from: j */
    private float f111059j;

    /* renamed from: k */
    private RadiusShape f111060k;

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return (int) this.f111050a.height();
    }

    public int getIntrinsicWidth() {
        return (int) this.f111050a.width();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.bubble.a$1 */
    public static /* synthetic */ class C437591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111061a;

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
                com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a = r0
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.LEFT_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.TOP_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.RIGHT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.RIGHT_CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.f111061a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection r1 = com.ss.android.lark.mail.impl.utils.bubble.ArrowDirection.BOTTOM_CENTER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.bubble.C43758a.C437591.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f111052c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f111052c.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        if (this.f111059j > BitmapDescriptorFactory.HUE_RED) {
            canvas.drawPath(this.f111053d, this.f111054e);
        }
        canvas.drawPath(this.f111051b, this.f111052c);
    }

    /* renamed from: b */
    private void m173456b(RectF rectF, Path path, float f) {
        path.moveTo(this.f111055f + rectF.left + f, rectF.top + f);
        path.lineTo(rectF.width() - f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo(rectF.left + this.f111055f + f, rectF.bottom - f);
        float f2 = f / 2.0f;
        path.lineTo(rectF.left + this.f111055f + f, (this.f111057h + this.f111058i) - f2);
        path.lineTo(rectF.left + f + f, this.f111058i + (this.f111057h / 2.0f));
        path.lineTo(rectF.left + this.f111055f + f, this.f111058i + f2);
        path.lineTo(rectF.left + this.f111055f + f, rectF.top + f);
        path.close();
    }

    /* renamed from: f */
    private void m173460f(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo((rectF.width() - this.f111055f) - f, rectF.top + f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.f111055f) - f, this.f111058i + f2);
        path.lineTo((rectF.right - f) - f, this.f111058i + (this.f111057h / 2.0f));
        path.lineTo((rectF.right - this.f111055f) - f, (this.f111058i + this.f111057h) - f2);
        path.lineTo((rectF.right - this.f111055f) - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    /* renamed from: h */
    private void m173462h(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + f, rectF.top + f);
        path.lineTo(rectF.right - f, rectF.top + f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.f111057h) - f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.f111055f) + this.f111058i) - f2, (rectF.bottom - this.f111057h) - f);
        path.lineTo(rectF.left + this.f111058i + (this.f111055f / 2.0f), (rectF.bottom - f) - f);
        path.lineTo(rectF.left + this.f111058i + f2, (rectF.bottom - this.f111057h) - f);
        path.lineTo(rectF.left + this.f111058i + f, (rectF.bottom - this.f111057h) - f);
        path.lineTo(rectF.left + f, (rectF.bottom - this.f111057h) - f);
        path.lineTo(rectF.left + f, rectF.top + f);
        path.close();
    }

    /* renamed from: a */
    private void m173454a(RectF rectF, Path path, float f) {
        path.moveTo(this.f111055f + rectF.left + this.f111056g + f, rectF.top + f);
        path.lineTo((rectF.width() - this.f111056g) - f, rectF.top + f);
        path.arcTo(new RectF(rectF.right - this.f111056g, rectF.top + f, rectF.right - f, this.f111056g + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.f111056g) - f);
        path.arcTo(new RectF(rectF.right - this.f111056g, rectF.bottom - this.f111056g, rectF.right - f, rectF.bottom - f), BitmapDescriptorFactory.HUE_RED, 90.0f);
        path.lineTo(rectF.left + this.f111055f + this.f111056g + f, rectF.bottom - f);
        float f2 = rectF.bottom;
        float f3 = this.f111056g;
        path.arcTo(new RectF(rectF.left + this.f111055f + f, f2 - f3, f3 + rectF.left + this.f111055f, rectF.bottom - f), 90.0f, 90.0f);
        float f4 = f / 2.0f;
        path.lineTo(rectF.left + this.f111055f + f, (this.f111057h + this.f111058i) - f4);
        path.lineTo(rectF.left + f + f, this.f111058i + (this.f111057h / 2.0f));
        path.lineTo(rectF.left + this.f111055f + f, this.f111058i + f4);
        path.lineTo(rectF.left + this.f111055f + f, rectF.top + this.f111056g + f);
        path.arcTo(new RectF(rectF.left + this.f111055f + f, rectF.top + f, this.f111056g + rectF.left + this.f111055f, this.f111056g + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: c */
    private void m173457c(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + Math.min(this.f111058i, this.f111056g) + f, rectF.top + this.f111057h + f);
        float f2 = f / 2.0f;
        path.lineTo(rectF.left + this.f111058i + f2, rectF.top + this.f111057h + f);
        path.lineTo(rectF.left + (this.f111055f / 2.0f) + this.f111058i, rectF.top + f + f);
        path.lineTo(((rectF.left + this.f111055f) + this.f111058i) - f2, rectF.top + this.f111057h + f);
        path.lineTo((rectF.right - this.f111056g) - f, rectF.top + this.f111057h + f);
        path.arcTo(new RectF(rectF.right - this.f111056g, rectF.top + this.f111057h + f, rectF.right - f, this.f111056g + rectF.top + this.f111057h), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, (rectF.bottom - this.f111056g) - f);
        path.arcTo(new RectF(rectF.right - this.f111056g, rectF.bottom - this.f111056g, rectF.right - f, rectF.bottom - f), BitmapDescriptorFactory.HUE_RED, 90.0f);
        path.lineTo(rectF.left + this.f111056g + f, rectF.bottom - f);
        float f3 = rectF.bottom;
        float f4 = this.f111056g;
        path.arcTo(new RectF(rectF.left + f, f3 - f4, f4 + rectF.left, rectF.bottom - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, rectF.top + this.f111057h + this.f111056g + f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + this.f111057h + f, this.f111056g + rectF.left, this.f111056g + rectF.top + this.f111057h), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: d */
    private void m173458d(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + this.f111058i + f, rectF.top + this.f111057h + f);
        float f2 = f / 2.0f;
        path.lineTo(rectF.left + this.f111058i + f2, rectF.top + this.f111057h + f);
        path.lineTo(rectF.left + (this.f111055f / 2.0f) + this.f111058i, rectF.top + f + f);
        path.lineTo(((rectF.left + this.f111055f) + this.f111058i) - f2, rectF.top + this.f111057h + f);
        path.lineTo(rectF.right - f, rectF.top + this.f111057h + f);
        path.lineTo(rectF.right - f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.bottom - f);
        path.lineTo(rectF.left + f, rectF.top + this.f111057h + f);
        path.lineTo(rectF.left + this.f111058i + f, rectF.top + this.f111057h + f);
        path.close();
    }

    /* renamed from: e */
    private void m173459e(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + this.f111056g + f, rectF.top + f);
        path.lineTo(((rectF.width() - this.f111056g) - this.f111055f) - f, rectF.top + f);
        path.arcTo(new RectF((rectF.right - this.f111056g) - this.f111055f, rectF.top + f, (rectF.right - this.f111055f) - f, this.f111056g + rectF.top), 270.0f, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo((rectF.right - this.f111055f) - f, this.f111058i + f2);
        path.lineTo((rectF.right - f) - f, this.f111058i + (this.f111057h / 2.0f));
        path.lineTo((rectF.right - this.f111055f) - f, (this.f111058i + this.f111057h) - f2);
        path.lineTo((rectF.right - this.f111055f) - f, (rectF.bottom - this.f111056g) - f);
        path.arcTo(new RectF((rectF.right - this.f111056g) - this.f111055f, rectF.bottom - this.f111056g, (rectF.right - this.f111055f) - f, rectF.bottom - f), BitmapDescriptorFactory.HUE_RED, 90.0f);
        path.lineTo(rectF.left + this.f111055f + f, rectF.bottom - f);
        float f3 = rectF.bottom;
        float f4 = this.f111056g;
        path.arcTo(new RectF(rectF.left + f, f3 - f4, f4 + rectF.left, rectF.bottom - f), 90.0f, 90.0f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + f, this.f111056g + rectF.left, this.f111056g + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: g */
    private void m173461g(RectF rectF, Path path, float f) {
        path.moveTo(rectF.left + this.f111056g + f, rectF.top + f);
        path.lineTo((rectF.width() - this.f111056g) - f, rectF.top + f);
        path.arcTo(new RectF(rectF.right - this.f111056g, rectF.top + f, rectF.right - f, this.f111056g + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f, ((rectF.bottom - this.f111057h) - this.f111056g) - f);
        path.arcTo(new RectF(rectF.right - this.f111056g, (rectF.bottom - this.f111056g) - this.f111057h, rectF.right - f, (rectF.bottom - this.f111057h) - f), BitmapDescriptorFactory.HUE_RED, 90.0f);
        float f2 = f / 2.0f;
        path.lineTo(((rectF.left + this.f111055f) + this.f111058i) - f2, (rectF.bottom - this.f111057h) - f);
        path.lineTo(rectF.left + this.f111058i + (this.f111055f / 2.0f), (rectF.bottom - f) - f);
        path.lineTo(rectF.left + this.f111058i + f2, (rectF.bottom - this.f111057h) - f);
        path.lineTo(rectF.left + Math.min(this.f111056g, this.f111058i) + f, (rectF.bottom - this.f111057h) - f);
        float f3 = rectF.bottom;
        float f4 = this.f111056g;
        path.arcTo(new RectF(rectF.left + f, (f3 - f4) - this.f111057h, f4 + rectF.left, (rectF.bottom - this.f111057h) - f), 90.0f, 90.0f);
        path.lineTo(rectF.left + f, rectF.top + this.f111056g + f);
        path.arcTo(new RectF(rectF.left + f, rectF.top + f, this.f111056g + rectF.left, this.f111056g + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    /* renamed from: a */
    private void m173455a(ArrowDirection arrowDirection, Path path, float f) {
        switch (C437591.f111061a[arrowDirection.ordinal()]) {
            case 1:
            case 2:
                float f2 = this.f111056g;
                if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                    m173456b(this.f111050a, path, f);
                    return;
                } else if (f <= BitmapDescriptorFactory.HUE_RED || f <= f2) {
                    m173454a(this.f111050a, path, f);
                    return;
                } else {
                    m173456b(this.f111050a, path, f);
                    return;
                }
            case 3:
            case 4:
                float f3 = this.f111056g;
                if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                    m173458d(this.f111050a, path, f);
                    return;
                } else if (f <= BitmapDescriptorFactory.HUE_RED || f <= f3) {
                    m173457c(this.f111050a, path, f);
                    return;
                } else {
                    m173458d(this.f111050a, path, f);
                    return;
                }
            case 5:
            case 6:
                float f4 = this.f111056g;
                if (f4 <= BitmapDescriptorFactory.HUE_RED) {
                    m173460f(this.f111050a, path, f);
                    return;
                } else if (f <= BitmapDescriptorFactory.HUE_RED || f <= f4) {
                    m173459e(this.f111050a, path, f);
                    return;
                } else {
                    m173460f(this.f111050a, path, f);
                    return;
                }
            case 7:
            case 8:
                float f5 = this.f111056g;
                if (f5 <= BitmapDescriptorFactory.HUE_RED) {
                    m173462h(this.f111050a, path, f);
                    return;
                } else if (f <= BitmapDescriptorFactory.HUE_RED || f <= f5) {
                    m173461g(this.f111050a, path, f);
                    return;
                } else {
                    m173462h(this.f111050a, path, f);
                    return;
                }
            default:
                return;
        }
    }

    public C43758a(RectF rectF, float f, float f2, float f3, float f4, float f5, int i, int i2, ArrowDirection arrowDirection, RadiusShape radiusShape) {
        this.f111050a = rectF;
        this.f111055f = f;
        this.f111056g = f2;
        this.f111057h = f3;
        this.f111058i = f4;
        this.f111059j = f5;
        this.f111060k = radiusShape;
        if (radiusShape == RadiusShape.OVAL) {
            this.f111056g = (this.f111050a.bottom - this.f111050a.top) - this.f111057h;
        }
        this.f111052c.setColor(i2);
        if (f5 > BitmapDescriptorFactory.HUE_RED) {
            Paint paint = new Paint(1);
            this.f111054e = paint;
            paint.setColor(i);
            this.f111053d = new Path();
            m173455a(arrowDirection, this.f111051b, f5);
            m173455a(arrowDirection, this.f111053d, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        m173455a(arrowDirection, this.f111051b, BitmapDescriptorFactory.HUE_RED);
    }
}
