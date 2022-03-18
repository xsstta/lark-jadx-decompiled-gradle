package com.ss.android.lark.member_manage.impl.share_contact_card;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.impl.statistics.SelectContactHitPoint;

/* renamed from: com.ss.android.lark.member_manage.impl.share_contact_card.b */
public class C45181b {
    /* renamed from: a */
    public static void m179301a(Activity activity, C36516a<?> aVar, Bundle bundle, int i) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            Intent intent = new Intent(activity, ShareContactCardActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, i);
        } else {
            C45179a aVar2 = new C45179a();
            aVar2.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, aVar2, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1).mo134945a("ShareContactCardFragment").mo134930b(), i);
        }
        SelectContactHitPoint.m179755b();
    }
}
