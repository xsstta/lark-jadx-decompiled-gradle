package com.ss.android.lark.chat.base.view.vo.message.preview;

import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/preview/DocUrlPreviewVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;", "docResult", "Lcom/ss/android/lark/doc/entity/DocResult;", "(Lcom/ss/android/lark/doc/entity/DocResult;)V", "getDocResult", "()Lcom/ss/android/lark/doc/entity/DocResult;", ShareHitPoint.f121869d, "", "getType", "()I", "setType", "(I)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.a.b */
public final class DocUrlPreviewVO extends BasePreviewVO {

    /* renamed from: a */
    private int f84790a = 2;

    /* renamed from: b */
    private final DocResult f84791b;

    /* renamed from: a */
    public final DocResult mo121796a() {
        return this.f84791b;
    }

    public DocUrlPreviewVO(DocResult docResult) {
        this.f84791b = docResult;
    }
}
