package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentDraftInfo;", "Lcom/larksuite/framework/section/IActionData;", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "attachments", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "replyParentId", "", "(Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/List;Ljava/lang/String;)V", "getAttachments", "()Ljava/util/List;", "getReplyParentId", "()Ljava/lang/String;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.f */
public final class CommentDraftInfo implements IActionData {

    /* renamed from: a */
    private final RichText f139803a;

    /* renamed from: b */
    private final List<TodoAttachment> f139804b;

    /* renamed from: c */
    private final String f139805c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentDraftInfo)) {
            return false;
        }
        CommentDraftInfo fVar = (CommentDraftInfo) obj;
        return Intrinsics.areEqual(this.f139803a, fVar.f139803a) && Intrinsics.areEqual(this.f139804b, fVar.f139804b) && Intrinsics.areEqual(this.f139805c, fVar.f139805c);
    }

    public int hashCode() {
        RichText richText = this.f139803a;
        int i = 0;
        int hashCode = (richText != null ? richText.hashCode() : 0) * 31;
        List<TodoAttachment> list = this.f139804b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f139805c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CommentDraftInfo(richText=" + this.f139803a + ", attachments=" + this.f139804b + ", replyParentId=" + this.f139805c + ")";
    }

    /* renamed from: a */
    public final RichText mo192380a() {
        return this.f139803a;
    }

    /* renamed from: b */
    public final List<TodoAttachment> mo192381b() {
        return this.f139804b;
    }

    /* renamed from: c */
    public final String mo192382c() {
        return this.f139805c;
    }

    public CommentDraftInfo(RichText richText, List<TodoAttachment> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        this.f139803a = richText;
        this.f139804b = list;
        this.f139805c = str;
    }
}
