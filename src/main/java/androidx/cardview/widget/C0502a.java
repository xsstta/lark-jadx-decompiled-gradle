package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0510g;

/* renamed from: androidx.cardview.widget.a */
class C0502a extends C0505c {
    C0502a() {
    }

    @Override // androidx.cardview.widget.C0505c, androidx.cardview.widget.AbstractC0508e
    /* renamed from: a */
    public void mo2840a() {
        C0510g.f1839a = new C0510g.AbstractC0511a() {
            /* class androidx.cardview.widget.C0502a.C05031 */

            @Override // androidx.cardview.widget.C0510g.AbstractC0511a
            /* renamed from: a */
            public void mo2841a(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
