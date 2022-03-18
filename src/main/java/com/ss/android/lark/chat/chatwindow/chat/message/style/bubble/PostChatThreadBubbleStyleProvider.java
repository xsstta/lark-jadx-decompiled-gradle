package com.ss.android.lark.chat.chatwindow.chat.message.style.bubble;

import android.view.View;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.C33348a;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/message/style/bubble/PostChatThreadBubbleStyleProvider;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/style/bubble/PostBubbleStyleProvider;", "()V", "getBubbleStyle", "Lcom/ss/android/lark/chat/export/ui/message/style/BubbleStyle;", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/PostContentVO;", "contentView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.h */
public final class PostChatThreadBubbleStyleProvider extends C33358g {
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33358g, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO<PostContentVO> aVar, View view) {
        View view2;
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "messageVO");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        if (aVar.mo121699g().mo121882n()) {
            i = ActivityIdentificationData.WALKING;
            view2 = view.findViewById(R.id.chat_post).findViewById(R.id.title_division);
        } else {
            i = 9;
            view2 = null;
        }
        return C33348a.C33349a.m129126a(i, view2, aVar.ah());
    }
}
