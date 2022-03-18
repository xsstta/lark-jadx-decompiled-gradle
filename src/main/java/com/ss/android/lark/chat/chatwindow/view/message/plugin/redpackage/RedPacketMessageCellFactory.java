package com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage;

import com.ss.android.lark.chat.chatwindow.chat.message.plugin.redpackage.converter.RedPacketMsgConverter;
import com.ss.android.lark.chat.chatwindow.chat.view.message.plugin.redpackage.entity.RedPacketContentVO;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCellFactory;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCellFactory;", "Lcom/ss/android/lark/chat/chatwindow/chat/view/message/plugin/redpackage/entity/RedPacketContentVO;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/plugin/redpackage/converter/RedPacketMsgConverter;", "Lcom/ss/android/lark/chat/chatwindow/view/message/plugin/redpackage/RedPacketMessageCell;", "()V", "createMessageCell", "chatContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "openCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "getVOConverter", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.view.message.plugin.redpackage.b */
public final class RedPacketMessageCellFactory implements IOpenMessageCellFactory<RedPacketContentVO, RedPacketMsgConverter, RedPacketMessageCell> {
    /* renamed from: a */
    public RedPacketMsgConverter mo120405b() {
        return new RedPacketMsgConverter();
    }

    /* renamed from: a */
    public RedPacketMessageCell mo120404b(IMessageContext aVar, IOpenCellCallback<RedPacketContentVO> bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "chatContext");
        Intrinsics.checkParameterIsNotNull(bVar, "openCellCallback");
        return new RedPacketMessageCell(aVar, bVar);
    }
}
