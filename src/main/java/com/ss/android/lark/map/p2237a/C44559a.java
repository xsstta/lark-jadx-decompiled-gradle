package com.ss.android.lark.map.p2237a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.lark.location.p2146b.AbstractC41556a;
import com.ss.android.lark.location.p2146b.AbstractC41558b;
import com.ss.android.lark.location.p2146b.AbstractC41559c;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.map.MapModule;
import com.ss.android.lark.map.p2237a.p2238a.C44560a;
import com.ss.android.lark.map.p2237a.p2238a.C44561b;
import com.ss.android.lark.map.p2237a.p2238a.C44563c;
import com.ss.android.lark.map.p2237a.p2238a.C44565d;
import com.ss.android.lark.map.p2237a.p2238a.C44567e;
import com.ss.android.lark.map.p2237a.p2238a.C44575f;
import com.ss.android.lark.map.p2237a.p2238a.C44581g;
import com.ss.android.lark.map.p2237a.p2239b.C44587a;
import com.ss.android.lark.map.p2237a.p2239b.C44590c;
import com.ss.android.lark.map.p2237a.p2239b.C44593d;
import com.ss.android.lark.map.p2237a.p2239b.C44595e;
import com.ss.android.lark.map.p2237a.p2239b.C44600f;
import com.ss.android.lark.map.p2237a.p2239b.C44606g;

/* renamed from: com.ss.android.lark.map.a.a */
public class C44559a {
    /* renamed from: f */
    private static boolean m176796f() {
        return MapModule.getDependency().isFeatureGatingOn("lark.location.map.hms");
    }

    /* renamed from: b */
    public static AbstractC41559c m176792b() {
        if (m176797g()) {
            return new C44590c();
        }
        return new C44563c();
    }

    /* renamed from: c */
    public static AbstractC41561d m176793c() {
        if (m176797g()) {
            return new C44593d();
        }
        return new C44565d();
    }

    /* renamed from: d */
    public static AbstractC41562e m176794d() {
        if (m176797g()) {
            return new C44595e();
        }
        return new C44567e();
    }

    /* renamed from: e */
    public static AbstractC41569h m176795e() {
        if (m176797g()) {
            return new C44606g();
        }
        return new C44581g();
    }

    /* renamed from: h */
    private static boolean m176798h() {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals("huawei");
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC41558b m176791a() {
        if (m176797g()) {
            return new C44587a();
        }
        return new C44560a();
    }

    /* renamed from: g */
    private static boolean m176797g() {
        if (C44561b.m176808a(MapModule.getDependency().getContext()) || !m176798h()) {
            return false;
        }
        if (!m176796f()) {
            Log.m165389i("MapServiceFactory", "shouldUseHMSService feature gating is off.");
            return false;
        }
        Log.m165389i("MapServiceFactory", "shouldUseHMSService feature gating is on.");
        return true;
    }

    /* renamed from: a */
    public static AbstractC41556a m176790a(Context context) {
        if (m176797g()) {
            return new C44600f(context);
        }
        return new C44575f(context);
    }
}
