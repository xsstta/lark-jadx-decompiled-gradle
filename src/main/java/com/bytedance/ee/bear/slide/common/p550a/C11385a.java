package com.bytedance.ee.bear.slide.common.p550a;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.larksuite.framework.utils.C26310o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.slide.common.a.a */
public final class C11385a {
    /* renamed from: a */
    private static void m47262a(Context context, List<File> list, String str, int i, int i2) {
        if (context == null) {
            C13479a.m54775e("ShareUtils", "shareFiles context is null");
        } else if (list == null || list.size() <= 0) {
            C13479a.m54775e("ShareUtils", "files is null or size is 0");
        } else {
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            Intent a = m47255a(z, i2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (z) {
                for (File file : list) {
                    if (file != null && file.exists() && file.isFile()) {
                        arrayList.add(m47257a(context, file, i2));
                    }
                }
                a.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            } else {
                Uri a2 = m47257a(context, list.get(0), i2);
                if (a2 == null) {
                    C13479a.m54775e("ShareUtils", "share uri is null");
                }
                a.putExtra("android.intent.extra.STREAM", a2);
            }
            if (!(context instanceof Activity)) {
                a.addFlags(268435456);
            }
            if (i != -1) {
                try {
                    if (context instanceof Activity) {
                        ((Activity) context).startActivityForResult(Intent.createChooser(a, str), i);
                        return;
                    }
                } catch (Exception e) {
                    C13479a.m54761a("ShareUtils", e);
                    return;
                }
            }
            context.startActivity(Intent.createChooser(a, str));
        }
    }

    /* renamed from: a */
    private static Uri m47259a(File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                StrictMode.class.getDeclaredMethod("disableDeathOnFileUriExposure", new Class[0]).invoke(null, new Object[0]);
                return Uri.parse("file://" + file.getAbsolutePath());
            } catch (Exception e) {
                C13479a.m54761a("ShareUtils", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Intent m47255a(boolean z, int i) {
        Intent intent = new Intent();
        if (z) {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
        } else {
            intent.setAction("android.intent.action.SEND");
        }
        intent.addCategory("android.intent.category.DEFAULT");
        if (i == 1) {
            intent.setType("application/pdf");
        } else if (i == 2) {
            intent.setType("image/*");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
        }
        return intent;
    }

    /* renamed from: a */
    private static Uri m47256a(Context context, File file) {
        try {
            return FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
        } catch (Exception e) {
            C13479a.m54761a("ShareUtils", e);
            return null;
        }
    }

    /* renamed from: b */
    private static Uri m47263b(Context context, String str) {
        Throwable th;
        Uri uri;
        Exception e;
        ContentValues contentValues = new ContentValues();
        Cursor cursor = null;
        r4 = null;
        Uri uri2 = null;
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id"}, "_data=? ", new String[]{str}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i = query.getInt(query.getColumnIndex("_id"));
                        uri2 = Uri.withAppendedPath(Uri.parse("content://media/external/file"), "" + i);
                    }
                    if (uri2 == null) {
                        C13479a.m54775e("ShareUtils", "queryNonMediaFileUriFromMediaStore URI query is null");
                        contentValues.put("_data", str);
                        uri2 = context.getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
                    }
                } catch (Exception e2) {
                    e = e2;
                    uri = null;
                    cursor = query;
                    try {
                        C13479a.m54761a("ShareUtils", e);
                        C13675f.m55497a(cursor);
                        return uri;
                    } catch (Throwable th2) {
                        th = th2;
                        C13675f.m55497a(cursor);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    C13675f.m55497a(cursor);
                    throw th;
                }
            }
            C13675f.m55497a(query);
            return uri2;
        } catch (Exception e3) {
            e = e3;
            uri = null;
            C13479a.m54761a("ShareUtils", e);
            C13675f.m55497a(cursor);
            return uri;
        }
    }

    /* renamed from: a */
    private static Uri m47258a(Context context, String str) {
        Throwable th;
        Uri uri;
        Exception e;
        ContentValues contentValues = new ContentValues();
        Cursor cursor = null;
        r3 = null;
        Uri uri2 = null;
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i = query.getInt(query.getColumnIndex("_id"));
                        uri2 = Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + i);
                    }
                    if (uri2 == null) {
                        C13479a.m54775e("ShareUtils", "queryImageFileUriFromMediaStore URI query is null");
                        contentValues.put("_data", str);
                        uri2 = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    }
                } catch (Exception e2) {
                    e = e2;
                    uri = null;
                    cursor = query;
                    try {
                        C13479a.m54761a("ShareUtils", e);
                        C13675f.m55497a(cursor);
                        return uri;
                    } catch (Throwable th2) {
                        th = th2;
                        C13675f.m55497a(cursor);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    C13675f.m55497a(cursor);
                    throw th;
                }
            }
            C13675f.m55497a(query);
            return uri2;
        } catch (Exception e3) {
            e = e3;
            uri = null;
            C13479a.m54761a("ShareUtils", e);
            C13675f.m55497a(cursor);
            return uri;
        }
    }

    /* renamed from: a */
    public static void m47260a(Context context, List<File> list, String str) {
        m47264b(context, list, str, -1);
    }

    /* renamed from: a */
    private static Uri m47257a(Context context, File file, int i) {
        Uri uri;
        Uri uri2 = null;
        if (context == null) {
            C13479a.m54775e("ShareUtils", "getFileContentUri context is null");
            return null;
        } else if (file == null || !file.exists()) {
            C13479a.m54775e("ShareUtils", "getFileContentUri file is null or not exists.");
            return null;
        } else if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        } else {
            String absolutePath = file.getAbsolutePath();
            if (i == 2) {
                uri2 = m47258a(context, absolutePath);
            } else if (i != 2) {
                uri2 = m47263b(context, absolutePath);
            }
            if (uri2 == null) {
                C13479a.m54775e("ShareUtils", "getFileContentUri URI force get is failure");
                uri = m47256a(context, file);
            } else {
                uri = uri2;
            }
            if (uri != null) {
                return uri;
            }
            C13479a.m54775e("ShareUtils", "getFileContentUri URI insert is failure");
            return m47259a(file);
        }
    }

    /* renamed from: b */
    public static void m47264b(Context context, List<File> list, String str, int i) {
        m47262a(context, list, str, i, 2);
    }

    /* renamed from: a */
    public static void m47261a(Context context, List<Uri> list, String str, int i) {
        boolean z;
        Uri uri;
        if (!(list == null || list.size() == 0)) {
            if (list.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            Intent intent = new Intent();
            if (z) {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
            } else {
                intent.setAction("android.intent.action.SEND");
            }
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setType("image/*");
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
            }
            intent.addFlags(268435456);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            if (z) {
                for (Uri uri2 : list) {
                    if (Build.VERSION.SDK_INT < 29) {
                        arrayList.add(C26310o.m95259a(context, new File(uri2.getPath())));
                    } else {
                        arrayList.add(uri2);
                    }
                }
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            } else {
                Uri uri3 = null;
                if (Build.VERSION.SDK_INT < 29) {
                    uri = C26310o.m95259a(context, new File(uri3.getPath()));
                } else {
                    uri = list.get(0);
                }
                intent.putExtra("android.intent.extra.STREAM", uri);
            }
            if (i != -1) {
                try {
                    if (context instanceof Activity) {
                        ((Activity) context).startActivityForResult(Intent.createChooser(intent, str), i);
                        return;
                    }
                } catch (Exception e) {
                    C13479a.m54761a("ShareUtils", e);
                    return;
                }
            }
            context.startActivity(Intent.createChooser(intent, str));
        }
    }
}
