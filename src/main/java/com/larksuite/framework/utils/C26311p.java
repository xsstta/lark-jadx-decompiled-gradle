package com.larksuite.framework.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: com.larksuite.framework.utils.p */
public class C26311p {

    /* renamed from: a */
    private static final String[] f64948a = {" Byte", " KB", " MB", " GB"};

    /* renamed from: b */
    private static final String[] f64949b = {"Byte", "KB", "MB", "GB"};

    /* renamed from: com.larksuite.framework.utils.p$a */
    public interface AbstractC26313a {
        /* renamed from: a */
        void mo93435a(String str, Uri uri);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.io.Closeable[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.io.Closeable[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: java.io.FileInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static byte[] m95276a(String str) {
        Throwable th;
        byte[] bArr;
        IOException iOException;
        byte[] bArr2;
        File file = new File(str);
        byte[] bArr3 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                bArr3 = new byte[((int) file.length())];
                fileInputStream.read(bArr3);
                fileInputStream.close();
                C26266d.m95082a(fileInputStream);
                return bArr3;
            } catch (IOException e) {
                bArr2 = bArr3;
                bArr3 = fileInputStream;
                iOException = e;
                try {
                    iOException.printStackTrace();
                    C26266d.m95082a(bArr3);
                    return bArr2;
                } catch (Throwable th2) {
                    bArr = bArr3;
                    th = th2;
                    C26266d.m95082a(bArr);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bArr = fileInputStream;
                C26266d.m95082a(bArr);
                throw th;
            }
        } catch (IOException e2) {
            iOException = e2;
            bArr2 = null;
            iOException.printStackTrace();
            C26266d.m95082a(bArr3);
            return bArr2;
        }
    }

    /* renamed from: a */
    public static boolean m95275a(Context context) {
        return Build.VERSION.SDK_INT < 26 || context.getPackageManager().canRequestPackageInstalls();
    }

    /* renamed from: a */
    public static void m95271a(File file, File file2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream2;
        if (file != null && file.exists() && file2 != null) {
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    fileOutputStream2 = new FileOutputStream(file2);
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        C26266d.m95082a(fileInputStream, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C26266d.m95082a(fileInputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    C26266d.m95082a(fileInputStream, fileOutputStream);
                    throw th;
                }
                try {
                    m95272a(fileInputStream2, fileOutputStream2);
                    C26266d.m95082a(fileInputStream2, fileOutputStream2);
                } catch (Exception e3) {
                    fileInputStream = fileInputStream2;
                    fileOutputStream = fileOutputStream2;
                    e = e3;
                    e.printStackTrace();
                    C26266d.m95082a(fileInputStream, fileOutputStream);
                } catch (Throwable th4) {
                    fileInputStream = fileInputStream2;
                    fileOutputStream = fileOutputStream2;
                    th = th4;
                    C26266d.m95082a(fileInputStream, fileOutputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
                e.printStackTrace();
                C26266d.m95082a(fileInputStream, fileOutputStream);
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                C26266d.m95082a(fileInputStream, fileOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m95274a(String str, String str2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        FileInputStream fileInputStream = null;
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        C26266d.m95082a(fileInputStream, fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C26266d.m95082a(fileInputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    C26266d.m95082a(fileInputStream, fileOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[1444];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream = fileInputStream2;
                } catch (IOException e3) {
                    e = e3;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    C26266d.m95082a(fileInputStream, fileOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = fileInputStream2;
                    C26266d.m95082a(fileInputStream, fileOutputStream);
                    throw th;
                }
            } else {
                fileOutputStream = null;
            }
            C26266d.m95082a(fileInputStream, fileOutputStream);
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
            e.printStackTrace();
            C26266d.m95082a(fileInputStream, fileOutputStream);
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            C26266d.m95082a(fileInputStream, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m95273a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    C26266d.m95082a(inputStream);
                    C26266d.m95082a(outputStream);
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            C26266d.m95082a(inputStream);
            C26266d.m95082a(outputStream);
        } catch (Throwable th) {
            C26266d.m95082a(inputStream);
            C26266d.m95082a(outputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m95272a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        FileChannel channel = fileInputStream.getChannel();
        channel.transferTo(0, channel.size(), fileOutputStream.getChannel());
    }

    /* renamed from: a */
    public static String m95262a(long j) {
        return m95263a(j, f64948a);
    }

    /* renamed from: b */
    public static String m95277b(long j) {
        return m95263a(j, f64949b);
    }

    /* renamed from: c */
    public static long m95281c(File file) {
        return file.length();
    }

    /* renamed from: b */
    public static String m95279b(File file) {
        return m95283c(file.getPath());
    }

    /* renamed from: e */
    public static String m95285e(String str) {
        return new File(str).getName();
    }

    /* renamed from: h */
    public static String m95288h(String str) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType == null) {
            return "";
        }
        return extensionFromMimeType;
    }

    /* renamed from: i */
    public static void m95289i(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: j */
    public static boolean m95290j(String str) {
        try {
            if (!new File(str).exists()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m95292l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("image/");
    }

    /* renamed from: a */
    public static String m95266a(File file) {
        return m95262a(m95281c(file));
    }

    /* renamed from: b */
    public static String m95280b(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension == null) {
            return "*/*";
        }
        return mimeTypeFromExtension;
    }

    /* renamed from: c */
    public static String m95283c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "*/*";
        }
        String b = m95280b(m95284d(str));
        if (TextUtils.isEmpty(b)) {
            return "*/*";
        }
        return b;
    }

    /* renamed from: d */
    public static String m95284d(String str) {
        if (str.lastIndexOf(".") > 0) {
            return str.substring(str.lastIndexOf(".") + 1, str.length()).toLowerCase();
        }
        return "";
    }

    /* renamed from: f */
    public static String m95286f(String str) {
        if (str.lastIndexOf(".") > 0) {
            return str.substring(0, str.lastIndexOf("."));
        }
        return str;
    }

    /* renamed from: g */
    public static String m95287g(String str) {
        if (str.lastIndexOf(".") > 0) {
            return str.substring(str.lastIndexOf("."), str.length());
        }
        return "";
    }

    /* renamed from: k */
    public static boolean m95291k(String str) {
        try {
            return new File(str).delete();
        } catch (Exception e) {
            Log.m165383e("FileUtils", e.getMessage());
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m95293m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (URLUtil.isNetworkUrl(str) || m95294n(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m95294n(String str) {
        if (URLUtil.isNetworkUrl(str)) {
            return false;
        }
        if (str == null || str.startsWith(File.separator)) {
            return true;
        }
        try {
            return "file".equals(new URL(str).getProtocol());
        } catch (MalformedURLException unused) {
            Log.m165397w("FileUtils", "donot know url is local or not, path: " + str);
            return false;
        }
    }

    /* renamed from: a */
    public static String m95264a(Context context, Uri uri) {
        return m95282c(context, uri);
    }

    /* renamed from: c */
    public static String m95282c(Context context, Uri uri) {
        File a = UriCompatUtil.m95039a(context, uri);
        if (a != null) {
            return a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: a */
    public static void m95267a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, i);
                return;
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static String m95263a(long j, String[] strArr) {
        if (j < 0) {
            j = 0;
        }
        if (j < 1024) {
            return String.valueOf(j) + strArr[0];
        }
        long j2 = j / 1024;
        if (j2 < 1024) {
            return String.valueOf(j2) + strArr[1];
        } else if (j2 < 1048576) {
            return String.format("%.2f%s", Double.valueOf(((double) j2) / 1024.0d), strArr[2]);
        } else {
            return String.format("%.2f%s", Double.valueOf(((double) (((j2 * 100) / 1024) / 1024)) / 100.0d), strArr[3]);
        }
    }

    /* renamed from: b */
    public static String m95278b(Context context, Uri uri) {
        Throwable th;
        Exception e;
        Cursor cursor;
        int columnIndex;
        Cursor cursor2 = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst() && (columnIndex = cursor.getColumnIndex("_display_name")) >= 0) {
                        String string = cursor.getString(columnIndex);
                        C26266d.m95081a(cursor);
                        return string;
                    }
                } catch (Exception e2) {
                    e = e2;
                    try {
                        Log.m165389i("FileUtils", String.format(Locale.getDefault(), "getFileNameFromContentUri: _display_name - [%s]", e.getMessage()));
                        C26266d.m95081a(cursor);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
            Log.m165389i("FileUtils", String.format(Locale.getDefault(), "getFileNameFromContentUri: _display_name - [%s]", e.getMessage()));
            C26266d.m95081a(cursor);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C26266d.m95081a(cursor2);
            throw th;
        }
        C26266d.m95081a(cursor);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003c A[SYNTHETIC, Splitter:B:27:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0049 A[SYNTHETIC, Splitter:B:35:0x0049] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m95265a(android.graphics.Bitmap r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0035, all -> 0x0033 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0031 }
            r3 = 100
            boolean r4 = r4.compress(r2, r3, r5)     // Catch:{ Exception -> 0x0031 }
            if (r4 == 0) goto L_0x0028
            r5.flush()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0031 }
            r5.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0027:
            return r4
        L_0x0028:
            r5.close()     // Catch:{ Exception -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0030:
            return r0
        L_0x0031:
            r4 = move-exception
            goto L_0x0037
        L_0x0033:
            r4 = move-exception
            goto L_0x0047
        L_0x0035:
            r4 = move-exception
            r5 = r0
        L_0x0037:
            r4.printStackTrace()     // Catch:{ all -> 0x0045 }
            if (r5 == 0) goto L_0x0044
            r5.close()     // Catch:{ Exception -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0044:
            return r0
        L_0x0045:
            r4 = move-exception
            r0 = r5
        L_0x0047:
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0051:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.C26311p.m95265a(android.graphics.Bitmap, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m95268a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
        }
    }

    /* renamed from: a */
    public static void m95269a(Context context, String str, final AbstractC26313a aVar) {
        if (!TextUtils.isEmpty(str)) {
            MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{m95283c(str)}, new MediaScannerConnection.OnScanCompletedListener() {
                /* class com.larksuite.framework.utils.C26311p.C263121 */

                public void onScanCompleted(String str, Uri uri) {
                    AbstractC26313a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo93435a(str, uri);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m95270a(Context context, String str, String str2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new File(str2).mkdirs();
                for (String str3 : list) {
                    m95270a(context, str + "/" + str3, str2 + "/" + str3);
                }
                return;
            }
            InputStream inputStream = null;
            try {
                InputStream open = context.getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(new File(str2));
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                    inputStream = open;
                    try {
                        e.printStackTrace();
                        C26266d.m95082a(inputStream);
                        C26266d.m95082a(fileOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        C26266d.m95082a(inputStream);
                        C26266d.m95082a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    inputStream = open;
                    C26266d.m95082a(inputStream);
                    C26266d.m95082a(fileOutputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            C26266d.m95082a(open);
                            C26266d.m95082a(fileOutputStream);
                            return;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStream = open;
                    e.printStackTrace();
                    C26266d.m95082a(inputStream);
                    C26266d.m95082a(fileOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = open;
                    C26266d.m95082a(inputStream);
                    C26266d.m95082a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = null;
                e.printStackTrace();
                C26266d.m95082a(inputStream);
                C26266d.m95082a(fileOutputStream);
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                C26266d.m95082a(inputStream);
                C26266d.m95082a(fileOutputStream);
                throw th;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
