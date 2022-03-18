package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.material.textfield.c */
class C22476c extends MaterialShapeDrawable {

    /* renamed from: e */
    private final Paint f55282e;

    /* renamed from: f */
    private final RectF f55283f;

    /* renamed from: g */
    private int f55284g;

    C22476c() {
        this(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo77143b() {
        mo78534a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: c */
    private void m81579c() {
        this.f55282e.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f55282e.setColor(-1);
        this.f55282e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo77141a() {
        return !this.f55283f.isEmpty();
    }

    /* renamed from: a */
    private boolean m81577a(Drawable.Callback callback) {
        return callback instanceof View;
    }

    /* renamed from: c */
    private void m81580c(Canvas canvas) {
        if (!m81577a(getCallback())) {
            canvas.restoreToCount(this.f55284g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78535a(RectF rectF) {
        mo78534a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22476c(C22398l lVar) {
        super(lVar == null ? new C22398l() : lVar);
        this.f55282e = new Paint(1);
        m81579c();
        this.f55283f = new RectF();
    }

    /* renamed from: a */
    private void m81576a(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m81577a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m81578b(canvas);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public void draw(Canvas canvas) {
        m81576a(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f55283f, this.f55282e);
        m81580c(canvas);
    }

    /* renamed from: b */
    private void m81578b(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f55284g = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.f55284g = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78534a(float f, float f2, float f3, float f4) {
        if (f != this.f55283f.left || f2 != this.f55283f.top || f3 != this.f55283f.right || f4 != this.f55283f.bottom) {
            this.f55283f.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
