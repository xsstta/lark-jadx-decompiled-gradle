package com.bytedance.ee.bear.util.keyboard;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProviderImpl;", "Lcom/bytedance/ee/bear/util/keyboard/BaseKeyboardHeightProvider;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "close", "", "createPopupWindow", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.q.a.h */
public final class KeyboardHeightProviderImpl extends BaseKeyboardHeightProvider {
    @Override // com.bytedance.ee.bear.util.keyboard.BaseKeyboardHeightProvider
    /* renamed from: f */
    public void mo39932f() {
        super.mo39932f();
        mo39927b().dismiss();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardHeightProviderImpl(Activity activity) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        super.mo39930d();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.util.keyboard.BaseKeyboardHeightProvider
    /* renamed from: a */
    public PopupWindow mo39922a(Context context, View view) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setContentView(view);
        popupWindow.setSoftInputMode(21);
        popupWindow.setInputMethodMode(1);
        popupWindow.setWidth(1);
        popupWindow.setHeight(-1);
        popupWindow.setTouchable(false);
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(1003);
        } else {
            C10548d.m43700a(popupWindow, 1003);
        }
        return popupWindow;
    }
}
