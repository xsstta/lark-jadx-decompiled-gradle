package com.ss.android.lark.create.groupchat.impl.p2p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.create.groupchat.impl.statistics.P2PCreateGroupHitPoint;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.d */
public class C36355d {
    /* renamed from: a */
    public static void m143284a(Activity activity, C36516a aVar, String str, List<? extends PickChatEntity> list, String str2, boolean z, boolean z2, int i, String str3) {
        Intent intent = new Intent(activity, P2pBuildGroupActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_secret", z);
        bundle.putString("key_chat_id", str);
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            arrayList.addAll(list);
        }
        bundle.putSerializable("key_selected_members_Id", arrayList);
        bundle.putSerializable("department_id", str2);
        bundle.putSerializable(ShareHitPoint.f121868c, str3);
        intent.putExtras(bundle);
        if (DesktopUtil.m144301a((Context) activity)) {
            C36353c cVar = new C36353c();
            cVar.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, cVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1).mo134930b(), i);
        } else {
            aVar.startActivityForResult(intent, i);
        }
        P2PCreateGroupHitPoint.f93890a.mo134221a("single_setting", z, z2);
    }
}
