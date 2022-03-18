package com.ss.android.lark.chat.base.view.vo.message;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.doc.entity.DocResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0016\u0010\u001b\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/TextContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/TextContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/TextContent;)V", "docPreview", "Lcom/ss/android/lark/doc/entity/DocResult;", "getDocPreview", "()Lcom/ss/android/lark/doc/entity/DocResult;", "setDocPreview", "(Lcom/ss/android/lark/doc/entity/DocResult;)V", "previewEntity", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getPreviewEntity", "()Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "setPreviewEntity", "(Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;)V", "urlPreview", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "getUrlPreview", "()Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "setUrlPreview", "(Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;)V", "hasDocInfo", "", "hasMiddleGroundUrlPreview", "hasUrlPreview", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.m */
public final class TextContentVO extends BaseTextContentVO<TextContent> {

    /* renamed from: a */
    private MessageUrlPreview f84877a;

    /* renamed from: b */
    private DocResult f84878b;

    /* renamed from: c */
    private PreviewHangPoint f84879c;

    /* renamed from: m */
    public final MessageUrlPreview mo121902m() {
        return this.f84877a;
    }

    /* renamed from: n */
    public final DocResult mo121903n() {
        return this.f84878b;
    }

    /* renamed from: o */
    public final PreviewHangPoint mo121904o() {
        return this.f84879c;
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO
    /* renamed from: l */
    public boolean mo121792l() {
        if (this.f84878b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo121906q() {
        if (this.f84879c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo121905p() {
        MessageUrlPreview messageUrlPreview = this.f84877a;
        if (messageUrlPreview != null) {
            if (messageUrlPreview == null) {
                Intrinsics.throwNpe();
            }
            if (!messageUrlPreview.isDeleted()) {
                MessageUrlPreview messageUrlPreview2 = this.f84877a;
                if (messageUrlPreview2 == null) {
                    Intrinsics.throwNpe();
                }
                if (!TextUtils.isEmpty(messageUrlPreview2.getTitle())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo121899a(MessageUrlPreview messageUrlPreview) {
        this.f84877a = messageUrlPreview;
    }

    /* renamed from: a */
    public final void mo121900a(PreviewHangPoint previewHangPoint) {
        this.f84879c = previewHangPoint;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextContentVO(TextContent textContent) {
        super(textContent);
        Intrinsics.checkParameterIsNotNull(textContent, "content");
    }

    /* renamed from: a */
    public final void mo121901a(DocResult docResult) {
        this.f84878b = docResult;
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO, com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO, com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (super.mo121780a(aVar) && (aVar instanceof TextContentVO)) {
            TextContentVO mVar = (TextContentVO) aVar;
            if (!C26247a.m94981a(this.f84877a, mVar.f84877a) || !C26247a.m94981a((Object) this.f84878b, (Object) mVar.f84878b) || !C26247a.m94981a((Object) this.f84879c, (Object) mVar.f84879c)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
