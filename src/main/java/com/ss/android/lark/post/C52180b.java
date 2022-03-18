package com.ss.android.lark.post;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.post.b */
public class C52180b {
    /* renamed from: a */
    public static void m202455a(Context context, C36516a aVar, Bundle bundle, int i) {
        if (DesktopUtil.m144301a(context)) {
            C52200c cVar = new C52200c();
            cVar.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, cVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_WIDE_M1).mo134930b(), i);
            return;
        }
        Intent intent = new Intent(context, PostMessageActivity.class);
        intent.putExtras(bundle);
        aVar.startActivityForResult(intent, i);
    }
}
