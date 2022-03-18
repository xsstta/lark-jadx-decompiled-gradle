package com.bytedance.ee.util.io;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.io.File;

/* renamed from: com.bytedance.ee.util.io.g */
public class C13680g {

    /* renamed from: a */
    public static final String f35878a = (Environment.DIRECTORY_PICTURES + File.separator + "Lark");

    /* renamed from: b */
    public static final String f35879b = (Environment.DIRECTORY_DCIM + File.separator + "Lark");

    /* renamed from: c */
    public static final String f35880c = (Environment.DIRECTORY_DOWNLOADS + File.separator + "Lark");

    /* renamed from: d */
    public static final String f35881d = (Environment.DIRECTORY_DOCUMENTS + File.separator + "Lark");

    /* renamed from: e */
    public static final String f35882e = (Environment.DIRECTORY_MUSIC + File.separator + "Lark");

    /* renamed from: f */
    public static final String f35883f = (Environment.DIRECTORY_MOVIES + File.separator + "Lark");

    /* renamed from: a */
    private static String m55552a(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    /* renamed from: a */
    public static String m55551a(Context context, Uri uri) {
        return context.getContentResolver().getType(uri);
    }

    /* renamed from: b */
    public static long m55554b(Context context, Uri uri) {
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

    /* renamed from: c */
    public static boolean m55557c(Context context, Uri uri) {
        if (context == null || uri == null) {
            C13479a.m54764b("MediaStoreUtil", "isUriExists: uri == null");
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                C13479a.m54764b("MediaStoreUtil", "isUriExists: null == afd");
                return false;
            }
            openAssetFileDescriptor.close();
            return true;
        } catch (Exception e) {
            C13479a.m54764b("MediaStoreUtil", "isUriExists: fail" + e);
            return false;
        }
    }

    /* renamed from: a */
    public static void m55553a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(str)));
            context.sendBroadcast(intent);
            MediaScannerConnection.scanFile(context, new String[]{str}, null, null);
        }
    }

    /* renamed from: a */
    public static Uri m55550a(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        C13479a.m54764b("MediaStoreUtil", "createVideoUri: name = " + str + " mimeType =" + str2 + " dirName =" + str3);
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            C13479a.m54764b("MediaStoreUtil", "createVideoUri: fail");
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (Build.VERSION.SDK_INT >= 29) {
            uri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", m55552a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
            uri = uri2;
        }
        Uri insert = context.getContentResolver().insert(uri, contentValues);
        C13479a.m54764b("MediaStoreUtil", "createVideoUri: " + insert);
        return insert;
    }

    /* renamed from: b */
    public static Uri m55555b(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        C13479a.m54764b("MediaStoreUtil", "createMusicUri: name = " + str + " mimeType =" + str2 + " dirName =" + str3);
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            C13479a.m54764b("MediaStoreUtil", "createMusicUri: fail");
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (Build.VERSION.SDK_INT >= 29) {
            uri = MediaStore.Audio.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            Uri uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", m55552a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
            uri = uri2;
        }
        Uri insert = context.getContentResolver().insert(uri, contentValues);
        C13479a.m54764b("MediaStoreUtil", "createMusicUri: " + insert);
        return insert;
    }

    /* renamed from: c */
    public static Uri m55556c(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        C13479a.m54764b("MediaStoreUtil", "createImageUri: name = " + str + " mimeType =" + str2 + " dirName =" + str3);
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            C13479a.m54764b("MediaStoreUtil", "createMusicUri: fail");
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (Build.VERSION.SDK_INT >= 29) {
            uri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", m55552a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
            uri = uri2;
        }
        Uri insert = context.getContentResolver().insert(uri, contentValues);
        C13479a.m54764b("MediaStoreUtil", "createMusicUri: " + insert);
        return insert;
    }

    /* renamed from: d */
    public static Uri m55558d(Context context, String str, String str2, String str3, ContentValues contentValues) {
        C13479a.m54764b("MediaStoreUtil", "createDownloadUri: name = " + str + " mimeType =" + str2 + " dirName =" + str3);
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            C13479a.m54764b("MediaStoreUtil", "createDownloadUri: fail");
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        if (contentValues == null) {
            contentValues = new ContentValues();
        }
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("relative_path", str3);
        contentValues.put("mime_type", str2);
        Uri insert = context.getContentResolver().insert(MediaStore.Files.getContentUri("external_primary"), contentValues);
        C13479a.m54764b("MediaStoreUtil", "createDownloadUri: " + insert);
        return insert;
    }
}
