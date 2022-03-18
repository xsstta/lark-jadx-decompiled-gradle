package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/SystemContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/SystemContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/SystemContent;)V", "canReply", "", "getMessageAggregationId", "", "message", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.l */
public final class SystemContentVO extends ContentVO<SystemContent> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SystemContentVO(SystemContent systemContent) {
        super(systemContent);
        Intrinsics.checkParameterIsNotNull(systemContent, "content");
    }

    @Override // com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public String mo121898a(OpenMessageVO<?> cVar) {
        SystemMessageType systemMessageType;
        Intrinsics.checkParameterIsNotNull(cVar, "message");
        SystemContent systemContent = (SystemContent) mo126168z();
        SystemMessageType systemMessageType2 = null;
        if (systemContent != null) {
            systemMessageType = systemContent.getType();
        } else {
            systemMessageType = null;
        }
        if (systemMessageType != SystemMessageType.USER_CHECK_OTHERS_TELEPHONE) {
            SystemContent systemContent2 = (SystemContent) mo126168z();
            if (systemContent2 != null) {
                systemMessageType2 = systemContent2.getType();
            }
            if (systemMessageType2 != SystemMessageType.SystemContent_CHECK_USER_PHONE_NUMBER) {
                return super.mo121898a(cVar);
            }
        }
        String str = ((SystemContent) mo126168z()).getContents().get("caller_id");
        if (str != null) {
            return str;
        }
        return "1";
    }
}
