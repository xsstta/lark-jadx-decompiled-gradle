package com.huawei.hms.availableupdate;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.io.IOException;

/* renamed from: com.huawei.hms.availableupdate.l */
public class C23482l {

    /* renamed from: a */
    public Context f57917a;

    /* renamed from: b */
    public String f57918b;

    /* renamed from: a */
    public final String mo82161a() {
        String str;
        Context context = (Context) Checker.assertNonNull(this.f57917a, "mContext is null, call setContext first.");
        synchronized (this) {
            if (this.f57918b == null) {
                if (context.getExternalCacheDir() != null) {
                    this.f57918b = m85171b(context.getExternalCacheDir());
                } else {
                    this.f57918b = m85171b(context.getFilesDir());
                }
            }
            str = this.f57918b;
        }
        return str;
    }

    /* renamed from: a */
    public static File m85170a(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalFile();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m85171b(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public File mo82159a(Uri uri) {
        String c;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null || (c = mo82164c(encodedPath)) == null) {
            return null;
        }
        return m85170a(new File(c));
    }

    /* renamed from: c */
    public final String mo82164c(String str) {
        int indexOf;
        String b;
        String a = mo82161a();
        if (a != null && (indexOf = str.indexOf(47, 1)) >= 0 && "ContentUriHelper".equals(Uri.decode(str.substring(1, indexOf))) && (b = m85171b(new File(a, Uri.decode(str.substring(indexOf + 1))))) != null && b.startsWith(a)) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    public File mo82160a(String str) {
        String a = mo82161a();
        if (a == null) {
            return null;
        }
        return m85170a(new File(a, str));
    }

    /* renamed from: b */
    public final String mo82163b(String str) {
        int i;
        String a = mo82161a();
        if (a == null || !str.startsWith(a)) {
            return null;
        }
        if (a.endsWith("/")) {
            i = a.length();
        } else {
            i = a.length() + 1;
        }
        return Uri.encode("ContentUriHelper") + '/' + str.substring(i);
    }

    /* renamed from: a */
    public void mo82162a(Context context) {
        if (this.f57917a == null) {
            Checker.checkNonNull(context, "context must not be null.");
            this.f57917a = context;
        }
    }

    /* renamed from: a */
    public Uri mo82158a(File file, String str) {
        String b;
        String b2 = m85171b(file);
        if (b2 == null || (b = mo82163b(b2)) == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str).encodedPath(b).build();
    }
}
