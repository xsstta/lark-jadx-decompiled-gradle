package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.c */
final class C0757c {
    /* renamed from: a */
    private static Shader.TileMode m3671a(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.c$a */
    public static final class C0758a {

        /* renamed from: a */
        final int[] f3120a;

        /* renamed from: b */
        final float[] f3121b;

        C0758a(int i, int i2) {
            this.f3120a = new int[]{i, i2};
            this.f3121b = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }

        C0758a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3120a = new int[size];
            this.f3121b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f3120a[i] = list.get(i).intValue();
                this.f3121b[i] = list2.get(i).floatValue();
            }
        }

        C0758a(int i, int i2, int i3) {
            this.f3120a = new int[]{i, i2, i3};
            this.f3121b = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0757c.C0758a m3674b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0757c.m3674b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.c$a");
    }

    /* renamed from: a */
    static Shader m3672a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray a = C0767f.m3696a(resources, theme, attributeSet, new int[]{16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051});
            float a2 = C0767f.m3692a(a, xmlPullParser, "startX", 8, (float) BitmapDescriptorFactory.HUE_RED);
            float a3 = C0767f.m3692a(a, xmlPullParser, "startY", 9, (float) BitmapDescriptorFactory.HUE_RED);
            float a4 = C0767f.m3692a(a, xmlPullParser, "endX", 10, (float) BitmapDescriptorFactory.HUE_RED);
            float a5 = C0767f.m3692a(a, xmlPullParser, "endY", 11, (float) BitmapDescriptorFactory.HUE_RED);
            float a6 = C0767f.m3692a(a, xmlPullParser, "centerX", 3, (float) BitmapDescriptorFactory.HUE_RED);
            float a7 = C0767f.m3692a(a, xmlPullParser, "centerY", 4, (float) BitmapDescriptorFactory.HUE_RED);
            int a8 = C0767f.m3693a(a, xmlPullParser, ShareHitPoint.f121869d, 2, 0);
            int b = C0767f.m3701b(a, xmlPullParser, "startColor", 0, 0);
            boolean a9 = C0767f.m3700a(xmlPullParser, "centerColor");
            int b2 = C0767f.m3701b(a, xmlPullParser, "centerColor", 7, 0);
            int b3 = C0767f.m3701b(a, xmlPullParser, "endColor", 1, 0);
            int a10 = C0767f.m3693a(a, xmlPullParser, "tileMode", 6, 0);
            float a11 = C0767f.m3692a(a, xmlPullParser, "gradientRadius", 5, (float) BitmapDescriptorFactory.HUE_RED);
            a.recycle();
            C0758a a12 = m3673a(m3674b(resources, xmlPullParser, attributeSet, theme), b, b3, a9, b2);
            if (a8 != 1) {
                if (a8 != 2) {
                    return new LinearGradient(a2, a3, a4, a5, a12.f3120a, a12.f3121b, m3671a(a10));
                }
                return new SweepGradient(a6, a7, a12.f3120a, a12.f3121b);
            } else if (a11 > BitmapDescriptorFactory.HUE_RED) {
                return new RadialGradient(a6, a7, a11, a12.f3120a, a12.f3121b, m3671a(a10));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* renamed from: a */
    private static C0758a m3673a(C0758a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0758a(i, i3, i2);
        }
        return new C0758a(i, i2);
    }
}
