package com.ss.android.lark.widget.popwindow;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/widget/popwindow/DesktopPopupWindow;", "Lcom/larksuite/framework/ui/BasePopupWindow;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "height", "", "show", "anchorView", "xoff", "yoff", "width", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.popwindow.a */
public final class DesktopPopupWindow extends BasePopupWindow {
    /* renamed from: a */
    public final DesktopPopupWindow mo199791a(float f) {
        setWidth(UIHelper.dp2px(f));
        return this;
    }

    /* renamed from: b */
    public final DesktopPopupWindow mo199793b(float f) {
        setHeight(UIHelper.dp2px(f));
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DesktopPopupWindow(Context context, View view) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "view");
        setBackgroundDrawable(UIHelper.getDrawable(R.drawable.menu_desktop_bg));
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setInputMethodMode(0);
        setFocusable(true);
        setOutsideTouchable(true);
        setClippingEnabled(false);
    }

    /* renamed from: a */
    public final DesktopPopupWindow mo199792a(View view, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        showAsDropDown(view, UIHelper.dp2px(f), UIHelper.dp2px(f2));
        return this;
    }
}
