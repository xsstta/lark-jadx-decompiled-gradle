package com.ss.android.socialbase.downloader.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.AbstractC60041s;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.impls.C60104l;
import com.ss.android.socialbase.downloader.model.C60122a;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.ttmd5.TTMd5;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.utils.d */
public class C60161d {

    /* renamed from: a */
    private static final String f150148a = "d";

    /* renamed from: b */
    private static final Pattern f150149b = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: c */
    private static String f150150c = null;

    /* renamed from: d */
    private static volatile SparseArray<Boolean> f150151d = new SparseArray<>();

    /* renamed from: e */
    private static volatile SparseArray<List<AbstractC60041s>> f150152e = new SparseArray<>();

    /* renamed from: f */
    private static final char[] f150153f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g */
    private static Pattern f150154g = null;

    /* renamed from: h */
    private static Pattern f150155h = null;

    /* renamed from: i */
    private static Boolean f150156i;

    /* renamed from: j */
    private static Boolean f150157j;

    /* renamed from: a */
    public static double m233741a(long j) {
        return ((double) j) / 1048576.0d;
    }

    /* renamed from: a */
    public static boolean m233769a(int i) {
        return i == 0 || i == 2;
    }

    /* renamed from: b */
    public static boolean m233792b(long j) {
        return j == -1;
    }

    /* renamed from: c */
    public static boolean m233803c(int i) {
        return i == 200 || i == 201 || i == 0;
    }

    /* renamed from: d */
    public static boolean m233811d(int i) {
        return i == 206 || i == 200;
    }

    /* renamed from: a */
    public static String m233751a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return m233752a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static String m233752a(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & 255;
            int i7 = i4 + 1;
            char[] cArr2 = f150153f;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }

    /* renamed from: a */
    public static List<DownloadChunk> m233754a(List<DownloadChunk> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.mo205011d()) {
                    sparseArray.put(downloadChunk.mo205027s(), downloadChunk);
                    List<DownloadChunk> list2 = (List) sparseArray2.get(downloadChunk.mo205027s());
                    if (list2 != null) {
                        for (DownloadChunk downloadChunk2 : list2) {
                            downloadChunk2.mo205001a(downloadChunk);
                        }
                        downloadChunk.mo205002a(list2);
                    }
                } else {
                    DownloadChunk downloadChunk3 = (DownloadChunk) sparseArray.get(downloadChunk.mo205004b());
                    if (downloadChunk3 != null) {
                        List<DownloadChunk> g = downloadChunk3.mo205015g();
                        if (g == null) {
                            g = new ArrayList<>();
                            downloadChunk3.mo205002a(g);
                        }
                        downloadChunk.mo205001a(downloadChunk3);
                        g.add(downloadChunk);
                    } else {
                        List list3 = (List) sparseArray2.get(downloadChunk.mo205004b());
                        if (list3 == null) {
                            list3 = new ArrayList();
                            sparseArray2.put(downloadChunk.mo205004b(), list3);
                        }
                        list3.add(downloadChunk);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    /* renamed from: a */
    public static void m233759a(DownloadInfo downloadInfo) {
        m233763a(downloadInfo, true);
    }

    /* renamed from: a */
    public static void m233763a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (z) {
                try {
                    m233801c(downloadInfo.getSavePath(), downloadInfo.getName());
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            m233801c(downloadInfo.getTempPath(), downloadInfo.getTempName());
            if (downloadInfo.isSavePathRedirected()) {
                m233789b(downloadInfo);
            }
        }
    }

    /* renamed from: a */
    public static boolean m233773a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m233776a(DownloadInfo downloadInfo, boolean z, String str) {
        if (!z && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            try {
                if (!new File(downloadInfo.getSavePath(), downloadInfo.getName()).exists() || !m233806c(downloadInfo.getSavePath(), downloadInfo.getName(), str)) {
                    return false;
                }
                return true;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m233796b(File file, String str) {
        return m233769a(TTMd5.m233890a(str, file));
    }

    /* renamed from: a */
    public static void m233761a(DownloadInfo downloadInfo, AbstractC60041s sVar) {
        BaseException baseException;
        boolean z;
        String str = f150148a;
        C59990a.m232838b(str, "saveFileAsTargetName targetName is " + downloadInfo.getTargetFilePath());
        try {
            File file = new File(downloadInfo.getTempPath(), downloadInfo.getTempName());
            File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            DownloadInfo downloadInfo2 = Downloader.getInstance(C60046b.m232945G()).getDownloadInfo(downloadInfo.getId());
            if (!file.exists()) {
                C59990a.m232838b(str, "tempFile not exist");
                if (file2.exists()) {
                    C59990a.m232838b(str, "targetFile exist");
                    if (m233796b(file2, downloadInfo.getMd5())) {
                        C59990a.m232838b(str, "tempFile not exist , targetFile exists and md5 check valid");
                        if (sVar != null) {
                            sVar.mo204528a();
                            return;
                        }
                        return;
                    } else if (downloadInfo2 != null && downloadInfo2.isSaveTempFile()) {
                        downloadInfo2.registerTempFileSaveCallback(sVar);
                        return;
                    }
                } else {
                    C59990a.m232838b(str, "targetFile not exist");
                    if (downloadInfo2 != null && downloadInfo2.isSaveTempFile()) {
                        downloadInfo2.registerTempFileSaveCallback(sVar);
                        return;
                    }
                }
            } else if (file2.exists()) {
                C59990a.m232838b(str, "targetFile exist");
                int a = m233742a(file2, downloadInfo.getMd5());
                if (m233769a(a)) {
                    C59990a.m232838b(str, "tempFile exist , targetFile exists and md5 check valid");
                    if (sVar != null) {
                        sVar.mo204528a();
                        return;
                    }
                    return;
                } else if (downloadInfo2 == null || !downloadInfo2.isSaveTempFile()) {
                    if (downloadInfo2 != null) {
                        downloadInfo2.setIsSaveTempFile(true);
                    }
                    Log.e(str, "saveFileAsTargetName: " + file2.getPath());
                    if (!file2.delete()) {
                        BaseException baseException2 = new BaseException(1037, "delete targetPath file existed with md5 check invalid status:" + m233784b(a));
                        if (sVar != null) {
                            sVar.mo204529a(baseException2);
                        }
                        if (downloadInfo2 != null) {
                            downloadInfo2.handleTempSaveCallback(false, baseException2);
                            return;
                        }
                        return;
                    }
                } else {
                    downloadInfo2.registerTempFileSaveCallback(sVar);
                    return;
                }
            }
            if (downloadInfo2 != null) {
                downloadInfo2.setIsSaveTempFile(true);
            }
            try {
                z = !m233795b(file, file2);
                baseException = null;
            } catch (BaseException e) {
                baseException = e;
                z = false;
            }
            if (z) {
                if (baseException == null) {
                    baseException = new BaseException(1038, String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s), temp file is exist: %d", downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName(), Boolean.valueOf(file.exists())));
                }
                if (sVar != null) {
                    sVar.mo204529a(baseException);
                }
                if (downloadInfo2 != null) {
                    downloadInfo2.handleTempSaveCallback(false, baseException);
                    return;
                }
                return;
            }
            int a2 = C60148a.m233720a(downloadInfo.getId()).mo205470a("download_finish_check_ttmd5", 2);
            if (a2 > 0) {
                int a3 = m233742a(file2, downloadInfo.getMd5());
                downloadInfo.setTTMd5CheckStatus(a3);
                if (a2 >= 2 && !m233769a(a3)) {
                    if (sVar != null) {
                        sVar.mo204529a(new BaseException(1034, m233784b(a3)));
                    }
                    m233759a(downloadInfo);
                    return;
                }
            }
            if (sVar != null) {
                sVar.mo204528a();
            }
            if (downloadInfo2 != null) {
                downloadInfo2.handleTempSaveCallback(true, null);
            }
        } catch (Throwable th) {
            C59990a.m232838b(f150148a, "saveFileAsTargetName throwable " + th.getMessage());
            if (sVar != null) {
                sVar.mo204529a(new BaseException(1038, m233788b(th, "saveFileAsTargetName")));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        r5 = new java.io.File(r17.getTempPath(), r17.getTempName());
        r6 = new java.io.File(r17.getSavePath(), r17.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        if (r6.exists() == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232838b(r3, "targetFile exist");
        r7 = m233742a(r6, r17.getMd5());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bd, code lost:
        if (m233769a(r7) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232838b(r3, "tempFile not exist , targetFile exists and md5 check valid");
        r17.setTTMd5CheckStatus(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        if (r19 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        r19.mo204528a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        m233757a(r17.getId(), true, (com.ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d9, code lost:
        if (r5.exists() != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        r3 = new com.ss.android.socialbase.downloader.exception.BaseException(1005, java.lang.String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s", r17.getTempPath(), r17.getTempName(), r17.getSavePath(), r17.getName(), m233784b(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0107, code lost:
        if (r19 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0109, code lost:
        r19.mo204529a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010c, code lost:
        m233757a(r17.getId(), false, r3);
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0115, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011a, code lost:
        if (r6.delete() != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        if (r3 != false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011e, code lost:
        if (r18 == null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0120, code lost:
        com.ss.android.socialbase.downloader.p3026c.C59992a.m232850a(r18, r17, new com.ss.android.socialbase.downloader.exception.BaseException(1038, "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"), r17.getStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012f, code lost:
        r0 = new com.ss.android.socialbase.downloader.exception.BaseException(1037, "delete targetPath file existed with md5 check invalid status:" + m233784b(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014b, code lost:
        if (r19 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014d, code lost:
        r19.mo204529a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0150, code lost:
        m233757a(r17.getId(), false, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015c, code lost:
        if (r5.exists() != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015e, code lost:
        r0 = new com.ss.android.socialbase.downloader.exception.BaseException(1005, java.lang.String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist", r17.getTempPath(), r17.getTempName(), r17.getSavePath(), r17.getName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0183, code lost:
        if (r19 == null) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0185, code lost:
        r19.mo204529a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0188, code lost:
        m233757a(r17.getId(), false, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0191, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0192, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0198, code lost:
        r0 = !m233795b(r5, r6);
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01aa, code lost:
        if (com.ss.android.socialbase.downloader.setting.C60148a.m233720a(r17.getId()).mo205473a("fix_file_rename_failed") != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ac, code lost:
        r3 = r0;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01af, code lost:
        r3 = r0;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b1, code lost:
        if (r0 == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b3, code lost:
        if (r3 != null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b5, code lost:
        r3 = new com.ss.android.socialbase.downloader.exception.BaseException(1038, java.lang.String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)", r17.getTempPath(), r17.getTempName(), r17.getSavePath(), r17.getName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01da, code lost:
        if (r19 == null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01dc, code lost:
        r19.mo204529a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01df, code lost:
        m233757a(r17.getId(), false, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e8, code lost:
        r0 = com.ss.android.socialbase.downloader.setting.C60148a.m233720a(r17.getId()).mo205470a("download_finish_check_ttmd5", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f6, code lost:
        if (r0 <= 0) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f8, code lost:
        r3 = m233742a(r6, r17.getMd5());
        r17.setTTMd5CheckStatus(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0203, code lost:
        if (r0 < 2) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0209, code lost:
        if (m233769a(r3) != false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020b, code lost:
        r0 = new com.ss.android.socialbase.downloader.exception.BaseException(1034, m233784b(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0216, code lost:
        if (r19 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0218, code lost:
        r19.mo204529a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021b, code lost:
        m233757a(r17.getId(), false, r0);
        m233759a(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0225, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0226, code lost:
        if (r19 == null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0228, code lost:
        r19.mo204528a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022b, code lost:
        m233757a(r17.getId(), true, (com.ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m233760a(com.ss.android.socialbase.downloader.model.DownloadInfo r17, com.ss.android.socialbase.downloader.depend.AbstractC60035m r18, com.ss.android.socialbase.downloader.depend.AbstractC60041s r19) {
        /*
        // Method dump skipped, instructions count: 611
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.utils.C60161d.m233760a(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.depend.m, com.ss.android.socialbase.downloader.depend.s):void");
    }

    /* renamed from: a */
    private static void m233757a(int i, boolean z, BaseException baseException) {
        synchronized (f150151d) {
            List<AbstractC60041s> list = f150152e.get(i);
            if (list != null) {
                for (AbstractC60041s sVar : list) {
                    if (sVar != null) {
                        if (z) {
                            sVar.mo204528a();
                        } else {
                            sVar.mo204529a(baseException);
                        }
                    }
                }
            }
            String str = f150148a;
            C59990a.m232838b(str, "handleTempSaveCallback id:" + i);
            f150151d.remove(i);
        }
    }

    /* renamed from: a */
    public static void m233762a(DownloadInfo downloadInfo, String str) throws BaseException {
        if (downloadInfo != null && !TextUtils.isEmpty(str) && !str.equals(downloadInfo.getName())) {
            File file = new File(downloadInfo.getSavePath(), str);
            File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            String str2 = f150148a;
            Log.e(str2, "copyFileFromExistFileWithSameName: existFile:" + file.getPath() + " targetFile:" + file2.getPath());
            if (file2.exists() && !file2.delete()) {
                throw new BaseException(1037, "targetPath file exists but can't delete");
            } else if (!m233777a(file, file2)) {
                throw new BaseException((int) CommonCode.StatusCode.API_CLIENT_EXPIRED, String.format("Can't copy the exist file(%s/%s) to the target file(%s/%s)", downloadInfo.getSavePath(), str, downloadInfo.getSavePath(), downloadInfo.getName()));
            }
        }
    }

    /* renamed from: a */
    public static boolean m233777a(File file, File file2) throws BaseException {
        return m233778a(file, file2, true);
    }

    /* renamed from: a */
    public static boolean m233778a(File file, File file2, boolean z) throws BaseException {
        if (!(file == null || file2 == null)) {
            try {
                if (file.exists() && !file.isDirectory()) {
                    if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                        File parentFile = file2.getParentFile();
                        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
                            String str = f150148a;
                            Log.e(str, "copyFile: srcFile:" + file.getPath() + " destFile:" + file2.getPath());
                            if (!file2.exists() || file2.canWrite() || file2.delete()) {
                                m233790b(file, file2, z);
                                return true;
                            }
                            throw new IOException("Destination '" + file2 + "' exists but is read-only and delete failed");
                        }
                        throw new BaseException(1053, "Destination '" + parentFile + "' directory cannot be created");
                    }
                }
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                m233765a(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c1, code lost:
        if (r11 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00db, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e1, code lost:
        if (r9 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e8, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f7, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fb, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m233790b(java.io.File r18, java.io.File r19, boolean r20) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.utils.C60161d.m233790b(java.io.File, java.io.File, boolean):void");
    }

    /* renamed from: b */
    public static boolean m233795b(File file, File file2) throws BaseException {
        String str = f150148a;
        Log.e(str, "moveFile1: src:" + file.getPath() + " dest:" + file2.getPath());
        boolean renameTo = file.renameTo(file2);
        if (!renameTo) {
            renameTo = m233777a(file, file2);
            try {
                Log.e(str, "moveFile2: src:" + file.getPath() + " dest:" + file2.getPath());
                file.delete();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return renameTo;
    }

    /* renamed from: a */
    public static boolean m233770a(int i, String str) {
        if (C60158a.m233738a(16777216)) {
            return i == 206 || i == 1;
        }
        if (i >= 400) {
            return false;
        }
        if (i == 206 || i == 1 || "bytes".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<HttpHeader> m233756a(List<HttpHeader> list, String str, DownloadChunk downloadChunk) {
        return m233755a(list, str, downloadChunk.mo205021m(), downloadChunk.mo205024p());
    }

    /* renamed from: a */
    public static List<HttpHeader> m233755a(List<HttpHeader> list, String str, long j, long j2) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        String str3 = f150148a;
        C59990a.m232838b(str3, "range CurrentOffset:" + j + " EndOffset:" + j2);
        if (j2 == 0) {
            str2 = String.format("bytes=%s-", String.valueOf(j));
        } else {
            str2 = String.format("bytes=%s-%s", String.valueOf(j), String.valueOf(j2));
        }
        arrayList.add(new HttpHeader("Range", str2));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m233771a(int i, String str, String str2) {
        return i == -3 && !m233812d(str, str2);
    }

    /* renamed from: a */
    public static boolean m233772a(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            if (1 == activeNetworkInfo.getType()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m233793b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m233768a() {
        Boolean bool = f150156i;
        if (bool != null) {
            return bool.booleanValue();
        }
        String c = m233800c(C60046b.m232945G());
        boolean z = false;
        if (c == null || !c.contains(":")) {
            if (c != null && c.equals(C60046b.m232945G().getPackageName())) {
                z = true;
            }
            f150156i = Boolean.valueOf(z);
        } else {
            f150156i = false;
        }
        return f150156i.booleanValue();
    }

    /* renamed from: b */
    public static boolean m233791b() {
        return !m233802c() && C60046b.m232988c() && C60104l.m233401a(true).mo204818g();
    }

    /* renamed from: a */
    public static boolean m233779a(Throwable th) {
        if (th == null) {
            return false;
        }
        String i = m233824i(th);
        if (!(th instanceof SocketTimeoutException)) {
            if (TextUtils.isEmpty(i)) {
                return false;
            }
            if (i.contains("time out") || i.contains("Time-out")) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m233797b(Throwable th) {
        DownloadHttpException downloadHttpException;
        if (th == null) {
            return false;
        }
        String i = m233824i(th);
        if ((th instanceof DownloadHttpException) && (((downloadHttpException = (DownloadHttpException) th) != null && downloadHttpException.getHttpStatusCode() == 403) || (!TextUtils.isEmpty(i) && i.contains("403")))) {
            return true;
        }
        if (TextUtils.isEmpty(i) || !i.contains("Forbidden")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m233807c(Throwable th) {
        if (th == null) {
            return false;
        }
        String i = m233824i(th);
        if (TextUtils.isEmpty(i) || !i.contains("network not available")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m233774a(BaseException baseException) {
        return baseException != null && baseException.getErrorCode() == 1051;
    }

    /* renamed from: b */
    public static boolean m233794b(BaseException baseException) {
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m233765a(Throwable th, String str) throws BaseException {
        String str2 = !TextUtils.isEmpty(str) ? str : "";
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            baseException.setErrorMsg(str2 + "-" + baseException.getErrorMessage());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, m233788b(th, str2));
        } else if (m233779a(th)) {
            throw new BaseException(1048, m233788b(th, str2));
        } else if (m233818e(th)) {
            throw new DownloadHttpException(1004, TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC, m233788b(th, str2));
        } else if (m233820f(th)) {
            throw new DownloadHttpException(1004, 416, m233788b(th, str2));
        } else if (m233797b(th)) {
            throw new BaseException(1047, m233788b(th, str2));
        } else if (m233807c(th)) {
            throw new BaseException(1049, m233788b(th, str2));
        } else if (m233813d(th)) {
            throw new BaseException(1041, m233788b(th, str2));
        } else if (th instanceof IOException) {
            m233764a((IOException) th, str);
        } else {
            throw new BaseException(1000, m233788b(th, str2));
        }
    }

    /* renamed from: a */
    public static void m233764a(IOException iOException, String str) throws BaseException {
        if (str == null) {
            str = "";
        }
        String b = m233788b(iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException(1041, b);
        } else if (iOException instanceof UnknownHostException) {
            throw new BaseException(1055, b);
        } else if (iOException instanceof NoRouteToHostException) {
            throw new BaseException(1056, b);
        } else if (iOException instanceof UnknownServiceException) {
            throw new BaseException(1057, b);
        } else if (iOException instanceof PortUnreachableException) {
            throw new BaseException(1058, b);
        } else if (iOException instanceof SocketTimeoutException) {
            throw new BaseException(1048, b);
        } else if (iOException instanceof SocketException) {
            throw new BaseException(1059, b);
        } else if (iOException instanceof HttpRetryException) {
            throw new BaseException(1060, b);
        } else if (iOException instanceof ProtocolException) {
            throw new BaseException(1061, b);
        } else if (iOException instanceof MalformedURLException) {
            throw new BaseException(1062, b);
        } else if (iOException instanceof FileNotFoundException) {
            throw new BaseException(1063, b);
        } else if (iOException instanceof InterruptedIOException) {
            throw new BaseException(1064, b);
        } else if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException(1065, b);
        } else if (iOException instanceof EOFException) {
            throw new BaseException(1066, b);
        } else if (iOException instanceof StreamResetException) {
            throw new BaseException(1067, b);
        } else if (iOException instanceof SSLException) {
            throw new BaseException(1011, b);
        } else if (m233822g(iOException)) {
            throw new BaseException(1006, b);
        } else {
            throw new BaseException((int) IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, b);
        }
    }

    /* renamed from: a */
    public static boolean m233775a(BaseException baseException, DownloadInfo downloadInfo) {
        if (baseException == null) {
            return false;
        }
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1000 || errorCode == 1032 || errorCode == 1033 || errorCode == 1034 || errorCode == 1008 || errorCode == 1026 || errorCode == 1027 || errorCode == 1044 || errorCode == 1020) {
            return true;
        }
        if (errorCode == 1049 || errorCode == 1055 || errorCode == 1006 || downloadInfo == null || downloadInfo.getCurBytes() >= 8388608) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <K> HashMap<Integer, K> m233753a(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static <K> void m233758a(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (!(map == null || sparseArray == null)) {
            for (Integer num : map.keySet()) {
                if (num != null) {
                    sparseArray.put(num.intValue(), map.get(num));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m233780a(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    /* renamed from: a */
    public static void m233767a(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m233766a(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
        if (throttleNetSpeed > 0) {
            list.add(new HttpHeader("extra_throttle_net_speed", String.valueOf(throttleNetSpeed)));
        }
    }

    /* renamed from: d */
    public static boolean m233810d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static String m233816e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                if (C59990a.m232836a()) {
                    C59990a.m232838b("Process", "get processName = " + sb.toString());
                }
                String sb2 = sb.toString();
                m233767a(bufferedReader);
                return sb2;
            } catch (Throwable unused) {
                m233767a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            m233767a(bufferedReader);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m233802c() {
        Boolean bool = f150157j;
        if (bool != null) {
            return bool.booleanValue();
        }
        String c = m233800c(C60046b.m232945G());
        if (c != null) {
            if (c.equals(C60046b.m232945G().getPackageName() + ":downloader")) {
                f150157j = true;
                return f150157j.booleanValue();
            }
        }
        f150157j = false;
        return f150157j.booleanValue();
    }

    /* renamed from: b */
    public static long m233783b(List<DownloadChunk> list) {
        long j = 0;
        for (DownloadChunk downloadChunk : list) {
            j += downloadChunk.mo205023o();
        }
        return j;
    }

    /* renamed from: c */
    public static boolean m233804c(DownloadInfo downloadInfo) {
        return m233776a(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5());
    }

    /* renamed from: e */
    public static ListenerType m233815e(int i) {
        ListenerType listenerType = ListenerType.MAIN;
        if (i == ListenerType.SUB.ordinal()) {
            return ListenerType.SUB;
        }
        if (i == ListenerType.NOTIFICATION.ordinal()) {
            return ListenerType.NOTIFICATION;
        }
        return listenerType;
    }

    /* renamed from: f */
    public static boolean m233820f(Throwable th) {
        if (th == null) {
            return false;
        }
        String i = m233824i(th);
        if (TextUtils.isEmpty(i) || !i.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static String m233824i(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "throwable getMsg error";
        }
    }

    /* renamed from: a */
    public static long m233743a(AbstractC60135e eVar) {
        if (eVar == null) {
            return -1;
        }
        String b = m233785b(eVar, "Content-Length");
        if (TextUtils.isEmpty(b) && C60158a.m233738a(1)) {
            return m233782b(eVar);
        }
        try {
            return Long.parseLong(b);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static long m233798c(String str) throws BaseException {
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            throw new BaseException(1050, e);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    /* renamed from: d */
    public static long m233808d(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return -1;
        }
        List<DownloadChunk> downloadChunk = C60046b.m233010t().getDownloadChunk(downloadInfo.getId());
        if (downloadInfo.getChunkCount() == 1) {
            return downloadInfo.getCurBytes();
        }
        if (downloadChunk == null || downloadChunk.size() <= 1) {
            return 0;
        }
        long c = m233799c(downloadChunk);
        if (c >= 0) {
            return c;
        }
        return 0;
    }

    /* renamed from: e */
    public static long m233814e(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        List<DownloadChunk> downloadChunk = C60046b.m233010t().getDownloadChunk(downloadInfo.getId());
        int chunkCount = downloadInfo.getChunkCount();
        boolean z = true;
        if (chunkCount <= 1) {
            z = false;
        }
        if (!downloadInfo.isBreakpointAvailable()) {
            return 0;
        }
        if (!z) {
            return downloadInfo.getCurBytes();
        }
        if (downloadChunk == null || chunkCount != downloadChunk.size()) {
            return 0;
        }
        return m233783b(downloadChunk);
    }

    /* renamed from: f */
    private static String m233819f(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (f150154g == null) {
                f150154g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            Matcher matcher = f150154g.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            if (f150155h == null) {
                f150155h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
            }
            Matcher matcher2 = f150155h.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static boolean m233821g(String str) {
        String str2 = f150148a;
        Log.w(str2, "deleteDirIfEmpty on thread: " + Thread.currentThread());
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.isDirectory()) {
                if (file.delete()) {
                    return true;
                }
                Log.w(str2, "deleteDirIfEmpty return false");
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static long m233744a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                String str2 = f150148a;
                C59990a.m232840d(str2, "parse instance length failed with " + str);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static long m233782b(AbstractC60135e eVar) {
        if (eVar == null) {
            return -1;
        }
        String b = m233785b(eVar, "Content-Range");
        if (TextUtils.isEmpty(b)) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(b);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e) {
            String str = f150148a;
            C59990a.m232840d(str, "parse content-length from content-range failed " + e);
        }
        return -1;
    }

    /* renamed from: c */
    private static long m233799c(List<DownloadChunk> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        long j = -1;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null && ((downloadChunk.mo205022n() <= downloadChunk.mo205024p() || downloadChunk.mo205024p() == 0) && (j == -1 || j > downloadChunk.mo205022n()))) {
                j = downloadChunk.mo205022n();
            }
        }
        return j;
    }

    /* renamed from: d */
    public static String m233809d(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m233751a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m233822g(Throwable th) {
        boolean z;
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            String message = baseException.getMessage();
            if (TextUtils.isEmpty(message) || !message.contains("ENOSPC")) {
                return false;
            }
            return true;
        } else if (!(th instanceof IOException)) {
            return false;
        } else {
            String i = m233824i(th);
            if (TextUtils.isEmpty(i) || !i.contains("ENOSPC")) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m233823h(Throwable th) {
        if (!(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m233784b(int i) {
        String str = "ttmd5 check code = " + i + ", ";
        if (i != 99) {
            switch (i) {
                case 0:
                    return str + "md5 match";
                case 1:
                    return str + "md5 not match";
                case 2:
                    return str + "md5 empty";
                case 3:
                    return str + "ttmd5 version not support";
                case 4:
                    return str + "ttmd5 tag parser error";
                case 5:
                    return str + "file not exist";
                case 6:
                    return str + "get file md5 error";
                default:
                    return str;
            }
        } else {
            return str + "unknown error";
        }
    }

    /* renamed from: c */
    public static String m233800c(Context context) {
        String str = f150150c;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (C59990a.m232836a()) {
                            C59990a.m232838b("Process", "processName = " + runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        f150150c = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String e2 = m233816e();
        f150150c = e2;
        return e2;
    }

    /* renamed from: e */
    public static String m233817e(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m233786b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format("%s.temp", str);
    }

    /* renamed from: d */
    public static boolean m233813d(Throwable th) {
        if (th == null) {
            return false;
        }
        String i = m233824i(th);
        if (TextUtils.isEmpty(i) || !i.contains("Exception in connect")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m233818e(Throwable th) {
        if (th == null) {
            return false;
        }
        String i = m233824i(th);
        if (TextUtils.isEmpty(i) || !i.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m233805c(AbstractC60135e eVar) {
        if (eVar == null) {
            return false;
        }
        if (C60158a.m233738a(8)) {
            if ("chunked".equals(eVar.mo204946a("Transfer-Encoding")) || m233743a(eVar) == -1) {
                return true;
            }
            return false;
        } else if (m233743a(eVar) == -1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static void m233789b(DownloadInfo downloadInfo) {
        C60148a a;
        JSONObject d;
        if (downloadInfo != null && (d = (a = C60148a.m233720a(downloadInfo.getId())).mo205477d("anti_hijack_dir")) != null) {
            String optString = d.optString("ins_desc");
            if (!TextUtils.isEmpty(optString)) {
                m233801c(downloadInfo.getSavePath(), optString);
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = downloadInfo.getName();
            }
            String a2 = m233748a(title, a);
            String savePath = downloadInfo.getSavePath();
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(savePath)) {
                File file = new File(a2);
                File file2 = new File(savePath);
                while (file != null && file2 != null && file2.isDirectory() && TextUtils.equals(file.getName(), file2.getName())) {
                    m233821g(file2.getPath());
                    file = file.getParentFile();
                    file2 = file2.getParentFile();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m233742a(File file, String str) {
        return TTMd5.m233890a(str, file);
    }

    /* renamed from: a */
    public static String m233746a(AbstractC60135e eVar, String str) {
        String f = m233819f(eVar.mo204946a("Content-Disposition"));
        if (TextUtils.isEmpty(f)) {
            return m233809d(str);
        }
        return f;
    }

    /* renamed from: b */
    public static String m233785b(AbstractC60135e eVar, String str) {
        if (eVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String a = eVar.mo204946a(str);
        if (!C60148a.m233727c().mo205475b("fix_get_http_resp_head_ignore_case", true)) {
            return a;
        }
        if (TextUtils.isEmpty(a)) {
            a = eVar.mo204946a(str.toLowerCase());
        }
        if (TextUtils.isEmpty(a)) {
            return eVar.mo204946a(str.toUpperCase());
        }
        return a;
    }

    /* renamed from: d */
    public static boolean m233812d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    /* renamed from: a */
    public static String m233747a(String str, int i) {
        if (i == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str) || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    /* renamed from: c */
    public static void m233801c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str, str2);
            if (file.exists()) {
                String str3 = f150148a;
                Log.e(str3, "deleteFile: " + str + "/" + str2);
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static String m233748a(String str, C60148a aVar) {
        JSONObject d;
        String format;
        if (aVar == null || (d = aVar.mo205477d("anti_hijack_dir")) == null) {
            return "";
        }
        String optString = d.optString("dir_name");
        if (!TextUtils.isEmpty(optString) && optString.startsWith("/")) {
            optString = optString.substring(1);
        }
        if (TextUtils.isEmpty(optString)) {
            return optString;
        }
        if (!optString.contains("%s")) {
            format = optString + str;
        } else {
            try {
                format = String.format(optString, str);
            } catch (Throwable unused) {
            }
        }
        optString = format;
        if (optString.length() > 255) {
            return optString.substring(optString.length() - 255);
        }
        return optString;
    }

    /* renamed from: b */
    public static String m233787b(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return !TextUtils.isEmpty(str2) ? str2 : str;
        }
        return null;
    }

    /* renamed from: a */
    public static String m233749a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return String.format("%s%s%s", str, File.separator, str2);
    }

    /* renamed from: b */
    public static String m233788b(Throwable th, String str) {
        if (str == null) {
            return m233824i(th);
        }
        return str + "-" + m233824i(th);
    }

    /* renamed from: b */
    public static int m233781b(String str, String str2, String str3) {
        return TTMd5.m233890a(str3, new File(str, str2));
    }

    /* renamed from: a */
    public static C60122a m233745a(String str, String str2, int i) throws BaseException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new BaseException(1021, new IOException("path must be not empty"));
        }
        File file = new File(str, str2);
        if (!file.exists() || !file.isDirectory()) {
            if (!file.exists()) {
                try {
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        if (file2.exists()) {
                            file2.delete();
                            throw new BaseException(1031, "download savePath is not directory");
                        } else if (!file2.mkdirs()) {
                            throw new BaseException(1030, "download savePath directory can not created");
                        }
                    }
                    file.createNewFile();
                } catch (IOException e) {
                    throw new BaseException(1036, e);
                }
            }
            return new C60122a(file, i);
        }
        throw new BaseException(1035, new IOException(String.format("path is :%s, path is directory:%B:", str, Boolean.valueOf(file.isDirectory()))));
    }

    /* renamed from: a */
    public static String m233750a(String str, String str2, String str3) {
        String str4;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            str4 = m233749a(str2, str3);
        } else {
            str4 = m233749a(str, str3);
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        return String.format("%s.temp", str4);
    }

    /* renamed from: c */
    public static boolean m233806c(String str, String str2, String str3) {
        return m233769a(m233781b(str, str2, str3));
    }
}
