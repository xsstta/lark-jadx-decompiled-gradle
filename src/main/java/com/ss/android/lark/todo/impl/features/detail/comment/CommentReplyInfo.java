package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentReplyInfo;", "Lcom/larksuite/framework/section/IActionData;", "position", "", "item", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "(ILcom/bytedance/lark/pb/todo/v1/TodoComment;)V", "getItem", "()Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.r */
public final class CommentReplyInfo implements IActionData {

    /* renamed from: a */
    private final int f139873a;

    /* renamed from: b */
    private final TodoComment f139874b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentReplyInfo)) {
            return false;
        }
        CommentReplyInfo rVar = (CommentReplyInfo) obj;
        return this.f139873a == rVar.f139873a && Intrinsics.areEqual(this.f139874b, rVar.f139874b);
    }

    public int hashCode() {
        int i = this.f139873a * 31;
        TodoComment todoComment = this.f139874b;
        return i + (todoComment != null ? todoComment.hashCode() : 0);
    }

    public String toString() {
        return "CommentReplyInfo(position=" + this.f139873a + ", item=" + this.f139874b + ")";
    }

    /* renamed from: a */
    public final int mo192457a() {
        return this.f139873a;
    }

    /* renamed from: b */
    public final TodoComment mo192458b() {
        return this.f139874b;
    }

    public CommentReplyInfo(int i, TodoComment todoComment) {
        Intrinsics.checkParameterIsNotNull(todoComment, "item");
        this.f139873a = i;
        this.f139874b = todoComment;
    }
}
