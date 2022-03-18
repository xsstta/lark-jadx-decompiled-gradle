package com.ss.android.lark.integrator.im.p2029i.p2030a;

import android.content.Context;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;

/* renamed from: com.ss.android.lark.integrator.im.i.a.g */
public class C39664g implements AbstractC38037a.AbstractC38048h {
    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38048h
    /* renamed from: a */
    public boolean mo139243a() {
        return C39603g.m157159a().getCoreDependency().mo143376B();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38048h
    /* renamed from: a */
    public void mo139242a(Context context) {
        CreateGroupChatModuleProvider.m157168a().openCreateGroupChatModule(context, CreateGroupChatModuleProvider.m157168a().getSourceMyGroup());
    }
}
