package com.ss.android.lark.todo.impl.features.detail.common;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/SummaryClickSpan;", "Landroid/text/style/ClickableSpan;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.common.b */
public final class SummaryClickSpan extends ClickableSpan {

    /* renamed from: a */
    private final String f139924a;

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
    }

    public SummaryClickSpan(String str) {
        this.f139924a = str;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        TodoDependencyHolder.f139242a.mo191730a().browserDependency().mo145368a(view.getContext(), this.f139924a);
    }
}
