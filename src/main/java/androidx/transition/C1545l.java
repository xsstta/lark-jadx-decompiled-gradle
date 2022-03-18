package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.l */
class C1545l {

    /* renamed from: a */
    static final Matrix f5419a = new Matrix() {
        /* class androidx.transition.C1545l.C15461 */

        public void reset() {
            mo8013a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8013a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public void set(Matrix matrix) {
            mo8013a();
        }

        public void setRotate(float f) {
            mo8013a();
        }

        public void setValues(float[] fArr) {
            mo8013a();
        }

        public boolean postConcat(Matrix matrix) {
            mo8013a();
            return false;
        }

        public boolean postRotate(float f) {
            mo8013a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            mo8013a();
            return false;
        }

        public boolean preRotate(float f) {
            mo8013a();
            return false;
        }

        public void setScale(float f, float f2) {
            mo8013a();
        }

        public void setSinCos(float f, float f2) {
            mo8013a();
        }

        public void setSkew(float f, float f2) {
            mo8013a();
        }

        public void setTranslate(float f, float f2) {
            mo8013a();
        }

        public boolean postScale(float f, float f2) {
            mo8013a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            mo8013a();
            return false;
        }

        public boolean postTranslate(float f, float f2) {
            mo8013a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            mo8013a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            mo8013a();
            return false;
        }

        public boolean preTranslate(float f, float f2) {
            mo8013a();
            return false;
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo8013a();
            return false;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            mo8013a();
            return false;
        }

        public void setRotate(float f, float f2, float f3) {
            mo8013a();
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo8013a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo8013a();
            return false;
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo8013a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo8013a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo8013a();
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo8013a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo8013a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo8013a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo8013a();
            return false;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo8013a();
            return false;
        }
    };
}
