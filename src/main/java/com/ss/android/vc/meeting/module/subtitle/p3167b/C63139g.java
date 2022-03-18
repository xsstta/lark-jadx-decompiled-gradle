package com.ss.android.vc.meeting.module.subtitle.p3167b;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.b.g */
public class C63139g {
    /* renamed from: a */
    public static String m247250a(long j) {
        if (j <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        if (j2 > 0) {
            if (j2 >= 10) {
                sb.append(j2);
                sb.append(":");
            } else {
                sb.append("0");
                sb.append(j2);
                sb.append(":");
            }
        }
        if (j4 == 0) {
            sb.append("00");
            sb.append(":");
        } else if (j4 <= 9) {
            sb.append("0");
            sb.append(j4);
            sb.append(":");
        } else {
            sb.append(j4);
            sb.append(":");
        }
        if (j5 == 0) {
            sb.append("00");
        } else if (j5 <= 9) {
            sb.append("0");
            sb.append(j5);
        } else {
            sb.append(j5);
        }
        return sb.toString();
    }
}
