package com.ss.android.lark.statistics.helper;

import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010W\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010Xj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001`YJ(\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010(R\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010(R\u001e\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b5\u00107\"\u0004\b8\u00109R\u001e\u0010;\u001a\u0004\u0018\u000106X\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001e\u0010=\u001a\u0004\u0018\u000106X\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b=\u00107\"\u0004\b>\u00109R\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010(R\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010(R\u001c\u0010E\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010(R\u001c\u0010H\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010(R\u001c\u0010K\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010(R\u001c\u0010N\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010(R\u001c\u0010Q\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010(R\u001c\u0010T\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010(¨\u0006`"}, d2 = {"Lcom/ss/android/lark/statistics/helper/CustomHitPointHeaderHolder;", "", "()V", "DEFAULT_VALUE", "", "getDEFAULT_VALUE", "()Ljava/lang/String;", "KEY_APP_FULL_VERSION", "getKEY_APP_FULL_VERSION", "KEY_DARK_MODE", "getKEY_DARK_MODE", "KEY_HEADER_DEVICE_ID", "getKEY_HEADER_DEVICE_ID", "KEY_HEADER_USER_UNIQUE_ID", "getKEY_HEADER_USER_UNIQUE_ID", "KEY_IS_APP_64", "getKEY_IS_APP_64", "KEY_IS_DEVICE_64", "getKEY_IS_DEVICE_64", "KEY_IS_LOGIN", "getKEY_IS_LOGIN", "KEY_LARK_USER_ID", "getKEY_LARK_USER_ID", "KEY_LKP", "getKEY_LKP", "KEY_PLATFORM", "getKEY_PLATFORM", "KEY_ROM_INCREMENTAL_VERSION", "getKEY_ROM_INCREMENTAL_VERSION", "KEY_ROM_VERSION", "getKEY_ROM_VERSION", "KEY_SUB_PLATFORM", "getKEY_SUB_PLATFORM", "KEY_TENANT_ID", "getKEY_TENANT_ID", "TAG", "getTAG", "appFullVersion", "getAppFullVersion", "setAppFullVersion", "(Ljava/lang/String;)V", "checkHeaderKey", "", "getCheckHeaderKey", "()Ljava/util/List;", "setCheckHeaderKey", "(Ljava/util/List;)V", "darkMode", "getDarkMode", "setDarkMode", "deviceId", "getDeviceId", "setDeviceId", "isApp64", "", "()Ljava/lang/Boolean;", "setApp64", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isDevice64", "setDevice64", "isLogin", "setLogin", "larkUserId", "getLarkUserId", "setLarkUserId", "lkp", "getLkp", "setLkp", CustomHitPointHeaderHolder.f135730k, "getPlatform", "setPlatform", "romBaseVersion", "getRomBaseVersion", "setRomBaseVersion", "romIncrementalVersion", "getRomIncrementalVersion", "setRomIncrementalVersion", "subPlatform", "getSubPlatform", "setSubPlatform", "tenantId", "getTenantId", "setTenantId", "userUniqueId", "getUserUniqueId", "setUserUniqueId", "createCustomHitPointHeader", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "reset", "", "did", "uid", "tid", "appVersion", "statistics_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.statistics.l.a */
public final class CustomHitPointHeaderHolder {

    /* renamed from: A */
    private static String f135714A = "others";

    /* renamed from: B */
    private static Boolean f135715B = false;

    /* renamed from: C */
    private static String f135716C = "";

    /* renamed from: D */
    private static Boolean f135717D = false;

    /* renamed from: E */
    private static Boolean f135718E = false;

    /* renamed from: F */
    private static String f135719F = f135722c;

    /* renamed from: a */
    public static final CustomHitPointHeaderHolder f135720a = new CustomHitPointHeaderHolder();

    /* renamed from: b */
    private static final String f135721b = f135721b;

    /* renamed from: c */
    private static final String f135722c = f135722c;

    /* renamed from: d */
    private static final String f135723d = f135723d;

    /* renamed from: e */
    private static final String f135724e = f135724e;

    /* renamed from: f */
    private static final String f135725f = f135725f;

    /* renamed from: g */
    private static final String f135726g = f135726g;

    /* renamed from: h */
    private static final String f135727h = f135727h;

    /* renamed from: i */
    private static final String f135728i = f135728i;

    /* renamed from: j */
    private static final String f135729j = f135729j;

    /* renamed from: k */
    private static final String f135730k = f135730k;

    /* renamed from: l */
    private static final String f135731l = f135731l;

    /* renamed from: m */
    private static final String f135732m = f135732m;

    /* renamed from: n */
    private static final String f135733n = f135733n;

    /* renamed from: o */
    private static final String f135734o = f135734o;

    /* renamed from: p */
    private static final String f135735p = f135735p;

    /* renamed from: q */
    private static final String f135736q = f135736q;

    /* renamed from: r */
    private static List<String> f135737r;

    /* renamed from: s */
    private static String f135738s = "";

    /* renamed from: t */
    private static String f135739t = "";

    /* renamed from: u */
    private static String f135740u = "";

    /* renamed from: v */
    private static String f135741v = "";

    /* renamed from: w */
    private static String f135742w = "";

    /* renamed from: x */
    private static String f135743x = "";

    /* renamed from: y */
    private static String f135744y = "0";

    /* renamed from: z */
    private static String f135745z = "lark";

    private CustomHitPointHeaderHolder() {
    }

    /* renamed from: a */
    public final String mo187484a() {
        return f135738s;
    }

    /* renamed from: b */
    public final String mo187487b() {
        return f135719F;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f135737r = arrayList;
        arrayList.add(f135723d);
        f135737r.add(f135724e);
        f135737r.add(f135725f);
        f135737r.add(f135726g);
        f135737r.add(f135729j);
    }

    /* renamed from: c */
    public final HashMap<String, Object> mo187490c() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        boolean z5;
        String str5;
        boolean z6;
        String str6;
        boolean z7;
        String str7;
        String str8;
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = hashMap;
        String str9 = f135723d;
        String str10 = f135738s;
        boolean z8 = false;
        if (str10 == null || str10.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = f135722c;
        } else {
            str = f135738s;
        }
        hashMap2.put(str9, str);
        String str11 = f135725f;
        String str12 = f135740u;
        if (str12 == null || str12.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str2 = f135722c;
        } else {
            str2 = f135740u;
        }
        hashMap2.put(str11, str2);
        String str13 = f135726g;
        String str14 = f135741v;
        if (str14 == null || str14.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            str3 = f135722c;
        } else {
            str3 = f135741v;
        }
        hashMap2.put(str13, str3);
        String str15 = f135727h;
        String str16 = f135742w;
        if (str16 == null || str16.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            str4 = f135722c;
        } else {
            str4 = f135742w;
        }
        hashMap2.put(str15, str4);
        String str17 = f135728i;
        String str18 = f135743x;
        if (str18 == null || str18.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            str5 = f135722c;
        } else {
            str5 = f135743x;
        }
        hashMap2.put(str17, str5);
        String str19 = f135729j;
        String str20 = f135744y;
        if (str20 == null || str20.length() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            str6 = f135722c;
        } else {
            str6 = f135744y;
        }
        hashMap2.put(str19, str6);
        hashMap2.put(f135730k, f135745z);
        hashMap2.put(f135731l, f135714A);
        hashMap2.put(f135732m, f135715B);
        String str21 = f135733n;
        String str22 = f135716C;
        if (str22 == null || str22.length() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            str7 = f135722c;
        } else {
            str7 = f135716C;
        }
        hashMap2.put(str21, str7);
        hashMap2.put(f135734o, f135717D);
        hashMap2.put(f135735p, f135718E);
        String str23 = f135736q;
        String str24 = f135719F;
        if (str24 == null || str24.length() == 0) {
            z8 = true;
        }
        if (z8) {
            str8 = f135722c;
        } else {
            str8 = f135719F;
        }
        hashMap2.put(str23, str8);
        String str25 = f135721b;
        Log.m165389i(str25, "createCustomHitPointHeader: " + hashMap);
        return hashMap;
    }

    /* renamed from: c */
    public final void mo187491c(Boolean bool) {
        f135718E = bool;
    }

    /* renamed from: d */
    public final void mo187493d(String str) {
        f135741v = str;
    }

    /* renamed from: e */
    public final void mo187494e(String str) {
        f135742w = str;
    }

    /* renamed from: f */
    public final void mo187495f(String str) {
        f135743x = str;
    }

    /* renamed from: g */
    public final void mo187496g(String str) {
        f135744y = str;
    }

    /* renamed from: h */
    public final void mo187497h(String str) {
        f135716C = str;
    }

    /* renamed from: i */
    public final void mo187498i(String str) {
        f135719F = str;
    }

    /* renamed from: a */
    public final void mo187485a(Boolean bool) {
        f135715B = bool;
    }

    /* renamed from: b */
    public final void mo187488b(Boolean bool) {
        f135717D = bool;
    }

    /* renamed from: c */
    public final void mo187492c(String str) {
        f135740u = str;
    }

    /* renamed from: a */
    public final void mo187486a(String str) {
        f135738s = str;
    }

    /* renamed from: b */
    public final void mo187489b(String str) {
        f135739t = str;
    }
}
