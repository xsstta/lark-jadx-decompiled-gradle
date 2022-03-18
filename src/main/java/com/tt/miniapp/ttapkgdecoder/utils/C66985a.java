package com.tt.miniapp.ttapkgdecoder.utils;

import com.google.android.gms.stats.CodePackage;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.tt.miniapp.ttapkgdecoder.utils.a */
public class C66985a {

    /* renamed from: a */
    private static final HashMap<String, C66986a> f168915a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Integer> f168916b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Integer> f168917c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<String, Integer> f168918d = new HashMap<>();

    /* renamed from: e */
    private static final HashMap<Integer, String> f168919e = new HashMap<>();

    /* renamed from: a */
    public static boolean m261095a(int i) {
        if (i < 1 || i > 10) {
            return i >= 11 && i <= 13;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m261096b(int i) {
        return (i >= 21 && i <= 30) || (i >= 200 && i <= 200);
    }

    static {
        m261094a("MP3", 1, "audio/mpeg", 12297);
        m261094a("MPGA", 1, "audio/mpeg", 12297);
        m261094a("M4A", 2, "audio/mp4", 12299);
        m261094a("WAV", 3, "audio/x-wav", 12296);
        m261093a("AMR", 4, "audio/amr");
        m261093a("AWB", 5, "audio/amr-wb");
        m261094a("OGG", 7, "audio/ogg", 47362);
        m261094a("OGG", 7, "application/ogg", 47362);
        m261094a("OGA", 7, "application/ogg", 47362);
        m261094a("AAC", 8, "audio/aac", 47363);
        m261094a("AAC", 8, "audio/aac-adts", 47363);
        m261093a("MKA", 9, "audio/x-matroska");
        m261093a("MID", 11, "audio/midi");
        m261093a("MIDI", 11, "audio/midi");
        m261093a("XMF", 11, "audio/midi");
        m261093a("RTTTL", 11, "audio/midi");
        m261093a("SMF", 12, "audio/sp-midi");
        m261093a("IMY", 13, "audio/imelody");
        m261093a("RTX", 11, "audio/midi");
        m261093a(CodePackage.OTA, 11, "audio/midi");
        m261093a("MXMF", 11, "audio/midi");
        m261094a("MPEG", 21, "video/mpeg", 12299);
        m261094a("MPG", 21, "video/mpeg", 12299);
        m261094a("MP4", 21, "video/mp4", 12299);
        m261094a("M4V", 22, "video/mp4", 12299);
        m261094a("3GP", 23, "video/3gpp", 47492);
        m261094a("3GPP", 23, "video/3gpp", 47492);
        m261094a("3G2", 24, "video/3gpp2", 47492);
        m261094a("3GPP2", 24, "video/3gpp2", 47492);
        m261093a("MKV", 27, "video/x-matroska");
        m261093a("WEBM", 30, "video/webm");
        m261093a("TS", 28, "video/mp2ts");
        m261093a("AVI", 29, "video/avi");
        m261094a("JPG", 31, "image/jpeg", 14337);
        m261094a("JPEG", 31, "image/jpeg", 14337);
        m261094a("GIF", 32, "image/gif", 14343);
        m261094a("PNG", 33, "image/png", 14347);
        m261094a("BMP", 34, "image/x-ms-bmp", 14340);
        m261093a("WBMP", 35, "image/vnd.wap.wbmp");
        m261093a("WEBP", 36, "image/webp");
        m261094a("M3U", 41, "audio/x-mpegurl", 47633);
        m261094a("M3U", 41, "application/x-mpegurl", 47633);
        m261094a("PLS", 42, "audio/x-scpls", 47636);
        m261094a("WPL", 43, "application/vnd.ms-wpl", 47632);
        m261093a("M3U8", 44, "application/vnd.apple.mpegurl");
        m261093a("M3U8", 44, "audio/mpegurl");
        m261093a("M3U8", 44, "audio/x-mpegurl");
        m261093a("FL", 51, "application/x-android-drm-fl");
        m261094a("TXT", 100, "text/plain", 12292);
        m261094a("HTM", 101, "text/html", 12293);
        m261094a("HTML", 101, "text/html", 12293);
        m261093a("PDF", 102, "application/pdf");
        m261094a("DOC", 104, "application/msword", 47747);
        m261094a("XLS", LocationRequest.PRIORITY_NO_POWER, "application/vnd.ms-excel", 47749);
        m261094a("PPT", 106, "application/mspowerpoint", 47750);
        m261094a("FLAC", 10, "audio/flac", 47366);
        m261093a("ZIP", ActivityIdentificationData.WALKING, "application/zip");
        m261093a("MPG", LocationRequest.PRIORITY_HD_ACCURACY, "video/mp2p");
        m261093a("MPEG", LocationRequest.PRIORITY_HD_ACCURACY, "video/mp2p");
    }

    /* renamed from: a */
    public static C66986a m261092a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        return f168915a.get(str.substring(lastIndexOf + 1).toUpperCase(Locale.ROOT));
    }

    /* renamed from: com.tt.miniapp.ttapkgdecoder.utils.a$a */
    public static class C66986a {

        /* renamed from: a */
        public final int f168920a;

        /* renamed from: b */
        public final String f168921b;

        C66986a(int i, String str) {
            this.f168920a = i;
            this.f168921b = str;
        }
    }

    /* renamed from: a */
    static void m261093a(String str, int i, String str2) {
        f168915a.put(str, new C66986a(i, str2));
        f168916b.put(str2, Integer.valueOf(i));
    }

    /* renamed from: a */
    static void m261094a(String str, int i, String str2, int i2) {
        m261093a(str, i, str2);
        f168917c.put(str, Integer.valueOf(i2));
        f168918d.put(str2, Integer.valueOf(i2));
        f168919e.put(Integer.valueOf(i2), str2);
    }
}
