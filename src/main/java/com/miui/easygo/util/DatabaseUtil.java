package com.miui.easygo.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.miui.easygo.sdk.module.EasyGoServer;

/* access modifiers changed from: package-private */
public class DatabaseUtil extends BaseUtil {
    private static final Uri EASYGO_SERVER_URI = Uri.parse("content://com.miui.easygo.easygoprovider/t_server");

    DatabaseUtil() {
    }

    protected static boolean isDbSupport(Context context) {
        boolean z;
        Cursor query = context.getContentResolver().query(EASYGO_SERVER_URI, null, "provide_function = \"\"", null, null);
        if (query == null) {
            z = false;
        } else {
            z = true;
        }
        if (query != null) {
            query.close();
        }
        return z;
    }

    private static EasyGoServer assembleServer(Cursor cursor) {
        EasyGoServer easyGoServer = new EasyGoServer();
        if (cursor == null) {
            Log.e("DatabaseUtil", "Cursor is null when assembleServer.");
            return easyGoServer;
        }
        Log.e("DatabaseUtil", "name = " + cursor.getString(cursor.getColumnIndex("name")));
        Log.e("DatabaseUtil", "provide_function = " + cursor.getString(cursor.getColumnIndex("provide_function")));
        Log.e("DatabaseUtil", "is_system_service = " + cursor.getString(cursor.getColumnIndex("is_system_service")));
        Log.e("DatabaseUtil", "data_schema = " + cursor.getString(cursor.getColumnIndex("data_schema")));
        Log.e("DatabaseUtil", "service_name = " + cursor.getString(cursor.getColumnIndex("service_name")));
        Log.e("DatabaseUtil", "service_version = " + cursor.getString(cursor.getColumnIndex("service_version")));
        easyGoServer.setName(cursor.getString(cursor.getColumnIndex("name")));
        easyGoServer.setProvideFunction(cursor.getString(cursor.getColumnIndex("provide_function")));
        easyGoServer.setIsSysService(cursor.getString(cursor.getColumnIndex("is_system_service")));
        easyGoServer.setDataSchema(cursor.getString(cursor.getColumnIndex("data_schema")));
        easyGoServer.setServiceName(cursor.getString(cursor.getColumnIndex("service_name")));
        easyGoServer.setServiceVersion(cursor.getString(cursor.getColumnIndex("service_version")));
        return easyGoServer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if ("1".equals(r9.getIsSysService()) != false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.miui.easygo.sdk.module.EasyGoServer queryServerInfo(android.content.Context r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.easygo.util.DatabaseUtil.queryServerInfo(android.content.Context, java.lang.String):com.miui.easygo.sdk.module.EasyGoServer");
    }
}
