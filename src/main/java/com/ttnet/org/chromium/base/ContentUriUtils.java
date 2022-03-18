package com.ttnet.org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class ContentUriUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static FileProviderUtil sFileProviderUtil;
    private static final Object sLock = new Object();

    public interface FileProviderUtil {
        Uri getContentUriFromFile(File file);
    }

    private ContentUriUtils() {
    }

    public static void setFileProviderUtil(FileProviderUtil fileProviderUtil) {
        synchronized (sLock) {
            sFileProviderUtil = fileProviderUtil;
        }
    }

    public static boolean contentUriExists(String str) {
        boolean z;
        AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(str);
        if (assetFileDescriptor != null) {
            z = true;
        } else {
            z = false;
        }
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    public static boolean delete(String str) {
        if (ContextUtils.getApplicationContext().getContentResolver().delete(Uri.parse(str), null, null) > 0) {
            return true;
        }
        return false;
    }

    public static Uri getContentUriFromFile(File file) {
        synchronized (sLock) {
            FileProviderUtil fileProviderUtil = sFileProviderUtil;
            if (fileProviderUtil == null) {
                return null;
            }
            return fileProviderUtil.getContentUriFromFile(file);
        }
    }

    private static boolean hasVirtualFlag(Cursor cursor) {
        int columnIndex;
        if (Build.VERSION.SDK_INT >= 24 && (columnIndex = cursor.getColumnIndex("flags")) > -1 && (cursor.getLong(columnIndex) & 512) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isContentUri(String str) {
        Uri parse;
        if (str == null || (parse = Uri.parse(str)) == null || !"content".equals(parse.getScheme())) {
            return false;
        }
        return true;
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(str);
        if (assetFileDescriptor != null) {
            return assetFileDescriptor.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = ContextUtils.getApplicationContext().getContentResolver();
        Uri parse = Uri.parse(str);
        if (!isVirtualDocument(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    public static String maybeGetDisplayName(String str) {
        try {
            String displayName = getDisplayName(Uri.parse(str), ContextUtils.getApplicationContext(), "_display_name");
            if (TextUtils.isEmpty(displayName)) {
                return null;
            }
            return displayName;
        } catch (Exception e) {
            Log.w("ContentUriUtils", "Cannot open content uri: " + str, e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r8 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        $closeResource(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isVirtualDocument(android.net.Uri r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 19
            if (r0 >= r2) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.content.Context r0 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r8)
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            android.content.Context r0 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()
            android.content.ContentResolver r2 = r0.getContentResolver()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r8
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ NullPointerException -> 0x004c }
            r0 = 0
            if (r8 == 0) goto L_0x0047
            int r2 = r8.getCount()     // Catch:{ all -> 0x003e }
            r3 = 1
            if (r2 < r3) goto L_0x0047
            r8.moveToFirst()     // Catch:{ all -> 0x003e }
            boolean r2 = hasVirtualFlag(r8)     // Catch:{ all -> 0x003e }
            if (r8 == 0) goto L_0x003d
            $closeResource(r0, r8)
        L_0x003d:
            return r2
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r2 = move-exception
            if (r8 == 0) goto L_0x0046
            $closeResource(r0, r8)
        L_0x0046:
            throw r2
        L_0x0047:
            if (r8 == 0) goto L_0x004c
            $closeResource(r0, r8)
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ContentUriUtils.isVirtualDocument(android.net.Uri):boolean");
    }

    private static AssetFileDescriptor getAssetFileDescriptor(String str) {
        ContentResolver contentResolver = ContextUtils.getApplicationContext().getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (isVirtualDocument(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0, -1);
                }
            }
        } catch (FileNotFoundException e) {
            Log.w("ContentUriUtils", "Cannot find content uri: " + str, e);
        } catch (SecurityException e2) {
            Log.w("ContentUriUtils", "Cannot open content uri: " + str, e2);
        } catch (Exception e3) {
            Log.w("ContentUriUtils", "Unknown content uri: " + str, e3);
        }
        return null;
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        $closeResource(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getDisplayName(android.net.Uri r7, android.content.Context r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ContentUriUtils.getDisplayName(android.net.Uri, android.content.Context, java.lang.String):java.lang.String");
    }
}
