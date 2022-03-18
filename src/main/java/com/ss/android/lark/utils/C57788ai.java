package com.ss.android.lark.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.larksuite.framework.utils.C26257ai;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.utils.ai */
public class C57788ai {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.utils.ai$1 */
    public static /* synthetic */ class C577891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f142313a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.utils.ImageUtils$ImageType[] r0 = com.ss.android.lark.utils.ImageUtils.ImageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.utils.C57788ai.C577891.f142313a = r0
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_JPG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_PNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_GIF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_TIFF     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_BMP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_WEBP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_ICO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.utils.C57788ai.C577891.f142313a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.utils.ImageUtils$ImageType r1 = com.ss.android.lark.utils.ImageUtils.ImageType.TYPE_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.C57788ai.C577891.<clinit>():void");
        }
    }

    /* renamed from: b */
    private static byte[] m224262b(File file) {
        Throwable th;
        IOException e;
        byte[] bArr = new byte[12];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileInputStream2.read(bArr);
                C57839i.m224502a(fileInputStream2);
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    C57839i.m224502a(fileInputStream);
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    C57839i.m224502a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C57839i.m224502a(fileInputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            C57839i.m224502a(fileInputStream);
            return bArr;
        }
        return bArr;
    }

    /* renamed from: a */
    private static String m224258a(File file) {
        byte[] b = m224262b(file);
        String upperCase = C26257ai.m95013a(b).toUpperCase();
        switch (C577891.f142313a[ImageUtils.m224132a(b).ordinal()]) {
            case 1:
                return ".jpg";
            case 2:
                return ".png";
            case 3:
                return ".gif";
            case 4:
                return ".tif";
            case 5:
                return ".bmp";
            case 6:
                return ".webp";
            case 7:
                return ".ico";
            default:
                if (upperCase.contains("667479704D534E56") || upperCase.contains("6674797069736F6D") || upperCase.contains("667479706D703432")) {
                    return ".mp4";
                }
                return "";
        }
    }

    /* renamed from: a */
    public static String m224257a(Context context, Uri uri) {
        if (context == null || uri == null) {
            return null;
        }
        String c = C26311p.m95282c(context, uri);
        if (m224260a(context, c)) {
            return null;
        }
        if (c == null) {
            return m224261b(context, uri);
        }
        return c;
    }

    /* renamed from: b */
    public static String m224261b(Context context, Uri uri) {
        String str;
        if (C57852m.m224554a(context)) {
            String str2 = "Never Call This, Uri: " + uri;
            try {
                Toast.makeText(context, str2, 0).show();
            } catch (Exception unused) {
                Log.m165383e("UriUtils", str2);
            }
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            str = C26311p.m95278b(context, uri);
        } else {
            str = C26311p.m95285e(path);
        }
        if (TextUtils.isEmpty(str) || m224260a(context, str)) {
            return null;
        }
        String str3 = C57881t.m224649u(context) + "/" + System.currentTimeMillis() + "/";
        C26311p.m95289i(str3);
        if (!new File(str3).exists()) {
            return null;
        }
        File file = new File(str3 + File.separator + str);
        m224259a(context, uri, file);
        if (!file.exists()) {
            return null;
        }
        File a = m224256a(uri, str3, str, file);
        if (a != null) {
            return a.getAbsolutePath();
        }
        return file.getAbsolutePath();
    }

    /* renamed from: a */
    private static boolean m224260a(Context context, String str) {
        String packageName = context.getPackageName();
        if (str == null) {
            return false;
        }
        try {
            str = new File(str).getCanonicalPath();
        } catch (IOException e) {
            Log.m165383e("UriUtils", "An exception occurred while getCanonicalPath," + e.getMessage());
            e.getMessage();
        }
        if (!str.contains("/data/data/") && !str.contains("/data/user/")) {
            return false;
        }
        if (!str.contains("/" + packageName + "/")) {
            if (str.contains("/" + packageName + "-")) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m224259a(Context context, Uri uri, File file) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                C26311p.m95273a(openInputStream, new FileOutputStream(file));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static File m224256a(Uri uri, String str, String str2, File file) {
        if (!TextUtils.isEmpty(C26311p.m95284d(str2))) {
            return null;
        }
        String a = m224258a(file);
        File file2 = new File(str + File.separator + str2 + a);
        if (file.renameTo(file2)) {
            return file2;
        }
        return null;
    }
}
