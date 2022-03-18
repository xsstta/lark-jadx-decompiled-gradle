package com.ss.android.lark.chat.base.view.vo.message.preview;

import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.tangram.base.render.Render;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/preview/NewUrlPreviewVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/preview/BasePreviewVO;", "previewEntity", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", ShareHitPoint.f121869d, "", "render", "Lcom/ss/android/lark/tangram/base/render/Render;", "(Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;ILcom/ss/android/lark/tangram/base/render/Render;)V", "getPreviewEntity", "()Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getRender", "()Lcom/ss/android/lark/tangram/base/render/Render;", "setRender", "(Lcom/ss/android/lark/tangram/base/render/Render;)V", "getType", "()I", "setType", "(I)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.a.c */
public final class NewUrlPreviewVO extends BasePreviewVO {

    /* renamed from: a */
    private final PreviewHangPoint f84792a;

    /* renamed from: b */
    private int f84793b;

    /* renamed from: c */
    private Render f84794c;

    /* renamed from: a */
    public final PreviewHangPoint mo121797a() {
        return this.f84792a;
    }

    /* renamed from: b */
    public final Render mo121799b() {
        return this.f84794c;
    }

    /* renamed from: a */
    public final void mo121798a(Render dVar) {
        this.f84794c = dVar;
    }

    public NewUrlPreviewVO(PreviewHangPoint previewHangPoint, int i, Render dVar) {
        this.f84792a = previewHangPoint;
        this.f84793b = i;
        this.f84794c = dVar;
    }
}
