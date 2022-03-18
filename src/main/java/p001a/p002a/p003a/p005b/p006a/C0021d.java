package p001a.p002a.p003a.p005b.p006a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.a.a.b.a.d */
public class C0021d {
    /* renamed from: a */
    public static String m31a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext().getDataDir().getAbsolutePath();
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        int lastIndexOf = absolutePath.lastIndexOf(File.separator);
        return lastIndexOf <= 0 ? absolutePath : absolutePath.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public static String m32a(Context context, Bundle bundle, int i, Uri uri) {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        if (i == 0) {
            str = "module_name";
            str3 = bundle.getString(str);
            str2 = String.valueOf(bundle.getInt("module_version"));
            sb = new StringBuilder();
        } else {
            str = "loader_name";
            str3 = bundle.getString(str);
            str2 = String.valueOf(bundle.getInt("loader_version"));
            sb = new StringBuilder();
        }
        sb.append(bundle.getString(str));
        sb.append(".apk");
        String sb2 = sb.toString();
        String str4 = m31a(context) + File.separator + "dynamic_modules" + File.separator + str3;
        String str5 = str4 + File.separator + str2;
        String str6 = str5 + File.separator + sb2;
        if (!new File(str4).exists()) {
            return m33a(context, str5, uri, str6);
        }
        String[] list = new File(str4).list();
        int a = m30a(list);
        if (a < Integer.parseInt(str2)) {
            return m33a(context, str5, uri, str6);
        }
        m34a(a, str4, list, "ModuleCopy");
        return str4 + File.separator + a + File.separator + sb2;
    }

    /* renamed from: a */
    public static void m34a(int i, String str, String[] strArr, String str2) {
        C0017b.m27a(1, str2).execute(new RunnableC0022a(strArr, i, str));
    }

    /* renamed from: a */
    public static void m38a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Logger.println(6, "ModuleCopy", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m39a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return true;
            }
            return file.mkdirs();
        } catch (Exception e) {
            Log.e("ModuleCopy", "makeDirectory Exception: " + e.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m40b(String str) {
        boolean z;
        File file = new File(str);
        if (file.isDirectory()) {
            String[] list = file.list();
            z = true;
            for (String str2 : list) {
                if (z) {
                    if (m40b(str + File.separator + str2)) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.a.a.b.a.d$a */
    public static class RunnableC0022a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String[] f35a;

        /* renamed from: b */
        public final /* synthetic */ int f36b;

        /* renamed from: c */
        public final /* synthetic */ String f37c;

        public RunnableC0022a(String[] strArr, int i, String str) {
            this.f35a = strArr;
            this.f36b = i;
            this.f37c = str;
        }

        public void run() {
            String[] strArr = this.f35a;
            for (String str : strArr) {
                if (Integer.parseInt(str) < this.f36b) {
                    Logger.println(4, "ModuleCopy", "Delete low version:" + this.f36b + " in modulePath.");
                    C0021d.m40b(this.f37c + File.separator + str);
                }
            }
        }
    }

    /* renamed from: a */
    public static int m30a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            Logger.println(4, "ModuleCopy", "No version dirs in module path, need mkdir.");
            return 0;
        }
        int i = 0;
        for (String str : strArr) {
            if (Integer.parseInt(str) > i) {
                i = Integer.parseInt(str);
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m36a(Context context, Bundle bundle) {
        if (context == null || bundle == null) {
            Logger.println(6, "ModuleCopy", "The context or module info bundle is null.");
            return;
        }
        boolean equals = TextUtils.equals(bundle.getString("module_path"), bundle.getString("loader_path"));
        m37a(context, bundle, 0);
        if (equals) {
            bundle.putString("loader_path", bundle.getString("module_path"));
        } else {
            m37a(context, bundle, 1);
        }
    }

    /* renamed from: a */
    public static void m35a(Context context, Uri uri, String str) {
        Throwable th;
        InputStream inputStream;
        FileNotFoundException e;
        StringBuilder sb;
        IOException e2;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            if (inputStream == null) {
                try {
                    Logger.println(5, "ModuleCopy", "Get input stream failed: null.");
                    m38a(inputStream);
                    m38a((Closeable) null);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    sb.append("FileNotFoundException:");
                    sb.append(e.getMessage());
                    Logger.println(6, "ModuleCopy", sb.toString());
                    m38a(inputStream);
                    m38a(bufferedOutputStream);
                } catch (IOException e4) {
                    e2 = e4;
                    try {
                        sb = new StringBuilder();
                        sb.append("IOException ");
                        sb.append(e2.getMessage());
                        Logger.println(6, "ModuleCopy", sb.toString());
                        m38a(inputStream);
                        m38a(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        m38a(inputStream);
                        m38a(bufferedOutputStream);
                        throw th;
                    }
                }
            } else {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str)));
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            m38a(inputStream);
                            m38a(bufferedOutputStream2);
                            return;
                        }
                    }
                } catch (FileNotFoundException e5) {
                    bufferedOutputStream = bufferedOutputStream2;
                    e = e5;
                    sb = new StringBuilder();
                    sb.append("FileNotFoundException:");
                    sb.append(e.getMessage());
                    Logger.println(6, "ModuleCopy", sb.toString());
                    m38a(inputStream);
                    m38a(bufferedOutputStream);
                } catch (IOException e6) {
                    bufferedOutputStream = bufferedOutputStream2;
                    e2 = e6;
                    sb = new StringBuilder();
                    sb.append("IOException ");
                    sb.append(e2.getMessage());
                    Logger.println(6, "ModuleCopy", sb.toString());
                    m38a(inputStream);
                    m38a(bufferedOutputStream);
                } catch (Throwable th3) {
                    bufferedOutputStream = bufferedOutputStream2;
                    th = th3;
                    m38a(inputStream);
                    m38a(bufferedOutputStream);
                    throw th;
                }
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            inputStream = null;
            sb = new StringBuilder();
            sb.append("FileNotFoundException:");
            sb.append(e.getMessage());
            Logger.println(6, "ModuleCopy", sb.toString());
            m38a(inputStream);
            m38a(bufferedOutputStream);
        } catch (IOException e8) {
            e2 = e8;
            inputStream = null;
            sb = new StringBuilder();
            sb.append("IOException ");
            sb.append(e2.getMessage());
            Logger.println(6, "ModuleCopy", sb.toString());
            m38a(inputStream);
            m38a(bufferedOutputStream);
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            m38a(inputStream);
            m38a(bufferedOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m37a(Context context, Bundle bundle, int i) {
        String str;
        String str2;
        if (i == 0) {
            str = "module_uri_path";
        } else {
            str = "loader_uri_path";
        }
        String string = bundle.getString(str);
        Logger.println(4, "ModuleCopy", "path:" + string);
        String a = m32a(context, bundle, i, Uri.parse(string));
        if (TextUtils.isEmpty(a)) {
            Logger.println(5, "ModuleCopy", "checkModulePath failed: null.");
            return;
        }
        if (i == 0) {
            str2 = "module_path";
        } else {
            str2 = "loader_path";
        }
        bundle.putString(str2, a);
    }

    /* renamed from: a */
    public static String m33a(Context context, String str, Uri uri, String str2) {
        if (!m39a(str)) {
            Logger.println(6, "ModuleCopy", "makeDirectory return false");
            return null;
        }
        m35a(context, uri, str2);
        return str2;
    }
}
