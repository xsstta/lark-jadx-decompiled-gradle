package com.lynx.tasm.utils;

import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.fontface.FontFace;
import java.util.Map;

/* renamed from: com.lynx.tasm.utils.c */
public class C26946c {
    /* renamed from: a */
    public static String m97910a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"")) {
            int indexOf = str.indexOf("\"", 1);
            if (indexOf == -1) {
                return null;
            }
            return str.substring(1, indexOf);
        } else if (!str.startsWith("'")) {
            return str;
        } else {
            int indexOf2 = str.indexOf("'", 1);
            if (indexOf2 == -1) {
                return null;
            }
            return str.substring(1, indexOf2);
        }
    }

    /* renamed from: b */
    private static String m97911b(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        int length = str.length();
        if (str.startsWith("'") || str.startsWith("\"")) {
            i = 1;
        }
        if (str.endsWith("'") || str.endsWith("\"")) {
            length--;
        }
        if (i > length) {
            return null;
        }
        return str.substring(i, length);
    }

    /* renamed from: a */
    public static FontFace m97909a(AbstractC26684l lVar, String str) {
        Map d;
        int i;
        String a = m97910a(str);
        if (a == null || (d = lVar.mo94679d(a)) == null) {
            return null;
        }
        FontFace fontFace = new FontFace();
        fontFace.mo95687a(a);
        for (Object obj : d.values()) {
            if (obj instanceof String) {
                String str2 = (String) obj;
                int i2 = 0;
                int length = str2.length();
                while (i2 < length) {
                    int indexOf = str2.indexOf("url(", i2);
                    int indexOf2 = str2.indexOf("local(", i2);
                    if (indexOf == -1 && indexOf2 == -1) {
                        break;
                    }
                    if (indexOf == -1 || indexOf2 == -1) {
                        if (indexOf == -1) {
                            int indexOf3 = str2.indexOf(")", indexOf2);
                            if (indexOf3 == -1) {
                                break;
                            }
                            i = indexOf3 + 2;
                            String b = m97911b(str2.substring(indexOf2 + 6, indexOf3));
                            if (b == null) {
                                break;
                            }
                            fontFace.mo95691c(b);
                        } else {
                            int indexOf4 = str2.indexOf(")", indexOf);
                            if (indexOf4 == -1) {
                                break;
                            }
                            i = indexOf4 + 2;
                            String b2 = m97911b(str2.substring(indexOf + 4, indexOf4));
                            if (b2 == null) {
                                break;
                            }
                            fontFace.mo95690b(b2);
                        }
                    } else if (indexOf >= indexOf2) {
                        int indexOf5 = str2.indexOf(")", indexOf2);
                        if (indexOf5 == -1) {
                            break;
                        }
                        i = indexOf5 + 2;
                        String b3 = m97911b(str2.substring(indexOf2 + 6, indexOf5));
                        if (b3 == null) {
                            break;
                        }
                        fontFace.mo95691c(b3);
                    } else {
                        int indexOf6 = str2.indexOf(")", indexOf);
                        if (indexOf6 == -1) {
                            break;
                        }
                        i = indexOf6 + 2;
                        String b4 = m97911b(str2.substring(indexOf + 4, indexOf6));
                        if (b4 == null) {
                            break;
                        }
                        fontFace.mo95690b(b4);
                    }
                    i2 = i;
                }
            }
        }
        return fontFace;
    }
}
