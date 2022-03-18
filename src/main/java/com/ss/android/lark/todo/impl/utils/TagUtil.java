package com.ss.android.lark.todo.impl.utils;

import android.content.Context;
import android.widget.TextView;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/utils/TagUtil;", "", "()V", "addTextViewTag", "", "textView", "Landroid/widget/TextView;", "tagStr", "", "removeTextViewTag", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.f */
public final class TagUtil {

    /* renamed from: a */
    public static final TagUtil f139262a = new TagUtil();

    private TagUtil() {
    }

    /* renamed from: a */
    public final void mo191783a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        textView.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public final void mo191784a(TextView textView, String str) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Intrinsics.checkParameterIsNotNull(str, "tagStr");
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "textView.context");
        UDTagsDrawable.TagModel g = new UDTagsDrawable.TagModel.Builder(context).mo91418a(str).mo91417a(UDTagsDrawable.TagColorSet.BLUE).mo91427g();
        Context context2 = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "textView.context");
        UDTagsDrawable i = new UDTagsDrawable.Builder(context2).mo91384a(g).mo91398i();
        if (i != null) {
            i.mo91369a(textView);
        }
    }
}
