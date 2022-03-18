package com.ss.android.lark.chat.chatwindow.chat.message.plugin.redpackage.converter;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.view.message.plugin.redpackage.entity.RedPacketContentVO;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/message/plugin/redpackage/converter/RedPacketMsgConverter;", "Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/message/plugin/redpackage/entity/RedPacketContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.e.a.a.a */
public final class RedPacketMsgConverter implements IOpenMsgVOConverter<RedPacketContentVO> {
    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: a */
    public MessageType mo120418a() {
        return MessageType.RED_PACKET;
    }

    /* renamed from: a */
    public RedPacketContentVO mo120419b(OpenMessageInfo cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        return new RedPacketContentVO((RedPacketContent) cVar.getMessage().getContent());
    }

    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: c */
    public CharSequence mo120420c(OpenMessageInfo cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        String string = UIHelper.getString(R.string.Lark_Hongbao_ReplyHongbao);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ark_Hongbao_ReplyHongbao)");
        return string;
    }
}
