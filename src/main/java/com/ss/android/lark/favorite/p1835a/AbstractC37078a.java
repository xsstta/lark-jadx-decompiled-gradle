package com.ss.android.lark.favorite.p1835a;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.favorite.a.a */
public interface AbstractC37078a {
    /* renamed from: a */
    Map<String, Message> mo136700a(C14928Entity entity);

    /* renamed from: a */
    Map<String, Chatter> mo136701a(List<String> list);

    /* renamed from: a */
    Map<String, Chat> mo136702a(Map<String, com.bytedance.lark.pb.basic.v1.Chat> map);

    /* renamed from: b */
    Map<String, Chatter> mo136703b(C14928Entity entity);

    /* renamed from: b */
    Map<String, Chat> mo136704b(List<String> list);
}
