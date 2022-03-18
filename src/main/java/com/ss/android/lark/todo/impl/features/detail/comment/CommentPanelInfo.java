package com.ss.android.lark.todo.impl.features.detail.comment;

import android.view.View;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentPanelInfo;", "Lcom/larksuite/framework/section/IActionData;", "itemView", "Landroid/view/View;", "position", "", "todoComment", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "(Landroid/view/View;ILcom/bytedance/lark/pb/todo/v1/TodoComment;)V", "getItemView", "()Landroid/view/View;", "getPosition", "()I", "getTodoComment", "()Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.n */
public final class CommentPanelInfo implements IActionData {

    /* renamed from: a */
    private final View f139855a;

    /* renamed from: b */
    private final int f139856b;

    /* renamed from: c */
    private final TodoComment f139857c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPanelInfo)) {
            return false;
        }
        CommentPanelInfo nVar = (CommentPanelInfo) obj;
        return Intrinsics.areEqual(this.f139855a, nVar.f139855a) && this.f139856b == nVar.f139856b && Intrinsics.areEqual(this.f139857c, nVar.f139857c);
    }

    public int hashCode() {
        View view = this.f139855a;
        int i = 0;
        int hashCode = (((view != null ? view.hashCode() : 0) * 31) + this.f139856b) * 31;
        TodoComment todoComment = this.f139857c;
        if (todoComment != null) {
            i = todoComment.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CommentPanelInfo(itemView=" + this.f139855a + ", position=" + this.f139856b + ", todoComment=" + this.f139857c + ")";
    }

    /* renamed from: a */
    public final View mo192442a() {
        return this.f139855a;
    }

    /* renamed from: b */
    public final int mo192443b() {
        return this.f139856b;
    }

    /* renamed from: c */
    public final TodoComment mo192444c() {
        return this.f139857c;
    }

    public CommentPanelInfo(View view, int i, TodoComment todoComment) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(todoComment, "todoComment");
        this.f139855a = view;
        this.f139856b = i;
        this.f139857c = todoComment;
    }
}
