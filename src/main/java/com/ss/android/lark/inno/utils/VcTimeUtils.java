package com.ss.android.lark.inno.utils;

public class VcTimeUtils {

    public enum Scene {
        Live,
        Video
    }

    /* renamed from: a */
    public static String m154338a(Scene scene, long j) {
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        long j4 = j3 / 60000;
        long j5 = (j3 % 60000) / 1000;
        if (j2 > 0 || scene == Scene.Live) {
            return String.format("%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5));
        }
        return String.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j5));
    }
}
