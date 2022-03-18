package com.lynx.tasm.behavior.ui.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.shadow.C26705f;
import com.lynx.tasm.behavior.ui.background.C26754d;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import com.lynx.tasm.utils.C26945b;
import java.util.Map;

public class BackgroundDrawable extends Drawable {

    /* renamed from: a */
    private C26832e f66586a;

    /* renamed from: b */
    private C26832e f66587b;

    /* renamed from: c */
    private C26832e f66588c;

    /* renamed from: d */
    private C26832e f66589d;

    /* renamed from: e */
    private BorderStyle[] f66590e;

    /* renamed from: f */
    private PathEffect f66591f;

    /* renamed from: g */
    private C26824a f66592g;

    /* renamed from: h */
    private C26824a f66593h;

    /* renamed from: i */
    private Map<C26824a.EnumC26825a, C26824a> f66594i;

    /* renamed from: j */
    private Path f66595j;

    /* renamed from: k */
    private Path f66596k;

    /* renamed from: l */
    private PointF f66597l;

    /* renamed from: m */
    private PointF f66598m;

    /* renamed from: n */
    private PointF f66599n;

    /* renamed from: o */
    private PointF f66600o;

    /* renamed from: p */
    private boolean f66601p = true;

    /* renamed from: q */
    private final Paint f66602q = new Paint(1);

    /* renamed from: r */
    private int f66603r = 0;

    /* renamed from: s */
    private int f66604s = 255;

    /* renamed from: t */
    private C26754d f66605t = null;

    /* renamed from: u */
    private BorderRadius f66606u;

    /* renamed from: v */
    private final AbstractC26684l f66607v;

    /* renamed from: w */
    private int f66608w;

    /* renamed from: x */
    private float f66609x;

    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* renamed from: a */
    private static int m97442a(float f, float f2) {
        return ((((int) f) << 24) & -16777216) | (((int) f2) & 16777215);
    }

    /* renamed from: a */
    private static int m97443a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -1;
        int i10 = (i > 0 ? i5 : -1) & (i2 > 0 ? i6 : -1) & (i3 > 0 ? i7 : -1);
        if (i4 > 0) {
            i9 = i8;
        }
        int i11 = i9 & i10;
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        int i12 = i5 | i6;
        if (i3 <= 0) {
            i7 = 0;
        }
        int i13 = i12 | i7;
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i13 | i8)) {
            return i11;
        }
        return 0;
    }

    /* renamed from: b */
    private static int m97451b(int i) {
        return (i & -16777216) | ((16711422 & i) >> 1);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public BorderRadius mo95473a() {
        return this.f66606u;
    }

    /* renamed from: b */
    public int mo95483b() {
        return this.f66608w;
    }

    public int getAlpha() {
        return this.f66604s;
    }

    /* renamed from: a */
    private boolean m97450a(RectF rectF) {
        C26832e eVar = this.f66587b;
        boolean z = false;
        if (eVar == null || rectF == null) {
            return false;
        }
        float b = eVar.mo95544b(0);
        if (!C26705f.m96794a(b) && ((double) b) > 1.0E-6d) {
            rectF.left += b;
            z = true;
        }
        float b2 = this.f66587b.mo95544b(1);
        if (!C26705f.m96794a(b2) && ((double) b2) > 1.0E-6d) {
            rectF.top += b2;
            z = true;
        }
        float b3 = this.f66587b.mo95544b(2);
        if (!C26705f.m96794a(b3) && ((double) b3) > 1.0E-6d) {
            rectF.right += b3;
            z = true;
        }
        float b4 = this.f66587b.mo95544b(3);
        if (C26705f.m96794a(b4) || ((double) b4) <= 1.0E-6d) {
            return z;
        }
        rectF.bottom += b4;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0126  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95480a(android.graphics.Canvas r10) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.mo95480a(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95479a(Bitmap.Config config) {
        C26754d dVar = this.f66605t;
        if (dVar != null) {
            dVar.mo95168a(config);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo95482a(String str) {
        this.f66605t.mo95172a(str);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo95481a(ReadableArray readableArray) {
        this.f66605t.mo95171a(readableArray);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo95475a(int i, float f) {
        if (this.f66586a == null) {
            this.f66586a = new C26832e();
        }
        if (!C26945b.m97908a(this.f66586a.mo95544b(i), f)) {
            this.f66586a.mo95543a(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.f66601p = true;
            }
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo95476a(int i, float f, float f2) {
        m97454c(i, f);
        m97457d(i, f2);
    }

    /* renamed from: a */
    public void mo95477a(int i, int i2) {
        if (i <= 8 && i >= 0) {
            Log.e("===test=", "position " + i + "style" + i2);
            if (this.f66590e == null) {
                this.f66590e = new BorderStyle[9];
            }
            try {
                BorderStyle parse = BorderStyle.parse(i2);
                BorderStyle[] borderStyleArr = this.f66590e;
                if (borderStyleArr[i] != parse) {
                    borderStyleArr[i] = parse;
                    invalidateSelf();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo95478a(int i, BorderRadius.C26826a aVar) {
        if (i > 0 && i <= 4) {
            BorderRadius borderRadius = this.f66606u;
            if (borderRadius == null) {
                this.f66606u = new BorderRadius();
                m97458g();
            } else {
                borderRadius.mo95504a();
            }
            if (this.f66606u.mo95507a(i - 1, aVar)) {
                this.f66601p = true;
                invalidateSelf();
            }
        }
    }

    /* renamed from: a */
    public float mo95472a(float f, int i) {
        C26832e eVar = this.f66586a;
        if (eVar == null) {
            return f;
        }
        float b = eVar.mo95544b(i);
        return C26705f.m96794a(b) ? f : b;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private void m97449a(Canvas canvas, int i, int i2, float f, float f2) {
        int i3;
        BorderStyle[] borderStyleArr = this.f66590e;
        BorderStyle borderStyle = borderStyleArr == null ? null : borderStyleArr[i] != null ? borderStyleArr[i] : borderStyleArr[8];
        if (borderStyle == null) {
            borderStyle = BorderStyle.SOLID;
        }
        this.f66591f = null;
        switch (C268231.f66611b[borderStyle.ordinal()]) {
            case 1:
            case 2:
                return;
            case 3:
            case 4:
                this.f66591f = borderStyle.getPathEffect(f);
                i3 = i2;
                break;
            case 5:
            default:
                i3 = i2;
                break;
            case 6:
                if (i == 1 || i == 0) {
                    i3 = m97451b(i2);
                    break;
                }
                i3 = i2;
                break;
            case 7:
                if (i == 3 || i == 2) {
                    i3 = m97451b(i2);
                    break;
                }
                i3 = i2;
                break;
            case 8:
                m97448a(canvas, i, f / 3.0f, i2, i2, true);
                return;
            case 9:
                m97448a(canvas, i, f / 2.0f, i2, m97451b(i2), false);
                return;
            case 10:
                m97448a(canvas, i, f / 2.0f, m97451b(i2), i2, false);
                return;
        }
        this.f66602q.setStyle(Paint.Style.STROKE);
        this.f66602q.setColor(C26829b.m97510a(i3, this.f66604s));
        this.f66602q.setStrokeWidth(f2);
        this.f66602q.setPathEffect(this.f66591f);
        this.f66602q.setAntiAlias(true);
        C26824a a = m97444a(C26824a.EnumC26825a.CENTER);
        if (a != null) {
            a.mo95501a(canvas, this.f66602q);
        }
        this.f66602q.setPathEffect(null);
    }

    /* renamed from: d */
    public void mo95489d() {
        this.f66605t.mo95177c();
    }

    /* renamed from: e */
    public void mo95492e() {
        this.f66605t.mo95179d();
    }

    public int getOpacity() {
        return C26829b.m97509a(C26829b.m97510a(this.f66603r, this.f66604s));
    }

    /* renamed from: f */
    public Path mo95494f() {
        C26824a aVar;
        if (this.f66606u == null || !m97459h() || (aVar = this.f66592g) == null) {
            return null;
        }
        return aVar.f66614c;
    }

    /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$a */
    public static class C26824a {

        /* renamed from: a */
        public RectF f66612a;

        /* renamed from: b */
        public float[] f66613b;

        /* renamed from: c */
        public Path f66614c;

        /* renamed from: d */
        public boolean f66615d;

        /* access modifiers changed from: package-private */
        /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$a$a */
        public enum EnumC26825a {
            CENTER,
            INNER2,
            OUTER2,
            INNER3,
            OUTER3;

            public float getOffset() {
                int i = C268231.f66610a[ordinal()];
                if (i == 1) {
                    return 0.5f;
                }
                if (i == 2) {
                    return 0.75f;
                }
                if (i == 3) {
                    return 0.25f;
                }
                if (i == 4) {
                    return 0.8333333f;
                }
                if (i != 5) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                return 0.16666667f;
            }
        }

        /* renamed from: a */
        public static boolean m97485a(float[] fArr) {
            for (int i = 2; i <= 6; i += 2) {
                float f = fArr[i] - fArr[0];
                if (f <= 1.0E-4f && f >= -1.0E-4f) {
                    float f2 = fArr[i + 1] - fArr[1];
                    if (f2 <= 1.0E-4f && f2 >= -1.0E-4f) {
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo95501a(Canvas canvas, Paint paint) {
            if (this.f66615d) {
                RectF rectF = this.f66612a;
                float[] fArr = this.f66613b;
                canvas.drawRoundRect(rectF, fArr[0], fArr[1], paint);
                return;
            }
            canvas.drawPath(this.f66614c, paint);
        }

        /* renamed from: a */
        public static float[] m97486a(float[] fArr, RectF rectF, float f) {
            return new float[]{Math.max(fArr[0] - (rectF.left * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[1] - (rectF.top * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[2] - (rectF.right * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[3] - (rectF.top * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[4] - (rectF.right * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[5] - (rectF.bottom * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[6] - (rectF.left * f), (float) BitmapDescriptorFactory.HUE_RED), Math.max(fArr[7] - (rectF.bottom * f), (float) BitmapDescriptorFactory.HUE_RED)};
        }

        /* renamed from: a */
        public void mo95502a(Rect rect, float[] fArr, RectF rectF, float f) {
            if (this.f66612a == null) {
                this.f66612a = new RectF();
            }
            this.f66612a.left = ((float) rect.left) + (rectF.left * f);
            this.f66612a.top = ((float) rect.top) + (rectF.top * f);
            this.f66612a.right = ((float) rect.right) - (rectF.right * f);
            this.f66612a.bottom = ((float) rect.bottom) - (rectF.bottom * f);
            float[] a = m97486a(fArr, rectF, f);
            this.f66613b = a;
            this.f66615d = m97485a(a);
            Path path = this.f66614c;
            if (path == null) {
                this.f66614c = new Path();
            } else {
                path.reset();
            }
            this.f66614c.addRoundRect(this.f66612a, this.f66613b, Path.Direction.CW);
        }
    }

    /* renamed from: g */
    private void m97458g() {
        if (this.f66606u != null) {
            Rect bounds = getBounds();
            int i = 0;
            if (mo95483b() == 1) {
                i = 0 | BorderRadius.f66617a;
            }
            this.f66606u.mo95506a(i);
            this.f66606u.mo95505a((float) bounds.width(), (float) bounds.height());
        }
    }

    /* renamed from: j */
    private boolean m97461j() {
        BorderStyle borderStyle;
        BorderStyle borderStyle2;
        BorderStyle borderStyle3;
        BorderStyle[] borderStyleArr = this.f66590e;
        if (borderStyleArr == null) {
            return true;
        }
        BorderStyle borderStyle4 = borderStyleArr[8];
        if (borderStyleArr[0] != null) {
            borderStyle = borderStyleArr[0];
        } else {
            borderStyle = borderStyle4;
        }
        if (borderStyleArr[2] != null) {
            borderStyle2 = borderStyleArr[2];
        } else {
            borderStyle2 = borderStyle4;
        }
        if (borderStyle2 != borderStyle) {
            return false;
        }
        if (borderStyleArr[1] != null) {
            borderStyle3 = borderStyleArr[1];
        } else {
            borderStyle3 = borderStyle4;
        }
        if (borderStyle3 != borderStyle) {
            return false;
        }
        if (borderStyleArr[3] != null) {
            borderStyle4 = borderStyleArr[3];
        }
        if (borderStyle4 != borderStyle) {
            return false;
        }
        if (borderStyle == null || borderStyle.isSolidDashedOrDotted()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m97462k() {
        if ((Color.alpha(m97456d(0)) <= 0 || Color.alpha(m97456d(0)) >= 255) && ((Color.alpha(m97456d(1)) <= 0 || Color.alpha(m97456d(1)) >= 255) && ((Color.alpha(m97456d(2)) <= 0 || Color.alpha(m97456d(2)) >= 255) && (Color.alpha(m97456d(3)) <= 0 || Color.alpha(m97456d(3)) >= 255)))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public RectF mo95487c() {
        float a = mo95472a(BitmapDescriptorFactory.HUE_RED, 8);
        float a2 = mo95472a(a, 1);
        float a3 = mo95472a(a, 3);
        float a4 = mo95472a(a, 0);
        float a5 = mo95472a(a, 2);
        Rect bounds = getBounds();
        float f = a4 + a5;
        if (f > ((float) bounds.width()) && bounds.width() >= 1) {
            float width = ((float) bounds.width()) / f;
            a4 *= width;
            a5 *= width;
        }
        float f2 = a2 + a3;
        if (f2 > ((float) bounds.height()) && bounds.height() >= 1) {
            float height = ((float) bounds.height()) / f2;
            a2 *= height;
            a3 *= height;
        }
        return new RectF(a4, a2, a5, a3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable$1 */
    public static /* synthetic */ class C268231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66610a;

        /* renamed from: b */
        static final /* synthetic */ int[] f66611b;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a7 */
        static {
            /*
            // Method dump skipped, instructions count: 178
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.C268231.<clinit>():void");
        }
    }

    /* renamed from: h */
    private boolean m97459h() {
        float[] fArr;
        if (this.f66606u == null) {
            return false;
        }
        if (!this.f66601p) {
            return true;
        }
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return false;
        }
        this.f66601p = false;
        RectF c = mo95487c();
        m97458g();
        BorderRadius borderRadius = this.f66606u;
        if (borderRadius != null) {
            fArr = borderRadius.mo95508b();
        } else {
            fArr = null;
        }
        if (this.f66592g == null) {
            this.f66592g = new C26824a();
        }
        this.f66592g.mo95502a(bounds, fArr, c, 1.0f);
        if (this.f66593h == null) {
            this.f66593h = new C26824a();
        }
        this.f66593h.mo95502a(bounds, fArr, c, BitmapDescriptorFactory.HUE_RED);
        BorderRadius borderRadius2 = this.f66606u;
        if (borderRadius2 != null && borderRadius2.mo95509c()) {
            m97445a(C26824a.EnumC26825a.CENTER, bounds, fArr, c);
            if (this.f66590e != null) {
                boolean z = false;
                boolean z2 = false;
                for (int i = 0; i <= 8; i++) {
                    BorderStyle borderStyle = this.f66590e[i];
                    if (borderStyle != null) {
                        if (borderStyle == BorderStyle.DOUBLE) {
                            z = true;
                        } else if (borderStyle == BorderStyle.GROOVE || borderStyle == BorderStyle.RIDGE) {
                            z2 = true;
                        }
                    }
                }
                if (z) {
                    m97445a(C26824a.EnumC26825a.INNER3, bounds, fArr, c);
                    m97445a(C26824a.EnumC26825a.OUTER3, bounds, fArr, c);
                }
                if (z2) {
                    m97445a(C26824a.EnumC26825a.INNER2, bounds, fArr, c);
                    m97445a(C26824a.EnumC26825a.OUTER2, bounds, fArr, c);
                }
            }
        }
        Path path = this.f66595j;
        if (path == null) {
            this.f66595j = new Path();
        } else {
            path.reset();
        }
        this.f66595j.addRoundRect(new RectF(bounds), C26824a.m97486a(fArr, c, -0.5f), Path.Direction.CW);
        m97460i();
        return true;
    }

    /* renamed from: i */
    private void m97460i() {
        RectF rectF = this.f66592g.f66612a;
        RectF rectF2 = this.f66593h.f66612a;
        float[] fArr = this.f66592g.f66613b;
        if (this.f66597l == null) {
            this.f66597l = new PointF();
        }
        this.f66597l.x = this.f66592g.f66612a.left;
        this.f66597l.y = this.f66592g.f66612a.top;
        m97446a((double) rectF.left, (double) rectF.top, (double) (rectF.left + (fArr[0] * 2.0f)), (double) (rectF.top + (fArr[1] * 2.0f)), (double) rectF2.left, (double) rectF2.top, (double) rectF.left, (double) rectF.top, this.f66597l);
        if (this.f66600o == null) {
            this.f66600o = new PointF();
        }
        this.f66600o.x = rectF.left;
        this.f66600o.y = rectF.bottom;
        m97446a((double) rectF.left, (double) (rectF.bottom - (fArr[6] * 2.0f)), (double) (rectF.left + (fArr[7] * 2.0f)), (double) rectF.bottom, (double) rectF2.left, (double) rectF2.bottom, (double) rectF.left, (double) rectF.bottom, this.f66600o);
        if (this.f66598m == null) {
            this.f66598m = new PointF();
        }
        this.f66598m.x = rectF.right;
        this.f66598m.y = rectF.top;
        m97446a((double) (rectF.right - (fArr[2] * 2.0f)), (double) rectF.top, (double) rectF.right, (double) (rectF.top + (fArr[3] * 2.0f)), (double) rectF2.right, (double) rectF2.top, (double) rectF.right, (double) rectF.top, this.f66598m);
        if (this.f66599n == null) {
            this.f66599n = new PointF();
        }
        this.f66599n.x = rectF.right;
        this.f66599n.y = rectF.bottom;
        m97446a((double) (rectF.right - (fArr[4] * 2.0f)), (double) (rectF.bottom - (fArr[5] * 2.0f)), (double) rectF.right, (double) rectF.bottom, (double) rectF2.right, (double) rectF2.bottom, (double) rectF.right, (double) rectF.bottom, this.f66599n);
    }

    /* renamed from: a */
    public void mo95474a(int i) {
        this.f66603r = i;
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo95488c(ReadableArray readableArray) {
        this.f66605t.mo95175b(readableArray);
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo95490d(ReadableArray readableArray) {
        this.f66605t.mo95178c(readableArray);
        invalidateSelf();
    }

    /* renamed from: e */
    public void mo95493e(ReadableArray readableArray) {
        this.f66605t.mo95180d(readableArray);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f66601p = true;
        this.f66605t.mo95170a(rect);
    }

    public void setAlpha(int i) {
        if (i != this.f66604s) {
            this.f66604s = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private int m97441a(float f) {
        if (f <= 0.1f || f >= 1.0f) {
            return Math.round(f);
        }
        return 1;
    }

    /* renamed from: c */
    private BorderStyle m97453c(int i) {
        BorderStyle borderStyle;
        BorderStyle[] borderStyleArr = this.f66590e;
        if (borderStyleArr == null) {
            borderStyle = null;
        } else if (borderStyleArr[i] != null) {
            borderStyle = borderStyleArr[i];
        } else {
            borderStyle = borderStyleArr[8];
        }
        if (borderStyle == null) {
            return BorderStyle.SOLID;
        }
        return borderStyle;
    }

    /* renamed from: d */
    private int m97456d(int i) {
        float f;
        float f2;
        C26832e eVar = this.f66588c;
        if (eVar != null) {
            f = eVar.mo95542a(i);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        C26832e eVar2 = this.f66589d;
        if (eVar2 != null) {
            f2 = eVar2.mo95542a(i);
        } else {
            f2 = 255.0f;
        }
        return m97442a(f2, f);
    }

    /* renamed from: b */
    public void mo95485b(ReadableArray readableArray) {
        this.f66605t.mo95181e(readableArray);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        mo95480a(canvas);
        BorderRadius borderRadius = this.f66606u;
        if (borderRadius == null || !borderRadius.mo95509c()) {
            m97455c(canvas);
        } else {
            m97452b(canvas);
        }
    }

    public void getOutline(Outline outline) {
        Path path;
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if (this.f66606u == null || !m97459h() || (path = this.f66595j) == null) {
            outline.setRect(getBounds());
        } else {
            outline.setConvexPath(path);
        }
    }

    /* renamed from: a */
    private C26824a m97444a(C26824a.EnumC26825a aVar) {
        Map<C26824a.EnumC26825a, C26824a> map;
        if (aVar == null || (map = this.f66594i) == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* renamed from: b */
    public void mo95486b(String str) {
        this.f66605t.mo95176b(str);
        invalidateSelf();
    }

    /* renamed from: b */
    private void m97452b(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z3;
        float f6;
        boolean z4;
        float f7;
        boolean z5;
        float f8;
        boolean z6;
        boolean z7;
        if (m97459h()) {
            canvas.save();
            RectF c = mo95487c();
            int a = m97441a(c.left);
            int a2 = m97441a(c.top);
            int a3 = m97441a(c.right);
            int a4 = m97441a(c.bottom);
            if (a2 > 0 || a4 > 0 || a > 0 || a3 > 0) {
                int d = m97456d(8);
                int d2 = m97456d(0);
                if (d2 == m97456d(2) && d2 == m97456d(1) && d2 == m97456d(3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = d2;
                } else {
                    i = d;
                }
                if (a2 == a && a4 == a && a3 == a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !z || !m97461j() || a <= 0) {
                    int d3 = m97456d(0);
                    int d4 = m97456d(1);
                    int d5 = m97456d(2);
                    int d6 = m97456d(3);
                    RectF rectF = this.f66593h.f66612a;
                    float f9 = rectF.left;
                    float f10 = rectF.right;
                    float f11 = rectF.top;
                    float f12 = rectF.bottom;
                    if (a2 <= 0 || Color.alpha(d4) == 0) {
                        f2 = f12;
                        f3 = f11;
                        f4 = f10;
                        f = f9;
                    } else {
                        float f13 = this.f66597l.x;
                        float f14 = this.f66597l.y;
                        float f15 = this.f66598m.x;
                        float f16 = this.f66598m.y;
                        float f17 = c.top;
                        if (!z2) {
                            float max = Math.max(f17, Math.max(c.left, c.right));
                            if (max - Math.min(c.left, c.right) >= 2.0f) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            f8 = max;
                            z6 = z7;
                        } else {
                            f8 = f17;
                            z6 = false;
                        }
                        canvas.save();
                        f2 = f12;
                        f3 = f11;
                        f4 = f10;
                        f = f9;
                        m97447a(canvas, f9, f11, f13, f14, f15, f16, f4, f3, z6);
                        m97449a(canvas, 1, d4, c.top, f8);
                        canvas.restore();
                    }
                    if (a3 > 0 && Color.alpha(d5) != 0) {
                        float f18 = this.f66598m.x;
                        float f19 = this.f66598m.y;
                        float f20 = this.f66599n.x;
                        float f21 = this.f66599n.y;
                        float f22 = c.right;
                        if (!z2) {
                            float max2 = Math.max(f22, Math.max(c.top, c.bottom));
                            if (max2 - Math.min(c.top, c.bottom) >= 2.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            f7 = max2;
                        } else {
                            f7 = f22;
                            z5 = false;
                        }
                        canvas.save();
                        m97447a(canvas, f4, f3, f18, f19, f20, f21, f4, f2, z5);
                        m97449a(canvas, 2, d5, c.right, f7);
                        canvas.restore();
                    }
                    if (a4 > 0 && Color.alpha(d6) != 0) {
                        float f23 = this.f66600o.x;
                        float f24 = this.f66600o.y;
                        float f25 = this.f66599n.x;
                        float f26 = this.f66599n.y;
                        float f27 = c.bottom;
                        if (!z2) {
                            float max3 = Math.max(f27, Math.max(c.left, c.right));
                            if (max3 - Math.min(c.left, c.right) >= 2.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            f6 = max3;
                        } else {
                            f6 = f27;
                            z4 = false;
                        }
                        canvas.save();
                        m97447a(canvas, f, f2, f23, f24, f25, f26, f4, f2, z4);
                        m97449a(canvas, 3, d6, c.bottom, f6);
                        canvas.restore();
                    }
                    if (a > 0 && Color.alpha(d3) != 0) {
                        float f28 = this.f66597l.x;
                        float f29 = this.f66597l.y;
                        float f30 = this.f66600o.x;
                        float f31 = this.f66600o.y;
                        float f32 = c.left;
                        if (!z2) {
                            float max4 = Math.max(f32, Math.max(c.top, c.bottom));
                            if (max4 - Math.min(c.top, c.bottom) >= 2.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            f5 = max4;
                        } else {
                            f5 = f32;
                            z3 = false;
                        }
                        canvas.save();
                        m97447a(canvas, f, f3, f28, f29, f30, f31, f, f2, z3);
                        m97449a(canvas, 0, d3, c.left, f5);
                        canvas.restore();
                    }
                } else {
                    float f33 = (float) a;
                    m97449a(canvas, 1, i, f33, f33);
                }
            }
            canvas.restore();
        }
    }

    /* renamed from: c */
    private void m97455c(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        RectF c = mo95487c();
        int a = m97441a(c.left);
        int a2 = m97441a(c.top);
        int a3 = m97441a(c.right);
        int a4 = m97441a(c.bottom);
        if (a > 0 || a3 > 0 || a2 > 0 || a4 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Rect bounds = getBounds();
            int d = m97456d(0);
            int d2 = m97456d(1);
            int d3 = m97456d(2);
            int d4 = m97456d(3);
            int i22 = bounds.left;
            int i23 = bounds.top;
            this.f66602q.setAntiAlias(false);
            this.f66602q.setStyle(Paint.Style.STROKE);
            int a5 = m97443a(a, a2, a3, a4, d, d2, d3, d4);
            if (a5 == 0 || !m97461j()) {
                int width = bounds.width();
                int height = bounds.height();
                if (a2 <= 0 || Color.alpha(d2) == 0) {
                    i3 = i22;
                    i2 = i23;
                    i6 = height;
                    i = a4;
                    i4 = a;
                    i5 = a2;
                } else {
                    float f = (float) i22;
                    float f2 = (float) i23;
                    float f3 = (float) (i22 + a);
                    float f4 = (float) (i23 + a2);
                    int i24 = i22 + width;
                    float f5 = (float) i24;
                    float f6 = (float) a2;
                    float f7 = f2 + (f6 * 0.5f);
                    canvas.save();
                    i3 = i22;
                    i5 = a2;
                    i2 = i23;
                    i6 = height;
                    i4 = a;
                    i = a4;
                    m97447a(canvas, f, f2, f3, f4, (float) (i24 - a3), f4, f5, f2, false);
                    m97453c(1).strokeBorderLine(canvas, this.f66602q, 1, c.top, d2, f, f7, f5, f7, (float) width, f6);
                    canvas.restore();
                }
                if (a3 <= 0 || Color.alpha(d3) == 0) {
                    i8 = width;
                    i7 = a3;
                    i12 = i6;
                    i10 = i3;
                    i9 = i2;
                    i11 = i;
                } else {
                    int i25 = i3 + width;
                    float f8 = (float) i25;
                    float f9 = (float) i2;
                    int i26 = i2 + i6;
                    float f10 = (float) i26;
                    float f11 = (float) (i25 - a3);
                    float f12 = (float) a3;
                    float f13 = f8 - (f12 * 0.5f);
                    canvas.save();
                    i11 = i;
                    i7 = a3;
                    i9 = i2;
                    i8 = width;
                    i10 = i3;
                    m97447a(canvas, f8, f9, f8, f10, f11, (float) (i26 - i), f11, (float) (i2 + i5), false);
                    i12 = i6;
                    m97453c(2).strokeBorderLine(canvas, this.f66602q, 2, c.right, d3, f13, f9, f13, f10, (float) i12, f12);
                    canvas.restore();
                }
                if (i11 <= 0 || Color.alpha(d4) == 0) {
                    i13 = i11;
                    i14 = i12;
                } else {
                    float f14 = (float) i10;
                    int i27 = i9 + i12;
                    float f15 = (float) i27;
                    int i28 = i10 + i8;
                    float f16 = (float) i28;
                    float f17 = (float) (i27 - i11);
                    float f18 = (float) i11;
                    float f19 = f15 - (f18 * 0.5f);
                    canvas.save();
                    i13 = i11;
                    i14 = i12;
                    m97447a(canvas, f14, f15, f16, f15, (float) (i28 - i7), f17, (float) (i10 + i4), f17, false);
                    m97453c(3).strokeBorderLine(canvas, this.f66602q, 3, c.bottom, d4, f16, f19, f14, f19, (float) i8, f18);
                    canvas.restore();
                }
                if (i4 > 0 && Color.alpha(d) != 0) {
                    float f20 = (float) i10;
                    float f21 = (float) i9;
                    float f22 = (float) (i10 + i4);
                    float f23 = (float) (i9 + i5);
                    int i29 = i9 + i14;
                    float f24 = (float) i29;
                    float f25 = (float) i4;
                    float f26 = f20 + (0.5f * f25);
                    canvas.save();
                    m97447a(canvas, f20, f21, f22, f23, f22, (float) (i29 - i13), f20, f24, false);
                    m97453c(0).strokeBorderLine(canvas, this.f66602q, 0, c.left, d, f26, f24, f26, f21, (float) i14, f25);
                    canvas.restore();
                }
            } else if (Color.alpha(a5) != 0) {
                int i30 = bounds.right;
                int i31 = bounds.bottom;
                BorderStyle c2 = m97453c(0);
                if (a2 > 0) {
                    float f27 = (float) a2;
                    float f28 = ((float) i23) + (f27 * 0.5f);
                    if (a3 > 0) {
                        i21 = a3;
                    } else {
                        i21 = 0;
                    }
                    i16 = a2;
                    i17 = i22;
                    i15 = a;
                    c2.strokeBorderLine(canvas, this.f66602q, 1, c.top, a5, (float) i17, f28, (float) (i30 - i21), f28, (float) (i30 - i17), f27);
                } else {
                    i17 = i22;
                    i15 = a;
                    i16 = a2;
                }
                if (a3 > 0) {
                    float f29 = (float) a3;
                    float f30 = ((float) i30) - (f29 * 0.5f);
                    if (a4 > 0) {
                        i20 = a4;
                    } else {
                        i20 = 0;
                    }
                    c2.strokeBorderLine(canvas, this.f66602q, 2, c.right, a5, f30, (float) i23, f30, (float) (i31 - i20), (float) (i31 - i23), f29);
                }
                if (a4 > 0) {
                    float f31 = (float) a4;
                    float f32 = ((float) i31) - (f31 * 0.5f);
                    if (i15 > 0) {
                        i19 = i15;
                    } else {
                        i19 = 0;
                    }
                    c2.strokeBorderLine(canvas, this.f66602q, 3, c.bottom, a5, (float) i30, f32, (float) (i19 + i17), f32, (float) (i30 - i17), f31);
                }
                if (i15 > 0) {
                    float f33 = (float) i15;
                    float f34 = ((float) i17) + (0.5f * f33);
                    if (i16 > 0) {
                        i18 = i16;
                    } else {
                        i18 = 0;
                    }
                    c2.strokeBorderLine(canvas, this.f66602q, 0, c.left, a5, f34, (float) i31, f34, (float) (i23 + i18), (float) (i31 - i23), f33);
                }
            }
        }
        this.f66602q.setAntiAlias(true);
    }

    public BackgroundDrawable(AbstractC26684l lVar, float f) {
        this.f66607v = lVar;
        this.f66609x = f;
        this.f66605t = new C26754d(lVar, this, f);
    }

    /* renamed from: c */
    private void m97454c(int i, float f) {
        if (this.f66588c == null) {
            this.f66588c = new C26832e(BitmapDescriptorFactory.HUE_RED);
        }
        if (!C26945b.m97908a(this.f66588c.mo95544b(i), f)) {
            this.f66588c.mo95543a(i, f);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    private void m97457d(int i, float f) {
        if (this.f66589d == null) {
            this.f66589d = new C26832e(255.0f);
        }
        if (!C26945b.m97908a(this.f66589d.mo95544b(i), f)) {
            this.f66589d.mo95543a(i, f);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo95484b(int i, float f) {
        if (this.f66587b == null) {
            this.f66587b = new C26832e();
        }
        if (!C26945b.m97908a(this.f66587b.mo95544b(i), f)) {
            this.f66587b.mo95543a(i, f);
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                this.f66601p = true;
            }
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private C26824a m97445a(C26824a.EnumC26825a aVar, Rect rect, float[] fArr, RectF rectF) {
        C26824a aVar2 = null;
        if (aVar == null) {
            return null;
        }
        Map<C26824a.EnumC26825a, C26824a> map = this.f66594i;
        if (map != null) {
            aVar2 = map.get(aVar);
        } else {
            this.f66594i = new ArrayMap();
        }
        if (aVar2 == null) {
            aVar2 = new C26824a();
            this.f66594i.put(aVar, aVar2);
        }
        aVar2.mo95502a(rect, fArr, rectF, aVar.getOffset());
        return aVar2;
    }

    /* renamed from: a */
    private void m97448a(Canvas canvas, int i, float f, int i2, int i3, boolean z) {
        int i4;
        C26824a.EnumC26825a aVar;
        C26824a.EnumC26825a aVar2;
        this.f66602q.setPathEffect(null);
        this.f66602q.setStyle(Paint.Style.STROKE);
        this.f66602q.setStrokeWidth(f);
        boolean z2 = true;
        if (!(i == 1 || i == 0)) {
            z2 = false;
        }
        Paint paint = this.f66602q;
        if (z2) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        paint.setColor(C26829b.m97510a(i4, this.f66604s));
        if (z) {
            aVar = C26824a.EnumC26825a.OUTER3;
        } else {
            aVar = C26824a.EnumC26825a.OUTER2;
        }
        C26824a a = m97444a(aVar);
        if (a != null) {
            a.mo95501a(canvas, this.f66602q);
        }
        Paint paint2 = this.f66602q;
        if (!z2) {
            i2 = i3;
        }
        paint2.setColor(C26829b.m97510a(i2, this.f66604s));
        if (z) {
            aVar2 = C26824a.EnumC26825a.INNER3;
        } else {
            aVar2 = C26824a.EnumC26825a.INNER2;
        }
        C26824a a2 = m97444a(aVar2);
        if (a2 != null) {
            a2.mo95501a(canvas, this.f66602q);
        }
    }

    /* renamed from: a */
    private static void m97446a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            pointF.x = (float) d21;
            pointF.y = (float) d22;
        }
    }

    /* renamed from: a */
    private void m97447a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        if (z) {
            C26824a aVar = this.f66593h;
            if (aVar != null) {
                canvas.clipPath(aVar.f66614c, Region.Op.INTERSECT);
            }
            C26824a aVar2 = this.f66592g;
            if (aVar2 != null) {
                canvas.clipPath(aVar2.f66614c, Region.Op.DIFFERENCE);
            }
        }
        if (this.f66596k == null) {
            this.f66596k = new Path();
        }
        this.f66596k.reset();
        this.f66596k.moveTo(f, f2);
        this.f66596k.lineTo(f3, f4);
        this.f66596k.lineTo(f5, f6);
        this.f66596k.lineTo(f7, f8);
        this.f66596k.lineTo(f, f2);
        canvas.clipPath(this.f66596k);
    }
}
