package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36275a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.info.c */
public class C36314c {
    /* renamed from: a */
    public static void m143032a(C36516a aVar, GroupCreateInfo groupCreateInfo, List<PickChatEntity> list, long j) {
        if (aVar == null) {
            Log.m165382e("fragment == null");
            return;
        }
        FragmentActivity activity = aVar.getActivity();
        if (activity == null) {
            Log.m165382e("activity == null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_group_create_info", groupCreateInfo);
        bundle.putSerializable("key_data_entity", new ArrayList(list));
        bundle.putSerializable("key_start_edit_time", Long.valueOf(j));
        Intent intent = new Intent(activity, InputGroupInfoActivity.class);
        intent.putExtras(bundle);
        if (DesktopUtil.m144301a((Context) activity)) {
            InputGroupInfoFragment bVar = new InputGroupInfoFragment();
            bVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(bVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
            C36275a.m142820a("GroupCreateActivity", aVar);
            return;
        }
        C36275a.m142819a("GroupCreateActivity", activity);
        activity.startActivity(intent);
    }
}
