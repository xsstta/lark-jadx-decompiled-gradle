package com.bytedance.push.settings.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.push.settings.C20520j;
import com.ss.android.common.p1317a.C28446a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PushProvider extends ContentProvider {

    /* renamed from: a */
    public static String f50067a;

    /* renamed from: b */
    public static Uri f50068b;

    /* renamed from: c */
    private static UriMatcher f50069c;

    /* renamed from: d */
    private static volatile boolean f50070d;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    private static boolean m74732a() {
        if (!TextUtils.isEmpty(f50067a) && f50069c != null) {
            return false;
        }
        return true;
    }

    public boolean onCreate() {
        f50070d = true;
        if (f50069c != null) {
            return true;
        }
        try {
            m74735b(getContext());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m74733a(Context context) {
        if (f50070d || C28446a.m104268a(context)) {
            return true;
        }
        return false;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f50067a + ".item";
    }

    /* renamed from: b */
    private static void m74735b(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f50067a)) {
            f50067a = m74731a(context, PushProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f50067a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f50069c = uriMatcher;
            uriMatcher.addURI(f50067a, "*/*/*/*", 65536);
            f50068b = Uri.parse("content://" + f50067a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f50067a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    static synchronized Uri m74729a(Context context, C20525b bVar) {
        synchronized (PushProvider.class) {
            if (f50068b == null) {
                try {
                    m74735b(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            if (bVar == null) {
                return f50068b;
            }
            return bVar.mo69107b(f50068b);
        }
    }

    /* renamed from: a */
    private static String m74731a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return context.getPackageName() + ".push.settings";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        if (m74732a()) {
            return null;
        }
        if (f50069c.match(uri) == 65536) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                return null;
            }
            String str2 = pathSegments.get(0);
            try {
                AbstractC20537i a = C20520j.m74723a().mo69092a(getContext(), true, str2);
                SharedPreferences.Editor b = a.mo69109b();
                ArrayList<Runnable> arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value == null) {
                        b.remove(key);
                        str = null;
                    } else if (value instanceof String) {
                        if (!TextUtils.equals(a.mo69123a(key), (String) value)) {
                            b.putString(key, (String) value);
                            str = "string";
                        }
                    } else if (value instanceof Boolean) {
                        if (a.mo69131e(key) != ((Boolean) value).booleanValue()) {
                            b.putBoolean(key, ((Boolean) value).booleanValue());
                            str = "boolean";
                        }
                    } else if (value instanceof Long) {
                        if (a.mo69129c(key) != ((Long) value).longValue()) {
                            b.putLong(key, ((Long) value).longValue());
                            str = "long";
                        }
                    } else if (value instanceof Integer) {
                        if (a.mo69128b(key) != ((Integer) value).intValue()) {
                            b.putInt(key, ((Integer) value).intValue());
                            str = "integer";
                        }
                    } else if (!(value instanceof Float)) {
                        throw new IllegalArgumentException("Unsupported type " + uri);
                    } else if (a.mo69130d(key) != ((Float) value).floatValue()) {
                        b.putFloat(key, ((Float) value).floatValue());
                        str = "float";
                    }
                    if (str != null) {
                        arrayList.add(m74730a(getContext(), str2, key, str));
                    }
                }
                if (b == null) {
                    return null;
                }
                b.apply();
                for (Runnable runnable : arrayList) {
                    runnable.run();
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        AbstractC20532e a = C20533f.m74777a(str);
        if (a == null) {
            return null;
        }
        return a.mo69105a(getContext(), str2, bundle);
    }

    /* renamed from: a */
    static Runnable m74730a(final Context context, final String str, final String str2, final String str3) {
        return new Runnable() {
            /* class com.bytedance.push.settings.storage.PushProvider.RunnableC205231 */

            public void run() {
                Uri a = PushProvider.m74729a(context, new C20525b(str, str2, "val", str3));
                if (a != null) {
                    try {
                        context.getContentResolver().notifyChange(a, null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    /* renamed from: b */
    public static synchronized Uri m74734b(Context context, String str, String str2, String str3) {
        synchronized (PushProvider.class) {
            if (f50068b == null) {
                try {
                    m74735b(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return f50068b;
            }
            return new C20525b(str, str2, "val", str3).mo69107b(f50068b);
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C20525b a;
        Object obj;
        if (m74732a() || f50069c.match(uri) != 65536 || (a = C20525b.m74740a(uri)) == null || TextUtils.isEmpty(a.f50075a) || TextUtils.isEmpty(a.f50076b) || TextUtils.isEmpty(a.f50078d)) {
            return null;
        }
        AbstractC20537i a2 = C20520j.m74723a().mo69092a(getContext(), true, a.f50075a);
        String str3 = a.f50078d;
        str3.hashCode();
        char c = 65535;
        switch (str3.hashCode()) {
            case -891985903:
                if (str3.equals("string")) {
                    c = 0;
                    break;
                }
                break;
            case 3327612:
                if (str3.equals("long")) {
                    c = 1;
                    break;
                }
                break;
            case 64711720:
                if (str3.equals("boolean")) {
                    c = 2;
                    break;
                }
                break;
            case 97526364:
                if (str3.equals("float")) {
                    c = 3;
                    break;
                }
                break;
            case 1958052158:
                if (str3.equals("integer")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                obj = a2.mo69124a(a.f50076b, a.f50077c);
                break;
            case 1:
                obj = Long.valueOf(a2.mo69122a(a.f50076b, Long.parseLong(a.f50077c)));
                break;
            case 2:
                obj = Integer.valueOf(a2.mo69127a(a.f50076b, Boolean.parseBoolean(a.f50077c)) ? 1 : 0);
                break;
            case 3:
                obj = Float.valueOf(a2.mo69120a(a.f50076b, Float.parseFloat(a.f50077c)));
                break;
            case 4:
                obj = Integer.valueOf(a2.mo69121a(a.f50076b, Integer.parseInt(a.f50077c)));
                break;
            default:
                throw new IllegalArgumentException("unknown type");
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{a.f50076b});
        matrixCursor.newRow().add(obj);
        return matrixCursor;
    }
}
