package com.ss.android.vc.service;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.vc.dto.VideoChatContent;

/* renamed from: com.ss.android.vc.service.a */
public interface AbstractC63632a {
    /* renamed from: a */
    AbstractC58992f<MessageInfo, ? extends RecyclerView.ViewHolder> mo220138a(Context context, Chat chat);

    VideoChatContent parseVideoChatContent(Object obj);
}
