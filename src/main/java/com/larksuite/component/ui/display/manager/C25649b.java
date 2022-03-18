package com.larksuite.component.ui.display.manager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"setDisplaySize", "", "Landroid/view/View;", "originalSize", "", "zoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "width", "height", "setDisplaySize4", "setDisplayView", "setFont", "Landroid/widget/TextView;", "larkFont", "Lcom/larksuite/component/ui/display/manager/LarkFont;", "setFont4", "display_manager_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ui.display.manager.b */
public final class C25649b {
    /* renamed from: a */
    public static final void m91853a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "$this$setDisplaySize");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int c = LKUIDisplayManager.m91881c(context, i);
        m91859b(view, c, c);
    }

    /* renamed from: b */
    public static final void m91860b(TextView textView, int i) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setFont4");
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextSize(0, LKUIDisplayManager.m91876b(context, i));
    }

    /* renamed from: a */
    public static final void m91856a(TextView textView, int i) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setFont");
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextSize(0, LKUIDisplayManager.m91864a(context, i));
    }

    /* renamed from: a */
    public static final void m91857a(TextView textView, LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setFont");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextSize(0, LKUIDisplayManager.m91865a(context, larkFont));
    }

    /* renamed from: b */
    private static final void m91859b(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static final void m91854a(View view, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "$this$setDisplaySize");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int c = LKUIDisplayManager.m91881c(context, i);
        Context context2 = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        m91859b(view, c, LKUIDisplayManager.m91881c(context2, i2));
    }

    /* renamed from: a */
    public static final void m91855a(View view, int i, ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(view, "$this$setDisplaySize");
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int a = LKUIDisplayManager.m91869a(context, i, zoomLevel);
        m91859b(view, a, a);
    }

    /* renamed from: a */
    public static final void m91858a(TextView textView, LarkFont larkFont, ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setFont");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextSize(0, LKUIDisplayManager.m91866a(context, larkFont, zoomLevel));
    }
}
