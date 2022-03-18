package com.ss.android.lark.invite_new_tenant;

import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.invite_new_tenant.invite.InviteNewTenantActivity;
import com.ss.android.lark.invite_new_tenant.invite.single.InviteSingleActivity;
import com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40535b;

/* renamed from: com.ss.android.lark.invite_new_tenant.a */
public class C40531a {

    /* renamed from: a */
    private static volatile AbstractC40532a f102937a;

    /* renamed from: a */
    public static AbstractC40532a m160431a() {
        return f102937a;
    }

    public C40531a(AbstractC40532a aVar) {
        f102937a = aVar;
    }

    /* renamed from: a */
    public void mo146641a(Context context, C40535b bVar) {
        if (bVar.f102941a) {
            Intent intent = new Intent(context, InviteNewTenantActivity.class);
            intent.putExtra("KEY_ENABLE_GIFT", bVar.f102943c);
            intent.putExtra("KEY_SHOW_RULE", bVar.f102942b);
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(context, InviteSingleActivity.class);
        intent2.putExtra("KEY_ENABLE_MOBILE", true);
        intent2.putExtra("KEY_SHOW_RULE", bVar.f102942b);
        context.startActivity(intent2);
    }
}
