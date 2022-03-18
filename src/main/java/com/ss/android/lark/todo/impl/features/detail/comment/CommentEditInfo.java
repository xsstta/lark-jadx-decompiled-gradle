package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentEditInfo;", "Lcom/larksuite/framework/section/IActionData;", "editComment", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "itemComment", "position", "", "(Lcom/bytedance/lark/pb/todo/v1/TodoComment;Lcom/bytedance/lark/pb/todo/v1/TodoComment;I)V", "getEditComment", "()Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "getItemComment", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.g */
public final class CommentEditInfo implements IActionData {

    /* renamed from: a */
    private final TodoComment f139806a;

    /* renamed from: b */
    private final TodoComment f139807b;

    /* renamed from: c */
    private final int f139808c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentEditInfo)) {
            return false;
        }
        CommentEditInfo gVar = (CommentEditInfo) obj;
        return Intrinsics.areEqual(this.f139806a, gVar.f139806a) && Intrinsics.areEqual(this.f139807b, gVar.f139807b) && this.f139808c == gVar.f139808c;
    }

    public int hashCode() {
        TodoComment todoComment = this.f139806a;
        int i = 0;
        int hashCode = (todoComment != null ? todoComment.hashCode() : 0) * 31;
        TodoComment todoComment2 = this.f139807b;
        if (todoComment2 != null) {
            i = todoComment2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f139808c;
    }

    public String toString() {
        return "CommentEditInfo(editComment=" + this.f139806a + ", itemComment=" + this.f139807b + ", position=" + this.f139808c + ")";
    }

    /* renamed from: a */
    public final TodoComment mo192386a() {
        return this.f139806a;
    }

    /* renamed from: b */
    public final TodoComment mo192387b() {
        return this.f139807b;
    }

    /* renamed from: c */
    public final int mo192388c() {
        return this.f139808c;
    }

    public CommentEditInfo(TodoComment todoComment, TodoComment todoComment2, int i) {
        Intrinsics.checkParameterIsNotNull(todoComment2, "itemComment");
        this.f139806a = todoComment;
        this.f139807b = todoComment2;
        this.f139808c = i;
    }
}
