package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.dependency.AbstractC36495k;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.h */
class C39528h implements AbstractC36495k {
    @Override // com.ss.android.lark.dependency.AbstractC36495k
    /* renamed from: a */
    public String mo134657a() {
        return "param_chatter_ids";
    }

    @Override // com.ss.android.lark.dependency.AbstractC36495k
    /* renamed from: b */
    public String mo134660b() {
        return "contacts_to_apply";
    }

    C39528h() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36495k
    /* renamed from: a */
    public void mo134658a(Activity activity, C36516a aVar, String str, List<PickChatEntity> list, String str2, boolean z, boolean z2, int i) {
        CreateGroupChatModuleProvider.m157168a().startP2pBuildGroup(activity, aVar, str, list, str2, z, z2, i);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36495k
    /* renamed from: a */
    public void mo134659a(Context context, List<PickChatEntity> list, List<Contact> list2, String str, List<String> list3, Map<String, Map<String, DocPermPair.PermType>> map, IGetDataCallback<Chat> iGetDataCallback, boolean z, boolean z2) {
        CreateGroupChatModuleProvider.m157168a().createGroupFromMessageList(context, list, list2, str, list3, map, iGetDataCallback, z, z2);
    }
}
