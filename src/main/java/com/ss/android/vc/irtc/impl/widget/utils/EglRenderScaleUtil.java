package com.ss.android.vc.irtc.impl.widget.utils;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class EglRenderScaleUtil {
    RectF mCurRect = new RectF();
    public float mLScale = 1.0f;
    public float mLx;
    public float mLy;
    public float mMaxScale = 8.0f;
    RectF mOrgRect = new RectF();
    public float mScale = 1.0f;
    public float mTCx;
    public float mTCy;
    public float mTScale = 1.0f;
    public float mTx;
    public float mTy;
    Rect mViewportRect = new Rect();
    public float mX;
    public float mY;

    public RectF getCurRect() {
        return this.mCurRect;
    }

    public RectF getOrgRect() {
        return this.mOrgRect;
    }

    public void reset() {
        this.mTx = BitmapDescriptorFactory.HUE_RED;
        this.mTy = BitmapDescriptorFactory.HUE_RED;
        this.mTCx = BitmapDescriptorFactory.HUE_RED;
        this.mTCy = BitmapDescriptorFactory.HUE_RED;
        this.mTScale = 1.0f;
        this.mLx = BitmapDescriptorFactory.HUE_RED;
        this.mLy = BitmapDescriptorFactory.HUE_RED;
        this.mLScale = 1.0f;
        this.mX = BitmapDescriptorFactory.HUE_RED;
        this.mY = BitmapDescriptorFactory.HUE_RED;
        this.mScale = 1.0f;
    }

    public void log(String str) {
        Log.w("EglRenderScaleUtil", str);
    }

    public void setMaxScale(float f) {
        if (f > 1.0f) {
            this.mMaxScale = f;
        }
    }

    public void setTranslate(float f, float f2, boolean z) {
        if (z) {
            this.mLx += this.mTx;
            this.mLy += this.mTy;
            this.mTx = BitmapDescriptorFactory.HUE_RED;
            this.mTy = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        this.mTx = f;
        this.mTy = f2;
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        float f4 = this.mLScale;
        float f5 = this.mMaxScale;
        if (f3 * f4 > f5) {
            f3 = f5 / f4;
        }
        if (z) {
            this.mLScale = f4 * this.mTScale;
            this.mTScale = 1.0f;
            this.mLx = this.mX;
            this.mLy = this.mY;
            return;
        }
        this.mTCx = f;
        this.mTCy = f2;
        this.mTScale = f3;
    }

    public Rect recalForDraw(int i, int i2, int i3, int i4, float f, float f2) {
        float f3 = (float) i;
        int i5 = (int) ((this.mLx * f) + f3);
        float f4 = (float) i2;
        int i6 = (int) ((this.mLy * f2) + f4);
        float f5 = this.mLScale;
        int i7 = (int) (((float) i3) * f5);
        int i8 = (int) (((float) i4) * f5);
        int i9 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i9 > 0 && f2 > BitmapDescriptorFactory.HUE_RED) {
            float f6 = this.mTx;
            if (!(f6 == BitmapDescriptorFactory.HUE_RED && this.mTy == BitmapDescriptorFactory.HUE_RED)) {
                i5 += (int) (f6 * f);
                i6 += (int) (this.mTy * f2);
            }
            float f7 = this.mTScale;
            if (f7 != 1.0f) {
                int i10 = (int) (this.mTCx * f);
                int i11 = (int) (this.mTCy * f2);
                i7 = (int) (((float) i7) * f7);
                i8 = (int) (((float) i8) * f7);
                i5 = (int) (((float) i10) - (((float) (i10 - i5)) * f7));
                i6 = (int) (((float) i11) - (f7 * ((float) (i11 - i6))));
                this.mX = ((float) (i5 - i)) / f;
                this.mY = ((float) (i6 - i2)) / f2;
            }
        }
        if (i9 > 0 && f2 > BitmapDescriptorFactory.HUE_RED) {
            float f8 = ((float) i5) / f;
            float f9 = 1.0f - (((float) i6) / f2);
            RectF rectF = this.mCurRect;
            rectF.set(f8, f9 - (((float) i8) / f2), (((float) i7) / f) + f8, f9);
            this.mOrgRect.set(f3 / f, f4 / f2, ((float) (i + i3)) / f, ((float) (i2 + i4)) / f2);
        }
        this.mViewportRect.set(i5, i6, i7 + i5, i8 + i6);
        return this.mViewportRect;
    }
}
