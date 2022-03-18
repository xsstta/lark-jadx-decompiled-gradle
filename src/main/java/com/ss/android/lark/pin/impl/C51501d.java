package com.ss.android.lark.pin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.pin.impl.d */
public class C51501d {
    /* renamed from: a */
    public static Bundle m199787a(String str, String str2, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("key_chat_id", str);
        bundle.putString("key_chat_owner_id", str2);
        bundle.putInt("key_from", i);
        bundle.putBoolean("key_is_super_group", z);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m199786a(String str, String str2, int i, int i2, int i3, boolean z) {
        Bundle a = m199787a(str, str2, i, z);
        a.putInt("key_chatter_count", i3);
        a.putInt("key_chat_type", i2);
        return a;
    }

    /* renamed from: b */
    private static Intent m199789b(Context context, String str, String str2, int i, int i2, int i3, boolean z) {
        Intent intent = new Intent(context, ChatPinActivity.class);
        intent.putExtras(m199786a(str, str2, i, i2, i3, z));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m199788a(Context context, String str, String str2, int i, int i2, int i3, boolean z) {
        Bundle a = m199786a(str, str2, i, i2, i3, z);
        if (DesktopUtil.m144301a(context)) {
            C51499c cVar = new C51499c();
            cVar.setArguments(a);
            DrawerParams a2 = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
            cVar.setFragmentParams(a2);
            C36512a.m144041a().mo134761a(cVar, a2);
            return;
        }
        context.startActivity(m199789b(context, str, str2, i, i2, i3, z));
    }
}
