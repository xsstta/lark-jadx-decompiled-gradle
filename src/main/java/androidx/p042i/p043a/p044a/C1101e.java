package androidx.p042i.p043a.p044a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.C0767f;
import androidx.core.graphics.C0770c;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.i.a.a.e */
public class C1101e {
    /* renamed from: a */
    private static boolean m5228a(int i) {
        return i >= 28 && i <= 31;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.i.a.a.e$a */
    public static class C1102a implements TypeEvaluator<C0770c.C0772b[]> {

        /* renamed from: a */
        private C0770c.C0772b[] f4101a;

        C1102a() {
        }

        /* renamed from: a */
        public C0770c.C0772b[] evaluate(float f, C0770c.C0772b[] bVarArr, C0770c.C0772b[] bVarArr2) {
            if (C0770c.m3725a(bVarArr, bVarArr2)) {
                if (!C0770c.m3725a(this.f4101a, bVarArr)) {
                    this.f4101a = C0770c.m3727a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f4101a[i].mo4294a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f4101a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static PropertyValuesHolder m5222a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        PropertyValuesHolder propertyValuesHolder;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m5228a(i7)) && (!z2 || !m5228a(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0770c.C0772b[] b = C0770c.m3729b(string);
            C0770c.C0772b[] b2 = C0770c.m3729b(string2);
            if (b == null && b2 == null) {
                return null;
            }
            if (b != null) {
                C1102a aVar = new C1102a();
                if (b2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, b);
                } else if (C0770c.m3725a(b, b2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, b, b2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (b2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C1102a(), b2);
            }
        } else {
            C1103f a = i == 3 ? C1103f.m5231a() : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        f2 = typedArray.getFloat(i2, BitmapDescriptorFactory.HUE_RED);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            f3 = typedArray.getFloat(i3, BitmapDescriptorFactory.HUE_RED);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        f = typedArray.getFloat(i3, BitmapDescriptorFactory.HUE_RED);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, BitmapDescriptorFactory.HUE_RED);
                } else if (m5228a(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                    } else if (m5228a(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5, i6);
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5);
                }
            } else if (z2) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, BitmapDescriptorFactory.HUE_RED);
                } else if (m5228a(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder3 == null || a == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a);
            return propertyValuesHolder3;
        }
    }

    /* renamed from: a */
    private static void m5225a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0767f.m3693a(typedArray, xmlPullParser, "duration", 1, (int) LocationRequest.PRIORITY_INDOOR);
        long a2 = (long) C0767f.m3693a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0767f.m3693a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0767f.m3700a(xmlPullParser, "valueFrom") && C0767f.m3700a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = m5212a(typedArray, 5, 6);
            }
            PropertyValuesHolder a4 = m5222a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(a4);
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0767f.m3693a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0767f.m3693a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m5224a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m5224a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0767f.m3698a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0767f.m3698a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0767f.m3698a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (a2 == null && a3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m5226a(C0770c.m3722a(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0767f.m3698a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m5226a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        arrayList.add(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        float f3 = BitmapDescriptorFactory.HUE_RED;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m5229a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p042i.p043a.p044a.C1101e.m5229a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m5221a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p042i.p043a.p044a.C1101e.m5221a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static void m5227a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m5220a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m5223a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static ValueAnimator m5223a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4084g);
        TypedArray a2 = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4088k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m5225a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0767f.m3703c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C1100d.m5209a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    public static Animator m5213a(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m5214a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    private static Keyframe m5218a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static int m5212a(TypedArray typedArray, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z2 = true;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = peekValue.type;
        } else {
            i3 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z2 = false;
        }
        if (z2) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if ((!z || !m5228a(i3)) && (!z2 || !m5228a(i4))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: a */
    public static Animator m5214a(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return m5215a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    private static int m5211a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        boolean z;
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4087j);
        int i = 0;
        TypedValue b = C0767f.m3702b(a, xmlPullParser, "value", 0);
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && m5228a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static Animator m5216a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return m5217a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* renamed from: a */
    public static Animator m5215a(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = m5216a(context, resources, theme, xmlResourceParser, f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Keyframe m5219a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z;
        Keyframe keyframe;
        TypedArray a = C0767f.m3696a(resources, theme, attributeSet, C1093a.f4087j);
        float a2 = C0767f.m3692a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0767f.m3702b(a, xmlPullParser, "value", 0);
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (i == 4) {
            if (!z || !m5228a(b.type)) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (z) {
            if (i == 0) {
                keyframe = Keyframe.ofFloat(a2, C0767f.m3692a(a, xmlPullParser, "value", 0, (float) BitmapDescriptorFactory.HUE_RED));
            } else if (i == 1 || i == 3) {
                keyframe = Keyframe.ofInt(a2, C0767f.m3693a(a, xmlPullParser, "value", 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(a2);
        } else {
            keyframe = Keyframe.ofInt(a2);
        }
        int c = C0767f.m3703c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C1100d.m5209a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m5217a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p042i.p043a.p044a.C1101e.m5217a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }
}
