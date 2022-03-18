package com.ss.android.vc.meeting.module.livestream;

import java.math.BigDecimal;
import org.apache.commons.lang3.C69877e;

/* renamed from: com.ss.android.vc.meeting.module.livestream.h */
public class C62070h {
    /* renamed from: a */
    public static String m242513a(String str) {
        String str2;
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (!C69877e.m268161b(str)) {
            return "0";
        }
        BigDecimal bigDecimal = new BigDecimal("10000");
        BigDecimal bigDecimal2 = new BigDecimal(str);
        if (bigDecimal2.compareTo(bigDecimal) == -1) {
            stringBuffer.append(bigDecimal2.toString());
            str2 = "";
            str3 = str2;
        } else {
            str2 = bigDecimal2.divide(bigDecimal).toString();
            str3 = "w";
        }
        if (!"".equals(str2)) {
            int indexOf = str2.indexOf(".");
            if (indexOf == -1) {
                stringBuffer.append(str2);
                stringBuffer.append(str3);
            } else {
                int i = indexOf + 1;
                int i2 = i + 1;
                if (!str2.substring(i, i2).equals("0")) {
                    stringBuffer.append(str2.substring(0, i2));
                    stringBuffer.append(str3);
                } else {
                    stringBuffer.append(str2.substring(0, i - 1));
                    stringBuffer.append(str3);
                }
            }
        }
        if (stringBuffer.length() == 0) {
            return "0";
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m242514b(String str) {
        String str2;
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (!C69877e.m268161b(str)) {
            return "0";
        }
        BigDecimal bigDecimal = new BigDecimal("1000");
        BigDecimal bigDecimal2 = new BigDecimal("1000000");
        BigDecimal bigDecimal3 = new BigDecimal(str);
        if (bigDecimal3.compareTo(bigDecimal) == -1) {
            stringBuffer.append(bigDecimal3.toString());
            str2 = "";
            str3 = str2;
        } else if (bigDecimal3.compareTo(bigDecimal2) == -1) {
            str2 = bigDecimal3.divide(bigDecimal).toString();
            str3 = "K";
        } else {
            str2 = bigDecimal3.divide(bigDecimal2).toString();
            str3 = "M";
        }
        if (!"".equals(str2)) {
            int indexOf = str2.indexOf(".");
            if (indexOf == -1) {
                stringBuffer.append(str2);
                stringBuffer.append(str3);
            } else {
                int i = indexOf + 1;
                int i2 = i + 1;
                if (!str2.substring(i, i2).equals("0")) {
                    stringBuffer.append(str2.substring(0, i2));
                    stringBuffer.append(str3);
                } else {
                    stringBuffer.append(str2.substring(0, i - 1));
                    stringBuffer.append(str3);
                }
            }
        }
        if (stringBuffer.length() == 0) {
            return "0";
        }
        return stringBuffer.toString();
    }
}
