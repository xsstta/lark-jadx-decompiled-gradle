package com.tt.refer.common.util;

/* renamed from: com.tt.refer.common.util.c */
public class C67859c {
    /* renamed from: a */
    public static boolean m263997a(String str, String str2) {
        int parseInt;
        int parseInt2;
        if (str2 == null) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length != split2.length) {
            return false;
        }
        int i = 0;
        while (i < split.length && (parseInt = Integer.parseInt(split[i])) <= (parseInt2 = Integer.parseInt(split2[i]))) {
            if (parseInt < parseInt2) {
                return false;
            }
            i++;
        }
        return true;
    }
}
