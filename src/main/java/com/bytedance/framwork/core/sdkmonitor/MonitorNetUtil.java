package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.core.p747a.C14092a;
import com.bytedance.frameworks.core.p747a.C14094b;
import com.bytedance.services.apm.api.C20697b;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class MonitorNetUtil {

    /* renamed from: a */
    private static AbstractC14159a f37204a;

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil$a */
    public interface AbstractC14159a {
        /* renamed from: a */
        String mo51966a(String str, byte[] bArr);
    }

    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: a */
    public static byte[] m57250a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public static boolean m57253b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static int m57246a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 24) {
            return telephonyManager.getNetworkType();
        }
        try {
            C39400a.m155625a().mo143243a(LarkContext.getApplication());
            C39400a.m155625a().mo143245b(LarkContext.getApplication());
            if (C39400a.m155625a().mo143244b() != -1) {
                return C39400a.m155625a().mo143244b();
            }
            int networkType = telephonyManager.getNetworkType();
            C39400a.m155625a().mo143242a(networkType);
            Log.m165389i("TelephonyManagerLancetHook", "get network type from system");
            return networkType;
        } catch (Throwable th) {
            Log.m165386e("TelephonyManagerLancetHook", th);
            return telephonyManager.getNetworkType();
        }
    }

    /* renamed from: a */
    public static NetworkType m57247a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (m57246a((TelephonyManager) context.getSystemService("phone"))) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 4:
                        case 7:
                        case 11:
                        default:
                            return NetworkType.MOBILE;
                        case 13:
                            return NetworkType.MOBILE_4G;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }

    /* renamed from: a */
    public static byte[] m57252a(byte[] bArr, Map<String, String> map) throws IOException {
        if (bArr.length <= 128) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            map.put("Content-Encoding", "gzip");
            return byteArray;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
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
    public static byte[] m57251a(String str, String str2, boolean z) throws Throwable {
        if (TextUtils.isDigitsOnly(str)) {
            return null;
        }
        return m57249a(str, null, str2, null, "GET", false, z).mo69901b();
    }

    /* renamed from: a */
    public static C20697b m57248a(String str, byte[] bArr, CompressType compressType, String str2, boolean z) throws Throwable {
        String str3;
        byte[] bArr2;
        String str4;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (CompressType.GZIP == compressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str5 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                return null;
            }
        } else if (CompressType.DEFLATER == compressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        if (!z) {
            return m57249a(str, bArr, str2, str5, "POST", true, false);
        }
        byte[] a = C14094b.m57065a(bArr, bArr.length);
        if (a != null) {
            str4 = str + "&tt_data=a";
            bArr2 = a;
            str3 = "application/octet-stream;tt-data=a";
        } else {
            str4 = str;
            str3 = str2;
            bArr2 = bArr;
        }
        return m57249a(str4, bArr2, str3, str5, "POST", true, true);
    }

    /* renamed from: a */
    public static C20697b m57249a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th;
        URL url;
        Throwable th2;
        byte[] bArr2;
        Throwable th3;
        DataOutputStream dataOutputStream;
        Throwable th4;
        GZIPInputStream gZIPInputStream = null;
        try {
            AbstractC14159a aVar = f37204a;
            if (aVar != null) {
                str = aVar.mo51966a(str, bArr);
            }
            LinkedList<Pair> linkedList = new LinkedList();
            if (z2) {
                url = new URL(C14092a.m57057a(str, linkedList));
            } else {
                url = new URL(str);
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            if (z2) {
                try {
                    if (!linkedList.isEmpty()) {
                        for (Pair pair : linkedList) {
                            if (pair != null) {
                                httpURLConnection2.setRequestProperty((String) pair.first, (String) pair.second);
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    httpURLConnection = httpURLConnection2;
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        C14174d.m57264a(gZIPInputStream);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused) {
                            }
                        }
                        throw th6;
                    }
                }
            }
            if (z) {
                httpURLConnection2.setDoOutput(true);
            } else {
                httpURLConnection2.setDoOutput(false);
            }
            if (str2 != null) {
                httpURLConnection2.setRequestProperty("Content-Type", str2);
            }
            if (str3 != null) {
                httpURLConnection2.setRequestProperty("Content-Encoding", str3);
            }
            httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
            httpURLConnection2.setRequestProperty("Version-Code", "1");
            if (str4 != null) {
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            C14174d.m57264a(dataOutputStream);
                        } catch (Throwable th7) {
                            th4 = th7;
                            C14174d.m57264a(dataOutputStream);
                            throw th4;
                        }
                    } catch (Throwable th8) {
                        th4 = th8;
                        dataOutputStream = null;
                        C14174d.m57264a(dataOutputStream);
                        throw th4;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    try {
                        String contentEncoding = httpURLConnection2.getContentEncoding();
                        if (TextUtils.isEmpty(contentEncoding) || !contentEncoding.equalsIgnoreCase("gzip")) {
                            bArr2 = m57250a(inputStream);
                        } else {
                            try {
                                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                                try {
                                    bArr2 = m57250a(gZIPInputStream2);
                                    C14174d.m57264a(gZIPInputStream2);
                                } catch (Throwable th9) {
                                    th3 = th9;
                                    gZIPInputStream = gZIPInputStream2;
                                    C14174d.m57264a(gZIPInputStream);
                                    throw th3;
                                }
                            } catch (Throwable th10) {
                                th3 = th10;
                                C14174d.m57264a(gZIPInputStream);
                                throw th3;
                            }
                        }
                        Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                        HashMap hashMap = new HashMap();
                        for (String str5 : headerFields.keySet()) {
                            List<String> list = headerFields.get(str5);
                            if (list != null && !C14176f.m57267a(list)) {
                                hashMap.put(str5, list.get(0));
                            }
                        }
                        C20697b bVar = new C20697b(responseCode, hashMap, bArr2);
                        C14174d.m57264a(inputStream);
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        return bVar;
                    } catch (Throwable th11) {
                        th2 = th11;
                        gZIPInputStream = inputStream;
                        httpURLConnection = httpURLConnection2;
                        th = th2;
                        throw th;
                    }
                } else {
                    throw new HttpResponseException(responseCode, httpURLConnection2.getResponseMessage());
                }
            } else {
                throw new IllegalArgumentException("request method is not null");
            }
        } catch (Throwable th12) {
            th = th12;
            httpURLConnection = null;
            throw th;
        }
    }
}
