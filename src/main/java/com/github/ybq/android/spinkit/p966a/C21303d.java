package com.github.ybq.android.spinkit.p966a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import com.github.ybq.android.spinkit.p966a.p967a.animationInterpolatorC21296b;
import com.github.ybq.android.spinkit.p968b.AbstractC21312f;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.github.ybq.android.spinkit.a.d */
public class C21303d {

    /* renamed from: a */
    private AbstractC21312f f51841a;

    /* renamed from: b */
    private Interpolator f51842b;

    /* renamed from: c */
    private int f51843c = -1;

    /* renamed from: d */
    private long f51844d = 2000;

    /* renamed from: e */
    private int f51845e;

    /* renamed from: f */
    private Map<String, C21305b> f51846f = new HashMap();

    /* renamed from: a */
    public ObjectAnimator mo72393a() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f51846f.size()];
        int i = 0;
        for (Map.Entry<String, C21305b> entry : this.f51846f.entrySet()) {
            C21305b value = entry.getValue();
            Keyframe[] keyframeArr = new Keyframe[value.f51848b.length];
            float[] fArr = value.f51848b;
            int i2 = this.f51845e;
            float f = fArr[i2];
            while (i2 < this.f51845e + value.f51850d.length) {
                int i3 = i2 - this.f51845e;
                int length = i2 % value.f51850d.length;
                float f2 = fArr[length] - f;
                if (f2 < BitmapDescriptorFactory.HUE_RED) {
                    f2 += fArr[fArr.length - 1];
                }
                if (value instanceof C21306c) {
                    keyframeArr[i3] = Keyframe.ofInt(f2, value.f51850d[length].intValue());
                } else if (value instanceof C21304a) {
                    keyframeArr[i3] = Keyframe.ofFloat(f2, value.f51850d[length].floatValue());
                } else {
                    keyframeArr[i3] = Keyframe.ofObject(f2, value.f51850d[length]);
                }
                i2++;
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(value.f51849c, keyframeArr);
            i++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f51841a, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f51844d);
        ofPropertyValuesHolder.setRepeatCount(this.f51843c);
        ofPropertyValuesHolder.setInterpolator(this.f51842b);
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public C21303d mo72395a(long j) {
        this.f51844d = j;
        return this;
    }

    /* renamed from: a */
    public C21303d mo72396a(Interpolator interpolator) {
        this.f51842b = interpolator;
        return this;
    }

    /* renamed from: a */
    public C21303d mo72394a(int i) {
        if (i < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i = 0;
        }
        this.f51845e = i;
        return this;
    }

    public C21303d(AbstractC21312f fVar) {
        this.f51841a = fVar;
    }

    /* renamed from: a */
    public C21303d mo72397a(float... fArr) {
        mo72396a(animationInterpolatorC21296b.m77140a(fArr));
        return this;
    }

    /* renamed from: b */
    public C21303d mo72400b(float[] fArr, Float... fArr2) {
        m77151a(fArr, AbstractC21312f.f51865j, fArr2);
        return this;
    }

    /* renamed from: c */
    public C21303d mo72402c(float[] fArr, Float... fArr2) {
        m77151a(fArr, AbstractC21312f.f51862g, fArr2);
        return this;
    }

    /* renamed from: d */
    public C21303d mo72404d(float[] fArr, Float... fArr2) {
        m77151a(fArr, AbstractC21312f.f51863h, fArr2);
        return this;
    }

    /* renamed from: b */
    public C21303d mo72401b(float[] fArr, Integer... numArr) {
        m77152a(fArr, AbstractC21312f.f51857b, numArr);
        return this;
    }

    /* renamed from: c */
    public C21303d mo72403c(float[] fArr, Integer... numArr) {
        m77152a(fArr, AbstractC21312f.f51859d, numArr);
        return this;
    }

    /* renamed from: d */
    public C21303d mo72405d(float[] fArr, Integer... numArr) {
        m77152a(fArr, AbstractC21312f.f51858c, numArr);
        return this;
    }

    /* renamed from: a */
    private void m77150a(int i, int i2) {
        if (i != i2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: a */
    public C21303d mo72398a(float[] fArr, Float... fArr2) {
        m77151a(fArr, AbstractC21312f.f51866k, fArr2);
        return this;
    }

    /* renamed from: a */
    public C21303d mo72399a(float[] fArr, Integer... numArr) {
        m77152a(fArr, AbstractC21312f.f51867l, numArr);
        return this;
    }

    /* renamed from: a */
    private void m77151a(float[] fArr, Property property, Float[] fArr2) {
        m77150a(fArr.length, fArr2.length);
        this.f51846f.put(property.getName(), new C21304a(fArr, property, fArr2));
    }

    /* renamed from: a */
    private void m77152a(float[] fArr, Property property, Integer[] numArr) {
        m77150a(fArr.length, numArr.length);
        this.f51846f.put(property.getName(), new C21306c(fArr, property, numArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.ybq.android.spinkit.a.d$a */
    public class C21304a extends C21305b<Float> {
        public C21304a(float[] fArr, Property property, Float[] fArr2) {
            super(fArr, property, fArr2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.ybq.android.spinkit.a.d$c */
    public class C21306c extends C21305b<Integer> {
        public C21306c(float[] fArr, Property property, Integer[] numArr) {
            super(fArr, property, numArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.github.ybq.android.spinkit.a.d$b */
    public class C21305b<T> {

        /* renamed from: b */
        float[] f51848b;

        /* renamed from: c */
        Property f51849c;

        /* renamed from: d */
        T[] f51850d;

        public C21305b(float[] fArr, Property property, T[] tArr) {
            this.f51848b = fArr;
            this.f51849c = property;
            this.f51850d = tArr;
        }
    }
}
