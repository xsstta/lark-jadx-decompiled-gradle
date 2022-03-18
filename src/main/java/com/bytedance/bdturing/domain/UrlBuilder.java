package com.bytedance.bdturing.domain;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import com.bytedance.bdturing.BdTuringConfig;
import com.bytedance.bdturing.C3520a;
import com.bytedance.bdturing.LogUtil;
import com.bytedance.bdturing.p209e.C3542b;
import com.bytedance.bdturing.setting.SettingsManager;
import com.bytedance.bdturing.twiceverify.C3582c;
import com.bytedance.bdturing.utils.Consts;
import com.huawei.hms.adapter.internal.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bJ$\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/bdturing/domain/UrlBuilder;", "", "()V", "TAG", "", "appendCommon", "", "activity", "Landroid/app/Activity;", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "createBuilder", "verifyType", "", "serviceType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.a.b */
public final class UrlBuilder {

    /* renamed from: a */
    public static final UrlBuilder f11146a = new UrlBuilder();

    private UrlBuilder() {
    }

    /* renamed from: a */
    public final void mo14292a(Activity activity, StringBuilder sb) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String e;
        BdTuringConfig.RegionType b;
        Intrinsics.checkParameterIsNotNull(sb, "queryBuilder");
        C3520a a = C3520a.m14831a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BdTuring.getInstance()");
        BdTuringConfig c = a.mo14275c();
        String str14 = null;
        if (c != null) {
            str = c.mo14214c();
        } else {
            str = null;
        }
        StringBuilder a2 = C3542b.m14904a(sb, "aid", str);
        if (c != null) {
            str2 = c.mo14217f();
        } else {
            str2 = null;
        }
        StringBuilder a3 = C3542b.m14904a(a2, "lang", str2);
        if (c != null) {
            str3 = c.mo14215d();
        } else {
            str3 = null;
        }
        StringBuilder a4 = C3542b.m14904a(a3, "app_name", str3);
        C3520a a5 = C3520a.m14831a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "BdTuring.getInstance()");
        BdTuringConfig c2 = a5.mo14275c();
        if (c2 != null) {
            str4 = c2.mo14228q();
        } else {
            str4 = null;
        }
        StringBuilder a6 = C3542b.m14904a(a4, "locale", str4);
        if (c != null) {
            str5 = c.mo14220i();
        } else {
            str5 = null;
        }
        StringBuilder a7 = C3542b.m14904a(a6, "ch", str5);
        if (c != null) {
            str6 = c.mo14220i();
        } else {
            str6 = null;
        }
        StringBuilder a8 = C3542b.m14904a(a7, "channel", str6);
        if (c != null) {
            str7 = c.mo14219h();
        } else {
            str7 = null;
        }
        StringBuilder a9 = C3542b.m14904a(a8, "app_key", str7);
        if (c != null) {
            str8 = c.mo14225n();
        } else {
            str8 = null;
        }
        StringBuilder a10 = C3542b.m14904a(a9, "iid", str8);
        if (c != null) {
            str9 = c.mo14216e();
        } else {
            str9 = null;
        }
        StringBuilder a11 = C3542b.m14904a(a10, "vc", str9);
        if (c != null) {
            str10 = c.mo14216e();
        } else {
            str10 = null;
        }
        StringBuilder a12 = C3542b.m14904a(a11, "app_verison", str10);
        if (c != null) {
            str11 = c.mo14226o();
        } else {
            str11 = null;
        }
        StringBuilder a13 = C3542b.m14904a(a12, "did", str11);
        if (c != null) {
            str12 = c.mo14227p();
        } else {
            str12 = null;
        }
        StringBuilder a14 = C3542b.m14904a(a13, "session_id", str12);
        if (c == null || (b = c.mo14210b()) == null) {
            str13 = null;
        } else {
            str13 = b.getName();
        }
        StringBuilder a15 = C3542b.m14904a(C3542b.m14904a(C3542b.m14904a(C3542b.m14903a(C3542b.m14904a(C3542b.m14904a(C3542b.m14903a(C3542b.m14903a(C3542b.m14903a(C3542b.m14904a(a14, "region", str13), "use_native_report", SettingsManager.f11297a.mo14399a() ? 1 : 0), "use_jsb_request", SettingsManager.f11297a.mo14402b() ? 1 : 0), "orientation", C3542b.m14900a(activity)), CommonCode.MapKey.HAS_RESOLUTION, C3542b.m14907b(activity)), "sdk_version", "2.2.2.i18n"), "os_version", Consts.f11186c), "device_brand", Consts.f11184a), "device_model", Consts.f11185b), "os_name", "Android");
        if (!(c == null || (e = c.mo14216e()) == null)) {
            str14 = StringsKt.replace$default(e, ".", "", false, 4, (Object) null);
        }
        C3542b.m14903a(C3542b.m14904a(C3542b.m14904a(C3542b.m14904a(a15, "version_code", str14), "device_type", Consts.f11185b), "device_platform", "Android"), "os_type", 0);
        if (SettingsManager.f11297a.mo14404c()) {
            C3542b.m14903a(sb, "mock", 1);
        }
    }

    /* renamed from: a */
    public final StringBuilder mo14291a(int i, String str, Activity activity) {
        Pair<String, String> pair;
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "serviceType");
        String a = SettingsManager.f11297a.mo14396a(str);
        String b = SettingsManager.f11297a.mo14401b(str);
        boolean z = true;
        if (LogUtil.m14896a()) {
            C3520a a2 = C3520a.m14831a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "BdTuring.getInstance()");
            BdTuringConfig c = a2.mo14275c();
            String str3 = null;
            if (c != null) {
                pair = c.mo14205a(2);
            } else {
                pair = null;
            }
            if (pair != null) {
                str2 = (String) pair.first;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (pair == null) {
                    Intrinsics.throwNpe();
                }
                a = (String) pair.first;
            }
            if (pair != null) {
                str3 = (String) pair.first;
            }
            if (!TextUtils.isEmpty(str3)) {
                if (pair == null) {
                    Intrinsics.throwNpe();
                }
                b = (String) pair.second;
            }
            if (activity != null) {
                Toast.makeText(activity, "url = " + a + ", verifyHost = " + b, 1).show();
            }
        }
        if (Intrinsics.areEqual(str, "twice_verify")) {
            C3582c a3 = C3582c.m15126a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "TwiceVerifyManager.getInstance()");
            b = a3.mo14435c().mo14430b();
            if (a != null) {
                if (a.length() != 0) {
                    z = false;
                }
                if (!z) {
                    a = b + a;
                }
            }
            a = b;
        }
        StringBuilder b2 = C3542b.m14908b(new StringBuilder(Intrinsics.stringPlus(a, "?")), "verify_host", b);
        mo14292a(activity, b2);
        return b2;
    }
}
