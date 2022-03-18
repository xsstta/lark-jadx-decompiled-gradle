package com.bytedance.article.common.monitor.stack;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.core.p747a.C14092a;
import com.bytedance.frameworks.core.p747a.C14094b;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class HttpUtil {

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
    public static byte[] m14684a(InputStream inputStream) throws IOException {
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
    public static byte[] m14683a(long j, String str, byte[] bArr, CompressType compressType, String str2, boolean z) throws Throwable {
        String str3 = null;
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
                str3 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                return null;
            }
        } else if (CompressType.DEFLATER == compressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        }
        byte[] bArr3 = bArr;
        if (!z) {
            return m14685a(str, bArr3, str2, str3, "POST", true, false);
        }
        byte[] a = C14094b.m57065a(bArr3, bArr3.length);
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
            bArr3 = a;
        }
        return m14685a(str, bArr3, str2, str3, "POST", true, true);
    }

    /* renamed from: a */
    public static byte[] m14685a(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th;
        URL url;
        byte[] bArr2;
        InputStream inputStream = null;
        try {
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
                } catch (Throwable th2) {
                    httpURLConnection = httpURLConnection2;
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th3;
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
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    String contentEncoding = httpURLConnection2.getContentEncoding();
                    if (TextUtils.isEmpty(contentEncoding) || !contentEncoding.equalsIgnoreCase("gzip")) {
                        bArr2 = m14684a(inputStream2);
                    } else {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream2);
                        bArr2 = m14684a(gZIPInputStream);
                        gZIPInputStream.close();
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused4) {
                        }
                    }
                    return bArr2;
                }
                throw new HttpResponseException(responseCode, httpURLConnection2.getResponseMessage());
            }
            throw new IllegalArgumentException("request method is not null");
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            throw th;
        }
    }
}
