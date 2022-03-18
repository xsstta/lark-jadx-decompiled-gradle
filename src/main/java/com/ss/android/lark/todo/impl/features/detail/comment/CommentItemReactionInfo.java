package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentItemReactionInfo;", "Lcom/larksuite/framework/section/IActionData;", "item", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "reactionKey", "", "reactionSource", "", "(Lcom/bytedance/lark/pb/todo/v1/TodoComment;Ljava/lang/String;I)V", "getItem", "()Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getReactionKey", "()Ljava/lang/String;", "getReactionSource", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.j */
public final class CommentItemReactionInfo implements IActionData {

    /* renamed from: a */
    private final TodoComment f139823a;

    /* renamed from: b */
    private final String f139824b;

    /* renamed from: c */
    private final int f139825c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentItemReactionInfo)) {
            return false;
        }
        CommentItemReactionInfo jVar = (CommentItemReactionInfo) obj;
        return Intrinsics.areEqual(this.f139823a, jVar.f139823a) && Intrinsics.areEqual(this.f139824b, jVar.f139824b) && this.f139825c == jVar.f139825c;
    }

    public int hashCode() {
        TodoComment todoComment = this.f139823a;
        int i = 0;
        int hashCode = (todoComment != null ? todoComment.hashCode() : 0) * 31;
        String str = this.f139824b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.f139825c;
    }

    public String toString() {
        return "CommentItemReactionInfo(item=" + this.f139823a + ", reactionKey=" + this.f139824b + ", reactionSource=" + this.f139825c + ")";
    }

    /* renamed from: a */
    public final TodoComment mo192401a() {
        return this.f139823a;
    }

    /* renamed from: b */
    public final String mo192402b() {
        return this.f139824b;
    }

    public CommentItemReactionInfo(TodoComment todoComment, String str, int i) {
        Intrinsics.checkParameterIsNotNull(todoComment, "item");
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        this.f139823a = todoComment;
        this.f139824b = str;
        this.f139825c = i;
    }
}
