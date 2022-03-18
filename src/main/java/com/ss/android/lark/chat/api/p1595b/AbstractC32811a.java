package com.ss.android.lark.chat.api.p1595b;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;

/* renamed from: com.ss.android.lark.chat.api.b.a */
public interface AbstractC32811a {
    /* renamed from: a */
    IPlusItem mo120949a(Chat chat);

    /* renamed from: a */
    LocationContent mo120950a(Content content);

    /* renamed from: a */
    void mo120951a(Context context, Message message, LocationContent locationContent, String str);
}
