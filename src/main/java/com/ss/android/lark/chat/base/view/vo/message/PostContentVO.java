package com.ss.android.lark.chat.base.view.vo.message;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.doc.entity.DocResult;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020\fJ\u0006\u0010(\u001a\u00020\fJ\u0016\u0010)\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR\u001b\u0010\u0010\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/PostContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/BaseTextContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/PostContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/PostContent;)V", "docPreview", "Lcom/ss/android/lark/doc/entity/DocResult;", "getDocPreview", "()Lcom/ss/android/lark/doc/entity/DocResult;", "setDocPreview", "(Lcom/ss/android/lark/doc/entity/DocResult;)V", "isGroupAnnouncement", "", "()Z", "isGroupAnnouncement$delegate", "Lkotlin/Lazy;", "isNotified", "isNotified$delegate", "previewEntity", "Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "getPreviewEntity", "()Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;", "setPreviewEntity", "(Lcom/ss/android/lark/chat/entity/preview/PreviewHangPoint;)V", "title", "", "getTitle", "()Ljava/lang/String;", "title$delegate", "urlPreview", "Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "getUrlPreview", "()Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;", "setUrlPreview", "(Lcom/ss/android/lark/chat/entity/message/MessageUrlPreview;)V", "getTitleWithFilter", "context", "Landroid/content/Context;", "hasDocInfo", "hasMiddleGroundUrlPreview", "hasUrlPreview", "isContentSame", "diffable", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.i */
public final class PostContentVO extends BaseTextContentVO<PostContent> {

    /* renamed from: a */
    private final Lazy f84860a;

    /* renamed from: b */
    private final Lazy f84861b;

    /* renamed from: c */
    private final Lazy f84862c;

    /* renamed from: d */
    private MessageUrlPreview f84863d;

    /* renamed from: e */
    private DocResult f84864e;

    /* renamed from: f */
    private PreviewHangPoint f84865f;

    /* renamed from: m */
    public final String mo121881m() {
        return (String) this.f84860a.getValue();
    }

    /* renamed from: n */
    public final boolean mo121882n() {
        return ((Boolean) this.f84862c.getValue()).booleanValue();
    }

    /* renamed from: o */
    public final MessageUrlPreview mo121883o() {
        return this.f84863d;
    }

    /* renamed from: p */
    public final DocResult mo121884p() {
        return this.f84864e;
    }

    /* renamed from: q */
    public final PreviewHangPoint mo121885q() {
        return this.f84865f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.i$a */
    static final class C32997a extends Lambda implements Function0<Boolean> {
        final /* synthetic */ PostContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32997a(PostContent postContent) {
            super(0);
            this.$content = postContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isGroupAnnouncement();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.i$b */
    static final class C32998b extends Lambda implements Function0<Boolean> {
        final /* synthetic */ PostContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32998b(PostContent postContent) {
            super(0);
            this.$content = postContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isNotified();
        }
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO
    /* renamed from: l */
    public boolean mo121792l() {
        if (this.f84864e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo121887s() {
        if (this.f84865f != null) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.base.view.vo.message.i$c */
    static final class C32999c extends Lambda implements Function0<String> {
        final /* synthetic */ PostContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32999c(PostContent postContent) {
            super(0);
            this.$content = postContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getTitle();
        }
    }

    /* renamed from: r */
    public final boolean mo121886r() {
        MessageUrlPreview messageUrlPreview = this.f84863d;
        if (messageUrlPreview != null) {
            if (messageUrlPreview == null) {
                Intrinsics.throwNpe();
            }
            if (!messageUrlPreview.isDeleted()) {
                MessageUrlPreview messageUrlPreview2 = this.f84863d;
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
    public final void mo121878a(MessageUrlPreview messageUrlPreview) {
        this.f84863d = messageUrlPreview;
    }

    /* renamed from: a */
    public final void mo121879a(PreviewHangPoint previewHangPoint) {
        this.f84865f = previewHangPoint;
    }

    /* renamed from: a */
    public final void mo121880a(DocResult docResult) {
        this.f84864e = docResult;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostContentVO(PostContent postContent) {
        super(postContent);
        Intrinsics.checkParameterIsNotNull(postContent, "content");
        this.f84860a = LazyKt.lazy(new C32999c(postContent));
        this.f84861b = LazyKt.lazy(new C32998b(postContent));
        this.f84862c = LazyKt.lazy(new C32997a(postContent));
    }

    /* renamed from: a */
    public final String mo121877a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (TextUtils.isEmpty(mo121881m())) {
            return "";
        }
        for (String str : UIUtils.getStringArray(context, R.array.shielded_post_title)) {
            if (Intrinsics.areEqual(str, mo121881m())) {
                return "";
            }
        }
        return mo121881m();
    }

    @Override // com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO, com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO, com.ss.android.lark.chat.export.vo.ContentVO
    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        if (!super.mo121780a(aVar) || aVar == null || !(aVar instanceof PostContentVO)) {
            return false;
        }
        PostContentVO iVar = (PostContentVO) aVar;
        if (mo121882n() != iVar.mo121882n() || !C26247a.m94981a(this.f84863d, iVar.f84863d) || !C26247a.m94981a((Object) this.f84864e, (Object) iVar.f84864e) || !C26247a.m94981a((Object) this.f84865f, (Object) iVar.f84865f)) {
            return false;
        }
        return true;
    }
}
