package com.bytedance.crash.upload;

import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.C3850d;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3968x;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class CrashUploader {

    /* renamed from: a */
    public static boolean f11892a;

    /* renamed from: b */
    private static AbstractC3916j f11893b;

    /* renamed from: a */
    public static boolean m16090a() {
        return true;
    }

    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        
        final int nativeInt;

        public int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: a */
    private static byte[] m16096a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static String m16088a(String str, JSONObject jSONObject) {
        return m16101b(str, C3850d.m15955a(jSONObject, "aid", "4444", "device_id", C3774m.m15603d().mo15504a()));
    }

    /* renamed from: a */
    public static String m16087a(String str, String str2, String str3) {
        return m16105c(str, "aid=" + str2 + "&device_id=" + str3);
    }

    /* renamed from: a */
    public static byte[] m16095a(String str, Map<String, String> map) {
        return m16086a(m16101b(str, map), null, "application/json; charset=utf-8", "gzip", "GET", false, false).mo15580b();
    }

    /* renamed from: a */
    public static boolean m16092a(String str, String str2, String str3, String str4, File file) {
        try {
            C3918l lVar = new C3918l(str2, "UTF-8", false);
            lVar.mo15573a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str4);
            lVar.mo15573a("header", str3);
            lVar.mo15572a("file", file);
            lVar.mo15570a(str);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m16091a(File file) {
        try {
            return m16092a("raphael", C3774m.m15611l().getNativeMemUrl(), Header.m15402b(C3774m.m15609j()).mo15227f().toString(), new JSONObject().put("event_type", "raphael_file").put("timestamp", System.currentTimeMillis()).toString(), file);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m16093a(String str, String str2, String str3, String str4, List<String> list) {
        if (C3775n.m15663n()) {
            return false;
        }
        try {
            C3918l lVar = new C3918l(str, "UTF-8", false);
            lVar.mo15573a("aid", str2);
            lVar.mo15573a("device_id", str3);
            lVar.mo15573a("os", "Android");
            lVar.mo15573a("process_name", str4);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "crash");
                    lVar.mo15571a(file, hashMap);
                }
            }
            try {
                if (new JSONObject(lVar.mo15570a("alog")).optInt("errno", -1) == 200) {
                    return true;
                }
                return false;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m16094a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C3954p.m16437a(byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: c */
    public static String m16104c() {
        return C3774m.m15611l().getAlogUploadUrl();
    }

    /* renamed from: d */
    public static String m16106d() {
        return C3774m.m15611l().getLaunchCrashUploadUrl();
    }

    /* renamed from: e */
    public static String m16108e() {
        return C3774m.m15611l().getNativeCrashUploadUrl();
    }

    /* renamed from: f */
    public static String m16109f() {
        return C3774m.m15611l().getAsanReportUploadUrl();
    }

    /* renamed from: b */
    public static String m16100b() {
        return C3774m.m15611l().getJavaCrashUploadUrl();
    }

    /* renamed from: a */
    public static void m16089a(AbstractC3916j jVar) {
        f11893b = jVar;
    }

    /* renamed from: c */
    private static C3922n m16103c(byte[] bArr) {
        return new C3922n(204, bArr);
    }

    /* renamed from: b */
    private static byte[] m16102b(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static C3922n m16079a(String str, String str2) {
        return m16084a(str, str2, m16090a());
    }

    /* renamed from: b */
    public static C3922n m16097b(String str, String str2) {
        return m16084a(str, str2, m16090a());
    }

    /* renamed from: d */
    private static String m16107d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    private static String m16101b(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                    }
                    sb.append(m16107d(entry.getKey().toString(), "UTF-8"));
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(m16107d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: c */
    public static String m16105c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
                str = str + ContainerUtils.FIELD_DELIMITER;
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: a */
    private static C3922n m16084a(String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str)) {
                    return m16078a(2097152, str, str2.getBytes(), CompressType.GZIP, "application/json; charset=utf-8", z);
                }
            }
            return new C3922n(201);
        } catch (Throwable th) {
            C3968x.m16537b(th);
            return new C3922n(207, th);
        }
    }

    /* renamed from: a */
    public static C3922n m16085a(String str, String str2, File... fileArr) {
        return m16098b("unknown_old", str, str2, new C3949m.C3951b(fileArr, true));
    }

    /* renamed from: a */
    public static C3922n m16082a(String str, String str2, String str3, C3949m.C3951b... bVarArr) {
        return m16098b(str, str2, str3, bVarArr);
    }

    /* renamed from: b */
    public static C3922n m16098b(String str, String str2, String str3, C3949m.C3951b... bVarArr) {
        return m16081a(str, str2, str3, (File) null, bVarArr);
    }

    /* renamed from: a */
    public static C3922n m16080a(String str, String str2, File file, C3949m.C3951b... bVarArr) {
        return m16081a(CrashType.NATIVE.getName(), str, str2, file, bVarArr);
    }

    /* renamed from: a */
    public static C3922n m16083a(String str, String str2, String str3, File... fileArr) {
        return m16098b(str, str2, str3, new C3949m.C3951b(fileArr, true));
    }

    /* renamed from: a */
    public static C3922n m16081a(String str, String str2, String str3, File file, C3949m.C3951b... bVarArr) {
        if (C3775n.m15663n()) {
            return new C3922n(201);
        }
        try {
            C3918l lVar = new C3918l(m16105c(str2, "have_dump=true&encrypt=true"), "UTF-8", true);
            lVar.mo15574a("json", str3, true);
            lVar.mo15576a("file", bVarArr);
            if (file != null) {
                lVar.mo15572a("minidmp", file);
            }
            try {
                JSONObject jSONObject = new JSONObject(lVar.mo15570a(str));
                C3968x.m16530a((Object) "success upload crash log");
                return new C3922n(0, jSONObject);
            } catch (JSONException e) {
                C3968x.m16530a((Object) "err upload crash log");
                return new C3922n(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            C3968x.m16531a("err upload crash log " + e2);
            return new C3922n(207);
        }
    }

    /* renamed from: a */
    private static C3922n m16078a(long j, String str, byte[] bArr, CompressType compressType, String str2, boolean z) throws IOException {
        if (C3775n.m15663n()) {
            return new C3922n(201);
        }
        if (str == null) {
            return new C3922n(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        String str3 = null;
        if (CompressType.GZIP == compressType && length > 128) {
            bArr = m16102b(bArr);
            str3 = "gzip";
        } else if (CompressType.DEFLATER == compressType && length > 128) {
            bArr = m16096a(bArr);
            str3 = "deflate";
        }
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            return new C3922n(202);
        }
        if (!z) {
            return m16099b(str, bArr2, str2, str3, "POST", true, false);
        }
        byte[] a = C3774m.m15611l().getEncryptImpl().mo15182a(bArr2);
        if (a != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
                str = str + ContainerUtils.FIELD_DELIMITER;
            }
            str = str + "tt_data=a";
            str2 = "application/octet-stream;tt-data=a";
            bArr2 = a;
        }
        return m16099b(str, bArr2, str2, str3, "POST", true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d6 A[SYNTHETIC, Splitter:B:75:0x00d6] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.upload.C3922n m16099b(java.lang.String r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.CrashUploader.m16099b(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean, boolean):com.bytedance.crash.upload.n");
    }

    /* renamed from: a */
    private static C3922n m16086a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) {
        return m16099b(str, bArr, str2, str3, str4, z, z2);
    }
}
