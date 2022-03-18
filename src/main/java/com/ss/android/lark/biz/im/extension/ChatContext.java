package com.ss.android.lark.biz.im.extension;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH'¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/biz/im/extension/ChatContext;", "", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getContext", "Landroid/content/Context;", "showTodoSmartReply", "", "drawable", "Landroid/graphics/drawable/Drawable;", "label", "", "callback", "Lcom/ss/android/lark/biz/im/extension/ExtensionCallback;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.extension.c */
public interface ChatContext {
    /* renamed from: a */
    Context mo106810a();

    @Deprecated(message = "非常特化的接口，需要等到键盘上方快捷操作区域完全容器化后，该接口才能下线")
    /* renamed from: a */
    void mo106811a(Drawable drawable, String str, ExtensionCallback<Unit> dVar);

    /* renamed from: b */
    Chat mo106812b();
}
