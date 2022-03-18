package com.ss.android.lark.chat.export.ui.message;

import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\u000e\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00010\u00062\u00020\u0007J#\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¢\u0006\u0002\u0010\rJ\r\u0010\u000e\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCellFactory;", "VO", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "CT", "Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "CP", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "", "createMessageCell", "chatContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "openCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "getVOConverter", "()Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.ui.message.d */
public interface IOpenMessageCellFactory<VO extends ContentVO<?>, CT extends IOpenMsgVOConverter<VO>, CP extends IOpenMessageCell<VO>> {
    /* renamed from: b */
    CP mo120404b(IMessageContext aVar, IOpenCellCallback<VO> bVar);

    /* renamed from: b */
    CT mo120405b();
}
