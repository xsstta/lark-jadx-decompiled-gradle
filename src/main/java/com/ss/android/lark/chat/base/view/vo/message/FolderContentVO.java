package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.message.content.FolderContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/FolderContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseFileContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/FolderContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/FolderContent;)V", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.e */
public final class FolderContentVO extends BaseFileContentVO<FolderContent> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderContentVO(FolderContent folderContent) {
        super(folderContent);
        Intrinsics.checkParameterIsNotNull(folderContent, "content");
    }
}
