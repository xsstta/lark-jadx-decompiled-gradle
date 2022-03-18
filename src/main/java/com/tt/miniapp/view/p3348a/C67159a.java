package com.tt.miniapp.view.p3348a;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.tt.miniapp.view.a.a */
public class C67159a implements TimeInterpolator {

    /* renamed from: a */
    protected PointF f169350a;

    /* renamed from: b */
    protected PointF f169351b;

    /* renamed from: c */
    protected PointF f169352c;

    /* renamed from: d */
    protected PointF f169353d;

    /* renamed from: e */
    protected PointF f169354e;

    public C67159a() {
        this(m261792a(19)[0], m261792a(19)[1], m261792a(19)[2], m261792a(19)[3]);
    }

    public float getInterpolation(float f) {
        return mo233527a(mo233528b(f));
    }

    /* renamed from: c */
    private float m261793c(float f) {
        return this.f169354e.x + (f * ((this.f169353d.x * 2.0f) + (this.f169352c.x * 3.0f * f)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo233528b(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            float d = m261794d(f2) - f;
            if (((double) Math.abs(d)) < 0.001d) {
                break;
            }
            f2 -= d / m261793c(f2);
        }
        return f2;
    }

    /* renamed from: d */
    private float m261794d(float f) {
        this.f169354e.x = this.f169350a.x * 3.0f;
        this.f169353d.x = ((this.f169351b.x - this.f169350a.x) * 3.0f) - this.f169354e.x;
        this.f169352c.x = (1.0f - this.f169354e.x) - this.f169353d.x;
        return f * (this.f169354e.x + ((this.f169353d.x + (this.f169352c.x * f)) * f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo233527a(float f) {
        this.f169354e.y = this.f169350a.y * 3.0f;
        this.f169353d.y = ((this.f169351b.y - this.f169350a.y) * 3.0f) - this.f169354e.y;
        this.f169352c.y = (1.0f - this.f169354e.y) - this.f169353d.y;
        return f * (this.f169354e.y + ((this.f169353d.y + (this.f169352c.y * f)) * f));
    }

    /* renamed from: a */
    protected static float[] m261792a(int i) {
        switch (i) {
            case 0:
                return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
            case 1:
                return new float[]{0.47f, BitmapDescriptorFactory.HUE_RED, 0.745f, 0.715f};
            case 2:
                return new float[]{0.39f, 0.575f, 0.565f, 1.0f};
            case 3:
                return new float[]{0.445f, 0.05f, 0.55f, 0.95f};
            case 4:
                return new float[]{0.26f, BitmapDescriptorFactory.HUE_RED, 0.6f, 0.2f};
            case 5:
                return new float[]{0.4f, 0.8f, 0.74f, 1.0f};
            case 6:
                return new float[]{0.48f, 0.04f, 0.52f, 0.96f};
            case 7:
                return new float[]{0.4f, BitmapDescriptorFactory.HUE_RED, 0.68f, 0.06f};
            case 8:
                return new float[]{0.32f, 0.94f, 0.6f, 1.0f};
            case 9:
                return new float[]{0.66f, BitmapDescriptorFactory.HUE_RED, 0.34f, 1.0f};
            case 10:
                return new float[]{0.52f, BitmapDescriptorFactory.HUE_RED, 0.74f, BitmapDescriptorFactory.HUE_RED};
            case 11:
                return new float[]{0.26f, 1.0f, 0.48f, 1.0f};
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return new float[]{0.76f, BitmapDescriptorFactory.HUE_RED, 0.24f, 1.0f};
            case 13:
                return new float[]{0.64f, BitmapDescriptorFactory.HUE_RED, 0.78f, BitmapDescriptorFactory.HUE_RED};
            case 14:
                return new float[]{0.22f, 1.0f, 0.36f, 1.0f};
            case 15:
                return new float[]{0.84f, BitmapDescriptorFactory.HUE_RED, 0.16f, 1.0f};
            case 16:
                return new float[]{0.66f, BitmapDescriptorFactory.HUE_RED, 0.86f, BitmapDescriptorFactory.HUE_RED};
            case 17:
                return new float[]{0.14f, 1.0f, 0.34f, 1.0f};
            case 18:
                return new float[]{0.9f, BitmapDescriptorFactory.HUE_RED, 0.1f, 1.0f};
            default:
                return new float[]{0.15f, 0.12f, BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
    }

    public C67159a(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f169352c = new PointF();
        this.f169353d = new PointF();
        this.f169354e = new PointF();
        if (pointF.x < BitmapDescriptorFactory.HUE_RED || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < BitmapDescriptorFactory.HUE_RED || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f169350a = pointF;
            this.f169351b = pointF2;
        }
    }

    public C67159a(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }

    public C67159a(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }
}
