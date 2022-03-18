package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.f */
public class C0767f {
    /* renamed from: a */
    private static ColorStateList m3695a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: a */
    public static boolean m3700a(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static TypedValue m3702b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3700a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: a */
    public static TypedArray m3696a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m3698a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3700a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static float m3692a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m3700a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static int m3701b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3700a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static int m3703c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3700a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static int m3693a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3700a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static ColorStateList m3694a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m3700a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        if (typedValue.type == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (typedValue.type < 28 || typedValue.type > 31) {
            return C0755a.m3654a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m3695a(typedValue);
        }
    }

    /* renamed from: a */
    public static boolean m3699a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m3700a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static C0756b m3697a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m3700a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0756b.m3659a(typedValue.data);
            }
            C0756b a = C0756b.m3661a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0756b.m3659a(i2);
    }
}
