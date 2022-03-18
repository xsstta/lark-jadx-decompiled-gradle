package com.bytedance.common.utility;

import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public final class StringUtils {
    private StringUtils() {
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String strEncode(String str) {
        if (isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String trimString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.trim();
    }

    public static String clean(String str) {
        int indexOf = str.indexOf(34);
        int lastIndexOf = str.lastIndexOf(34);
        if (indexOf < 0 || lastIndexOf <= indexOf) {
            return str;
        }
        return str.substring(indexOf + 1, lastIndexOf).trim();
    }

    public static String getShortDateTime(String str) {
        int indexOf = str.indexOf(45) + 1;
        int lastIndexOf = str.lastIndexOf(58);
        if (indexOf <= 0 || lastIndexOf <= 0) {
            return str;
        }
        return str.substring(indexOf, lastIndexOf);
    }

    public static String encryptWithXor(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return DigestUtils.toHexString(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String handleAdClickTrackUrl(String str) {
        if (isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new Random().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static boolean isChinese(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }

    public static String mapToString(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!isEmpty(str)) {
                    if (!isEmpty(str2)) {
                        jSONObject.put(str, str2);
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String removeBlank(String str) {
        if (isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static String toDBC(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (isChinese(charArray[i])) {
                if (charArray[i] == 12288) {
                    charArray[i] = ' ';
                } else if (charArray[i] > 65280 && charArray[i] < 65375) {
                    charArray[i] = (char) (charArray[i] - 65248);
                }
            }
        }
        return new String(charArray);
    }

    public static String toSBC(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = 12288;
            } else if (charArray[i] < 127 && charArray[i] > ' ') {
                charArray[i] = (char) (charArray[i] + 65248);
            }
        }
        return new String(charArray);
    }

    public static String bytesToHuman(long j) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            return "0 " + strArr[4];
        }
        for (int i = 0; i < 5; i++) {
            long j2 = jArr[i];
            if (j >= j2) {
                return format(j, j2, strArr[i]);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044 A[SYNTHETIC, Splitter:B:22:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[Catch:{ all -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String compressWithGzip(java.lang.String r5) throws java.io.IOException {
        /*
            boolean r0 = isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0036 }
            int r2 = r5.length()     // Catch:{ all -> 0x0036 }
            r0.<init>(r2)     // Catch:{ all -> 0x0036 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0033 }
            r2.<init>(r0)     // Catch:{ all -> 0x0033 }
            byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x0031 }
            r2.write(r5)     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ all -> 0x0031 }
            byte[] r5 = r0.toByteArray()     // Catch:{ all -> 0x0031 }
            r3 = 0
            int r4 = r5.length     // Catch:{ all -> 0x0031 }
            java.lang.String r5 = com.bytedance.common.utility.DigestUtils.toHexString(r5, r3, r4)     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ all -> 0x0030 }
            r0.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            return r5
        L_0x0031:
            r5 = move-exception
            goto L_0x0039
        L_0x0033:
            r5 = move-exception
            r2 = r1
            goto L_0x0039
        L_0x0036:
            r5 = move-exception
            r0 = r1
            r2 = r0
        L_0x0039:
            java.lang.String r3 = "Thread"
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x004d }
            com.bytedance.common.utility.Logger.m15167d(r3, r5)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ all -> 0x004c }
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            return r1
        L_0x004d:
            r5 = move-exception
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ all -> 0x0058 }
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.StringUtils.compressWithGzip(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC, Splitter:B:30:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[Catch:{ all -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061 A[Catch:{ all -> 0x0064 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String decompressWithGzip(java.lang.String r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.StringUtils.decompressWithGzip(java.lang.String):java.lang.String");
    }

    public static HashMap<String, String> parseResponse(String str) {
        String[] split = str.substring(str.indexOf(SmActions.ACTION_CALLING_ENTRY) + 1, str.lastIndexOf(SmActions.ACTION_RINGING_ENTRY)).split(",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : split) {
            String[] split2 = str2.split(":", 2);
            hashMap.put(clean(split2[0]), clean(split2[1]));
        }
        return hashMap;
    }

    public static boolean equal(String str, String str2) {
        if ((!isEmpty(str) || !isEmpty(str2)) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    public static String decryptWithXor(String str, Boolean... boolArr) {
        byte[] bArr;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (boolArr == null || boolArr.length <= 0 || !boolArr[0].booleanValue()) {
                bArr = DigestUtils.hexStringToBytes(str);
            } else {
                bArr = Base64.decode(str, 0);
            }
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ 5);
            }
            return new String(bArr, 0, bArr.length, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public static String ellipsize(String str, int i) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt <= 0 || charAt > 255) {
                i3 += 2;
            } else {
                i3++;
            }
            if (i3 > i) {
                sb.append("...");
                break;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    public static Map<String, String> stringToMap(String str, Map<String, String> map) {
        if (isEmpty(str) || map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!isEmpty(next)) {
                    if (!isEmpty(string)) {
                        map.put(next, string);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    private static String format(long j, long j2, String str) {
        double d = (double) j;
        if (j2 > 1) {
            d /= (double) j2;
        }
        return new DecimalFormat("#.##").format(d) + " " + str;
    }

    public static void escapeEcmaScript(StringBuilder sb, String str, boolean z) {
        if (z) {
            sb.append("\"");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"' || charAt == '\\') {
                sb.append('\\');
                sb.append(charAt);
            } else if (charAt == 8232 || charAt == 8233) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        continue;
                    case '\t':
                        sb.append("\\t");
                        continue;
                    case '\n':
                        sb.append("\\n");
                        continue;
                    default:
                        if (charAt > 31) {
                            sb.append(charAt);
                            break;
                        } else {
                            sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                            continue;
                        }
                }
            }
        }
        if (z) {
            sb.append("\"");
        }
    }
}
