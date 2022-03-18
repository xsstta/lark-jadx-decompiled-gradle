package com.ss.android.lark.profile.func.group_profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.statistics.GroupProfilePerceivableErrorCostTimeHitPoint;

/* renamed from: com.ss.android.lark.profile.func.group_profile.d */
public class C52316d {
    /* renamed from: a */
    public static void m202949a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("params__chat_id", str);
        bundle.putBoolean("param_just_show_chat_info", true);
        m202948a(context, bundle, (Boolean) false);
    }

    /* renamed from: b */
    public static void m202952b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("params__chat_id", str);
        bundle.putBoolean("key_params_is_search_public", true);
        m202948a(context, bundle, (Boolean) false);
    }

    /* renamed from: a */
    public static void m202947a(Context context, Bundle bundle, int i) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Intent intent = new Intent(context, GroupProfileActivity.class);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
            context.startActivity(intent);
            return;
        }
        ((Activity) context).startActivityForResult(intent, i);
    }

    /* renamed from: a */
    private static void m202948a(Context context, Bundle bundle, Boolean bool) {
        GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180531b();
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            C52299a aVar = new C52299a();
            aVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(aVar, a);
            return;
        }
        Intent intent = new Intent(context, GroupProfileActivity.class);
        intent.putExtras(bundle);
        if (bool.booleanValue()) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m202950a(Context context, String str, String str2, String str3, String str4, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("params__chat_id", str);
        bundle.putString("param_token", str2);
        bundle.putString("params_tenant_id", str3);
        bundle.putBoolean("params_education_group", true);
        bundle.putString("params_group_inviter_id", str4);
        bundle.putBoolean("key_param_is_from_link", z);
        m202948a(context, bundle, (Boolean) true);
    }

    /* renamed from: a */
    public static void m202951a(Context context, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putString("params__chat_id", str);
        bundle.putString("params_group_inviter_id", str3);
        bundle.putString("param_token", str2);
        bundle.putBoolean("params_in_organization", z);
        bundle.putBoolean("params_show_join_organization", z2);
        bundle.putString("parmas_tip_str", str4);
        bundle.putBoolean("params_is_other_tenant_in_orgainization", z3);
        bundle.putBoolean("key_param_is_external_group", z4);
        bundle.putString("params_tenant_id", str5);
        bundle.putString("params_invite_url", str6);
        bundle.putBoolean("key_param_is_from_link", z5);
        m202948a(context, bundle, (Boolean) true);
    }
}
