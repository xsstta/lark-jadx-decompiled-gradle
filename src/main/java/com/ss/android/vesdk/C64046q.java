package com.ss.android.vesdk;

import android.media.MediaExtractor;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vesdk.q */
public class C64046q {

    /* renamed from: a */
    private static String f161720a = "VEConcatHelper";

    /* renamed from: a */
    private static String m251365a(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                String string = mediaExtractor.getTrackFormat(i).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    str2 = string;
                }
            }
            mediaExtractor.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    /* renamed from: a */
    public static boolean m251366a(String[] strArr) {
        String str = null;
        for (String str2 : strArr) {
            String a = m251365a(str2);
            if (str == null) {
                str = a;
            }
            if (str == null || !str.equals(a)) {
                C63929ab.m250980d(f161720a, "isCodecsValid false mime= " + a + " lastMime " + str);
                return false;
            }
        }
        C63929ab.m250974a(f161720a, "isCodecsValid");
        return true;
    }
}
