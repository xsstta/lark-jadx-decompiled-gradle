package com.ss.android.shapeimage.p3021a.p3022a;

import com.huawei.hms.framework.common.ContainerUtils;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.e */
public class C59978e {
    /* renamed from: a */
    static final String m232768a(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(ContainerUtils.FIELD_DELIMITER, "&amp;");
    }

    /* renamed from: a */
    static final String m232769a(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static final Float m232767a(String str, XmlPullParser xmlPullParser, float f, float f2, float f3) {
        float f4;
        String a = m232769a(str, xmlPullParser);
        if (a == null) {
            return null;
        }
        if (a.endsWith("px")) {
            return Float.valueOf(Float.parseFloat(a.substring(0, a.length() - 2)));
        }
        if (a.endsWith("pt")) {
            return Float.valueOf((Float.valueOf(a.substring(0, a.length() - 2)).floatValue() * f) / 72.0f);
        }
        if (a.endsWith("pc")) {
            return Float.valueOf((Float.valueOf(a.substring(0, a.length() - 2)).floatValue() * f) / 6.0f);
        }
        if (a.endsWith("cm")) {
            return Float.valueOf((Float.valueOf(a.substring(0, a.length() - 2)).floatValue() * f) / 2.54f);
        }
        if (a.endsWith("mm")) {
            return Float.valueOf((Float.valueOf(a.substring(0, a.length() - 2)).floatValue() * f) / 254.0f);
        }
        if (a.endsWith("in")) {
            return Float.valueOf(Float.valueOf(a.substring(0, a.length() - 2)).floatValue() * f);
        }
        if (!a.endsWith("%")) {
            return Float.valueOf(a);
        }
        Float valueOf = Float.valueOf(a.substring(0, a.length() - 1));
        if (str.contains("x") || str.equals("width")) {
            f4 = f2 / 100.0f;
        } else if (str.contains("y") || str.equals("height")) {
            f4 = f3 / 100.0f;
        } else {
            f4 = (f3 + f2) / 2.0f;
        }
        return Float.valueOf(valueOf.floatValue() * f4);
    }
}
