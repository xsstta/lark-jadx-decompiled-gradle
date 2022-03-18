package com.ss.android.lark.collaboration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.collaboration.applydetail.ApplyCollabDetailActivity;
import com.ss.android.lark.collaboration.applydetail.C35341a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.collaboration.b */
public class C35355b {
    /* renamed from: a */
    public static void m138122a(Activity activity, C36516a<?> aVar, Bundle bundle, int i) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            Intent intent = new Intent(activity, ApplyCollabDetailActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, i);
            return;
        }
        C35341a aVar2 = new C35341a();
        aVar2.setArguments(bundle);
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("RemoveApplyFragment").mo134930b();
        if (aVar == null) {
            C36512a.m144041a().mo134762a(aVar2, a);
        } else {
            C36512a.m144041a().mo134760a(aVar, aVar2, a, i);
        }
    }
}
