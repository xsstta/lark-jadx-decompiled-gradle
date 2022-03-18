package com.ss.android.lark.todo.impl.features.detail.comment;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.lark.pb.basic.v1.DocEntity;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.todo.v1.TodoAttachment;
import com.bytedance.lark.pb.todo.v1.TodoComment;
import com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a.C56473b;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013*\u0004\u0018\u00010\u000bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/EditedCommentDraftHolder;", "", "()V", "editedCommentDraftMap", "", "", "Lcom/bytedance/lark/pb/todo/v1/TodoComment;", "createEditedCommentDraft", "", Comment.f24093e, "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "attachments", "", "Lcom/bytedance/lark/pb/todo/v1/TodoAttachment;", "deleteEditedCommentDraft", "id", "readEditedCommentDraft", "toPb", "Lcom/bytedance/lark/pb/basic/v1/RichContent;", "kotlin.jvm.PlatformType", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.z */
public final class EditedCommentDraftHolder {

    /* renamed from: a */
    public static final EditedCommentDraftHolder f139907a = new EditedCommentDraftHolder();

    /* renamed from: b */
    private static final Map<String, TodoComment> f139908b = new LinkedHashMap();

    private EditedCommentDraftHolder() {
    }

    /* renamed from: a */
    public final TodoComment mo192503a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return f139908b.get(str);
    }

    /* renamed from: b */
    public final void mo192505b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        f139908b.remove(str);
    }

    /* renamed from: a */
    private final RichContent m220366a(RichText richText) {
        return new RichContent.C15157a().mo55253a(C56473b.m220114a(richText)).mo55251a((DocEntity) null).build();
    }

    /* renamed from: a */
    public final void mo192504a(TodoComment todoComment, RichText richText, List<TodoAttachment> list) {
        Intrinsics.checkParameterIsNotNull(todoComment, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(list, "attachments");
        Map<String, TodoComment> map = f139908b;
        String str = todoComment.id;
        Intrinsics.checkExpressionValueIsNotNull(str, "comment.id");
        TodoComment a = new TodoComment.C19645a().mo66655a(todoComment.id).mo66654a(m220366a(richText)).mo66656a(list).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "TodoComment.Builder()\n  …nts)\n            .build()");
        map.put(str, a);
    }
}
