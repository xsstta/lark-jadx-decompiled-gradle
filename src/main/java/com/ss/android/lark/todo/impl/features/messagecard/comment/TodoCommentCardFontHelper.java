package com.ss.android.lark.todo.impl.features.messagecard.comment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext.RichTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/comment/TodoCommentCardFontHelper;", "", "()V", "adaptFontZoomLevel", "", "itemView", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.a.a */
public final class TodoCommentCardFontHelper {

    /* renamed from: a */
    public static final TodoCommentCardFontHelper f140878a = new TodoCommentCardFontHelper();

    private TodoCommentCardFontHelper() {
    }

    /* renamed from: a */
    public final void mo193916a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.todo_update_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.todo_update_title");
        C25649b.m91856a(textView, 14);
        RichTextView richTextView = (RichTextView) view.findViewById(R.id.tv_comment_content);
        Intrinsics.checkExpressionValueIsNotNull(richTextView, "itemView.tv_comment_content");
        Context context = richTextView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.tv_comment_content.context");
        ((RichTextView) view.findViewById(R.id.tv_comment_content)).setTextSize(LKUIDisplayManager.m91864a(context, 14));
        TextView textView2 = (TextView) view.findViewById(R.id.tv_comment_title);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tv_comment_title");
        C25649b.m91856a(textView2, 14);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_comment_attachment);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.tv_comment_attachment");
        C25649b.m91856a(textView3, 14);
        TextView textView4 = (TextView) view.findViewById(R.id.todo_icon_detail);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.todo_icon_detail");
        C25649b.m91856a(textView4, 14);
    }
}
