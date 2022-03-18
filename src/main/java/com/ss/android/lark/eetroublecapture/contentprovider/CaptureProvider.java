package com.ss.android.lark.eetroublecapture.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.ss.android.lark.eetroublebase.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CaptureProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f95059a = "CaptureProvider";

    /* renamed from: b */
    private C36975a f95060b;

    /* renamed from: c */
    private Map<String, Map<String, String>> f95061c = new ConcurrentHashMap();

    /* renamed from: a */
    private Object[] m145965a(String str, String str2, String str3) {
        return new Object[]{str, str2, str3};
    }

    public boolean onCreate() {
        this.f95060b = new C36975a(getContext());
        return true;
    }

    public String getType(Uri uri) {
        return this.f95060b.mo136482c();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        String str2;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() > 1) {
            str = pathSegments.get(1);
        } else {
            str = null;
        }
        if (pathSegments.size() > 2) {
            str2 = pathSegments.get(2);
        } else {
            str2 = null;
        }
        String asString = contentValues.getAsString("COLUMN_VALUE");
        if (str == null || str2 == null) {
            throw new UnsupportedOperationException("Unknown uri: " + uri);
        }
        Map<String, String> map = this.f95061c.get(str);
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.f95061c.put(str, map);
        }
        map.put(str2, asString);
        getContext().getContentResolver().notifyChange(uri, null);
        return uri;
    }

    /* renamed from: a */
    private Cursor m145964a(String str, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"COLUMN_MODULE", "COLUMN_KEY", "COLUMN_VALUE"});
        if (str != null) {
            Map<String, String> map = this.f95061c.get(str);
            if (map == null) {
                return matrixCursor;
            }
            if (str2 != null) {
                matrixCursor.addRow(m145965a(str, str2, map.get(str2)));
                return matrixCursor;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                matrixCursor.addRow(m145965a(str, entry.getKey(), entry.getValue()));
            }
            return matrixCursor;
        }
        for (Map.Entry<String, Map<String, String>> entry2 : this.f95061c.entrySet()) {
            String key = entry2.getKey();
            for (Map.Entry<String, String> entry3 : entry2.getValue().entrySet()) {
                matrixCursor.addRow(m145965a(key, entry3.getKey(), entry3.getValue()));
            }
        }
        return matrixCursor;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        String str2;
        String str3;
        int i = 0;
        try {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() > 1) {
                str2 = pathSegments.get(1);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                i = this.f95061c.size();
                this.f95061c.clear();
                return i;
            }
            Map<String, String> map = this.f95061c.get(str2);
            if (map == null) {
                return i;
            }
            if (pathSegments.size() > 2) {
                str3 = pathSegments.get(2);
            } else {
                str3 = null;
            }
            if (str3 == null) {
                int size = map.size();
                map.clear();
                if (size > 0) {
                    getContext().getContentResolver().notifyChange(uri, null);
                }
                return size;
            }
            if (map.remove(str3) != null) {
                i = 1;
            }
            if (i > 0) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
            return i;
        } finally {
            if (i > 0) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Unknown uri: " + uri);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        List<String> pathSegments = uri.getPathSegments();
        String str4 = null;
        if (pathSegments.size() > 1) {
            str3 = pathSegments.get(1);
        } else {
            str3 = null;
        }
        if (pathSegments.size() > 2) {
            str4 = pathSegments.get(2);
        }
        Cursor a = m145964a(str3, str4);
        if (a != null) {
            try {
                a.setNotificationUri(getContext().getContentResolver(), uri);
            } catch (Exception e) {
                Log.m145906a(f95059a, e);
            }
        }
        return a;
    }
}
