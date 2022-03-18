package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.i */
public class C45172i {
    /* renamed from: a */
    public static void m179275a(Activity activity, C36516a aVar, String str, String str2, int i) {
        if (activity == null) {
            Log.m165383e("ding", "activity is null");
            return;
        }
        Intent intent = new Intent(activity, SelectDingMemberActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        bundle.putString("key_message_id", str2);
        intent.putExtras(bundle);
        if (DesktopUtil.m144301a((Context) activity)) {
            C45170h hVar = new C45170h();
            hVar.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, hVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ding").mo134930b(), i);
            return;
        }
        aVar.startActivityForResult(intent, i);
    }
}
