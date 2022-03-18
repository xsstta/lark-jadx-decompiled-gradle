package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/MergeForwardContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;)V", "mergeForwardInfo", "Lcom/ss/android/lark/biz/im/api/dto/MergeForwardInfo;", "getMergeForwardInfo", "()Lcom/ss/android/lark/biz/im/api/dto/MergeForwardInfo;", "setMergeForwardInfo", "(Lcom/ss/android/lark/biz/im/api/dto/MergeForwardInfo;)V", "canReply", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.h */
public final class MergeForwardContentVO extends TranslatableContentVO<MergeForwardContent> {

    /* renamed from: a */
    private C29597a f84859a;

    /* renamed from: a */
    public final C29597a mo121875a() {
        return this.f84859a;
    }

    /* renamed from: a */
    public final void mo121876a(C29597a aVar) {
        this.f84859a = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MergeForwardContentVO(MergeForwardContent mergeForwardContent) {
        super(mergeForwardContent);
        Intrinsics.checkParameterIsNotNull(mergeForwardContent, "content");
    }
}
