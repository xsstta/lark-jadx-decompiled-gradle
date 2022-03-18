package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.utils.C34343i;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/StickerMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/StickerContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.o */
public final class StickerMsgConverter implements IMsgVOConverter<StickerContentVO> {
    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.STICKER;
    }

    /* renamed from: a */
    public StickerContentVO mo122453b(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<StickerContent>()");
        StickerContentVO kVar = new StickerContentVO((StickerContent) content);
        kVar.mo121892a(message);
        return kVar;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        if (message != null) {
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()…ark_Legacy_StickerHolder)");
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<StickerContent>()");
            String a = C34343i.m133180a((StickerContent) content);
            Intrinsics.checkExpressionValueIsNotNull(a, "ContentUtil.getStickerDesc(stickerContent)");
            return a;
        }
        String string = UIHelper.getString(R.string.Lark_Legacy_StickerHolder);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ark_Legacy_StickerHolder)");
        return string;
    }
}
