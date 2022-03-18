package androidx.appcompat.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0774a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable extends Drawable {

    /* renamed from: b */
    private static final float f790b = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f791a;

    /* renamed from: c */
    private float f792c;

    /* renamed from: d */
    private float f793d;

    /* renamed from: e */
    private float f794e;

    /* renamed from: f */
    private float f795f;

    /* renamed from: g */
    private boolean f796g;

    /* renamed from: h */
    private final Path f797h;

    /* renamed from: i */
    private final int f798i;

    /* renamed from: j */
    private boolean f799j;

    /* renamed from: k */
    private float f800k;

    /* renamed from: l */
    private float f801l;

    /* renamed from: m */
    private int f802m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    /* renamed from: a */
    private static float m1063a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return this.f798i;
    }

    public int getIntrinsicWidth() {
        return this.f798i;
    }

    /* renamed from: a */
    public void mo1005a(boolean z) {
        if (this.f799j != z) {
            this.f799j = z;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f791a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.f800k != f) {
            this.f800k = f;
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        if (i != this.f791a.getAlpha()) {
            this.f791a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Rect bounds = getBounds();
        int i2 = this.f802m;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? C0774a.m3781i(this) == 0 : C0774a.m3781i(this) == 1))) {
            z = true;
        }
        float f3 = this.f792c;
        float a = m1063a(this.f793d, (float) Math.sqrt((double) (f3 * f3 * 2.0f)), this.f800k);
        float a2 = m1063a(this.f793d, this.f794e, this.f800k);
        float round = (float) Math.round(m1063a(BitmapDescriptorFactory.HUE_RED, this.f801l, this.f800k));
        float a3 = m1063a(BitmapDescriptorFactory.HUE_RED, f790b, this.f800k);
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        float a4 = m1063a(f, f2, this.f800k);
        double d = (double) a;
        double d2 = (double) a3;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f797h.rewind();
        float a5 = m1063a(this.f795f + this.f791a.getStrokeWidth(), -this.f801l, this.f800k);
        float f4 = (-a2) / 2.0f;
        this.f797h.moveTo(f4 + round, BitmapDescriptorFactory.HUE_RED);
        this.f797h.rLineTo(a2 - (round * 2.0f), BitmapDescriptorFactory.HUE_RED);
        this.f797h.moveTo(f4, a5);
        this.f797h.rLineTo(round2, round3);
        this.f797h.moveTo(f4, -a5);
        this.f797h.rLineTo(round2, -round3);
        this.f797h.close();
        canvas.save();
        float strokeWidth = this.f791a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f5 = this.f795f;
        canvas.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f5))) / 4) * 2)) + (strokeWidth * 1.5f) + f5);
        if (this.f796g) {
            if (this.f799j ^ z) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(a4 * ((float) i));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f797h, this.f791a);
        canvas.restore();
    }
}
