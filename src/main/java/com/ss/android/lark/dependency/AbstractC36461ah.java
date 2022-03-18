package com.ss.android.lark.dependency;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.listener.IPushAddFriendListener;

/* renamed from: com.ss.android.lark.dependency.ah */
public interface AbstractC36461ah {
    /* renamed from: a */
    IPlusItem mo134432a(Chat chat);

    /* renamed from: a */
    String mo134433a();

    /* renamed from: a */
    void mo134434a(Context context, Bundle bundle, int i);

    /* renamed from: a */
    void mo134435a(Context context, C33973b bVar, Chat chat);

    /* renamed from: a */
    void mo134436a(Context context, ProfileSource profileSource);

    /* renamed from: a */
    void mo134437a(Context context, String str, String str2, ProfileSource profileSource, C36516a aVar, int i);

    /* renamed from: a */
    void mo134438a(Context context, String str, String str2, String str3, String str4, boolean z);

    /* renamed from: a */
    void mo134439a(IPushAddFriendListener eVar);

    /* renamed from: b */
    String mo134440b();

    /* renamed from: b */
    void mo134441b(IPushAddFriendListener eVar);

    /* renamed from: c */
    boolean mo134442c();
}
