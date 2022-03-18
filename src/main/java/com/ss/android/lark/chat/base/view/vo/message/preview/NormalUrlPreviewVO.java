package com.ss.android.lark.chat.base.view.vo.message.preview;

import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/preview/NormalUrlPreviewVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;", "messageUrlPreview", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "(Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;)V", "getMessageUrlPreview", "()Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.a.d */
public final class NormalUrlPreviewVO extends BasePreviewVO {

    /* renamed from: a */
    private int f84795a = 1;

    /* renamed from: b */
    private final MessageUrlPreview f84796b;

    /* renamed from: a */
    public final MessageUrlPreview mo121800a() {
        return this.f84796b;
    }

    public NormalUrlPreviewVO(MessageUrlPreview messageUrlPreview) {
        this.f84796b = messageUrlPreview;
    }
}
