package androidx.p042i.p043a.p044a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.C0767f;
import androidx.core.graphics.C0770c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.i.a.a.g  reason: invalid class name */
public class animationInterpolatorC1104g implements Interpolator {

    /* renamed from: a */
    private float[] f4103a;

    /* renamed from: b */
    private float[] f4104b;

    public float getInterpolation(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f4103a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f4103a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f4103a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return this.f4104b[i];
        }
        float[] fArr2 = this.f4104b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    /* renamed from: a */
    private void m5235a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f4103a = new float[min];
            this.f4104b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f4103a[i2] = fArr[0];
                this.f4104b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f4103a[0])) <= 1.0E-5d && ((double) Math.abs(this.f4104b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f4103a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f4104b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = BitmapDescriptorFactory.HUE_RED;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f4103a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f4103a[0]);
            sb.append(",");
            sb.append(this.f4104b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f4103a[i6]);
            sb.append(",");
            sb.append(this.f4104b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: a */
    private void m5232a(float f, float f2) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m5235a(path);
    }

    /* renamed from: a */
    private void m5234a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0767f.m3700a(xmlPullParser, "pathData")) {
            String a = C0767f.m3698a(typedArray, xmlPullParser, "pathData", 4);
            Path a2 = C0770c.m3722a(a);
            if (a2 != null) {
                m5235a(a2);
                return;
            }
            throw new InflateException("The path is null, which is created from " + a);
        } else if (!C0767f.m3700a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0767f.m3700a(xmlPullParser, "controlY1")) {
            float a3 = C0767f.m3692a(typedArray, xmlPullParser, "controlX1", 0, (float) BitmapDescriptorFactory.HUE_RED);
            float a4 = C0767f.m3692a(typedArray, xmlPullParser, "controlY1", 1, (float) BitmapDescriptorFactory.HUE_RED);
            boolean a5 = C0767f.m3700a(xmlPullParser, "controlX2");
            if (a5 != C0767f.m3700a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                m5232a(a3, a4);
            } else {
                m5233a(a3, a4, C0767f.m3692a(typedArray, xmlPullParser, "controlX2", 2, (float) BitmapDescriptorFactory.HUE_RED), C0767f.m3692a(typedArray, xmlPullParser, "controlY2", 3, (float) BitmapDescriptorFactory.HUE_RED));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public animationInterpolatorC1104g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public animationInterpolatorC1104g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4089l);
        m5234a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m5233a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m5235a(path);
    }
}
