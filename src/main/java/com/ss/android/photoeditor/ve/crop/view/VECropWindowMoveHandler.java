package com.ss.android.photoeditor.ve.crop.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public final class VECropWindowMoveHandler {

    /* renamed from: a */
    private static final Matrix f149163a = new Matrix();

    /* renamed from: b */
    private final float f149164b;

    /* renamed from: c */
    private final float f149165c;

    /* renamed from: d */
    private final float f149166d;

    /* renamed from: e */
    private final float f149167e;

    /* renamed from: f */
    private final Type f149168f;

    /* renamed from: g */
    private final PointF f149169g = new PointF();

    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    /* renamed from: a */
    private static float m232376a(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropWindowMoveHandler$1 */
    public static /* synthetic */ class C598951 {

        /* renamed from: a */
        static final /* synthetic */ int[] f149170a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.crop.view.VECropWindowMoveHandler.C598951.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m232377a(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    /* renamed from: b */
    private void m232384b(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    /* renamed from: c */
    private void m232389c(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    /* renamed from: d */
    private void m232391d(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    /* renamed from: b */
    private void m232388b(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        if (rectF.left < rectF2.left) {
            rectF.offset(rectF2.left - rectF.left, BitmapDescriptorFactory.HUE_RED);
        }
        if (rectF.right > rectF2.right) {
            rectF.offset(rectF2.right - rectF.right, BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* renamed from: c */
    private void m232390c(RectF rectF, RectF rectF2, float f) {
        rectF.inset(BitmapDescriptorFactory.HUE_RED, (rectF.height() - (rectF.width() / f)) / 2.0f);
        if (rectF.top < rectF2.top) {
            rectF.offset(BitmapDescriptorFactory.HUE_RED, rectF2.top - rectF.top);
        }
        if (rectF.bottom > rectF2.bottom) {
            rectF.offset(BitmapDescriptorFactory.HUE_RED, rectF2.bottom - rectF.bottom);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private void m232378a(RectF rectF, float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = C598951.f149170a[this.f149168f.ordinal()];
        float f6 = BitmapDescriptorFactory.HUE_RED;
        switch (i) {
            case 1:
                f6 = rectF.left - f;
                f4 = rectF.top;
                f3 = f4 - f2;
                break;
            case 2:
                f6 = rectF.right - f;
                f4 = rectF.top;
                f3 = f4 - f2;
                break;
            case 3:
                f6 = rectF.left - f;
                f4 = rectF.bottom;
                f3 = f4 - f2;
                break;
            case 4:
                f6 = rectF.right - f;
                f4 = rectF.bottom;
                f3 = f4 - f2;
                break;
            case 5:
                f5 = rectF.left;
                f6 = f5 - f;
                f3 = BitmapDescriptorFactory.HUE_RED;
                break;
            case 6:
                f4 = rectF.top;
                f3 = f4 - f2;
                break;
            case 7:
                f5 = rectF.right;
                f6 = f5 - f;
                f3 = BitmapDescriptorFactory.HUE_RED;
                break;
            case 8:
                f4 = rectF.bottom;
                f3 = f4 - f2;
                break;
            case 9:
                f6 = rectF.centerX() - f;
                f4 = rectF.centerY();
                f3 = f4 - f2;
                break;
            default:
                f3 = BitmapDescriptorFactory.HUE_RED;
                break;
        }
        this.f149169g.x = f6;
        this.f149169g.y = f3;
    }

    /* renamed from: a */
    private void m232383a(RectF rectF, RectF rectF2, float f) {
        if (rectF.left < rectF2.left + f) {
            rectF.offset(rectF2.left - rectF.left, BitmapDescriptorFactory.HUE_RED);
        }
        if (rectF.top < rectF2.top + f) {
            rectF.offset(BitmapDescriptorFactory.HUE_RED, rectF2.top - rectF.top);
        }
        if (rectF.right > rectF2.right - f) {
            rectF.offset(rectF2.right - rectF.right, BitmapDescriptorFactory.HUE_RED);
        }
        if (rectF.bottom > rectF2.bottom - f) {
            rectF.offset(BitmapDescriptorFactory.HUE_RED, rectF2.bottom - rectF.bottom);
        }
    }

    public VECropWindowMoveHandler(Type type, C59897b bVar, float f, float f2) {
        this.f149168f = type;
        this.f149164b = bVar.mo203970b();
        this.f149165c = bVar.mo203971c();
        this.f149166d = bVar.mo203972d();
        this.f149167e = bVar.mo203973e();
        m232378a(bVar.mo203965a(), f, f2);
    }

    /* renamed from: a */
    private void m232379a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        float centerX = f - rectF.centerX();
        float centerY = f2 - rectF.centerY();
        if (rectF.left + centerX < BitmapDescriptorFactory.HUE_RED || rectF.right + centerX > ((float) i) || rectF.left + centerX < rectF2.left || rectF.right + centerX > rectF2.right) {
            centerX /= 1.05f;
            this.f149169g.x -= centerX / 2.0f;
        }
        if (rectF.top + centerY < BitmapDescriptorFactory.HUE_RED || rectF.bottom + centerY > ((float) i2) || rectF.top + centerY < rectF2.top || rectF.bottom + centerY > rectF2.bottom) {
            centerY /= 1.05f;
            this.f149169g.y -= centerY / 2.0f;
        }
        rectF.offset(centerX, centerY);
        m232383a(rectF, rectF2, f3);
    }

    /* renamed from: b */
    private void m232385b(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        switch (C598951.f149170a[this.f149168f.ordinal()]) {
            case 1:
                m232386b(rectF, f2, rectF2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                m232381a(rectF, f, rectF2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 2:
                m232386b(rectF, f2, rectF2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                m232382a(rectF, f, rectF2, i, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 3:
                m232387b(rectF, f2, rectF2, i2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                m232381a(rectF, f, rectF2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 4:
                m232387b(rectF, f2, rectF2, i2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                m232382a(rectF, f, rectF2, i, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 5:
                m232381a(rectF, f, rectF2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 6:
                m232386b(rectF, f2, rectF2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 7:
                m232382a(rectF, f, rectF2, i, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            case 8:
                m232387b(rectF, f2, rectF2, i2, f3, BitmapDescriptorFactory.HUE_RED, false, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m232386b(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f /= 1.05f;
            this.f149169g.y -= f / 1.1f;
        }
        if (f < rectF2.top) {
            this.f149169g.y -= (f - rectF2.top) / 2.0f;
        }
        if (f - rectF2.top < f2) {
            f = rectF2.top;
        }
        if (rectF.bottom - f < this.f149165c) {
            f = rectF.bottom - this.f149165c;
        }
        if (rectF.bottom - f > this.f149167e) {
            f = rectF.bottom - this.f149167e;
        }
        if (f - rectF2.top < f2) {
            f = rectF2.top;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f4 = (rectF.bottom - f) * f3;
            if (f4 < this.f149164b) {
                f = Math.max(rectF2.top, rectF.bottom - (this.f149164b / f3));
                f4 = (rectF.bottom - f) * f3;
            }
            if (f4 > this.f149166d) {
                f = Math.max(rectF2.top, rectF.bottom - (this.f149166d / f3));
                f4 = (rectF.bottom - f) * f3;
            }
            if (!z || !z2) {
                if (z && rectF.right - f4 < rectF2.left) {
                    f = Math.max(rectF2.top, rectF.bottom - ((rectF.right - rectF2.left) / f3));
                    f4 = (rectF.bottom - f) * f3;
                }
                if (z2 && rectF.left + f4 > rectF2.right) {
                    f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((rectF2.right - rectF.left) / f3)));
                }
            } else {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            }
        }
        rectF.top = f;
    }

    /* renamed from: a */
    private void m232381a(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f /= 1.05f;
            this.f149169g.x -= f / 1.1f;
        }
        if (f < rectF2.left) {
            this.f149169g.x -= (f - rectF2.left) / 2.0f;
        }
        if (f - rectF2.left < f2) {
            f = rectF2.left;
        }
        if (rectF.right - f < this.f149164b) {
            f = rectF.right - this.f149164b;
        }
        if (rectF.right - f > this.f149166d) {
            f = rectF.right - this.f149166d;
        }
        if (f - rectF2.left < f2) {
            f = rectF2.left;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f4 = (rectF.right - f) / f3;
            if (f4 < this.f149165c) {
                f = Math.max(rectF2.left, rectF.right - (this.f149165c * f3));
                f4 = (rectF.right - f) / f3;
            }
            if (f4 > this.f149167e) {
                f = Math.max(rectF2.left, rectF.right - (this.f149167e * f3));
                f4 = (rectF.right - f) / f3;
            }
            if (!z || !z2) {
                if (z && rectF.bottom - f4 < rectF2.top) {
                    f = Math.max(rectF2.left, rectF.right - ((rectF.bottom - rectF2.top) * f3));
                    f4 = (rectF.right - f) / f3;
                }
                if (z2 && rectF.top + f4 > rectF2.bottom) {
                    f = Math.max(f, Math.max(rectF2.left, rectF.right - ((rectF2.bottom - rectF.top) * f3)));
                }
            } else {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            }
        }
        rectF.left = f;
    }

    /* renamed from: a */
    private void m232380a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        switch (C598951.f149170a[this.f149168f.ordinal()]) {
            case 1:
                if (m232376a(f, f2, rectF.right, rectF.bottom) < f4) {
                    m232386b(rectF, f2, rectF2, f3, f4, true, false);
                    m232377a(rectF, f4);
                    return;
                }
                m232381a(rectF, f, rectF2, f3, f4, true, false);
                m232384b(rectF, f4);
                return;
            case 2:
                if (m232376a(rectF.left, f2, f, rectF.bottom) < f4) {
                    m232386b(rectF, f2, rectF2, f3, f4, false, true);
                    m232389c(rectF, f4);
                    return;
                }
                m232382a(rectF, f, rectF2, i, f3, f4, true, false);
                m232384b(rectF, f4);
                return;
            case 3:
                if (m232376a(f, rectF.top, rectF.right, f2) < f4) {
                    m232387b(rectF, f2, rectF2, i2, f3, f4, true, false);
                    m232377a(rectF, f4);
                    return;
                }
                m232381a(rectF, f, rectF2, f3, f4, false, true);
                m232391d(rectF, f4);
                return;
            case 4:
                if (m232376a(rectF.left, rectF.top, f, f2) < f4) {
                    m232387b(rectF, f2, rectF2, i2, f3, f4, false, true);
                    m232389c(rectF, f4);
                    return;
                }
                m232382a(rectF, f, rectF2, i, f3, f4, false, true);
                m232391d(rectF, f4);
                return;
            case 5:
                m232381a(rectF, f, rectF2, f3, f4, true, true);
                m232390c(rectF, rectF2, f4);
                return;
            case 6:
                m232386b(rectF, f2, rectF2, f3, f4, true, true);
                m232388b(rectF, rectF2, f4);
                return;
            case 7:
                m232382a(rectF, f, rectF2, i, f3, f4, true, true);
                m232390c(rectF, rectF2, f4);
                return;
            case 8:
                m232387b(rectF, f2, rectF2, i2, f3, f4, true, true);
                m232388b(rectF, rectF2, f4);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m232387b(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f149169g.y -= (f - f4) / 1.1f;
        }
        if (f > rectF2.bottom) {
            this.f149169g.y -= (f - rectF2.bottom) / 2.0f;
        }
        if (rectF2.bottom - f < f2) {
            f = rectF2.bottom;
        }
        if (f - rectF.top < this.f149165c) {
            f = rectF.top + this.f149165c;
        }
        if (f - rectF.top > this.f149167e) {
            f = rectF.top + this.f149167e;
        }
        if (rectF2.bottom - f < f2) {
            f = rectF2.bottom;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f5 = (f - rectF.top) * f3;
            if (f5 < this.f149164b) {
                f = Math.min(rectF2.bottom, rectF.top + (this.f149164b / f3));
                f5 = (f - rectF.top) * f3;
            }
            if (f5 > this.f149166d) {
                f = Math.min(rectF2.bottom, rectF.top + (this.f149166d / f3));
                f5 = (f - rectF.top) * f3;
            }
            if (!z || !z2) {
                if (z && rectF.right - f5 < rectF2.left) {
                    f = Math.min(rectF2.bottom, rectF.top + ((rectF.right - rectF2.left) / f3));
                    f5 = (f - rectF.top) * f3;
                }
                if (z2 && rectF.left + f5 > rectF2.right) {
                    f = Math.min(f, Math.min(rectF2.bottom, rectF.top + ((rectF2.right - rectF.left) / f3)));
                }
            } else {
                f = Math.min(f, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3)));
            }
        }
        if (!Float.isNaN(f) && f > BitmapDescriptorFactory.HUE_RED) {
            rectF.bottom = f;
        }
    }

    /* renamed from: a */
    private void m232382a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f149169g.x -= (f - f4) / 1.1f;
        }
        if (f > rectF2.right) {
            this.f149169g.x -= (f - rectF2.right) / 2.0f;
        }
        if (rectF2.right - f < f2) {
            f = rectF2.right;
        }
        if (f - rectF.left < this.f149164b) {
            f = rectF.left + this.f149164b;
        }
        if (f - rectF.left > this.f149166d) {
            f = rectF.left + this.f149166d;
        }
        if (rectF2.right - f < f2) {
            f = rectF2.right;
        }
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            float f5 = (f - rectF.left) / f3;
            if (f5 < this.f149165c) {
                f = Math.min(rectF2.right, rectF.left + (this.f149165c * f3));
                f5 = (f - rectF.left) / f3;
            }
            if (f5 > this.f149167e) {
                f = Math.min(rectF2.right, rectF.left + (this.f149167e * f3));
                f5 = (f - rectF.left) / f3;
            }
            if (!z || !z2) {
                if (z && rectF.bottom - f5 < rectF2.top) {
                    f = Math.min(rectF2.right, rectF.left + ((rectF.bottom - rectF2.top) * f3));
                    f5 = (f - rectF.left) / f3;
                }
                if (z2 && rectF.top + f5 > rectF2.bottom) {
                    f = Math.min(f, Math.min(rectF2.right, rectF.left + ((rectF2.bottom - rectF.top) * f3)));
                }
            } else {
                f = Math.min(f, Math.min(rectF2.right, rectF.left + (rectF2.height() * f3)));
            }
        }
        rectF.right = f;
    }

    /* renamed from: a */
    public void mo203952a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        float f5 = f + this.f149169g.x;
        float f6 = f2 + this.f149169g.y;
        if (this.f149168f == Type.CENTER) {
            m232379a(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            m232380a(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            m232385b(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }
}
