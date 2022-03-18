package com.ss.android.lark.platform.dynamicconfig;

import android.text.TextUtils;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.gecko.C38544a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.platform.dynamicconfig.a */
public class C51797a {

    /* renamed from: a */
    private static C51797a f128740a = new C51797a();

    /* renamed from: a */
    public static C51797a m200805a() {
        return f128740a;
    }

    /* renamed from: b */
    public String mo177921b() {
        String a = C38544a.m151996a().mo141230a(DynamicConfigModule.m145550a().getContext(), UserSP.getInstance().getString("ka_resource_tid"));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        String string = UserSP.getInstance().getString("ka_resource_path");
        String string2 = UserSP.getInstance().getString("ka_hybrid_resource");
        if (!TextUtils.isEmpty(string) && TextUtils.equals(string, a)) {
            return string2;
        }
        String b = m200806b(a);
        UserSP.getInstance().putString("ka_resource_path", a);
        UserSP.getInstance().putString("ka_hybrid_resource", b);
        Log.m165379d("HybridDynamicResourceProvider", "HYBRID_MATERIAL " + b);
        return b;
    }

    /* renamed from: a */
    public void mo177920a(String str) {
        UserSP.getInstance().putString("ka_resource_tid", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051 A[SYNTHETIC, Splitter:B:34:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m200806b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "HybridDynamicResourceProvider"
            r1 = 0
            java.lang.String r2 = "assets/hybrid_material"
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003b, Exception -> 0x0030, all -> 0x002e }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003b, Exception -> 0x0030, all -> 0x002e }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003b, Exception -> 0x0030, all -> 0x002e }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003b, Exception -> 0x0030, all -> 0x002e }
            java.io.InputStream r6 = r2.getInputStream(r3)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x003b, Exception -> 0x0030, all -> 0x002e }
            java.lang.String r2 = "load hybrid material from remote"
            com.ss.android.lark.log.Log.m165389i(r0, r2)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x002c, Exception -> 0x002a }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x002c, Exception -> 0x002a }
            byte[] r3 = com.larksuite.framework.utils.C26257ai.m95014a(r6)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x002c, Exception -> 0x002a }
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x002c, Exception -> 0x002a }
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x002c, Exception -> 0x002a }
            if (r6 == 0) goto L_0x0028
            r6.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r1 = r2
            goto L_0x004c
        L_0x002a:
            r2 = move-exception
            goto L_0x0032
        L_0x002c:
            r2 = move-exception
            goto L_0x003d
        L_0x002e:
            r0 = move-exception
            goto L_0x004f
        L_0x0030:
            r2 = move-exception
            r6 = r1
        L_0x0032:
            com.ss.android.lark.log.Log.m165391i(r0, r2)     // Catch:{ all -> 0x004d }
            if (r6 == 0) goto L_0x004c
        L_0x0037:
            r6.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004c
        L_0x003b:
            r2 = move-exception
            r6 = r1
        L_0x003d:
            com.ss.android.lark.log.Log.m165391i(r0, r2)
            if (r6 == 0) goto L_0x004c
            goto L_0x0037
        L_0x0043:
            r6 = r1
        L_0x0044:
            java.lang.String r2 = "default package without hybrid material file"
            com.ss.android.lark.log.Log.m165389i(r0, r2)
            if (r6 == 0) goto L_0x004c
            goto L_0x0037
        L_0x004c:
            return r1
        L_0x004d:
            r0 = move-exception
            r1 = r6
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.dynamicconfig.C51797a.m200806b(java.lang.String):java.lang.String");
    }
}
