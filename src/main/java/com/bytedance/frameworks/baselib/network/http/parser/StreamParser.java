package com.bytedance.frameworks.baselib.network.http.parser;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.AbstractC13986c;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.util.DownloadFileTooLargeException;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.mime.C20649c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

public class StreamParser {
    private static final String TAG = "StreamParser";
    private static volatile int sReadBodyBuffFirstIncreaseSize;
    private static volatile int sReadBodyBuffInitSize;

    private static boolean isBuffSizeValid(int i) {
        return i >= 4096 && i <= 5242880;
    }

    public static void safeClose(Closeable closeable) {
        safeClose(closeable, null);
    }

    public static void onSaveConfigToSP(SharedPreferences.Editor editor) {
        editor.putInt("read_response_buff_init_size", sReadBodyBuffInitSize);
        editor.putInt("read_response_buff_increase_size", sReadBodyBuffFirstIncreaseSize);
    }

    public static void onConfigUpdate(SharedPreferences sharedPreferences) {
        sReadBodyBuffInitSize = sharedPreferences.getInt("read_response_buff_init_size", 0);
        sReadBodyBuffFirstIncreaseSize = sharedPreferences.getInt("read_response_buff_increase_size", 0);
    }

    public static void onServerConfigUpdate(JSONObject jSONObject) {
        sReadBodyBuffInitSize = jSONObject.optInt("read_response_buff_init_size", 0);
        sReadBodyBuffFirstIncreaseSize = jSONObject.optInt("read_response_buff_increase_size", 0);
    }

    public static boolean testIsSSBinary(String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("application/octet-stream");
        if (indexOf >= 0) {
            indexOf = str.indexOf("ssmix=", indexOf + 24);
        }
        if (indexOf > 0) {
            return true;
        }
        return false;
    }

    public static String bytesToString(byte[] bArr, String str) throws Exception {
        if (bArr == null) {
            return null;
        }
        String str2 = "UTF-8";
        String a = C20649c.m75080a(str, str2);
        if (a != null) {
            str2 = a;
        }
        return new String(bArr, str2);
    }

    public static String bytesToString(byte[] bArr, Map<String, String> map) throws Exception {
        if (bArr == null) {
            return null;
        }
        String str = map.get("Content-Type");
        if (TextUtils.isEmpty(str)) {
            str = map.get("Content-Type".toLowerCase());
        }
        return bytesToString(bArr, str);
    }

    public static void decodeSSBinary(byte[] bArr, int i) throws IOException {
        if (bArr != null && i > 0) {
            byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
            }
        }
    }

    private static void safeClose(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                if (Logger.debug() && str != null) {
                    String str2 = TAG;
                    Logger.m15167d(str2, str + " " + e);
                }
            }
        }
    }

    public static InputStream processInputStream(InputStream inputStream, Map<String, List<String>> map, boolean z, C20639k kVar) throws IOException {
        if (z) {
            return new GZIPInputStream(inputStream);
        }
        NetworkParams.AbstractC13976j streamProcessor = NetworkParams.getStreamProcessor();
        if (streamProcessor == null) {
            return inputStream;
        }
        return streamProcessor.mo51382a(inputStream, map, kVar);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x007f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] stream2ByteArray(int r5, java.io.InputStream r6, long r7, com.bytedance.frameworks.baselib.network.http.AbstractC13986c r9) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.parser.StreamParser.stream2ByteArray(int, java.io.InputStream, long, com.bytedance.frameworks.baselib.network.http.c):byte[]");
    }

    public static byte[] response2buf(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, int[] iArr, AbstractC13986c cVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] readResponse = readResponse(z, map, i, inputStream, iArr, null);
            if (readResponse == null || iArr[0] <= 0) {
                return null;
            }
            return readResponse;
        } catch (Exception e) {
            if (cVar != null) {
                cVar.mo51424b();
            }
        } catch (Throwable unused) {
        }
        throw e;
    }

    public static byte[] readResponse(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, int[] iArr, C20639k kVar) throws IOException {
        int i2;
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            inputStream = processInputStream(inputStream, map, z, kVar);
            int i3 = 32768;
            if (isBuffSizeValid(sReadBodyBuffInitSize)) {
                i3 = sReadBodyBuffInitSize;
            }
            int i4 = 102400;
            if (isBuffSizeValid(sReadBodyBuffFirstIncreaseSize)) {
                i4 = sReadBodyBuffFirstIncreaseSize;
            }
            byte[] bArr = new byte[i3];
            int i5 = 0;
            while (true) {
                try {
                    if (i5 + 4096 > bArr.length) {
                        if (bArr.length < i4) {
                            i2 = bArr.length + i4;
                        } else {
                            i2 = bArr.length * 2;
                        }
                        byte[] bArr2 = new byte[i2];
                        System.arraycopy(bArr, 0, bArr2, 0, i5);
                        bArr = bArr2;
                    }
                    int read = inputStream.read(bArr, i5, bArr.length - i5);
                    if (read <= 0) {
                        break;
                    }
                    i5 += read;
                    if (i5 > i) {
                        Logger.m15181w(TAG, "entity length did exceed given maxLength");
                        throw new DownloadFileTooLargeException(i, (long) i5);
                    }
                } catch (EOFException e) {
                    if (!z || i5 <= 0) {
                        throw e;
                    }
                    String str = TAG;
                    Logger.m15181w(str, "ungzip got exception " + e);
                } catch (IOException e2) {
                    String message = e2.getMessage();
                    if (!z || i5 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                        throw e2;
                    }
                    String str2 = TAG;
                    Logger.m15181w(str2, "ungzip got exception " + e2);
                } catch (OutOfMemoryError e3) {
                    String str3 = TAG;
                    Logger.m15170e(str3, "new buff error" + e3);
                    safeClose(inputStream);
                    return null;
                }
            }
            if (i5 > 0) {
                if (kVar != null) {
                    kVar.f50267M.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    kVar.f50267M.put("streamReadByteCount", Long.valueOf((long) i5));
                }
                iArr[0] = i5;
                return bArr;
            }
            safeClose(inputStream);
            return null;
        } finally {
            safeClose(inputStream);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x004f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [long] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ad, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b8, code lost:
        if (r12 <= 0) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r9.seek(0);
        r1 = new java.io.FileOutputStream(new java.io.File(r5, r33));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r2 = r9.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01cd, code lost:
        if (r2 == -1) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01cf, code lost:
        r1.write(r0, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d4, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d9, code lost:
        r2 = r0;
        r7 = r1;
        r1 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01de, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01df, code lost:
        r7 = r1;
        r1 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e4, code lost:
        r2 = r0;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ea, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r6.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f3, code lost:
        safeClose(null, r8);
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01fe, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ff, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0200, code lost:
        r1 = null;
        r7 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0204, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0205, code lost:
        r1 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0209, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x020a, code lost:
        r1 = null;
        r7 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x020e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x020f, code lost:
        r1 = null;
        r7 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        if (r29 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0 = r29.mo51423a();
        r29.mo51424b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        com.bytedance.common.utility.Logger.m15178v(com.bytedance.frameworks.baselib.network.http.parser.StreamParser.TAG, "download file canceled " + r0);
        r9.close();
        safeClose(r1, r8);
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        if (r6 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r6.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0111, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        com.bytedance.common.utility.Logger.m15167d(com.bytedance.frameworks.baselib.network.http.parser.StreamParser.TAG, "delete temp file exception " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        r7 = null;
        r6 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x024c */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ac A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:72:0x013d] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0249 A[SYNTHETIC, Splitter:B:171:0x0249] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x025a A[SYNTHETIC, Splitter:B:178:0x025a] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012d A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:50:0x00d4] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean stream2File(java.io.InputStream r26, long r27, com.bytedance.frameworks.baselib.network.http.AbstractC13986c r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.bytedance.frameworks.baselib.network.http.util.AbstractC14085c<java.lang.String> r34, java.lang.String r35, com.bytedance.frameworks.baselib.network.http.util.C14090h r36) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 629
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.parser.StreamParser.stream2File(java.io.InputStream, long, com.bytedance.frameworks.baselib.network.http.c, int, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.c, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.h):boolean");
    }
}
