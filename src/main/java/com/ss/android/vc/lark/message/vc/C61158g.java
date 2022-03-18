package com.ss.android.vc.lark.message.vc;

import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.vc.VideoChatModule;

/* renamed from: com.ss.android.vc.lark.message.vc.g */
public class C61158g implements IOpenMsgVOConverter<VCSysContentVO> {
    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: c */
    public CharSequence mo120420c(OpenMessageInfo cVar) {
        return "";
    }

    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: a */
    public MessageType mo120418a() {
        return MessageType.SYSTEM;
    }

    /* renamed from: a */
    public VCSysContentVO mo120419b(OpenMessageInfo cVar) {
        OpenSystemContent openSystemContent = (OpenSystemContent) cVar.getMessage().getContent();
        if (openSystemContent.isVCSystemMessage()) {
            return new VCSysContentVO(openSystemContent, VideoChatModule.getDependency().getUserId());
        }
        return null;
    }
}
