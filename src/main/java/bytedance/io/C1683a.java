package bytedance.io;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import bytedance.p052c.C1680a;
import com.huawei.hms.adapter.internal.CommonCode;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: bytedance.io.a */
public class C1683a {

    /* renamed from: a */
    private static final String[] f5709a = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "relative_path", "datetaken", "orientation"};

    /* renamed from: b */
    private static final String[] f5710b = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "_data", "datetaken", "orientation"};

    /* renamed from: c */
    private static final String[] f5711c = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "relative_path", "datetaken", CommonCode.MapKey.HAS_RESOLUTION};

    /* renamed from: d */
    private static final String[] f5712d = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "datetaken", CommonCode.MapKey.HAS_RESOLUTION};

    /* renamed from: e */
    private static final String[] f5713e = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "is_music", "album", "album_id", "artist", "title", "relative_path", "datetaken"};

    /* renamed from: f */
    private static final String[] f5714f = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "album", "album_id", "artist", "title", "is_music", "_data"};

    /* renamed from: g */
    private static final String[] f5715g = {String.valueOf(1), String.valueOf(3)};

    /* renamed from: h */
    private static final String[] f5716h = {"image/jpeg", "image/png", "image/gif", "image/webp", "image/bmp"};

    /* renamed from: i */
    private static final String[] f5717i = {"video/webm", "video/mp4", "video/ogg", "video/flv", "video/avi", "video/wmv", "video/rmvb"};

    /* renamed from: j */
    private static final String[] f5718j = {"audio/mp3", "audio/midi", "audio/wav", "audio/m3u", "audio/m4a", "audio/ogg", "audio/ra"};

    /* renamed from: a */
    public static boolean m7451a(Context context, Uri uri) {
        if (!(context == null || uri == null)) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    openAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Uri m7449a(Context context, String str, String str2, String str3) {
        return m7450a(context, str, str2, str3, null);
    }

    /* renamed from: b */
    public static Uri m7452b(Context context, String str, String str2, String str3) {
        return m7453b(context, str, str2, str3, null);
    }

    /* renamed from: a */
    public static Uri m7450a(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
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
        if (C1680a.m7444a()) {
            uri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C1680a.m7442a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
            uri = uri2;
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    /* renamed from: b */
    public static Uri m7453b(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
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
        if (C1680a.m7444a()) {
            uri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C1680a.m7442a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
            uri = uri2;
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    /* renamed from: c */
    public static Uri m7454c(Context context, String str, String str2, String str3, ContentValues contentValues) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
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
        if (C1680a.m7444a()) {
            uri = MediaStore.Audio.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            Uri uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C1680a.m7442a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
            uri = uri2;
        }
        return context.getContentResolver().insert(uri, contentValues);
    }
}
