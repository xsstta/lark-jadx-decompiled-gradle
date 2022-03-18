package com.ss.android.lark.chat.api.service;

import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.chat.api.service.b */
public interface AbstractC32819b {
    /* renamed from: a */
    char mo121120a(OpenChatter openChatter, Locale locale);

    /* renamed from: a */
    String mo121121a(OpenChatter openChatter, ChatterNameDisplayRule chatterNameDisplayRule);

    /* renamed from: a */
    String mo121122a(String str, String str2);

    /* renamed from: a */
    String mo121123a(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule);

    /* renamed from: a */
    void mo121124a(List<Chatter> list);

    /* renamed from: b */
    void mo121125b(List<ChatChatter> list);
}
