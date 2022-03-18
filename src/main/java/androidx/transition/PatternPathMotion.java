package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.C0767f;
import androidx.core.graphics.C0770c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    private Path f5251a;

    /* renamed from: b */
    private final Path f5252b;

    /* renamed from: c */
    private final Matrix f5253c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f5252b = path;
        this.f5253c = new Matrix();
        path.lineTo(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f5251a = path;
    }

    /* renamed from: a */
    public void mo7873a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(BitmapDescriptorFactory.HUE_RED, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f5253c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float a = 1.0f / m6790a(f5, f6);
        this.f5253c.postScale(a, a);
        this.f5253c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f5253c, this.f5252b);
        this.f5251a = path;
    }

    /* renamed from: a */
    private static float m6790a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f5252b = new Path();
        this.f5253c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5441k);
        try {
            String a = C0767f.m3698a(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (a != null) {
                mo7873a(C0770c.m3722a(a));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo7802a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float a = m6790a(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f5253c.setScale(a, a);
        this.f5253c.postRotate((float) Math.toDegrees(atan2));
        this.f5253c.postTranslate(f, f2);
        Path path = new Path();
        this.f5252b.transform(this.f5253c, path);
        return path;
    }
}
