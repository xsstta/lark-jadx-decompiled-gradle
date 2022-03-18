package com.ss.android.photoeditor.ve.crop.view;

import android.graphics.RectF;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.crop.view.VECropOverlayView;
import com.ss.android.photoeditor.ve.crop.view.VECropWindowMoveHandler;

/* renamed from: com.ss.android.photoeditor.ve.crop.view.b */
public final class C59897b {

    /* renamed from: a */
    private final RectF f149183a = new RectF();

    /* renamed from: b */
    private final RectF f149184b = new RectF();

    /* renamed from: c */
    private float f149185c;

    /* renamed from: d */
    private float f149186d;

    /* renamed from: e */
    private float f149187e;

    /* renamed from: f */
    private float f149188f;

    /* renamed from: g */
    private float f149189g;

    /* renamed from: h */
    private float f149190h;

    /* renamed from: i */
    private float f149191i;

    /* renamed from: j */
    private float f149192j;

    /* renamed from: k */
    private float f149193k = 1.0f;

    /* renamed from: l */
    private float f149194l = 1.0f;

    /* renamed from: c */
    private static boolean m232417c(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: f */
    public float mo203974f() {
        return this.f149193k;
    }

    /* renamed from: g */
    public float mo203975g() {
        return this.f149194l;
    }

    /* renamed from: i */
    private boolean m232418i() {
        return !mo203976h();
    }

    /* renamed from: a */
    public RectF mo203965a() {
        this.f149184b.set(this.f149183a);
        return this.f149184b;
    }

    /* renamed from: b */
    public float mo203970b() {
        return Math.max(this.f149185c, this.f149189g / this.f149193k);
    }

    /* renamed from: c */
    public float mo203971c() {
        return Math.max(this.f149186d, this.f149190h / this.f149194l);
    }

    /* renamed from: d */
    public float mo203972d() {
        return Math.min(this.f149187e, this.f149191i / this.f149193k);
    }

    /* renamed from: e */
    public float mo203973e() {
        return Math.min(this.f149188f, this.f149192j / this.f149194l);
    }

    /* renamed from: h */
    public boolean mo203976h() {
        if (this.f149183a.width() < 100.0f || this.f149183a.height() < 100.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo203968a(RectF rectF) {
        if (VECropOverlayView.C59889d.m232360a(rectF)) {
            this.f149183a.set(rectF);
        }
    }

    /* renamed from: a */
    public void mo203969a(CropImageOptions cropImageOptions) {
        this.f149185c = (float) cropImageOptions.f148957x;
        this.f149186d = (float) cropImageOptions.f148958y;
        this.f149189g = (float) cropImageOptions.f148959z;
        this.f149190h = (float) cropImageOptions.f148912A;
        this.f149191i = (float) cropImageOptions.f148913B;
        this.f149192j = (float) cropImageOptions.f148914C;
    }

    /* renamed from: a */
    private VECropWindowMoveHandler.Type m232412a(float f, float f2) {
        float width = this.f149183a.width() / 6.0f;
        float f3 = this.f149183a.left + width;
        float f4 = this.f149183a.left + (width * 5.0f);
        float height = this.f149183a.height() / 6.0f;
        float f5 = this.f149183a.top + height;
        float f6 = this.f149183a.top + (height * 5.0f);
        if (f < f3) {
            if (f2 < f5) {
                return VECropWindowMoveHandler.Type.TOP_LEFT;
            }
            if (f2 < f6) {
                return VECropWindowMoveHandler.Type.LEFT;
            }
            return VECropWindowMoveHandler.Type.BOTTOM_LEFT;
        } else if (f < f4) {
            if (f2 < f5) {
                return VECropWindowMoveHandler.Type.TOP;
            }
            if (f2 < f6) {
                return VECropWindowMoveHandler.Type.CENTER;
            }
            return VECropWindowMoveHandler.Type.BOTTOM;
        } else if (f2 < f5) {
            return VECropWindowMoveHandler.Type.TOP_RIGHT;
        } else {
            if (f2 < f6) {
                return VECropWindowMoveHandler.Type.RIGHT;
            }
            return VECropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
    }

    /* renamed from: a */
    private VECropWindowMoveHandler.Type m232413a(float f, float f2, float f3) {
        if (m232414a(f, f2, this.f149183a.left, this.f149183a.top, f3)) {
            return VECropWindowMoveHandler.Type.TOP_LEFT;
        }
        if (m232414a(f, f2, this.f149183a.right, this.f149183a.top, f3)) {
            return VECropWindowMoveHandler.Type.TOP_RIGHT;
        }
        if (m232414a(f, f2, this.f149183a.left, this.f149183a.bottom, f3)) {
            return VECropWindowMoveHandler.Type.BOTTOM_LEFT;
        }
        if (m232414a(f, f2, this.f149183a.right, this.f149183a.bottom, f3)) {
            return VECropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
        if (m232417c(f, f2, this.f149183a.left, this.f149183a.top, this.f149183a.right, this.f149183a.bottom) && m232418i()) {
            return VECropWindowMoveHandler.Type.CENTER;
        }
        if (m232415a(f, f2, this.f149183a.left, this.f149183a.right, this.f149183a.top, f3)) {
            return VECropWindowMoveHandler.Type.TOP;
        }
        if (m232415a(f, f2, this.f149183a.left, this.f149183a.right, this.f149183a.bottom, f3)) {
            return VECropWindowMoveHandler.Type.BOTTOM;
        }
        if (m232416b(f, f2, this.f149183a.left, this.f149183a.top, this.f149183a.bottom, f3)) {
            return VECropWindowMoveHandler.Type.LEFT;
        }
        if (m232416b(f, f2, this.f149183a.right, this.f149183a.top, this.f149183a.bottom, f3)) {
            return VECropWindowMoveHandler.Type.RIGHT;
        }
        if (!m232417c(f, f2, this.f149183a.left, this.f149183a.top, this.f149183a.right, this.f149183a.bottom) || m232418i()) {
            return null;
        }
        return VECropWindowMoveHandler.Type.CENTER;
    }

    /* renamed from: a */
    public VECropWindowMoveHandler mo203966a(float f, float f2, float f3, CropImageView.CropShape cropShape) {
        VECropWindowMoveHandler.Type type;
        if (cropShape == CropImageView.CropShape.OVAL) {
            type = m232412a(f, f2);
        } else {
            type = m232413a(f, f2, f3);
        }
        if (type == null || type == VECropWindowMoveHandler.Type.CENTER) {
            return null;
        }
        return new VECropWindowMoveHandler(type, this, f, f2);
    }

    /* renamed from: a */
    public void mo203967a(float f, float f2, float f3, float f4) {
        this.f149187e = f;
        this.f149188f = f2;
        this.f149193k = f3;
        this.f149194l = f4;
    }

    /* renamed from: a */
    private static boolean m232414a(float f, float f2, float f3, float f4, float f5) {
        if (Math.abs(f - f3) > f5 || Math.abs(f2 - f4) > f5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m232416b(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f - f3) > f6 || f2 <= f4 || f2 >= f5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m232415a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f <= f3 || f >= f4 || Math.abs(f2 - f5) > f6) {
            return false;
        }
        return true;
    }
}
