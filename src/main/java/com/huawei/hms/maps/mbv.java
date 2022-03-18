package com.huawei.hms.maps;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mag;

public final class mbv {

    /* renamed from: a */
    private static Context f58652a = null;

    /* renamed from: b */
    private static Context f58653b = null;

    /* renamed from: c */
    private static mag f58654c = null;

    /* renamed from: d */
    private static boolean f58655d = true;

    /* renamed from: e */
    private static SharedPreferences f58656e;

    /* renamed from: a */
    public static mag m86514a(Context context) {
        Preconditions.checkNotNull(context);
        mag mag = f58654c;
        if (mag != null) {
            return mag;
        }
        mcq.m86887c("MapCreator", "Making Creator dynamically");
        mag mag2 = null;
        try {
            Context b = m86517b(context);
            f58653b = b;
            if (b == null) {
                mcq.m86889e("MapCreator", "getRemoteMapContext failed");
                return null;
            }
            Object newInstance = b.getClassLoader().loadClass("com.huawei.hms.maps.CreatorImpl").newInstance();
            if (newInstance instanceof IBinder) {
                mag a = mag.maa.m86203a((IBinder) newInstance);
                a.mo83890a(ObjectWrapper.wrap(m86517b(context).getResources()));
                mag2 = a;
            }
            f58654c = mag2;
            return mag2;
        } catch (Throwable unused) {
            mcq.m86889e("MapCreator", "loadClass failed");
            f58652a = null;
            mco.f58679a = null;
            return null;
        }
    }

    /* renamed from: a */
    public static void m86515a() {
        f58652a = null;
        f58653b = null;
        f58654c = null;
    }

    /* renamed from: a */
    public static void m86516a(boolean z) {
        f58655d = z;
    }

    /* renamed from: b */
    public static Context m86517b(Context context) {
        MapClientIdentify.m86145a(context);
        Context context2 = f58652a;
        if (context2 != null) {
            return context2;
        }
        Context d = m86520d(context);
        f58652a = d;
        return d;
    }

    /* renamed from: b */
    public static void m86518b() {
        SharedPreferences sharedPreferences = f58656e;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("providerUpdateFlag", true).apply();
        }
    }

    /* renamed from: c */
    public static SharedPreferences m86519c(Context context) {
        if (f58656e == null) {
            f58656e = context.getSharedPreferences("com.huawei.hmsmap.updateFlag", 0);
        }
        return f58656e;
    }

    /* renamed from: d */
    private static Context m86520d(Context context) {
        try {
            mco.m86877a("huawei_module_maps", context);
            if (mco.f58679a == null) {
                mco.f58679a = DynamicModule.load(context, DynamicModule.PREFER_HIGHEST_OR_REMOTE_VERSION, "huawei_module_maps");
            }
            if (mco.f58679a != null) {
                return mco.f58679a.getModuleContext();
            }
            return null;
        } catch (DynamicModule.LoadingException e) {
            mcq.m86889e("MapCreator", "Loading mapRoute dynamically failed, exception is ".concat(String.valueOf(e)));
            Bundle bundle = e.getBundle();
            if (bundle == null || bundle.getInt("errcode") != 2) {
                return null;
            }
            Intent intent = (Intent) bundle.getParcelable(CommonCode.MapKey.HAS_RESOLUTION);
            if (intent == null) {
                mcq.m86889e("MapCreator", "null intent, please check it.");
                return null;
            }
            mcq.m86889e("MapCreator", "get intent successfully.");
            if (!f58655d) {
                return null;
            }
            try {
                context.startActivity(intent);
                f58655d = false;
                return null;
            } catch (ActivityNotFoundException unused) {
                mcq.m86889e("MapCreator", "startActivity error ActivityNotFound.");
                return null;
            }
        }
    }
}
