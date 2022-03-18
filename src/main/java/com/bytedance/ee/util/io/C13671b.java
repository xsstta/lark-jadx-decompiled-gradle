package com.bytedance.ee.util.io;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.larksuite.framework.utils.C26310o;
import com.larksuite.framework.utils.C26311p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* renamed from: com.bytedance.ee.util.io.b */
public class C13671b {

    /* renamed from: a */
    private static List<String> f35860a = Arrays.asList("doc", "docx", "xls", "xlsx", "pdf", "pps", "ppt", "pptx", "txt");

    /* renamed from: b */
    private static boolean m55472b(String str) {
        return f35860a.contains(str);
    }

    /* renamed from: a */
    private static File m55464a(String str) {
        File file = new File(Environment.getExternalStorageDirectory() + File.separator + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static OutputStream m55465a(Context context, Uri uri) throws FileNotFoundException {
        C13479a.m54764b("ExternalStorageUtil", "getOutputStream: ");
        if (Build.VERSION.SDK_INT < 29) {
            return new FileOutputStream(uri.getPath());
        }
        return context.getContentResolver().openOutputStream(uri);
    }

    /* renamed from: c */
    public static boolean m55474c(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return new File(uri.getPath()).exists();
        }
        return C13680g.m55557c(context, uri);
    }

    /* renamed from: e */
    public static void m55476e(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 29) {
            C13675f.m55496a(context, uri.getPath());
            return;
        }
        String a = C26311p.m95264a(context, uri);
        if (a != null) {
            C13680g.m55553a(context, a);
        }
    }

    /* renamed from: f */
    public static void m55477f(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT < 29) {
            C13675f.m55512b(context, uri.getPath());
            return;
        }
        String a = C26311p.m95264a(context, uri);
        if (a != null) {
            C13680g.m55553a(context, a);
        }
    }

    /* renamed from: b */
    public static void m55471b(Context context, Uri uri) {
        if (!m55474c(context, uri)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            new File(uri.getPath()).delete();
        } else {
            context.getContentResolver().delete(uri, null, null);
        }
    }

    /* renamed from: c */
    private static String m55473c(String str, String str2) {
        int lastIndexOf = str2.lastIndexOf(46);
        if (lastIndexOf < 0) {
            lastIndexOf = str2.length();
        }
        String format = new SimpleDateFormat("_yyyyMMddHHmmss").format(new Date());
        C13479a.m54764b("ExternalStorageUtil", "getUniqueFileNameWithTime: success");
        return new StringBuilder(str2).insert(lastIndexOf, format).toString();
    }

    /* renamed from: d */
    public static long m55475d(Context context, Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath()).length();
        }
        if ("content".equals(uri.getScheme())) {
            try {
                return context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static String m55466a(String str, String str2) {
        if (str2.contains("image/")) {
            return C13680g.f35879b;
        }
        if (str2.contains("video/")) {
            return C13680g.f35883f;
        }
        if (str2.contains("audio/")) {
            return C13680g.f35882e;
        }
        if (m55472b(C13675f.m55534g(str))) {
            return C13680g.f35881d;
        }
        return C13680g.f35880c;
    }

    /* renamed from: b */
    private static String m55470b(String str, String str2) {
        File a = m55464a(str);
        a.mkdirs();
        File file = new File(a, str2);
        int lastIndexOf = str2.lastIndexOf(46);
        if (lastIndexOf < 0) {
            lastIndexOf = str2.length();
        }
        int i = 0;
        String str3 = str2;
        while (file.exists()) {
            i++;
            StringBuilder sb = new StringBuilder(str2);
            str3 = sb.insert(lastIndexOf, "(" + i + ")").toString();
            file = new File(a, str3);
        }
        C13479a.m54764b("ExternalStorageUtil", "getUniqueFileNameWithNumber: " + i);
        return str3;
    }

    /* renamed from: a */
    public static boolean m55467a(Context context, Uri uri, String str) {
        C13479a.m54764b("ExternalStorageUtil", "openUri: ..");
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(uri.getPath());
            if (!file.exists()) {
                C13479a.m54764b("ExternalStorageUtil", "openUri: file does not exist");
                return false;
            }
            uri = C26310o.m95259a(context, new File(uri.getPath()));
            if (TextUtils.isEmpty(str)) {
                str = C13675f.m55533g(file);
            }
        } else if (!C13680g.m55557c(context, uri)) {
            C13479a.m54764b("ExternalStorageUtil", "openUri: file does not exist");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            str = C13680g.m55551a(context, uri);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setDataAndType(uri, str);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            C13479a.m54759a("ExternalStorageUtil", "openUri: ", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m55468a(Context context, InputStream inputStream, Uri uri) {
        C13479a.m54764b("ExternalStorageUtil", "copyInputStreamToUri: uri = " + uri);
        if (!(inputStream == null || uri == null)) {
            try {
                OutputStream a = m55465a(context, uri);
                if (a != null) {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            a.write(bArr, 0, read);
                        } else {
                            a.flush();
                            inputStream.close();
                            a.close();
                            C13479a.m54764b("ExternalStorageUtil", "copyInputStreamToUri success");
                            return true;
                        }
                    }
                }
            } catch (IOException e) {
                C13479a.m54759a("ExternalStorageUtil", "copyInputStreamToUri fail ", e);
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m55469a(Context context, String str, Uri uri) {
        C13479a.m54764b("ExternalStorageUtil", "copyFileToUri: uri = " + uri);
        if (!(str == null || uri == null)) {
            try {
                return m55468a(context, new FileInputStream(new File(str)), uri);
            } catch (IOException e) {
                C13479a.m54759a("ExternalStorageUtil", "copyFileToUri: ", e);
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Uri m55462a(Context context, String str, String str2, String str3) {
        return m55463a(context, str, str2, str3, null);
    }

    /* renamed from: a */
    public static Uri m55463a(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        C13479a.m54764b("ExternalStorageUtil", "createUri ..");
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = C13675f.m55532f(str);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = m55466a(str, str2);
            }
            String c = m55473c(str3, str);
            C13479a.m54764b("ExternalStorageUtil", "createUri Build.VERSION.SDK_INT =" + Build.VERSION.SDK_INT + " mimeType =" + str2 + " dirName =" + str3 + " name =" + c);
            if (Build.VERSION.SDK_INT < 29) {
                uri = Uri.fromFile(new File(m55464a(str3), m55470b(str3, c)));
            } else if (str2.contains("image/")) {
                uri = C13680g.m55556c(context, c, str2, str3, contentValues);
            } else if (str2.contains("video/")) {
                uri = C13680g.m55550a(context, c, str2, str3, contentValues);
            } else if (str2.contains("audio/")) {
                uri = C13680g.m55555b(context, c, str2, str3, contentValues);
            } else {
                uri = C13680g.m55558d(context, c, str2, str3, contentValues);
            }
        } catch (Throwable th) {
            C13606d.m55245a("ExternalStorageUtil", th);
            uri = null;
        }
        C13479a.m54764b("ExternalStorageUtil", "createUri: uri = " + uri);
        return uri;
    }
}
