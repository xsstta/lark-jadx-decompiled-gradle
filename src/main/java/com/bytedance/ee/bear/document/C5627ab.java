package com.bytedance.ee.bear.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.ee.bear.document.ab */
public class C5627ab {
    /* renamed from: a */
    public static boolean m22836a(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("docsource://com.bytedance.net/file/f/")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m22838b(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/obj/creation-image-system/") || !m22841e(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m22841e(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf < 0 || (i = lastIndexOf + 1) > str.length()) {
            return false;
        }
        return str.substring(i).startsWith("cover-");
    }

    /* renamed from: a */
    public static int[] m22837a(File file) {
        if (file == null) {
            C13479a.m54758a("ImageUtil", "getSize(): file is null");
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: c */
    public static boolean m22839c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            if ("image".equalsIgnoreCase(parse.getQueryParameter(ShareHitPoint.f121869d))) {
                return true;
            }
            String path = parse.getPath();
            if (path == null || !path.contains("/api/box/stream/download/all/")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C13479a.m54761a("ImageUtil", e);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m22840d(String str) {
        String path;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || (path = parse.getPath()) == null || !path.contains("/api/box/stream/download/v2/cover/")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C13479a.m54761a("ImageUtil", e);
            return false;
        }
    }

    /* renamed from: a */
    public static File m22834a(Context context, Bitmap bitmap, File file, boolean z) {
        return m22835a(context, bitmap, file, z, Bitmap.CompressFormat.JPEG);
    }

    /* renamed from: a */
    public static File m22835a(Context context, Bitmap bitmap, File file, boolean z, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        String str;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                C13675f.m55498a(file);
                file.mkdirs();
            }
            if (Bitmap.CompressFormat.PNG.equals(compressFormat)) {
                str = ".png";
            } else {
                str = ".jpg";
            }
            File file2 = new File(file, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + str);
            fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(compressFormat, 100, fileOutputStream);
                if (z) {
                    C13675f.m55496a(context, file2.getAbsolutePath());
                }
                C13675f.m55497a(fileOutputStream);
                return file2;
            } catch (Exception e2) {
                e = e2;
                try {
                    C13479a.m54761a("ImageUtil", e);
                    C13675f.m55497a(fileOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    C13675f.m55497a(fileOutputStream2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
            C13479a.m54761a("ImageUtil", e);
            C13675f.m55497a(fileOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C13675f.m55497a(fileOutputStream2);
            throw th;
        }
    }
}
