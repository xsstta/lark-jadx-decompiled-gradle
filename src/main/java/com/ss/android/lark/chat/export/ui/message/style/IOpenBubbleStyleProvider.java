package com.ss.android.lark.chat.export.ui.message.style;

import android.view.View;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/export/ui/message/style/IOpenBubbleStyleProvider;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "", "getBubbleStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/BubbleStyle;", "messageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "contentView", "Landroid/view/View;", "getReactionStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReactionStyle;", "getReplyStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/ReplyStyle;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.ui.message.style.a */
public interface IOpenBubbleStyleProvider<T extends ContentVO<?>> {
    /* renamed from: a */
    BubbleStyle mo120407a(OpenMessageVO<T> cVar, View view);

    /* renamed from: a */
    C34034b mo120408a(OpenMessageVO<T> cVar);

    /* renamed from: b */
    C34035c mo120416b(OpenMessageVO<T> cVar);
}
