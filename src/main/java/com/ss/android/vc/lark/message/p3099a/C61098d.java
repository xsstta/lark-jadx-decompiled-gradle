package com.ss.android.vc.lark.message.p3099a;

import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.entity.message.content.OpenSystemContent;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.vc.VideoChatModule;

/* renamed from: com.ss.android.vc.lark.message.a.d */
public class C61098d implements IOpenMsgVOConverter<VOIPSysContentVO> {
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
    public VOIPSysContentVO mo120419b(OpenMessageInfo cVar) {
        OpenSystemContent openSystemContent = (OpenSystemContent) cVar.getMessage().getContent();
        if (openSystemContent.isVoIPSystemMessage()) {
            return new VOIPSysContentVO(openSystemContent, VideoChatModule.getDependency().getUserId());
        }
        return null;
    }
}
