package com.ss.android.lark.mail.impl.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.mail.impl.utils.d */
public class C43761d {

    /* renamed from: a */
    private static WeakReference<Resources> f111062a;

    /* renamed from: b */
    private static Context f111063b;

    /* renamed from: c */
    public static int m173472c(int i) {
        if (f111063b == null) {
            f111063b = C41816b.m166115a().mo150132b();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return f111063b.getColor(i);
        }
        return f111063b.getResources().getColor(i);
    }

    /* renamed from: a */
    public static String m173470a(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        String hexString = Integer.toHexString(Color.red(i));
        String hexString2 = Integer.toHexString(Color.green(i));
        String hexString3 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = "0" + hexString;
        }
        if (hexString2.length() == 1) {
            hexString2 = "0" + hexString2;
        }
        if (hexString3.length() == 1) {
            hexString3 = "0" + hexString3;
        }
        stringBuffer.append("#");
        stringBuffer.append(hexString);
        stringBuffer.append(hexString2);
        stringBuffer.append(hexString3);
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static int m173473d(int i) {
        Resources resources;
        try {
            WeakReference<Resources> weakReference = f111062a;
            if (weakReference == null) {
                resources = null;
            } else {
                resources = weakReference.get();
            }
            if (resources == null) {
                Log.m165389i("ColorUtil", "getLightModeColorValue new resources");
                Context b = C41816b.m166115a().mo150132b();
                Configuration configuration = new Configuration();
                configuration.fontScale = BitmapDescriptorFactory.HUE_RED;
                configuration.uiMode = (configuration.uiMode & -49) | 16;
                resources = b.createConfigurationContext(configuration).getResources();
                f111062a = new WeakReference<>(resources);
            }
            return resources.getColor(i);
        } catch (Exception e) {
            Log.m165384e("ColorUtil", "getLightModeColorValue", e);
            return 0;
        }
    }

    /* renamed from: b */
    public static String m173471b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = "0" + hexString;
        }
        if (hexString2.length() == 1) {
            hexString2 = "0" + hexString2;
        }
        if (hexString3.length() == 1) {
            hexString3 = "0" + hexString3;
        }
        if (hexString4.length() == 1) {
            hexString4 = "0" + hexString4;
        }
        stringBuffer.append("#");
        stringBuffer.append(hexString2);
        stringBuffer.append(hexString3);
        stringBuffer.append(hexString4);
        stringBuffer.append(hexString);
        return stringBuffer.toString();
    }
}
