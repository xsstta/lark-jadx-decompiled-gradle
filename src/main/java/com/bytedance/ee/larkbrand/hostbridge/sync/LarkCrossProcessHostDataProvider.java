package com.bytedance.ee.larkbrand.hostbridge.sync;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import java.util.Iterator;
import org.json.JSONObject;

public class LarkCrossProcessHostDataProvider extends ContentProvider {

    /* renamed from: a */
    public static String f34792a;

    /* renamed from: b */
    public static Uri f34793b;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        if (f34793b == null) {
            try {
                m53675a(getContext());
            } catch (Exception e) {
                AppBrandLogger.m52829e("CrossProcessHostDataProvider", "", e);
                return false;
            }
        }
        return true;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f34792a + ".item";
    }

    /* renamed from: a */
    private Cursor m53673a(Uri uri) {
        AbstractC67571b a;
        Iterator<String> keys;
        try {
            String queryParameter = uri.getQueryParameter("transferDataInner");
            if (queryParameter == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(queryParameter);
            String optString = jSONObject.optString("ma_callType");
            JSONObject optJSONObject = jSONObject.optJSONObject("ma_callData");
            if (optString == null || (a = C13120g.m53718a().mo49171a(optString)) == null) {
                return null;
            }
            CrossProcessDataEntity.C67574a a2 = CrossProcessDataEntity.C67574a.m263013a();
            if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    a2.mo234760a(next, optJSONObject.opt(next));
                }
            }
            CrossProcessDataEntity a3 = a.mo49138a(a2.mo234763b());
            if (a3 == null) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"CALL_RESULT"});
            matrixCursor.newRow();
            matrixCursor.setExtras(a3.mo234739a());
            return matrixCursor;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "CrossProcessHostDataProvider", e.getStackTrace());
            return null;
        }
    }

    /* renamed from: a */
    private static void m53675a(Context context) throws IllegalStateException {
        f34792a = context.getApplicationContext().getPackageName() + ".appbrand";
        f34793b = Uri.parse("content://" + f34792a);
    }

    /* renamed from: a */
    public static synchronized Uri m53674a(Context context, String str) {
        Uri build;
        synchronized (LarkCrossProcessHostDataProvider.class) {
            if (f34793b == null) {
                try {
                    m53675a(context);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("CrossProcessHostDataProvider", "init", e);
                    return null;
                }
            }
            build = f34793b.buildUpon().appendQueryParameter("transferDataInner", str).build();
        }
        return build;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return m53673a(uri);
    }
}
