package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.larksuite.framework.section.IActionData;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentSaveDraftInfo;", "Lcom/larksuite/framework/section/IActionData;", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "attachments", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "(Lcom/ss/android/lark/widget/richtext/RichText;Ljava/util/List;)V", "getAttachments", "()Ljava/util/List;", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.s */
public final class CommentSaveDraftInfo implements IActionData {

    /* renamed from: a */
    private final RichText f139875a;

    /* renamed from: b */
    private final List<TodoAttachment> f139876b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentSaveDraftInfo)) {
            return false;
        }
        CommentSaveDraftInfo sVar = (CommentSaveDraftInfo) obj;
        return Intrinsics.areEqual(this.f139875a, sVar.f139875a) && Intrinsics.areEqual(this.f139876b, sVar.f139876b);
    }

    public int hashCode() {
        RichText richText = this.f139875a;
        int i = 0;
        int hashCode = (richText != null ? richText.hashCode() : 0) * 31;
        List<TodoAttachment> list = this.f139876b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CommentSaveDraftInfo(richText=" + this.f139875a + ", attachments=" + this.f139876b + ")";
    }

    /* renamed from: a */
    public final RichText mo192462a() {
        return this.f139875a;
    }

    /* renamed from: b */
    public final List<TodoAttachment> mo192463b() {
        return this.f139876b;
    }

    public CommentSaveDraftInfo(RichText richText, List<TodoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        this.f139875a = richText;
        this.f139876b = list;
    }
}
