package com.ss.android.appcenter.p1262a.p1264b;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appdetail.AppDetailActivity;
import com.ss.android.appcenter.business.activity.appdetail.C27626a;
import com.ss.android.appcenter.business.activity.appfeedback.AppFeedbackActivity;
import com.ss.android.appcenter.business.activity.apppropose.AppProposeActivity;
import com.ss.android.appcenter.business.activity.appsetting.AppSettingActivity;
import com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateCallback;
import com.ss.android.appcenter.business.activity.appsetting.GadgetUpdateControl;
import com.ss.android.appcenter.business.tab.business.widget.CardPreviewActivity;
import com.ss.android.appcenter.common.util.C28180d;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1264b.C27554b;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.a.b.d */
public class C27566d {
    /* renamed from: a */
    public static void m100598a(String str, boolean z, String str2, String str3) {
        GadgetUpdateControl.f69118a.mo98576a(str, z, str2, str3);
    }

    /* renamed from: a */
    public static String m100588a(Context context) {
        return C28209p.m103297a(context, (int) R.string.AppDetail_Application_Mechanism_NoAccessWords);
    }

    /* renamed from: b */
    public static String m100599b(Context context) {
        return C28209p.m103297a(context, (int) R.string.AppDetail_Application_Mechanism_NoAccessBtn);
    }

    /* renamed from: c */
    public static String m100602c(Context context) {
        return C28209p.m103297a(context, (int) R.string.AppDetail_Application_Mechanism_AppDeactivatedWord);
    }

    /* renamed from: d */
    public static String m100603d(Context context) {
        return C28209p.m103297a(context, (int) R.string.OpenPlatform_AppCenter_AppDeletedDesc);
    }

    /* renamed from: e */
    public static String m100604e(Context context) {
        return C28180d.m103231a(context);
    }

    /* renamed from: a */
    public static void m100594a(String str) {
        WeakReference<GadgetUpdateCallback> a = GadgetUpdateControl.f69118a.mo98571a();
        if (a != null && a.get() != null) {
            a.get().mo98546b(str);
        }
    }

    /* renamed from: b */
    public static void m100600b(Context context, String str) {
        CardPreviewActivity.m101991a(context, str);
    }

    /* renamed from: a */
    public static List<C27552a> m100589a(Context context, String str) {
        return C27554b.m100573a(context, str);
    }

    /* renamed from: a */
    public static void m100596a(String str, C27554b.AbstractC27562b bVar) {
        C27554b.m100575a(str, bVar);
    }

    /* renamed from: a */
    public static void m100597a(String str, String str2) {
        WeakReference<GadgetUpdateCallback> a = GadgetUpdateControl.f69118a.mo98571a();
        if (!(a == null || a.get() == null)) {
            a.get().mo98545a(str);
        }
        GadgetUpdateControl.f69118a.mo98575a(str2);
    }

    /* renamed from: a */
    public static void m100590a(Context context, String str, String str2) {
        AppProposeActivity.m101006a(context, str, str2);
    }

    /* renamed from: a */
    public static void m100593a(Context context, String str, boolean z) {
        AppDetailActivity.m100819a(context, str, z);
    }

    /* renamed from: b */
    public static void m100601b(Context context, String str, String str2, String str3) {
        AppFeedbackActivity.m100937a(context, str, str2, "MobileMP", str3, null);
    }

    /* renamed from: a */
    public static void m100591a(Context context, String str, String str2, String str3) {
        AppProposeActivity.m101007a(context, str, str2, str3);
    }

    /* renamed from: a */
    public static void m100595a(String str, int i, int i2, boolean z) {
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_POPOVER_P1).mo134944a(i, i2).mo134945a("AppDetailFragment").mo134930b();
        C27626a aVar = new C27626a();
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putBoolean("is_app", z);
        aVar.setArguments(bundle);
        C36512a.m144041a().mo134762a(aVar, a);
    }

    /* renamed from: a */
    public static void m100592a(Context context, String str, String str2, Map<String, String> map, int i, String str3) {
        AppSettingActivity.m101029a(context, str, map, true, i, str2, str3);
    }
}
