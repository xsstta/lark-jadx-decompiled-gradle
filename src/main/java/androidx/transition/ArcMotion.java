package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.C0767f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {

    /* renamed from: a */
    private static final float f5162a = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: b */
    private float f5163b;

    /* renamed from: c */
    private float f5164c;

    /* renamed from: d */
    private float f5165d = 70.0f;

    /* renamed from: e */
    private float f5166e;

    /* renamed from: f */
    private float f5167f;

    /* renamed from: g */
    private float f5168g = f5162a;

    public ArcMotion() {
    }

    /* renamed from: a */
    public void mo7803a(float f) {
        this.f5163b = f;
        this.f5166e = m6696d(f);
    }

    /* renamed from: b */
    public void mo7804b(float f) {
        this.f5164c = f;
        this.f5167f = m6696d(f);
    }

    /* renamed from: c */
    public void mo7805c(float f) {
        this.f5165d = f;
        this.f5168g = m6696d(f);
    }

    /* renamed from: d */
    private static float m6696d(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5440j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo7804b(C0767f.m3692a(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, (float) BitmapDescriptorFactory.HUE_RED));
        mo7803a(C0767f.m3692a(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, (float) BitmapDescriptorFactory.HUE_RED));
        mo7805c(C0767f.m3692a(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo7802a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f5167f;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f7 = f2;
                f6 = f14 + f;
            } else {
                f6 = f3 - f14;
                f7 = f4;
            }
            f5 = this.f5166e;
        }
        float f15 = f13 * f5 * f5;
        float f16 = f11 - f6;
        float f17 = f12 - f7;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f5168g;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            if (f18 > f20) {
                f15 = f20;
            } else {
                f15 = BitmapDescriptorFactory.HUE_RED;
            }
        }
        if (f15 != BitmapDescriptorFactory.HUE_RED) {
            float sqrt = (float) Math.sqrt((double) (f15 / f18));
            f6 = ((f6 - f11) * sqrt) + f11;
            f7 = f12 + (sqrt * (f7 - f12));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }
}
