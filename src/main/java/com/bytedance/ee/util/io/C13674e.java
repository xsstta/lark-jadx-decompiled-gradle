package com.bytedance.ee.util.io;

import android.graphics.BitmapFactory;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.io.e */
public class C13674e {

    /* renamed from: a */
    private static final Map<String, String> f35872a = new HashMap();

    static {
        m55484a();
    }

    /* renamed from: a */
    private static void m55484a() {
        Map<String, String> map = f35872a;
        map.put("ffd8ffe000104a464946", "jpg");
        map.put("89504e470d0a1a0a0000", "png");
        map.put("47494638396126026f01", "gif");
        map.put("49492a00227105008037", "tif");
        map.put("424d", "bmp");
        map.put("41433130313500000000", "dwg");
        map.put("3c21444f435459504520", "html");
        map.put("3c21646f637479706520", "htm");
        map.put("48544d4c207b0d0a0942", "css");
        map.put("696b2e71623d696b2e71", "js");
        map.put("7b5c727466315c616e73", "rtf");
        map.put("38425053000100000000", "psd");
        map.put("46726f6d3a203d3f6762", "eml");
        map.put("d0cf11e0a1b11ae10000", "doc");
        map.put("d0cf11e0a1b11ae10000", "vsd");
        map.put("5374616E64617264204A", "mdb");
        map.put("252150532D41646F6265", "ps");
        map.put("255044462d312e360d25", "pdf");
        map.put("2e524d46000000120001", "rmvb");
        map.put("464c5601050000000900", "flv");
        map.put("00000020667479706973", "mp4");
        map.put("49443303000000000f76", "mp3");
        map.put("000001ba210001000180", "mpg");
        map.put("3026b2758e66cf11a6d9", "wmv");
        map.put("524946464694c9015741", "wav");
        map.put("52494646d07d60074156", "avi");
        map.put("4d546864000000060001", "mid");
        map.put("504b0304140000000800", "zip");
        map.put("526172211a0700cf9073", "rar");
        map.put("235468697320636f6e66", "ini");
        map.put("504b03040a0000000000", "jar");
        map.put("4d5a9000030000000400", "exe");
        map.put("3c25402070616765206c", "jsp");
        map.put("4d616e69666573742d56", "mf");
        map.put("3c3f786d6c2076657273", "xml");
        map.put("efbbbf2f2a0d0a53514c", "sql");
        map.put("7061636b616765207765", "java");
        map.put("406563686f206f66660d", "bat");
        map.put("1f8b0800000000000000", "gz");
        map.put("6c6f67346a2e726f6f74", "properties");
        map.put("cafebabe0000002e0041", "class");
        map.put("49545346030000006000", "chm");
        map.put("04000000010000001300", "mxp");
        map.put("504b0304140006000800", "docx");
        map.put("d0cf11e0a1b11ae10000", "wps");
        map.put("6431303a637265617465", "torrent");
        map.put("494d4b48010100000200", "264");
        map.put("6D6F6F76", "mov");
        map.put("FF575043", "wpd");
        map.put("CFAD12FEC5FD746F", "dbx");
        map.put("2142444E", "pst");
        map.put("AC9EBD8F", "qdf");
        map.put("E3828596", "pwl");
        map.put("2E7261FD", "ram");
    }

    /* renamed from: a */
    private static String m55483a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m55485b(File file) {
        if (file != null && file.exists()) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                if (options.outHeight > 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                C13479a.m54761a("FileTypeUtils", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e A[EDGE_INSN: B:30:0x004e->B:14:0x004e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[Catch:{ FileNotFoundException -> 0x0057, IOException -> 0x0055 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m55482a(java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.util.io.C13674e.m55482a(java.io.File):java.lang.String");
    }
}
