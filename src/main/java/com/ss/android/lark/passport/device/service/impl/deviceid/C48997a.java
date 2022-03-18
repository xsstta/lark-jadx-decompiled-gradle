package com.ss.android.lark.passport.device.service.impl.deviceid;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.huawei.hms.adapter.internal.CommonCode;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.io.File;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.passport.device.service.impl.deviceid.a */
public class C48997a {

    /* renamed from: a */
    private static final PassportLog f123025a = PassportLog.f123351c.mo171474a();

    /* renamed from: a */
    private static String m192950a(int i) {
        return i != 120 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "mdpi" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "ldpi";
    }

    /* renamed from: a */
    private static void m192955a(Context context, JSONObject jSONObject) throws JSONException {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.densityDpi;
        jSONObject.put("density_dpi", i);
        jSONObject.put("display_density", m192950a(i));
        jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
    }

    /* renamed from: a */
    private static boolean m192957a(String str) {
        int length;
        if (str == null || (length = str.length()) < 13 || length > 128) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m192958b() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* renamed from: c */
    private static String m192959c() {
        String bigInteger = new BigInteger(64, new SecureRandom()).toString(16);
        if (bigInteger.charAt(0) == '-') {
            bigInteger = bigInteger.substring(1);
        }
        int length = 13 - bigInteger.length();
        if (length <= 0) {
            return bigInteger;
        }
        StringBuilder sb = new StringBuilder();
        while (length > 0) {
            sb.append('F');
            length--;
        }
        sb.append(bigInteger);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m192949a() {
        StringBuilder sb = new StringBuilder();
        try {
            if (RomUtils.m94944c()) {
                sb.append("MIUI-");
            } else if (RomUtils.m94952g()) {
                sb.append("FLYME-");
            } else {
                String k = RomUtils.m94956k();
                if (RomUtils.m94935a(k)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(k)) {
                    sb.append(k);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable th) {
            f123025a.mo171462a("DeviceUtils", "get rom exception", th);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m192953a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appkey", "lark");
            String a = m192952a(context, true);
            if (a != null) {
                jSONObject.put("openudid", a);
            }
            jSONObject.put("package", context.getPackageName());
            jSONObject.put("display_name", "lark");
            jSONObject.put("app_version", C26246a.m94977a(context));
            jSONObject.put("timezone", m192958b());
            String e = NetworkUtils.m153072e(context);
            if (e != null) {
                jSONObject.put("access", e);
            }
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            m192955a(context, jSONObject);
            jSONObject.put("rom", m192949a());
        } catch (JSONException e2) {
            f123025a.mo171462a("DeviceUtils", "Error when set JSON object:", e2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m192956a(FileLock fileLock, RandomAccessFile randomAccessFile) {
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception unused) {
            }
        }
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private static String m192951a(Context context, String str) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        FileLock fileLock;
        Exception e;
        byte[] bArr;
        int read;
        FileLock fileLock2 = null;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return null;
        }
        String b = C26308n.m95256b(context);
        String str2 = b + "/" + str;
        try {
            File file = new File(b);
            if (file.exists() || file.mkdirs()) {
                File file2 = new File(str2);
                randomAccessFile = new RandomAccessFile(file2, "rwd");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    try {
                        if (file2.isFile() && (read = randomAccessFile.read((bArr = new byte[129]), 0, 129)) > 0 && read < 129) {
                            String str3 = new String(bArr, 0, read, "UTF-8");
                            if (m192957a(str3)) {
                                m192956a(fileLock, randomAccessFile);
                                return str3;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            f123025a.mo171471d("DeviceUtils", "read openudid exception " + e);
                            m192956a(fileLock, randomAccessFile);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock2 = fileLock;
                            m192956a(fileLock2, randomAccessFile);
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileLock = null;
                    f123025a.mo171471d("DeviceUtils", "read openudid exception " + e);
                    m192956a(fileLock, randomAccessFile);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    m192956a(fileLock2, randomAccessFile);
                    throw th;
                }
                m192956a(fileLock, randomAccessFile);
                return null;
            }
            m192956a((FileLock) null, (RandomAccessFile) null);
            return null;
        } catch (Exception e4) {
            e = e4;
            randomAccessFile = null;
            fileLock = null;
            f123025a.mo171471d("DeviceUtils", "read openudid exception " + e);
            m192956a(fileLock, randomAccessFile);
            return null;
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
            m192956a(fileLock2, randomAccessFile);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r2.length() >= 13) goto L_0x0097;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m192952a(android.content.Context r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.device.service.impl.deviceid.C48997a.m192952a(android.content.Context, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static void m192954a(Context context, String str, String str2) {
        RandomAccessFile randomAccessFile;
        Throwable th;
        Exception e;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            String b = C26308n.m95256b(context);
            String str3 = b + "/" + str;
            FileLock fileLock = null;
            try {
                File file = new File(b);
                if (file.exists() || file.mkdirs()) {
                    randomAccessFile = new RandomAccessFile(new File(str3), "rwd");
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        byte[] bytes = str2.getBytes("UTF-8");
                        randomAccessFile.setLength(0);
                        randomAccessFile.write(bytes);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    m192956a(fileLock, randomAccessFile);
                }
                m192956a((FileLock) null, (RandomAccessFile) null);
            } catch (Exception e3) {
                e = e3;
                randomAccessFile = null;
                try {
                    f123025a.mo171471d("DeviceUtils", "write openudid exception " + e);
                    m192956a(fileLock, randomAccessFile);
                } catch (Throwable th2) {
                    th = th2;
                    m192956a(fileLock, randomAccessFile);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                m192956a(fileLock, randomAccessFile);
                throw th;
            }
        }
    }
}
