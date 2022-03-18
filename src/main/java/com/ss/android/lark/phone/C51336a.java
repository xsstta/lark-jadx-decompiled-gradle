package com.ss.android.lark.phone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.phone.impl.phoneamountedit.C51363a;
import com.ss.android.lark.phone.impl.phoneamountedit.PhoneAmountEditActivity;
import com.ss.android.lark.phone.impl.phonequerylimit.C51383a;
import com.ss.android.lark.phone.impl.phonequerylimit.PhoneQueryLimitActivity;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;

/* renamed from: com.ss.android.lark.phone.a */
public class C51336a {
    /* renamed from: a */
    public static void m199117a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        if (DesktopUtil.m144301a(context)) {
            m199119a(bundle, new C51363a());
        } else {
            m199116a(context, bundle, PhoneAmountEditActivity.class);
        }
    }

    /* renamed from: a */
    private static void m199119a(Bundle bundle, C36516a aVar) {
        aVar.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
        aVar.setFragmentParams(a);
        C36512a.m144041a().mo134762a(aVar, a);
    }

    /* renamed from: a */
    private static void m199116a(Context context, Bundle bundle, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m199118a(Context context, String str, PhoneQueryControlInfo phoneQueryControlInfo) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("control_info", phoneQueryControlInfo);
        bundle.putString("user_id", str);
        if (DesktopUtil.m144301a(context)) {
            m199119a(bundle, new C51383a());
        } else {
            m199116a(context, bundle, PhoneQueryLimitActivity.class);
        }
    }
}
