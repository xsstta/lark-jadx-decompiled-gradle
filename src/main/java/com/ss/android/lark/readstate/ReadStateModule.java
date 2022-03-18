package com.ss.android.lark.readstate;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.readstate.impl.C53098a;
import com.ss.android.lark.readstate.impl.detail.C53115b;
import com.ss.android.lark.readstate.impl.detail.MessageReadStateActivity;
import com.ss.android.lark.readstate.p2564a.AbstractC53096a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.C58546g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class ReadStateModule {

    /* renamed from: a */
    private static volatile AbstractC53096a f131286a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadStateListType {
    }

    /* renamed from: a */
    public static AbstractC53096a m205502a() {
        return f131286a;
    }

    public ReadStateModule(AbstractC53096a aVar) {
        f131286a = aVar;
    }

    /* renamed from: a */
    public void mo181351a(Context context, String str, Message.Type type, String str2, ArrayList<String> arrayList, boolean z) {
        int i;
        C53098a a = C53098a.m205527a().mo181370a(str).mo181369a(type).mo181374b(str2).mo181371a(arrayList).mo181372a(z).mo181373a();
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, MessageReadStateActivity.class);
            intent.putExtras(a.mo181368b());
            context.startActivity(intent);
            return;
        }
        C58546g.C58549b b = C58546g.m227072a().mo198456b();
        int a2 = (b.mo198458a() - UIHelper.dp2px((float) 162)) + (b.mo198462e() >> 1);
        float f = (float) 284;
        if (b.mo198459b() < UIHelper.dp2px(f)) {
            i = b.mo198459b() + b.mo198463f() + UIHelper.dp2px((float) 8);
        } else {
            i = b.mo198459b() - UIHelper.dp2px(f);
        }
        FloatWindowParams a3 = new FloatWindowParams.C36567a().mo134948b(324).mo134949c(276).mo134942a(BitmapDescriptorFactory.HUE_RED).mo134943a(51).mo134946a(false).mo134944a(a2, i).mo134945a("MessageReadStateActivity").mo134950d(R.drawable.desktop_shadow_bg).mo134930b();
        C53115b bVar = new C53115b();
        bVar.setArguments(a.mo181368b());
        C36519d.m144080a().mo134806a(bVar, a3);
    }
}
