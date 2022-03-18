package com.ss.android.lark.ding.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ding.service.impl.controller.C36720c;
import com.ss.android.lark.ding.service.impl.controller.DingActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.a */
public class C36673a {
    /* renamed from: a */
    public static void m144736a(Context context, C36516a aVar, Message message, List<String> list, boolean z, int i) {
        Intent intent = new Intent(context, DingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra.ding.message", message);
        bundle.putStringArrayList("extra.ding.chatter.ids", new ArrayList<>(list));
        bundle.putBoolean("extra.ding.isP2p", z);
        intent.putExtras(bundle);
        if (DesktopUtil.m144301a(context)) {
            C36720c cVar = new C36720c();
            cVar.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, cVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ding").mo134930b(), i);
            return;
        }
        aVar.startActivityForResult(intent, i);
    }
}
