package com.ss.android.lark.dependency;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.doc.entity.DocPermPair;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.dependency.k */
public interface AbstractC36495k {
    /* renamed from: a */
    String mo134657a();

    /* renamed from: a */
    void mo134658a(Activity activity, C36516a aVar, String str, List<PickChatEntity> list, String str2, boolean z, boolean z2, int i);

    /* renamed from: a */
    void mo134659a(Context context, List<PickChatEntity> list, List<Contact> list2, String str, List<String> list3, Map<String, Map<String, DocPermPair.PermType>> map, IGetDataCallback<Chat> iGetDataCallback, boolean z, boolean z2);

    /* renamed from: b */
    String mo134660b();
}
