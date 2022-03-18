package com.ss.android.lark.authorization;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.larksuite.framework.utils.C26308n;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.android.lark.authorization.b */
public class C29405b {

    /* renamed from: a */
    private static Boolean f73512a;

    /* renamed from: b */
    private static Boolean f73513b = false;

    /* renamed from: b */
    public static void m108178b() {
        f73512a = true;
    }

    /* renamed from: a */
    public static boolean m108176a() {
        Boolean bool = f73512a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C29403a.m108165a().mo104168b()) {
            f73512a = true;
            Log.i("Authorizationer", "isAuthorized true: isLarkEnv");
            return true;
        }
        Context a = C29403a.m108165a().mo104165a();
        try {
            if (new File(C26308n.m95258d(a) + "/" + "authorizationer").exists()) {
                Log.i("Authorizationer", "isAuthorized true: File");
                f73512a = true;
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (m108179b(a)) {
            m108174a(a);
            f73512a = true;
            return true;
        } else if (!PackageChannelManager.isKABuildPackage(a) || f73513b.booleanValue()) {
            return false;
        } else {
            f73513b = true;
            if (m108177a("lark.authorization.splash.popup_window")) {
                return false;
            }
            m108174a(a);
            f73512a = true;
            return true;
        }
    }

    /* renamed from: a */
    public static void m108174a(Context context) {
        try {
            new File(C26308n.m95258d(context) + "/" + "authorizationer").createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m108177a(String str) {
        String readLine;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            InputStream open = LarkContext.getApplication().getAssets().open("lark_settings");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            do {
                readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine) && readLine.contains(str)) {
                    bufferedReader.close();
                    open.close();
                    Log.i("Authorizationer", "read lark_setting cast: " + (System.currentTimeMillis() - currentTimeMillis));
                    return true;
                }
            } while (readLine != null);
            return false;
        } catch (Exception e) {
            Log.e("Authorizationer", "read lark_settings failed, error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m108179b(Context context) {
        File file = new File(C26308n.m95258d(context) + "/" + "first_open_flag");
        if (!(!file.exists())) {
            return false;
        }
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new File(context.getFilesDir().getAbsolutePath() + "/mmkv").exists();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        if (r7.startsWith(r2 + ":") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x002f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m108175a(android.content.Context r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.authorization.C29405b.m108175a(android.content.Context, boolean):void");
    }
}
