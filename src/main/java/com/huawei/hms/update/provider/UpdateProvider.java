package com.huawei.hms.update.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.huawei.hms.availableupdate.C23482l;
import java.io.File;
import java.io.FileNotFoundException;

public class UpdateProvider extends ContentProvider {
    public static final String AUTHORITIES_SUFFIX = ".hms.update.provider";

    /* renamed from: a */
    public static final String[] f58940a = {"_display_name", "_size"};

    /* renamed from: b */
    public static C23482l f58941b = new C23482l();

    public boolean onCreate() {
        return true;
    }

    public String getType(Uri uri) {
        if (getContext() == null) {
            return "application/octet-stream";
        }
        f58941b.mo82162a(getContext().getApplicationContext());
        String name = f58941b.mo82159a(uri).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(lastIndexOf + 1));
            if (!TextUtils.isEmpty(mimeTypeFromExtension)) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    /* renamed from: a */
    public static int m86978a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: a */
    public static Object[] m86979a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    /* renamed from: a */
    public static String[] m86980a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static File getLocalFile(Context context, String str) {
        f58941b.mo82162a(context.getApplicationContext());
        return f58941b.mo82160a(str);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        f58941b.mo82162a(getContext().getApplicationContext());
        return ParcelFileDescriptor.open(f58941b.mo82159a(uri), m86978a(str));
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        f58941b.mo82162a(context.getApplicationContext());
        return f58941b.mo82158a(file, str);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        f58941b.mo82162a(getContext().getApplicationContext());
        return f58941b.mo82159a(uri).delete() ? 1 : 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        f58941b.mo82162a(getContext().getApplicationContext());
        File a = f58941b.mo82159a(uri);
        if (strArr == null) {
            strArr = f58940a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] a2 = m86980a(strArr3, i2);
        Object[] a3 = m86979a(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(a2, 1);
        matrixCursor.addRow(a3);
        return matrixCursor;
    }
}
