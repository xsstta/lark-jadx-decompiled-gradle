package com.ss.android.vc.lark.message.vc;

import android.content.Context;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setFont", "", "Landroid/widget/TextView;", "larkFont", "Lcom/larksuite/component/ui/display/manager/LarkFont;", "lib_vc_suiteRelease"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.vc.c */
public final class C61150c {
    /* renamed from: a */
    public static final void m237789a(TextView textView, LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setFont");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextSize(0, LKUIDisplayManager.m91865a(context, larkFont));
        Context context2 = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        textView.setHeight((int) VCFontManager.m237786a(context2, larkFont));
    }
}
