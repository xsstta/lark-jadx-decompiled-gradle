package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentKeyboardStateInfo;", "Lcom/larksuite/framework/section/IActionData;", "isShow", "", "hasDraft", "toolBoxHeight", "", "replyMsgId", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "attachments", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "(ZZILjava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getHasDraft", "()Z", "getReplyMsgId", "()Ljava/lang/String;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "getToolBoxHeight", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.m */
public final class CommentKeyboardStateInfo implements IActionData {

    /* renamed from: a */
    private final boolean f139849a;

    /* renamed from: b */
    private final boolean f139850b;

    /* renamed from: c */
    private final int f139851c;

    /* renamed from: d */
    private final String f139852d;

    /* renamed from: e */
    private final RichText f139853e;

    /* renamed from: f */
    private final List<TodoAttachment> f139854f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentKeyboardStateInfo)) {
            return false;
        }
        CommentKeyboardStateInfo mVar = (CommentKeyboardStateInfo) obj;
        return this.f139849a == mVar.f139849a && this.f139850b == mVar.f139850b && this.f139851c == mVar.f139851c && Intrinsics.areEqual(this.f139852d, mVar.f139852d) && Intrinsics.areEqual(this.f139853e, mVar.f139853e) && Intrinsics.areEqual(this.f139854f, mVar.f139854f);
    }

    public int hashCode() {
        boolean z = this.f139849a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f139850b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i6 = (((i5 + i) * 31) + this.f139851c) * 31;
        String str = this.f139852d;
        int i7 = 0;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        RichText richText = this.f139853e;
        int hashCode2 = (hashCode + (richText != null ? richText.hashCode() : 0)) * 31;
        List<TodoAttachment> list = this.f139854f;
        if (list != null) {
            i7 = list.hashCode();
        }
        return hashCode2 + i7;
    }

    public String toString() {
        return "CommentKeyboardStateInfo(isShow=" + this.f139849a + ", hasDraft=" + this.f139850b + ", toolBoxHeight=" + this.f139851c + ", replyMsgId=" + this.f139852d + ", richText=" + this.f139853e + ", attachments=" + this.f139854f + ")";
    }

    /* renamed from: a */
    public final boolean mo192435a() {
        return this.f139849a;
    }

    /* renamed from: b */
    public final boolean mo192436b() {
        return this.f139850b;
    }

    /* renamed from: c */
    public final RichText mo192437c() {
        return this.f139853e;
    }

    /* renamed from: d */
    public final List<TodoAttachment> mo192438d() {
        return this.f139854f;
    }

    public CommentKeyboardStateInfo(boolean z, boolean z2, int i, String str, RichText richText, List<TodoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        this.f139849a = z;
        this.f139850b = z2;
        this.f139851c = i;
        this.f139852d = str;
        this.f139853e = richText;
        this.f139854f = list;
    }
}
