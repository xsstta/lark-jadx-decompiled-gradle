package com.ss.android.lark.dependency;

import android.content.Context;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public interface IForwardDependency {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CallType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForwardLocation {
    }

    /* renamed from: a */
    int mo134366a();

    /* renamed from: a */
    void mo134367a(Context context, Chat chat);

    /* renamed from: a */
    void mo134368a(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3);

    /* renamed from: a */
    void mo134369a(Context context, FavoriteMessageInfo favoriteMessageInfo, int i, String str, boolean z, int i2);

    /* renamed from: a */
    void mo134370a(Context context, Message message, String str, String str2);

    /* renamed from: a */
    void mo134371a(Context context, Message message, String str, String str2, String str3);

    /* renamed from: a */
    void mo134372a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3);

    /* renamed from: a */
    void mo134373a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3);
}
