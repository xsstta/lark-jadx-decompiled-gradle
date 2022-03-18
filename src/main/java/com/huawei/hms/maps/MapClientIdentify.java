package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class MapClientIdentify {

    /* renamed from: a */
    private static Context f58518a;

    /* renamed from: b */
    private static String f58519b;

    /* renamed from: c */
    private static String f58520c;

    /* renamed from: d */
    private static long f58521d;

    /* renamed from: e */
    private mal f58522e;

    /* renamed from: a */
    public static long m86142a() {
        return f58521d;
    }

    /* renamed from: a */
    private static String m86143a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
            if (digest == null) {
                return null;
            }
            int length = digest.length;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < length; i++) {
                stringBuffer.append((digest[i] & 255) < 16 ? "0" + Integer.toHexString(digest[i] & 255) : Integer.toHexString(digest[i] & 255));
            }
            return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
        } catch (NoSuchAlgorithmException unused) {
            mcq.m86889e("MapClientIdentify", "NoSuchAlgorithmException");
            return "";
        }
    }

    /* renamed from: a */
    public static void m86144a(long j) {
        f58521d = j;
    }

    /* renamed from: a */
    public static void m86145a(Context context) {
        f58518a = context;
    }

    /* renamed from: a */
    public static void m86146a(String str) {
        f58519b = str;
    }

    /* renamed from: a */
    private static byte[] m86147a(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            mcq.m86889e("HiPkgSignManager", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 64)) == null)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            mcq.m86889e("HiPkgSignManager", "PackageManager.NameNotFoundException : ");
        }
        return new byte[0];
    }

    /* renamed from: b */
    public static Context m86148b() {
        return f58518a;
    }

    /* renamed from: b */
    private static String m86149b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            mcq.m86889e("MapClientIdentify", "In getAppName, Failed to get app name.");
            return "";
        }
    }

    /* renamed from: b */
    public static void m86150b(String str) {
        f58520c = str;
    }

    public static String getApiKey() {
        return f58519b;
    }

    public static String getAppId() {
        return f58520c;
    }

    /* renamed from: a */
    public final boolean mo83714a(Context context, mag mag) {
        mcq.m86886b("MapClientIdentify", "sdk start regestIdentity to provider ");
        if (this.f58522e != null) {
            mcq.m86886b("MapClientIdentify", "already invoked.");
            return true;
        } else if (mag == null) {
            mcq.m86886b("MapClientIdentify", "creator is null.");
            return false;
        } else {
            String packageName = context.getApplicationContext().getPackageName();
            String b = m86149b(context, packageName);
            String str = "";
            if (str.equals(f58520c)) {
                mcq.m86889e("MapClientIdentify", "AppId is null. Please check if agconnect-services.json file is is added in app project.");
            }
            byte[] a = m86147a(context, packageName);
            if (a != null && a.length > 0) {
                str = m86143a(a);
            }
            mbx mbx = new mbx();
            mbx.f58657a = f58520c;
            mbx.f58658b = packageName;
            mbx.f58659c = b;
            mbx.f58660d = str;
            mbx.f58661e = f58519b;
            mbx.f58662f = f58521d;
            try {
                mal b2 = mag.mo83891b(ObjectWrapper.wrap(mbv.m86517b(context)));
                this.f58522e = b2;
                b2.mo83973a(mbx);
                mcq.m86886b("MapClientIdentify", "Identity param regestToProvier sucess");
                return true;
            } catch (RemoteException unused) {
                mcq.m86889e("MapClientIdentify", "regestIdentity RemoteException");
                return false;
            }
        }
    }
}
