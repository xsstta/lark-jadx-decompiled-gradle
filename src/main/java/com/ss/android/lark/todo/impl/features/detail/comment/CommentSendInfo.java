package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSendInfo;", "Lcom/larksuite/framework/section/IActionData;", "content", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "attachments", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "(Ljava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getContent", "()Ljava/lang/String;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.u */
public final class CommentSendInfo implements IActionData {

    /* renamed from: a */
    private final String f139890a;

    /* renamed from: b */
    private final RichText f139891b;

    /* renamed from: c */
    private final List<TodoAttachment> f139892c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentSendInfo)) {
            return false;
        }
        CommentSendInfo uVar = (CommentSendInfo) obj;
        return Intrinsics.areEqual(this.f139890a, uVar.f139890a) && Intrinsics.areEqual(this.f139891b, uVar.f139891b) && Intrinsics.areEqual(this.f139892c, uVar.f139892c);
    }

    public int hashCode() {
        String str = this.f139890a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RichText richText = this.f139891b;
        int hashCode2 = (hashCode + (richText != null ? richText.hashCode() : 0)) * 31;
        List<TodoAttachment> list = this.f139892c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CommentSendInfo(content=" + this.f139890a + ", richText=" + this.f139891b + ", attachments=" + this.f139892c + ")";
    }

    /* renamed from: a */
    public final RichText mo192473a() {
        return this.f139891b;
    }

    /* renamed from: b */
    public final List<TodoAttachment> mo192474b() {
        return this.f139892c;
    }

    public CommentSendInfo(String str, RichText richText, List<TodoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        this.f139890a = str;
        this.f139891b = richText;
        this.f139892c = list;
    }
}
