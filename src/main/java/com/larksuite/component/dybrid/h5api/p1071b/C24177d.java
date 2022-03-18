package com.larksuite.component.dybrid.h5api.p1071b;

import android.net.Uri;
import java.util.List;

/* renamed from: com.larksuite.component.dybrid.h5api.b.d */
public class C24177d {
    /* renamed from: a */
    public static String m88307a(Uri uri, String str) {
        if (uri.isOpaque()) {
            return "";
        }
        return uri.getQueryParameter(str);
    }

    /* renamed from: a */
    public static String m88308a(String str, String str2, String str3, List<Object> list) {
        int length;
        if (list == null || list.size() <= 0) {
            return str3;
        }
        if (str3 == null || str3.isEmpty()) {
            return "";
        }
        char[] charArray = str3.toCharArray();
        int indexOf = str3.indexOf(str, 0);
        if (indexOf == -1) {
            return str3;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = null;
        int i = 0;
        while (indexOf > -1) {
            if (indexOf <= 0 || charArray[indexOf - 1] != '\\') {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                } else {
                    sb2.setLength(0);
                }
                sb.append(charArray, i, indexOf - i);
                int length2 = str.length() + indexOf;
                int indexOf2 = str3.indexOf(str2, length2);
                while (true) {
                    if (indexOf2 <= -1) {
                        break;
                    } else if (indexOf2 <= length2 || charArray[indexOf2 - 1] != '\\') {
                        sb2.append(charArray, length2, indexOf2 - length2);
                        str2.length();
                    } else {
                        sb2.append(charArray, length2, (indexOf2 - length2) - 1);
                        sb2.append(str2);
                        length2 = str2.length() + indexOf2;
                        indexOf2 = str3.indexOf(str2, length2);
                    }
                }
                sb2.append(charArray, length2, indexOf2 - length2);
                str2.length();
                if (indexOf2 == -1) {
                    sb.append(charArray, indexOf, charArray.length - indexOf);
                    length = charArray.length;
                } else {
                    String str4 = "{" + sb2.toString() + "}";
                    try {
                        int parseInt = Integer.parseInt(sb2.toString()) - 1;
                        if (parseInt <= list.size() - 1) {
                            str4 = list.get(parseInt) == null ? "" : list.get(parseInt).toString();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sb.append(str4);
                    i = indexOf2 + str2.length();
                    indexOf = str3.indexOf(str, i);
                }
            } else {
                sb.append(charArray, i, (indexOf - i) - 1);
                sb.append(str);
                length = indexOf + str.length();
            }
            i = length;
            indexOf = str3.indexOf(str, i);
        }
        if (i < charArray.length) {
            sb.append(charArray, i, charArray.length - i);
        }
        return sb.toString();
    }
}
