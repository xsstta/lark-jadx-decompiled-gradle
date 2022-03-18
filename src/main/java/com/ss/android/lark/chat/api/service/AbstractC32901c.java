package com.ss.android.lark.chat.api.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.BotsResponse;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.api.service.c */
public interface AbstractC32901c {
    /* renamed from: a */
    ChatChatter mo121185a(String str, String str2);

    /* renamed from: a */
    Chatter mo121186a();

    /* renamed from: a */
    Chatter mo121187a(boolean z);

    /* renamed from: a */
    Map<String, ChatChatter> mo121188a(String str, List<String> list);

    /* renamed from: a */
    Map<String, Chatter> mo121189a(List<String> list);

    /* renamed from: a */
    void mo121190a(IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: a */
    void mo121191a(IGetDataCallback<BotsResponse> iGetDataCallback, int i);

    /* renamed from: a */
    void mo121193a(Channel channel, String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo121194a(Chatter chatter);

    /* renamed from: a */
    void mo121195a(String str);

    /* renamed from: a */
    void mo121196a(String str, IGetDataCallback<OpenChatter> iGetDataCallback);

    /* renamed from: a */
    void mo121198a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo121199a(String str, List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback);

    /* renamed from: a */
    void mo121200a(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

    /* renamed from: a */
    void mo121201a(boolean z, IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: b */
    Chatter mo121203b(String str);

    /* renamed from: b */
    Map<String, ChatChatter> mo121204b(String str, List<String> list);

    /* renamed from: b */
    Map<String, Chatter> mo121205b(List<String> list);

    /* renamed from: b */
    void mo121206b();

    /* renamed from: b */
    void mo121207b(IGetDataCallback<BotsResponse> iGetDataCallback);

    /* renamed from: b */
    void mo121208b(String str, IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: b */
    void mo121210b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

    /* renamed from: c */
    Chatter mo121211c(String str);

    /* renamed from: c */
    Map<String, ChatChatter> mo121212c(String str, List<String> list);

    /* renamed from: c */
    Map<String, Chatter> mo121213c(List<String> list);

    /* renamed from: c */
    void mo121214c(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    void mo121215c(String str, IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: d */
    void mo121218d(String str);

    /* renamed from: d */
    void mo121219d(String str, IGetDataCallback<String> iGetDataCallback);
}
