package com.facebook.common.util;

import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nullable;

public class UriUtil {
    private static final Uri LOCAL_CONTACT_IMAGE_URI = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static Uri getUriForFile(File file) {
        return Uri.fromFile(file);
    }

    @Nullable
    public static String getSchemeOrNull(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean isDataUri(@Nullable Uri uri) {
        return Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalAssetUri(@Nullable Uri uri) {
        return "asset".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalContentUri(@Nullable Uri uri) {
        return "content".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalFileUri(@Nullable Uri uri) {
        return "file".equals(getSchemeOrNull(uri));
    }

    public static boolean isLocalResourceUri(@Nullable Uri uri) {
        return "res".equals(getSchemeOrNull(uri));
    }

    public static boolean isQualifiedResourceUri(@Nullable Uri uri) {
        return "android.resource".equals(getSchemeOrNull(uri));
    }

    @Nullable
    public static Uri parseUriOrNull(@Nullable String str) {
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    public static Uri getUriForResourceId(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static boolean isNetworkUri(@Nullable Uri uri) {
        String schemeOrNull = getSchemeOrNull(uri);
        if ("https".equals(schemeOrNull) || "http".equals(schemeOrNull)) {
            return true;
        }
        return false;
    }

    @Nullable
    public static URL uriToUrl(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isLocalCameraUri(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    public static boolean isLocalContactUri(Uri uri) {
        if (!isLocalContentUri(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(LOCAL_CONTACT_IMAGE_URI.getPath())) {
            return false;
        }
        return true;
    }

    public static Uri getUriForQualifiedResource(String str, int i) {
        return new Uri.Builder().scheme("android.resource").authority(str).path(String.valueOf(i)).build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getRealPathFromUri(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = isLocalContentUri(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x002b
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002b
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002b
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002b
        L_0x0028:
            r9 = move-exception
            r1 = r8
            goto L_0x0032
        L_0x002b:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0031:
            r9 = move-exception
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = isLocalFileUri(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.UriUtil.getRealPathFromUri(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
