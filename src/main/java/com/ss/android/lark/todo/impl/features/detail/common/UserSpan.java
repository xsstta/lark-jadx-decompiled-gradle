package com.ss.android.lark.todo.impl.features.detail.common;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMessengerDependency;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/UserSpan;", "Landroid/text/style/ClickableSpan;", "userId", "", "colorRes", "", "(Ljava/lang/String;I)V", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.common.d */
public final class UserSpan extends ClickableSpan {

    /* renamed from: a */
    private final String f139929a;

    /* renamed from: b */
    private final int f139930b;

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        IMessengerDependency messengerModuleDependency = TodoDependencyHolder.f139242a.mo191730a().messengerModuleDependency();
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "widget.context");
        messengerModuleDependency.mo145420a(context, this.f139929a);
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkParameterIsNotNull(textPaint, "ds");
        textPaint.setColor(ResUtil.f139261a.mo191775a(this.f139930b));
    }

    public UserSpan(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f139929a = str;
        this.f139930b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserSpan(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? R.color.text_link_normal : i);
    }
}
