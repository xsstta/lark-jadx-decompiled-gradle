package com.bytedance.dr;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.dr.AbstractC4013i;
import com.bytedance.dr.C4019n;
import com.bytedance.dr.OpenDeviceIdentifierService;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.g */
public final class C4007g implements AbstractC4013i {

    /* renamed from: a */
    private static final AbstractC3997a<Boolean> f12158a = new AbstractC3997a<Boolean>() {
        /* class com.bytedance.dr.C4007g.C40081 */

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Boolean mo15706a(Object... objArr) {
            return Boolean.valueOf(C4005f.m16669a((Context) objArr[0], "com.huawei.hwid"));
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.dr.g$a */
    public static class C4010a extends AbstractC4013i.C4014a {

        /* renamed from: a */
        long f12159a;

        C4010a() {
        }
    }

    C4007g() {
    }

    @Override // com.bytedance.dr.AbstractC4013i
    /* renamed from: b */
    public boolean mo15738b(Context context) {
        return m16670a(context);
    }

    /* renamed from: a */
    static boolean m16670a(Context context) {
        if (context == null) {
            return false;
        }
        return f12158a.mo15707b(context).booleanValue();
    }

    /* renamed from: e */
    private static int m16671e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    private static Pair<String, Boolean> m16672f(Context context) {
        return (Pair) new C4019n(context, new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid"), new C4019n.AbstractC4021b<OpenDeviceIdentifierService, Pair<String, Boolean>>() {
            /* class com.bytedance.dr.C4007g.C40092 */

            /* renamed from: a */
            public OpenDeviceIdentifierService mo15745b(IBinder iBinder) {
                return OpenDeviceIdentifierService.Stub.asInterface(iBinder);
            }

            /* renamed from: a */
            public Pair<String, Boolean> mo15744a(OpenDeviceIdentifierService openDeviceIdentifierService) throws Exception {
                if (openDeviceIdentifierService == null) {
                    return null;
                }
                return new Pair<>(openDeviceIdentifierService.getOaid(), Boolean.valueOf(openDeviceIdentifierService.isOaidTrackLimited()));
            }
        }).mo15756a();
    }

    /* renamed from: c */
    public C4010a mo15740d(Context context) {
        C4010a aVar = new C4010a();
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid");
                String string2 = Settings.Global.getString(context.getContentResolver(), "pps_track_limit");
                if (!TextUtils.isEmpty(string)) {
                    aVar.f12173b = string;
                    aVar.f12174c = Boolean.parseBoolean(string2);
                    aVar.f12159a = 202003021704L;
                    return aVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        Pair<String, Boolean> f = m16672f(context);
        if (f != null) {
            aVar.f12173b = (String) f.first;
            aVar.f12174c = ((Boolean) f.second).booleanValue();
            aVar.f12159a = (long) m16671e(context);
        }
        return aVar;
    }
}
