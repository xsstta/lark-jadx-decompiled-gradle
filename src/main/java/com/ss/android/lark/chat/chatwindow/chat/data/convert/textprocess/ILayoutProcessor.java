package com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess;

import android.content.Context;
import android.text.Layout;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J'\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ILayoutProcessor;", "T", "", "process", "Landroid/text/Layout;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "params", "Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;", "context", "Landroid/content/Context;", "(Ljava/lang/Object;Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/textprocess/ProcessParams;Landroid/content/Context;)Landroid/text/Layout;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a.b */
public interface ILayoutProcessor<T> {
    /* renamed from: a */
    Layout mo122459a(T t, ProcessParams dVar, Context context);
}
