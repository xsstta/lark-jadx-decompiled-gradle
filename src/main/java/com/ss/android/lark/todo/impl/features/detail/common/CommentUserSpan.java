package com.ss.android.lark.todo.impl.features.detail.common;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/CommentUserSpan;", "Landroid/text/style/ClickableSpan;", "userId", "", "todoId", "(Ljava/lang/String;Ljava/lang/String;)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.common.a */
public final class CommentUserSpan extends ClickableSpan {

    /* renamed from: a */
    private final String f139922a;

    /* renamed from: b */
    private final String f139923b;

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        textPaint.setColor(ResUtil.f139261a.mo191775a(R.color.text_link_normal));
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        TodoGeneralHitPoint.f141070a.mo194199e(this.f139923b);
        IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "widget.context");
        messengerModuleDependency.mo145420a(context, this.f139922a);
    }

    public CommentUserSpan(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "todoId");
        this.f139922a = str;
        this.f139923b = str2;
    }
}
