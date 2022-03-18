package com.ss.android.photoeditor.ve.crop.view;

import android.graphics.RectF;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.crop.view.CropOverlayView;
import com.ss.android.photoeditor.ve.crop.view.CropWindowMoveHandler;

/* renamed from: com.ss.android.photoeditor.ve.crop.view.a */
public final class C59896a {

    /* renamed from: a */
    private final RectF f149171a = new RectF();

    /* renamed from: b */
    private final RectF f149172b = new RectF();

    /* renamed from: c */
    private float f149173c;

    /* renamed from: d */
    private float f149174d;

    /* renamed from: e */
    private float f149175e;

    /* renamed from: f */
    private float f149176f;

    /* renamed from: g */
    private float f149177g;

    /* renamed from: h */
    private float f149178h;

    /* renamed from: i */
    private float f149179i;

    /* renamed from: j */
    private float f149180j;

    /* renamed from: k */
    private float f149181k = 1.0f;

    /* renamed from: l */
    private float f149182l = 1.0f;

    /* renamed from: c */
    private static boolean m232398c(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: f */
    public float mo203962f() {
        return this.f149181k;
    }

    /* renamed from: g */
    public float mo203963g() {
        return this.f149182l;
    }

    /* renamed from: i */
    private boolean m232399i() {
        return !mo203964h();
    }

    /* renamed from: a */
    public RectF mo203953a() {
        this.f149172b.set(this.f149171a);
        return this.f149172b;
    }

    /* renamed from: b */
    public float mo203958b() {
        return Math.max(this.f149173c, this.f149177g / this.f149181k);
    }

    /* renamed from: c */
    public float mo203959c() {
        return Math.max(this.f149174d, this.f149178h / this.f149182l);
    }

    /* renamed from: d */
    public float mo203960d() {
        return Math.min(this.f149175e, this.f149179i / this.f149181k);
    }

    /* renamed from: e */
    public float mo203961e() {
        return Math.min(this.f149176f, this.f149180j / this.f149182l);
    }

    /* renamed from: h */
    public boolean mo203964h() {
        if (this.f149171a.width() < 100.0f || this.f149171a.height() < 100.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo203956a(RectF rectF) {
        if (CropOverlayView.C59878d.m232305a(rectF)) {
            this.f149171a.set(rectF);
        }
    }

    /* renamed from: a */
    public void mo203957a(CropImageOptions cropImageOptions) {
        this.f149173c = (float) cropImageOptions.f148957x;
        this.f149174d = (float) cropImageOptions.f148958y;
        this.f149177g = (float) cropImageOptions.f148959z;
        this.f149178h = (float) cropImageOptions.f148912A;
        this.f149179i = (float) cropImageOptions.f148913B;
        this.f149180j = (float) cropImageOptions.f148914C;
    }

    /* renamed from: a */
    private CropWindowMoveHandler.Type m232393a(float f, float f2) {
        float width = this.f149171a.width() / 6.0f;
        float f3 = this.f149171a.left + width;
        float f4 = this.f149171a.left + (width * 5.0f);
        float height = this.f149171a.height() / 6.0f;
        float f5 = this.f149171a.top + height;
        float f6 = this.f149171a.top + (height * 5.0f);
        if (f < f3) {
            if (f2 < f5) {
                return CropWindowMoveHandler.Type.TOP_LEFT;
            }
            if (f2 < f6) {
                return CropWindowMoveHandler.Type.LEFT;
            }
            return CropWindowMoveHandler.Type.BOTTOM_LEFT;
        } else if (f < f4) {
            if (f2 < f5) {
                return CropWindowMoveHandler.Type.TOP;
            }
            if (f2 < f6) {
                return CropWindowMoveHandler.Type.CENTER;
            }
            return CropWindowMoveHandler.Type.BOTTOM;
        } else if (f2 < f5) {
            return CropWindowMoveHandler.Type.TOP_RIGHT;
        } else {
            if (f2 < f6) {
                return CropWindowMoveHandler.Type.RIGHT;
            }
            return CropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
    }

    /* renamed from: a */
    private CropWindowMoveHandler.Type m232394a(float f, float f2, float f3) {
        if (m232395a(f, f2, this.f149171a.left, this.f149171a.top, f3)) {
            return CropWindowMoveHandler.Type.TOP_LEFT;
        }
        if (m232395a(f, f2, this.f149171a.right, this.f149171a.top, f3)) {
            return CropWindowMoveHandler.Type.TOP_RIGHT;
        }
        if (m232395a(f, f2, this.f149171a.left, this.f149171a.bottom, f3)) {
            return CropWindowMoveHandler.Type.BOTTOM_LEFT;
        }
        if (m232395a(f, f2, this.f149171a.right, this.f149171a.bottom, f3)) {
            return CropWindowMoveHandler.Type.BOTTOM_RIGHT;
        }
        if (m232398c(f, f2, this.f149171a.left, this.f149171a.top, this.f149171a.right, this.f149171a.bottom) && m232399i()) {
            return CropWindowMoveHandler.Type.CENTER;
        }
        if (m232396a(f, f2, this.f149171a.left, this.f149171a.right, this.f149171a.top, f3)) {
            return CropWindowMoveHandler.Type.TOP;
        }
        if (m232396a(f, f2, this.f149171a.left, this.f149171a.right, this.f149171a.bottom, f3)) {
            return CropWindowMoveHandler.Type.BOTTOM;
        }
        if (m232397b(f, f2, this.f149171a.left, this.f149171a.top, this.f149171a.bottom, f3)) {
            return CropWindowMoveHandler.Type.LEFT;
        }
        if (m232397b(f, f2, this.f149171a.right, this.f149171a.top, this.f149171a.bottom, f3)) {
            return CropWindowMoveHandler.Type.RIGHT;
        }
        if (!m232398c(f, f2, this.f149171a.left, this.f149171a.top, this.f149171a.right, this.f149171a.bottom) || m232399i()) {
            return null;
        }
        return CropWindowMoveHandler.Type.CENTER;
    }

    /* renamed from: a */
    public CropWindowMoveHandler mo203954a(float f, float f2, float f3, CropImageView.CropShape cropShape) {
        CropWindowMoveHandler.Type type;
        if (cropShape == CropImageView.CropShape.OVAL) {
            type = m232393a(f, f2);
        } else {
            type = m232394a(f, f2, f3);
        }
        if (type == null || type == CropWindowMoveHandler.Type.CENTER) {
            return null;
        }
        return new CropWindowMoveHandler(type, this, f, f2);
    }

    /* renamed from: a */
    public void mo203955a(float f, float f2, float f3, float f4) {
        this.f149175e = f;
        this.f149176f = f2;
        this.f149181k = f3;
        this.f149182l = f4;
    }

    /* renamed from: a */
    private static boolean m232395a(float f, float f2, float f3, float f4, float f5) {
        if (Math.abs(f - f3) > f5 || Math.abs(f2 - f4) > f5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m232397b(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f - f3) > f6 || f2 <= f4 || f2 >= f5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m232396a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f <= f3 || f >= f4 || Math.abs(f2 - f5) > f6) {
            return false;
        }
        return true;
    }
}
