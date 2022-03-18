package com.ss.android.lark.chat.base.view.vo.message;

import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/base/view/vo/message/ThreadMergeForwardContentVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/MergeForwardContent;)V", "info", "", "getInfo", "()Ljava/lang/CharSequence;", "setInfo", "(Ljava/lang/CharSequence;)V", "isInChat", "", "()Z", "setInChat", "(Z)V", "sourceAvatarKey", "", "getSourceAvatarKey", "()Ljava/lang/String;", "setSourceAvatarKey", "(Ljava/lang/String;)V", "sourceChatId", "getSourceChatId", "setSourceChatId", "sourceInfo", "getSourceInfo", "setSourceInfo", "title", "getTitle", "setTitle", "canReply", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.base.view.vo.message.n */
public final class ThreadMergeForwardContentVO extends TranslatableContentVO<MergeForwardContent> {

    /* renamed from: a */
    private String f84880a = "";

    /* renamed from: b */
    private CharSequence f84881b = "";

    /* renamed from: c */
    private String f84882c = "";

    /* renamed from: d */
    private String f84883d = "";

    /* renamed from: e */
    private String f84884e = "";

    /* renamed from: f */
    private boolean f84885f;

    /* renamed from: a */
    public final String mo121907a() {
        return this.f84880a;
    }

    /* renamed from: b */
    public final CharSequence mo121911b() {
        return this.f84881b;
    }

    /* renamed from: c */
    public final String mo121913c() {
        return this.f84882c;
    }

    /* renamed from: d */
    public final String mo121915d() {
        return this.f84883d;
    }

    /* renamed from: e */
    public final String mo121917e() {
        return this.f84884e;
    }

    /* renamed from: f */
    public final boolean mo121918f() {
        return this.f84885f;
    }

    /* renamed from: a */
    public final void mo121908a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f84881b = charSequence;
    }

    /* renamed from: b */
    public final void mo121912b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f84882c = str;
    }

    /* renamed from: c */
    public final void mo121914c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f84883d = str;
    }

    /* renamed from: d */
    public final void mo121916d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f84884e = str;
    }

    /* renamed from: a */
    public final void mo121909a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f84880a = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadMergeForwardContentVO(MergeForwardContent mergeForwardContent) {
        super(mergeForwardContent);
        Intrinsics.checkParameterIsNotNull(mergeForwardContent, "content");
    }

    /* renamed from: a */
    public final void mo121910a(boolean z) {
        this.f84885f = z;
    }
}
